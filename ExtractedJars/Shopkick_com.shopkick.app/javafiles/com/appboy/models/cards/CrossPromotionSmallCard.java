// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.cards;

import bo.app.*;
import com.appboy.enums.AppStore;
import com.appboy.support.AppboyLogger;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models.cards:
//			Card

public final class CrossPromotionSmallCard extends Card
{

	public CrossPromotionSmallCard(JSONObject jsonobject)
	{
		this(jsonobject, ((bf) (null)), ((dc) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #37  <Method void CrossPromotionSmallCard(JSONObject, bf, dc)>
	//    5    7:return          
	}

	public CrossPromotionSmallCard(JSONObject jsonobject, bf bf, dc dc)
	{
		super(jsonobject, ((bo.app.bl) (bf)), dc);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #42  <Method void Card(JSONObject, bo.app.bl, dc)>
		l = jsonobject.getString("title");
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:ldc1            #44  <String "title">
	//    8   11:invokevirtual   #50  <Method String JSONObject.getString(String)>
	//    9   14:putfield        #52  <Field String l>
		m = jsonobject.getString("subtitle");
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:ldc1            #54  <String "subtitle">
	//   13   21:invokevirtual   #50  <Method String JSONObject.getString(String)>
	//   14   24:putfield        #56  <Field String m>
		n = jsonobject.getString("caption");
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:ldc1            #58  <String "caption">
	//   18   31:invokevirtual   #50  <Method String JSONObject.getString(String)>
	//   19   34:putfield        #60  <Field String n>
		o = jsonobject.getString("image");
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:ldc1            #62  <String "image">
	//   23   41:invokevirtual   #50  <Method String JSONObject.getString(String)>
	//   24   44:putfield        #64  <Field String o>
		try
		{
			p = jsonobject.getDouble("rating");
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:ldc1            #66  <String "rating">
	//   28   51:invokevirtual   #70  <Method double JSONObject.getDouble(String)>
	//   29   54:putfield        #72  <Field double p>
			q = jsonobject.getInt("reviews");
	//   30   57:aload_0         
	//   31   58:aload_1         
	//   32   59:ldc1            #74  <String "reviews">
	//   33   61:invokevirtual   #78  <Method int JSONObject.getInt(String)>
	//   34   64:putfield        #80  <Field int q>
		}
	//*  35   67:goto            80
	//*  36   70:aload_0         
	//*  37   71:dconst_0        
	//*  38   72:putfield        #72  <Field double p>
	//*  39   75:aload_0         
	//*  40   76:iconst_0        
	//*  41   77:putfield        #80  <Field int q>
	//*  42   80:aload_1         
	//*  43   81:ldc1            #82  <String "package">
	//*  44   83:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  45   86:ifeq            99
	//*  46   89:aload_0         
	//*  47   90:aload_1         
	//*  48   91:ldc1            #82  <String "package">
	//*  49   93:invokevirtual   #50  <Method String JSONObject.getString(String)>
	//*  50   96:putfield        #88  <Field String t>
	//*  51   99:aload_1         
	//*  52  100:ldc1            #90  <String "kindle_id">
	//*  53  102:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  54  105:ifeq            118
	//*  55  108:aload_0         
	//*  56  109:aload_1         
	//*  57  110:ldc1            #90  <String "kindle_id">
	//*  58  112:invokevirtual   #50  <Method String JSONObject.getString(String)>
	//*  59  115:putfield        #92  <Field String u>
	//*  60  118:aload_0         
	//*  61  119:aload_1         
	//*  62  120:ldc1            #94  <String "price">
	//*  63  122:invokevirtual   #70  <Method double JSONObject.getDouble(String)>
	//*  64  125:putfield        #96  <Field double r>
	//*  65  128:aload_1         
	//*  66  129:ldc1            #98  <String "display_price">
	//*  67  131:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  68  134:ifeq            147
	//*  69  137:aload_0         
	//*  70  138:aload_1         
	//*  71  139:ldc1            #98  <String "display_price">
	//*  72  141:invokevirtual   #50  <Method String JSONObject.getString(String)>
	//*  73  144:putfield        #100 <Field String w>
	//*  74  147:aload_0         
	//*  75  148:aload_1         
	//*  76  149:ldc1            #102 <String "url">
	//*  77  151:invokevirtual   #50  <Method String JSONObject.getString(String)>
	//*  78  154:putfield        #104 <Field String s>
	//*  79  157:aload_1         
	//*  80  158:ldc1            #106 <String "store">
	//*  81  160:invokestatic    #112 <Method String dt.a(JSONObject, String)>
	//*  82  163:ifnull          215
	//*  83  166:aload_1         
	//*  84  167:ldc1            #106 <String "store">
	//*  85  169:invokestatic    #112 <Method String dt.a(JSONObject, String)>
	//*  86  172:astore_1        
	//*  87  173:aload_1         
	//*  88  174:ifnull          189
	//*  89  177:aload_0         
	//*  90  178:aload_1         
	//*  91  179:invokestatic    #117 <Method String AppStore.serverStringToEnumString(String)>
	//*  92  182:invokestatic    #121 <Method AppStore AppStore.valueOf(String)>
	//*  93  185:putfield        #123 <Field AppStore v>
	//*  94  188:return          
	//*  95  189:aload_0         
	//*  96  190:getstatic       #126 <Field AppStore AppStore.GOOGLE_PLAY_STORE>
	//*  97  193:putfield        #123 <Field AppStore v>
	//*  98  196:return          
	//*  99  197:astore_1        
	//* 100  198:getstatic       #31  <Field String k>
	//* 101  201:ldc1            #128 <String "Caught exception creating cross promotion small card Json.">
	//* 102  203:aload_1         
	//* 103  204:invokestatic    #132 <Method int AppboyLogger.e(String, String, Throwable)>
	//* 104  207:pop             
	//* 105  208:aload_0         
	//* 106  209:getstatic       #126 <Field AppStore AppStore.GOOGLE_PLAY_STORE>
	//* 107  212:putfield        #123 <Field AppStore v>
	//* 108  215:return          
		// Misplaced declaration of an exception variable
		catch(bf bf)
		{
			p = 0.0D;
			q = 0;
		}
		if(jsonobject.has("package"))
			t = jsonobject.getString("package");
		if(jsonobject.has("kindle_id"))
			u = jsonobject.getString("kindle_id");
		r = jsonobject.getDouble("price");
		if(jsonobject.has("display_price"))
			w = jsonobject.getString("display_price");
		s = jsonobject.getString("url");
		if(dt.a(jsonobject, "store") == null)
			break MISSING_BLOCK_LABEL_215;
		jsonobject = ((JSONObject) (dt.a(jsonobject, "store")));
		if(jsonobject != null)
		{
			try
			{
				v = AppStore.valueOf(AppStore.serverStringToEnumString(((String) (jsonobject))));
				return;
			}
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
			{
				AppboyLogger.e(k, "Caught exception creating cross promotion small card Json.", ((Throwable) (jsonobject)));
			}
			break MISSING_BLOCK_LABEL_208;
		}
		v = AppStore.GOOGLE_PLAY_STORE;
		return;
		v = AppStore.GOOGLE_PLAY_STORE;
	//* 109  216:astore_2        
	//* 110  217:goto            70
	}

	public AppStore getAppStore()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field AppStore v>
	//    2    4:areturn         
	}

	public String getCaption()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String n>
	//    2    4:areturn         
	}

	public String getDisplayPrice()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field String w>
	//    2    4:areturn         
	}

	public String getImageUrl()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String o>
	//    2    4:areturn         
	}

	public String getKindleId()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String u>
	//    2    4:areturn         
	}

	public String getPackage()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String t>
	//    2    4:areturn         
	}

	public double getPrice()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field double r>
	//    2    4:dreturn         
	}

	public double getRating()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field double p>
	//    2    4:dreturn         
	}

	public int getReviewCount()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int q>
	//    2    4:ireturn         
	}

	public String getSubtitle()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String m>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String l>
	//    2    4:areturn         
	}

	public String getUrl()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String s>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #151 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("CrossPromotionSmallCard{mId='");
	//    4    8:aload_1         
	//    5    9:ldc1            #155 <String "CrossPromotionSmallCard{mId='">
	//    6   11:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(c);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #162 <Field String c>
	//   11   20:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_1         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", mViewed='");
	//   17   31:aload_1         
	//   18   32:ldc1            #167 <String ", mViewed='">
	//   19   34:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(d);
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #171 <Field boolean d>
	//   24   43:invokevirtual   #174 <Method StringBuilder StringBuilder.append(boolean)>
	//   25   46:pop             
		stringbuilder.append('\'');
	//   26   47:aload_1         
	//   27   48:bipush          39
	//   28   50:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//   29   53:pop             
		stringbuilder.append(", mCreated='");
	//   30   54:aload_1         
	//   31   55:ldc1            #176 <String ", mCreated='">
	//   32   57:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
		stringbuilder.append(f);
	//   34   61:aload_1         
	//   35   62:aload_0         
	//   36   63:getfield        #180 <Field long f>
	//   37   66:invokevirtual   #183 <Method StringBuilder StringBuilder.append(long)>
	//   38   69:pop             
		stringbuilder.append('\'');
	//   39   70:aload_1         
	//   40   71:bipush          39
	//   41   73:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//   42   76:pop             
		stringbuilder.append(", mUpdated='");
	//   43   77:aload_1         
	//   44   78:ldc1            #185 <String ", mUpdated='">
	//   45   80:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   46   83:pop             
		stringbuilder.append(g);
	//   47   84:aload_1         
	//   48   85:aload_0         
	//   49   86:getfield        #188 <Field long g>
	//   50   89:invokevirtual   #183 <Method StringBuilder StringBuilder.append(long)>
	//   51   92:pop             
		stringbuilder.append('\'');
	//   52   93:aload_1         
	//   53   94:bipush          39
	//   54   96:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//   55   99:pop             
		stringbuilder.append(", mTitle='");
	//   56  100:aload_1         
	//   57  101:ldc1            #190 <String ", mTitle='">
	//   58  103:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   59  106:pop             
		stringbuilder.append(l);
	//   60  107:aload_1         
	//   61  108:aload_0         
	//   62  109:getfield        #52  <Field String l>
	//   63  112:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   64  115:pop             
		stringbuilder.append('\'');
	//   65  116:aload_1         
	//   66  117:bipush          39
	//   67  119:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//   68  122:pop             
		stringbuilder.append(", mSubtitle='");
	//   69  123:aload_1         
	//   70  124:ldc1            #192 <String ", mSubtitle='">
	//   71  126:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   72  129:pop             
		stringbuilder.append(m);
	//   73  130:aload_1         
	//   74  131:aload_0         
	//   75  132:getfield        #56  <Field String m>
	//   76  135:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   77  138:pop             
		stringbuilder.append('\'');
	//   78  139:aload_1         
	//   79  140:bipush          39
	//   80  142:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//   81  145:pop             
		stringbuilder.append(", mCaption='");
	//   82  146:aload_1         
	//   83  147:ldc1            #194 <String ", mCaption='">
	//   84  149:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   85  152:pop             
		stringbuilder.append(n);
	//   86  153:aload_1         
	//   87  154:aload_0         
	//   88  155:getfield        #60  <Field String n>
	//   89  158:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   90  161:pop             
		stringbuilder.append('\'');
	//   91  162:aload_1         
	//   92  163:bipush          39
	//   93  165:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//   94  168:pop             
		stringbuilder.append(", mImageUrl='");
	//   95  169:aload_1         
	//   96  170:ldc1            #196 <String ", mImageUrl='">
	//   97  172:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   98  175:pop             
		stringbuilder.append(o);
	//   99  176:aload_1         
	//  100  177:aload_0         
	//  101  178:getfield        #64  <Field String o>
	//  102  181:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  103  184:pop             
		stringbuilder.append('\'');
	//  104  185:aload_1         
	//  105  186:bipush          39
	//  106  188:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//  107  191:pop             
		stringbuilder.append(", mRating=");
	//  108  192:aload_1         
	//  109  193:ldc1            #198 <String ", mRating=">
	//  110  195:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  111  198:pop             
		stringbuilder.append(p);
	//  112  199:aload_1         
	//  113  200:aload_0         
	//  114  201:getfield        #72  <Field double p>
	//  115  204:invokevirtual   #201 <Method StringBuilder StringBuilder.append(double)>
	//  116  207:pop             
		stringbuilder.append(", mReviewCount=");
	//  117  208:aload_1         
	//  118  209:ldc1            #203 <String ", mReviewCount=">
	//  119  211:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  120  214:pop             
		stringbuilder.append(q);
	//  121  215:aload_1         
	//  122  216:aload_0         
	//  123  217:getfield        #80  <Field int q>
	//  124  220:invokevirtual   #206 <Method StringBuilder StringBuilder.append(int)>
	//  125  223:pop             
		stringbuilder.append(", mPrice=");
	//  126  224:aload_1         
	//  127  225:ldc1            #208 <String ", mPrice=">
	//  128  227:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  129  230:pop             
		stringbuilder.append(r);
	//  130  231:aload_1         
	//  131  232:aload_0         
	//  132  233:getfield        #96  <Field double r>
	//  133  236:invokevirtual   #201 <Method StringBuilder StringBuilder.append(double)>
	//  134  239:pop             
		stringbuilder.append(", mPackage=");
	//  135  240:aload_1         
	//  136  241:ldc1            #210 <String ", mPackage=">
	//  137  243:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  138  246:pop             
		stringbuilder.append(t);
	//  139  247:aload_1         
	//  140  248:aload_0         
	//  141  249:getfield        #88  <Field String t>
	//  142  252:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  143  255:pop             
		stringbuilder.append(", mUrl='");
	//  144  256:aload_1         
	//  145  257:ldc1            #212 <String ", mUrl='">
	//  146  259:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  147  262:pop             
		stringbuilder.append(s);
	//  148  263:aload_1         
	//  149  264:aload_0         
	//  150  265:getfield        #104 <Field String s>
	//  151  268:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  152  271:pop             
		stringbuilder.append('\'');
	//  153  272:aload_1         
	//  154  273:bipush          39
	//  155  275:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//  156  278:pop             
		stringbuilder.append(", mAppStore='");
	//  157  279:aload_1         
	//  158  280:ldc1            #214 <String ", mAppStore='">
	//  159  282:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  160  285:pop             
		stringbuilder.append(((Object) (v)));
	//  161  286:aload_1         
	//  162  287:aload_0         
	//  163  288:getfield        #123 <Field AppStore v>
	//  164  291:invokevirtual   #217 <Method StringBuilder StringBuilder.append(Object)>
	//  165  294:pop             
		stringbuilder.append('\'');
	//  166  295:aload_1         
	//  167  296:bipush          39
	//  168  298:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//  169  301:pop             
		stringbuilder.append(", mKindleId='");
	//  170  302:aload_1         
	//  171  303:ldc1            #219 <String ", mKindleId='">
	//  172  305:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  173  308:pop             
		stringbuilder.append(u);
	//  174  309:aload_1         
	//  175  310:aload_0         
	//  176  311:getfield        #92  <Field String u>
	//  177  314:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  178  317:pop             
		stringbuilder.append('\'');
	//  179  318:aload_1         
	//  180  319:bipush          39
	//  181  321:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//  182  324:pop             
		stringbuilder.append(", mDisplayPrice='");
	//  183  325:aload_1         
	//  184  326:ldc1            #221 <String ", mDisplayPrice='">
	//  185  328:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  186  331:pop             
		stringbuilder.append(w);
	//  187  332:aload_1         
	//  188  333:aload_0         
	//  189  334:getfield        #100 <Field String w>
	//  190  337:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  191  340:pop             
		stringbuilder.append('\'');
	//  192  341:aload_1         
	//  193  342:bipush          39
	//  194  344:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//  195  347:pop             
		stringbuilder.append("}");
	//  196  348:aload_1         
	//  197  349:ldc1            #223 <String "}">
	//  198  351:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  199  354:pop             
		return stringbuilder.toString();
	//  200  355:aload_1         
	//  201  356:invokevirtual   #225 <Method String StringBuilder.toString()>
	//  202  359:areturn         
	}

	private static final String k = AppboyLogger.getAppboyLogTag(com/appboy/models/cards/CrossPromotionSmallCard);
	private final String l;
	private final String m;
	private final String n;
	private final String o;
	private double p;
	private int q;
	private final double r;
	private final String s;
	private String t;
	private String u;
	private AppStore v;
	private String w;

	static 
	{
	//    0    0:ldc1            #2   <Class CrossPromotionSmallCard>
	//    1    2:invokestatic    #29  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #31  <Field String k>
	//*   3    8:return          
	}
}
