// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.os.Bundle;
import b.a.a.a.c;
import b.a.a.a.l;
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
	//*   1    1:ifnull          110
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #99  <Method int String.length()>
	//*   4    8:ifne            14
					break label0;
	//    5   11:goto            110
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
			String s2 = s;
	//   45   89:aload_1         
	//   46   90:astore_2        
			if(s.length() > 40)
	//*  47   91:aload_1         
	//*  48   92:invokevirtual   #99  <Method int String.length()>
	//*  49   95:bipush          40
	//*  50   97:icmple          108
				s2 = s.substring(0, 40);
	//   51  100:aload_1         
	//   52  101:iconst_0        
	//   53  102:bipush          40
	//   54  104:invokevirtual   #144 <Method String String.substring(int, int)>
	//   55  107:astore_2        
			return s2;
	//   56  108:aload_2         
	//   57  109:areturn         
		}
		return "fabric_unnamed_parameter";
	//   58  110:ldc1            #146 <String "fabric_unnamed_parameter">
	//   59  112:areturn         
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
	//    3    7:astore          5
		if(!"purchase".equals(((Object) (sessionevent.predefinedType)))) goto _L2; else goto _L1
	//    4    9:ldc1            #250 <String "purchase">
	//    5   11:aload_1         
	//    6   12:getfield        #255 <Field String SessionEvent.predefinedType>
	//    7   15:invokevirtual   #258 <Method boolean String.equals(Object)>
	//    8   18:ifeq            157
_L1:
		Object obj;
		Object obj1;
		putString(bundle, "item_id", (String)sessionevent.predefinedAttributes.get("itemId"));
	//    9   21:aload_0         
	//   10   22:aload           5
	//   11   24:ldc2            #260 <String "item_id">
	//   12   27:aload_1         
	//   13   28:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   14   31:ldc2            #266 <String "itemId">
	//   15   34:invokeinterface #270 <Method Object Map.get(Object)>
	//   16   39:checkcast       #26  <Class String>
	//   17   42:invokespecial   #273 <Method void putString(Bundle, String, String)>
		putString(bundle, "item_name", (String)sessionevent.predefinedAttributes.get("itemName"));
	//   18   45:aload_0         
	//   19   46:aload           5
	//   20   48:ldc2            #275 <String "item_name">
	//   21   51:aload_1         
	//   22   52:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   23   55:ldc2            #277 <String "itemName">
	//   24   58:invokeinterface #270 <Method Object Map.get(Object)>
	//   25   63:checkcast       #26  <Class String>
	//   26   66:invokespecial   #273 <Method void putString(Bundle, String, String)>
		putString(bundle, "item_category", (String)sessionevent.predefinedAttributes.get("itemType"));
	//   27   69:aload_0         
	//   28   70:aload           5
	//   29   72:ldc2            #279 <String "item_category">
	//   30   75:aload_1         
	//   31   76:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   32   79:ldc2            #281 <String "itemType">
	//   33   82:invokeinterface #270 <Method Object Map.get(Object)>
	//   34   87:checkcast       #26  <Class String>
	//   35   90:invokespecial   #273 <Method void putString(Bundle, String, String)>
		obj = ((Object) (sessionevent.predefinedAttributes));
	//   36   93:aload_1         
	//   37   94:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   38   97:astore_2        
		obj1 = "itemPrice";
	//   39   98:ldc2            #283 <String "itemPrice">
	//   40  101:astore_3        
_L14:
		String s;
		putDouble(bundle, "value", mapPriceValue(((Map) (obj)).get(obj1)));
	//   41  102:aload_0         
	//   42  103:aload           5
	//   43  105:ldc2            #285 <String "value">
	//   44  108:aload_0         
	//   45  109:aload_2         
	//   46  110:aload_3         
	//   47  111:invokeinterface #270 <Method Object Map.get(Object)>
	//   48  116:invokespecial   #288 <Method Double mapPriceValue(Object)>
	//   49  119:invokespecial   #291 <Method void putDouble(Bundle, String, Double)>
		obj = "currency";
	//   50  122:ldc2            #293 <String "currency">
	//   51  125:astore_2        
		obj1 = ((Object) (sessionevent.predefinedAttributes));
	//   52  126:aload_1         
	//   53  127:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   54  130:astore_3        
		s = "currency";
	//   55  131:ldc2            #293 <String "currency">
	//   56  134:astore          4
_L12:
		putString(bundle, ((String) (obj)), (String)((Map) (obj1)).get(((Object) (s))));
	//   57  136:aload_0         
	//   58  137:aload           5
	//   59  139:aload_2         
	//   60  140:aload_3         
	//   61  141:aload           4
	//   62  143:invokeinterface #270 <Method Object Map.get(Object)>
	//   63  148:checkcast       #26  <Class String>
	//   64  151:invokespecial   #273 <Method void putString(Bundle, String, String)>
		  goto _L3
	//*  65  154:goto            743
_L2:
		if(!"addToCart".equals(((Object) (sessionevent.predefinedType)))) goto _L5; else goto _L4
	//   66  157:ldc2            #295 <String "addToCart">
	//   67  160:aload_1         
	//   68  161:getfield        #255 <Field String SessionEvent.predefinedType>
	//   69  164:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   70  167:ifeq            328
_L4:
		putString(bundle, "item_id", (String)sessionevent.predefinedAttributes.get("itemId"));
	//   71  170:aload_0         
	//   72  171:aload           5
	//   73  173:ldc2            #260 <String "item_id">
	//   74  176:aload_1         
	//   75  177:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   76  180:ldc2            #266 <String "itemId">
	//   77  183:invokeinterface #270 <Method Object Map.get(Object)>
	//   78  188:checkcast       #26  <Class String>
	//   79  191:invokespecial   #273 <Method void putString(Bundle, String, String)>
		putString(bundle, "item_name", (String)sessionevent.predefinedAttributes.get("itemName"));
	//   80  194:aload_0         
	//   81  195:aload           5
	//   82  197:ldc2            #275 <String "item_name">
	//   83  200:aload_1         
	//   84  201:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   85  204:ldc2            #277 <String "itemName">
	//   86  207:invokeinterface #270 <Method Object Map.get(Object)>
	//   87  212:checkcast       #26  <Class String>
	//   88  215:invokespecial   #273 <Method void putString(Bundle, String, String)>
		putString(bundle, "item_category", (String)sessionevent.predefinedAttributes.get("itemType"));
	//   89  218:aload_0         
	//   90  219:aload           5
	//   91  221:ldc2            #279 <String "item_category">
	//   92  224:aload_1         
	//   93  225:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   94  228:ldc2            #281 <String "itemType">
	//   95  231:invokeinterface #270 <Method Object Map.get(Object)>
	//   96  236:checkcast       #26  <Class String>
	//   97  239:invokespecial   #273 <Method void putString(Bundle, String, String)>
		putDouble(bundle, "price", mapPriceValue(sessionevent.predefinedAttributes.get("itemPrice")));
	//   98  242:aload_0         
	//   99  243:aload           5
	//  100  245:ldc2            #297 <String "price">
	//  101  248:aload_0         
	//  102  249:aload_1         
	//  103  250:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  104  253:ldc2            #283 <String "itemPrice">
	//  105  256:invokeinterface #270 <Method Object Map.get(Object)>
	//  106  261:invokespecial   #288 <Method Double mapPriceValue(Object)>
	//  107  264:invokespecial   #291 <Method void putDouble(Bundle, String, Double)>
		putDouble(bundle, "value", mapPriceValue(sessionevent.predefinedAttributes.get("itemPrice")));
	//  108  267:aload_0         
	//  109  268:aload           5
	//  110  270:ldc2            #285 <String "value">
	//  111  273:aload_0         
	//  112  274:aload_1         
	//  113  275:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  114  278:ldc2            #283 <String "itemPrice">
	//  115  281:invokeinterface #270 <Method Object Map.get(Object)>
	//  116  286:invokespecial   #288 <Method Double mapPriceValue(Object)>
	//  117  289:invokespecial   #291 <Method void putDouble(Bundle, String, Double)>
		putString(bundle, "currency", (String)sessionevent.predefinedAttributes.get("currency"));
	//  118  292:aload_0         
	//  119  293:aload           5
	//  120  295:ldc2            #293 <String "currency">
	//  121  298:aload_1         
	//  122  299:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  123  302:ldc2            #293 <String "currency">
	//  124  305:invokeinterface #270 <Method Object Map.get(Object)>
	//  125  310:checkcast       #26  <Class String>
	//  126  313:invokespecial   #273 <Method void putString(Bundle, String, String)>
		bundle.putLong("quantity", 1L);
	//  127  316:aload           5
	//  128  318:ldc2            #299 <String "quantity">
	//  129  321:lconst_1        
	//  130  322:invokevirtual   #218 <Method void Bundle.putLong(String, long)>
		  goto _L3
	//* 131  325:goto            743
_L5:
		if("startCheckout".equals(((Object) (sessionevent.predefinedType))))
	//* 132  328:ldc2            #301 <String "startCheckout">
	//* 133  331:aload_1         
	//* 134  332:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 135  335:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 136  338:ifeq            384
		{
			putLong(bundle, "quantity", Long.valueOf(((Integer)sessionevent.predefinedAttributes.get("itemCount")).intValue()));
	//  137  341:aload_0         
	//  138  342:aload           5
	//  139  344:ldc2            #299 <String "quantity">
	//  140  347:aload_1         
	//  141  348:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  142  351:ldc2            #303 <String "itemCount">
	//  143  354:invokeinterface #270 <Method Object Map.get(Object)>
	//  144  359:checkcast       #220 <Class Integer>
	//  145  362:invokevirtual   #223 <Method int Integer.intValue()>
	//  146  365:i2l             
	//  147  366:invokestatic    #306 <Method Long Long.valueOf(long)>
	//  148  369:invokespecial   #309 <Method void putLong(Bundle, String, Long)>
			obj = ((Object) (sessionevent.predefinedAttributes));
	//  149  372:aload_1         
	//  150  373:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  151  376:astore_2        
			obj1 = "totalPrice";
	//  152  377:ldc2            #311 <String "totalPrice">
	//  153  380:astore_3        
			continue; /* Loop/switch isn't completed */
	//  154  381:goto            102
		}
		if(!"contentView".equals(((Object) (sessionevent.predefinedType)))) goto _L7; else goto _L6
	//  155  384:ldc2            #313 <String "contentView">
	//  156  387:aload_1         
	//  157  388:getfield        #255 <Field String SessionEvent.predefinedType>
	//  158  391:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  159  394:ifeq            462
_L6:
		putString(bundle, "content_type", (String)sessionevent.predefinedAttributes.get("contentType"));
	//  160  397:aload_0         
	//  161  398:aload           5
	//  162  400:ldc2            #315 <String "content_type">
	//  163  403:aload_1         
	//  164  404:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  165  407:ldc2            #317 <String "contentType">
	//  166  410:invokeinterface #270 <Method Object Map.get(Object)>
	//  167  415:checkcast       #26  <Class String>
	//  168  418:invokespecial   #273 <Method void putString(Bundle, String, String)>
		putString(bundle, "item_id", (String)sessionevent.predefinedAttributes.get("contentId"));
	//  169  421:aload_0         
	//  170  422:aload           5
	//  171  424:ldc2            #260 <String "item_id">
	//  172  427:aload_1         
	//  173  428:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  174  431:ldc2            #319 <String "contentId">
	//  175  434:invokeinterface #270 <Method Object Map.get(Object)>
	//  176  439:checkcast       #26  <Class String>
	//  177  442:invokespecial   #273 <Method void putString(Bundle, String, String)>
		obj = "item_name";
	//  178  445:ldc2            #275 <String "item_name">
	//  179  448:astore_2        
		obj1 = ((Object) (sessionevent.predefinedAttributes));
	//  180  449:aload_1         
	//  181  450:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  182  453:astore_3        
		s = "contentName";
	//  183  454:ldc2            #321 <String "contentName">
	//  184  457:astore          4
		continue; /* Loop/switch isn't completed */
	//  185  459:goto            136
_L7:
		if("search".equals(((Object) (sessionevent.predefinedType))))
	//* 186  462:ldc2            #323 <String "search">
	//* 187  465:aload_1         
	//* 188  466:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 189  469:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 190  472:ifeq            492
		{
			obj = "search_term";
	//  191  475:ldc2            #325 <String "search_term">
	//  192  478:astore_2        
			obj1 = ((Object) (sessionevent.predefinedAttributes));
	//  193  479:aload_1         
	//  194  480:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  195  483:astore_3        
			s = "query";
	//  196  484:ldc2            #327 <String "query">
	//  197  487:astore          4
			continue; /* Loop/switch isn't completed */
	//  198  489:goto            136
		}
		if(!"share".equals(((Object) (sessionevent.predefinedType))))
			break; /* Loop/switch isn't completed */
	//  199  492:ldc2            #329 <String "share">
	//  200  495:aload_1         
	//  201  496:getfield        #255 <Field String SessionEvent.predefinedType>
	//  202  499:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  203  502:ifeq            534
		obj = "method";
	//  204  505:ldc1            #14  <String "method">
	//  205  507:astore_2        
		obj1 = ((Object) ((String)sessionevent.predefinedAttributes.get("method")));
	//  206  508:aload_1         
	//  207  509:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  208  512:ldc1            #14  <String "method">
	//  209  514:invokeinterface #270 <Method Object Map.get(Object)>
	//  210  519:checkcast       #26  <Class String>
	//  211  522:astore_3        
_L9:
		putString(bundle, ((String) (obj)), ((String) (obj1)));
	//  212  523:aload_0         
	//  213  524:aload           5
	//  214  526:aload_2         
	//  215  527:aload_3         
	//  216  528:invokespecial   #273 <Method void putString(Bundle, String, String)>
		if(true) goto _L6; else goto _L8
	//  217  531:goto            397
_L8:
label0:
		{
			if(!"rating".equals(((Object) (sessionevent.predefinedType))))
				break label0;
	//  218  534:ldc1            #17  <String "rating">
	//  219  536:aload_1         
	//  220  537:getfield        #255 <Field String SessionEvent.predefinedType>
	//  221  540:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  222  543:ifeq            567
			obj = "rating";
	//  223  546:ldc1            #17  <String "rating">
	//  224  548:astore_2        
			obj1 = ((Object) (String.valueOf(sessionevent.predefinedAttributes.get("rating"))));
	//  225  549:aload_1         
	//  226  550:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  227  553:ldc1            #17  <String "rating">
	//  228  555:invokeinterface #270 <Method Object Map.get(Object)>
	//  229  560:invokestatic    #242 <Method String String.valueOf(Object)>
	//  230  563:astore_3        
		}
		  goto _L9
		if(true) goto _L6; else goto _L10
	//* 231  564:goto            523
_L10:
		while("signUp".equals(((Object) (sessionevent.predefinedType))) || "login".equals(((Object) (sessionevent.predefinedType))) || "invite".equals(((Object) (sessionevent.predefinedType)))) 
	//* 232  567:ldc2            #331 <String "signUp">
	//* 233  570:aload_1         
	//* 234  571:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 235  574:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 236  577:ifeq            595
		{
			obj = "method";
	//  237  580:ldc1            #14  <String "method">
	//  238  582:astore_2        
			obj1 = ((Object) (sessionevent.predefinedAttributes));
	//  239  583:aload_1         
	//  240  584:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  241  587:astore_3        
			s = "method";
	//  242  588:ldc1            #14  <String "method">
	//  243  590:astore          4
			continue; /* Loop/switch isn't completed */
	//  244  592:goto            136
		}
	//  245  595:ldc2            #333 <String "login">
	//  246  598:aload_1         
	//  247  599:getfield        #255 <Field String SessionEvent.predefinedType>
	//  248  602:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  249  605:ifeq            611
	//  250  608:goto            580
	//  251  611:ldc2            #335 <String "invite">
	//  252  614:aload_1         
	//  253  615:getfield        #255 <Field String SessionEvent.predefinedType>
	//  254  618:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  255  621:ifeq            627
	//* 256  624:goto            580
		if(!"levelStart".equals(((Object) (sessionevent.predefinedType))))
			break; /* Loop/switch isn't completed */
	//  257  627:ldc2            #337 <String "levelStart">
	//  258  630:aload_1         
	//  259  631:getfield        #255 <Field String SessionEvent.predefinedType>
	//  260  634:invokevirtual   #258 <Method boolean String.equals(Object)>
	//  261  637:ifeq            656
		obj = "level_name";
	//  262  640:ldc1            #11  <String "level_name">
	//  263  642:astore_2        
		obj1 = ((Object) (sessionevent.predefinedAttributes));
	//  264  643:aload_1         
	//  265  644:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  266  647:astore_3        
		s = "levelName";
	//  267  648:ldc2            #339 <String "levelName">
	//  268  651:astore          4
		if(true) goto _L12; else goto _L11
	//  269  653:goto            136
_L11:
		if("levelEnd".equals(((Object) (sessionevent.predefinedType))))
	//* 270  656:ldc2            #341 <String "levelEnd">
	//* 271  659:aload_1         
	//* 272  660:getfield        #255 <Field String SessionEvent.predefinedType>
	//* 273  663:invokevirtual   #258 <Method boolean String.equals(Object)>
	//* 274  666:ifeq            743
		{
			putDouble(bundle, "score", mapDouble(sessionevent.predefinedAttributes.get("score")));
	//  275  669:aload_0         
	//  276  670:aload           5
	//  277  672:ldc2            #343 <String "score">
	//  278  675:aload_0         
	//  279  676:aload_1         
	//  280  677:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  281  680:ldc2            #343 <String "score">
	//  282  683:invokeinterface #270 <Method Object Map.get(Object)>
	//  283  688:invokespecial   #345 <Method Double mapDouble(Object)>
	//  284  691:invokespecial   #291 <Method void putDouble(Bundle, String, Double)>
			putString(bundle, "level_name", (String)sessionevent.predefinedAttributes.get("levelName"));
	//  285  694:aload_0         
	//  286  695:aload           5
	//  287  697:ldc1            #11  <String "level_name">
	//  288  699:aload_1         
	//  289  700:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  290  703:ldc2            #339 <String "levelName">
	//  291  706:invokeinterface #270 <Method Object Map.get(Object)>
	//  292  711:checkcast       #26  <Class String>
	//  293  714:invokespecial   #273 <Method void putString(Bundle, String, String)>
			putInt(bundle, "success", mapBooleanValue((String)sessionevent.predefinedAttributes.get("success")));
	//  294  717:aload_0         
	//  295  718:aload           5
	//  296  720:ldc1            #20  <String "success">
	//  297  722:aload_0         
	//  298  723:aload_1         
	//  299  724:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//  300  727:ldc1            #20  <String "success">
	//  301  729:invokeinterface #270 <Method Object Map.get(Object)>
	//  302  734:checkcast       #26  <Class String>
	//  303  737:invokespecial   #347 <Method Integer mapBooleanValue(String)>
	//  304  740:invokespecial   #350 <Method void putInt(Bundle, String, Integer)>
		}
_L3:
		mapCustomEventAttributes(bundle, sessionevent.customAttributes);
	//  305  743:aload_0         
	//  306  744:aload           5
	//  307  746:aload_1         
	//  308  747:getfield        #353 <Field Map SessionEvent.customAttributes>
	//  309  750:invokespecial   #355 <Method void mapCustomEventAttributes(Bundle, Map)>
		return bundle;
	//  310  753:aload           5
	//  311  755:areturn         
		if(true) goto _L14; else goto _L13
_L13:
	}

	private String mapPredefinedEventName(String s, boolean flag)
	{
		boolean flag1;
label0:
		{
			int i;
label1:
			{
				flag1 = true;
	//    0    0:iconst_1        
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
	//	               23457852: 311
	//	               103149417: 295
	//	               109400031: 280
	//	               196004670: 264
	//	               1664021448: 249
	//	               1743324417: 235
	//*  52  232:goto            420
			case 1743324417: 
				if(s.equals("purchase"))
	//*  53  235:aload_1         
	//*  54  236:ldc1            #250 <String "purchase">
	//*  55  238:invokevirtual   #258 <Method boolean String.equals(Object)>
	//*  56  241:ifeq            420
				{
					byte0 = 0;
	//   57  244:iconst_0        
	//   58  245:istore_3        
					break label2;
	//   59  246:goto            422
				}
				break;

			case 1664021448: 
				if(!s.equals("startCheckout"))
					break;
	//   60  249:aload_1         
	//   61  250:ldc2            #301 <String "startCheckout">
	//   62  253:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   63  256:ifeq            420
				byte0 = 2;
	//   64  259:iconst_2        
	//   65  260:istore_3        
				break label2;
	//   66  261:goto            422

			case 196004670: 
				if(!s.equals("levelStart"))
					break;
	//   67  264:aload_1         
	//   68  265:ldc2            #337 <String "levelStart">
	//   69  268:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   70  271:ifeq            420
				byte0 = 10;
	//   71  274:bipush          10
	//   72  276:istore_3        
				break label2;
	//   73  277:goto            422

			case 109400031: 
				if(!s.equals("share"))
					break;
	//   74  280:aload_1         
	//   75  281:ldc2            #329 <String "share">
	//   76  284:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   77  287:ifeq            420
				byte0 = 5;
	//   78  290:iconst_5        
	//   79  291:istore_3        
				break label2;
	//   80  292:goto            422

			case 103149417: 
				if(!s.equals("login"))
					break;
	//   81  295:aload_1         
	//   82  296:ldc2            #333 <String "login">
	//   83  299:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   84  302:ifeq            420
				byte0 = 8;
	//   85  305:bipush          8
	//   86  307:istore_3        
				break label2;
	//   87  308:goto            422

			case 23457852: 
				if(!s.equals("addToCart"))
					break;
	//   88  311:aload_1         
	//   89  312:ldc2            #295 <String "addToCart">
	//   90  315:invokevirtual   #258 <Method boolean String.equals(Object)>
	//   91  318:ifeq            420
				byte0 = ((byte) (flag1));
	//   92  321:iload           4
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
		boolean flag2 = SessionEvent.Type.CUSTOM.equals(((Object) (sessionevent.type)));
	//    0    0:getstatic       #414 <Field SessionEvent$Type SessionEvent$Type.CUSTOM>
	//    1    3:aload_1         
	//    2    4:getfield        #417 <Field SessionEvent$Type SessionEvent.type>
	//    3    7:invokevirtual   #418 <Method boolean SessionEvent$Type.equals(Object)>
	//    4   10:istore          4
		boolean flag4 = false;
	//    5   12:iconst_0        
	//    6   13:istore          5
		boolean flag;
		if(flag2 && sessionevent.customType != null)
	//*   7   15:iload           4
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
	//*  60  120:ifeq            177
		{
			String s = (String)sessionevent.predefinedAttributes.get("success");
	//   61  123:aload_1         
	//   62  124:getfield        #264 <Field Map SessionEvent.predefinedAttributes>
	//   63  127:ldc1            #20  <String "success">
	//   64  129:invokeinterface #270 <Method Object Map.get(Object)>
	//   65  134:checkcast       #26  <Class String>
	//   66  137:astore          7
			boolean flag3 = flag4;
	//   67  139:iload           5
	//   68  141:istore          4
			if(s != null)
	//*  69  143:aload           7
	//*  70  145:ifnull          163
			{
				flag3 = flag4;
	//   71  148:iload           5
	//   72  150:istore          4
				if(!Boolean.parseBoolean(s))
	//*  73  152:aload           7
	//*  74  154:invokestatic    #431 <Method boolean Boolean.parseBoolean(String)>
	//*  75  157:ifne            163
					flag3 = true;
	//   76  160:iconst_1        
	//   77  161:istore          4
			}
			sessionevent = ((SessionEvent) (mapPredefinedEventName(sessionevent.predefinedType, flag3)));
	//   78  163:aload_0         
	//   79  164:aload_1         
	//   80  165:getfield        #255 <Field String SessionEvent.predefinedType>
	//   81  168:iload           4
	//   82  170:invokespecial   #433 <Method String mapPredefinedEventName(String, boolean)>
	//   83  173:astore_1        
		} else
	//*  84  174:goto            186
		{
			sessionevent = ((SessionEvent) (mapCustomEventName(sessionevent.customType)));
	//   85  177:aload_0         
	//   86  178:aload_1         
	//   87  179:getfield        #421 <Field String SessionEvent.customType>
	//   88  182:invokespecial   #371 <Method String mapCustomEventName(String)>
	//   89  185:astore_1        
		}
		c.g().a("Answers", "Logging event into firebase...");
	//   90  186:invokestatic    #439 <Method l c.g()>
	//   91  189:ldc2            #441 <String "Answers">
	//   92  192:ldc2            #443 <String "Logging event into firebase...">
	//   93  195:invokeinterface #448 <Method void l.a(String, String)>
		return new FirebaseAnalyticsEvent(((String) (sessionevent)), bundle);
	//   94  200:new             #450 <Class FirebaseAnalyticsEvent>
	//   95  203:dup             
	//   96  204:aload_1         
	//   97  205:aload           6
	//   98  207:invokespecial   #453 <Method void FirebaseAnalyticsEvent(String, Bundle)>
	//   99  210:areturn         
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
