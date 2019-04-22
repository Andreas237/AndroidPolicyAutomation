// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.enums.CardKey;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			dt, b, cb, eb, 
//			c, bo

public class dr
	implements dt
{
	static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(bo/app/dr$a, s);
		//    0    0:ldc1            #2   <Class dr$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class dr$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) (e)).clone();
		//    0    0:getstatic       #40  <Field dr$a[] e>
		//    1    3:invokevirtual   #62  <Method Object _5B_Lbo.app.dr$a_3B_.clone()>
		//    2    6:checkcast       #58  <Class dr$a[]>
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
		//    0    0:new             #2   <Class dr$a>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "READ_CARDS">
		//    3    6:iconst_0        
		//    4    7:ldc1            #22  <String "read_cards_set">
		//    5    9:ldc1            #24  <String "read_cards_flat">
		//    6   11:invokespecial   #28  <Method void dr$a(String, int, String, String)>
		//    7   14:putstatic       #30  <Field dr$a a>
			b = new a("VIEWED_CARDS", 1, "viewed_cards_set", "viewed_cards_flat");
		//    8   17:new             #2   <Class dr$a>
		//    9   20:dup             
		//   10   21:ldc1            #32  <String "VIEWED_CARDS">
		//   11   23:iconst_1        
		//   12   24:ldc1            #34  <String "viewed_cards_set">
		//   13   26:ldc1            #36  <String "viewed_cards_flat">
		//   14   28:invokespecial   #28  <Method void dr$a(String, int, String, String)>
		//   15   31:putstatic       #38  <Field dr$a b>
			e = (new a[] {
				a, b
			});
		//   16   34:iconst_2        
		//   17   35:anewarray       a[]
		//   18   38:dup             
		//   19   39:iconst_0        
		//   20   40:getstatic       #30  <Field dr$a a>
		//   21   43:aastore         
		//   22   44:dup             
		//   23   45:iconst_1        
		//   24   46:getstatic       #38  <Field dr$a b>
		//   25   49:aastore         
		//   26   50:putstatic       #40  <Field dr$a[] e>
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


	public dr(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #39  <Class b>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void b()>
	//    6   12:putfield        #42  <Field c e>
		String s1;
		if(s == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       25
			s1 = "";
	//    9   19:ldc1            #44  <String "">
	//   10   21:astore_3        
		else
	//*  11   22:goto            27
			s1 = s;
	//   12   25:aload_2         
	//   13   26:astore_3        
		s1 = StringUtils.getCacheFileSuffix(context, s1);
	//   14   27:aload_1         
	//   15   28:aload_3         
	//   16   29:invokestatic    #50  <Method String StringUtils.getCacheFileSuffix(Context, String)>
	//   17   32:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   18   33:new             #52  <Class StringBuilder>
	//   19   36:dup             
	//   20   37:invokespecial   #53  <Method void StringBuilder()>
	//   21   40:astore          4
		stringbuilder.append("com.appboy.storage.feedstorageprovider");
	//   22   42:aload           4
	//   23   44:ldc1            #55  <String "com.appboy.storage.feedstorageprovider">
	//   24   46:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(s1);
	//   26   50:aload           4
	//   27   52:aload_3         
	//   28   53:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
		b = context.getSharedPreferences(stringbuilder.toString(), 0);
	//   30   57:aload_0         
	//   31   58:aload_1         
	//   32   59:aload           4
	//   33   61:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   34   64:iconst_0        
	//   35   65:invokevirtual   #69  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   36   68:putfield        #71  <Field SharedPreferences b>
		c = a(a.b);
	//   37   71:aload_0         
	//   38   72:aload_0         
	//   39   73:getstatic       #74  <Field dr$a dr$a.b>
	//   40   76:invokespecial   #77  <Method Set a(dr$a)>
	//   41   79:putfield        #79  <Field Set c>
		d = a(a.a);
	//   42   82:aload_0         
	//   43   83:aload_0         
	//   44   84:getstatic       #81  <Field dr$a dr$a.a>
	//   45   87:invokespecial   #77  <Method Set a(dr$a)>
	//   46   90:putfield        #83  <Field Set d>
		f(s);
	//   47   93:aload_0         
	//   48   94:aload_2         
	//   49   95:invokespecial   #86  <Method void f(String)>
	//   50   98:return          
	}

	private FeedUpdatedEvent a(JSONArray jsonarray, String s, boolean flag, long l)
	{
		if(jsonarray != null && jsonarray.length() != 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          39
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #93  <Method int JSONArray.length()>
	//*   4    8:ifne            14
	//*   5   11:goto            39
			jsonarray = ((JSONArray) (cb.a(jsonarray, new com.appboy.enums.CardKey.Provider(false), f, ((dt) (this)), e)));
	//    6   14:aload_1         
	//    7   15:new             #95  <Class com.appboy.enums.CardKey$Provider>
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:invokespecial   #98  <Method void com.appboy.enums.CardKey$Provider(boolean)>
	//   11   23:aload_0         
	//   12   24:getfield        #100 <Field bo f>
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #42  <Field c e>
	//   16   32:invokestatic    #105 <Method List cb.a(JSONArray, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//   17   35:astore_1        
		else
	//*  18   36:goto            47
			jsonarray = ((JSONArray) (new ArrayList()));
	//   19   39:new             #107 <Class ArrayList>
	//   20   42:dup             
	//   21   43:invokespecial   #108 <Method void ArrayList()>
	//   22   46:astore_1        
		Iterator iterator = ((List) (jsonarray)).iterator();
	//   23   47:aload_1         
	//   24   48:invokeinterface #114 <Method Iterator List.iterator()>
	//   25   53:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//   26   55:aload           6
	//   27   57:invokeinterface #120 <Method boolean Iterator.hasNext()>
	//   28   62:ifeq            132
			Card card = (Card)iterator.next();
	//   29   65:aload           6
	//   30   67:invokeinterface #124 <Method Object Iterator.next()>
	//   31   72:checkcast       #126 <Class Card>
	//   32   75:astore          7
			if(c.contains(((Object) (card.getId()))))
	//*  33   77:aload_0         
	//*  34   78:getfield        #79  <Field Set c>
	//*  35   81:aload           7
	//*  36   83:invokevirtual   #129 <Method String Card.getId()>
	//*  37   86:invokeinterface #135 <Method boolean Set.contains(Object)>
	//*  38   91:ifeq            106
			{
				card.setViewed(true);
	//   39   94:aload           7
	//   40   96:iconst_1        
	//   41   97:invokevirtual   #138 <Method void Card.setViewed(boolean)>
				card.setIndicatorHighlighted(true);
	//   42  100:aload           7
	//   43  102:iconst_1        
	//   44  103:invokevirtual   #141 <Method void Card.setIndicatorHighlighted(boolean)>
			}
			if(d.contains(((Object) (card.getId()))))
	//*  45  106:aload_0         
	//*  46  107:getfield        #83  <Field Set d>
	//*  47  110:aload           7
	//*  48  112:invokevirtual   #129 <Method String Card.getId()>
	//*  49  115:invokeinterface #135 <Method boolean Set.contains(Object)>
	//*  50  120:ifeq            55
				card.setIndicatorHighlighted(true);
	//   51  123:aload           7
	//   52  125:iconst_1        
	//   53  126:invokevirtual   #141 <Method void Card.setIndicatorHighlighted(boolean)>
		} while(true);
	//   54  129:goto            55
		return new FeedUpdatedEvent(((List) (jsonarray)), s, flag, l);
	//   55  132:new             #143 <Class FeedUpdatedEvent>
	//   56  135:dup             
	//   57  136:aload_1         
	//   58  137:aload_2         
	//   59  138:iload_3         
	//   60  139:lload           4
	//   61  141:invokespecial   #146 <Method void FeedUpdatedEvent(List, String, boolean, long)>
	//   62  144:areturn         
	}

	private Set a(a a1)
	{
		Object obj = ((Object) (a1.a()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #148 <Method String dr$a.a()>
	//    2    4:astore_3        
		String s = a1.b();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #150 <Method String dr$a.b()>
	//    5    9:astore_2        
		if(b.contains(s))
	//*   6   10:aload_0         
	//*   7   11:getfield        #71  <Field SharedPreferences b>
	//*   8   14:aload_2         
	//*   9   15:invokeinterface #155 <Method boolean SharedPreferences.contains(String)>
	//*  10   20:ifeq            73
		{
			obj = ((Object) (e(b.getString(s, ((String) (null))))));
	//   11   23:aload_0         
	//   12   24:getfield        #71  <Field SharedPreferences b>
	//   13   27:aload_2         
	//   14   28:aconst_null     
	//   15   29:invokeinterface #159 <Method String SharedPreferences.getString(String, String)>
	//   16   34:invokestatic    #162 <Method Set e(String)>
	//   17   37:astore_3        
			android.content.SharedPreferences.Editor editor = b.edit();
	//   18   38:aload_0         
	//   19   39:getfield        #71  <Field SharedPreferences b>
	//   20   42:invokeinterface #166 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   21   47:astore          4
			editor.remove(s);
	//   22   49:aload           4
	//   23   51:aload_2         
	//   24   52:invokeinterface #172 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   25   57:pop             
			editor.apply();
	//   26   58:aload           4
	//   27   60:invokeinterface #175 <Method void android.content.SharedPreferences$Editor.apply()>
			a(((Set) (obj)), a1);
	//   28   65:aload_0         
	//   29   66:aload_3         
	//   30   67:aload_1         
	//   31   68:invokevirtual   #178 <Method void a(Set, dr$a)>
			return ((Set) (obj));
	//   32   71:aload_3         
	//   33   72:areturn         
		} else
		{
			return ((Set) (new ConcurrentSkipListSet(((java.util.Collection) (b.getStringSet(((String) (obj)), ((Set) (new HashSet()))))))));
	//   34   73:new             #180 <Class ConcurrentSkipListSet>
	//   35   76:dup             
	//   36   77:aload_0         
	//   37   78:getfield        #71  <Field SharedPreferences b>
	//   38   81:aload_3         
	//   39   82:new             #182 <Class HashSet>
	//   40   85:dup             
	//   41   86:invokespecial   #183 <Method void HashSet()>
	//   42   89:invokeinterface #187 <Method Set SharedPreferences.getStringSet(String, Set)>
	//   43   94:invokespecial   #190 <Method void ConcurrentSkipListSet(java.util.Collection)>
	//   44   97:areturn         
		}
	}

	static Set a(JSONArray jsonarray)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #182 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #183 <Method void HashSet()>
	//    3    7:astore_2        
		if(jsonarray != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          65
		{
			for(int i = 0; i < jsonarray.length(); i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #93  <Method int JSONArray.length()>
	//*  11   19:icmpge          65
			{
				JSONObject jsonobject = jsonarray.getJSONObject(i);
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #197 <Method JSONObject JSONArray.getJSONObject(int)>
	//   15   27:astore_3        
				if(jsonobject.has(CardKey.ID.getFeedKey()))
	//*  16   28:aload_3         
	//*  17   29:getstatic       #203 <Field CardKey CardKey.ID>
	//*  18   32:invokevirtual   #206 <Method String CardKey.getFeedKey()>
	//*  19   35:invokevirtual   #211 <Method boolean JSONObject.has(String)>
	//*  20   38:ifeq            58
					((Set) (hashset)).add(((Object) (jsonobject.getString(CardKey.ID.getFeedKey()))));
	//   21   41:aload_2         
	//   22   42:aload_3         
	//   23   43:getstatic       #203 <Field CardKey CardKey.ID>
	//   24   46:invokevirtual   #206 <Method String CardKey.getFeedKey()>
	//   25   49:invokevirtual   #214 <Method String JSONObject.getString(String)>
	//   26   52:invokeinterface #217 <Method boolean Set.add(Object)>
	//   27   57:pop             
			}

	//   28   58:iload_1         
	//   29   59:iconst_1        
	//   30   60:iadd            
	//   31   61:istore_1        
		}
	//*  32   62:goto            14
		return ((Set) (hashset));
	//   33   65:aload_2         
	//   34   66:areturn         
	}

	private void a(JSONArray jsonarray, long l)
	{
		android.content.SharedPreferences.Editor editor = b.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field SharedPreferences b>
	//    2    4:invokeinterface #166 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore          4
		if(jsonarray != null && jsonarray.length() != 0)
	//*   4   11:aload_1         
	//*   5   12:ifnull          62
	//*   6   15:aload_1         
	//*   7   16:invokevirtual   #93  <Method int JSONArray.length()>
	//*   8   19:ifne            25
	//*   9   22:goto            62
		{
			if(!(jsonarray instanceof JSONArray))
	//*  10   25:aload_1         
	//*  11   26:instanceof      #89  <Class JSONArray>
	//*  12   29:ifne            40
				jsonarray = ((JSONArray) (jsonarray.toString()));
	//   13   32:aload_1         
	//   14   33:invokevirtual   #220 <Method String JSONArray.toString()>
	//   15   36:astore_1        
			else
	//*  16   37:goto            48
				jsonarray = ((JSONArray) (JSONArrayInstrumentation.toString((JSONArray)jsonarray)));
	//   17   40:aload_1         
	//   18   41:checkcast       #89  <Class JSONArray>
	//   19   44:invokestatic    #225 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//   20   47:astore_1        
			editor.putString("cards", ((String) (jsonarray)));
	//   21   48:aload           4
	//   22   50:ldc1            #227 <String "cards">
	//   23   52:aload_1         
	//   24   53:invokeinterface #231 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   25   58:pop             
		} else
	//*  26   59:goto            72
		{
			editor.remove("cards");
	//   27   62:aload           4
	//   28   64:ldc1            #227 <String "cards">
	//   29   66:invokeinterface #172 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   30   71:pop             
		}
		editor.putLong("cards_timestamp", l);
	//   31   72:aload           4
	//   32   74:ldc1            #233 <String "cards_timestamp">
	//   33   76:lload_2         
	//   34   77:invokeinterface #237 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   35   82:pop             
		editor.apply();
	//   36   83:aload           4
	//   37   85:invokeinterface #175 <Method void android.content.SharedPreferences$Editor.apply()>
	//   38   90:return          
	}

	static Set e(String s)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #182 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #183 <Method void HashSet()>
	//    3    7:astore_1        
		if(s != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          23
			Collections.addAll(((java.util.Collection) (hashset)), ((Object []) (s.split(";"))));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:ldc1            #239 <String ";">
	//    9   16:invokevirtual   #245 <Method String[] String.split(String)>
	//   10   19:invokestatic    #251 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   11   22:pop             
		return ((Set) (hashset));
	//   12   23:aload_1         
	//   13   24:areturn         
	}

	private void f(String s)
	{
		android.content.SharedPreferences.Editor editor = b.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field SharedPreferences b>
	//    2    4:invokeinterface #166 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		editor.putString("uid", s);
	//    4   10:aload_2         
	//    5   11:ldc1            #254 <String "uid">
	//    6   13:aload_1         
	//    7   14:invokeinterface #231 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    8   19:pop             
		editor.apply();
	//    9   20:aload_2         
	//   10   21:invokeinterface #175 <Method void android.content.SharedPreferences$Editor.apply()>
	//   11   26:return          
	}

	public FeedUpdatedEvent a()
	{
		String s = b.getString("uid", "");
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field SharedPreferences b>
	//    2    4:ldc1            #254 <String "uid">
	//    3    6:ldc1            #44  <String "">
	//    4    8:invokeinterface #159 <Method String SharedPreferences.getString(String, String)>
	//    5   13:astore_1        
		return a(JSONArrayInstrumentation.init(b.getString("cards", "[]")), s, true, b.getLong("cards_timestamp", -1L));
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #71  <Field SharedPreferences b>
	//    9   19:ldc1            #227 <String "cards">
	//   10   21:ldc2            #257 <String "[]">
	//   11   24:invokeinterface #159 <Method String SharedPreferences.getString(String, String)>
	//   12   29:invokestatic    #261 <Method JSONArray JSONArrayInstrumentation.init(String)>
	//   13   32:aload_1         
	//   14   33:iconst_1        
	//   15   34:aload_0         
	//   16   35:getfield        #71  <Field SharedPreferences b>
	//   17   38:ldc1            #233 <String "cards_timestamp">
	//   18   40:ldc2w           #262 <Long -1L>
	//   19   43:invokeinterface #267 <Method long SharedPreferences.getLong(String, long)>
	//   20   48:invokespecial   #269 <Method FeedUpdatedEvent a(JSONArray, String, boolean, long)>
	//   21   51:areturn         
	}

	public FeedUpdatedEvent a(JSONArray jsonarray, String s)
	{
		String s1;
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       11
			s1 = "";
	//    2    4:ldc1            #44  <String "">
	//    3    6:astore          5
		else
	//*   4    8:goto            14
			s1 = s;
	//    5   11:aload_2         
	//    6   12:astore          5
		Object obj = ((Object) (b.getString("uid", "")));
	//    7   14:aload_0         
	//    8   15:getfield        #71  <Field SharedPreferences b>
	//    9   18:ldc1            #254 <String "uid">
	//   10   20:ldc1            #44  <String "">
	//   11   22:invokeinterface #159 <Method String SharedPreferences.getString(String, String)>
	//   12   27:astore          6
		if(((String) (obj)).equals(((Object) (s1))))
	//*  13   29:aload           6
	//*  14   31:aload           5
	//*  15   33:invokevirtual   #273 <Method boolean String.equals(Object)>
	//*  16   36:ifeq            149
		{
			String s2 = a;
	//   17   39:getstatic       #32  <Field String a>
	//   18   42:astore          5
			obj = ((Object) (new StringBuilder()));
	//   19   44:new             #52  <Class StringBuilder>
	//   20   47:dup             
	//   21   48:invokespecial   #53  <Method void StringBuilder()>
	//   22   51:astore          6
			((StringBuilder) (obj)).append("Updating offline feed for user with id: ");
	//   23   53:aload           6
	//   24   55:ldc2            #275 <String "Updating offline feed for user with id: ">
	//   25   58:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   26   61:pop             
			((StringBuilder) (obj)).append(s);
	//   27   62:aload           6
	//   28   64:aload_2         
	//   29   65:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
			AppboyLogger.i(s2, ((StringBuilder) (obj)).toString());
	//   31   69:aload           5
	//   32   71:aload           6
	//   33   73:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   34   76:invokestatic    #279 <Method int AppboyLogger.i(String, String)>
	//   35   79:pop             
			long l = eb.a();
	//   36   80:invokestatic    #284 <Method long eb.a()>
	//   37   83:lstore_3        
			a(jsonarray, l);
	//   38   84:aload_0         
	//   39   85:aload_1         
	//   40   86:lload_3         
	//   41   87:invokespecial   #286 <Method void a(JSONArray, long)>
			c.retainAll(((java.util.Collection) (a(jsonarray))));
	//   42   90:aload_0         
	//   43   91:getfield        #79  <Field Set c>
	//   44   94:aload_1         
	//   45   95:invokestatic    #288 <Method Set a(JSONArray)>
	//   46   98:invokeinterface #292 <Method boolean Set.retainAll(java.util.Collection)>
	//   47  103:pop             
			a(c, a.b);
	//   48  104:aload_0         
	//   49  105:aload_0         
	//   50  106:getfield        #79  <Field Set c>
	//   51  109:getstatic       #74  <Field dr$a dr$a.b>
	//   52  112:invokevirtual   #178 <Method void a(Set, dr$a)>
			d.retainAll(((java.util.Collection) (a(jsonarray))));
	//   53  115:aload_0         
	//   54  116:getfield        #83  <Field Set d>
	//   55  119:aload_1         
	//   56  120:invokestatic    #288 <Method Set a(JSONArray)>
	//   57  123:invokeinterface #292 <Method boolean Set.retainAll(java.util.Collection)>
	//   58  128:pop             
			a(d, a.a);
	//   59  129:aload_0         
	//   60  130:aload_0         
	//   61  131:getfield        #83  <Field Set d>
	//   62  134:getstatic       #81  <Field dr$a dr$a.a>
	//   63  137:invokevirtual   #178 <Method void a(Set, dr$a)>
			return a(jsonarray, s, false, l);
	//   64  140:aload_0         
	//   65  141:aload_1         
	//   66  142:aload_2         
	//   67  143:iconst_0        
	//   68  144:lload_3         
	//   69  145:invokespecial   #269 <Method FeedUpdatedEvent a(JSONArray, String, boolean, long)>
	//   70  148:areturn         
		} else
		{
			jsonarray = ((JSONArray) (a));
	//   71  149:getstatic       #32  <Field String a>
	//   72  152:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   73  153:new             #52  <Class StringBuilder>
	//   74  156:dup             
	//   75  157:invokespecial   #53  <Method void StringBuilder()>
	//   76  160:astore          5
			stringbuilder.append("The received cards are for user ");
	//   77  162:aload           5
	//   78  164:ldc2            #294 <String "The received cards are for user ">
	//   79  167:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   80  170:pop             
			stringbuilder.append(s);
	//   81  171:aload           5
	//   82  173:aload_2         
	//   83  174:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   84  177:pop             
			stringbuilder.append(" and the current user is ");
	//   85  178:aload           5
	//   86  180:ldc2            #296 <String " and the current user is ">
	//   87  183:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   88  186:pop             
			stringbuilder.append(((String) (obj)));
	//   89  187:aload           5
	//   90  189:aload           6
	//   91  191:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   92  194:pop             
			stringbuilder.append(" , the cards will be discarded and no changes will be made.");
	//   93  195:aload           5
	//   94  197:ldc2            #298 <String " , the cards will be discarded and no changes will be made.">
	//   95  200:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   96  203:pop             
			AppboyLogger.i(((String) (jsonarray)), stringbuilder.toString());
	//   97  204:aload_1         
	//   98  205:aload           5
	//   99  207:invokevirtual   #63  <Method String StringBuilder.toString()>
	//  100  210:invokestatic    #279 <Method int AppboyLogger.i(String, String)>
	//  101  213:pop             
			return null;
	//  102  214:aconst_null     
	//  103  215:areturn         
		}
	}

	public void a(bo bo)
	{
		f = bo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field bo f>
	//    3    5:return          
	}

	public void a(String s)
	{
		if(d.contains(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Set d>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #135 <Method boolean Set.contains(Object)>
	//*   4   10:ifeq            14
		{
			return;
	//    5   13:return          
		} else
		{
			d.add(((Object) (s)));
	//    6   14:aload_0         
	//    7   15:getfield        #83  <Field Set d>
	//    8   18:aload_1         
	//    9   19:invokeinterface #217 <Method boolean Set.add(Object)>
	//   10   24:pop             
			a(d, a.a);
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #83  <Field Set d>
	//   14   30:getstatic       #81  <Field dr$a dr$a.a>
	//   15   33:invokevirtual   #178 <Method void a(Set, dr$a)>
			return;
	//   16   36:return          
		}
	}

	void a(Set set, a a1)
	{
		a1 = ((a) (a1.a()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #148 <Method String dr$a.a()>
	//    2    4:astore_2        
		android.content.SharedPreferences.Editor editor = b.edit();
	//    3    5:aload_0         
	//    4    6:getfield        #71  <Field SharedPreferences b>
	//    5    9:invokeinterface #166 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   14:astore_3        
		if(set != null && !set.isEmpty())
	//*   7   15:aload_1         
	//*   8   16:ifnull          43
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #302 <Method boolean Set.isEmpty()>
	//*  11   25:ifeq            31
	//*  12   28:goto            43
			editor.putStringSet(((String) (a1)), set);
	//   13   31:aload_3         
	//   14   32:aload_2         
	//   15   33:aload_1         
	//   16   34:invokeinterface #306 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   17   39:pop             
		else
	//*  18   40:goto            51
			editor.remove(((String) (a1)));
	//   19   43:aload_3         
	//   20   44:aload_2         
	//   21   45:invokeinterface #172 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   22   50:pop             
		editor.apply();
	//   23   51:aload_3         
	//   24   52:invokeinterface #175 <Method void android.content.SharedPreferences$Editor.apply()>
	//   25   57:return          
	}

	public void b(String s)
	{
		if(c.contains(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field Set c>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #135 <Method boolean Set.contains(Object)>
	//*   4   10:ifeq            14
		{
			return;
	//    5   13:return          
		} else
		{
			c.add(((Object) (s)));
	//    6   14:aload_0         
	//    7   15:getfield        #79  <Field Set c>
	//    8   18:aload_1         
	//    9   19:invokeinterface #217 <Method boolean Set.add(Object)>
	//   10   24:pop             
			a(c, a.b);
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #79  <Field Set c>
	//   14   30:getstatic       #74  <Field dr$a dr$a.b>
	//   15   33:invokevirtual   #178 <Method void a(Set, dr$a)>
			return;
	//   16   36:return          
		}
	}

	public void c(String s)
	{
	//    0    0:return          
	}

	public void d(String s)
	{
	//    0    0:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dr);
	private final SharedPreferences b;
	private final Set c;
	private final Set d;
	private final c e = new b();
	private bo f;

	static 
	{
	//    0    0:ldc1            #2   <Class dr>
	//    1    2:invokestatic    #30  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #32  <Field String a>
	//*   3    8:return          
	}
}
