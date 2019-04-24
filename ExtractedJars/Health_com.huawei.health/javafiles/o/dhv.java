// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.text.TextUtils;
import android.util.Log;
import java.util.LinkedHashMap;

class dhv
{

	public dhv(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		e = new LinkedHashMap();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void LinkedHashMap()>
	//    6   12:putfield        #18  <Field LinkedHashMap e>
		try
		{
			e.put("V", ((Object) (s1)));
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field LinkedHashMap e>
	//    9   19:ldc1            #20  <String "V">
	//   10   21:aload_2         
	//   11   22:invokevirtual   #24  <Method Object LinkedHashMap.put(Object, Object)>
	//   12   25:pop             
			e.put("T", ((Object) (s2)));
	//   13   26:aload_0         
	//   14   27:getfield        #18  <Field LinkedHashMap e>
	//   15   30:ldc1            #26  <String "T">
	//   16   32:aload_3         
	//   17   33:invokevirtual   #24  <Method Object LinkedHashMap.put(Object, Object)>
	//   18   36:pop             
			return;
	//   19   37:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  20   38:astore_1        
		{
			Log.e("AppLogStandardApi/StandardMetadataBundle", "StandardMetadataBundle JSONException!");
	//   21   39:ldc1            #28  <String "AppLogStandardApi/StandardMetadataBundle">
	//   22   41:ldc1            #30  <String "StandardMetadataBundle JSONException!">
	//   23   43:invokestatic    #35  <Method int Log.e(String, String)>
	//   24   46:pop             
		}
	//   25   47:return          
	}

	public void a(String s, String s1)
	{
		try
		{
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #44  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            26
			{
				s1 = s1.replaceAll("(\r\n|\r|\n|\n\r)", " ");
	//    3    7:aload_2         
	//    4    8:ldc1            #46  <String "(\r\n|\r|\n|\n\r)">
	//    5   10:ldc1            #48  <String " ">
	//    6   12:invokevirtual   #54  <Method String String.replaceAll(String, String)>
	//    7   15:astore_2        
				e.put(((Object) (s)), ((Object) (s1)));
	//    8   16:aload_0         
	//    9   17:getfield        #18  <Field LinkedHashMap e>
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #24  <Method Object LinkedHashMap.put(Object, Object)>
	//   13   25:pop             
			}
			return;
	//   14   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   27:astore_1        
		{
			Log.e("AppLogStandardApi/StandardMetadataBundle", "putData JSONException!");
	//   16   28:ldc1            #28  <String "AppLogStandardApi/StandardMetadataBundle">
	//   17   30:ldc1            #56  <String "putData JSONException!">
	//   18   32:invokestatic    #35  <Method int Log.e(String, String)>
	//   19   35:pop             
		}
	//   20   36:return          
	}

	public String toString()
	{
		return e.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field LinkedHashMap e>
	//    2    4:invokevirtual   #60  <Method String LinkedHashMap.toString()>
	//    3    7:areturn         
	}

	private LinkedHashMap e;
}
