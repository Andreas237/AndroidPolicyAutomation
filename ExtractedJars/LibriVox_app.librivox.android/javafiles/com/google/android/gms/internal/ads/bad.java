// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bae, azz

public final class bad
{

	public bad(azz azz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = "googleads.g.doubleclick.net";
	//    2    4:aload_0         
	//    3    5:ldc1            #30  <String "googleads.g.doubleclick.net">
	//    4    7:putfield        #32  <Field String a>
		b = "/pagead/ads";
	//    5   10:aload_0         
	//    6   11:ldc1            #34  <String "/pagead/ads">
	//    7   13:putfield        #36  <Field String b>
		c = "ad.doubleclick.net";
	//    8   16:aload_0         
	//    9   17:ldc1            #38  <String "ad.doubleclick.net">
	//   10   19:putfield        #40  <Field String c>
	//   11   22:aload_0         
	//   12   23:iconst_3        
	//   13   24:anewarray       String[]
	//   14   27:dup             
	//   15   28:iconst_0        
	//   16   29:ldc1            #42  <String ".doubleclick.net">
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_1        
	//   20   34:ldc1            #44  <String ".googleadservices.com">
	//   21   36:aastore         
	//   22   37:dup             
	//   23   38:iconst_2        
	//   24   39:ldc1            #46  <String ".googlesyndication.com">
	//   25   41:aastore         
	//   26   42:putfield        #48  <Field String[] d>
		f = azz1;
	//   27   45:aload_0         
	//   28   46:aload_1         
	//   29   47:putfield        #50  <Field azz f>
	//   30   50:return          
	}

	private final Uri a(Uri uri, Context context, String s, boolean flag, View view, Activity activity)
	{
		int i;
		int j;
		boolean flag1;
		try
		{
			flag1 = c(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method boolean c(Uri)>
	//    3    5:istore          9
		}
	//*   4    7:iload           9
	//*   5    9:ifeq            37
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #62  <Method String Uri.toString()>
	//*   8   16:ldc1            #64  <String "dc_ms=">
	//*   9   18:invokevirtual   #68  <Method boolean String.contains(CharSequence)>
	//*  10   21:ifne            27
	//*  11   24:goto            46
	//*  12   27:new             #70  <Class bae>
	//*  13   30:dup             
	//*  14   31:ldc1            #72  <String "Parameter already exists: dc_ms">
	//*  15   33:invokespecial   #75  <Method void bae(String)>
	//*  16   36:athrow          
	//*  17   37:aload_1         
	//*  18   38:ldc1            #77  <String "ms">
	//*  19   40:invokevirtual   #81  <Method String Uri.getQueryParameter(String)>
	//*  20   43:ifnonnull       388
	//*  21   46:iload           4
	//*  22   48:ifeq            70
	//*  23   51:aload_0         
	//*  24   52:getfield        #50  <Field azz f>
	//*  25   55:aload_2         
	//*  26   56:aload_3         
	//*  27   57:aload           5
	//*  28   59:aload           6
	//*  29   61:invokeinterface #86  <Method String azz.a(Context, String, View, Activity)>
	//*  30   66:astore_2        
	//*  31   67:goto            81
	//*  32   70:aload_0         
	//*  33   71:getfield        #50  <Field azz f>
	//*  34   74:aload_2         
	//*  35   75:invokeinterface #89  <Method String azz.a(Context)>
	//*  36   80:astore_2        
	//*  37   81:iload           9
	//*  38   83:ifeq            270
	//*  39   86:aload_1         
	//*  40   87:invokevirtual   #62  <Method String Uri.toString()>
	//*  41   90:astore_3        
	//*  42   91:aload_3         
	//*  43   92:ldc1            #91  <String ";adurl">
	//*  44   94:invokevirtual   #95  <Method int String.indexOf(String)>
	//*  45   97:istore          7
	//*  46   99:iload           7
	//*  47  101:iconst_m1       
	//*  48  102:icmpeq          172
	//*  49  105:iload           7
	//*  50  107:iconst_1        
	//*  51  108:iadd            
	//*  52  109:istore          7
	//*  53  111:new             #97  <Class StringBuilder>
	//*  54  114:dup             
	//*  55  115:aload_3         
	//*  56  116:iconst_0        
	//*  57  117:iload           7
	//*  58  119:invokevirtual   #101 <Method String String.substring(int, int)>
	//*  59  122:invokespecial   #102 <Method void StringBuilder(String)>
	//*  60  125:astore_1        
	//*  61  126:aload_1         
	//*  62  127:ldc1            #104 <String "dc_ms">
	//*  63  129:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  64  132:pop             
	//*  65  133:aload_1         
	//*  66  134:ldc1            #110 <String "=">
	//*  67  136:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  68  139:pop             
	//*  69  140:aload_1         
	//*  70  141:aload_2         
	//*  71  142:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  72  145:pop             
	//*  73  146:aload_1         
	//*  74  147:ldc1            #112 <String ";">
	//*  75  149:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  76  152:pop             
	//*  77  153:aload_1         
	//*  78  154:aload_3         
	//*  79  155:iload           7
	//*  80  157:invokevirtual   #115 <Method String String.substring(int)>
	//*  81  160:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  82  163:pop             
	//*  83  164:aload_1         
	//*  84  165:invokevirtual   #116 <Method String StringBuilder.toString()>
	//*  85  168:invokestatic    #120 <Method Uri Uri.parse(String)>
	//*  86  171:areturn         
	//*  87  172:aload_1         
	//*  88  173:invokevirtual   #123 <Method String Uri.getEncodedPath()>
	//*  89  176:astore_1        
	//*  90  177:aload_3         
	//*  91  178:aload_1         
	//*  92  179:invokevirtual   #95  <Method int String.indexOf(String)>
	//*  93  182:istore          7
	//*  94  184:new             #97  <Class StringBuilder>
	//*  95  187:dup             
	//*  96  188:aload_3         
	//*  97  189:iconst_0        
	//*  98  190:aload_1         
	//*  99  191:invokevirtual   #127 <Method int String.length()>
	//* 100  194:iload           7
	//* 101  196:iadd            
	//* 102  197:invokevirtual   #101 <Method String String.substring(int, int)>
	//* 103  200:invokespecial   #102 <Method void StringBuilder(String)>
	//* 104  203:astore          5
	//* 105  205:aload           5
	//* 106  207:ldc1            #112 <String ";">
	//* 107  209:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 108  212:pop             
	//* 109  213:aload           5
	//* 110  215:ldc1            #104 <String "dc_ms">
	//* 111  217:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 112  220:pop             
	//* 113  221:aload           5
	//* 114  223:ldc1            #110 <String "=">
	//* 115  225:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 116  228:pop             
	//* 117  229:aload           5
	//* 118  231:aload_2         
	//* 119  232:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 120  235:pop             
	//* 121  236:aload           5
	//* 122  238:ldc1            #112 <String ";">
	//* 123  240:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 124  243:pop             
	//* 125  244:aload           5
	//* 126  246:aload_3         
	//* 127  247:iload           7
	//* 128  249:aload_1         
	//* 129  250:invokevirtual   #127 <Method int String.length()>
	//* 130  253:iadd            
	//* 131  254:invokevirtual   #115 <Method String String.substring(int)>
	//* 132  257:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 133  260:pop             
	//* 134  261:aload           5
	//* 135  263:invokevirtual   #116 <Method String StringBuilder.toString()>
	//* 136  266:invokestatic    #120 <Method Uri Uri.parse(String)>
	//* 137  269:areturn         
	//* 138  270:aload_1         
	//* 139  271:invokevirtual   #62  <Method String Uri.toString()>
	//* 140  274:astore_3        
	//* 141  275:aload_3         
	//* 142  276:ldc1            #129 <String "&adurl">
	//* 143  278:invokevirtual   #95  <Method int String.indexOf(String)>
	//* 144  281:istore          8
	//* 145  283:iload           8
	//* 146  285:istore          7
	//* 147  287:iload           8
	//* 148  289:iconst_m1       
	//* 149  290:icmpne          301
	//* 150  293:aload_3         
	//* 151  294:ldc1            #131 <String "?adurl">
	//* 152  296:invokevirtual   #95  <Method int String.indexOf(String)>
	//* 153  299:istore          7
	//* 154  301:iload           7
	//* 155  303:iconst_m1       
	//* 156  304:icmpeq          374
	//* 157  307:iload           7
	//* 158  309:iconst_1        
	//* 159  310:iadd            
	//* 160  311:istore          7
	//* 161  313:new             #97  <Class StringBuilder>
	//* 162  316:dup             
	//* 163  317:aload_3         
	//* 164  318:iconst_0        
	//* 165  319:iload           7
	//* 166  321:invokevirtual   #101 <Method String String.substring(int, int)>
	//* 167  324:invokespecial   #102 <Method void StringBuilder(String)>
	//* 168  327:astore_1        
	//* 169  328:aload_1         
	//* 170  329:ldc1            #77  <String "ms">
	//* 171  331:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 172  334:pop             
	//* 173  335:aload_1         
	//* 174  336:ldc1            #110 <String "=">
	//* 175  338:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 176  341:pop             
	//* 177  342:aload_1         
	//* 178  343:aload_2         
	//* 179  344:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 180  347:pop             
	//* 181  348:aload_1         
	//* 182  349:ldc1            #133 <String "&">
	//* 183  351:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 184  354:pop             
	//* 185  355:aload_1         
	//* 186  356:aload_3         
	//* 187  357:iload           7
	//* 188  359:invokevirtual   #115 <Method String String.substring(int)>
	//* 189  362:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 190  365:pop             
	//* 191  366:aload_1         
	//* 192  367:invokevirtual   #116 <Method String StringBuilder.toString()>
	//* 193  370:invokestatic    #120 <Method Uri Uri.parse(String)>
	//* 194  373:areturn         
	//* 195  374:aload_1         
	//* 196  375:invokevirtual   #137 <Method android.net.Uri$Builder Uri.buildUpon()>
	//* 197  378:ldc1            #77  <String "ms">
	//* 198  380:aload_2         
	//* 199  381:invokevirtual   #143 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//* 200  384:invokevirtual   #147 <Method Uri android.net.Uri$Builder.build()>
	//* 201  387:areturn         
	//* 202  388:new             #70  <Class bae>
	//* 203  391:dup             
	//* 204  392:ldc1            #149 <String "Query parameter already exists: ms">
	//* 205  394:invokespecial   #75  <Method void bae(String)>
	//* 206  397:athrow          
	//* 207  398:new             #70  <Class bae>
	//* 208  401:dup             
	//* 209  402:ldc1            #151 <String "Provided Uri is not in a valid state">
	//* 210  404:invokespecial   #75  <Method void bae(String)>
	//* 211  407:athrow          
		// Misplaced declaration of an exception variable
		catch(Uri uri)
		{
			throw new bae("Provided Uri is not in a valid state");
		}
		if(!flag1)
			break MISSING_BLOCK_LABEL_37;
		if(!uri.toString().contains("dc_ms="))
			break MISSING_BLOCK_LABEL_46;
		throw new bae("Parameter already exists: dc_ms");
		if(uri.getQueryParameter("ms") != null)
			break MISSING_BLOCK_LABEL_388;
		if(!flag)
			break MISSING_BLOCK_LABEL_70;
		context = ((Context) (f.a(context, s, view, activity)));
		break MISSING_BLOCK_LABEL_81;
		context = ((Context) (f.a(context)));
		if(!flag1)
			break MISSING_BLOCK_LABEL_270;
		s = uri.toString();
		i = s.indexOf(";adurl");
		if(i == -1)
			break MISSING_BLOCK_LABEL_172;
		i++;
		uri = ((Uri) (new StringBuilder(s.substring(0, i))));
		((StringBuilder) (uri)).append("dc_ms");
		((StringBuilder) (uri)).append("=");
		((StringBuilder) (uri)).append(((String) (context)));
		((StringBuilder) (uri)).append(";");
		((StringBuilder) (uri)).append(s.substring(i));
		return Uri.parse(((StringBuilder) (uri)).toString());
		uri = ((Uri) (uri.getEncodedPath()));
		i = s.indexOf(((String) (uri)));
		view = ((View) (new StringBuilder(s.substring(0, ((String) (uri)).length() + i))));
		((StringBuilder) (view)).append(";");
		((StringBuilder) (view)).append("dc_ms");
		((StringBuilder) (view)).append("=");
		((StringBuilder) (view)).append(((String) (context)));
		((StringBuilder) (view)).append(";");
		((StringBuilder) (view)).append(s.substring(i + ((String) (uri)).length()));
		return Uri.parse(((StringBuilder) (view)).toString());
		s = uri.toString();
		j = s.indexOf("&adurl");
		i = j;
		if(j != -1)
			break MISSING_BLOCK_LABEL_301;
		i = s.indexOf("?adurl");
		if(i == -1)
			break MISSING_BLOCK_LABEL_374;
		i++;
		uri = ((Uri) (new StringBuilder(s.substring(0, i))));
		((StringBuilder) (uri)).append("ms");
		((StringBuilder) (uri)).append("=");
		((StringBuilder) (uri)).append(((String) (context)));
		((StringBuilder) (uri)).append("&");
		((StringBuilder) (uri)).append(s.substring(i));
		return Uri.parse(((StringBuilder) (uri)).toString());
		return uri.buildUpon().appendQueryParameter("ms", ((String) (context))).build();
		throw new bae("Query parameter already exists: ms");
	//* 212  408:astore_1        
	//* 213  409:goto            398
	}

	private final boolean c(Uri uri)
	{
		if(uri != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			boolean flag;
			try
			{
				flag = uri.getHost().equals(((Object) (c)));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method String Uri.getHost()>
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field String c>
	//    6   12:invokevirtual   #160 <Method boolean String.equals(Object)>
	//    7   15:istore_2        
			}
	//*   8   16:iload_2         
	//*   9   17:ireturn         
	//*  10   18:iconst_0        
	//*  11   19:ireturn         
	//*  12   20:new             #153 <Class NullPointerException>
	//*  13   23:dup             
	//*  14   24:invokespecial   #161 <Method void NullPointerException()>
	//*  15   27:athrow          
			// Misplaced declaration of an exception variable
			catch(Uri uri)
			{
				return false;
			}
			return flag;
		} else
		{
			throw new NullPointerException();
		}
	//*  16   28:astore_1        
	//*  17   29:goto            18
	}

	public final Uri a(Uri uri, Context context)
	{
		return a(uri, context, ((String) (null)), false, ((View) (null)), ((Activity) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_0        
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:invokespecial   #164 <Method Uri a(Uri, Context, String, boolean, View, Activity)>
	//    8   10:areturn         
	}

	public final Uri a(Uri uri, Context context, View view, Activity activity)
	{
		try
		{
			uri = a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:ldc1            #167 <String "ai">
	//    5    6:invokevirtual   #81  <Method String Uri.getQueryParameter(String)>
	//    6    9:iconst_1        
	//    7   10:aload_3         
	//    8   11:aload           4
	//    9   13:invokespecial   #164 <Method Uri a(Uri, Context, String, boolean, View, Activity)>
	//   10   16:astore_1        
		}
	//*  11   17:aload_1         
	//*  12   18:areturn         
	//*  13   19:new             #70  <Class bae>
	//*  14   22:dup             
	//*  15   23:ldc1            #151 <String "Provided Uri is not in a valid state">
	//*  16   25:invokespecial   #75  <Method void bae(String)>
	//*  17   28:athrow          
		// Misplaced declaration of an exception variable
		catch(Uri uri)
		{
			throw new bae("Provided Uri is not in a valid state");
		}
		return uri;
	//*  18   29:astore_1        
	//*  19   30:goto            19
	}

	public final azz a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field azz f>
	//    2    4:areturn         
	}

	public final void a(MotionEvent motionevent)
	{
		f.a(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field azz f>
	//    2    4:aload_1         
	//    3    5:invokeinterface #171 <Method void azz.a(MotionEvent)>
	//    4   10:return          
	}

	public final boolean a(Uri uri)
	{
		if(uri == null)
			break MISSING_BLOCK_LABEL_52;
	//    0    0:aload_1         
	//    1    1:ifnull          52
		int i;
		int j;
		boolean flag;
		String as[];
		try
		{
			uri = ((Uri) (uri.getHost()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method String Uri.getHost()>
	//    4    8:astore_1        
			as = d;
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field String[] d>
	//    7   13:astore          5
			j = as.length;
	//    8   15:aload           5
	//    9   17:arraylength     
	//   10   18:istore_3        
		}
	//*  11   19:iconst_0        
	//*  12   20:istore_2        
	//*  13   21:iload_2         
	//*  14   22:iload_3         
	//*  15   23:icmpge          50
	//*  16   26:aload_1         
	//*  17   27:aload           5
	//*  18   29:iload_2         
	//*  19   30:aaload          
	//*  20   31:invokevirtual   #175 <Method boolean String.endsWith(String)>
	//*  21   34:istore          4
	//*  22   36:iload           4
	//*  23   38:ifeq            43
	//*  24   41:iconst_1        
	//*  25   42:ireturn         
	//*  26   43:iload_2         
	//*  27   44:iconst_1        
	//*  28   45:iadd            
	//*  29   46:istore_2        
	//*  30   47:goto            21
	//*  31   50:iconst_0        
	//*  32   51:ireturn         
	//*  33   52:new             #153 <Class NullPointerException>
	//*  34   55:dup             
	//*  35   56:invokespecial   #161 <Method void NullPointerException()>
	//*  36   59:athrow          
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*  37   60:astore_1        
		{
			return false;
	//   38   61:iconst_0        
	//   39   62:ireturn         
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		flag = ((String) (uri)).endsWith(as[i]);
		if(flag)
			return true;
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_21;
_L1:
		return false;
		throw new NullPointerException();
	}

	public final boolean b(Uri uri)
	{
		if(a(uri))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #177 <Method boolean a(Uri)>
	//*   3    5:ifeq            51
		{
			String as[] = e;
	//    4    8:getstatic       #23  <Field String[] e>
	//    5   11:astore          4
			int j = as.length;
	//    6   13:aload           4
	//    7   15:arraylength     
	//    8   16:istore_3        
			for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:iload_3         
	//*  13   21:icmpge          51
			{
				String s = as[i];
	//   14   24:aload           4
	//   15   26:iload_2         
	//   16   27:aaload          
	//   17   28:astore          5
				if(uri.getPath().endsWith(s))
	//*  18   30:aload_1         
	//*  19   31:invokevirtual   #180 <Method String Uri.getPath()>
	//*  20   34:aload           5
	//*  21   36:invokevirtual   #175 <Method boolean String.endsWith(String)>
	//*  22   39:ifeq            44
					return true;
	//   23   42:iconst_1        
	//   24   43:ireturn         
			}

	//   25   44:iload_2         
	//   26   45:iconst_1        
	//   27   46:iadd            
	//   28   47:istore_2        
		}
	//*  29   48:goto            19
		return false;
	//   30   51:iconst_0        
	//   31   52:ireturn         
	}

	private static final String e[] = {
		"/aclk", "/pcs/click"
	};
	private String a;
	private String b;
	private String c;
	private String d[] = {
		".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"
	};
	private azz f;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #19  <String "/aclk">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #21  <String "/pcs/click">
	//    9   13:aastore         
	//   10   14:putstatic       #23  <Field String[] e>
	//*  11   17:return          
	}
}
