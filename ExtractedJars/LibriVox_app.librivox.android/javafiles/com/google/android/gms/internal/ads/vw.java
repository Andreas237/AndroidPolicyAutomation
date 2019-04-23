// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			vt, p, bwk, m, 
//			xg

public final class vw
{

	private static Uri a(String s, String s1, String s2)
	{
		int j = s.indexOf("&adurl");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "&adurl">
	//    2    3:invokevirtual   #15  <Method int String.indexOf(String)>
	//    3    6:istore          4
		int i = j;
	//    4    8:iload           4
	//    5   10:istore_3        
		if(j == -1)
	//*   6   11:iload           4
	//*   7   13:iconst_m1       
	//*   8   14:icmpne          24
			i = s.indexOf("?adurl");
	//    9   17:aload_0         
	//   10   18:ldc1            #17  <String "?adurl">
	//   11   20:invokevirtual   #15  <Method int String.indexOf(String)>
	//   12   23:istore_3        
		if(i != -1)
	//*  13   24:iload_3         
	//*  14   25:iconst_m1       
	//*  15   26:icmpeq          98
		{
			i++;
	//   16   29:iload_3         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:istore_3        
			StringBuilder stringbuilder = new StringBuilder(s.substring(0, i));
	//   20   33:new             #19  <Class StringBuilder>
	//   21   36:dup             
	//   22   37:aload_0         
	//   23   38:iconst_0        
	//   24   39:iload_3         
	//   25   40:invokevirtual   #23  <Method String String.substring(int, int)>
	//   26   43:invokespecial   #27  <Method void StringBuilder(String)>
	//   27   46:astore          5
			stringbuilder.append(s1);
	//   28   48:aload           5
	//   29   50:aload_1         
	//   30   51:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   31   54:pop             
			stringbuilder.append("=");
	//   32   55:aload           5
	//   33   57:ldc1            #33  <String "=">
	//   34   59:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   35   62:pop             
			stringbuilder.append(s2);
	//   36   63:aload           5
	//   37   65:aload_2         
	//   38   66:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   39   69:pop             
			stringbuilder.append("&");
	//   40   70:aload           5
	//   41   72:ldc1            #35  <String "&">
	//   42   74:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   43   77:pop             
			stringbuilder.append(s.substring(i));
	//   44   78:aload           5
	//   45   80:aload_0         
	//   46   81:iload_3         
	//   47   82:invokevirtual   #38  <Method String String.substring(int)>
	//   48   85:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   49   88:pop             
			return Uri.parse(stringbuilder.toString());
	//   50   89:aload           5
	//   51   91:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   52   94:invokestatic    #48  <Method Uri Uri.parse(String)>
	//   53   97:areturn         
		} else
		{
			return Uri.parse(s).buildUpon().appendQueryParameter(s1, s2).build();
	//   54   98:aload_0         
	//   55   99:invokestatic    #48  <Method Uri Uri.parse(String)>
	//   56  102:invokevirtual   #52  <Method android.net.Uri$Builder Uri.buildUpon()>
	//   57  105:aload_1         
	//   58  106:aload_2         
	//   59  107:invokevirtual   #58  <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   60  110:invokevirtual   #62  <Method Uri android.net.Uri$Builder.build()>
	//   61  113:areturn         
		}
	}

	public static String a(Uri uri, Context context)
	{
		if(!aw.E().a(context))
	//*   0    0:invokestatic    #70  <Method vt aw.E()>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #75  <Method boolean vt.a(Context)>
	//*   3    7:ifne            15
			return uri.toString();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #76  <Method String Uri.toString()>
	//    6   14:areturn         
		String s = aw.E().e(context);
	//    7   15:invokestatic    #70  <Method vt aw.E()>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #80  <Method String vt.e(Context)>
	//   10   22:astore_3        
		if(s == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       32
			return uri.toString();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #76  <Method String Uri.toString()>
	//   15   31:areturn         
		Object obj = ((Object) (p.af));
	//   16   32:getstatic       #86  <Field e p.af>
	//   17   35:astore_2        
		if(((Boolean)bwk.e().a(((e) (obj)))).booleanValue())
	//*  18   36:invokestatic    #91  <Method m bwk.e()>
	//*  19   39:aload_2         
	//*  20   40:invokevirtual   #96  <Method Object m.a(e)>
	//*  21   43:checkcast       #98  <Class Boolean>
	//*  22   46:invokevirtual   #102 <Method boolean Boolean.booleanValue()>
	//*  23   49:ifeq            103
		{
			obj = ((Object) (p.ag));
	//   24   52:getstatic       #105 <Field e p.ag>
	//   25   55:astore_2        
			String s1 = (String)bwk.e().a(((e) (obj)));
	//   26   56:invokestatic    #91  <Method m bwk.e()>
	//   27   59:aload_2         
	//   28   60:invokevirtual   #96  <Method Object m.a(e)>
	//   29   63:checkcast       #11  <Class String>
	//   30   66:astore          4
			String s2 = uri.toString();
	//   31   68:aload_0         
	//   32   69:invokevirtual   #76  <Method String Uri.toString()>
	//   33   72:astore          5
			obj = ((Object) (uri));
	//   34   74:aload_0         
	//   35   75:astore_2        
			if(s2.contains(((CharSequence) (s1))))
	//*  36   76:aload           5
	//*  37   78:aload           4
	//*  38   80:invokevirtual   #109 <Method boolean String.contains(CharSequence)>
	//*  39   83:ifeq            136
			{
				aw.E().d(context, s);
	//   40   86:invokestatic    #70  <Method vt aw.E()>
	//   41   89:aload_1         
	//   42   90:aload_3         
	//   43   91:invokevirtual   #113 <Method void vt.d(Context, String)>
				return s2.replace(((CharSequence) (s1)), ((CharSequence) (s)));
	//   44   94:aload           5
	//   45   96:aload           4
	//   46   98:aload_3         
	//   47   99:invokevirtual   #117 <Method String String.replace(CharSequence, CharSequence)>
	//   48  102:areturn         
			}
		} else
		{
			obj = ((Object) (uri));
	//   49  103:aload_0         
	//   50  104:astore_2        
			if(TextUtils.isEmpty(((CharSequence) (uri.getQueryParameter("fbs_aeid")))))
	//*  51  105:aload_0         
	//*  52  106:ldc1            #119 <String "fbs_aeid">
	//*  53  108:invokevirtual   #123 <Method String Uri.getQueryParameter(String)>
	//*  54  111:invokestatic    #128 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  55  114:ifeq            136
			{
				obj = ((Object) (a(uri.toString(), "fbs_aeid", s)));
	//   56  117:aload_0         
	//   57  118:invokevirtual   #76  <Method String Uri.toString()>
	//   58  121:ldc1            #119 <String "fbs_aeid">
	//   59  123:aload_3         
	//   60  124:invokestatic    #130 <Method Uri a(String, String, String)>
	//   61  127:astore_2        
				aw.E().d(context, s);
	//   62  128:invokestatic    #70  <Method vt aw.E()>
	//   63  131:aload_1         
	//   64  132:aload_3         
	//   65  133:invokevirtual   #113 <Method void vt.d(Context, String)>
			}
		}
		return ((Uri) (obj)).toString();
	//   66  136:aload_2         
	//   67  137:invokevirtual   #76  <Method String Uri.toString()>
	//   68  140:areturn         
	}

	public static String a(String s, Context context)
	{
		if(aw.E().a(context))
	//*   0    0:invokestatic    #70  <Method vt aw.E()>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #75  <Method boolean vt.a(Context)>
	//*   3    7:ifeq            117
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   4   10:aload_0         
	//*   5   11:invokestatic    #128 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   14:ifeq            19
				return s;
	//    7   17:aload_0         
	//    8   18:areturn         
			context = ((Context) (aw.E().e(context)));
	//    9   19:invokestatic    #70  <Method vt aw.E()>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #80  <Method String vt.e(Context)>
	//   12   26:astore_1        
			if(context == null)
	//*  13   27:aload_1         
	//*  14   28:ifnonnull       33
				return s;
	//   15   31:aload_0         
	//   16   32:areturn         
			if(!aw.e().e(s))
	//*  17   33:invokestatic    #134 <Method xg aw.e()>
	//*  18   36:aload_0         
	//*  19   37:invokevirtual   #139 <Method boolean xg.e(String)>
	//*  20   40:ifne            45
				return s;
	//   21   43:aload_0         
	//   22   44:areturn         
			e e = p.af;
	//   23   45:getstatic       #86  <Field e p.af>
	//   24   48:astore_2        
			if(((Boolean)bwk.e().a(e)).booleanValue())
	//*  25   49:invokestatic    #91  <Method m bwk.e()>
	//*  26   52:aload_2         
	//*  27   53:invokevirtual   #96  <Method Object m.a(e)>
	//*  28   56:checkcast       #98  <Class Boolean>
	//*  29   59:invokevirtual   #102 <Method boolean Boolean.booleanValue()>
	//*  30   62:ifeq            95
			{
				Object obj = ((Object) (p.ag));
	//   31   65:getstatic       #105 <Field e p.ag>
	//   32   68:astore_2        
				obj = ((Object) ((String)bwk.e().a(((e) (obj)))));
	//   33   69:invokestatic    #91  <Method m bwk.e()>
	//   34   72:aload_2         
	//   35   73:invokevirtual   #96  <Method Object m.a(e)>
	//   36   76:checkcast       #11  <Class String>
	//   37   79:astore_2        
				if(s.contains(((CharSequence) (obj))))
	//*  38   80:aload_0         
	//*  39   81:aload_2         
	//*  40   82:invokevirtual   #109 <Method boolean String.contains(CharSequence)>
	//*  41   85:ifeq            115
					return s.replace(((CharSequence) (obj)), ((CharSequence) (context)));
	//   42   88:aload_0         
	//   43   89:aload_2         
	//   44   90:aload_1         
	//   45   91:invokevirtual   #117 <Method String String.replace(CharSequence, CharSequence)>
	//   46   94:areturn         
			} else
			if(!s.contains("fbs_aeid"))
	//*  47   95:aload_0         
	//*  48   96:ldc1            #119 <String "fbs_aeid">
	//*  49   98:invokevirtual   #109 <Method boolean String.contains(CharSequence)>
	//*  50  101:ifne            115
				return a(s, "fbs_aeid", ((String) (context))).toString();
	//   51  104:aload_0         
	//   52  105:ldc1            #119 <String "fbs_aeid">
	//   53  107:aload_1         
	//   54  108:invokestatic    #130 <Method Uri a(String, String, String)>
	//   55  111:invokevirtual   #76  <Method String Uri.toString()>
	//   56  114:areturn         
			return s;
	//   57  115:aload_0         
	//   58  116:areturn         
		} else
		{
			return s;
	//   59  117:aload_0         
	//   60  118:areturn         
		}
	}

	public static String a(String s, Context context, boolean flag)
	{
		e e = p.ak;
	//    0    0:getstatic       #143 <Field e p.ak>
	//    1    3:astore_3        
		if(((Boolean)bwk.e().a(e)).booleanValue() && !flag)
	//*   2    4:invokestatic    #91  <Method m bwk.e()>
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #96  <Method Object m.a(e)>
	//*   5   11:checkcast       #98  <Class Boolean>
	//*   6   14:invokevirtual   #102 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            26
	//*   8   20:iload_2         
	//*   9   21:ifne            26
			return s;
	//   10   24:aload_0         
	//   11   25:areturn         
		if(aw.E().a(context))
	//*  12   26:invokestatic    #70  <Method vt aw.E()>
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #75  <Method boolean vt.a(Context)>
	//*  15   33:ifeq            229
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  16   36:aload_0         
	//*  17   37:invokestatic    #128 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   40:ifeq            45
				return s;
	//   19   43:aload_0         
	//   20   44:areturn         
			String s1 = aw.E().e(context);
	//   21   45:invokestatic    #70  <Method vt aw.E()>
	//   22   48:aload_1         
	//   23   49:invokevirtual   #80  <Method String vt.e(Context)>
	//   24   52:astore_3        
			if(s1 == null)
	//*  25   53:aload_3         
	//*  26   54:ifnonnull       59
				return s;
	//   27   57:aload_0         
	//   28   58:areturn         
			e e1 = p.af;
	//   29   59:getstatic       #86  <Field e p.af>
	//   30   62:astore          4
			if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*  31   64:invokestatic    #91  <Method m bwk.e()>
	//*  32   67:aload           4
	//*  33   69:invokevirtual   #96  <Method Object m.a(e)>
	//*  34   72:checkcast       #98  <Class Boolean>
	//*  35   75:invokevirtual   #102 <Method boolean Boolean.booleanValue()>
	//*  36   78:ifeq            160
			{
				Object obj = ((Object) (p.ag));
	//   37   81:getstatic       #105 <Field e p.ag>
	//   38   84:astore          4
				obj = ((Object) ((String)bwk.e().a(((e) (obj)))));
	//   39   86:invokestatic    #91  <Method m bwk.e()>
	//   40   89:aload           4
	//   41   91:invokevirtual   #96  <Method Object m.a(e)>
	//   42   94:checkcast       #11  <Class String>
	//   43   97:astore          4
				if(s.contains(((CharSequence) (obj))))
	//*  44   99:aload_0         
	//*  45  100:aload           4
	//*  46  102:invokevirtual   #109 <Method boolean String.contains(CharSequence)>
	//*  47  105:ifeq            227
				{
					if(aw.e().d(s))
	//*  48  108:invokestatic    #134 <Method xg aw.e()>
	//*  49  111:aload_0         
	//*  50  112:invokevirtual   #145 <Method boolean xg.d(String)>
	//*  51  115:ifeq            134
					{
						aw.E().d(context, s1);
	//   52  118:invokestatic    #70  <Method vt aw.E()>
	//   53  121:aload_1         
	//   54  122:aload_3         
	//   55  123:invokevirtual   #113 <Method void vt.d(Context, String)>
						return s.replace(((CharSequence) (obj)), ((CharSequence) (s1)));
	//   56  126:aload_0         
	//   57  127:aload           4
	//   58  129:aload_3         
	//   59  130:invokevirtual   #117 <Method String String.replace(CharSequence, CharSequence)>
	//   60  133:areturn         
					}
					if(aw.e().e(s))
	//*  61  134:invokestatic    #134 <Method xg aw.e()>
	//*  62  137:aload_0         
	//*  63  138:invokevirtual   #139 <Method boolean xg.e(String)>
	//*  64  141:ifeq            227
					{
						aw.E().e(context, s1);
	//   65  144:invokestatic    #70  <Method vt aw.E()>
	//   66  147:aload_1         
	//   67  148:aload_3         
	//   68  149:invokevirtual   #147 <Method void vt.e(Context, String)>
						return s.replace(((CharSequence) (obj)), ((CharSequence) (s1)));
	//   69  152:aload_0         
	//   70  153:aload           4
	//   71  155:aload_3         
	//   72  156:invokevirtual   #117 <Method String String.replace(CharSequence, CharSequence)>
	//   73  159:areturn         
					}
				}
			} else
			if(!s.contains("fbs_aeid"))
	//*  74  160:aload_0         
	//*  75  161:ldc1            #119 <String "fbs_aeid">
	//*  76  163:invokevirtual   #109 <Method boolean String.contains(CharSequence)>
	//*  77  166:ifne            227
			{
				if(aw.e().d(s))
	//*  78  169:invokestatic    #134 <Method xg aw.e()>
	//*  79  172:aload_0         
	//*  80  173:invokevirtual   #145 <Method boolean xg.d(String)>
	//*  81  176:ifeq            198
				{
					aw.E().d(context, s1);
	//   82  179:invokestatic    #70  <Method vt aw.E()>
	//   83  182:aload_1         
	//   84  183:aload_3         
	//   85  184:invokevirtual   #113 <Method void vt.d(Context, String)>
					return a(s, "fbs_aeid", s1).toString();
	//   86  187:aload_0         
	//   87  188:ldc1            #119 <String "fbs_aeid">
	//   88  190:aload_3         
	//   89  191:invokestatic    #130 <Method Uri a(String, String, String)>
	//   90  194:invokevirtual   #76  <Method String Uri.toString()>
	//   91  197:areturn         
				}
				if(aw.e().e(s))
	//*  92  198:invokestatic    #134 <Method xg aw.e()>
	//*  93  201:aload_0         
	//*  94  202:invokevirtual   #139 <Method boolean xg.e(String)>
	//*  95  205:ifeq            227
				{
					aw.E().e(context, s1);
	//   96  208:invokestatic    #70  <Method vt aw.E()>
	//   97  211:aload_1         
	//   98  212:aload_3         
	//   99  213:invokevirtual   #147 <Method void vt.e(Context, String)>
					return a(s, "fbs_aeid", s1).toString();
	//  100  216:aload_0         
	//  101  217:ldc1            #119 <String "fbs_aeid">
	//  102  219:aload_3         
	//  103  220:invokestatic    #130 <Method Uri a(String, String, String)>
	//  104  223:invokevirtual   #76  <Method String Uri.toString()>
	//  105  226:areturn         
				}
			}
			return s;
	//  106  227:aload_0         
	//  107  228:areturn         
		} else
		{
			return s;
	//  108  229:aload_0         
	//  109  230:areturn         
		}
	}
}
