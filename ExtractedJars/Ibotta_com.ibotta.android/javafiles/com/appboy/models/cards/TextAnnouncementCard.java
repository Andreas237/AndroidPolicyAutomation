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

public final class TextAnnouncementCard extends Card
{

	public TextAnnouncementCard(JSONObject jsonobject, com.appboy.enums.CardKey.Provider provider)
	{
		this(jsonobject, provider, ((bo) (null)), ((dt) (null)), ((c) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #14  <Method void TextAnnouncementCard(JSONObject, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//    7    9:return          
	}

	public TextAnnouncementCard(JSONObject jsonobject, com.appboy.enums.CardKey.Provider provider, bo bo, dt dt, c c1)
	{
		super(jsonobject, provider, ((bo.app.bt) (bo)), dt, c1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #18  <Method void Card(JSONObject, com.appboy.enums.CardKey$Provider, bo.app.bt, dt, c)>
		b = ek.a(jsonobject, provider.getKey(CardKey.TEXT_ANNOUNCEMENT_TITLE));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:getstatic       #24  <Field CardKey CardKey.TEXT_ANNOUNCEMENT_TITLE>
	//   11   17:invokevirtual   #30  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   12   20:invokestatic    #35  <Method String ek.a(JSONObject, String)>
	//   13   23:putfield        #37  <Field String b>
		a = jsonobject.getString(provider.getKey(CardKey.TEXT_ANNOUNCEMENT_DESCRIPTION));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:getstatic       #40  <Field CardKey CardKey.TEXT_ANNOUNCEMENT_DESCRIPTION>
	//   18   32:invokevirtual   #30  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   19   35:invokevirtual   #46  <Method String JSONObject.getString(String)>
	//   20   38:putfield        #48  <Field String a>
		c = ek.a(jsonobject, provider.getKey(CardKey.TEXT_ANNOUNCEMENT_URL));
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:getstatic       #51  <Field CardKey CardKey.TEXT_ANNOUNCEMENT_URL>
	//   25   47:invokevirtual   #30  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   26   50:invokestatic    #35  <Method String ek.a(JSONObject, String)>
	//   27   53:putfield        #53  <Field String c>
		d = ek.a(jsonobject, provider.getKey(CardKey.TEXT_ANNOUNCEMENT_DOMAIN));
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:aload_2         
	//   31   59:getstatic       #56  <Field CardKey CardKey.TEXT_ANNOUNCEMENT_DOMAIN>
	//   32   62:invokevirtual   #30  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   33   65:invokestatic    #35  <Method String ek.a(JSONObject, String)>
	//   34   68:putfield        #58  <Field String d>
	//   35   71:return          
	}

	public CardType getCardType()
	{
		return CardType.TEXT_ANNOUNCEMENT;
	//    0    0:getstatic       #66  <Field CardType CardType.TEXT_ANNOUNCEMENT>
	//    1    3:areturn         
	}

	public String getDescription()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String a>
	//    2    4:areturn         
	}

	public String getDomain()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String d>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String b>
	//    2    4:areturn         
	}

	public String getUrl()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String c>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("TextAnnouncementCard{");
	//    4    8:aload_1         
	//    5    9:ldc1            #79  <String "TextAnnouncementCard{">
	//    6   11:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(super.toString());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokespecial   #85  <Method String Card.toString()>
	//   11   20:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", mDescription='");
	//   13   24:aload_1         
	//   14   25:ldc1            #87  <String ", mDescription='">
	//   15   27:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(a);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #48  <Field String a>
	//   20   36:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append('\'');
	//   22   40:aload_1         
	//   23   41:bipush          39
	//   24   43:invokevirtual   #90  <Method StringBuilder StringBuilder.append(char)>
	//   25   46:pop             
		stringbuilder.append(", mTitle='");
	//   26   47:aload_1         
	//   27   48:ldc1            #92  <String ", mTitle='">
	//   28   50:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(b);
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #37  <Field String b>
	//   33   59:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append('\'');
	//   35   63:aload_1         
	//   36   64:bipush          39
	//   37   66:invokevirtual   #90  <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
		stringbuilder.append(", mUrl='");
	//   39   70:aload_1         
	//   40   71:ldc1            #94  <String ", mUrl='">
	//   41   73:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   42   76:pop             
		stringbuilder.append(c);
	//   43   77:aload_1         
	//   44   78:aload_0         
	//   45   79:getfield        #53  <Field String c>
	//   46   82:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   47   85:pop             
		stringbuilder.append('\'');
	//   48   86:aload_1         
	//   49   87:bipush          39
	//   50   89:invokevirtual   #90  <Method StringBuilder StringBuilder.append(char)>
	//   51   92:pop             
		stringbuilder.append(", mDomain='");
	//   52   93:aload_1         
	//   53   94:ldc1            #96  <String ", mDomain='">
	//   54   96:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   55   99:pop             
		stringbuilder.append(d);
	//   56  100:aload_1         
	//   57  101:aload_0         
	//   58  102:getfield        #58  <Field String d>
	//   59  105:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   60  108:pop             
		stringbuilder.append('\'');
	//   61  109:aload_1         
	//   62  110:bipush          39
	//   63  112:invokevirtual   #90  <Method StringBuilder StringBuilder.append(char)>
	//   64  115:pop             
		stringbuilder.append("}");
	//   65  116:aload_1         
	//   66  117:ldc1            #98  <String "}">
	//   67  119:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   68  122:pop             
		return stringbuilder.toString();
	//   69  123:aload_1         
	//   70  124:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   71  127:areturn         
	}

	private final String a;
	private final String b;
	private final String c;
	private final String d;
}
