// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;

import bo.app.ek;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.appboy.enums:
//			CardKey, CardType

public static class CardKey$Provider
{

	public CardType getCardTypeFromJson(JSONObject jsonobject)
	{
		String s1 = jsonobject.optString(getKey(CardKey.TYPE), ((String) (null)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getstatic       #23  <Field CardKey CardKey.TYPE>
	//    3    5:invokevirtual   #27  <Method String getKey(CardKey)>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #33  <Method String JSONObject.optString(String, String)>
	//    6   12:astore_3        
		String s = s1;
	//    7   13:aload_3         
	//    8   14:astore_2        
		if(!StringUtils.isNullOrEmpty(s1))
	//*   9   15:aload_3         
	//*  10   16:invokestatic    #39  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  11   19:ifne            73
		{
			s = s1;
	//   12   22:aload_3         
	//   13   23:astore_2        
			if(a)
	//*  14   24:aload_0         
	//*  15   25:getfield        #16  <Field boolean a>
	//*  16   28:ifeq            73
			{
				s = s1;
	//   17   31:aload_3         
	//   18   32:astore_2        
				if(s1.equals("short_news"))
	//*  19   33:aload_3         
	//*  20   34:ldc1            #41  <String "short_news">
	//*  21   36:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  22   39:ifeq            73
				{
					s = s1;
	//   23   42:aload_3         
	//   24   43:astore_2        
					if(StringUtils.isNullOrEmpty(ek.a(jsonobject, getKey(CardKey.SHORT_NEWS_IMAGE))))
	//*  25   44:aload_1         
	//*  26   45:aload_0         
	//*  27   46:getstatic       #50  <Field CardKey CardKey.SHORT_NEWS_IMAGE>
	//*  28   49:invokevirtual   #27  <Method String getKey(CardKey)>
	//*  29   52:invokestatic    #55  <Method String ek.a(JSONObject, String)>
	//*  30   55:invokestatic    #39  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  31   58:ifeq            73
					{
						AppboyLogger.v(CardKey.a(), "Short News card doesn't contain image url, parsing type as Text Announcement");
	//   32   61:invokestatic    #58  <Method String CardKey.a()>
	//   33   64:ldc1            #60  <String "Short News card doesn't contain image url, parsing type as Text Announcement">
	//   34   66:invokestatic    #66  <Method int AppboyLogger.v(String, String)>
	//   35   69:pop             
						s = "text_announcement";
	//   36   70:ldc1            #68  <String "text_announcement">
	//   37   72:astore_2        
					}
				}
			}
		}
		if(CardKey.b().containsKey(((Object) (s))))
	//*  38   73:invokestatic    #72  <Method Map CardKey.b()>
	//*  39   76:aload_2         
	//*  40   77:invokeinterface #77  <Method boolean Map.containsKey(Object)>
	//*  41   82:ifeq            98
			return (CardType)CardKey.b().get(((Object) (s)));
	//   42   85:invokestatic    #72  <Method Map CardKey.b()>
	//   43   88:aload_2         
	//   44   89:invokeinterface #81  <Method Object Map.get(Object)>
	//   45   94:checkcast       #83  <Class CardType>
	//   46   97:areturn         
		else
			return CardType.DEFAULT;
	//   47   98:getstatic       #87  <Field CardType CardType.DEFAULT>
	//   48  101:areturn         
	}

	public String getKey(CardKey cardkey)
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field boolean a>
	//*   2    4:ifeq            12
			return cardkey.getContentCardsKey();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #90  <Method String CardKey.getContentCardsKey()>
	//    5   11:areturn         
		else
			return cardkey.getFeedKey();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #93  <Method String CardKey.getFeedKey()>
	//    8   16:areturn         
	}

	private final boolean a;

	public CardKey$Provider(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field boolean a>
	//    5    9:return          
	}
}
