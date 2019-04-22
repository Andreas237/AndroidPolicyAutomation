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

public final class CaptionedImageCard extends Card
{

	public CaptionedImageCard(JSONObject jsonobject, com.appboy.enums.CardKey.Provider provider)
	{
		this(jsonobject, provider, ((bo) (null)), ((dt) (null)), ((c) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #17  <Method void CaptionedImageCard(JSONObject, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//    7    9:return          
	}

	public CaptionedImageCard(JSONObject jsonobject, com.appboy.enums.CardKey.Provider provider, bo bo, dt dt, c c1)
	{
		super(jsonobject, provider, ((bo.app.bt) (bo)), dt, c1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #21  <Method void Card(JSONObject, com.appboy.enums.CardKey$Provider, bo.app.bt, dt, c)>
		a = jsonobject.getString(provider.getKey(CardKey.CAPTIONED_IMAGE_IMAGE));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:getstatic       #27  <Field CardKey CardKey.CAPTIONED_IMAGE_IMAGE>
	//   11   17:invokevirtual   #33  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   12   20:invokevirtual   #39  <Method String JSONObject.getString(String)>
	//   13   23:putfield        #41  <Field String a>
		b = jsonobject.getString(provider.getKey(CardKey.CAPTIONED_IMAGE_TITLE));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:getstatic       #44  <Field CardKey CardKey.CAPTIONED_IMAGE_TITLE>
	//   18   32:invokevirtual   #33  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   19   35:invokevirtual   #39  <Method String JSONObject.getString(String)>
	//   20   38:putfield        #46  <Field String b>
		c = jsonobject.getString(provider.getKey(CardKey.CAPTIONED_IMAGE_DESCRIPTION));
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:getstatic       #49  <Field CardKey CardKey.CAPTIONED_IMAGE_DESCRIPTION>
	//   25   47:invokevirtual   #33  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   26   50:invokevirtual   #39  <Method String JSONObject.getString(String)>
	//   27   53:putfield        #51  <Field String c>
		d = ek.a(jsonobject, provider.getKey(CardKey.CAPTIONED_IMAGE_URL));
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:aload_2         
	//   31   59:getstatic       #54  <Field CardKey CardKey.CAPTIONED_IMAGE_URL>
	//   32   62:invokevirtual   #33  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   33   65:invokestatic    #59  <Method String ek.a(JSONObject, String)>
	//   34   68:putfield        #61  <Field String d>
		e = ek.a(jsonobject, provider.getKey(CardKey.CAPTIONED_IMAGE_DOMAIN));
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:getstatic       #64  <Field CardKey CardKey.CAPTIONED_IMAGE_DOMAIN>
	//   39   77:invokevirtual   #33  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   40   80:invokestatic    #59  <Method String ek.a(JSONObject, String)>
	//   41   83:putfield        #66  <Field String e>
		f = (float)jsonobject.optDouble(provider.getKey(CardKey.CAPTIONED_IMAGE_ASPECT_RATIO), 0.0D);
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:aload_2         
	//   45   89:getstatic       #69  <Field CardKey CardKey.CAPTIONED_IMAGE_ASPECT_RATIO>
	//   46   92:invokevirtual   #33  <Method String com.appboy.enums.CardKey$Provider.getKey(CardKey)>
	//   47   95:dconst_0        
	//   48   96:invokevirtual   #73  <Method double JSONObject.optDouble(String, double)>
	//   49   99:d2f             
	//   50  100:putfield        #75  <Field float f>
	//   51  103:return          
	}

	public float getAspectRatio()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field float f>
	//    2    4:freturn         
	}

	public CardType getCardType()
	{
		return CardType.CAPTIONED_IMAGE;
	//    0    0:getstatic       #85  <Field CardType CardType.CAPTIONED_IMAGE>
	//    1    3:areturn         
	}

	public String getDescription()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String c>
	//    2    4:areturn         
	}

	public String getDomain()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String e>
	//    2    4:areturn         
	}

	public String getImageUrl()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String a>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String b>
	//    2    4:areturn         
	}

	public String getUrl()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String d>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #94  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("CaptionedImageCard{");
	//    4    8:aload_1         
	//    5    9:ldc1            #99  <String "CaptionedImageCard{">
	//    6   11:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(super.toString());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokespecial   #105 <Method String Card.toString()>
	//   11   20:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", mImageUrl='");
	//   13   24:aload_1         
	//   14   25:ldc1            #107 <String ", mImageUrl='">
	//   15   27:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(a);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #41  <Field String a>
	//   20   36:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append('\'');
	//   22   40:aload_1         
	//   23   41:bipush          39
	//   24   43:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
	//   25   46:pop             
		stringbuilder.append(", mTitle='");
	//   26   47:aload_1         
	//   27   48:ldc1            #112 <String ", mTitle='">
	//   28   50:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(b);
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #46  <Field String b>
	//   33   59:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append('\'');
	//   35   63:aload_1         
	//   36   64:bipush          39
	//   37   66:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
		stringbuilder.append(", mDescription='");
	//   39   70:aload_1         
	//   40   71:ldc1            #114 <String ", mDescription='">
	//   41   73:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   42   76:pop             
		stringbuilder.append(c);
	//   43   77:aload_1         
	//   44   78:aload_0         
	//   45   79:getfield        #51  <Field String c>
	//   46   82:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   47   85:pop             
		stringbuilder.append('\'');
	//   48   86:aload_1         
	//   49   87:bipush          39
	//   50   89:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
	//   51   92:pop             
		stringbuilder.append(", mUrl='");
	//   52   93:aload_1         
	//   53   94:ldc1            #116 <String ", mUrl='">
	//   54   96:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   55   99:pop             
		stringbuilder.append(d);
	//   56  100:aload_1         
	//   57  101:aload_0         
	//   58  102:getfield        #61  <Field String d>
	//   59  105:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   60  108:pop             
		stringbuilder.append('\'');
	//   61  109:aload_1         
	//   62  110:bipush          39
	//   63  112:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
	//   64  115:pop             
		stringbuilder.append(", mDomain='");
	//   65  116:aload_1         
	//   66  117:ldc1            #118 <String ", mDomain='">
	//   67  119:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   68  122:pop             
		stringbuilder.append(e);
	//   69  123:aload_1         
	//   70  124:aload_0         
	//   71  125:getfield        #66  <Field String e>
	//   72  128:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   73  131:pop             
		stringbuilder.append('\'');
	//   74  132:aload_1         
	//   75  133:bipush          39
	//   76  135:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
	//   77  138:pop             
		stringbuilder.append(", mAspectRatio='");
	//   78  139:aload_1         
	//   79  140:ldc1            #120 <String ", mAspectRatio='">
	//   80  142:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   81  145:pop             
		stringbuilder.append(f);
	//   82  146:aload_1         
	//   83  147:aload_0         
	//   84  148:getfield        #75  <Field float f>
	//   85  151:invokevirtual   #123 <Method StringBuilder StringBuilder.append(float)>
	//   86  154:pop             
		stringbuilder.append('\'');
	//   87  155:aload_1         
	//   88  156:bipush          39
	//   89  158:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
	//   90  161:pop             
		stringbuilder.append("}");
	//   91  162:aload_1         
	//   92  163:ldc1            #125 <String "}">
	//   93  165:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   94  168:pop             
		return stringbuilder.toString();
	//   95  169:aload_1         
	//   96  170:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   97  173:areturn         
	}

	private final String a;
	private final String b;
	private final String c;
	private final String d;
	private final String e;
	private final float f;
}
