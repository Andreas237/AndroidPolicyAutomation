// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.*;

public final class ez
{

	public static String a(Context context, String s, String s1, String s2)
	{
		return context.getSharedPreferences(s, 0).getString(s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #12  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokeinterface #18  <Method String SharedPreferences.getString(String, String)>
	//    7   13:areturn         
	}

	public static void d(Context context, String s, Map map)
	{
		context = ((Context) (context.getSharedPreferences(s, 0).edit()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #12  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    6:invokeinterface #25  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   11:astore_0        
		if(context != null)
	//*   6   12:aload_0         
	//*   7   13:ifnull          75
		{
			String s1;
			for(s = ((String) (map.keySet().iterator())); ((Iterator) (s)).hasNext(); ((android.content.SharedPreferences.Editor) (context)).putString(s1, (String)map.get(((Object) (s1)))))
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #31  <Method Set Map.keySet()>
	//*  10   22:invokeinterface #37  <Method Iterator Set.iterator()>
	//*  11   27:astore_1        
	//*  12   28:aload_1         
	//*  13   29:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*  14   34:ifeq            68
				s1 = (String)((Iterator) (s)).next();
	//   15   37:aload_1         
	//   16   38:invokeinterface #47  <Method Object Iterator.next()>
	//   17   43:checkcast       #49  <Class String>
	//   18   46:astore_3        

	//   19   47:aload_0         
	//   20   48:aload_3         
	//   21   49:aload_2         
	//   22   50:aload_3         
	//   23   51:invokeinterface #53  <Method Object Map.get(Object)>
	//   24   56:checkcast       #49  <Class String>
	//   25   59:invokeinterface #59  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   26   64:pop             
	//*  27   65:goto            28
			((android.content.SharedPreferences.Editor) (context)).commit();
	//   28   68:aload_0         
	//   29   69:invokeinterface #62  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   30   74:pop             
		}
	//   31   75:return          
	}
}
