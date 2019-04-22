// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.cards;

import bo.app.*;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models.cards:
//			Card

public final class ShortNewsCard extends Card
{

	public ShortNewsCard(JSONObject jsonobject, com.appboy.enums.CardKey.Provider provider)
	{
		this(jsonobject, provider, ((bo) (null)), ((dt) (null)), ((c) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #15  <Method void ShortNewsCard(JSONObject, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//    7    9:return          
	}

	public ShortNewsCard(JSONObject jsonobject, com.appboy.enums.CardKey.Provider provider, bo bo, dt dt, c c1)
	{
		super(jsonobject, provider, ((bo.app.bt) (bo)), dt, c1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #19  <Method void Card(JSONObject, com.appboy.enums.CardKey$Provider, bo.app.bt, dt, c)>
		a = jsonobject.getString(provider.getKey(CardKey.SHORT_NEWS_DESCRIPTION));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:getstatic       #25  <Field CardKey CardKey.SHORT_NEWS_DESCRIPTION>
	//   11   17:invokevirtual   #31  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   12   20:invokevirtual   #37  <Method String JSONObject.getString(String)>
	//   13   23:putfield        #39  <Field String a>
		b = jsonobject.getString(provider.getKey(CardKey.SHORT_NEWS_IMAGE));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:getstatic       #42  <Field CardKey CardKey.SHORT_NEWS_IMAGE>
	//   18   32:invokevirtual   #31  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   19   35:invokevirtual   #37  <Method String JSONObject.getString(String)>
	//   20   38:putfield        #44  <Field String b>
		c = ek.a(jsonobject, provider.getKey(CardKey.SHORT_NEWS_TITLE));
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:getstatic       #47  <Field CardKey CardKey.SHORT_NEWS_TITLE>
	//   25   47:invokevirtual   #31  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   26   50:invokestatic    #52  <Method String ek.a(JSONObject, String)>
	//   27   53:putfield        #54  <Field String c>
		d = ek.a(jsonobject, provider.getKey(CardKey.SHORT_NEWS_URL));
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:aload_2         
	//   31   59:getstatic       #57  <Field CardKey CardKey.SHORT_NEWS_URL>
	//   32   62:invokevirtual   #31  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   33   65:invokestatic    #52  <Method String ek.a(JSONObject, String)>
	//   34   68:putfield        #59  <Field String d>
		e = ek.a(jsonobject, provider.getKey(CardKey.SHORT_NEWS_DOMAIN));
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:getstatic       #62  <Field CardKey CardKey.SHORT_NEWS_DOMAIN>
	//   39   77:invokevirtual   #31  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   40   80:invokestatic    #52  <Method String ek.a(JSONObject, String)>
	//   41   83:putfield        #64  <Field String e>
	//   42   86:return          
	}

	public CardType getCardType()
	{
		return CardType.SHORT_NEWS;
	//    0    0:getstatic       #72  <Field CardType CardType.SHORT_NEWS>
	//    1    3:areturn         
	}

	public String getDescription()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String a>
	//    2    4:areturn         
	}

	public String getDomain()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String e>
	//    2    4:areturn         
	}

	public String getImageUrl()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String b>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String c>
	//    2    4:areturn         
	}

	public String getUrl()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String d>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ShortNewsCard{");
	//    4    8:aload_1         
	//    5    9:ldc1            #86  <String "ShortNewsCard{">
	//    6   11:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(super.toString());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokespecial   #92  <Method String Card.toString()>
	//   11   20:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", mDescription='");
	//   13   24:aload_1         
	//   14   25:ldc1            #94  <String ", mDescription='">
	//   15   27:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(a);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #39  <Field String a>
	//   20   36:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append('\'');
	//   22   40:aload_1         
	//   23   41:bipush          39
	//   24   43:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//   25   46:pop             
		stringbuilder.append(", mImageUrl='");
	//   26   47:aload_1         
	//   27   48:ldc1            #99  <String ", mImageUrl='">
	//   28   50:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(b);
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #44  <Field String b>
	//   33   59:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append('\'');
	//   35   63:aload_1         
	//   36   64:bipush          39
	//   37   66:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
		stringbuilder.append(", mTitle='");
	//   39   70:aload_1         
	//   40   71:ldc1            #101 <String ", mTitle='">
	//   41   73:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   42   76:pop             
		stringbuilder.append(c);
	//   43   77:aload_1         
	//   44   78:aload_0         
	//   45   79:getfield        #54  <Field String c>
	//   46   82:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   47   85:pop             
		stringbuilder.append('\'');
	//   48   86:aload_1         
	//   49   87:bipush          39
	//   50   89:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//   51   92:pop             
		stringbuilder.append(", mUrl='");
	//   52   93:aload_1         
	//   53   94:ldc1            #103 <String ", mUrl='">
	//   54   96:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   55   99:pop             
		stringbuilder.append(d);
	//   56  100:aload_1         
	//   57  101:aload_0         
	//   58  102:getfield        #59  <Field String d>
	//   59  105:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   60  108:pop             
		stringbuilder.append('\'');
	//   61  109:aload_1         
	//   62  110:bipush          39
	//   63  112:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//   64  115:pop             
		stringbuilder.append(", mDomain='");
	//   65  116:aload_1         
	//   66  117:ldc1            #105 <String ", mDomain='">
	//   67  119:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   68  122:pop             
		stringbuilder.append(e);
	//   69  123:aload_1         
	//   70  124:aload_0         
	//   71  125:getfield        #64  <Field String e>
	//   72  128:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   73  131:pop             
		stringbuilder.append('\'');
	//   74  132:aload_1         
	//   75  133:bipush          39
	//   76  135:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//   77  138:pop             
		stringbuilder.append("}");
	//   78  139:aload_1         
	//   79  140:ldc1            #107 <String "}">
	//   80  142:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   81  145:pop             
		return stringbuilder.toString();
	//   82  146:aload_1         
	//   83  147:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   84  150:areturn         
	}

	private final String a;
	private final String b;
	private final String c;
	private final String d;
	private final String e;
}
