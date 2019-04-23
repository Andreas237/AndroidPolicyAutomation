// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.cards.*;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.*;

// Referenced classes of package bo.app:
//			dk, bf, dc

public final class bx
{

	public bx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	static Card a(JSONObject jsonobject, bf bf, dc dc)
	{
		String s = jsonobject.getString("type");
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "type">
	//    2    3:invokevirtual   #29  <Method String JSONObject.getString(String)>
	//    3    6:astore_3        
		if("banner_image".equals(((Object) (s))))
	//*   4    7:ldc1            #31  <String "banner_image">
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*   7   13:ifeq            27
			return ((Card) (new BannerImageCard(jsonobject, bf, dc)));
	//    8   16:new             #39  <Class BannerImageCard>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokespecial   #42  <Method void BannerImageCard(JSONObject, bf, dc)>
	//   14   26:areturn         
		if("captioned_image".equals(((Object) (s))))
	//*  15   27:ldc1            #44  <String "captioned_image">
	//*  16   29:aload_3         
	//*  17   30:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  18   33:ifeq            47
			return ((Card) (new CaptionedImageCard(jsonobject, bf, dc)));
	//   19   36:new             #46  <Class CaptionedImageCard>
	//   20   39:dup             
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:aload_2         
	//   24   43:invokespecial   #47  <Method void CaptionedImageCard(JSONObject, bf, dc)>
	//   25   46:areturn         
		if("cross_promotion_small".equals(((Object) (s))))
	//*  26   47:ldc1            #49  <String "cross_promotion_small">
	//*  27   49:aload_3         
	//*  28   50:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  29   53:ifeq            67
			return ((Card) (new CrossPromotionSmallCard(jsonobject, bf, dc)));
	//   30   56:new             #51  <Class CrossPromotionSmallCard>
	//   31   59:dup             
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:aload_2         
	//   35   63:invokespecial   #52  <Method void CrossPromotionSmallCard(JSONObject, bf, dc)>
	//   36   66:areturn         
		if("short_news".equals(((Object) (s))))
	//*  37   67:ldc1            #54  <String "short_news">
	//*  38   69:aload_3         
	//*  39   70:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  40   73:ifeq            87
			return ((Card) (new ShortNewsCard(jsonobject, bf, dc)));
	//   41   76:new             #56  <Class ShortNewsCard>
	//   42   79:dup             
	//   43   80:aload_0         
	//   44   81:aload_1         
	//   45   82:aload_2         
	//   46   83:invokespecial   #57  <Method void ShortNewsCard(JSONObject, bf, dc)>
	//   47   86:areturn         
		if("text_announcement".equals(((Object) (s))))
	//*  48   87:ldc1            #59  <String "text_announcement">
	//*  49   89:aload_3         
	//*  50   90:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  51   93:ifeq            107
		{
			return ((Card) (new TextAnnouncementCard(jsonobject, bf, dc)));
	//   52   96:new             #61  <Class TextAnnouncementCard>
	//   53   99:dup             
	//   54  100:aload_0         
	//   55  101:aload_1         
	//   56  102:aload_2         
	//   57  103:invokespecial   #62  <Method void TextAnnouncementCard(JSONObject, bf, dc)>
	//   58  106:areturn         
		} else
		{
			bf = ((bf) (new StringBuilder()));
	//   59  107:new             #64  <Class StringBuilder>
	//   60  110:dup             
	//   61  111:invokespecial   #65  <Method void StringBuilder()>
	//   62  114:astore_1        
			((StringBuilder) (bf)).append("Failed to construct java object of type ");
	//   63  115:aload_1         
	//   64  116:ldc1            #67  <String "Failed to construct java object of type ">
	//   65  118:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   66  121:pop             
			((StringBuilder) (bf)).append(s);
	//   67  122:aload_1         
	//   68  123:aload_3         
	//   69  124:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   70  127:pop             
			((StringBuilder) (bf)).append(" from JSON [");
	//   71  128:aload_1         
	//   72  129:ldc1            #73  <String " from JSON [">
	//   73  131:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   74  134:pop             
			((StringBuilder) (bf)).append(jsonobject.toString());
	//   75  135:aload_1         
	//   76  136:aload_0         
	//   77  137:invokevirtual   #77  <Method String JSONObject.toString()>
	//   78  140:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   79  143:pop             
			((StringBuilder) (bf)).append("]");
	//   80  144:aload_1         
	//   81  145:ldc1            #79  <String "]">
	//   82  147:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   83  150:pop             
			throw new JSONException(((StringBuilder) (bf)).toString());
	//   84  151:new             #81  <Class JSONException>
	//   85  154:dup             
	//   86  155:aload_1         
	//   87  156:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   88  159:invokespecial   #85  <Method void JSONException(String)>
	//   89  162:athrow          
		}
	}

	public static Object a(String s, Class class1, bf bf, dc dc)
	{
		if(((Object) (class1)).equals(java/lang/String))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #33  <Class String>
	//*   2    3:invokevirtual   #87  <Method boolean Object.equals(Object)>
	//*   3    6:ifeq            15
			return dk.a(((Object) (s)), class1);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokestatic    #92  <Method Object dk.a(Object, Class)>
	//    7   14:areturn         
		if(((Object) (class1)).equals(com/appboy/models/cards/Card))
	//*   8   15:aload_1         
	//*   9   16:ldc1            #94  <Class Card>
	//*  10   18:invokevirtual   #87  <Method boolean Object.equals(Object)>
	//*  11   21:ifeq            42
		{
			return dk.a(((Object) (a(new JSONObject(s), bf, dc))), class1);
	//   12   24:new             #25  <Class JSONObject>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #95  <Method void JSONObject(String)>
	//   16   32:aload_2         
	//   17   33:aload_3         
	//   18   34:invokestatic    #97  <Method Card a(JSONObject, bf, dc)>
	//   19   37:aload_1         
	//   20   38:invokestatic    #92  <Method Object dk.a(Object, Class)>
	//   21   41:areturn         
		} else
		{
			bf = ((bf) (new StringBuilder()));
	//   22   42:new             #64  <Class StringBuilder>
	//   23   45:dup             
	//   24   46:invokespecial   #65  <Method void StringBuilder()>
	//   25   49:astore_2        
			((StringBuilder) (bf)).append("Failed to construct java object ");
	//   26   50:aload_2         
	//   27   51:ldc1            #99  <String "Failed to construct java object ">
	//   28   53:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			((StringBuilder) (bf)).append(s);
	//   30   57:aload_2         
	//   31   58:aload_0         
	//   32   59:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
			((StringBuilder) (bf)).append(", target class ");
	//   34   63:aload_2         
	//   35   64:ldc1            #101 <String ", target class ">
	//   36   66:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
			((StringBuilder) (bf)).append(class1.toString());
	//   38   70:aload_2         
	//   39   71:aload_1         
	//   40   72:invokevirtual   #104 <Method String Class.toString()>
	//   41   75:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
			((StringBuilder) (bf)).append(" isn'tString nor Card. Please update the createObject in ModelFactory to handle extra class type.");
	//   43   79:aload_2         
	//   44   80:ldc1            #106 <String " isn'tString nor Card. Please update the createObject in ModelFactory to handle extra class type.">
	//   45   82:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   46   85:pop             
			throw new JSONException(((StringBuilder) (bf)).toString());
	//   47   86:new             #81  <Class JSONException>
	//   48   89:dup             
	//   49   90:aload_2         
	//   50   91:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   51   94:invokespecial   #85  <Method void JSONException(String)>
	//   52   97:athrow          
		}
	}

	public static List a(JSONArray jsonarray, Class class1, bf bf, dc dc)
	{
		int i;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #111 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #112 <Method void ArrayList()>
	//    3    7:astore          5
		i = 0;
	//    4    9:iconst_0        
	//    5   10:istore          4
_L3:
		if(i >= jsonarray.length()) goto _L2; else goto _L1
	//    6   12:iload           4
	//    7   14:aload_0         
	//    8   15:invokevirtual   #118 <Method int JSONArray.length()>
	//    9   18:icmpge          117
_L1:
		Object obj = a(jsonarray.optString(i), class1, bf, dc);
	//   10   21:aload_0         
	//   11   22:iload           4
	//   12   24:invokevirtual   #122 <Method String JSONArray.optString(int)>
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:aload_3         
	//   16   30:invokestatic    #124 <Method Object a(String, Class, bf, dc)>
	//   17   33:astore          6
		if(obj == null)
			continue; /* Loop/switch isn't completed */
	//   18   35:aload           6
	//   19   37:ifnull          108
		try
		{
			((List) (arraylist)).add(obj);
	//   20   40:aload           5
	//   21   42:aload           6
	//   22   44:invokeinterface #129 <Method boolean List.add(Object)>
	//   23   49:pop             
			continue; /* Loop/switch isn't completed */
	//   24   50:goto            108
		}
		catch(JSONException jsonexception)
	//*  25   53:astore          6
		{
			String s = a;
	//   26   55:getstatic       #16  <Field String a>
	//   27   58:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//   28   60:new             #64  <Class StringBuilder>
	//   29   63:dup             
	//   30   64:invokespecial   #65  <Method void StringBuilder()>
	//   31   67:astore          8
			stringbuilder.append("Unable to cast JSON to [");
	//   32   69:aload           8
	//   33   71:ldc1            #131 <String "Unable to cast JSON to [">
	//   34   73:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   35   76:pop             
			stringbuilder.append(class1.getName());
	//   36   77:aload           8
	//   37   79:aload_1         
	//   38   80:invokevirtual   #134 <Method String Class.getName()>
	//   39   83:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:pop             
			stringbuilder.append("] in array. Ignoring.");
	//   41   87:aload           8
	//   42   89:ldc1            #136 <String "] in array. Ignoring.">
	//   43   91:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   44   94:pop             
			AppboyLogger.d(s, stringbuilder.toString(), ((Throwable) (jsonexception)));
	//   45   95:aload           7
	//   46   97:aload           8
	//   47   99:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   48  102:aload           6
	//   49  104:invokestatic    #140 <Method int AppboyLogger.d(String, String, Throwable)>
	//   50  107:pop             
			i++;
	//   51  108:iload           4
	//   52  110:iconst_1        
	//   53  111:iadd            
	//   54  112:istore          4
		}
		  goto _L3
	//*  55  114:goto            12
_L2:
		return ((List) (arraylist));
	//   56  117:aload           5
	//   57  119:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bx);

	static 
	{
	//    0    0:ldc1            #2   <Class bx>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
