// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			bx, dl, bf

public class dc
{
	static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(bo/app/dc$a, s);
		//    0    0:ldc1            #2   <Class dc$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class dc$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) (e)).clone();
		//    0    0:getstatic       #40  <Field dc$a[] e>
		//    1    3:invokevirtual   #62  <Method Object _5B_Lbo.app.dc$a_3B_.clone()>
		//    2    6:checkcast       #58  <Class dc$a[]>
		//    3    9:areturn         
		}

		public String a()
		{
			return c;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field String c>
		//    2    4:areturn         
		}

		public String b()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field String d>
		//    2    4:areturn         
		}

		public static final a a;
		public static final a b;
		private static final a e[];
		private final String c;
		private final String d;

		static 
		{
			a = new a("READ_CARDS", 0, "read_cards_set", "read_cards_flat");
		//    0    0:new             #2   <Class dc$a>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "READ_CARDS">
		//    3    6:iconst_0        
		//    4    7:ldc1            #22  <String "read_cards_set">
		//    5    9:ldc1            #24  <String "read_cards_flat">
		//    6   11:invokespecial   #28  <Method void dc$a(String, int, String, String)>
		//    7   14:putstatic       #30  <Field dc$a a>
			b = new a("VIEWED_CARDS", 1, "viewed_cards_set", "viewed_cards_flat");
		//    8   17:new             #2   <Class dc$a>
		//    9   20:dup             
		//   10   21:ldc1            #32  <String "VIEWED_CARDS">
		//   11   23:iconst_1        
		//   12   24:ldc1            #34  <String "viewed_cards_set">
		//   13   26:ldc1            #36  <String "viewed_cards_flat">
		//   14   28:invokespecial   #28  <Method void dc$a(String, int, String, String)>
		//   15   31:putstatic       #38  <Field dc$a b>
			e = (new a[] {
				a, b
			});
		//   16   34:iconst_2        
		//   17   35:anewarray       a[]
		//   18   38:dup             
		//   19   39:iconst_0        
		//   20   40:getstatic       #30  <Field dc$a a>
		//   21   43:aastore         
		//   22   44:dup             
		//   23   45:iconst_1        
		//   24   46:getstatic       #38  <Field dc$a b>
		//   25   49:aastore         
		//   26   50:putstatic       #40  <Field dc$a[] e>
		//*  27   53:return          
		}

		private a(String s, int i, String s1, String s2)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #44  <Method void Enum(String, int)>
			c = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #46  <Field String c>
			d = s2;
		//    7   11:aload_0         
		//    8   12:aload           4
		//    9   14:putfield        #48  <Field String d>
		//   10   17:return          
		}
	}


	public dc(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		String s1;
		if(s == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       14
			s1 = "";
	//    4    8:ldc1            #33  <String "">
	//    5   10:astore_3        
		else
	//*   6   11:goto            16
			s1 = s;
	//    7   14:aload_2         
	//    8   15:astore_3        
		s1 = StringUtils.getCacheFileSuffix(context, s1);
	//    9   16:aload_1         
	//   10   17:aload_3         
	//   11   18:invokestatic    #39  <Method String StringUtils.getCacheFileSuffix(Context, String)>
	//   12   21:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   22:new             #41  <Class StringBuilder>
	//   14   25:dup             
	//   15   26:invokespecial   #42  <Method void StringBuilder()>
	//   16   29:astore          4
		stringbuilder.append("com.appboy.storage.feedstorageprovider");
	//   17   31:aload           4
	//   18   33:ldc1            #44  <String "com.appboy.storage.feedstorageprovider">
	//   19   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append(s1);
	//   21   39:aload           4
	//   22   41:aload_3         
	//   23   42:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		b = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   25   46:aload_0         
	//   26   47:aload_1         
	//   27   48:aload           4
	//   28   50:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   29   53:iconst_0        
	//   30   54:invokevirtual   #58  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   31   57:putfield        #60  <Field SharedPreferences b>
		c = a(a.b);
	//   32   60:aload_0         
	//   33   61:aload_0         
	//   34   62:getstatic       #63  <Field dc$a dc$a.b>
	//   35   65:invokespecial   #66  <Method Set a(dc$a)>
	//   36   68:putfield        #68  <Field Set c>
		d = a(a.a);
	//   37   71:aload_0         
	//   38   72:aload_0         
	//   39   73:getstatic       #70  <Field dc$a dc$a.a>
	//   40   76:invokespecial   #66  <Method Set a(dc$a)>
	//   41   79:putfield        #72  <Field Set d>
		d(s);
	//   42   82:aload_0         
	//   43   83:aload_2         
	//   44   84:invokespecial   #75  <Method void d(String)>
	//   45   87:return          
	}

	private FeedUpdatedEvent a(JSONArray jsonarray, String s, boolean flag, long l)
	{
		if(jsonarray != null && jsonarray.length() != 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          29
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #82  <Method int JSONArray.length()>
	//*   4    8:ifne            14
	//*   5   11:goto            29
			jsonarray = ((JSONArray) (bx.a(jsonarray, com/appboy/models/cards/Card, e, this)));
	//    6   14:aload_1         
	//    7   15:ldc1            #84  <Class Card>
	//    8   17:aload_0         
	//    9   18:getfield        #86  <Field bf e>
	//   10   21:aload_0         
	//   11   22:invokestatic    #91  <Method List bx.a(JSONArray, Class, bf, dc)>
	//   12   25:astore_1        
		else
	//*  13   26:goto            37
			jsonarray = ((JSONArray) (new ArrayList()));
	//   14   29:new             #93  <Class ArrayList>
	//   15   32:dup             
	//   16   33:invokespecial   #94  <Method void ArrayList()>
	//   17   36:astore_1        
		Iterator iterator = ((List) (jsonarray)).iterator();
	//   18   37:aload_1         
	//   19   38:invokeinterface #100 <Method Iterator List.iterator()>
	//   20   43:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//   21   45:aload           6
	//   22   47:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//   23   52:ifeq            122
			Card card = (Card)iterator.next();
	//   24   55:aload           6
	//   25   57:invokeinterface #110 <Method Object Iterator.next()>
	//   26   62:checkcast       #84  <Class Card>
	//   27   65:astore          7
			if(c.contains(((Object) (card.getId()))))
	//*  28   67:aload_0         
	//*  29   68:getfield        #68  <Field Set c>
	//*  30   71:aload           7
	//*  31   73:invokevirtual   #113 <Method String Card.getId()>
	//*  32   76:invokeinterface #119 <Method boolean Set.contains(Object)>
	//*  33   81:ifeq            96
			{
				card.setViewed(true);
	//   34   84:aload           7
	//   35   86:iconst_1        
	//   36   87:invokevirtual   #123 <Method void Card.setViewed(boolean)>
				card.setIsRead(true);
	//   37   90:aload           7
	//   38   92:iconst_1        
	//   39   93:invokevirtual   #126 <Method void Card.setIsRead(boolean)>
			}
			if(d.contains(((Object) (card.getId()))))
	//*  40   96:aload_0         
	//*  41   97:getfield        #72  <Field Set d>
	//*  42  100:aload           7
	//*  43  102:invokevirtual   #113 <Method String Card.getId()>
	//*  44  105:invokeinterface #119 <Method boolean Set.contains(Object)>
	//*  45  110:ifeq            45
				card.setIsRead(true);
	//   46  113:aload           7
	//   47  115:iconst_1        
	//   48  116:invokevirtual   #126 <Method void Card.setIsRead(boolean)>
		} while(true);
	//   49  119:goto            45
		return new FeedUpdatedEvent(((List) (jsonarray)), s, flag, l);
	//   50  122:new             #128 <Class FeedUpdatedEvent>
	//   51  125:dup             
	//   52  126:aload_1         
	//   53  127:aload_2         
	//   54  128:iload_3         
	//   55  129:lload           4
	//   56  131:invokespecial   #131 <Method void FeedUpdatedEvent(List, String, boolean, long)>
	//   57  134:areturn         
	}

	private Set a(a a1)
	{
		Object obj = ((Object) (a1.a()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #133 <Method String dc$a.a()>
	//    2    4:astore_3        
		String s = a1.b();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #135 <Method String dc$a.b()>
	//    5    9:astore_2        
		if(b.contains(s))
	//*   6   10:aload_0         
	//*   7   11:getfield        #60  <Field SharedPreferences b>
	//*   8   14:aload_2         
	//*   9   15:invokeinterface #140 <Method boolean SharedPreferences.contains(String)>
	//*  10   20:ifeq            73
		{
			obj = ((Object) (c(b.getString(s, ((String) (null))))));
	//   11   23:aload_0         
	//   12   24:getfield        #60  <Field SharedPreferences b>
	//   13   27:aload_2         
	//   14   28:aconst_null     
	//   15   29:invokeinterface #144 <Method String SharedPreferences.getString(String, String)>
	//   16   34:invokestatic    #147 <Method Set c(String)>
	//   17   37:astore_3        
			android.content.SharedPreferences.Editor editor = b.edit();
	//   18   38:aload_0         
	//   19   39:getfield        #60  <Field SharedPreferences b>
	//   20   42:invokeinterface #151 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   21   47:astore          4
			editor.remove(s);
	//   22   49:aload           4
	//   23   51:aload_2         
	//   24   52:invokeinterface #157 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   25   57:pop             
			editor.apply();
	//   26   58:aload           4
	//   27   60:invokeinterface #160 <Method void android.content.SharedPreferences$Editor.apply()>
			a(((Set) (obj)), a1);
	//   28   65:aload_0         
	//   29   66:aload_3         
	//   30   67:aload_1         
	//   31   68:invokevirtual   #163 <Method void a(Set, dc$a)>
			return ((Set) (obj));
	//   32   71:aload_3         
	//   33   72:areturn         
		} else
		{
			return ((Set) (new ConcurrentSkipListSet(((java.util.Collection) (b.getStringSet(((String) (obj)), ((Set) (new HashSet()))))))));
	//   34   73:new             #165 <Class ConcurrentSkipListSet>
	//   35   76:dup             
	//   36   77:aload_0         
	//   37   78:getfield        #60  <Field SharedPreferences b>
	//   38   81:aload_3         
	//   39   82:new             #167 <Class HashSet>
	//   40   85:dup             
	//   41   86:invokespecial   #168 <Method void HashSet()>
	//   42   89:invokeinterface #172 <Method Set SharedPreferences.getStringSet(String, Set)>
	//   43   94:invokespecial   #175 <Method void ConcurrentSkipListSet(java.util.Collection)>
	//   44   97:areturn         
		}
	}

	static Set a(JSONArray jsonarray)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #167 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #168 <Method void HashSet()>
	//    3    7:astore_2        
		if(jsonarray != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          57
		{
			for(int i = 0; i < jsonarray.length(); i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #82  <Method int JSONArray.length()>
	//*  11   19:icmpge          57
			{
				JSONObject jsonobject = jsonarray.getJSONObject(i);
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #182 <Method JSONObject JSONArray.getJSONObject(int)>
	//   15   27:astore_3        
				if(jsonobject.has("id"))
	//*  16   28:aload_3         
	//*  17   29:ldc1            #184 <String "id">
	//*  18   31:invokevirtual   #189 <Method boolean JSONObject.has(String)>
	//*  19   34:ifeq            50
					((Set) (hashset)).add(((Object) (jsonobject.getString("id"))));
	//   20   37:aload_2         
	//   21   38:aload_3         
	//   22   39:ldc1            #184 <String "id">
	//   23   41:invokevirtual   #192 <Method String JSONObject.getString(String)>
	//   24   44:invokeinterface #195 <Method boolean Set.add(Object)>
	//   25   49:pop             
			}

	//   26   50:iload_1         
	//   27   51:iconst_1        
	//   28   52:iadd            
	//   29   53:istore_1        
		}
	//*  30   54:goto            14
		return ((Set) (hashset));
	//   31   57:aload_2         
	//   32   58:areturn         
	}

	private void a(JSONArray jsonarray, long l)
	{
		android.content.SharedPreferences.Editor editor = b.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field SharedPreferences b>
	//    2    4:invokeinterface #151 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore          4
		if(jsonarray != null && jsonarray.length() != 0)
	//*   4   11:aload_1         
	//*   5   12:ifnull          42
	//*   6   15:aload_1         
	//*   7   16:invokevirtual   #82  <Method int JSONArray.length()>
	//*   8   19:ifne            25
	//*   9   22:goto            42
			editor.putString("cards", jsonarray.toString());
	//   10   25:aload           4
	//   11   27:ldc1            #199 <String "cards">
	//   12   29:aload_1         
	//   13   30:invokevirtual   #200 <Method String JSONArray.toString()>
	//   14   33:invokeinterface #204 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   15   38:pop             
		else
	//*  16   39:goto            52
			editor.remove("cards");
	//   17   42:aload           4
	//   18   44:ldc1            #199 <String "cards">
	//   19   46:invokeinterface #157 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   20   51:pop             
		editor.putLong("cards_timestamp", l);
	//   21   52:aload           4
	//   22   54:ldc1            #206 <String "cards_timestamp">
	//   23   56:lload_2         
	//   24   57:invokeinterface #210 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   25   62:pop             
		editor.apply();
	//   26   63:aload           4
	//   27   65:invokeinterface #160 <Method void android.content.SharedPreferences$Editor.apply()>
	//   28   70:return          
	}

	static Set c(String s)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #167 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #168 <Method void HashSet()>
	//    3    7:astore_1        
		if(s != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          23
			Collections.addAll(((java.util.Collection) (hashset)), ((Object []) (s.split(";"))));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:ldc1            #212 <String ";">
	//    9   16:invokevirtual   #218 <Method String[] String.split(String)>
	//   10   19:invokestatic    #224 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   11   22:pop             
		return ((Set) (hashset));
	//   12   23:aload_1         
	//   13   24:areturn         
	}

	private void d(String s)
	{
		android.content.SharedPreferences.Editor editor = b.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field SharedPreferences b>
	//    2    4:invokeinterface #151 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		editor.putString("uid", s);
	//    4   10:aload_2         
	//    5   11:ldc1            #227 <String "uid">
	//    6   13:aload_1         
	//    7   14:invokeinterface #204 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    8   19:pop             
		editor.apply();
	//    9   20:aload_2         
	//   10   21:invokeinterface #160 <Method void android.content.SharedPreferences$Editor.apply()>
	//   11   26:return          
	}

	public FeedUpdatedEvent a()
	{
		String s = b.getString("uid", "");
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field SharedPreferences b>
	//    2    4:ldc1            #227 <String "uid">
	//    3    6:ldc1            #33  <String "">
	//    4    8:invokeinterface #144 <Method String SharedPreferences.getString(String, String)>
	//    5   13:astore_1        
		return a(new JSONArray(b.getString("cards", "[]")), s, true, b.getLong("cards_timestamp", -1L));
	//    6   14:aload_0         
	//    7   15:new             #78  <Class JSONArray>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #60  <Field SharedPreferences b>
	//   11   23:ldc1            #199 <String "cards">
	//   12   25:ldc1            #230 <String "[]">
	//   13   27:invokeinterface #144 <Method String SharedPreferences.getString(String, String)>
	//   14   32:invokespecial   #232 <Method void JSONArray(String)>
	//   15   35:aload_1         
	//   16   36:iconst_1        
	//   17   37:aload_0         
	//   18   38:getfield        #60  <Field SharedPreferences b>
	//   19   41:ldc1            #206 <String "cards_timestamp">
	//   20   43:ldc2w           #233 <Long -1L>
	//   21   46:invokeinterface #238 <Method long SharedPreferences.getLong(String, long)>
	//   22   51:invokespecial   #240 <Method FeedUpdatedEvent a(JSONArray, String, boolean, long)>
	//   23   54:areturn         
	}

	public FeedUpdatedEvent a(JSONArray jsonarray, String s)
	{
		String s1;
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       11
			s1 = "";
	//    2    4:ldc1            #33  <String "">
	//    3    6:astore          5
		else
	//*   4    8:goto            14
			s1 = s;
	//    5   11:aload_2         
	//    6   12:astore          5
		Object obj = ((Object) (b.getString("uid", "")));
	//    7   14:aload_0         
	//    8   15:getfield        #60  <Field SharedPreferences b>
	//    9   18:ldc1            #227 <String "uid">
	//   10   20:ldc1            #33  <String "">
	//   11   22:invokeinterface #144 <Method String SharedPreferences.getString(String, String)>
	//   12   27:astore          6
		if(((String) (obj)).equals(((Object) (s1))))
	//*  13   29:aload           6
	//*  14   31:aload           5
	//*  15   33:invokevirtual   #244 <Method boolean String.equals(Object)>
	//*  16   36:ifeq            148
		{
			String s2 = a;
	//   17   39:getstatic       #26  <Field String a>
	//   18   42:astore          5
			obj = ((Object) (new StringBuilder()));
	//   19   44:new             #41  <Class StringBuilder>
	//   20   47:dup             
	//   21   48:invokespecial   #42  <Method void StringBuilder()>
	//   22   51:astore          6
			((StringBuilder) (obj)).append("Updating offline feed for user with id: ");
	//   23   53:aload           6
	//   24   55:ldc1            #246 <String "Updating offline feed for user with id: ">
	//   25   57:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   26   60:pop             
			((StringBuilder) (obj)).append(s);
	//   27   61:aload           6
	//   28   63:aload_2         
	//   29   64:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   30   67:pop             
			AppboyLogger.i(s2, ((StringBuilder) (obj)).toString());
	//   31   68:aload           5
	//   32   70:aload           6
	//   33   72:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   34   75:invokestatic    #250 <Method int AppboyLogger.i(String, String)>
	//   35   78:pop             
			long l = dl.a();
	//   36   79:invokestatic    #255 <Method long dl.a()>
	//   37   82:lstore_3        
			a(jsonarray, l);
	//   38   83:aload_0         
	//   39   84:aload_1         
	//   40   85:lload_3         
	//   41   86:invokespecial   #257 <Method void a(JSONArray, long)>
			c.retainAll(((java.util.Collection) (a(jsonarray))));
	//   42   89:aload_0         
	//   43   90:getfield        #68  <Field Set c>
	//   44   93:aload_1         
	//   45   94:invokestatic    #259 <Method Set a(JSONArray)>
	//   46   97:invokeinterface #263 <Method boolean Set.retainAll(java.util.Collection)>
	//   47  102:pop             
			a(c, a.b);
	//   48  103:aload_0         
	//   49  104:aload_0         
	//   50  105:getfield        #68  <Field Set c>
	//   51  108:getstatic       #63  <Field dc$a dc$a.b>
	//   52  111:invokevirtual   #163 <Method void a(Set, dc$a)>
			d.retainAll(((java.util.Collection) (a(jsonarray))));
	//   53  114:aload_0         
	//   54  115:getfield        #72  <Field Set d>
	//   55  118:aload_1         
	//   56  119:invokestatic    #259 <Method Set a(JSONArray)>
	//   57  122:invokeinterface #263 <Method boolean Set.retainAll(java.util.Collection)>
	//   58  127:pop             
			a(d, a.a);
	//   59  128:aload_0         
	//   60  129:aload_0         
	//   61  130:getfield        #72  <Field Set d>
	//   62  133:getstatic       #70  <Field dc$a dc$a.a>
	//   63  136:invokevirtual   #163 <Method void a(Set, dc$a)>
			return a(jsonarray, s, false, l);
	//   64  139:aload_0         
	//   65  140:aload_1         
	//   66  141:aload_2         
	//   67  142:iconst_0        
	//   68  143:lload_3         
	//   69  144:invokespecial   #240 <Method FeedUpdatedEvent a(JSONArray, String, boolean, long)>
	//   70  147:areturn         
		} else
		{
			jsonarray = ((JSONArray) (a));
	//   71  148:getstatic       #26  <Field String a>
	//   72  151:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   73  152:new             #41  <Class StringBuilder>
	//   74  155:dup             
	//   75  156:invokespecial   #42  <Method void StringBuilder()>
	//   76  159:astore          5
			stringbuilder.append("The received cards are for user ");
	//   77  161:aload           5
	//   78  163:ldc2            #265 <String "The received cards are for user ">
	//   79  166:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   80  169:pop             
			stringbuilder.append(s);
	//   81  170:aload           5
	//   82  172:aload_2         
	//   83  173:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   84  176:pop             
			stringbuilder.append(" and the current user is ");
	//   85  177:aload           5
	//   86  179:ldc2            #267 <String " and the current user is ">
	//   87  182:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   88  185:pop             
			stringbuilder.append(((String) (obj)));
	//   89  186:aload           5
	//   90  188:aload           6
	//   91  190:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   92  193:pop             
			stringbuilder.append(" , the cards will be discarded and no changes will be made.");
	//   93  194:aload           5
	//   94  196:ldc2            #269 <String " , the cards will be discarded and no changes will be made.">
	//   95  199:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   96  202:pop             
			AppboyLogger.i(((String) (jsonarray)), stringbuilder.toString());
	//   97  203:aload_1         
	//   98  204:aload           5
	//   99  206:invokevirtual   #52  <Method String StringBuilder.toString()>
	//  100  209:invokestatic    #250 <Method int AppboyLogger.i(String, String)>
	//  101  212:pop             
			return null;
	//  102  213:aconst_null     
	//  103  214:areturn         
		}
	}

	public void a(bf bf)
	{
		e = bf;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field bf e>
	//    3    5:return          
	}

	public void a(String s)
	{
		if(c.contains(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field Set c>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #119 <Method boolean Set.contains(Object)>
	//*   4   10:ifeq            14
		{
			return;
	//    5   13:return          
		} else
		{
			c.add(((Object) (s)));
	//    6   14:aload_0         
	//    7   15:getfield        #68  <Field Set c>
	//    8   18:aload_1         
	//    9   19:invokeinterface #195 <Method boolean Set.add(Object)>
	//   10   24:pop             
			a(c, a.b);
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #68  <Field Set c>
	//   14   30:getstatic       #63  <Field dc$a dc$a.b>
	//   15   33:invokevirtual   #163 <Method void a(Set, dc$a)>
			return;
	//   16   36:return          
		}
	}

	void a(Set set, a a1)
	{
		a1 = ((a) (a1.a()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #133 <Method String dc$a.a()>
	//    2    4:astore_2        
		android.content.SharedPreferences.Editor editor = b.edit();
	//    3    5:aload_0         
	//    4    6:getfield        #60  <Field SharedPreferences b>
	//    5    9:invokeinterface #151 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   14:astore_3        
		if(set != null && !set.isEmpty())
	//*   7   15:aload_1         
	//*   8   16:ifnull          43
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #273 <Method boolean Set.isEmpty()>
	//*  11   25:ifeq            31
	//*  12   28:goto            43
			editor.putStringSet(((String) (a1)), set);
	//   13   31:aload_3         
	//   14   32:aload_2         
	//   15   33:aload_1         
	//   16   34:invokeinterface #277 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   17   39:pop             
		else
	//*  18   40:goto            51
			editor.remove(((String) (a1)));
	//   19   43:aload_3         
	//   20   44:aload_2         
	//   21   45:invokeinterface #157 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   22   50:pop             
		editor.apply();
	//   23   51:aload_3         
	//   24   52:invokeinterface #160 <Method void android.content.SharedPreferences$Editor.apply()>
	//   25   57:return          
	}

	public void b(String s)
	{
		if(d.contains(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field Set d>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #119 <Method boolean Set.contains(Object)>
	//*   4   10:ifeq            14
		{
			return;
	//    5   13:return          
		} else
		{
			d.add(((Object) (s)));
	//    6   14:aload_0         
	//    7   15:getfield        #72  <Field Set d>
	//    8   18:aload_1         
	//    9   19:invokeinterface #195 <Method boolean Set.add(Object)>
	//   10   24:pop             
			a(d, a.a);
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #72  <Field Set d>
	//   14   30:getstatic       #70  <Field dc$a dc$a.a>
	//   15   33:invokevirtual   #163 <Method void a(Set, dc$a)>
			return;
	//   16   36:return          
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dc);
	private final SharedPreferences b;
	private final Set c;
	private final Set d;
	private bf e;

	static 
	{
	//    0    0:ldc1            #2   <Class dc>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String a>
	//*   3    8:return          
	}
}
