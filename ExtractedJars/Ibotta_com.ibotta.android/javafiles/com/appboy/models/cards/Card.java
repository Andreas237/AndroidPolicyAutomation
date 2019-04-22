// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.cards;

import bo.app.*;
import com.appboy.enums.*;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class Card extends Observable
	implements IPutIntoJson
{

	public Card(JSONObject jsonobject, com.appboy.enums.CardKey.Provider provider)
	{
		this(jsonobject, provider, ((bt) (null)), ((dt) (null)), ((c) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #54  <Method void Card(JSONObject, com.appboy.enums.CardKey$Provider, bt, dt, c)>
	//    7    9:return          
	}

	public Card(JSONObject jsonobject, com.appboy.enums.CardKey.Provider provider, bt bt1, dt dt1, c c1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Observable()>
		e = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #58  <Field boolean e>
		f = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #60  <Field boolean f>
		g = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #62  <Field boolean g>
		h = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #64  <Field boolean h>
		i = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #66  <Field boolean i>
		j = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #68  <Field boolean j>
		n = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #70  <Field boolean n>
		b = jsonobject;
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:putfield        #72  <Field JSONObject b>
		q = bt1;
	//   26   44:aload_0         
	//   27   45:aload_3         
	//   28   46:putfield        #74  <Field bt q>
		r = dt1;
	//   29   49:aload_0         
	//   30   50:aload           4
	//   31   52:putfield        #76  <Field dt r>
		s = c1;
	//   32   55:aload_0         
	//   33   56:aload           5
	//   34   58:putfield        #78  <Field c s>
		c = ek.a(jsonobject.optJSONObject(provider.getKey(CardKey.EXTRAS)), ((Map) (new HashMap())));
	//   35   61:aload_0         
	//   36   62:aload_1         
	//   37   63:aload_2         
	//   38   64:getstatic       #84  <Field CardKey CardKey.EXTRAS>
	//   39   67:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   40   70:invokevirtual   #96  <Method JSONObject JSONObject.optJSONObject(String)>
	//   41   73:new             #98  <Class HashMap>
	//   42   76:dup             
	//   43   77:invokespecial   #99  <Method void HashMap()>
	//   44   80:invokestatic    #104 <Method Map ek.a(JSONObject, Map)>
	//   45   83:putfield        #106 <Field Map c>
		d = jsonobject.getString(provider.getKey(CardKey.ID));
	//   46   86:aload_0         
	//   47   87:aload_1         
	//   48   88:aload_2         
	//   49   89:getstatic       #109 <Field CardKey CardKey.ID>
	//   50   92:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   51   95:invokevirtual   #113 <Method String JSONObject.getString(String)>
	//   52   98:putfield        #115 <Field String d>
		e = jsonobject.optBoolean(provider.getKey(CardKey.VIEWED));
	//   53  101:aload_0         
	//   54  102:aload_1         
	//   55  103:aload_2         
	//   56  104:getstatic       #118 <Field CardKey CardKey.VIEWED>
	//   57  107:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   58  110:invokevirtual   #122 <Method boolean JSONObject.optBoolean(String)>
	//   59  113:putfield        #58  <Field boolean e>
		g = jsonobject.optBoolean(provider.getKey(CardKey.DISMISSED), false);
	//   60  116:aload_0         
	//   61  117:aload_1         
	//   62  118:aload_2         
	//   63  119:getstatic       #125 <Field CardKey CardKey.DISMISSED>
	//   64  122:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   65  125:iconst_0        
	//   66  126:invokevirtual   #128 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   67  129:putfield        #62  <Field boolean g>
		i = jsonobject.optBoolean(provider.getKey(CardKey.PINNED), false);
	//   68  132:aload_0         
	//   69  133:aload_1         
	//   70  134:aload_2         
	//   71  135:getstatic       #131 <Field CardKey CardKey.PINNED>
	//   72  138:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   73  141:iconst_0        
	//   74  142:invokevirtual   #128 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   75  145:putfield        #66  <Field boolean i>
		k = jsonobject.getLong(provider.getKey(CardKey.CREATED));
	//   76  148:aload_0         
	//   77  149:aload_1         
	//   78  150:aload_2         
	//   79  151:getstatic       #134 <Field CardKey CardKey.CREATED>
	//   80  154:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   81  157:invokevirtual   #138 <Method long JSONObject.getLong(String)>
	//   82  160:putfield        #140 <Field long k>
		m = jsonobject.optLong(provider.getKey(CardKey.EXPIRES_AT), -1L);
	//   83  163:aload_0         
	//   84  164:aload_1         
	//   85  165:aload_2         
	//   86  166:getstatic       #143 <Field CardKey CardKey.EXPIRES_AT>
	//   87  169:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   88  172:ldc2w           #144 <Long -1L>
	//   89  175:invokevirtual   #149 <Method long JSONObject.optLong(String, long)>
	//   90  178:putfield        #151 <Field long m>
		n = jsonobject.optBoolean(provider.getKey(CardKey.OPEN_URI_IN_WEBVIEW), false);
	//   91  181:aload_0         
	//   92  182:aload_1         
	//   93  183:aload_2         
	//   94  184:getstatic       #154 <Field CardKey CardKey.OPEN_URI_IN_WEBVIEW>
	//   95  187:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   96  190:iconst_0        
	//   97  191:invokevirtual   #128 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   98  194:putfield        #70  <Field boolean n>
		h = jsonobject.optBoolean(provider.getKey(CardKey.REMOVED), false);
	//   99  197:aload_0         
	//  100  198:aload_1         
	//  101  199:aload_2         
	//  102  200:getstatic       #157 <Field CardKey CardKey.REMOVED>
	//  103  203:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//  104  206:iconst_0        
	//  105  207:invokevirtual   #128 <Method boolean JSONObject.optBoolean(String, boolean)>
	//  106  210:putfield        #64  <Field boolean h>
		bt1 = ((bt) (jsonobject.optJSONArray(provider.getKey(CardKey.CATEGORIES))));
	//  107  213:aload_1         
	//  108  214:aload_2         
	//  109  215:getstatic       #160 <Field CardKey CardKey.CATEGORIES>
	//  110  218:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//  111  221:invokevirtual   #164 <Method JSONArray JSONObject.optJSONArray(String)>
	//  112  224:astore_3        
		if(bt1 != null && ((JSONArray) (bt1)).length() != 0)
	//* 113  225:aload_3         
	//* 114  226:ifnull          295
	//* 115  229:aload_3         
	//* 116  230:invokevirtual   #170 <Method int JSONArray.length()>
	//* 117  233:ifne            239
	//* 118  236:goto            295
		{
			o = EnumSet.noneOf(com/appboy/enums/CardCategory);
	//  119  239:aload_0         
	//  120  240:ldc1            #172 <Class CardCategory>
	//  121  242:invokestatic    #178 <Method EnumSet EnumSet.noneOf(Class)>
	//  122  245:putfield        #180 <Field EnumSet o>
			for(int i1 = 0; i1 < ((JSONArray) (bt1)).length(); i1++)
	//* 123  248:iconst_0        
	//* 124  249:istore          6
	//* 125  251:iload           6
	//* 126  253:aload_3         
	//* 127  254:invokevirtual   #170 <Method int JSONArray.length()>
	//* 128  257:icmpge          305
			{
				dt1 = ((dt) (CardCategory.get(((JSONArray) (bt1)).getString(i1))));
	//  129  260:aload_3         
	//  130  261:iload           6
	//  131  263:invokevirtual   #183 <Method String JSONArray.getString(int)>
	//  132  266:invokestatic    #187 <Method CardCategory CardCategory.get(String)>
	//  133  269:astore          4
				if(dt1 != null)
	//* 134  271:aload           4
	//* 135  273:ifnull          286
					o.add(((Object) (dt1)));
	//  136  276:aload_0         
	//  137  277:getfield        #180 <Field EnumSet o>
	//  138  280:aload           4
	//  139  282:invokevirtual   #191 <Method boolean EnumSet.add(Object)>
	//  140  285:pop             
			}

	//  141  286:iload           6
	//  142  288:iconst_1        
	//  143  289:iadd            
	//  144  290:istore          6
		} else
	//* 145  292:goto            251
		{
			o = EnumSet.of(((Enum) (CardCategory.NO_CATEGORY)));
	//  146  295:aload_0         
	//  147  296:getstatic       #195 <Field CardCategory CardCategory.NO_CATEGORY>
	//  148  299:invokestatic    #199 <Method EnumSet EnumSet.of(Enum)>
	//  149  302:putfield        #180 <Field EnumSet o>
		}
		l = jsonobject.optLong(provider.getKey(CardKey.UPDATED), k);
	//  150  305:aload_0         
	//  151  306:aload_1         
	//  152  307:aload_2         
	//  153  308:getstatic       #202 <Field CardKey CardKey.UPDATED>
	//  154  311:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//  155  314:aload_0         
	//  156  315:getfield        #140 <Field long k>
	//  157  318:invokevirtual   #149 <Method long JSONObject.optLong(String, long)>
	//  158  321:putfield        #204 <Field long l>
		p = jsonobject.optBoolean(provider.getKey(CardKey.DISMISSIBLE), false);
	//  159  324:aload_0         
	//  160  325:aload_1         
	//  161  326:aload_2         
	//  162  327:getstatic       #207 <Field CardKey CardKey.DISMISSIBLE>
	//  163  330:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//  164  333:iconst_0        
	//  165  334:invokevirtual   #128 <Method boolean JSONObject.optBoolean(String, boolean)>
	//  166  337:putfield        #209 <Field boolean p>
		f = jsonobject.optBoolean(provider.getKey(CardKey.READ), e);
	//  167  340:aload_0         
	//  168  341:aload_1         
	//  169  342:aload_2         
	//  170  343:getstatic       #212 <Field CardKey CardKey.READ>
	//  171  346:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//  172  349:aload_0         
	//  173  350:getfield        #58  <Field boolean e>
	//  174  353:invokevirtual   #128 <Method boolean JSONObject.optBoolean(String, boolean)>
	//  175  356:putfield        #60  <Field boolean f>
		j = jsonobject.optBoolean(provider.getKey(CardKey.CLICKED), false);
	//  176  359:aload_0         
	//  177  360:aload_1         
	//  178  361:aload_2         
	//  179  362:getstatic       #215 <Field CardKey CardKey.CLICKED>
	//  180  365:invokevirtual   #90  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//  181  368:iconst_0        
	//  182  369:invokevirtual   #128 <Method boolean JSONObject.optBoolean(String, boolean)>
	//  183  372:putfield        #68  <Field boolean j>
	//  184  375:return          
	}

	boolean a()
	{
		if(StringUtils.isNullOrBlank(d))
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field String d>
	//*   2    4:invokestatic    #222 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   3    7:ifeq            21
		{
			AppboyLogger.e(a, "Card ID cannot be null");
	//    4   10:getstatic       #48  <Field String a>
	//    5   13:ldc1            #224 <String "Card ID cannot be null">
	//    6   15:invokestatic    #227 <Method int AppboyLogger.e(String, String)>
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
	//    1    1:invokevirtual   #233 <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JSONObject b>
	//    2    4:areturn         
	}

	public CardType getCardType()
	{
		return CardType.DEFAULT;
	//    0    0:getstatic       #241 <Field CardType CardType.DEFAULT>
	//    1    3:areturn         
	}

	public EnumSet getCategories()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field EnumSet o>
	//    2    4:areturn         
	}

	public long getCreated()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field long k>
	//    2    4:lreturn         
	}

	public long getExpiresAt()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field long m>
	//    2    4:lreturn         
	}

	public Map getExtras()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Map c>
	//    2    4:areturn         
	}

	public String getId()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String d>
	//    2    4:areturn         
	}

	public boolean getIsDismissible()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field boolean p>
	//    2    4:ireturn         
	}

	public boolean getIsPinned()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean i>
	//    2    4:ireturn         
	}

	public boolean getOpenUriInWebView()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean n>
	//    2    4:ireturn         
	}

	public long getUpdated()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field long l>
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
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean e>
	//    2    4:ireturn         
	}

	public boolean isClicked()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field boolean j>
	//    2    4:ireturn         
	}

	public boolean isControl()
	{
		return getCardType() == CardType.CONTROL;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #263 <Method CardType getCardType()>
	//    2    4:getstatic       #266 <Field CardType CardType.CONTROL>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isDismissed()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean g>
	//    2    4:ireturn         
	}

	public boolean isEqualToCard(Card card)
	{
		return d.equals(((Object) (card.getId()))) && l == card.getUpdated() && q == card.q;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #271 <Method String getId()>
	//    4    8:invokevirtual   #276 <Method boolean String.equals(Object)>
	//    5   11:ifeq            39
	//    6   14:aload_0         
	//    7   15:getfield        #204 <Field long l>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #278 <Method long getUpdated()>
	//   10   22:lcmp            
	//   11   23:ifne            39
	//   12   26:aload_0         
	//   13   27:getfield        #74  <Field bt q>
	//   14   30:aload_1         
	//   15   31:getfield        #74  <Field bt q>
	//   16   34:if_acmpne       39
	//   17   37:iconst_1        
	//   18   38:ireturn         
	//   19   39:iconst_0        
	//   20   40:ireturn         
	}

	public boolean isExpired()
	{
		return getExpiresAt() != -1L && getExpiresAt() <= eb.a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #281 <Method long getExpiresAt()>
	//    2    4:ldc2w           #144 <Long -1L>
	//    3    7:lcmp            
	//    4    8:ifeq            24
	//    5   11:aload_0         
	//    6   12:invokevirtual   #281 <Method long getExpiresAt()>
	//    7   15:invokestatic    #285 <Method long eb.a()>
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
	//*   1    1:invokevirtual   #291 <Method Iterator EnumSet.iterator()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #296 <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            37
		{
			CardCategory cardcategory = (CardCategory)((Iterator) (enumset)).next();
	//    6   14:aload_1         
	//    7   15:invokeinterface #299 <Method Object Iterator.next()>
	//    8   20:checkcast       #172 <Class CardCategory>
	//    9   23:astore_2        
			if(o.contains(((Object) (cardcategory))))
	//*  10   24:aload_0         
	//*  11   25:getfield        #180 <Field EnumSet o>
	//*  12   28:aload_2         
	//*  13   29:invokevirtual   #302 <Method boolean EnumSet.contains(Object)>
	//*  14   32:ifeq            5
				return true;
	//   15   35:iconst_1        
	//   16   36:ireturn         
		}

		return false;
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	public boolean isIndicatorHighlighted()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean f>
	//    2    4:ireturn         
	}

	public boolean isRead()
	{
		return isIndicatorHighlighted();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #308 <Method boolean isIndicatorHighlighted()>
	//    2    4:ireturn         
	}

	public boolean isRemoved()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean h>
	//    2    4:ireturn         
	}

	public boolean logClick()
	{
		j = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #68  <Field boolean j>
		if(q == null || s == null || r == null || !a())
			break MISSING_BLOCK_LABEL_71;
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field bt q>
	//    5    9:ifnull          71
	//    6   12:aload_0         
	//    7   13:getfield        #78  <Field c s>
	//    8   16:ifnull          71
	//    9   19:aload_0         
	//   10   20:getfield        #76  <Field dt r>
	//   11   23:ifnull          71
	//   12   26:aload_0         
	//   13   27:invokevirtual   #315 <Method boolean a()>
	//   14   30:ifeq            71
		q.a(s.e(d));
	//   15   33:aload_0         
	//   16   34:getfield        #74  <Field bt q>
	//   17   37:aload_0         
	//   18   38:getfield        #78  <Field c s>
	//   19   41:aload_0         
	//   20   42:getfield        #115 <Field String d>
	//   21   45:invokeinterface #320 <Method bo.app.cc c.e(String)>
	//   22   50:invokeinterface #325 <Method boolean bt.a(bo.app.cc)>
	//   23   55:pop             
		r.c(d);
	//   24   56:aload_0         
	//   25   57:getfield        #76  <Field dt r>
	//   26   60:aload_0         
	//   27   61:getfield        #115 <Field String d>
	//   28   64:invokeinterface #330 <Method void dt.c(String)>
		return true;
	//   29   69:iconst_1        
	//   30   70:ireturn         
		try
		{
			AppboyLogger.w(a, "Failed to log card clicked.");
	//   31   71:getstatic       #48  <Field String a>
	//   32   74:ldc2            #332 <String "Failed to log card clicked.">
	//   33   77:invokestatic    #335 <Method int AppboyLogger.w(String, String)>
	//   34   80:pop             
		}
	//*  35   81:goto            96
		catch(Exception exception)
	//*  36   84:astore_1        
		{
			AppboyLogger.w(a, "Failed to log card as clicked.", ((Throwable) (exception)));
	//   37   85:getstatic       #48  <Field String a>
	//   38   88:ldc2            #337 <String "Failed to log card as clicked.">
	//   39   91:aload_1         
	//   40   92:invokestatic    #340 <Method int AppboyLogger.w(String, String, Throwable)>
	//   41   95:pop             
		}
		return false;
	//   42   96:iconst_0        
	//   43   97:ireturn         
	}

	public boolean logImpression()
	{
		if(q == null || s == null || r == null || !a())
			break MISSING_BLOCK_LABEL_215;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field bt q>
	//    2    4:ifnull          215
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field c s>
	//    5   11:ifnull          215
	//    6   14:aload_0         
	//    7   15:getfield        #76  <Field dt r>
	//    8   18:ifnull          215
	//    9   21:aload_0         
	//   10   22:invokevirtual   #315 <Method boolean a()>
	//   11   25:ifeq            215
		if(!isControl())
	//*  12   28:aload_0         
	//*  13   29:invokevirtual   #343 <Method boolean isControl()>
	//*  14   32:ifne            99
		{
			String s1 = a;
	//   15   35:getstatic       #48  <Field String a>
	//   16   38:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   17   39:new             #345 <Class StringBuilder>
	//   18   42:dup             
	//   19   43:invokespecial   #346 <Method void StringBuilder()>
	//   20   46:astore_2        
			stringbuilder.append("Logging impression event for card with id: ");
	//   21   47:aload_2         
	//   22   48:ldc2            #348 <String "Logging impression event for card with id: ">
	//   23   51:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
			stringbuilder.append(d);
	//   25   55:aload_2         
	//   26   56:aload_0         
	//   27   57:getfield        #115 <Field String d>
	//   28   60:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
			AppboyLogger.v(s1, stringbuilder.toString());
	//   30   64:aload_1         
	//   31   65:aload_2         
	//   32   66:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   33   69:invokestatic    #358 <Method int AppboyLogger.v(String, String)>
	//   34   72:pop             
			q.a(s.a(d));
	//   35   73:aload_0         
	//   36   74:getfield        #74  <Field bt q>
	//   37   77:aload_0         
	//   38   78:getfield        #78  <Field c s>
	//   39   81:aload_0         
	//   40   82:getfield        #115 <Field String d>
	//   41   85:invokeinterface #360 <Method bo.app.cc c.a(String)>
	//   42   90:invokeinterface #325 <Method boolean bt.a(bo.app.cc)>
	//   43   95:pop             
			break MISSING_BLOCK_LABEL_160;
	//   44   96:goto            160
		}
		String s2 = a;
	//   45   99:getstatic       #48  <Field String a>
	//   46  102:astore_1        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   47  103:new             #345 <Class StringBuilder>
	//   48  106:dup             
	//   49  107:invokespecial   #346 <Method void StringBuilder()>
	//   50  110:astore_2        
		stringbuilder1.append("Logging control impression event for card with id: ");
	//   51  111:aload_2         
	//   52  112:ldc2            #362 <String "Logging control impression event for card with id: ">
	//   53  115:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   54  118:pop             
		stringbuilder1.append(d);
	//   55  119:aload_2         
	//   56  120:aload_0         
	//   57  121:getfield        #115 <Field String d>
	//   58  124:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   59  127:pop             
		AppboyLogger.v(s2, stringbuilder1.toString());
	//   60  128:aload_1         
	//   61  129:aload_2         
	//   62  130:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   63  133:invokestatic    #358 <Method int AppboyLogger.v(String, String)>
	//   64  136:pop             
		q.a(s.d(d));
	//   65  137:aload_0         
	//   66  138:getfield        #74  <Field bt q>
	//   67  141:aload_0         
	//   68  142:getfield        #78  <Field c s>
	//   69  145:aload_0         
	//   70  146:getfield        #115 <Field String d>
	//   71  149:invokeinterface #364 <Method bo.app.cc c.d(String)>
	//   72  154:invokeinterface #325 <Method boolean bt.a(bo.app.cc)>
	//   73  159:pop             
		r.b(d);
	//   74  160:aload_0         
	//   75  161:getfield        #76  <Field dt r>
	//   76  164:aload_0         
	//   77  165:getfield        #115 <Field String d>
	//   78  168:invokeinterface #366 <Method void dt.b(String)>
		return true;
	//   79  173:iconst_1        
	//   80  174:ireturn         
		Exception exception;
		exception;
	//   81  175:astore_1        
		String s3 = a;
	//   82  176:getstatic       #48  <Field String a>
	//   83  179:astore_2        
		StringBuilder stringbuilder2 = new StringBuilder();
	//   84  180:new             #345 <Class StringBuilder>
	//   85  183:dup             
	//   86  184:invokespecial   #346 <Method void StringBuilder()>
	//   87  187:astore_3        
		stringbuilder2.append("Failed to log card impression for card id: ");
	//   88  188:aload_3         
	//   89  189:ldc2            #368 <String "Failed to log card impression for card id: ">
	//   90  192:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   91  195:pop             
		stringbuilder2.append(d);
	//   92  196:aload_3         
	//   93  197:aload_0         
	//   94  198:getfield        #115 <Field String d>
	//   95  201:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   96  204:pop             
		AppboyLogger.w(s3, stringbuilder2.toString(), ((Throwable) (exception)));
	//   97  205:aload_2         
	//   98  206:aload_3         
	//   99  207:invokevirtual   #355 <Method String StringBuilder.toString()>
	//  100  210:aload_1         
	//  101  211:invokestatic    #340 <Method int AppboyLogger.w(String, String, Throwable)>
	//  102  214:pop             
		return false;
	//  103  215:iconst_0        
	//  104  216:ireturn         
	}

	public void setIndicatorHighlighted(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field boolean f>
		setChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #373 <Method void setChanged()>
		notifyObservers();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #376 <Method void notifyObservers()>
		if(flag)
	//*   7   13:iload_1         
	//*   8   14:ifeq            49
		{
			dt dt1 = r;
	//    9   17:aload_0         
	//   10   18:getfield        #76  <Field dt r>
	//   11   21:astore_2        
			if(dt1 != null)
	//*  12   22:aload_2         
	//*  13   23:ifnull          49
				try
				{
					dt1.a(d);
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:getfield        #115 <Field String d>
	//   17   31:invokeinterface #378 <Method void dt.a(String)>
					return;
	//   18   36:return          
				}
				catch(Exception exception)
	//*  19   37:astore_2        
				{
					AppboyLogger.d(a, "Failed to mark card indicator as highlighted.", ((Throwable) (exception)));
	//   20   38:getstatic       #48  <Field String a>
	//   21   41:ldc2            #380 <String "Failed to mark card indicator as highlighted.">
	//   22   44:aload_2         
	//   23   45:invokestatic    #382 <Method int AppboyLogger.d(String, String, Throwable)>
	//   24   48:pop             
				}
		}
	//   25   49:return          
	}

	public void setIsDismissed(boolean flag)
	{
		if(g && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean g>
	//*   2    4:ifeq            22
	//*   3    7:iload_1         
	//*   4    8:ifeq            22
		{
			AppboyLogger.w(a, "Cannot dismiss a card more than once. Doing nothing.");
	//    5   11:getstatic       #48  <Field String a>
	//    6   14:ldc2            #385 <String "Cannot dismiss a card more than once. Doing nothing.">
	//    7   17:invokestatic    #335 <Method int AppboyLogger.w(String, String)>
	//    8   20:pop             
			return;
	//    9   21:return          
		}
		g = flag;
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:putfield        #62  <Field boolean g>
		dt dt1 = r;
	//   13   27:aload_0         
	//   14   28:getfield        #76  <Field dt r>
	//   15   31:astore_2        
		if(dt1 != null)
	//*  16   32:aload_2         
	//*  17   33:ifnull          46
			dt1.d(d);
	//   18   36:aload_2         
	//   19   37:aload_0         
	//   20   38:getfield        #115 <Field String d>
	//   21   41:invokeinterface #387 <Method void dt.d(String)>
		if(flag)
	//*  22   46:iload_1         
	//*  23   47:ifeq            107
			try
			{
				if(q != null && s != null && a())
	//*  24   50:aload_0         
	//*  25   51:getfield        #74  <Field bt q>
	//*  26   54:ifnull          107
	//*  27   57:aload_0         
	//*  28   58:getfield        #78  <Field c s>
	//*  29   61:ifnull          107
	//*  30   64:aload_0         
	//*  31   65:invokevirtual   #315 <Method boolean a()>
	//*  32   68:ifeq            107
				{
					q.a(s.c(d));
	//   33   71:aload_0         
	//   34   72:getfield        #74  <Field bt q>
	//   35   75:aload_0         
	//   36   76:getfield        #78  <Field c s>
	//   37   79:aload_0         
	//   38   80:getfield        #115 <Field String d>
	//   39   83:invokeinterface #389 <Method bo.app.cc c.c(String)>
	//   40   88:invokeinterface #325 <Method boolean bt.a(bo.app.cc)>
	//   41   93:pop             
					return;
	//   42   94:return          
				}
			}
			catch(Exception exception)
	//*  43   95:astore_2        
			{
				AppboyLogger.w(a, "Failed to log card dismissed.", ((Throwable) (exception)));
	//   44   96:getstatic       #48  <Field String a>
	//   45   99:ldc2            #391 <String "Failed to log card dismissed.">
	//   46  102:aload_2         
	//   47  103:invokestatic    #340 <Method int AppboyLogger.w(String, String, Throwable)>
	//   48  106:pop             
			}
	//   49  107:return          
	}

	public void setIsPinned(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field boolean i>
	//    3    5:return          
	}

	public void setIsRead(boolean flag)
	{
		setIndicatorHighlighted(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #395 <Method void setIndicatorHighlighted(boolean)>
	//    3    5:return          
	}

	public void setViewed(boolean flag)
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean e>
		dt dt1 = r;
	//    3    5:aload_0         
	//    4    6:getfield        #76  <Field dt r>
	//    5    9:astore_2        
		if(dt1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          24
			dt1.b(d);
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #115 <Field String d>
	//   11   19:invokeinterface #366 <Method void dt.b(String)>
	//   12   24:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #345 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #346 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("mId='");
	//    4    8:aload_1         
	//    5    9:ldc2            #398 <String "mId='">
	//    6   12:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #115 <Field String d>
	//   11   21:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append('\'');
	//   13   25:aload_1         
	//   14   26:bipush          39
	//   15   28:invokevirtual   #401 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		stringbuilder.append(", mViewed='");
	//   17   32:aload_1         
	//   18   33:ldc2            #403 <String ", mViewed='">
	//   19   36:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		stringbuilder.append(e);
	//   21   40:aload_1         
	//   22   41:aload_0         
	//   23   42:getfield        #58  <Field boolean e>
	//   24   45:invokevirtual   #406 <Method StringBuilder StringBuilder.append(boolean)>
	//   25   48:pop             
		stringbuilder.append('\'');
	//   26   49:aload_1         
	//   27   50:bipush          39
	//   28   52:invokevirtual   #401 <Method StringBuilder StringBuilder.append(char)>
	//   29   55:pop             
		stringbuilder.append(", mCreated='");
	//   30   56:aload_1         
	//   31   57:ldc2            #408 <String ", mCreated='">
	//   32   60:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
		stringbuilder.append(k);
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:getfield        #140 <Field long k>
	//   37   69:invokevirtual   #411 <Method StringBuilder StringBuilder.append(long)>
	//   38   72:pop             
		stringbuilder.append('\'');
	//   39   73:aload_1         
	//   40   74:bipush          39
	//   41   76:invokevirtual   #401 <Method StringBuilder StringBuilder.append(char)>
	//   42   79:pop             
		stringbuilder.append(", mUpdated='");
	//   43   80:aload_1         
	//   44   81:ldc2            #413 <String ", mUpdated='">
	//   45   84:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   46   87:pop             
		stringbuilder.append(l);
	//   47   88:aload_1         
	//   48   89:aload_0         
	//   49   90:getfield        #204 <Field long l>
	//   50   93:invokevirtual   #411 <Method StringBuilder StringBuilder.append(long)>
	//   51   96:pop             
		stringbuilder.append('\'');
	//   52   97:aload_1         
	//   53   98:bipush          39
	//   54  100:invokevirtual   #401 <Method StringBuilder StringBuilder.append(char)>
	//   55  103:pop             
		stringbuilder.append(", mIsClicked='");
	//   56  104:aload_1         
	//   57  105:ldc2            #415 <String ", mIsClicked='">
	//   58  108:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   59  111:pop             
		stringbuilder.append(j);
	//   60  112:aload_1         
	//   61  113:aload_0         
	//   62  114:getfield        #68  <Field boolean j>
	//   63  117:invokevirtual   #406 <Method StringBuilder StringBuilder.append(boolean)>
	//   64  120:pop             
		stringbuilder.append('\'');
	//   65  121:aload_1         
	//   66  122:bipush          39
	//   67  124:invokevirtual   #401 <Method StringBuilder StringBuilder.append(char)>
	//   68  127:pop             
		return stringbuilder.toString();
	//   69  128:aload_1         
	//   70  129:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   71  132:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/models/cards/Card);
	private final JSONObject b;
	private final Map c;
	private final String d;
	private boolean e;
	private boolean f;
	private boolean g;
	private boolean h;
	private boolean i;
	private boolean j;
	private final long k;
	private final long l;
	private final long m;
	private boolean n;
	private final EnumSet o;
	private boolean p;
	private final bt q;
	private final dt r;
	private final c s;

	static 
	{
	//    0    0:ldc1            #2   <Class Card>
	//    1    2:invokestatic    #46  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #48  <Field String a>
	//*   3    8:return          
	}
}
