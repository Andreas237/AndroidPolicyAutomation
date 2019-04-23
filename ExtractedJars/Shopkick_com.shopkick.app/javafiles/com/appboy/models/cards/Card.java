// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.cards;

import bo.app.*;
import com.appboy.enums.CardCategory;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class Card extends Observable
	implements IPutIntoJson
{

	public Card(JSONObject jsonobject)
	{
		this(jsonobject, ((bl) (null)), ((dc) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #67  <Method void Card(JSONObject, bl, dc)>
	//    5    7:return          
	}

	public Card(JSONObject jsonobject, bl bl1, dc dc1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Observable()>
		int i1 = 0;
	//    2    4:iconst_0        
	//    3    5:istore          4
		i = false;
	//    4    7:aload_0         
	//    5    8:iconst_0        
	//    6    9:putfield        #71  <Field boolean i>
		a = jsonobject;
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:putfield        #73  <Field JSONObject a>
		b = dt.a(jsonobject.optJSONObject("extras"), ((Map) (new HashMap())));
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:ldc1            #75  <String "extras">
	//   13   21:invokevirtual   #81  <Method JSONObject JSONObject.optJSONObject(String)>
	//   14   24:new             #83  <Class HashMap>
	//   15   27:dup             
	//   16   28:invokespecial   #84  <Method void HashMap()>
	//   17   31:invokestatic    #89  <Method Map dt.a(JSONObject, Map)>
	//   18   34:putfield        #91  <Field Map b>
		l = bl1;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:putfield        #93  <Field bl l>
		m = dc1;
	//   22   42:aload_0         
	//   23   43:aload_3         
	//   24   44:putfield        #95  <Field dc m>
		c = jsonobject.getString("id");
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:ldc1            #24  <String "id">
	//   28   51:invokevirtual   #99  <Method String JSONObject.getString(String)>
	//   29   54:putfield        #101 <Field String c>
		d = jsonobject.getBoolean("viewed");
	//   30   57:aload_0         
	//   31   58:aload_1         
	//   32   59:ldc1            #30  <String "viewed">
	//   33   61:invokevirtual   #105 <Method boolean JSONObject.getBoolean(String)>
	//   34   64:putfield        #107 <Field boolean d>
		e = d;
	//   35   67:aload_0         
	//   36   68:aload_0         
	//   37   69:getfield        #107 <Field boolean d>
	//   38   72:putfield        #109 <Field boolean e>
		f = jsonobject.getLong("created");
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:ldc1            #14  <String "created">
	//   42   79:invokevirtual   #113 <Method long JSONObject.getLong(String)>
	//   43   82:putfield        #115 <Field long f>
		g = jsonobject.getLong("updated");
	//   44   85:aload_0         
	//   45   86:aload_1         
	//   46   87:ldc1            #27  <String "updated">
	//   47   89:invokevirtual   #113 <Method long JSONObject.getLong(String)>
	//   48   92:putfield        #117 <Field long g>
		h = jsonobject.optLong("expires_at", -1L);
	//   49   95:aload_0         
	//   50   96:aload_1         
	//   51   97:ldc1            #21  <String "expires_at">
	//   52   99:ldc2w           #17  <Long -1L>
	//   53  102:invokevirtual   #121 <Method long JSONObject.optLong(String, long)>
	//   54  105:putfield        #123 <Field long h>
		i = jsonobject.optBoolean("use_webview", false);
	//   55  108:aload_0         
	//   56  109:aload_1         
	//   57  110:ldc1            #125 <String "use_webview">
	//   58  112:iconst_0        
	//   59  113:invokevirtual   #129 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   60  116:putfield        #71  <Field boolean i>
		jsonobject = ((JSONObject) (jsonobject.optJSONArray("categories")));
	//   61  119:aload_1         
	//   62  120:ldc1            #11  <String "categories">
	//   63  122:invokevirtual   #133 <Method JSONArray JSONObject.optJSONArray(String)>
	//   64  125:astore_1        
		if(jsonobject != null && ((JSONArray) (jsonobject)).length() != 0)
	//*  65  126:aload_1         
	//*  66  127:ifnull          190
	//*  67  130:aload_1         
	//*  68  131:invokevirtual   #139 <Method int JSONArray.length()>
	//*  69  134:ifne            140
	//*  70  137:goto            190
		{
			j = EnumSet.noneOf(com/appboy/enums/CardCategory);
	//   71  140:aload_0         
	//   72  141:ldc1            #141 <Class CardCategory>
	//   73  143:invokestatic    #147 <Method EnumSet EnumSet.noneOf(Class)>
	//   74  146:putfield        #149 <Field EnumSet j>
			for(; i1 < ((JSONArray) (jsonobject)).length(); i1++)
	//*  75  149:iload           4
	//*  76  151:aload_1         
	//*  77  152:invokevirtual   #139 <Method int JSONArray.length()>
	//*  78  155:icmpge          200
			{
				bl1 = ((bl) (CardCategory.get(((JSONArray) (jsonobject)).getString(i1))));
	//   79  158:aload_1         
	//   80  159:iload           4
	//   81  161:invokevirtual   #152 <Method String JSONArray.getString(int)>
	//   82  164:invokestatic    #156 <Method CardCategory CardCategory.get(String)>
	//   83  167:astore_2        
				if(bl1 != null)
	//*  84  168:aload_2         
	//*  85  169:ifnull          181
					j.add(((Object) (bl1)));
	//   86  172:aload_0         
	//   87  173:getfield        #149 <Field EnumSet j>
	//   88  176:aload_2         
	//   89  177:invokevirtual   #160 <Method boolean EnumSet.add(Object)>
	//   90  180:pop             
			}

	//   91  181:iload           4
	//   92  183:iconst_1        
	//   93  184:iadd            
	//   94  185:istore          4
		} else
	//*  95  187:goto            149
		{
			j = EnumSet.of(((Enum) (CardCategory.NO_CATEGORY)));
	//   96  190:aload_0         
	//   97  191:getstatic       #164 <Field CardCategory CardCategory.NO_CATEGORY>
	//   98  194:invokestatic    #168 <Method EnumSet EnumSet.of(Enum)>
	//   99  197:putfield        #149 <Field EnumSet j>
		}
	//  100  200:return          
	}

	boolean a()
	{
		if(StringUtils.isNullOrBlank(c))
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field String c>
	//*   2    4:invokestatic    #175 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   3    7:ifeq            21
		{
			AppboyLogger.e(k, "Card ID cannot be null");
	//    4   10:getstatic       #61  <Field String k>
	//    5   13:ldc1            #177 <String "Card ID cannot be null">
	//    6   15:invokestatic    #180 <Method int AppboyLogger.e(String, String)>
	//    7   18:pop             
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
		} else
		{
			return true;
	//   10   21:iconst_1        
	//   11   22:ireturn         
		}
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #186 <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field JSONObject a>
	//    2    4:areturn         
	}

	public EnumSet getCategories()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field EnumSet j>
	//    2    4:areturn         
	}

	public long getCreated()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field long f>
	//    2    4:lreturn         
	}

	public long getExpiresAt()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field long h>
	//    2    4:lreturn         
	}

	public Map getExtras()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Map b>
	//    2    4:areturn         
	}

	public String getId()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String c>
	//    2    4:areturn         
	}

	public boolean getOpenUriInWebView()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean i>
	//    2    4:ireturn         
	}

	public long getUpdated()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field long g>
	//    2    4:lreturn         
	}

	public String getUrl()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean getViewed()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean d>
	//    2    4:ireturn         
	}

	public boolean isEqualToCard(Card card)
	{
		return c.equals(((Object) (card.getId()))) && g == card.getUpdated() && l == card.l;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #206 <Method String getId()>
	//    4    8:invokevirtual   #211 <Method boolean String.equals(Object)>
	//    5   11:ifeq            39
	//    6   14:aload_0         
	//    7   15:getfield        #117 <Field long g>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #213 <Method long getUpdated()>
	//   10   22:lcmp            
	//   11   23:ifne            39
	//   12   26:aload_0         
	//   13   27:getfield        #93  <Field bl l>
	//   14   30:aload_1         
	//   15   31:getfield        #93  <Field bl l>
	//   16   34:if_acmpne       39
	//   17   37:iconst_1        
	//   18   38:ireturn         
	//   19   39:iconst_0        
	//   20   40:ireturn         
	}

	public boolean isExpired()
	{
		return getExpiresAt() != -1L && getExpiresAt() <= dl.a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #216 <Method long getExpiresAt()>
	//    2    4:ldc2w           #17  <Long -1L>
	//    3    7:lcmp            
	//    4    8:ifeq            24
	//    5   11:aload_0         
	//    6   12:invokevirtual   #216 <Method long getExpiresAt()>
	//    7   15:invokestatic    #220 <Method long dl.a()>
	//    8   18:lcmp            
	//    9   19:ifgt            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public boolean isInCategorySet(EnumSet enumset)
	{
		for(enumset = ((EnumSet) (enumset.iterator())); ((Iterator) (enumset)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #226 <Method Iterator EnumSet.iterator()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #231 <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            37
		{
			CardCategory cardcategory = (CardCategory)((Iterator) (enumset)).next();
	//    6   14:aload_1         
	//    7   15:invokeinterface #234 <Method Object Iterator.next()>
	//    8   20:checkcast       #141 <Class CardCategory>
	//    9   23:astore_2        
			if(j.contains(((Object) (cardcategory))))
	//*  10   24:aload_0         
	//*  11   25:getfield        #149 <Field EnumSet j>
	//*  12   28:aload_2         
	//*  13   29:invokevirtual   #237 <Method boolean EnumSet.contains(Object)>
	//*  14   32:ifeq            5
				return true;
	//   15   35:iconst_1        
	//   16   36:ireturn         
		}

		return false;
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	public boolean isRead()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field boolean e>
	//    2    4:ireturn         
	}

	public boolean logClick()
	{
		if(l == null || !a())
			break MISSING_BLOCK_LABEL_45;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field bl l>
	//    2    4:ifnull          45
	//    3    7:aload_0         
	//    4    8:invokevirtual   #244 <Method boolean a()>
	//    5   11:ifeq            45
		l.a(((bo.app.bu) (cc.d(c))));
	//    6   14:aload_0         
	//    7   15:getfield        #93  <Field bl l>
	//    8   18:aload_0         
	//    9   19:getfield        #101 <Field String c>
	//   10   22:invokestatic    #249 <Method cc cc.d(String)>
	//   11   25:invokeinterface #254 <Method boolean bl.a(bo.app.bu)>
	//   12   30:pop             
		return true;
	//   13   31:iconst_1        
	//   14   32:ireturn         
		Exception exception;
		exception;
	//   15   33:astore_1        
		AppboyLogger.w(k, "Failed to log feed card clicked.", ((Throwable) (exception)));
	//   16   34:getstatic       #61  <Field String k>
	//   17   37:ldc2            #256 <String "Failed to log feed card clicked.">
	//   18   40:aload_1         
	//   19   41:invokestatic    #260 <Method int AppboyLogger.w(String, String, Throwable)>
	//   20   44:pop             
		return false;
	//   21   45:iconst_0        
	//   22   46:ireturn         
	}

	public boolean logImpression()
	{
		if(l == null || m == null || !a())
			break MISSING_BLOCK_LABEL_63;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field bl l>
	//    2    4:ifnull          63
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field dc m>
	//    5   11:ifnull          63
	//    6   14:aload_0         
	//    7   15:invokevirtual   #244 <Method boolean a()>
	//    8   18:ifeq            63
		l.a(((bo.app.bu) (cc.c(c))));
	//    9   21:aload_0         
	//   10   22:getfield        #93  <Field bl l>
	//   11   25:aload_0         
	//   12   26:getfield        #101 <Field String c>
	//   13   29:invokestatic    #263 <Method cc cc.c(String)>
	//   14   32:invokeinterface #254 <Method boolean bl.a(bo.app.bu)>
	//   15   37:pop             
		m.a(c);
	//   16   38:aload_0         
	//   17   39:getfield        #95  <Field dc m>
	//   18   42:aload_0         
	//   19   43:getfield        #101 <Field String c>
	//   20   46:invokevirtual   #268 <Method void dc.a(String)>
		return true;
	//   21   49:iconst_1        
	//   22   50:ireturn         
		Exception exception;
		exception;
	//   23   51:astore_1        
		AppboyLogger.w(k, "Failed to log feed card impression.", ((Throwable) (exception)));
	//   24   52:getstatic       #61  <Field String k>
	//   25   55:ldc2            #270 <String "Failed to log feed card impression.">
	//   26   58:aload_1         
	//   27   59:invokestatic    #260 <Method int AppboyLogger.w(String, String, Throwable)>
	//   28   62:pop             
		return false;
	//   29   63:iconst_0        
	//   30   64:ireturn         
	}

	public void setIsRead(boolean flag)
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #109 <Field boolean e>
		setChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #275 <Method void setChanged()>
		notifyObservers();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #278 <Method void notifyObservers()>
		if(flag)
	//*   7   13:iload_1         
	//*   8   14:ifeq            41
			try
			{
				m.b(c);
	//    9   17:aload_0         
	//   10   18:getfield        #95  <Field dc m>
	//   11   21:aload_0         
	//   12   22:getfield        #101 <Field String c>
	//   13   25:invokevirtual   #280 <Method void dc.b(String)>
				return;
	//   14   28:return          
			}
			catch(Exception exception)
	//*  15   29:astore_2        
			{
				AppboyLogger.d(k, "Failed to mark card as read.", ((Throwable) (exception)));
	//   16   30:getstatic       #61  <Field String k>
	//   17   33:ldc2            #282 <String "Failed to mark card as read.">
	//   18   36:aload_2         
	//   19   37:invokestatic    #284 <Method int AppboyLogger.d(String, String, Throwable)>
	//   20   40:pop             
			}
	//   21   41:return          
	}

	public void setViewed(boolean flag)
	{
		d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #107 <Field boolean d>
	//    3    5:return          
	}

	public static final String CATEGORIES = "categories";
	public static final String CREATED = "created";
	public static final long DEFAULT_EXPIRES_AT = -1L;
	public static final String EXPIRES_AT = "expires_at";
	public static final String ID = "id";
	public static final String UPDATED = "updated";
	public static final String VIEWED = "viewed";
	private static final String k = AppboyLogger.getAppboyLogTag(com/appboy/models/cards/Card);
	protected final JSONObject a;
	protected final Map b;
	protected final String c;
	protected boolean d;
	protected boolean e;
	protected final long f;
	protected final long g;
	protected final long h;
	protected boolean i;
	protected final EnumSet j;
	private final bl l;
	private final dc m;

	static 
	{
	//    0    0:ldc1            #2   <Class Card>
	//    1    2:invokestatic    #59  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #61  <Field String k>
	//*   3    8:return          
	}
}
