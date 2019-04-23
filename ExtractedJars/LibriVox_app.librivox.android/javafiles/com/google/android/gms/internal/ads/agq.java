// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			p, bwk, m, wx

public final class agq
{

	public static String a()
	{
		Object obj = ((Object) (p.I));
	//    0    0:getstatic       #34  <Field e p.I>
	//    1    3:astore_0        
		Object obj1 = ((Object) ((String)bwk.e().a(((e) (obj)))));
	//    2    4:invokestatic    #40  <Method m bwk.e()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #45  <Method Object m.a(e)>
	//    5   11:checkcast       #47  <Class String>
	//    6   14:astore_1        
		obj = ((Object) (new JSONObject()));
	//    7   15:new             #49  <Class JSONObject>
	//    8   18:dup             
	//    9   19:invokespecial   #52  <Method void JSONObject()>
	//   10   22:astore_0        
		try
		{
			((JSONObject) (obj)).put("version", obj1);
	//   11   23:aload_0         
	//   12   24:ldc1            #54  <String "version">
	//   13   26:aload_1         
	//   14   27:invokevirtual   #58  <Method JSONObject JSONObject.put(String, Object)>
	//   15   30:pop             
			((JSONObject) (obj)).put("sdk", "Google Mobile Ads");
	//   16   31:aload_0         
	//   17   32:ldc1            #60  <String "sdk">
	//   18   34:ldc1            #62  <String "Google Mobile Ads">
	//   19   36:invokevirtual   #58  <Method JSONObject JSONObject.put(String, Object)>
	//   20   39:pop             
			((JSONObject) (obj)).put("sdkVersion", "12.4.51-000");
	//   21   40:aload_0         
	//   22   41:ldc1            #64  <String "sdkVersion">
	//   23   43:ldc1            #66  <String "12.4.51-000">
	//   24   45:invokevirtual   #58  <Method JSONObject JSONObject.put(String, Object)>
	//   25   48:pop             
		}
	//*  26   49:new             #68  <Class StringBuilder>
	//*  27   52:dup             
	//*  28   53:invokespecial   #69  <Method void StringBuilder()>
	//*  29   56:astore_1        
	//*  30   57:aload_1         
	//*  31   58:ldc1            #71  <String "<script>">
	//*  32   60:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  33   63:pop             
	//*  34   64:aload_1         
	//*  35   65:ldc1            #77  <String "Object.defineProperty(window,'MRAID_ENV',{get:function(){return ">
	//*  36   67:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  37   70:pop             
	//*  38   71:aload_1         
	//*  39   72:aload_0         
	//*  40   73:invokevirtual   #80  <Method String JSONObject.toString()>
	//*  41   76:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  42   79:pop             
	//*  43   80:aload_1         
	//*  44   81:ldc1            #82  <String "}});">
	//*  45   83:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  46   86:pop             
	//*  47   87:aload_1         
	//*  48   88:ldc1            #84  <String "</script>">
	//*  49   90:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  50   93:pop             
	//*  51   94:aload_1         
	//*  52   95:invokevirtual   #85  <Method String StringBuilder.toString()>
	//*  53   98:areturn         
		catch(JSONException jsonexception)
	//*  54   99:astore_0        
		{
			wx.c("Unable to build MRAID_ENV", ((Throwable) (jsonexception)));
	//   55  100:ldc1            #87  <String "Unable to build MRAID_ENV">
	//   56  102:aload_0         
	//   57  103:invokestatic    #93  <Method void wx.c(String, Throwable)>
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

	public static transient String a(String s, String as[])
	{
		if(as.length == 0)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:ifne            7
			return s;
	//    3    5:aload_0         
	//    4    6:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #68  <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #69  <Method void StringBuilder()>
	//    8   14:astore          6
		Matcher matcher = a.matcher(((CharSequence) (s)));
	//    9   16:getstatic       #20  <Field Pattern a>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #98  <Method Matcher Pattern.matcher(CharSequence)>
	//   12   23:astore          7
		boolean flag = matcher.find();
	//   13   25:aload           7
	//   14   27:invokevirtual   #104 <Method boolean Matcher.find()>
	//   15   30:istore          5
		int k = 0;
	//   16   32:iconst_0        
	//   17   33:istore_3        
		int i = 0;
	//   18   34:iconst_0        
	//   19   35:istore_2        
		if(flag)
	//*  20   36:iload           5
	//*  21   38:ifeq            108
		{
			k = matcher.end();
	//   22   41:aload           7
	//   23   43:invokevirtual   #108 <Method int Matcher.end()>
	//   24   46:istore_3        
			stringbuilder.append(s.substring(0, k));
	//   25   47:aload           6
	//   26   49:aload_0         
	//   27   50:iconst_0        
	//   28   51:iload_3         
	//   29   52:invokevirtual   #112 <Method String String.substring(int, int)>
	//   30   55:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
			for(int l = as.length; i < l; i++)
	//*  32   59:aload_1         
	//*  33   60:arraylength     
	//*  34   61:istore          4
	//*  35   63:iload_2         
	//*  36   64:iload           4
	//*  37   66:icmpge          94
			{
				String s1 = as[i];
	//   38   69:aload_1         
	//   39   70:iload_2         
	//   40   71:aaload          
	//   41   72:astore          7
				if(s1 != null)
	//*  42   74:aload           7
	//*  43   76:ifnull          87
					stringbuilder.append(s1);
	//   44   79:aload           6
	//   45   81:aload           7
	//   46   83:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   47   86:pop             
			}

	//   48   87:iload_2         
	//   49   88:iconst_1        
	//   50   89:iadd            
	//   51   90:istore_2        
	//*  52   91:goto            63
			stringbuilder.append(s.substring(k));
	//   53   94:aload           6
	//   54   96:aload_0         
	//   55   97:iload_3         
	//   56   98:invokevirtual   #115 <Method String String.substring(int)>
	//   57  101:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   58  104:pop             
		} else
	//*  59  105:goto            165
		{
			if(!b.matcher(((CharSequence) (s))).find())
	//*  60  108:getstatic       #24  <Field Pattern b>
	//*  61  111:aload_0         
	//*  62  112:invokevirtual   #98  <Method Matcher Pattern.matcher(CharSequence)>
	//*  63  115:invokevirtual   #104 <Method boolean Matcher.find()>
	//*  64  118:ifne            158
			{
				int i1 = as.length;
	//   65  121:aload_1         
	//   66  122:arraylength     
	//   67  123:istore          4
				for(int j = k; j < i1; j++)
	//*  68  125:iload_3         
	//*  69  126:istore_2        
	//*  70  127:iload_2         
	//*  71  128:iload           4
	//*  72  130:icmpge          158
				{
					String s2 = as[j];
	//   73  133:aload_1         
	//   74  134:iload_2         
	//   75  135:aaload          
	//   76  136:astore          7
					if(s2 != null)
	//*  77  138:aload           7
	//*  78  140:ifnull          151
						stringbuilder.append(s2);
	//   79  143:aload           6
	//   80  145:aload           7
	//   81  147:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   82  150:pop             
				}

	//   83  151:iload_2         
	//   84  152:iconst_1        
	//   85  153:iadd            
	//   86  154:istore_2        
			}
	//*  87  155:goto            127
			stringbuilder.append(s);
	//   88  158:aload           6
	//   89  160:aload_0         
	//   90  161:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   91  164:pop             
		}
		return stringbuilder.toString();
	//   92  165:aload           6
	//   93  167:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   94  170:areturn         
	}

	private static final Pattern a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
	private static final Pattern b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

	static 
	{
	//    0    0:ldc1            #12  <String "^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>">
	//    1    2:iconst_2        
	//    2    3:invokestatic    #18  <Method Pattern Pattern.compile(String, int)>
	//    3    6:putstatic       #20  <Field Pattern a>
	//    4    9:ldc1            #22  <String "^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>">
	//    5   11:iconst_2        
	//    6   12:invokestatic    #18  <Method Pattern Pattern.compile(String, int)>
	//    7   15:putstatic       #24  <Field Pattern b>
	//*   8   18:return          
	}
}
