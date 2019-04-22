// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

public class cq
{

	public cq(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field boolean c>
		a = -1L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #19  <Long -1L>
	//    7   13:putfield        #22  <Field long a>
		b = -1L;
	//    8   16:aload_0         
	//    9   17:ldc2w           #19  <Long -1L>
	//   10   20:putfield        #24  <Field long b>
		s = ((String) (new JSONObject(s)));
	//   11   23:new             #26  <Class JSONObject>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:invokespecial   #28  <Method void JSONObject(String)>
	//   15   31:astore_1        
		d = (new JSONArray()).put(((Object) (s)));
	//   16   32:aload_0         
	//   17   33:new             #30  <Class JSONArray>
	//   18   36:dup             
	//   19   37:invokespecial   #31  <Method void JSONArray()>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #35  <Method JSONArray JSONArray.put(Object)>
	//   22   44:putfield        #37  <Field JSONArray d>
	//   23   47:return          
	}

	public cq(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = jsonobject.optLong("last_card_updated_at", -1L);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #41  <String "last_card_updated_at">
	//    5    8:ldc2w           #19  <Long -1L>
	//    6   11:invokevirtual   #45  <Method long JSONObject.optLong(String, long)>
	//    7   14:putfield        #22  <Field long a>
		b = jsonobject.optLong("last_full_sync_at", -1L);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:ldc1            #47  <String "last_full_sync_at">
	//   11   21:ldc2w           #19  <Long -1L>
	//   12   24:invokevirtual   #45  <Method long JSONObject.optLong(String, long)>
	//   13   27:putfield        #24  <Field long b>
		c = jsonobject.optBoolean("full_sync", false);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:ldc1            #49  <String "full_sync">
	//   17   34:iconst_0        
	//   18   35:invokevirtual   #53  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   19   38:putfield        #18  <Field boolean c>
		d = jsonobject.optJSONArray("cards");
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:ldc1            #55  <String "cards">
	//   23   45:invokevirtual   #59  <Method JSONArray JSONObject.optJSONArray(String)>
	//   24   48:putfield        #37  <Field JSONArray d>
	//   25   51:return          
	}

	public long a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field long b>
	//    2    4:lreturn         
	}

	public long b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field long a>
	//    2    4:lreturn         
	}

	public boolean c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean c>
	//    2    4:ireturn         
	}

	public JSONArray d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field JSONArray d>
	//    2    4:areturn         
	}

	private final long a;
	private final long b;
	private final boolean c;
	private final JSONArray d;
}
