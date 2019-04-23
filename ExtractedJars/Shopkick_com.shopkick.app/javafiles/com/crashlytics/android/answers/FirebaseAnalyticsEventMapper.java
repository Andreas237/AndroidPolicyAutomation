// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.os.Bundle;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.math.BigDecimal;
import java.util.*;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionEvent, AddToCartEvent, FirebaseAnalyticsEvent

public class FirebaseAnalyticsEventMapper
{

	public FirebaseAnalyticsEventMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void Object()>
	//    2    4:return          
	}

	private String mapAttribute(String s)
	{
label0:
		{
label1:
			{
				if(s == null || s.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          108
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #99  <Method int String.length()>
	//*   4    8:ifne            14
					break label0;
	//    5   11:goto            108
				String s1 = s.replaceAll("[^\\p{Alnum}_]+", "_");
	//    6   14:aload_1         
	//    7   15:ldc1            #101 <String "[^\\p{Alnum}_]+">
	//    8   17:ldc1            #103 <String "_">
	//    9   19:invokevirtual   #107 <Method String String.replaceAll(String, String)>
	//   10   22:astore_2        
				if(!s1.startsWith("ga_") && !s1.startsWith("google_") && !s1.startsWith("firebase_"))
	//*  11   23:aload_2         
	//*  12   24:ldc1            #109 <String "ga_">
	//*  13   26:invokevirtual   #113 <Method boolean String.startsWith(String)>
	//*  14   29:ifne            63
	//*  15   32:aload_2         
	//*  16   33:ldc1            #115 <String "google_">
	//*  17   35:invokevirtual   #113 <Method boolean String.startsWith(String)>
	//*  18   38:ifne            63
	//*  19   41:aload_2         
	//*  20   42:ldc1            #117 <String "firebase_">
	//*  21   44:invokevirtual   #113 <Method boolean String.startsWith(String)>
	//*  22   47:ifne            63
				{
					s = s1;
	//   23   50:aload_2         
	//   24   51:astore_1        
					if(Character.isLetter(s1.charAt(0)))
						break label1;
	//   25   52:aload_2         
	//   26   53:iconst_0        
	//   27   54:invokevirtual   #121 <Method char String.charAt(int)>
	//   28   57:invokestatic    #127 <Method boolean Character.isLetter(char)>
	//   29   60:ifne            89
				}
				s = ((String) (new StringBuilder()));
	//   30   63:new             #129 <Class StringBuilder>
	//   31   66:dup             
	//   32   67:invokespecial   #130 <Method void StringBuilder()>
	//   33   70:astore_1        
				((StringBuilder) (s)).append("fabric_");
	//   34   71:aload_1         
	//   35   72:ldc1            #132 <String "fabric_">
	//   36   74:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
				((StringBuilder) (s)).append(s1);
	//   38   78:aload_1         
	//   39   79:aload_2         
	//   40   80:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   41   83:pop             
				s = ((StringBuilder) (s)).toString();
	//   42   84:aload_1         
	//   43   85:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   44   88:astore_1        
			}
			if(s.length() > 40)
	//*  45   89:aload_1         
	//*  46   90:invokevirtual   #99  <Method int String.length()>
	//*  47   93:bipush          40
	//*  48   95:icmple          106
				return s.substring(0, 40);
	//   49   98:aload_1         
	//   50   99:iconst_0        
	//   51  100:bipush          40
	//   52  102:invokevirtual   #144 <Method String String.substring(int, int)>
	//   53  105:areturn         
			else
				return s;
	//   54  106:aload_1         
	//   55  107:areturn         
		}
		return "fabric_unnamed_parameter";
	//   56  108:ldc1            #146 <String "fabric_unnamed_parameter">
	//   57  110:areturn         
	}

	private Integer mapBooleanValue(String s)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #150 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #152 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #157 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private void mapCustomEventAttributes(Bundle bundle, Map map)
	{
		map = ((Map) (map.entrySet().iterator()));
	//    0    0:aload_2         
	//    1    1:invokeinterface #165 <Method Set Map.entrySet()>
	//    2    6:invokeinterface #171 <Method Iterator Set.iterator()>
	//    3   11:astore_2        
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//    4   12:aload_2         
	//    5   13:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//    6   18:ifeq            167
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #181 <Method Object Iterator.next()>
	//    9   27:checkcast       #183 <Class java.util.Map$Entry>
	//   10   30:astore_3        
			Object obj = entry.getValue();
	//   11   31:aload_3         
	//   12   32:invokeinterface #186 <Method Object java.util.Map$Entry.getValue()>
	//   13   37:astore          4
			String s = mapAttribute((String)entry.getKey());
	//   14   39:aload_0         
	//   15   40:aload_3         
	//   16   41:invokeinterface #189 <Method Object java.util.Map$Entry.getKey()>
	//   17   46:checkcast       #26  <Class String>
	//   18   49:invokespecial   #191 <Method String mapAttribute(String)>
	//   19   52:astore          5
			if(obj instanceof String)
	//*  20   54:aload           4
	//*  21   56:instanceof      #26  <Class String>
	//*  22   59:ifeq            80
				bundle.putString(s, entry.getValue().toString());
	//   23   62:aload_1         
	//   24   63:aload           5
	//   25   65:aload_3         
	//   26   66:invokeinterface #186 <Method Object java.util.Map$Entry.getValue()>
	//   27   71:invokevirtual   #192 <Method String Object.toString()>
	//   28   74:invokevirtual   #198 <Method void Bundle.putString(String, String)>
			else
	//*  29   77:goto            12
			if(obj instanceof Double)
	//*  30   80:aload           4
	//*  31   82:instanceof      #200 <Class Double>
	//*  32   85:ifeq            109
				bundle.putDouble(s, ((Double)entry.getValue()).doubleValue());
	//   33   88:aload_1         
	//   34   89:aload           5
	//   35   91:aload_3         
	//   36   92:invokeinterface #186 <Method Object java.util.Map$Entry.getValue()>
	//   37   97:checkcast       #200 <Class Double>
	//   38  100:invokevirtual   #204 <Method double Double.doubleValue()>
	//   39  103:invokevirtual   #208 <Method void Bundle.putDouble(String, double)>
			else
	//*  40  106:goto            12
			if(obj instanceof Long)
	//*  41  109:aload           4
	//*  42  111:instanceof      #210 <Class Long>
	//*  43  114:ifeq            138
				bundle.putLong(s, ((Long)entry.getValue()).longValue());
	//   44  117:aload_1         
	//   45  118:aload           5
	//   46  120:aload_3         
	//   47  121:invokeinterface #186 <Method Object java.util.Map$Entry.getValue()>
	//   48  126:checkcast       #210 <Class Long>
	//   49  129:invokevirtual   #214 <Method long Long.longValue()>
	//   50  132:invokevirtual   #218 <Method void Bundle.putLong(String, long)>
			else
	//*  51  135:goto            12
			if(obj instanceof Integer)
	//*  52  138:aload           4
	//*  53  140:instanceof      #220 <Class Integer>
	//*  54  143:ifeq            12
				bundle.putInt(s, ((Integer)entry.getValue()).intValue());
	//   55  146:aload_1         
	//   56  147:aload           5
	//   57  149:aload_3         
	//   58  150:invokeinterface #186 <Method Object java.util.Map$Entry.getValue()>
	//   59  155:checkcast       #220 <Class Integer>
	//   60  158:invokevirtual   #223 <Method int Integer.intValue()>
	//   61  161:invokevirtual   #227 <Method void Bundle.putInt(String, int)>
		} while(true);
	//   62  164:goto            12
	//   63  167:return          
	}

	private String mapCustomEventName(String s)
	{
label0:
		{
label1:
			{
				if(s == null || s.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          148
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #99  <Method int String.length()>
	//*   4    8:ifne            14
					break label0;
	//    5   11:goto            148
				if(EVENT_NAMES.contains(((Object) (s))))
	//*   6   14:getstatic       #90  <Field Set EVENT_NAMES>
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #234 <Method boolean Set.contains(Object)>
	//*   9   23:ifeq            52
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   10   26:new             #129 <Class StringBuilder>
	//   11   29:dup             
	//   12   30:invokespecial   #130 <Method void StringBuilder()>
	//   13   33:astore_2        
					stringbuilder.append("fabric_");
	//   14   34:aload_2         
	//   15   35:ldc1            #132 <String "fabric_">
	//   16   37:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   17   40:pop             
					stringbuilder.append(s);
	//   18   41:aload_2         
	//   19   42:aload_1         
	//   20   43:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
					return stringbuilder.toString();
	//   22   47:aload_2         
	//   23   48:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   24   51:areturn         
				}
				String s1 = s.replaceAll("[^\\p{Alnum}_]+", "_");
	//   25   52:aload_1         
	//   26   53:ldc1            #101 <String "[^\\p{Alnum}_]+">
	//   27   55:ldc1            #103 <String "_">
	//   28   57:invokevirtual   #107 <Method String String.replaceAll(String, String)>
	//   29   60:astore_2        
				if(!s1.startsWith("ga_") && !s1.startsWith("google_") && !s1.startsWith("firebase_"))
	//*  30   61:aload_2         
	//*  31   62:ldc1            #109 <String "ga_">
	//*  32   64:invokevirtual   #113 <Method boolean String.startsWith(String)>
	//*  33   67:ifne            101
	//*  34   70:aload_2         
	//*  35   71:ldc1            #115 <String "google_">
	//*  36   73:invokevirtual   #113 <Method boolean String.startsWith(String)>
	//*  37   76:ifne            101
	//*  38   79:aload_2         
	//*  39   80:ldc1            #117 <String "firebase_">
	//*  40   82:invokevirtual   #113 <Method boolean String.startsWith(String)>
	//*  41   85:ifne            101
				{
					s = s1;
	//   42   88:aload_2         
	//   43   89:astore_1        
					if(Character.isLetter(s1.charAt(0)))
						break label1;
	//   44   90:aload_2         
	//   45   91:iconst_0        
	//   46   92:invokevirtual   #121 <Method char String.charAt(int)>
	//   47   95:invokestatic    #127 <Method boolean Character.isLetter(char)>
	//   48   98:ifne            127
				}
				s = ((String) (new StringBuilder()));
	//   49  101:new             #129 <Class StringBuilder>
	//   50  104:dup             
	//   51  105:invokespecial   #130 <Method void StringBuilder()>
	//   52  108:astore_1        
				((StringBuilder) (s)).append("fabric_");
	//   53  109:aload_1         
	//   54  110:ldc1            #132 <String "fabric_">
	//   55  112:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   56  115:pop             
				((StringBuilder) (s)).append(s1);
	//   57  116:aload_1         
	//   58  117:aload_2         
	//   59  118:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   60  121:pop             
				s = ((StringBuilder) (s)).toString();
	//   61  122:aload_1         
	//   62  123:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   63  126:astore_1        
			}
			String s2 = s;
	//   64  127:aload_1         
	//   65  128:astore_2        
			if(s.length() > 40)
	//*  66  129:aload_1         
	//*  67  130:invokevirtual   #99  <Method int String.length()>
	//*  68  133:bipush          40
	//*  69  135:icmple          146
				s2 = s.substring(0, 40);
	//   70  138:aload_1         
	//   71  139:iconst_0        
	//   72  140:bipush          40
	//   73  142:invokevirtual   #144 <Method String String.substring(int, int)>
	//   74  145:astore_2        
			return s2;
	//   75  146:aload_2         
	//   76  147:areturn         
		}
		return "fabric_unnamed_event";
	//   77  148:ldc1            #236 <String "fabric_unnamed_event">
	//   78  150:areturn         
	}

	private Double mapDouble(Object obj)
	{
		obj = ((Object) (String.valueOf(obj)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #242 <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return Double.valueOf(((String) (obj)));
	//    7   11:aload_1         
	//    8   12:invokestatic    #245 <Method Double Double.valueOf(String)>
	//    9   15:areturn         
	}

	private Bundle mapPredefinedEvent(SessionEvent sessionevent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #194 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #248 <Method void Bundle()>
	//    3    7:astore_2        
		if("purchase".equals(((Object) (sessionevent.predefinedType))))
	//*   4    8:ldc1            #250 <String "purchase">
	//*   5   10:aload_1         
	//*   6   11:getfield        #255 <Field String SessionEvent.predefinedType>
	//*   7   14:invokevirtual   #258 <Method boolean String.equals(Object)>
	//*   8   17:ifeq            139
		{
			putString(bundle, "item_id", (String)sessionevent.predefinedAttributes.get("itemId"));
	//    9   20:aload_0         
	//   10   21:aload_2         
	//   11   22:ldc2            #260 <String "item_id">
	//   12   25:aload_1         
	//   13   26:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   14   29:ldc2            #266 <String "itemId">
	//   15   32:invokeinterface #270 <Method Object Map.get(Object)>
	//   16   37:checkcast       #26  <Class String>
	//   17   40:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "item_name", (String)sessionevent.predefinedAttributes.get("itemName"));
	//   18   43:aload_0         
	//   19   44:aload_2         
	//   20   45:ldc2            #275 <String "item_name">
	//   21   48:aload_1         
	//   22   49:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   23   52:ldc2            #277 <String "itemName">
	//   24   55:invokeinterface #270 <Method Object Map.get(Object)>
	//   25   60:checkcast       #26  <Class String>
	//   26   63:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "item_category", (String)sessionevent.predefinedAttributes.get("itemType"));
	//   27   66:aload_0         
	//   28   67:aload_2         
	//   29   68:ldc2            #279 <String "item_category">
	//   30   71:aload_1         
	//   31   72:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   32   75:ldc2            #281 <String "itemType">
	//   33   78:invokeinterface #270 <Method Object Map.get(Object)>
	//   34   83:checkcast       #26  <Class String>
	//   35   86:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putDouble(bundle, "value", mapPriceValue(sessionevent.predefinedAttributes.get("itemPrice")));
	//   36   89:aload_0         
	//   37   90:aload_2         
	//   38   91:ldc2            #283 <String "value">
	//   39   94:aload_0         
	//   40   95:aload_1         
	//   41   96:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   42   99:ldc2            #285 <String "itemPrice">
	//   43  102:invokeinterface #270 <Method Object Map.get(Object)>
	//   44  107:invokespecial   #288 <Method Double mapPriceValue(Object)>
	//   45  110:invokespecial   #291 <Method void putDouble(Bundle, String, Double)>
			putString(bundle, "currency", (String)sessionevent.predefinedAttributes.get("currency"));
	//   46  113:aload_0         
	//   47  114:aload_2         
	//   48  115:ldc2            #293 <String "currency">
	//   49  118:aload_1         
	//   50  119:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   51  122:ldc2            #293 <String "currency">
	//   52  125:invokeinterface #270 <Method Object Map.get(Object)>
	//   53  130:checkcast       #26  <Class String>
	//   54  133:invokespecial   #273 <Method void putString(Bundle, String, String)>
		} else
	//*  55  136:goto            964
		if("addToCart".equals(((Object) (sessionevent.predefinedType))))
	//*  56  139:ldc2            #295 <String "addToCart">
	//*  57  142:aload_1         
	//*  58  143:getfield        #255 <Field String SessionEvent.predefinedType>
	//*  59  146:invokevirtual   #258 <Method boolean String.equals(Object)>
	//*  60  149:ifeq            303
		{
			putString(bundle, "item_id", (String)sessionevent.predefinedAttributes.get("itemId"));
	//   61  152:aload_0         
	//   62  153:aload_2         
	//   63  154:ldc2            #260 <String "item_id">
	//   64  157:aload_1         
	//   65  158:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   66  161:ldc2            #266 <String "itemId">
	//   67  164:invokeinterface #270 <Method Object Map.get(Object)>
	//   68  169:checkcast       #26  <Class String>
	//   69  172:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "item_name", (String)sessionevent.predefinedAttributes.get("itemName"));
	//   70  175:aload_0         
	//   71  176:aload_2         
	//   72  177:ldc2            #275 <String "item_name">
	//   73  180:aload_1         
	//   74  181:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   75  184:ldc2            #277 <String "itemName">
	//   76  187:invokeinterface #270 <Method Object Map.get(Object)>
	//   77  192:checkcast       #26  <Class String>
	//   78  195:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "item_category", (String)sessionevent.predefinedAttributes.get("itemType"));
	//   79  198:aload_0         
	//   80  199:aload_2         
	//   81  200:ldc2            #279 <String "item_category">
	//   82  203:aload_1         
	//   83  204:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   84  207:ldc2            #281 <String "itemType">
	//   85  210:invokeinterface #270 <Method Object Map.get(Object)>
	//   86  215:checkcast       #26  <Class String>
	//   87  218:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putDouble(bundle, "price", mapPriceValue(sessionevent.predefinedAttributes.get("itemPrice")));
	//   88  221:aload_0         
	//   89  222:aload_2         
	//   90  223:ldc2            #297 <String "price">
	//   91  226:aload_0         
	//   92  227:aload_1         
	//   93  228:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   94  231:ldc2            #285 <String "itemPrice">
	//   95  234:invokeinterface #270 <Method Object Map.get(Object)>
	//   96  239:invokespecial   #288 <Method Double mapPriceValue(Object)>
	//   97  242:invokespecial   #291 <Method void putDouble(Bundle, String, Double)>
			putDouble(bundle, "value", mapPriceValue(sessionevent.predefinedAttributes.get("itemPrice")));
	//   98  245:aload_0         
	//   99  246:aload_2         
	//  100  247:ldc2            #283 <String "value">
	//  101  250:aload_0         
	//  102  251:aload_1         
	//  103  252:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  104  255:ldc2            #285 <String "itemPrice">
	//  105  258:invokeinterface #270 <Method Object Map.get(Object)>
	//  106  263:invokespecial   #288 <Method Double mapPriceValue(Object)>
	//  107  266:invokespecial   #291 <Method void putDouble(Bundle, String, Double)>
			putString(bundle, "currency", (String)sessionevent.predefinedAttributes.get("currency"));
	//  108  269:aload_0         
	//  109  270:aload_2         
	//  110  271:ldc2            #293 <String "currency">
	//  111  274:aload_1         
	//  112  275:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  113  278:ldc2            #293 <String "currency">
	//  114  281:invokeinterface #270 <Method Object Map.get(Object)>
	//  115  286:checkcast       #26  <Class String>
	//  116  289:invokespecial   #273 <Method void putString(Bundle, String, String)>
			bundle.putLong("quantity", 1L);
	//  117  292:aload_2         
	//  118  293:ldc2            #299 <String "quantity">
	//  119  296:lconst_1        
	//  120  297:invokevirtual   #218 <Method void Bundle.putLong(String, long)>
		} else
	//* 121  300:goto            964
		if("startCheckout".equals(((Object) (sessionevent.predefinedType))))
	//* 122  303:ldc2            #301 <String "startCheckout">
	//* 123  306:aload_1         
	//* 124  307:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 125  310:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 126  313:ifeq            396
		{
			putLong(bundle, "quantity", Long.valueOf(((Integer)sessionevent.predefinedAttributes.get("itemCount")).intValue()));
	//  127  316:aload_0         
	//  128  317:aload_2         
	//  129  318:ldc2            #299 <String "quantity">
	//  130  321:aload_1         
	//  131  322:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  132  325:ldc2            #303 <String "itemCount">
	//  133  328:invokeinterface #270 <Method Object Map.get(Object)>
	//  134  333:checkcast       #220 <Class Integer>
	//  135  336:invokevirtual   #223 <Method int Integer.intValue()>
	//  136  339:i2l             
	//  137  340:invokestatic    #306 <Method Long Long.valueOf(long)>
	//  138  343:invokespecial   #309 <Method void putLong(Bundle, String, Long)>
			putDouble(bundle, "value", mapPriceValue(sessionevent.predefinedAttributes.get("totalPrice")));
	//  139  346:aload_0         
	//  140  347:aload_2         
	//  141  348:ldc2            #283 <String "value">
	//  142  351:aload_0         
	//  143  352:aload_1         
	//  144  353:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  145  356:ldc2            #311 <String "totalPrice">
	//  146  359:invokeinterface #270 <Method Object Map.get(Object)>
	//  147  364:invokespecial   #288 <Method Double mapPriceValue(Object)>
	//  148  367:invokespecial   #291 <Method void putDouble(Bundle, String, Double)>
			putString(bundle, "currency", (String)sessionevent.predefinedAttributes.get("currency"));
	//  149  370:aload_0         
	//  150  371:aload_2         
	//  151  372:ldc2            #293 <String "currency">
	//  152  375:aload_1         
	//  153  376:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  154  379:ldc2            #293 <String "currency">
	//  155  382:invokeinterface #270 <Method Object Map.get(Object)>
	//  156  387:checkcast       #26  <Class String>
	//  157  390:invokespecial   #273 <Method void putString(Bundle, String, String)>
		} else
	//* 158  393:goto            964
		if("contentView".equals(((Object) (sessionevent.predefinedType))))
	//* 159  396:ldc2            #313 <String "contentView">
	//* 160  399:aload_1         
	//* 161  400:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 162  403:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 163  406:ifeq            481
		{
			putString(bundle, "content_type", (String)sessionevent.predefinedAttributes.get("contentType"));
	//  164  409:aload_0         
	//  165  410:aload_2         
	//  166  411:ldc2            #315 <String "content_type">
	//  167  414:aload_1         
	//  168  415:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  169  418:ldc2            #317 <String "contentType">
	//  170  421:invokeinterface #270 <Method Object Map.get(Object)>
	//  171  426:checkcast       #26  <Class String>
	//  172  429:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "item_id", (String)sessionevent.predefinedAttributes.get("contentId"));
	//  173  432:aload_0         
	//  174  433:aload_2         
	//  175  434:ldc2            #260 <String "item_id">
	//  176  437:aload_1         
	//  177  438:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  178  441:ldc2            #319 <String "contentId">
	//  179  444:invokeinterface #270 <Method Object Map.get(Object)>
	//  180  449:checkcast       #26  <Class String>
	//  181  452:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "item_name", (String)sessionevent.predefinedAttributes.get("contentName"));
	//  182  455:aload_0         
	//  183  456:aload_2         
	//  184  457:ldc2            #275 <String "item_name">
	//  185  460:aload_1         
	//  186  461:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  187  464:ldc2            #321 <String "contentName">
	//  188  467:invokeinterface #270 <Method Object Map.get(Object)>
	//  189  472:checkcast       #26  <Class String>
	//  190  475:invokespecial   #273 <Method void putString(Bundle, String, String)>
		} else
	//* 191  478:goto            964
		if("search".equals(((Object) (sessionevent.predefinedType))))
	//* 192  481:ldc2            #323 <String "search">
	//* 193  484:aload_1         
	//* 194  485:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 195  488:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 196  491:ifeq            520
			putString(bundle, "search_term", (String)sessionevent.predefinedAttributes.get("query"));
	//  197  494:aload_0         
	//  198  495:aload_2         
	//  199  496:ldc2            #325 <String "search_term">
	//  200  499:aload_1         
	//  201  500:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  202  503:ldc2            #327 <String "query">
	//  203  506:invokeinterface #270 <Method Object Map.get(Object)>
	//  204  511:checkcast       #26  <Class String>
	//  205  514:invokespecial   #273 <Method void putString(Bundle, String, String)>
		else
	//* 206  517:goto            964
		if("share".equals(((Object) (sessionevent.predefinedType))))
	//* 207  520:ldc2            #329 <String "share">
	//* 208  523:aload_1         
	//* 209  524:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 210  527:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 211  530:ifeq            626
		{
			putString(bundle, "method", (String)sessionevent.predefinedAttributes.get("method"));
	//  212  533:aload_0         
	//  213  534:aload_2         
	//  214  535:ldc1            #14  <String "method">
	//  215  537:aload_1         
	//  216  538:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  217  541:ldc1            #14  <String "method">
	//  218  543:invokeinterface #270 <Method Object Map.get(Object)>
	//  219  548:checkcast       #26  <Class String>
	//  220  551:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "content_type", (String)sessionevent.predefinedAttributes.get("contentType"));
	//  221  554:aload_0         
	//  222  555:aload_2         
	//  223  556:ldc2            #315 <String "content_type">
	//  224  559:aload_1         
	//  225  560:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  226  563:ldc2            #317 <String "contentType">
	//  227  566:invokeinterface #270 <Method Object Map.get(Object)>
	//  228  571:checkcast       #26  <Class String>
	//  229  574:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "item_id", (String)sessionevent.predefinedAttributes.get("contentId"));
	//  230  577:aload_0         
	//  231  578:aload_2         
	//  232  579:ldc2            #260 <String "item_id">
	//  233  582:aload_1         
	//  234  583:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  235  586:ldc2            #319 <String "contentId">
	//  236  589:invokeinterface #270 <Method Object Map.get(Object)>
	//  237  594:checkcast       #26  <Class String>
	//  238  597:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "item_name", (String)sessionevent.predefinedAttributes.get("contentName"));
	//  239  600:aload_0         
	//  240  601:aload_2         
	//  241  602:ldc2            #275 <String "item_name">
	//  242  605:aload_1         
	//  243  606:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  244  609:ldc2            #321 <String "contentName">
	//  245  612:invokeinterface #270 <Method Object Map.get(Object)>
	//  246  617:checkcast       #26  <Class String>
	//  247  620:invokespecial   #273 <Method void putString(Bundle, String, String)>
		} else
	//* 248  623:goto            964
		if("rating".equals(((Object) (sessionevent.predefinedType))))
	//* 249  626:ldc1            #17  <String "rating">
	//* 250  628:aload_1         
	//* 251  629:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 252  632:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 253  635:ifeq            731
		{
			putString(bundle, "rating", String.valueOf(sessionevent.predefinedAttributes.get("rating")));
	//  254  638:aload_0         
	//  255  639:aload_2         
	//  256  640:ldc1            #17  <String "rating">
	//  257  642:aload_1         
	//  258  643:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  259  646:ldc1            #17  <String "rating">
	//  260  648:invokeinterface #270 <Method Object Map.get(Object)>
	//  261  653:invokestatic    #242 <Method String String.valueOf(Object)>
	//  262  656:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "content_type", (String)sessionevent.predefinedAttributes.get("contentType"));
	//  263  659:aload_0         
	//  264  660:aload_2         
	//  265  661:ldc2            #315 <String "content_type">
	//  266  664:aload_1         
	//  267  665:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  268  668:ldc2            #317 <String "contentType">
	//  269  671:invokeinterface #270 <Method Object Map.get(Object)>
	//  270  676:checkcast       #26  <Class String>
	//  271  679:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "item_id", (String)sessionevent.predefinedAttributes.get("contentId"));
	//  272  682:aload_0         
	//  273  683:aload_2         
	//  274  684:ldc2            #260 <String "item_id">
	//  275  687:aload_1         
	//  276  688:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  277  691:ldc2            #319 <String "contentId">
	//  278  694:invokeinterface #270 <Method Object Map.get(Object)>
	//  279  699:checkcast       #26  <Class String>
	//  280  702:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putString(bundle, "item_name", (String)sessionevent.predefinedAttributes.get("contentName"));
	//  281  705:aload_0         
	//  282  706:aload_2         
	//  283  707:ldc2            #275 <String "item_name">
	//  284  710:aload_1         
	//  285  711:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  286  714:ldc2            #321 <String "contentName">
	//  287  717:invokeinterface #270 <Method Object Map.get(Object)>
	//  288  722:checkcast       #26  <Class String>
	//  289  725:invokespecial   #273 <Method void putString(Bundle, String, String)>
		} else
	//* 290  728:goto            964
		if("signUp".equals(((Object) (sessionevent.predefinedType))))
	//* 291  731:ldc2            #331 <String "signUp">
	//* 292  734:aload_1         
	//* 293  735:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 294  738:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 295  741:ifeq            768
			putString(bundle, "method", (String)sessionevent.predefinedAttributes.get("method"));
	//  296  744:aload_0         
	//  297  745:aload_2         
	//  298  746:ldc1            #14  <String "method">
	//  299  748:aload_1         
	//  300  749:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  301  752:ldc1            #14  <String "method">
	//  302  754:invokeinterface #270 <Method Object Map.get(Object)>
	//  303  759:checkcast       #26  <Class String>
	//  304  762:invokespecial   #273 <Method void putString(Bundle, String, String)>
		else
	//* 305  765:goto            964
		if("login".equals(((Object) (sessionevent.predefinedType))))
	//* 306  768:ldc2            #333 <String "login">
	//* 307  771:aload_1         
	//* 308  772:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 309  775:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 310  778:ifeq            805
			putString(bundle, "method", (String)sessionevent.predefinedAttributes.get("method"));
	//  311  781:aload_0         
	//  312  782:aload_2         
	//  313  783:ldc1            #14  <String "method">
	//  314  785:aload_1         
	//  315  786:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  316  789:ldc1            #14  <String "method">
	//  317  791:invokeinterface #270 <Method Object Map.get(Object)>
	//  318  796:checkcast       #26  <Class String>
	//  319  799:invokespecial   #273 <Method void putString(Bundle, String, String)>
		else
	//* 320  802:goto            964
		if("invite".equals(((Object) (sessionevent.predefinedType))))
	//* 321  805:ldc2            #335 <String "invite">
	//* 322  808:aload_1         
	//* 323  809:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 324  812:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 325  815:ifeq            842
			putString(bundle, "method", (String)sessionevent.predefinedAttributes.get("method"));
	//  326  818:aload_0         
	//  327  819:aload_2         
	//  328  820:ldc1            #14  <String "method">
	//  329  822:aload_1         
	//  330  823:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  331  826:ldc1            #14  <String "method">
	//  332  828:invokeinterface #270 <Method Object Map.get(Object)>
	//  333  833:checkcast       #26  <Class String>
	//  334  836:invokespecial   #273 <Method void putString(Bundle, String, String)>
		else
	//* 335  839:goto            964
		if("levelStart".equals(((Object) (sessionevent.predefinedType))))
	//* 336  842:ldc2            #337 <String "levelStart">
	//* 337  845:aload_1         
	//* 338  846:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 339  849:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 340  852:ifeq            880
			putString(bundle, "level_name", (String)sessionevent.predefinedAttributes.get("levelName"));
	//  341  855:aload_0         
	//  342  856:aload_2         
	//  343  857:ldc1            #11  <String "level_name">
	//  344  859:aload_1         
	//  345  860:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  346  863:ldc2            #339 <String "levelName">
	//  347  866:invokeinterface #270 <Method Object Map.get(Object)>
	//  348  871:checkcast       #26  <Class String>
	//  349  874:invokespecial   #273 <Method void putString(Bundle, String, String)>
		else
	//* 350  877:goto            964
		if("levelEnd".equals(((Object) (sessionevent.predefinedType))))
	//* 351  880:ldc2            #341 <String "levelEnd">
	//* 352  883:aload_1         
	//* 353  884:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 354  887:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 355  890:ifeq            964
		{
			putDouble(bundle, "score", mapDouble(sessionevent.predefinedAttributes.get("score")));
	//  356  893:aload_0         
	//  357  894:aload_2         
	//  358  895:ldc2            #343 <String "score">
	//  359  898:aload_0         
	//  360  899:aload_1         
	//  361  900:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  362  903:ldc2            #343 <String "score">
	//  363  906:invokeinterface #270 <Method Object Map.get(Object)>
	//  364  911:invokespecial   #345 <Method Double mapDouble(Object)>
	//  365  914:invokespecial   #291 <Method void putDouble(Bundle, String, Double)>
			putString(bundle, "level_name", (String)sessionevent.predefinedAttributes.get("levelName"));
	//  366  917:aload_0         
	//  367  918:aload_2         
	//  368  919:ldc1            #11  <String "level_name">
	//  369  921:aload_1         
	//  370  922:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  371  925:ldc2            #339 <String "levelName">
	//  372  928:invokeinterface #270 <Method Object Map.get(Object)>
	//  373  933:checkcast       #26  <Class String>
	//  374  936:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putInt(bundle, "success", mapBooleanValue((String)sessionevent.predefinedAttributes.get("success")));
	//  375  939:aload_0         
	//  376  940:aload_2         
	//  377  941:ldc1            #20  <String "success">
	//  378  943:aload_0         
	//  379  944:aload_1         
	//  380  945:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  381  948:ldc1            #20  <String "success">
	//  382  950:invokeinterface #270 <Method Object Map.get(Object)>
	//  383  955:checkcast       #26  <Class String>
	//  384  958:invokespecial   #347 <Method Integer mapBooleanValue(String)>
	//  385  961:invokespecial   #350 <Method void putInt(Bundle, String, Integer)>
		}
		mapCustomEventAttributes(bundle, sessionevent.customAttributes);
	//  386  964:aload_0         
	//  387  965:aload_2         
	//  388  966:aload_1         
	//  389  967:getfield        #353 <Field Map SessionEvent.customAttributes>
	//  390  970:invokespecial   #355 <Method void mapCustomEventAttributes(Bundle, Map)>
		return bundle;
	//  391  973:aload_2         
	//  392  974:areturn         
	}

	private String mapPredefinedEventName(String s, boolean flag)
	{
		boolean flag1;
label0:
		{
			int i;
label1:
			{
				flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
				if(!flag)
					break label0;
	//    2    3:iload_2         
	//    3    4:ifeq            123
				i = s.hashCode();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #360 <Method int String.hashCode()>
	//    6   11:istore_3        
				if(i != 0xca356d38)
	//*   7   12:iload_3         
	//*   8   13:ldc2            #361 <Int 0xca356d38>
	//*   9   16:icmpeq          65
				{
					if(i != 0x625ef69)
	//*  10   19:iload_3         
	//*  11   20:ldc2            #362 <Int 0x625ef69>
	//*  12   23:icmpeq          50
					{
						if(i == 0x67e90501 && s.equals("purchase"))
	//*  13   26:iload_3         
	//*  14   27:ldc2            #363 <Int 0x67e90501>
	//*  15   30:icmpeq          36
	//*  16   33:goto            80
	//*  17   36:aload_1         
	//*  18   37:ldc1            #250 <String "purchase">
	//*  19   39:invokevirtual   #258 <Method boolean String.equals(Object)>
	//*  20   42:ifeq            80
						{
							i = 0;
	//   21   45:iconst_0        
	//   22   46:istore_3        
							break label1;
	//   23   47:goto            82
						}
					} else
					if(s.equals("login"))
	//*  24   50:aload_1         
	//*  25   51:ldc2            #333 <String "login">
	//*  26   54:invokevirtual   #258 <Method boolean String.equals(Object)>
	//*  27   57:ifeq            80
					{
						i = 2;
	//   28   60:iconst_2        
	//   29   61:istore_3        
						break label1;
	//   30   62:goto            82
					}
				} else
				if(s.equals("signUp"))
	//*  31   65:aload_1         
	//*  32   66:ldc2            #331 <String "signUp">
	//*  33   69:invokevirtual   #258 <Method boolean String.equals(Object)>
	//*  34   72:ifeq            80
				{
					i = 1;
	//   35   75:iconst_1        
	//   36   76:istore_3        
					break label1;
	//   37   77:goto            82
				}
				i = -1;
	//   38   80:iconst_m1       
	//   39   81:istore_3        
			}
			switch(i)
	//*  40   82:iload_3         
			{
	//*  41   83:tableswitch     0 2: default 108
	//	               0 119
	//	               1 115
	//	               2 111
	//*  42  108:goto            123
			case 2: // '\002'
				return "failed_login";
	//   43  111:ldc2            #365 <String "failed_login">
	//   44  114:areturn         

			case 1: // '\001'
				return "failed_sign_up";
	//   45  115:ldc2            #367 <String "failed_sign_up">
	//   46  118:areturn         

			case 0: // '\0'
				return "failed_ecommerce_purchase";
	//   47  119:ldc2            #369 <String "failed_ecommerce_purchase">
	//   48  122:areturn         
			}
		}
		byte byte0;
label2:
		{
			switch(s.hashCode())
	//*  49  123:aload_1         
	//*  50  124:invokevirtual   #360 <Method int String.hashCode()>
			{
			default:
				break;

	//*  51  127:lookupswitch    12: default 232
	//	               -2131650889: 404
	//	               -1183699191: 388
	//	               -938102371: 373
	//	               -906336856: 358
	//	               -902468296: 342
	//	               -389087554: 327
	//	               23457852: 312
	//	               103149417: 296
	//	               109400031: 281
	//	               196004670: 265
	//	               1664021448: 250
	//	               1743324417: 235
	//*  52  232:goto            420
			case 1743324417: 
				if(s.equals("purchase"))
	//*  53  235:aload_1         
	//*  54  236:ldc1            #250 <String "purchase">
	//*  55  238:invokevirtual   #258 <Method boolean String.equals(Object)>
	//*  56  241:ifeq            420
				{
					byte0 = ((byte) (flag1));
	//   57  244:iload           4
	//   58  246:istore_3        
					break label2;
	//   59  247:goto            422
				}
				break;

			case 1664021448: 
				if(!s.equals("startCheckout"))
					break;
	//   60  250:aload_1         
	//   61  251:ldc2            #301 <String "startCheckout">
	//   62  254:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   63  257:ifeq            420
				byte0 = 2;
	//   64  260:iconst_2        
	//   65  261:istore_3        
				break label2;
	//   66  262:goto            422

			case 196004670: 
				if(!s.equals("levelStart"))
					break;
	//   67  265:aload_1         
	//   68  266:ldc2            #337 <String "levelStart">
	//   69  269:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   70  272:ifeq            420
				byte0 = 10;
	//   71  275:bipush          10
	//   72  277:istore_3        
				break label2;
	//   73  278:goto            422

			case 109400031: 
				if(!s.equals("share"))
					break;
	//   74  281:aload_1         
	//   75  282:ldc2            #329 <String "share">
	//   76  285:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   77  288:ifeq            420
				byte0 = 5;
	//   78  291:iconst_5        
	//   79  292:istore_3        
				break label2;
	//   80  293:goto            422

			case 103149417: 
				if(!s.equals("login"))
					break;
	//   81  296:aload_1         
	//   82  297:ldc2            #333 <String "login">
	//   83  300:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   84  303:ifeq            420
				byte0 = 8;
	//   85  306:bipush          8
	//   86  308:istore_3        
				break label2;
	//   87  309:goto            422

			case 23457852: 
				if(!s.equals("addToCart"))
					break;
	//   88  312:aload_1         
	//   89  313:ldc2            #295 <String "addToCart">
	//   90  316:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   91  319:ifeq            420
				byte0 = 1;
	//   92  322:iconst_1        
	//   93  323:istore_3        
				break label2;
	//   94  324:goto            422

			case -389087554: 
				if(!s.equals("contentView"))
					break;
	//   95  327:aload_1         
	//   96  328:ldc2            #313 <String "contentView">
	//   97  331:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   98  334:ifeq            420
				byte0 = 3;
	//   99  337:iconst_3        
	//  100  338:istore_3        
				break label2;
	//  101  339:goto            422

			case -902468296: 
				if(!s.equals("signUp"))
					break;
	//  102  342:aload_1         
	//  103  343:ldc2            #331 <String "signUp">
	//  104  346:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  105  349:ifeq            420
				byte0 = 7;
	//  106  352:bipush          7
	//  107  354:istore_3        
				break label2;
	//  108  355:goto            422

			case -906336856: 
				if(!s.equals("search"))
					break;
	//  109  358:aload_1         
	//  110  359:ldc2            #323 <String "search">
	//  111  362:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  112  365:ifeq            420
				byte0 = 4;
	//  113  368:iconst_4        
	//  114  369:istore_3        
				break label2;
	//  115  370:goto            422

			case -938102371: 
				if(!s.equals("rating"))
					break;
	//  116  373:aload_1         
	//  117  374:ldc1            #17  <String "rating">
	//  118  376:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  119  379:ifeq            420
				byte0 = 6;
	//  120  382:bipush          6
	//  121  384:istore_3        
				break label2;
	//  122  385:goto            422

			case -1183699191: 
				if(!s.equals("invite"))
					break;
	//  123  388:aload_1         
	//  124  389:ldc2            #335 <String "invite">
	//  125  392:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  126  395:ifeq            420
				byte0 = 9;
	//  127  398:bipush          9
	//  128  400:istore_3        
				break label2;
	//  129  401:goto            422

			case -2131650889: 
				if(!s.equals("levelEnd"))
					break;
	//  130  404:aload_1         
	//  131  405:ldc2            #341 <String "levelEnd">
	//  132  408:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  133  411:ifeq            420
				byte0 = 11;
	//  134  414:bipush          11
	//  135  416:istore_3        
				break label2;
	//  136  417:goto            422
			}
			byte0 = -1;
	//  137  420:iconst_m1       
	//  138  421:istore_3        
		}
		switch(byte0)
	//* 139  422:iload_3         
		{
	//* 140  423:tableswitch     0 11: default 484
	//	               0 534
	//	               1 530
	//	               2 526
	//	               3 522
	//	               4 518
	//	               5 514
	//	               6 510
	//	               7 506
	//	               8 502
	//	               9 498
	//	               10 494
	//	               11 490
		default:
			return mapCustomEventName(s);
	//  141  484:aload_0         
	//  142  485:aload_1         
	//  143  486:invokespecial   #371 <Method String mapCustomEventName(String)>
	//  144  489:areturn         

		case 11: // '\013'
			return "level_end";
	//  145  490:ldc2            #373 <String "level_end">
	//  146  493:areturn         

		case 10: // '\n'
			return "level_start";
	//  147  494:ldc2            #375 <String "level_start">
	//  148  497:areturn         

		case 9: // '\t'
			return "invite";
	//  149  498:ldc2            #335 <String "invite">
	//  150  501:areturn         

		case 8: // '\b'
			return "login";
	//  151  502:ldc2            #333 <String "login">
	//  152  505:areturn         

		case 7: // '\007'
			return "sign_up";
	//  153  506:ldc2            #377 <String "sign_up">
	//  154  509:areturn         

		case 6: // '\006'
			return "rate_content";
	//  155  510:ldc2            #379 <String "rate_content">
	//  156  513:areturn         

		case 5: // '\005'
			return "share";
	//  157  514:ldc2            #329 <String "share">
	//  158  517:areturn         

		case 4: // '\004'
			return "search";
	//  159  518:ldc2            #323 <String "search">
	//  160  521:areturn         

		case 3: // '\003'
			return "select_content";
	//  161  522:ldc2            #381 <String "select_content">
	//  162  525:areturn         

		case 2: // '\002'
			return "begin_checkout";
	//  163  526:ldc2            #383 <String "begin_checkout">
	//  164  529:areturn         

		case 1: // '\001'
			return "add_to_cart";
	//  165  530:ldc2            #385 <String "add_to_cart">
	//  166  533:areturn         

		case 0: // '\0'
			return "ecommerce_purchase";
	//  167  534:ldc2            #387 <String "ecommerce_purchase">
	//  168  537:areturn         
		}
	}

	private Double mapPriceValue(Object obj)
	{
		obj = ((Object) ((Long)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #210 <Class Long>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return Double.valueOf((new BigDecimal(((Long) (obj)).longValue())).divide(AddToCartEvent.MICRO_CONSTANT).doubleValue());
	//    7   11:new             #389 <Class BigDecimal>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokevirtual   #214 <Method long Long.longValue()>
	//   11   19:invokespecial   #392 <Method void BigDecimal(long)>
	//   12   22:getstatic       #398 <Field BigDecimal AddToCartEvent.MICRO_CONSTANT>
	//   13   25:invokevirtual   #402 <Method BigDecimal BigDecimal.divide(BigDecimal)>
	//   14   28:invokevirtual   #403 <Method double BigDecimal.doubleValue()>
	//   15   31:invokestatic    #406 <Method Double Double.valueOf(double)>
	//   16   34:areturn         
	}

	private void putDouble(Bundle bundle, String s, Double double1)
	{
		double1 = mapDouble(((Object) (double1)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #345 <Method Double mapDouble(Object)>
	//    3    5:astore_3        
		if(double1 == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       11
		{
			return;
	//    6   10:return          
		} else
		{
			bundle.putDouble(s, double1.doubleValue());
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #204 <Method double Double.doubleValue()>
	//   11   17:invokevirtual   #208 <Method void Bundle.putDouble(String, double)>
			return;
	//   12   20:return          
		}
	}

	private void putInt(Bundle bundle, String s, Integer integer)
	{
		if(integer == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			bundle.putInt(s, integer.intValue());
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #223 <Method int Integer.intValue()>
	//    7   11:invokevirtual   #227 <Method void Bundle.putInt(String, int)>
			return;
	//    8   14:return          
		}
	}

	private void putLong(Bundle bundle, String s, Long long1)
	{
		if(long1 == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			bundle.putLong(s, long1.longValue());
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #214 <Method long Long.longValue()>
	//    7   11:invokevirtual   #218 <Method void Bundle.putLong(String, long)>
			return;
	//    8   14:return          
		}
	}

	private void putString(Bundle bundle, String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			bundle.putString(s, s1);
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #198 <Method void Bundle.putString(String, String)>
			return;
	//    7   11:return          
		}
	}

	public FirebaseAnalyticsEvent mapEvent(SessionEvent sessionevent)
	{
		boolean flag3 = SessionEvent.Type.CUSTOM.equals(((Object) (sessionevent.type)));
	//    0    0:getstatic       #414 <Field SessionEvent$Type SessionEvent$Type.CUSTOM>
	//    1    3:aload_1         
	//    2    4:getfield        #417 <Field SessionEvent$Type SessionEvent.type>
	//    3    7:invokevirtual   #418 <Method boolean SessionEvent$Type.equals(Object)>
	//    4   10:istore          5
		boolean flag2 = true;
	//    5   12:iconst_1        
	//    6   13:istore          4
		boolean flag;
		if(flag3 && sessionevent.customType != null)
	//*   7   15:iload           5
	//*   8   17:ifeq            32
	//*   9   20:aload_1         
	//*  10   21:getfield        #421 <Field String SessionEvent.customType>
	//*  11   24:ifnull          32
			flag = true;
	//   12   27:iconst_1        
	//   13   28:istore_2        
		else
	//*  14   29:goto            34
			flag = false;
	//   15   32:iconst_0        
	//   16   33:istore_2        
		boolean flag1;
		if(SessionEvent.Type.PREDEFINED.equals(((Object) (sessionevent.type))) && sessionevent.predefinedType != null)
	//*  17   34:getstatic       #424 <Field SessionEvent$Type SessionEvent$Type.PREDEFINED>
	//*  18   37:aload_1         
	//*  19   38:getfield        #417 <Field SessionEvent$Type SessionEvent.type>
	//*  20   41:invokevirtual   #418 <Method boolean SessionEvent$Type.equals(Object)>
	//*  21   44:ifeq            59
	//*  22   47:aload_1         
	//*  23   48:getfield        #255 <Field String SessionEvent.predefinedType>
	//*  24   51:ifnull          59
			flag1 = true;
	//   25   54:iconst_1        
	//   26   55:istore_3        
		else
	//*  27   56:goto            61
			flag1 = false;
	//   28   59:iconst_0        
	//   29   60:istore_3        
		if(!flag && !flag1)
	//*  30   61:iload_2         
	//*  31   62:ifne            71
	//*  32   65:iload_3         
	//*  33   66:ifne            71
			return null;
	//   34   69:aconst_null     
	//   35   70:areturn         
		Bundle bundle;
		if(flag1)
	//*  36   71:iload_3         
	//*  37   72:ifeq            85
		{
			bundle = mapPredefinedEvent(sessionevent);
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:invokespecial   #426 <Method Bundle mapPredefinedEvent(SessionEvent)>
	//   41   80:astore          6
		} else
	//*  42   82:goto            119
		{
			Bundle bundle1 = new Bundle();
	//   43   85:new             #194 <Class Bundle>
	//   44   88:dup             
	//   45   89:invokespecial   #248 <Method void Bundle()>
	//   46   92:astore          7
			bundle = bundle1;
	//   47   94:aload           7
	//   48   96:astore          6
			if(sessionevent.customAttributes != null)
	//*  49   98:aload_1         
	//*  50   99:getfield        #353 <Field Map SessionEvent.customAttributes>
	//*  51  102:ifnull          119
			{
				mapCustomEventAttributes(bundle1, sessionevent.customAttributes);
	//   52  105:aload_0         
	//   53  106:aload           7
	//   54  108:aload_1         
	//   55  109:getfield        #353 <Field Map SessionEvent.customAttributes>
	//   56  112:invokespecial   #355 <Method void mapCustomEventAttributes(Bundle, Map)>
				bundle = bundle1;
	//   57  115:aload           7
	//   58  117:astore          6
			}
		}
		if(flag1)
	//*  59  119:iload_3         
	//*  60  120:ifeq            172
		{
			String s = (String)sessionevent.predefinedAttributes.get("success");
	//   61  123:aload_1         
	//   62  124:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   63  127:ldc1            #20  <String "success">
	//   64  129:invokeinterface #270 <Method Object Map.get(Object)>
	//   65  134:checkcast       #26  <Class String>
	//   66  137:astore          7
			if(s == null || Boolean.parseBoolean(s))
	//*  67  139:aload           7
	//*  68  141:ifnull          155
	//*  69  144:aload           7
	//*  70  146:invokestatic    #431 <Method boolean Boolean.parseBoolean(String)>
	//*  71  149:ifne            155
	//*  72  152:goto            158
				flag2 = false;
	//   73  155:iconst_0        
	//   74  156:istore          4
			sessionevent = ((SessionEvent) (mapPredefinedEventName(sessionevent.predefinedType, flag2)));
	//   75  158:aload_0         
	//   76  159:aload_1         
	//   77  160:getfield        #255 <Field String SessionEvent.predefinedType>
	//   78  163:iload           4
	//   79  165:invokespecial   #433 <Method String mapPredefinedEventName(String, boolean)>
	//   80  168:astore_1        
		} else
	//*  81  169:goto            181
		{
			sessionevent = ((SessionEvent) (mapCustomEventName(sessionevent.customType)));
	//   82  172:aload_0         
	//   83  173:aload_1         
	//   84  174:getfield        #421 <Field String SessionEvent.customType>
	//   85  177:invokespecial   #371 <Method String mapCustomEventName(String)>
	//   86  180:astore_1        
		}
		Fabric.getLogger().d("Answers", "Logging event into firebase...");
	//   87  181:invokestatic    #439 <Method Logger Fabric.getLogger()>
	//   88  184:ldc2            #441 <String "Answers">
	//   89  187:ldc2            #443 <String "Logging event into firebase...">
	//   90  190:invokeinterface #448 <Method void Logger.d(String, String)>
		return new FirebaseAnalyticsEvent(((String) (sessionevent)), bundle);
	//   91  195:new             #450 <Class FirebaseAnalyticsEvent>
	//   92  198:dup             
	//   93  199:aload_1         
	//   94  200:aload           6
	//   95  202:invokespecial   #453 <Method void FirebaseAnalyticsEvent(String, Bundle)>
	//   96  205:areturn         
	}

	private static final Set EVENT_NAMES = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", 
		"in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", 
		"ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"
	}))))));
	private static final String FIREBASE_LEVEL_NAME = "level_name";
	private static final String FIREBASE_METHOD = "method";
	private static final String FIREBASE_RATING = "rating";
	private static final String FIREBASE_SUCCESS = "success";

	static 
	{
	//    0    0:new             #24  <Class HashSet>
	//    1    3:dup             
	//    2    4:bipush          26
	//    3    6:anewarray       String[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #28  <String "app_clear_data">
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:ldc1            #30  <String "app_exception">
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #32  <String "app_remove">
	//   15   23:aastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:ldc1            #34  <String "app_upgrade">
	//   19   28:aastore         
	//   20   29:dup             
	//   21   30:iconst_4        
	//   22   31:ldc1            #36  <String "app_install">
	//   23   33:aastore         
	//   24   34:dup             
	//   25   35:iconst_5        
	//   26   36:ldc1            #38  <String "app_update">
	//   27   38:aastore         
	//   28   39:dup             
	//   29   40:bipush          6
	//   30   42:ldc1            #40  <String "firebase_campaign">
	//   31   44:aastore         
	//   32   45:dup             
	//   33   46:bipush          7
	//   34   48:ldc1            #42  <String "error">
	//   35   50:aastore         
	//   36   51:dup             
	//   37   52:bipush          8
	//   38   54:ldc1            #44  <String "first_open">
	//   39   56:aastore         
	//   40   57:dup             
	//   41   58:bipush          9
	//   42   60:ldc1            #46  <String "first_visit">
	//   43   62:aastore         
	//   44   63:dup             
	//   45   64:bipush          10
	//   46   66:ldc1            #48  <String "in_app_purchase">
	//   47   68:aastore         
	//   48   69:dup             
	//   49   70:bipush          11
	//   50   72:ldc1            #50  <String "notification_dismiss">
	//   51   74:aastore         
	//   52   75:dup             
	//   53   76:bipush          12
	//   54   78:ldc1            #52  <String "notification_foreground">
	//   55   80:aastore         
	//   56   81:dup             
	//   57   82:bipush          13
	//   58   84:ldc1            #54  <String "notification_open">
	//   59   86:aastore         
	//   60   87:dup             
	//   61   88:bipush          14
	//   62   90:ldc1            #56  <String "notification_receive">
	//   63   92:aastore         
	//   64   93:dup             
	//   65   94:bipush          15
	//   66   96:ldc1            #58  <String "os_update">
	//   67   98:aastore         
	//   68   99:dup             
	//   69  100:bipush          16
	//   70  102:ldc1            #60  <String "session_start">
	//   71  104:aastore         
	//   72  105:dup             
	//   73  106:bipush          17
	//   74  108:ldc1            #62  <String "user_engagement">
	//   75  110:aastore         
	//   76  111:dup             
	//   77  112:bipush          18
	//   78  114:ldc1            #64  <String "ad_exposure">
	//   79  116:aastore         
	//   80  117:dup             
	//   81  118:bipush          19
	//   82  120:ldc1            #66  <String "adunit_exposure">
	//   83  122:aastore         
	//   84  123:dup             
	//   85  124:bipush          20
	//   86  126:ldc1            #68  <String "ad_query">
	//   87  128:aastore         
	//   88  129:dup             
	//   89  130:bipush          21
	//   90  132:ldc1            #70  <String "ad_activeview">
	//   91  134:aastore         
	//   92  135:dup             
	//   93  136:bipush          22
	//   94  138:ldc1            #72  <String "ad_impression">
	//   95  140:aastore         
	//   96  141:dup             
	//   97  142:bipush          23
	//   98  144:ldc1            #74  <String "ad_click">
	//   99  146:aastore         
	//  100  147:dup             
	//  101  148:bipush          24
	//  102  150:ldc1            #76  <String "screen_view">
	//  103  152:aastore         
	//  104  153:dup             
	//  105  154:bipush          25
	//  106  156:ldc1            #78  <String "firebase_extra_parameter">
	//  107  158:aastore         
	//  108  159:invokestatic    #84  <Method java.util.List Arrays.asList(Object[])>
	//  109  162:invokespecial   #88  <Method void HashSet(java.util.Collection)>
	//  110  165:putstatic       #90  <Field Set EVENT_NAMES>
	//* 111  168:return          
	}
}
