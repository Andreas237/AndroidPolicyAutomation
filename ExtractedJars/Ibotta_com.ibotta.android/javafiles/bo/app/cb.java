// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.enums.CardType;
import com.appboy.models.cards.*;
import com.appboy.support.AppboyLogger;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.ArrayList;
import java.util.List;
import org.json.*;

// Referenced classes of package bo.app:
//			bo, dt, c

public final class cb
{

	public cb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	private static Card a(String s, com.appboy.enums.CardKey.Provider provider, bo bo, dt dt, c c)
	{
		return a(JSONObjectInstrumentation.init(s), provider, bo, dt, c);
	//    0    0:aload_0         
	//    1    1:invokestatic    #30  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #33  <Method Card a(JSONObject, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//    7   12:areturn         
	}

	static Card a(JSONObject jsonobject, com.appboy.enums.CardKey.Provider provider, bo bo, dt dt, c c)
	{
		CardType cardtype = provider.getCardTypeFromJson(jsonobject);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #40  <Method CardType com.appboy.enums.CardKey$Provider.getCardTypeFromJson(JSONObject)>
	//    3    5:astore          5
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[CardType.values().length];
			//    0    0:invokestatic    #18  <Method CardType[] CardType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[CardType.BANNER.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field CardType CardType.BANNER>
			//    6   15:invokevirtual   #28  <Method int CardType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field CardType CardType.CAPTIONED_IMAGE>
			//*  11   26:invokevirtual   #28  <Method int CardType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field CardType CardType.SHORT_NEWS>
			//*  16   37:invokevirtual   #28  <Method int CardType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] a>
			//*  20   45:getstatic       #37  <Field CardType CardType.TEXT_ANNOUNCEMENT>
			//*  21   48:invokevirtual   #28  <Method int CardType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] a>
			//*  25   56:getstatic       #40  <Field CardType CardType.CONTROL>
			//*  26   59:invokevirtual   #28  <Method int CardType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					a[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					a[CardType.SHORT_NEWS.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					a[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					a[CardType.CONTROL.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1.a[cardtype.ordinal()])
	//*   4    7:getstatic       #43  <Field int[] cb$1.a>
	//*   5   10:aload           5
	//*   6   12:invokevirtual   #49  <Method int CardType.ordinal()>
	//*   7   15:iaload          
		{
	//*   8   16:tableswitch     1 5: default 52
	//	               1 138
	//	               2 124
	//	               3 110
	//	               4 96
	//	               5 82
		default:
			provider = ((com.appboy.enums.CardKey.Provider) (new StringBuilder()));
	//    9   52:new             #51  <Class StringBuilder>
	//   10   55:dup             
	//   11   56:invokespecial   #52  <Method void StringBuilder()>
	//   12   59:astore_1        
			((StringBuilder) (provider)).append("Failed to construct java object from JSON [");
	//   13   60:aload_1         
	//   14   61:ldc1            #54  <String "Failed to construct java object from JSON [">
	//   15   63:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   16   66:pop             
			if(!(jsonobject instanceof JSONObject))
	//*  17   67:aload_0         
	//*  18   68:instanceof      #60  <Class JSONObject>
	//*  19   71:ifne            152
				jsonobject = ((JSONObject) (jsonobject.toString()));
	//   20   74:aload_0         
	//   21   75:invokevirtual   #64  <Method String JSONObject.toString()>
	//   22   78:astore_0        
			else
	//*  23   79:goto            160
	//*  24   82:new             #66  <Class ControlCard>
	//*  25   85:dup             
	//*  26   86:aload_0         
	//*  27   87:aload_1         
	//*  28   88:aload_2         
	//*  29   89:aload_3         
	//*  30   90:aload           4
	//*  31   92:invokespecial   #69  <Method void ControlCard(JSONObject, com.appboy.enums.CardKey$Provider, bt, dt, c)>
	//*  32   95:areturn         
	//*  33   96:new             #71  <Class TextAnnouncementCard>
	//*  34   99:dup             
	//*  35  100:aload_0         
	//*  36  101:aload_1         
	//*  37  102:aload_2         
	//*  38  103:aload_3         
	//*  39  104:aload           4
	//*  40  106:invokespecial   #74  <Method void TextAnnouncementCard(JSONObject, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//*  41  109:areturn         
	//*  42  110:new             #76  <Class ShortNewsCard>
	//*  43  113:dup             
	//*  44  114:aload_0         
	//*  45  115:aload_1         
	//*  46  116:aload_2         
	//*  47  117:aload_3         
	//*  48  118:aload           4
	//*  49  120:invokespecial   #77  <Method void ShortNewsCard(JSONObject, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//*  50  123:areturn         
	//*  51  124:new             #79  <Class CaptionedImageCard>
	//*  52  127:dup             
	//*  53  128:aload_0         
	//*  54  129:aload_1         
	//*  55  130:aload_2         
	//*  56  131:aload_3         
	//*  57  132:aload           4
	//*  58  134:invokespecial   #80  <Method void CaptionedImageCard(JSONObject, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//*  59  137:areturn         
	//*  60  138:new             #82  <Class BannerImageCard>
	//*  61  141:dup             
	//*  62  142:aload_0         
	//*  63  143:aload_1         
	//*  64  144:aload_2         
	//*  65  145:aload_3         
	//*  66  146:aload           4
	//*  67  148:invokespecial   #83  <Method void BannerImageCard(JSONObject, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//*  68  151:areturn         
				jsonobject = ((JSONObject) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   69  152:aload_0         
	//   70  153:checkcast       #60  <Class JSONObject>
	//   71  156:invokestatic    #86  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   72  159:astore_0        
			break;

		case 5: // '\005'
			return ((Card) (new ControlCard(jsonobject, provider, ((bt) (bo)), dt, c)));

		case 4: // '\004'
			return ((Card) (new TextAnnouncementCard(jsonobject, provider, bo, dt, c)));

		case 3: // '\003'
			return ((Card) (new ShortNewsCard(jsonobject, provider, bo, dt, c)));

		case 2: // '\002'
			return ((Card) (new CaptionedImageCard(jsonobject, provider, bo, dt, c)));

		case 1: // '\001'
			return ((Card) (new BannerImageCard(jsonobject, provider, bo, dt, c)));
		}
		((StringBuilder) (provider)).append(((String) (jsonobject)));
	//   73  160:aload_1         
	//   74  161:aload_0         
	//   75  162:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   76  165:pop             
		((StringBuilder) (provider)).append("]");
	//   77  166:aload_1         
	//   78  167:ldc1            #88  <String "]">
	//   79  169:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   80  172:pop             
		throw new JSONException(((StringBuilder) (provider)).toString());
	//   81  173:new             #90  <Class JSONException>
	//   82  176:dup             
	//   83  177:aload_1         
	//   84  178:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   85  181:invokespecial   #94  <Method void JSONException(String)>
	//   86  184:athrow          
	}

	public static List a(JSONArray jsonarray, com.appboy.enums.CardKey.Provider provider, bo bo, dt dt, c c)
	{
		int i;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #100 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #101 <Method void ArrayList()>
	//    3    7:astore          7
		i = 0;
	//    4    9:iconst_0        
	//    5   10:istore          5
_L3:
		if(i >= jsonarray.length()) goto _L2; else goto _L1
	//    6   12:iload           5
	//    7   14:aload_0         
	//    8   15:invokevirtual   #106 <Method int JSONArray.length()>
	//    9   18:icmpge          150
_L1:
		Card card = a(jsonarray.optString(i), provider, bo, dt, c);
	//   10   21:aload_0         
	//   11   22:iload           5
	//   12   24:invokevirtual   #110 <Method String JSONArray.optString(int)>
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:aload_3         
	//   16   30:aload           4
	//   17   32:invokestatic    #112 <Method Card a(String, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//   18   35:astore          6
		if(card == null)
			continue; /* Loop/switch isn't completed */
	//   19   37:aload           6
	//   20   39:ifnull          141
		try
		{
			((List) (arraylist)).add(((Object) (card)));
	//   21   42:aload           7
	//   22   44:aload           6
	//   23   46:invokeinterface #118 <Method boolean List.add(Object)>
	//   24   51:pop             
			continue; /* Loop/switch isn't completed */
	//   25   52:goto            141
		}
		catch(Exception exception)
	//*  26   55:astore          8
		{
			String s1 = a;
	//   27   57:getstatic       #19  <Field String a>
	//   28   60:astore          9
			StringBuilder stringbuilder = new StringBuilder();
	//   29   62:new             #51  <Class StringBuilder>
	//   30   65:dup             
	//   31   66:invokespecial   #52  <Method void StringBuilder()>
	//   32   69:astore          10
			stringbuilder.append("Unable to create Card JSON in array. Ignoring. Was on element index: ");
	//   33   71:aload           10
	//   34   73:ldc1            #120 <String "Unable to create Card JSON in array. Ignoring. Was on element index: ">
	//   35   75:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   36   78:pop             
			stringbuilder.append(i);
	//   37   79:aload           10
	//   38   81:iload           5
	//   39   83:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   40   86:pop             
			stringbuilder.append(" of json array: ");
	//   41   87:aload           10
	//   42   89:ldc1            #125 <String " of json array: ">
	//   43   91:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   44   94:pop             
			String s;
			if(!(jsonarray instanceof JSONArray))
	//*  45   95:aload_0         
	//*  46   96:instanceof      #103 <Class JSONArray>
	//*  47   99:ifne            111
				s = jsonarray.toString();
	//   48  102:aload_0         
	//   49  103:invokevirtual   #126 <Method String JSONArray.toString()>
	//   50  106:astore          6
			else
	//*  51  108:goto            120
				s = JSONArrayInstrumentation.toString((JSONArray)jsonarray);
	//   52  111:aload_0         
	//   53  112:checkcast       #103 <Class JSONArray>
	//   54  115:invokestatic    #131 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//   55  118:astore          6
			stringbuilder.append(s);
	//   56  120:aload           10
	//   57  122:aload           6
	//   58  124:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   59  127:pop             
			AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   60  128:aload           9
	//   61  130:aload           10
	//   62  132:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   63  135:aload           8
	//   64  137:invokestatic    #135 <Method int AppboyLogger.e(String, String, Throwable)>
	//   65  140:pop             
			i++;
	//   66  141:iload           5
	//   67  143:iconst_1        
	//   68  144:iadd            
	//   69  145:istore          5
		}
		  goto _L3
	//*  70  147:goto            12
_L2:
		return ((List) (arraylist));
	//   71  150:aload           7
	//   72  152:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/cb);

	static 
	{
	//    0    0:ldc1            #2   <Class cb>
	//    1    2:invokestatic    #17  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #19  <Field String a>
	//*   3    8:return          
	}
}
