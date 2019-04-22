// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.*;
import org.json.JSONException;

// Referenced classes of package bo.app:
//			ds, ci, cc

public class dy
	implements ds
{

	public dy(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		b = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #29  <Field boolean b>
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #31  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #32  <Method void StringBuilder()>
	//    8   16:astore          4
		stringbuilder.append("com.appboy.storage.appboy_event_storage");
	//    9   18:aload           4
	//   10   20:ldc1            #34  <String "com.appboy.storage.appboy_event_storage">
	//   11   22:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(StringUtils.getCacheFileSuffix(context, s, s1));
	//   13   26:aload           4
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:invokestatic    #44  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//   18   34:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		c = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:aload           4
	//   23   42:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   24   45:iconst_0        
	//   25   46:invokevirtual   #54  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   26   49:putfield        #56  <Field SharedPreferences c>
	//   27   52:return          
	}

	public Collection a()
	{
		JSONException jsonexception;
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean b>
	//*   2    4:ifeq            18
		{
			AppboyLogger.w(a, "Storage provider is closed. Not getting all events.");
	//    3    7:getstatic       #22  <Field String a>
	//    4   10:ldc1            #62  <String "Storage provider is closed. Not getting all events.">
	//    5   12:invokestatic    #66  <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
		}
		ArrayList arraylist = new ArrayList();
	//    9   18:new             #68  <Class ArrayList>
	//   10   21:dup             
	//   11   22:invokespecial   #69  <Method void ArrayList()>
	//   12   25:astore_1        
		for(Iterator iterator = c.getAll().entrySet().iterator(); iterator.hasNext();)
	//*  13   26:aload_0         
	//*  14   27:getfield        #56  <Field SharedPreferences c>
	//*  15   30:invokeinterface #75  <Method Map SharedPreferences.getAll()>
	//*  16   35:invokeinterface #81  <Method Set Map.entrySet()>
	//*  17   40:invokeinterface #87  <Method Iterator Set.iterator()>
	//*  18   45:astore_2        
	//*  19   46:aload_2         
	//*  20   47:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//*  21   52:ifeq            177
		{
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   22   55:aload_2         
	//   23   56:invokeinterface #97  <Method Object Iterator.next()>
	//   24   61:checkcast       #99  <Class java.util.Map$Entry>
	//   25   64:astore          4
			String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   26   66:aload           4
	//   27   68:invokeinterface #102 <Method Object java.util.Map$Entry.getKey()>
	//   28   73:checkcast       #104 <Class String>
	//   29   76:astore_3        
			obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   30   77:aload           4
	//   31   79:invokeinterface #107 <Method Object java.util.Map$Entry.getValue()>
	//   32   84:checkcast       #104 <Class String>
	//   33   87:astore          4
			String s1;
			StringBuilder stringbuilder;
			try
			{
				((List) (arraylist)).add(((Object) (ci.g(((String) (obj)), s))));
	//   34   89:aload_1         
	//   35   90:aload           4
	//   36   92:aload_3         
	//   37   93:invokestatic    #113 <Method cc ci.g(String, String)>
	//   38   96:invokeinterface #119 <Method boolean List.add(Object)>
	//   39  101:pop             
			}
	//*  40  102:goto            46
	//*  41  105:getstatic       #22  <Field String a>
	//*  42  108:astore          5
	//*  43  110:new             #31  <Class StringBuilder>
	//*  44  113:dup             
	//*  45  114:invokespecial   #32  <Method void StringBuilder()>
	//*  46  117:astore          6
	//*  47  119:aload           6
	//*  48  121:ldc1            #121 <String "Could not create AppboyEvent from [serialized event string=">
	//*  49  123:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//*  50  126:pop             
	//*  51  127:aload           6
	//*  52  129:aload           4
	//*  53  131:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//*  54  134:pop             
	//*  55  135:aload           6
	//*  56  137:ldc1            #123 <String ", unique identifier=">
	//*  57  139:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//*  58  142:pop             
	//*  59  143:aload           6
	//*  60  145:aload_3         
	//*  61  146:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//*  62  149:pop             
	//*  63  150:aload           6
	//*  64  152:ldc1            #125 <String "] ... Deleting!">
	//*  65  154:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//*  66  157:pop             
	//*  67  158:aload           5
	//*  68  160:aload           6
	//*  69  162:invokevirtual   #48  <Method String StringBuilder.toString()>
	//*  70  165:invokestatic    #128 <Method int AppboyLogger.e(String, String)>
	//*  71  168:pop             
	//*  72  169:aload_0         
	//*  73  170:aload_3         
	//*  74  171:invokevirtual   #131 <Method void a(String)>
	//*  75  174:goto            46
	//*  76  177:aload_1         
	//*  77  178:areturn         
			// Misplaced declaration of an exception variable
			catch(JSONException jsonexception)
			{
				s1 = a;
				stringbuilder = new StringBuilder();
				stringbuilder.append("Could not create AppboyEvent from [serialized event string=");
				stringbuilder.append(((String) (obj)));
				stringbuilder.append(", unique identifier=");
				stringbuilder.append(s);
				stringbuilder.append("] ... Deleting!");
				AppboyLogger.e(s1, stringbuilder.toString());
				a(s);
			}
		}

		return ((Collection) (arraylist));
	//*  78  179:astore          5
	//*  79  181:goto            105
	}

	public void a(cc cc1)
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean b>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #22  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #31  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #32  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Storage provider is closed. Not adding event: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #137 <String "Storage provider is closed. Not adding event: ">
	//   11   22:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Object) (cc1)));
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #66  <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		} else
		{
			android.content.SharedPreferences.Editor editor = c.edit();
	//   23   42:aload_0         
	//   24   43:getfield        #56  <Field SharedPreferences c>
	//   25   46:invokeinterface #144 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   26   51:astore_2        
			editor.putString(cc1.d(), cc1.e());
	//   27   52:aload_2         
	//   28   53:aload_1         
	//   29   54:invokeinterface #149 <Method String cc.d()>
	//   30   59:aload_1         
	//   31   60:invokeinterface #151 <Method String cc.e()>
	//   32   65:invokeinterface #157 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   33   70:pop             
			editor.apply();
	//   34   71:aload_2         
	//   35   72:invokeinterface #160 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   36   77:return          
		}
	}

	void a(String s)
	{
		android.content.SharedPreferences.Editor editor = c.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field SharedPreferences c>
	//    2    4:invokeinterface #144 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		editor.remove(s);
	//    4   10:aload_2         
	//    5   11:aload_1         
	//    6   12:invokeinterface #165 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    7   17:pop             
		editor.apply();
	//    8   18:aload_2         
	//    9   19:invokeinterface #160 <Method void android.content.SharedPreferences$Editor.apply()>
	//   10   24:return          
	}

	public void b()
	{
		AppboyLogger.w(a, "Setting this provider to closed.");
	//    0    0:getstatic       #22  <Field String a>
	//    1    3:ldc1            #167 <String "Setting this provider to closed.">
	//    2    5:invokestatic    #66  <Method int AppboyLogger.w(String, String)>
	//    3    8:pop             
		b = true;
	//    4    9:aload_0         
	//    5   10:iconst_1        
	//    6   11:putfield        #29  <Field boolean b>
	//    7   14:return          
	}

	public void b(cc cc1)
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean b>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #22  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #31  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #32  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Storage provider is closed. Not deleting event: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #169 <String "Storage provider is closed. Not deleting event: ">
	//   11   22:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Object) (cc1)));
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #66  <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		} else
		{
			String s1 = a;
	//   23   42:getstatic       #22  <Field String a>
	//   24   45:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   25   46:new             #31  <Class StringBuilder>
	//   26   49:dup             
	//   27   50:invokespecial   #32  <Method void StringBuilder()>
	//   28   53:astore_3        
			stringbuilder1.append("Deleting event from storage with uid ");
	//   29   54:aload_3         
	//   30   55:ldc1            #171 <String "Deleting event from storage with uid ">
	//   31   57:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
			stringbuilder1.append(cc1.d());
	//   33   61:aload_3         
	//   34   62:aload_1         
	//   35   63:invokeinterface #149 <Method String cc.d()>
	//   36   68:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
			AppboyLogger.d(s1, stringbuilder1.toString(), false);
	//   38   72:aload_2         
	//   39   73:aload_3         
	//   40   74:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   41   77:iconst_0        
	//   42   78:invokestatic    #174 <Method int AppboyLogger.d(String, String, boolean)>
	//   43   81:pop             
			a(cc1.d());
	//   44   82:aload_0         
	//   45   83:aload_1         
	//   46   84:invokeinterface #149 <Method String cc.d()>
	//   47   89:invokevirtual   #131 <Method void a(String)>
			return;
	//   48   92:return          
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dy);
	private boolean b;
	private final SharedPreferences c;

	static 
	{
	//    0    0:ldc1            #2   <Class dy>
	//    1    2:invokestatic    #20  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #22  <Field String a>
	//*   3    8:return          
	}
}
