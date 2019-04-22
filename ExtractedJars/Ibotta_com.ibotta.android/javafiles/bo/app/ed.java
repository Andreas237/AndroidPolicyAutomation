// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.AppboyGeofence;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public final class ed
{

	public ed()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static List a(JSONArray jsonarray)
	{
		ArrayList arraylist;
		if(jsonarray == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		arraylist = new ArrayList();
	//    4    6:new             #27  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void ArrayList()>
	//    7   13:astore_2        
		for(int i = 0; i < jsonarray.length();)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #34  <Method int JSONArray.length()>
	//*  13   21:icmpge          162
		{
label0:
			{
				org.json.JSONObject jsonobject = jsonarray.optJSONObject(i);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:invokevirtual   #38  <Method org.json.JSONObject JSONArray.optJSONObject(int)>
	//   17   29:astore_3        
				if(jsonobject != null)
					break label0;
	//   18   30:aload_3         
	//   19   31:ifnonnull       46
				try
				{
					AppboyLogger.w(a, "Received null or blank geofence Json. Not parsing.");
	//   20   34:getstatic       #16  <Field String a>
	//   21   37:ldc1            #40  <String "Received null or blank geofence Json. Not parsing.">
	//   22   39:invokestatic    #44  <Method int AppboyLogger.w(String, String)>
	//   23   42:pop             
					continue;
	//   24   43:goto            155
				}
	//*  25   46:aload_2         
	//*  26   47:new             #46  <Class AppboyGeofence>
	//*  27   50:dup             
	//*  28   51:aload_3         
	//*  29   52:invokespecial   #49  <Method void AppboyGeofence(org.json.JSONObject)>
	//*  30   55:invokeinterface #55  <Method boolean List.add(Object)>
	//*  31   60:pop             
	//*  32   61:goto            155
	//*  33   64:astore          4
	//*  34   66:getstatic       #16  <Field String a>
	//*  35   69:astore          5
	//*  36   71:new             #57  <Class StringBuilder>
	//*  37   74:dup             
	//*  38   75:invokespecial   #58  <Method void StringBuilder()>
	//*  39   78:astore          6
	//*  40   80:aload           6
	//*  41   82:ldc1            #60  <String "Failed to deserialize geofence Json:">
	//*  42   84:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  43   87:pop             
	//*  44   88:aload           6
	//*  45   90:aload_3         
	//*  46   91:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//*  47   94:pop             
	//*  48   95:aload           5
	//*  49   97:aload           6
	//*  50   99:invokevirtual   #71  <Method String StringBuilder.toString()>
	//*  51  102:aload           4
	//*  52  104:invokestatic    #75  <Method int AppboyLogger.e(String, String, Throwable)>
	//*  53  107:pop             
	//*  54  108:goto            155
				catch(JSONException jsonexception)
	//*  55  111:astore          4
				{
					String s1 = a;
	//   56  113:getstatic       #16  <Field String a>
	//   57  116:astore          5
					StringBuilder stringbuilder1 = new StringBuilder();
	//   58  118:new             #57  <Class StringBuilder>
	//   59  121:dup             
	//   60  122:invokespecial   #58  <Method void StringBuilder()>
	//   61  125:astore          6
					stringbuilder1.append("Failed to deserialize geofence Json due to JSONException: ");
	//   62  127:aload           6
	//   63  129:ldc1            #77  <String "Failed to deserialize geofence Json due to JSONException: ">
	//   64  131:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   65  134:pop             
					stringbuilder1.append(((Object) (jsonobject)));
	//   66  135:aload           6
	//   67  137:aload_3         
	//   68  138:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   69  141:pop             
					AppboyLogger.w(s1, stringbuilder1.toString(), ((Throwable) (jsonexception)));
	//   70  142:aload           5
	//   71  144:aload           6
	//   72  146:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   73  149:aload           4
	//   74  151:invokestatic    #79  <Method int AppboyLogger.w(String, String, Throwable)>
	//   75  154:pop             
					i++;
	//   76  155:iload_1         
	//   77  156:iconst_1        
	//   78  157:iadd            
	//   79  158:istore_1        
				}
				catch(Exception exception)
				{
					String s = a;
					StringBuilder stringbuilder = new StringBuilder();
					stringbuilder.append("Failed to deserialize geofence Json:");
					stringbuilder.append(((Object) (jsonobject)));
					AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (exception)));
					continue;
				}
			}
		}

		break MISSING_BLOCK_LABEL_162;
	//   80  159:goto            16
		((List) (arraylist)).add(((Object) (new AppboyGeofence(jsonobject))));
		continue;
		return ((List) (arraylist));
	//   81  162:aload_2         
	//   82  163:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ed);

	static 
	{
	//    0    0:ldc1            #2   <Class ed>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
