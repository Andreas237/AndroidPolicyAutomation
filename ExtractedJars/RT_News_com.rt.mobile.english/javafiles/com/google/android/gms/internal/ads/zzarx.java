// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni, zzakb

public final class zzarx
{

	public static transient String zzb(String s, String as[])
	{
		if(as.length == 0)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:ifne            7
			return s;
	//    3    5:aload_0         
	//    4    6:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #31  <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #34  <Method void StringBuilder()>
	//    8   14:astore          7
		Object obj = ((Object) (zzdeo.matcher(((CharSequence) (s)))));
	//    9   16:getstatic       #20  <Field Pattern zzdeo>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #38  <Method Matcher Pattern.matcher(CharSequence)>
	//   12   23:astore          6
		boolean flag = ((Matcher) (obj)).find();
	//   13   25:aload           6
	//   14   27:invokevirtual   #44  <Method boolean Matcher.find()>
	//   15   30:istore          5
		int k = 0;
	//   16   32:iconst_0        
	//   17   33:istore_3        
		int i = 0;
	//   18   34:iconst_0        
	//   19   35:istore_2        
		if(flag)
	//*  20   36:iload           5
	//*  21   38:ifeq            104
		{
			k = ((Matcher) (obj)).end();
	//   22   41:aload           6
	//   23   43:invokevirtual   #48  <Method int Matcher.end()>
	//   24   46:istore_3        
			stringbuilder.append(s.substring(0, k));
	//   25   47:aload           7
	//   26   49:aload_0         
	//   27   50:iconst_0        
	//   28   51:iload_3         
	//   29   52:invokevirtual   #54  <Method String String.substring(int, int)>
	//   30   55:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
			for(int l = as.length; i < l; i++)
	//*  32   59:aload_1         
	//*  33   60:arraylength     
	//*  34   61:istore          4
	//*  35   63:iload_2         
	//*  36   64:iload           4
	//*  37   66:icmpge          94
			{
				obj = ((Object) (as[i]));
	//   38   69:aload_1         
	//   39   70:iload_2         
	//   40   71:aaload          
	//   41   72:astore          6
				if(obj != null)
	//*  42   74:aload           6
	//*  43   76:ifnull          87
					stringbuilder.append(((String) (obj)));
	//   44   79:aload           7
	//   45   81:aload           6
	//   46   83:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   47   86:pop             
			}

	//   48   87:iload_2         
	//   49   88:iconst_1        
	//   50   89:iadd            
	//   51   90:istore_2        
	//*  52   91:goto            63
			obj = ((Object) (s.substring(k)));
	//   53   94:aload_0         
	//   54   95:iload_3         
	//   55   96:invokevirtual   #61  <Method String String.substring(int)>
	//   56   99:astore          6
		} else
	//*  57  101:goto            160
		{
			obj = ((Object) (s));
	//   58  104:aload_0         
	//   59  105:astore          6
			if(!zzdep.matcher(((CharSequence) (s))).find())
	//*  60  107:getstatic       #24  <Field Pattern zzdep>
	//*  61  110:aload_0         
	//*  62  111:invokevirtual   #38  <Method Matcher Pattern.matcher(CharSequence)>
	//*  63  114:invokevirtual   #44  <Method boolean Matcher.find()>
	//*  64  117:ifne            160
			{
				int i1 = as.length;
	//   65  120:aload_1         
	//   66  121:arraylength     
	//   67  122:istore          4
				int j = k;
	//   68  124:iload_3         
	//   69  125:istore_2        
				do
				{
					obj = ((Object) (s));
	//   70  126:aload_0         
	//   71  127:astore          6
					if(j >= i1)
						break;
	//   72  129:iload_2         
	//   73  130:iload           4
	//   74  132:icmpge          160
					obj = ((Object) (as[j]));
	//   75  135:aload_1         
	//   76  136:iload_2         
	//   77  137:aaload          
	//   78  138:astore          6
					if(obj != null)
	//*  79  140:aload           6
	//*  80  142:ifnull          153
						stringbuilder.append(((String) (obj)));
	//   81  145:aload           7
	//   82  147:aload           6
	//   83  149:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   84  152:pop             
					j++;
	//   85  153:iload_2         
	//   86  154:iconst_1        
	//   87  155:iadd            
	//   88  156:istore_2        
				} while(true);
	//   89  157:goto            126
			}
		}
		stringbuilder.append(((String) (obj)));
	//   90  160:aload           7
	//   91  162:aload           6
	//   92  164:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   93  167:pop             
		return stringbuilder.toString();
	//   94  168:aload           7
	//   95  170:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   96  173:areturn         
	}

	public static String zzvp()
	{
		Object obj = ((Object) (zznk.zzawf));
	//    0    0:getstatic       #75  <Field zzna zznk.zzawf>
	//    1    3:astore_0        
		Object obj1 = ((Object) ((String)zzkb.zzik().zzd(((zzna) (obj)))));
	//    2    4:invokestatic    #81  <Method zzni zzkb.zzik()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #87  <Method Object zzni.zzd(zzna)>
	//    5   11:checkcast       #50  <Class String>
	//    6   14:astore_1        
		obj = ((Object) (new JSONObject()));
	//    7   15:new             #89  <Class JSONObject>
	//    8   18:dup             
	//    9   19:invokespecial   #90  <Method void JSONObject()>
	//   10   22:astore_0        
		try
		{
			((JSONObject) (obj)).put("version", obj1);
	//   11   23:aload_0         
	//   12   24:ldc1            #92  <String "version">
	//   13   26:aload_1         
	//   14   27:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   15   30:pop             
			((JSONObject) (obj)).put("sdk", "Google Mobile Ads");
	//   16   31:aload_0         
	//   17   32:ldc1            #98  <String "sdk">
	//   18   34:ldc1            #100 <String "Google Mobile Ads">
	//   19   36:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   20   39:pop             
			((JSONObject) (obj)).put("sdkVersion", "12.4.51-000");
	//   21   40:aload_0         
	//   22   41:ldc1            #102 <String "sdkVersion">
	//   23   43:ldc1            #104 <String "12.4.51-000">
	//   24   45:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   25   48:pop             
		}
	//*  26   49:new             #31  <Class StringBuilder>
	//*  27   52:dup             
	//*  28   53:invokespecial   #34  <Method void StringBuilder()>
	//*  29   56:astore_1        
	//*  30   57:aload_1         
	//*  31   58:ldc1            #106 <String "<script>">
	//*  32   60:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  33   63:pop             
	//*  34   64:aload_1         
	//*  35   65:ldc1            #108 <String "Object.defineProperty(window,'MRAID_ENV',{get:function(){return ">
	//*  36   67:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  37   70:pop             
	//*  38   71:aload_1         
	//*  39   72:aload_0         
	//*  40   73:invokevirtual   #109 <Method String JSONObject.toString()>
	//*  41   76:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  42   79:pop             
	//*  43   80:aload_1         
	//*  44   81:ldc1            #111 <String "}});">
	//*  45   83:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  46   86:pop             
	//*  47   87:aload_1         
	//*  48   88:ldc1            #113 <String "</script>">
	//*  49   90:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  50   93:pop             
	//*  51   94:aload_1         
	//*  52   95:invokevirtual   #65  <Method String StringBuilder.toString()>
	//*  53   98:areturn         
		catch(JSONException jsonexception)
	//*  54   99:astore_0        
		{
			zzakb.zzc("Unable to build MRAID_ENV", ((Throwable) (jsonexception)));
	//   55  100:ldc1            #115 <String "Unable to build MRAID_ENV">
	//   56  102:aload_0         
	//   57  103:invokestatic    #121 <Method void zzakb.zzc(String, Throwable)>
			return null;
	//   58  106:aconst_null     
	//   59  107:areturn         
		}
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("<script>");
		((StringBuilder) (obj1)).append("Object.defineProperty(window,'MRAID_ENV',{get:function(){return ");
		((StringBuilder) (obj1)).append(((JSONObject) (obj)).toString());
		((StringBuilder) (obj1)).append("}});");
		((StringBuilder) (obj1)).append("</script>");
		return ((StringBuilder) (obj1)).toString();
	}

	private static final Pattern zzdeo = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
	private static final Pattern zzdep = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

	static 
	{
	//    0    0:ldc1            #12  <String "^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>">
	//    1    2:iconst_2        
	//    2    3:invokestatic    #18  <Method Pattern Pattern.compile(String, int)>
	//    3    6:putstatic       #20  <Field Pattern zzdeo>
	//    4    9:ldc1            #22  <String "^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>">
	//    5   11:iconst_2        
	//    6   12:invokestatic    #18  <Method Pattern Pattern.compile(String, int)>
	//    7   15:putstatic       #24  <Field Pattern zzdep>
	//*   8   18:return          
	}
}
