// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.util.l;
import com.google.android.gms.internal.cast.aj;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			ai

public final class TextTrackStyle extends AbstractSafeParcelable
{

	public TextTrackStyle()
	{
		this(1.0F, 0, 0, -1, 0, -1, 0, 0, ((String) (null)), -1, -1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:iconst_m1       
	//    5    5:iconst_0        
	//    6    6:iconst_m1       
	//    7    7:iconst_0        
	//    8    8:iconst_0        
	//    9    9:aconst_null     
	//   10   10:iconst_m1       
	//   11   11:iconst_m1       
	//   12   12:aconst_null     
	//   13   13:invokespecial   #36  <Method void TextTrackStyle(float, int, int, int, int, int, int, int, String, int, int, String)>
	//   14   16:return          
	}

	TextTrackStyle(float f1, int i1, int j1, int k1, int l1, int i2, int j2, 
			int k2, String s, int l2, int i3, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void AbstractSafeParcelable()>
		a = f1;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #41  <Field float a>
		b = i1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #43  <Field int b>
		c = j1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #45  <Field int c>
		d = k1;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #47  <Field int d>
		e = l1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #49  <Field int e>
		f = i2;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #51  <Field int f>
		g = j2;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #53  <Field int g>
		h = k2;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #55  <Field int h>
		i = s;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #57  <Field String i>
		j = l2;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #59  <Field int j>
		k = i3;
	//   32   61:aload_0         
	//   33   62:iload           11
	//   34   64:putfield        #61  <Field int k>
		l = s1;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #63  <Field String l>
		s = l;
	//   38   73:aload_0         
	//   39   74:getfield        #63  <Field String l>
	//   40   77:astore          9
		if(s != null)
	//*  41   79:aload           9
	//*  42   81:ifnull          109
		{
			try
			{
				m = new JSONObject(s);
	//   43   84:aload_0         
	//   44   85:new             #65  <Class JSONObject>
	//   45   88:dup             
	//   46   89:aload           9
	//   47   91:invokespecial   #68  <Method void JSONObject(String)>
	//   48   94:putfield        #70  <Field JSONObject m>
				return;
	//   49   97:return          
			}
	//*  50   98:aload_0         
	//*  51   99:aconst_null     
	//*  52  100:putfield        #70  <Field JSONObject m>
	//*  53  103:aload_0         
	//*  54  104:aconst_null     
	//*  55  105:putfield        #63  <Field String l>
	//*  56  108:return          
	//*  57  109:aload_0         
	//*  58  110:aconst_null     
	//*  59  111:putfield        #70  <Field JSONObject m>
	//*  60  114:return          
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				m = null;
			}
			l = null;
			return;
		} else
		{
			m = null;
			return;
		}
	//*  61  115:astore          9
	//*  62  117:goto            98
	}

	private static int a(String s)
	{
		if(s != null && s.length() == 9 && s.charAt(0) == '#')
	//*   0    0:aload_0         
	//*   1    1:ifnull          82
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #79  <Method int String.length()>
	//*   4    8:bipush          9
	//*   5   10:icmpne          82
	//*   6   13:aload_0         
	//*   7   14:iconst_0        
	//*   8   15:invokevirtual   #83  <Method char String.charAt(int)>
	//*   9   18:bipush          35
	//*  10   20:icmpne          82
		{
			int i1;
			try
			{
				i1 = Integer.parseInt(s.substring(1, 3), 16);
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:iconst_3        
	//   14   26:invokevirtual   #87  <Method String String.substring(int, int)>
	//   15   29:bipush          16
	//   16   31:invokestatic    #93  <Method int Integer.parseInt(String, int)>
	//   17   34:istore_1        
				int j1 = Integer.parseInt(s.substring(3, 5), 16);
	//   18   35:aload_0         
	//   19   36:iconst_3        
	//   20   37:iconst_5        
	//   21   38:invokevirtual   #87  <Method String String.substring(int, int)>
	//   22   41:bipush          16
	//   23   43:invokestatic    #93  <Method int Integer.parseInt(String, int)>
	//   24   46:istore_2        
				int k1 = Integer.parseInt(s.substring(5, 7), 16);
	//   25   47:aload_0         
	//   26   48:iconst_5        
	//   27   49:bipush          7
	//   28   51:invokevirtual   #87  <Method String String.substring(int, int)>
	//   29   54:bipush          16
	//   30   56:invokestatic    #93  <Method int Integer.parseInt(String, int)>
	//   31   59:istore_3        
				i1 = Color.argb(Integer.parseInt(s.substring(7, 9), 16), i1, j1, k1);
	//   32   60:aload_0         
	//   33   61:bipush          7
	//   34   63:bipush          9
	//   35   65:invokevirtual   #87  <Method String String.substring(int, int)>
	//   36   68:bipush          16
	//   37   70:invokestatic    #93  <Method int Integer.parseInt(String, int)>
	//   38   73:iload_1         
	//   39   74:iload_2         
	//   40   75:iload_3         
	//   41   76:invokestatic    #99  <Method int Color.argb(int, int, int, int)>
	//   42   79:istore_1        
			}
	//*  43   80:iload_1         
	//*  44   81:ireturn         
	//*  45   82:iconst_0        
	//*  46   83:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  47   84:astore_0        
			{
				return 0;
	//   48   85:iconst_0        
	//   49   86:ireturn         
			}
			return i1;
		} else
		{
			return 0;
		}
	}

	private static String a(int i1)
	{
		return String.format("#%02X%02X%02X%02X", new Object[] {
			Integer.valueOf(Color.red(i1)), Integer.valueOf(Color.green(i1)), Integer.valueOf(Color.blue(i1)), Integer.valueOf(Color.alpha(i1))
		});
	//    0    0:ldc1            #102 <String "#%02X%02X%02X%02X">
	//    1    2:iconst_4        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:iload_0         
	//    6    9:invokestatic    #108 <Method int Color.red(int)>
	//    7   12:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:iload_0         
	//   12   19:invokestatic    #115 <Method int Color.green(int)>
	//   13   22:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_2        
	//   17   28:iload_0         
	//   18   29:invokestatic    #118 <Method int Color.blue(int)>
	//   19   32:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   20   35:aastore         
	//   21   36:dup             
	//   22   37:iconst_3        
	//   23   38:iload_0         
	//   24   39:invokestatic    #121 <Method int Color.alpha(int)>
	//   25   42:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   26   45:aastore         
	//   27   46:invokestatic    #125 <Method String String.format(String, Object[])>
	//   28   49:areturn         
	}

	public final float a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float a>
	//    2    4:freturn         
	}

	public final void a(JSONObject jsonobject)
	{
		a = (float)jsonobject.optDouble("fontScale", 1.0D);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #129 <String "fontScale">
	//    3    4:dconst_1        
	//    4    5:invokevirtual   #133 <Method double JSONObject.optDouble(String, double)>
	//    5    8:d2f             
	//    6    9:putfield        #41  <Field float a>
		b = a(jsonobject.optString("foregroundColor"));
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:ldc1            #135 <String "foregroundColor">
	//   10   16:invokevirtual   #139 <Method String JSONObject.optString(String)>
	//   11   19:invokestatic    #141 <Method int a(String)>
	//   12   22:putfield        #43  <Field int b>
		c = a(jsonobject.optString("backgroundColor"));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:ldc1            #143 <String "backgroundColor">
	//   16   29:invokevirtual   #139 <Method String JSONObject.optString(String)>
	//   17   32:invokestatic    #141 <Method int a(String)>
	//   18   35:putfield        #45  <Field int c>
		if(jsonobject.has("edgeType"))
	//*  19   38:aload_1         
	//*  20   39:ldc1            #145 <String "edgeType">
	//*  21   41:invokevirtual   #149 <Method boolean JSONObject.has(String)>
	//*  22   44:ifeq            136
		{
			String s = jsonobject.getString("edgeType");
	//   23   47:aload_1         
	//   24   48:ldc1            #145 <String "edgeType">
	//   25   50:invokevirtual   #152 <Method String JSONObject.getString(String)>
	//   26   53:astore_2        
			if("NONE".equals(((Object) (s))))
	//*  27   54:ldc1            #154 <String "NONE">
	//*  28   56:aload_2         
	//*  29   57:invokevirtual   #158 <Method boolean String.equals(Object)>
	//*  30   60:ifeq            71
				d = 0;
	//   31   63:aload_0         
	//   32   64:iconst_0        
	//   33   65:putfield        #47  <Field int d>
			else
	//*  34   68:goto            136
			if("OUTLINE".equals(((Object) (s))))
	//*  35   71:ldc1            #160 <String "OUTLINE">
	//*  36   73:aload_2         
	//*  37   74:invokevirtual   #158 <Method boolean String.equals(Object)>
	//*  38   77:ifeq            88
				d = 1;
	//   39   80:aload_0         
	//   40   81:iconst_1        
	//   41   82:putfield        #47  <Field int d>
			else
	//*  42   85:goto            136
			if("DROP_SHADOW".equals(((Object) (s))))
	//*  43   88:ldc1            #162 <String "DROP_SHADOW">
	//*  44   90:aload_2         
	//*  45   91:invokevirtual   #158 <Method boolean String.equals(Object)>
	//*  46   94:ifeq            105
				d = 2;
	//   47   97:aload_0         
	//   48   98:iconst_2        
	//   49   99:putfield        #47  <Field int d>
			else
	//*  50  102:goto            136
			if("RAISED".equals(((Object) (s))))
	//*  51  105:ldc1            #164 <String "RAISED">
	//*  52  107:aload_2         
	//*  53  108:invokevirtual   #158 <Method boolean String.equals(Object)>
	//*  54  111:ifeq            122
				d = 3;
	//   55  114:aload_0         
	//   56  115:iconst_3        
	//   57  116:putfield        #47  <Field int d>
			else
	//*  58  119:goto            136
			if("DEPRESSED".equals(((Object) (s))))
	//*  59  122:ldc1            #166 <String "DEPRESSED">
	//*  60  124:aload_2         
	//*  61  125:invokevirtual   #158 <Method boolean String.equals(Object)>
	//*  62  128:ifeq            136
				d = 4;
	//   63  131:aload_0         
	//   64  132:iconst_4        
	//   65  133:putfield        #47  <Field int d>
		}
		e = a(jsonobject.optString("edgeColor"));
	//   66  136:aload_0         
	//   67  137:aload_1         
	//   68  138:ldc1            #168 <String "edgeColor">
	//   69  140:invokevirtual   #139 <Method String JSONObject.optString(String)>
	//   70  143:invokestatic    #141 <Method int a(String)>
	//   71  146:putfield        #49  <Field int e>
		if(jsonobject.has("windowType"))
	//*  72  149:aload_1         
	//*  73  150:ldc1            #170 <String "windowType">
	//*  74  152:invokevirtual   #149 <Method boolean JSONObject.has(String)>
	//*  75  155:ifeq            213
		{
			String s1 = jsonobject.getString("windowType");
	//   76  158:aload_1         
	//   77  159:ldc1            #170 <String "windowType">
	//   78  161:invokevirtual   #152 <Method String JSONObject.getString(String)>
	//   79  164:astore_2        
			if("NONE".equals(((Object) (s1))))
	//*  80  165:ldc1            #154 <String "NONE">
	//*  81  167:aload_2         
	//*  82  168:invokevirtual   #158 <Method boolean String.equals(Object)>
	//*  83  171:ifeq            182
				f = 0;
	//   84  174:aload_0         
	//   85  175:iconst_0        
	//   86  176:putfield        #51  <Field int f>
			else
	//*  87  179:goto            213
			if("NORMAL".equals(((Object) (s1))))
	//*  88  182:ldc1            #172 <String "NORMAL">
	//*  89  184:aload_2         
	//*  90  185:invokevirtual   #158 <Method boolean String.equals(Object)>
	//*  91  188:ifeq            199
				f = 1;
	//   92  191:aload_0         
	//   93  192:iconst_1        
	//   94  193:putfield        #51  <Field int f>
			else
	//*  95  196:goto            213
			if("ROUNDED_CORNERS".equals(((Object) (s1))))
	//*  96  199:ldc1            #174 <String "ROUNDED_CORNERS">
	//*  97  201:aload_2         
	//*  98  202:invokevirtual   #158 <Method boolean String.equals(Object)>
	//*  99  205:ifeq            213
				f = 2;
	//  100  208:aload_0         
	//  101  209:iconst_2        
	//  102  210:putfield        #51  <Field int f>
		}
		g = a(jsonobject.optString("windowColor"));
	//  103  213:aload_0         
	//  104  214:aload_1         
	//  105  215:ldc1            #176 <String "windowColor">
	//  106  217:invokevirtual   #139 <Method String JSONObject.optString(String)>
	//  107  220:invokestatic    #141 <Method int a(String)>
	//  108  223:putfield        #53  <Field int g>
		if(f == 2)
	//* 109  226:aload_0         
	//* 110  227:getfield        #51  <Field int f>
	//* 111  230:iconst_2        
	//* 112  231:icmpne          245
			h = jsonobject.optInt("windowRoundedCornerRadius", 0);
	//  113  234:aload_0         
	//  114  235:aload_1         
	//  115  236:ldc1            #178 <String "windowRoundedCornerRadius">
	//  116  238:iconst_0        
	//  117  239:invokevirtual   #181 <Method int JSONObject.optInt(String, int)>
	//  118  242:putfield        #55  <Field int h>
		i = jsonobject.optString("fontFamily", ((String) (null)));
	//  119  245:aload_0         
	//  120  246:aload_1         
	//  121  247:ldc1            #183 <String "fontFamily">
	//  122  249:aconst_null     
	//  123  250:invokevirtual   #186 <Method String JSONObject.optString(String, String)>
	//  124  253:putfield        #57  <Field String i>
		if(jsonobject.has("fontGenericFamily"))
	//* 125  256:aload_1         
	//* 126  257:ldc1            #188 <String "fontGenericFamily">
	//* 127  259:invokevirtual   #149 <Method boolean JSONObject.has(String)>
	//* 128  262:ifeq            389
		{
			String s2 = jsonobject.getString("fontGenericFamily");
	//  129  265:aload_1         
	//  130  266:ldc1            #188 <String "fontGenericFamily">
	//  131  268:invokevirtual   #152 <Method String JSONObject.getString(String)>
	//  132  271:astore_2        
			if("SANS_SERIF".equals(((Object) (s2))))
	//* 133  272:ldc1            #190 <String "SANS_SERIF">
	//* 134  274:aload_2         
	//* 135  275:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 136  278:ifeq            289
				j = 0;
	//  137  281:aload_0         
	//  138  282:iconst_0        
	//  139  283:putfield        #59  <Field int j>
			else
	//* 140  286:goto            389
			if("MONOSPACED_SANS_SERIF".equals(((Object) (s2))))
	//* 141  289:ldc1            #192 <String "MONOSPACED_SANS_SERIF">
	//* 142  291:aload_2         
	//* 143  292:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 144  295:ifeq            306
				j = 1;
	//  145  298:aload_0         
	//  146  299:iconst_1        
	//  147  300:putfield        #59  <Field int j>
			else
	//* 148  303:goto            389
			if("SERIF".equals(((Object) (s2))))
	//* 149  306:ldc1            #194 <String "SERIF">
	//* 150  308:aload_2         
	//* 151  309:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 152  312:ifeq            323
				j = 2;
	//  153  315:aload_0         
	//  154  316:iconst_2        
	//  155  317:putfield        #59  <Field int j>
			else
	//* 156  320:goto            389
			if("MONOSPACED_SERIF".equals(((Object) (s2))))
	//* 157  323:ldc1            #196 <String "MONOSPACED_SERIF">
	//* 158  325:aload_2         
	//* 159  326:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 160  329:ifeq            340
				j = 3;
	//  161  332:aload_0         
	//  162  333:iconst_3        
	//  163  334:putfield        #59  <Field int j>
			else
	//* 164  337:goto            389
			if("CASUAL".equals(((Object) (s2))))
	//* 165  340:ldc1            #198 <String "CASUAL">
	//* 166  342:aload_2         
	//* 167  343:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 168  346:ifeq            357
				j = 4;
	//  169  349:aload_0         
	//  170  350:iconst_4        
	//  171  351:putfield        #59  <Field int j>
			else
	//* 172  354:goto            389
			if("CURSIVE".equals(((Object) (s2))))
	//* 173  357:ldc1            #200 <String "CURSIVE">
	//* 174  359:aload_2         
	//* 175  360:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 176  363:ifeq            374
				j = 5;
	//  177  366:aload_0         
	//  178  367:iconst_5        
	//  179  368:putfield        #59  <Field int j>
			else
	//* 180  371:goto            389
			if("SMALL_CAPITALS".equals(((Object) (s2))))
	//* 181  374:ldc1            #202 <String "SMALL_CAPITALS">
	//* 182  376:aload_2         
	//* 183  377:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 184  380:ifeq            389
				j = 6;
	//  185  383:aload_0         
	//  186  384:bipush          6
	//  187  386:putfield        #59  <Field int j>
		}
		if(jsonobject.has("fontStyle"))
	//* 188  389:aload_1         
	//* 189  390:ldc1            #204 <String "fontStyle">
	//* 190  392:invokevirtual   #149 <Method boolean JSONObject.has(String)>
	//* 191  395:ifeq            470
		{
			String s3 = jsonobject.getString("fontStyle");
	//  192  398:aload_1         
	//  193  399:ldc1            #204 <String "fontStyle">
	//  194  401:invokevirtual   #152 <Method String JSONObject.getString(String)>
	//  195  404:astore_2        
			if("NORMAL".equals(((Object) (s3))))
	//* 196  405:ldc1            #172 <String "NORMAL">
	//* 197  407:aload_2         
	//* 198  408:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 199  411:ifeq            422
				k = 0;
	//  200  414:aload_0         
	//  201  415:iconst_0        
	//  202  416:putfield        #61  <Field int k>
			else
	//* 203  419:goto            470
			if("BOLD".equals(((Object) (s3))))
	//* 204  422:ldc1            #206 <String "BOLD">
	//* 205  424:aload_2         
	//* 206  425:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 207  428:ifeq            439
				k = 1;
	//  208  431:aload_0         
	//  209  432:iconst_1        
	//  210  433:putfield        #61  <Field int k>
			else
	//* 211  436:goto            470
			if("ITALIC".equals(((Object) (s3))))
	//* 212  439:ldc1            #208 <String "ITALIC">
	//* 213  441:aload_2         
	//* 214  442:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 215  445:ifeq            456
				k = 2;
	//  216  448:aload_0         
	//  217  449:iconst_2        
	//  218  450:putfield        #61  <Field int k>
			else
	//* 219  453:goto            470
			if("BOLD_ITALIC".equals(((Object) (s3))))
	//* 220  456:ldc1            #210 <String "BOLD_ITALIC">
	//* 221  458:aload_2         
	//* 222  459:invokevirtual   #158 <Method boolean String.equals(Object)>
	//* 223  462:ifeq            470
				k = 3;
	//  224  465:aload_0         
	//  225  466:iconst_3        
	//  226  467:putfield        #61  <Field int k>
		}
		m = jsonobject.optJSONObject("customData");
	//  227  470:aload_0         
	//  228  471:aload_1         
	//  229  472:ldc1            #212 <String "customData">
	//  230  474:invokevirtual   #216 <Method JSONObject JSONObject.optJSONObject(String)>
	//  231  477:putfield        #70  <Field JSONObject m>
	//  232  480:return          
	}

	public final int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int b>
	//    2    4:ireturn         
	}

	public final int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int c>
	//    2    4:ireturn         
	}

	public final int d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int d>
	//    2    4:ireturn         
	}

	public final int e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int e>
	//    2    4:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof TextTrackStyle))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class TextTrackStyle>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((TextTrackStyle)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class TextTrackStyle>
	//   12   20:astore_1        
		boolean flag;
		if(m == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #70  <Field JSONObject m>
	//*  15   25:ifnonnull       33
			flag = true;
	//   16   28:iconst_1        
	//   17   29:istore_2        
		else
	//*  18   30:goto            35
			flag = false;
	//   19   33:iconst_0        
	//   20   34:istore_2        
		boolean flag1;
		if(((TextTrackStyle) (obj)).m == null)
	//*  21   35:aload_1         
	//*  22   36:getfield        #70  <Field JSONObject m>
	//*  23   39:ifnonnull       47
			flag1 = true;
	//   24   42:iconst_1        
	//   25   43:istore_3        
		else
	//*  26   44:goto            49
			flag1 = false;
	//   27   47:iconst_0        
	//   28   48:istore_3        
		if(flag != flag1)
	//*  29   49:iload_2         
	//*  30   50:iload_3         
	//*  31   51:icmpeq          56
			return false;
	//   32   54:iconst_0        
	//   33   55:ireturn         
		JSONObject jsonobject = m;
	//   34   56:aload_0         
	//   35   57:getfield        #70  <Field JSONObject m>
	//   36   60:astore          4
		if(jsonobject != null)
	//*  37   62:aload           4
	//*  38   64:ifnull          90
		{
			JSONObject jsonobject1 = ((TextTrackStyle) (obj)).m;
	//   39   67:aload_1         
	//   40   68:getfield        #70  <Field JSONObject m>
	//   41   71:astore          5
			if(jsonobject1 != null && !com.google.android.gms.common.util.l.a(((Object) (jsonobject)), ((Object) (jsonobject1))))
	//*  42   73:aload           5
	//*  43   75:ifnull          90
	//*  44   78:aload           4
	//*  45   80:aload           5
	//*  46   82:invokestatic    #221 <Method boolean l.a(Object, Object)>
	//*  47   85:ifne            90
				return false;
	//   48   88:iconst_0        
	//   49   89:ireturn         
		}
		return a == ((TextTrackStyle) (obj)).a && b == ((TextTrackStyle) (obj)).b && c == ((TextTrackStyle) (obj)).c && d == ((TextTrackStyle) (obj)).d && e == ((TextTrackStyle) (obj)).e && f == ((TextTrackStyle) (obj)).f && h == ((TextTrackStyle) (obj)).h && aj.a(((Object) (i)), ((Object) (((TextTrackStyle) (obj)).i))) && j == ((TextTrackStyle) (obj)).j && k == ((TextTrackStyle) (obj)).k;
	//   50   90:aload_0         
	//   51   91:getfield        #41  <Field float a>
	//   52   94:aload_1         
	//   53   95:getfield        #41  <Field float a>
	//   54   98:fcmpl           
	//   55   99:ifne            206
	//   56  102:aload_0         
	//   57  103:getfield        #43  <Field int b>
	//   58  106:aload_1         
	//   59  107:getfield        #43  <Field int b>
	//   60  110:icmpne          206
	//   61  113:aload_0         
	//   62  114:getfield        #45  <Field int c>
	//   63  117:aload_1         
	//   64  118:getfield        #45  <Field int c>
	//   65  121:icmpne          206
	//   66  124:aload_0         
	//   67  125:getfield        #47  <Field int d>
	//   68  128:aload_1         
	//   69  129:getfield        #47  <Field int d>
	//   70  132:icmpne          206
	//   71  135:aload_0         
	//   72  136:getfield        #49  <Field int e>
	//   73  139:aload_1         
	//   74  140:getfield        #49  <Field int e>
	//   75  143:icmpne          206
	//   76  146:aload_0         
	//   77  147:getfield        #51  <Field int f>
	//   78  150:aload_1         
	//   79  151:getfield        #51  <Field int f>
	//   80  154:icmpne          206
	//   81  157:aload_0         
	//   82  158:getfield        #55  <Field int h>
	//   83  161:aload_1         
	//   84  162:getfield        #55  <Field int h>
	//   85  165:icmpne          206
	//   86  168:aload_0         
	//   87  169:getfield        #57  <Field String i>
	//   88  172:aload_1         
	//   89  173:getfield        #57  <Field String i>
	//   90  176:invokestatic    #224 <Method boolean aj.a(Object, Object)>
	//   91  179:ifeq            206
	//   92  182:aload_0         
	//   93  183:getfield        #59  <Field int j>
	//   94  186:aload_1         
	//   95  187:getfield        #59  <Field int j>
	//   96  190:icmpne          206
	//   97  193:aload_0         
	//   98  194:getfield        #61  <Field int k>
	//   99  197:aload_1         
	//  100  198:getfield        #61  <Field int k>
	//  101  201:icmpne          206
	//  102  204:iconst_1        
	//  103  205:ireturn         
	//  104  206:iconst_0        
	//  105  207:ireturn         
	}

	public final int f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int f>
	//    2    4:ireturn         
	}

	public final int g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int g>
	//    2    4:ireturn         
	}

	public final int h()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int h>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			Float.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d), Integer.valueOf(e), Integer.valueOf(f), Integer.valueOf(g), Integer.valueOf(h), i, Integer.valueOf(j), 
			Integer.valueOf(k), String.valueOf(((Object) (m)))
		});
	//    0    0:bipush          12
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #41  <Field float a>
	//    6   11:invokestatic    #230 <Method Float Float.valueOf(float)>
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #43  <Field int b>
	//   12   21:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:aload_0         
	//   17   28:getfield        #45  <Field int c>
	//   18   31:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   19   34:aastore         
	//   20   35:dup             
	//   21   36:iconst_3        
	//   22   37:aload_0         
	//   23   38:getfield        #47  <Field int d>
	//   24   41:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   25   44:aastore         
	//   26   45:dup             
	//   27   46:iconst_4        
	//   28   47:aload_0         
	//   29   48:getfield        #49  <Field int e>
	//   30   51:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   31   54:aastore         
	//   32   55:dup             
	//   33   56:iconst_5        
	//   34   57:aload_0         
	//   35   58:getfield        #51  <Field int f>
	//   36   61:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   37   64:aastore         
	//   38   65:dup             
	//   39   66:bipush          6
	//   40   68:aload_0         
	//   41   69:getfield        #53  <Field int g>
	//   42   72:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   43   75:aastore         
	//   44   76:dup             
	//   45   77:bipush          7
	//   46   79:aload_0         
	//   47   80:getfield        #55  <Field int h>
	//   48   83:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   49   86:aastore         
	//   50   87:dup             
	//   51   88:bipush          8
	//   52   90:aload_0         
	//   53   91:getfield        #57  <Field String i>
	//   54   94:aastore         
	//   55   95:dup             
	//   56   96:bipush          9
	//   57   98:aload_0         
	//   58   99:getfield        #59  <Field int j>
	//   59  102:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   60  105:aastore         
	//   61  106:dup             
	//   62  107:bipush          10
	//   63  109:aload_0         
	//   64  110:getfield        #61  <Field int k>
	//   65  113:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   66  116:aastore         
	//   67  117:dup             
	//   68  118:bipush          11
	//   69  120:aload_0         
	//   70  121:getfield        #70  <Field JSONObject m>
	//   71  124:invokestatic    #233 <Method String String.valueOf(Object)>
	//   72  127:aastore         
	//   73  128:invokestatic    #238 <Method int ak.a(Object[])>
	//   74  131:ireturn         
	}

	public final String i()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String i>
	//    2    4:areturn         
	}

	public final int j()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int j>
	//    2    4:ireturn         
	}

	public final int k()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int k>
	//    2    4:ireturn         
	}

	public final JSONObject l()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #65  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #241 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("fontScale", a);
	//    4    8:aload_1         
	//    5    9:ldc1            #129 <String "fontScale">
	//    6   11:aload_0         
	//    7   12:getfield        #41  <Field float a>
	//    8   15:f2d             
	//    9   16:invokevirtual   #245 <Method JSONObject JSONObject.put(String, double)>
	//   10   19:pop             
		if(b != 0)
	//*  11   20:aload_0         
	//*  12   21:getfield        #43  <Field int b>
	//*  13   24:ifeq            41
			jsonobject.put("foregroundColor", ((Object) (a(b))));
	//   14   27:aload_1         
	//   15   28:ldc1            #135 <String "foregroundColor">
	//   16   30:aload_0         
	//   17   31:getfield        #43  <Field int b>
	//   18   34:invokestatic    #247 <Method String a(int)>
	//   19   37:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//   20   40:pop             
		if(c != 0)
	//*  21   41:aload_0         
	//*  22   42:getfield        #45  <Field int c>
	//*  23   45:ifeq            62
			jsonobject.put("backgroundColor", ((Object) (a(c))));
	//   24   48:aload_1         
	//   25   49:ldc1            #143 <String "backgroundColor">
	//   26   51:aload_0         
	//   27   52:getfield        #45  <Field int c>
	//   28   55:invokestatic    #247 <Method String a(int)>
	//   29   58:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//   30   61:pop             
		d;
	//   31   62:aload_0         
	//   32   63:getfield        #47  <Field int d>
		JVM INSTR tableswitch 0 4: default 528
	//	               0 148
	//	               1 136
	//	               2 124
	//	               3 112
	//	               4 100;
	//   33   66:tableswitch     0 4: default 528
	//	               0 148
	//	               1 136
	//	               2 124
	//	               3 112
	//	               4 100
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		break; /* Loop/switch isn't completed */
_L6:
		jsonobject.put("edgeType", "DEPRESSED");
	//   34  100:aload_1         
	//   35  101:ldc1            #145 <String "edgeType">
	//   36  103:ldc1            #166 <String "DEPRESSED">
	//   37  105:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//   38  108:pop             
		break; /* Loop/switch isn't completed */
	//   39  109:goto            157
_L5:
		try
		{
			jsonobject.put("edgeType", "RAISED");
	//   40  112:aload_1         
	//   41  113:ldc1            #145 <String "edgeType">
	//   42  115:ldc1            #164 <String "RAISED">
	//   43  117:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//   44  120:pop             
		}
	//*  45  121:goto            157
	//*  46  124:aload_1         
	//*  47  125:ldc1            #145 <String "edgeType">
	//*  48  127:ldc1            #162 <String "DROP_SHADOW">
	//*  49  129:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//*  50  132:pop             
	//*  51  133:goto            157
	//*  52  136:aload_1         
	//*  53  137:ldc1            #145 <String "edgeType">
	//*  54  139:ldc1            #160 <String "OUTLINE">
	//*  55  141:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//*  56  144:pop             
	//*  57  145:goto            157
	//*  58  148:aload_1         
	//*  59  149:ldc1            #145 <String "edgeType">
	//*  60  151:ldc1            #154 <String "NONE">
	//*  61  153:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//*  62  156:pop             
	//*  63  157:aload_0         
	//*  64  158:getfield        #49  <Field int e>
	//*  65  161:ifeq            178
	//*  66  164:aload_1         
	//*  67  165:ldc1            #168 <String "edgeColor">
	//*  68  167:aload_0         
	//*  69  168:getfield        #49  <Field int e>
	//*  70  171:invokestatic    #247 <Method String a(int)>
	//*  71  174:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//*  72  177:pop             
	//*  73  178:aload_0         
	//*  74  179:getfield        #51  <Field int f>
	//*  75  182:tableswitch     0 2: default 531
	//	               0 232
	//	               1 220
	//	               2 208
	//*  76  208:aload_1         
	//*  77  209:ldc1            #170 <String "windowType">
	//*  78  211:ldc1            #174 <String "ROUNDED_CORNERS">
	//*  79  213:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//*  80  216:pop             
	//*  81  217:goto            241
	//*  82  220:aload_1         
	//*  83  221:ldc1            #170 <String "windowType">
	//*  84  223:ldc1            #172 <String "NORMAL">
	//*  85  225:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//*  86  228:pop             
	//*  87  229:goto            241
	//*  88  232:aload_1         
	//*  89  233:ldc1            #170 <String "windowType">
	//*  90  235:ldc1            #154 <String "NONE">
	//*  91  237:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//*  92  240:pop             
	//*  93  241:aload_0         
	//*  94  242:getfield        #53  <Field int g>
	//*  95  245:ifeq            262
	//*  96  248:aload_1         
	//*  97  249:ldc1            #176 <String "windowColor">
	//*  98  251:aload_0         
	//*  99  252:getfield        #53  <Field int g>
	//* 100  255:invokestatic    #247 <Method String a(int)>
	//* 101  258:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 102  261:pop             
	//* 103  262:aload_0         
	//* 104  263:getfield        #51  <Field int f>
	//* 105  266:iconst_2        
	//* 106  267:icmpne          281
	//* 107  270:aload_1         
	//* 108  271:ldc1            #178 <String "windowRoundedCornerRadius">
	//* 109  273:aload_0         
	//* 110  274:getfield        #55  <Field int h>
	//* 111  277:invokevirtual   #253 <Method JSONObject JSONObject.put(String, int)>
	//* 112  280:pop             
	//* 113  281:aload_0         
	//* 114  282:getfield        #57  <Field String i>
	//* 115  285:ifnull          299
	//* 116  288:aload_1         
	//* 117  289:ldc1            #183 <String "fontFamily">
	//* 118  291:aload_0         
	//* 119  292:getfield        #57  <Field String i>
	//* 120  295:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 121  298:pop             
	//* 122  299:aload_0         
	//* 123  300:getfield        #59  <Field int j>
	//* 124  303:tableswitch     0 6: default 534
	//	               0 416
	//	               1 404
	//	               2 392
	//	               3 380
	//	               4 368
	//	               5 356
	//	               6 344
	//* 125  344:aload_1         
	//* 126  345:ldc1            #188 <String "fontGenericFamily">
	//* 127  347:ldc1            #202 <String "SMALL_CAPITALS">
	//* 128  349:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 129  352:pop             
	//* 130  353:goto            425
	//* 131  356:aload_1         
	//* 132  357:ldc1            #188 <String "fontGenericFamily">
	//* 133  359:ldc1            #200 <String "CURSIVE">
	//* 134  361:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 135  364:pop             
	//* 136  365:goto            425
	//* 137  368:aload_1         
	//* 138  369:ldc1            #188 <String "fontGenericFamily">
	//* 139  371:ldc1            #198 <String "CASUAL">
	//* 140  373:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 141  376:pop             
	//* 142  377:goto            425
	//* 143  380:aload_1         
	//* 144  381:ldc1            #188 <String "fontGenericFamily">
	//* 145  383:ldc1            #196 <String "MONOSPACED_SERIF">
	//* 146  385:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 147  388:pop             
	//* 148  389:goto            425
	//* 149  392:aload_1         
	//* 150  393:ldc1            #188 <String "fontGenericFamily">
	//* 151  395:ldc1            #194 <String "SERIF">
	//* 152  397:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 153  400:pop             
	//* 154  401:goto            425
	//* 155  404:aload_1         
	//* 156  405:ldc1            #188 <String "fontGenericFamily">
	//* 157  407:ldc1            #192 <String "MONOSPACED_SANS_SERIF">
	//* 158  409:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 159  412:pop             
	//* 160  413:goto            425
	//* 161  416:aload_1         
	//* 162  417:ldc1            #188 <String "fontGenericFamily">
	//* 163  419:ldc1            #190 <String "SANS_SERIF">
	//* 164  421:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 165  424:pop             
	//* 166  425:aload_0         
	//* 167  426:getfield        #61  <Field int k>
	//* 168  429:tableswitch     0 3: default 537
	//	               0 496
	//	               1 484
	//	               2 472
	//	               3 460
	//* 169  460:aload_1         
	//* 170  461:ldc1            #204 <String "fontStyle">
	//* 171  463:ldc1            #210 <String "BOLD_ITALIC">
	//* 172  465:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 173  468:pop             
	//* 174  469:goto            505
	//* 175  472:aload_1         
	//* 176  473:ldc1            #204 <String "fontStyle">
	//* 177  475:ldc1            #208 <String "ITALIC">
	//* 178  477:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 179  480:pop             
	//* 180  481:goto            505
	//* 181  484:aload_1         
	//* 182  485:ldc1            #204 <String "fontStyle">
	//* 183  487:ldc1            #206 <String "BOLD">
	//* 184  489:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 185  492:pop             
	//* 186  493:goto            505
	//* 187  496:aload_1         
	//* 188  497:ldc1            #204 <String "fontStyle">
	//* 189  499:ldc1            #172 <String "NORMAL">
	//* 190  501:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 191  504:pop             
	//* 192  505:aload_0         
	//* 193  506:getfield        #70  <Field JSONObject m>
	//* 194  509:ifnull          523
	//* 195  512:aload_1         
	//* 196  513:ldc1            #212 <String "customData">
	//* 197  515:aload_0         
	//* 198  516:getfield        #70  <Field JSONObject m>
	//* 199  519:invokevirtual   #250 <Method JSONObject JSONObject.put(String, Object)>
	//* 200  522:pop             
	//* 201  523:aload_1         
	//* 202  524:areturn         
		catch(JSONException jsonexception)
	//* 203  525:astore_2        
		{
			return jsonobject;
	//  204  526:aload_1         
	//  205  527:areturn         
		}
		break; /* Loop/switch isn't completed */
	//  206  528:goto            157
_L4:
		jsonobject.put("edgeType", "DROP_SHADOW");
		break; /* Loop/switch isn't completed */
_L3:
		jsonobject.put("edgeType", "OUTLINE");
		break; /* Loop/switch isn't completed */
_L2:
		jsonobject.put("edgeType", "NONE");
		if(e != 0)
			jsonobject.put("edgeColor", ((Object) (a(e))));
		f;
		JVM INSTR tableswitch 0 2: default 531
	//	               0 232
	//	               1 220
	//	               2 208;
		   goto _L7 _L8 _L9 _L10
_L7:
		break; /* Loop/switch isn't completed */
_L10:
		jsonobject.put("windowType", "ROUNDED_CORNERS");
		break; /* Loop/switch isn't completed */
_L9:
		jsonobject.put("windowType", "NORMAL");
		break; /* Loop/switch isn't completed */
_L8:
		jsonobject.put("windowType", "NONE");
		if(g != 0)
			jsonobject.put("windowColor", ((Object) (a(g))));
		if(f == 2)
			jsonobject.put("windowRoundedCornerRadius", h);
		if(i != null)
			jsonobject.put("fontFamily", ((Object) (i)));
		j;
		JVM INSTR tableswitch 0 6: default 534
	//	               0 416
	//	               1 404
	//	               2 392
	//	               3 380
	//	               4 368
	//	               5 356
	//	               6 344;
		   goto _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L11:
		break MISSING_BLOCK_LABEL_425;
_L18:
		jsonobject.put("fontGenericFamily", "SMALL_CAPITALS");
		break MISSING_BLOCK_LABEL_425;
_L17:
		jsonobject.put("fontGenericFamily", "CURSIVE");
		break MISSING_BLOCK_LABEL_425;
_L16:
		jsonobject.put("fontGenericFamily", "CASUAL");
		break MISSING_BLOCK_LABEL_425;
_L15:
		jsonobject.put("fontGenericFamily", "MONOSPACED_SERIF");
		break MISSING_BLOCK_LABEL_425;
_L14:
		jsonobject.put("fontGenericFamily", "SERIF");
		break MISSING_BLOCK_LABEL_425;
_L13:
		jsonobject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
		break MISSING_BLOCK_LABEL_425;
_L12:
		jsonobject.put("fontGenericFamily", "SANS_SERIF");
		k;
		JVM INSTR tableswitch 0 3: default 537
	//	               0 496
	//	               1 484
	//	               2 472
	//	               3 460;
		   goto _L19 _L20 _L21 _L22 _L23
_L19:
		break; /* Loop/switch isn't completed */
_L23:
		jsonobject.put("fontStyle", "BOLD_ITALIC");
		break; /* Loop/switch isn't completed */
_L22:
		jsonobject.put("fontStyle", "ITALIC");
		break; /* Loop/switch isn't completed */
_L21:
		jsonobject.put("fontStyle", "BOLD");
		break; /* Loop/switch isn't completed */
_L20:
		jsonobject.put("fontStyle", "NORMAL");
		if(m != null)
			jsonobject.put("customData", ((Object) (m)));
		return jsonobject;
	//* 207  531:goto            241
	//* 208  534:goto            425
	//* 209  537:goto            505
	}

	public final void writeToParcel(Parcel parcel, int i1)
	{
		Object obj = ((Object) (m));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field JSONObject m>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       14
			obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_3        
		else
	//*   7   11:goto            19
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//    8   14:aload_3         
	//    9   15:invokevirtual   #258 <Method String JSONObject.toString()>
	//   10   18:astore_3        
		l = ((String) (obj));
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #63  <Field String l>
		i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//   14   24:aload_1         
	//   15   25:invokestatic    #263 <Method int c.a(Parcel)>
	//   16   28:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a());
	//   17   29:aload_1         
	//   18   30:iconst_2        
	//   19   31:aload_0         
	//   20   32:invokevirtual   #265 <Method float a()>
	//   21   35:invokestatic    #268 <Method void c.a(Parcel, int, float)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//   22   38:aload_1         
	//   23   39:iconst_3        
	//   24   40:aload_0         
	//   25   41:invokevirtual   #270 <Method int b()>
	//   26   44:invokestatic    #273 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   27   47:aload_1         
	//   28   48:iconst_4        
	//   29   49:aload_0         
	//   30   50:invokevirtual   #275 <Method int c()>
	//   31   53:invokestatic    #273 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d());
	//   32   56:aload_1         
	//   33   57:iconst_5        
	//   34   58:aload_0         
	//   35   59:invokevirtual   #277 <Method int d()>
	//   36   62:invokestatic    #273 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e());
	//   37   65:aload_1         
	//   38   66:bipush          6
	//   39   68:aload_0         
	//   40   69:invokevirtual   #279 <Method int e()>
	//   41   72:invokestatic    #273 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, f());
	//   42   75:aload_1         
	//   43   76:bipush          7
	//   44   78:aload_0         
	//   45   79:invokevirtual   #281 <Method int f()>
	//   46   82:invokestatic    #273 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, g());
	//   47   85:aload_1         
	//   48   86:bipush          8
	//   49   88:aload_0         
	//   50   89:invokevirtual   #283 <Method int g()>
	//   51   92:invokestatic    #273 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, h());
	//   52   95:aload_1         
	//   53   96:bipush          9
	//   54   98:aload_0         
	//   55   99:invokevirtual   #285 <Method int h()>
	//   56  102:invokestatic    #273 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, i(), false);
	//   57  105:aload_1         
	//   58  106:bipush          10
	//   59  108:aload_0         
	//   60  109:invokevirtual   #287 <Method String i()>
	//   61  112:iconst_0        
	//   62  113:invokestatic    #290 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, j());
	//   63  116:aload_1         
	//   64  117:bipush          11
	//   65  119:aload_0         
	//   66  120:invokevirtual   #292 <Method int j()>
	//   67  123:invokestatic    #273 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, k());
	//   68  126:aload_1         
	//   69  127:bipush          12
	//   70  129:aload_0         
	//   71  130:invokevirtual   #294 <Method int k()>
	//   72  133:invokestatic    #273 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, l, false);
	//   73  136:aload_1         
	//   74  137:bipush          13
	//   75  139:aload_0         
	//   76  140:getfield        #63  <Field String l>
	//   77  143:iconst_0        
	//   78  144:invokestatic    #290 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//   79  147:aload_1         
	//   80  148:iload_2         
	//   81  149:invokestatic    #296 <Method void c.a(Parcel, int)>
	//   82  152:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ai();
	private float a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private String i;
	private int j;
	private int k;
	private String l;
	private JSONObject m;

	static 
	{
	//    0    0:new             #27  <Class ai>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void ai()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
