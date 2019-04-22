// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package bo.app:
//			ex

public abstract class fi
	implements ex
{

	protected fi(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field List a>
	//    5    9:return          
	}

	public JSONArray a()
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #35  <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void JSONArray()>
	//    3    7:astore_1        
		try
		{
			for(Iterator iterator = a.iterator(); iterator.hasNext(); jsonarray.put(((ex)iterator.next()).forJsonPut()));
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field List a>
	//    6   12:invokeinterface #42  <Method Iterator List.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            60
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:invokeinterface #52  <Method Object Iterator.next()>
	//   14   34:checkcast       #6   <Class ex>
	//   15   37:invokeinterface #55  <Method Object ex.forJsonPut()>
	//   16   42:invokevirtual   #59  <Method JSONArray JSONArray.put(Object)>
	//   17   45:pop             
		}
	//*  18   46:goto            18
		catch(Exception exception)
	//*  19   49:astore_2        
		{
			AppboyLogger.e(b, "Caught exception creating Json.", ((Throwable) (exception)));
	//   20   50:getstatic       #21  <Field String b>
	//   21   53:ldc1            #61  <String "Caught exception creating Json.">
	//   22   55:aload_2         
	//   23   56:invokestatic    #65  <Method int AppboyLogger.e(String, String, Throwable)>
	//   24   59:pop             
		}
		return jsonarray;
	//   25   60:aload_1         
	//   26   61:areturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method JSONArray a()>
	//    2    4:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/fi);
	protected List a;

	static 
	{
	//    0    0:ldc1            #2   <Class fi>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String b>
	//*   3    8:return          
	}
}
