// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnd, bnf, bnw, bny, 
//			blb, bld, blk, bll, 
//			bln, blq, bnk, blr, 
//			zzfs, bla, zzhp, blh, 
//			blj, blg, bkx, blc, 
//			bdj, bky, bhf, bcr, 
//			bnv, blm

public final class bkz extends DefaultHandler
	implements bnd
{

	public bkz()
	{
		this(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #39  <Method void bkz(String)>
	//    3    5:return          
	}

	private bkz(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void DefaultHandler()>
		d = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #45  <Field String d>
		try
		{
			e = XmlPullParserFactory.newInstance();
	//    5    9:aload_0         
	//    6   10:invokestatic    #51  <Method XmlPullParserFactory XmlPullParserFactory.newInstance()>
	//    7   13:putfield        #53  <Field XmlPullParserFactory e>
			return;
	//    8   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   17:astore_1        
		{
			throw new RuntimeException("Couldn't create XmlPullParserFactory instance", ((Throwable) (s)));
	//   10   18:new             #55  <Class RuntimeException>
	//   11   21:dup             
	//   12   22:ldc1            #57  <String "Couldn't create XmlPullParserFactory instance">
	//   13   24:aload_1         
	//   14   25:invokespecial   #60  <Method void RuntimeException(String, Throwable)>
	//   15   28:athrow          
		}
	}

	private static float a(XmlPullParser xmlpullparser, float f)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "frameRate")));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:ldc1            #63  <String "frameRate">
	//    3    4:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    9:astore_0        
		float f1 = f;
	//    5   10:fload_1         
	//    6   11:fstore_2        
		if(xmlpullparser != null)
	//*   7   12:aload_0         
	//*   8   13:ifnull          67
		{
			xmlpullparser = ((XmlPullParser) (a.matcher(((CharSequence) (xmlpullparser)))));
	//    9   16:getstatic       #26  <Field Pattern a>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #73  <Method Matcher Pattern.matcher(CharSequence)>
	//   12   23:astore_0        
			f1 = f;
	//   13   24:fload_1         
	//   14   25:fstore_2        
			if(((Matcher) (xmlpullparser)).matches())
	//*  15   26:aload_0         
	//*  16   27:invokevirtual   #79  <Method boolean Matcher.matches()>
	//*  17   30:ifeq            67
			{
				int i = Integer.parseInt(((Matcher) (xmlpullparser)).group(1));
	//   18   33:aload_0         
	//   19   34:iconst_1        
	//   20   35:invokevirtual   #83  <Method String Matcher.group(int)>
	//   21   38:invokestatic    #89  <Method int Integer.parseInt(String)>
	//   22   41:istore_3        
				xmlpullparser = ((XmlPullParser) (((Matcher) (xmlpullparser)).group(2)));
	//   23   42:aload_0         
	//   24   43:iconst_2        
	//   25   44:invokevirtual   #83  <Method String Matcher.group(int)>
	//   26   47:astore_0        
				if(!TextUtils.isEmpty(((CharSequence) (xmlpullparser))))
	//*  27   48:aload_0         
	//*  28   49:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  29   52:ifne            64
					return (float)i / (float)Integer.parseInt(((String) (xmlpullparser)));
	//   30   55:iload_3         
	//   31   56:i2f             
	//   32   57:aload_0         
	//   33   58:invokestatic    #89  <Method int Integer.parseInt(String)>
	//   34   61:i2f             
	//   35   62:fdiv            
	//   36   63:freturn         
				f1 = i;
	//   37   64:iload_3         
	//   38   65:i2f             
	//   39   66:fstore_2        
			}
		}
		return f1;
	//   40   67:fload_2         
	//   41   68:freturn         
	}

	private static int a(int i, int j)
	{
		if(i == -1)
	//*   0    0:iload_0         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          7
			return j;
	//    3    5:iload_1         
	//    4    6:ireturn         
		if(j == -1)
	//*   5    7:iload_1         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          14
			return i;
	//    8   12:iload_0         
	//    9   13:ireturn         
		boolean flag;
		if(i == j)
	//*  10   14:iload_0         
	//*  11   15:iload_1         
	//*  12   16:icmpne          24
			flag = true;
	//   13   19:iconst_1        
	//   14   20:istore_2        
		else
	//*  15   21:goto            26
			flag = false;
	//   16   24:iconst_0        
	//   17   25:istore_2        
		bnf.b(flag);
	//   18   26:iload_2         
	//   19   27:invokestatic    #101 <Method void bnf.b(boolean)>
		return i;
	//   20   30:iload_0         
	//   21   31:ireturn         
	}

	private static int a(XmlPullParser xmlpullparser)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "contentType")));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:ldc1            #104 <String "contentType">
	//    3    4:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    9:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (xmlpullparser))))
	//*   5   10:aload_0         
	//*   6   11:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   14:ifne            50
		{
			if("audio".equals(((Object) (xmlpullparser))))
	//*   8   17:ldc1            #106 <String "audio">
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  11   23:ifeq            28
				return 1;
	//   12   26:iconst_1        
	//   13   27:ireturn         
			if("video".equals(((Object) (xmlpullparser))))
	//*  14   28:ldc1            #114 <String "video">
	//*  15   30:aload_0         
	//*  16   31:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  17   34:ifeq            39
				return 2;
	//   18   37:iconst_2        
	//   19   38:ireturn         
			if("text".equals(((Object) (xmlpullparser))))
	//*  20   39:ldc1            #116 <String "text">
	//*  21   41:aload_0         
	//*  22   42:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  23   45:ifeq            50
				return 3;
	//   24   48:iconst_3        
	//   25   49:ireturn         
		}
		return -1;
	//   26   50:iconst_m1       
	//   27   51:ireturn         
	}

	private static int a(XmlPullParser xmlpullparser, String s, int i)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_0        
		if(xmlpullparser == null)
	//*   5    9:aload_0         
	//*   6   10:ifnonnull       15
			return i;
	//    7   13:iload_2         
	//    8   14:ireturn         
		else
			return Integer.parseInt(((String) (xmlpullparser)));
	//    9   15:aload_0         
	//   10   16:invokestatic    #89  <Method int Integer.parseInt(String)>
	//   11   19:ireturn         
	}

	private static long a(XmlPullParser xmlpullparser, String s, long l)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_0        
		if(xmlpullparser == null)
	//*   5    9:aload_0         
	//*   6   10:ifnonnull       15
			return l;
	//    7   13:lload_2         
	//    8   14:lreturn         
		else
			return bnw.d(((String) (xmlpullparser)));
	//    9   15:aload_0         
	//   10   16:invokestatic    #123 <Method long bnw.d(String)>
	//   11   19:lreturn         
	}

	private static blb a(XmlPullParser xmlpullparser, String s)
	{
		String s1 = b(xmlpullparser, "schemeIdUri", "");
	//    0    0:aload_0         
	//    1    1:ldc1            #126 <String "schemeIdUri">
	//    2    3:ldc1            #128 <String "">
	//    3    5:invokestatic    #131 <Method String b(XmlPullParser, String, String)>
	//    4    8:astore_2        
		String s2 = b(xmlpullparser, "value", ((String) (null)));
	//    5    9:aload_0         
	//    6   10:ldc1            #133 <String "value">
	//    7   12:aconst_null     
	//    8   13:invokestatic    #131 <Method String b(XmlPullParser, String, String)>
	//    9   16:astore_3        
		String s3 = b(xmlpullparser, "id", ((String) (null)));
	//   10   17:aload_0         
	//   11   18:ldc1            #135 <String "id">
	//   12   20:aconst_null     
	//   13   21:invokestatic    #131 <Method String b(XmlPullParser, String, String)>
	//   14   24:astore          4
		do
			xmlpullparser.next();
	//   15   26:aload_0         
	//   16   27:invokeinterface #139 <Method int XmlPullParser.next()>
	//   17   32:pop             
		while(!bny.a(xmlpullparser, s));
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//   21   38:ifeq            26
		return new blb(s1, s2, s3);
	//   22   41:new             #146 <Class blb>
	//   23   44:dup             
	//   24   45:aload_2         
	//   25   46:aload_3         
	//   26   47:aload           4
	//   27   49:invokespecial   #149 <Method void blb(String, String, String)>
	//   28   52:areturn         
	}

	private static bld a(XmlPullParser xmlpullparser, String s, String s1)
	{
		s = xmlpullparser.getAttributeValue(((String) (null)), s);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_1        
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s1)));
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:aload_2         
	//    8   12:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//    9   17:astore_0        
		long l;
		long l1;
		if(xmlpullparser != null)
	//*  10   18:aload_0         
	//*  11   19:ifnull          65
		{
			xmlpullparser = ((XmlPullParser) (((String) (xmlpullparser)).split("-")));
	//   12   22:aload_0         
	//   13   23:ldc1            #152 <String "-">
	//   14   25:invokevirtual   #156 <Method String[] String.split(String)>
	//   15   28:astore_0        
			l = Long.parseLong(((String) (xmlpullparser[0])));
	//   16   29:aload_0         
	//   17   30:iconst_0        
	//   18   31:aaload          
	//   19   32:invokestatic    #161 <Method long Long.parseLong(String)>
	//   20   35:lstore_3        
			if(xmlpullparser.length == 2)
	//*  21   36:aload_0         
	//*  22   37:arraylength     
	//*  23   38:iconst_2        
	//*  24   39:icmpne          57
				l1 = (Long.parseLong(((String) (xmlpullparser[1]))) - l) + 1L;
	//   25   42:aload_0         
	//   26   43:iconst_1        
	//   27   44:aaload          
	//   28   45:invokestatic    #161 <Method long Long.parseLong(String)>
	//   29   48:lload_3         
	//   30   49:lsub            
	//   31   50:lconst_1        
	//   32   51:ladd            
	//   33   52:lstore          5
			else
	//*  34   54:goto            72
				l1 = -1L;
	//   35   57:ldc2w           #162 <Long -1L>
	//   36   60:lstore          5
		} else
	//*  37   62:goto            72
		{
			l1 = -1L;
	//   38   65:ldc2w           #162 <Long -1L>
	//   39   68:lstore          5
			l = 0L;
	//   40   70:lconst_0        
	//   41   71:lstore_3        
		}
		return new bld(s, l, l1);
	//   42   72:new             #165 <Class bld>
	//   43   75:dup             
	//   44   76:aload_1         
	//   45   77:lload_3         
	//   46   78:lload           5
	//   47   80:invokespecial   #168 <Method void bld(String, long, long)>
	//   48   83:areturn         
	}

	private final blk a(XmlPullParser xmlpullparser, blk blk1)
	{
		long l;
		if(blk1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			l = blk1.b;
	//    2    4:aload_2         
	//    3    5:getfield        #174 <Field long blk.b>
	//    4    8:lstore          4
		else
	//*   5   10:goto            16
			l = 1L;
	//    6   13:lconst_1        
	//    7   14:lstore          4
		long l1 = b(xmlpullparser, "timescale", l);
	//    8   16:aload_1         
	//    9   17:ldc1            #176 <String "timescale">
	//   10   19:lload           4
	//   11   21:invokestatic    #178 <Method long b(XmlPullParser, String, long)>
	//   12   24:lstore          6
		if(blk1 != null)
	//*  13   26:aload_2         
	//*  14   27:ifnull          39
			l = blk1.c;
	//   15   30:aload_2         
	//   16   31:getfield        #180 <Field long blk.c>
	//   17   34:lstore          4
		else
	//*  18   36:goto            42
			l = 0L;
	//   19   39:lconst_0        
	//   20   40:lstore          4
		long l2 = b(xmlpullparser, "presentationTimeOffset", l);
	//   21   42:aload_1         
	//   22   43:ldc1            #182 <String "presentationTimeOffset">
	//   23   45:lload           4
	//   24   47:invokestatic    #178 <Method long b(XmlPullParser, String, long)>
	//   25   50:lstore          8
		if(blk1 != null)
	//*  26   52:aload_2         
	//*  27   53:ifnull          65
			l = blk1.e;
	//   28   56:aload_2         
	//   29   57:getfield        #184 <Field long blk.e>
	//   30   60:lstore          4
		else
	//*  31   62:goto            70
			l = 0x1L;
	//   32   65:ldc2w           #185 <Long 0x1L>
	//   33   68:lstore          4
		l = b(xmlpullparser, "duration", l);
	//   34   70:aload_1         
	//   35   71:ldc1            #188 <String "duration">
	//   36   73:lload           4
	//   37   75:invokestatic    #178 <Method long b(XmlPullParser, String, long)>
	//   38   78:lstore          4
		int i;
		if(blk1 != null)
	//*  39   80:aload_2         
	//*  40   81:ifnull          92
			i = blk1.d;
	//   41   84:aload_2         
	//   42   85:getfield        #191 <Field int blk.d>
	//   43   88:istore_3        
		else
	//*  44   89:goto            94
			i = 1;
	//   45   92:iconst_1        
	//   46   93:istore_3        
		i = a(xmlpullparser, "startNumber", i);
	//   47   94:aload_1         
	//   48   95:ldc1            #193 <String "startNumber">
	//   49   97:iload_3         
	//   50   98:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//   51  101:istore_3        
		Object obj1 = null;
	//   52  102:aconst_null     
	//   53  103:astore          13
		bld bld2 = null;
	//   54  105:aconst_null     
	//   55  106:astore          15
		List list1 = ((List) (bld2));
	//   56  108:aload           15
	//   57  110:astore          14
		Object obj;
		List list;
		bld bld1;
		do
		{
			xmlpullparser.next();
	//   58  112:aload_1         
	//   59  113:invokeinterface #139 <Method int XmlPullParser.next()>
	//   60  118:pop             
			if(bny.b(xmlpullparser, "Initialization"))
	//*  61  119:aload_1         
	//*  62  120:ldc1            #197 <String "Initialization">
	//*  63  122:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*  64  125:ifeq            146
			{
				bld1 = d(xmlpullparser);
	//   65  128:aload_0         
	//   66  129:aload_1         
	//   67  130:invokespecial   #202 <Method bld d(XmlPullParser)>
	//   68  133:astore          12
				obj = obj1;
	//   69  135:aload           13
	//   70  137:astore          10
				list = list1;
	//   71  139:aload           14
	//   72  141:astore          11
			} else
	//*  73  143:goto            235
			if(bny.b(xmlpullparser, "SegmentTimeline"))
	//*  74  146:aload_1         
	//*  75  147:ldc1            #204 <String "SegmentTimeline">
	//*  76  149:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*  77  152:ifeq            172
			{
				list = c(xmlpullparser);
	//   78  155:aload_1         
	//   79  156:invokestatic    #207 <Method List c(XmlPullParser)>
	//   80  159:astore          11
				obj = obj1;
	//   81  161:aload           13
	//   82  163:astore          10
				bld1 = bld2;
	//   83  165:aload           15
	//   84  167:astore          12
			} else
	//*  85  169:goto            235
			{
				obj = obj1;
	//   86  172:aload           13
	//   87  174:astore          10
				bld1 = bld2;
	//   88  176:aload           15
	//   89  178:astore          12
				list = list1;
	//   90  180:aload           14
	//   91  182:astore          11
				if(bny.b(xmlpullparser, "SegmentURL"))
	//*  92  184:aload_1         
	//*  93  185:ldc1            #209 <String "SegmentURL">
	//*  94  187:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*  95  190:ifeq            235
				{
					obj = obj1;
	//   96  193:aload           13
	//   97  195:astore          10
					if(obj1 == null)
	//*  98  197:aload           13
	//*  99  199:ifnonnull       211
						obj = ((Object) (new ArrayList()));
	//  100  202:new             #211 <Class ArrayList>
	//  101  205:dup             
	//  102  206:invokespecial   #212 <Method void ArrayList()>
	//  103  209:astore          10
					((List) (obj)).add(((Object) (a(xmlpullparser, "media", "mediaRange"))));
	//  104  211:aload           10
	//  105  213:aload_1         
	//  106  214:ldc1            #214 <String "media">
	//  107  216:ldc1            #216 <String "mediaRange">
	//  108  218:invokestatic    #218 <Method bld a(XmlPullParser, String, String)>
	//  109  221:invokeinterface #223 <Method boolean List.add(Object)>
	//  110  226:pop             
					list = list1;
	//  111  227:aload           14
	//  112  229:astore          11
					bld1 = bld2;
	//  113  231:aload           15
	//  114  233:astore          12
				}
			}
			obj1 = obj;
	//  115  235:aload           10
	//  116  237:astore          13
			bld2 = bld1;
	//  117  239:aload           12
	//  118  241:astore          15
			list1 = list;
	//  119  243:aload           11
	//  120  245:astore          14
		} while(!bny.a(xmlpullparser, "SegmentList"));
	//  121  247:aload_1         
	//  122  248:ldc1            #225 <String "SegmentList">
	//  123  250:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//  124  253:ifeq            112
		if(blk1 != null)
	//* 125  256:aload_2         
	//* 126  257:ifnull          308
		{
			if(bld1 == null)
	//* 127  260:aload           12
	//* 128  262:ifnull          268
	//* 129  265:goto            274
				bld1 = blk1.a;
	//  130  268:aload_2         
	//  131  269:getfield        #228 <Field bld blk.a>
	//  132  272:astore          12
			if(list == null)
	//* 133  274:aload           11
	//* 134  276:ifnull          282
	//* 135  279:goto            288
				list = blk1.f;
	//  136  282:aload_2         
	//  137  283:getfield        #232 <Field List blk.f>
	//  138  286:astore          11
			if(obj == null)
	//* 139  288:aload           10
	//* 140  290:ifnull          296
	//* 141  293:goto            302
				obj = ((Object) (blk1.g));
	//  142  296:aload_2         
	//  143  297:getfield        #235 <Field List blk.g>
	//  144  300:astore          10
			xmlpullparser = ((XmlPullParser) (list));
	//  145  302:aload           11
	//  146  304:astore_1        
		} else
	//* 147  305:goto            311
		{
			xmlpullparser = ((XmlPullParser) (list));
	//  148  308:aload           11
	//  149  310:astore_1        
		}
		return new blk(bld1, l1, l2, i, l, ((List) (xmlpullparser)), ((List) (obj)));
	//  150  311:new             #171 <Class blk>
	//  151  314:dup             
	//  152  315:aload           12
	//  153  317:lload           6
	//  154  319:lload           8
	//  155  321:iload_3         
	//  156  322:lload           4
	//  157  324:aload_1         
	//  158  325:aload           10
	//  159  327:invokespecial   #238 <Method void blk(bld, long, long, int, long, List, List)>
	//  160  330:areturn         
	}

	private final bll a(XmlPullParser xmlpullparser, bll bll1)
	{
		long l;
		if(bll1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			l = bll1.b;
	//    2    4:aload_2         
	//    3    5:getfield        #242 <Field long bll.b>
	//    4    8:lstore          4
		else
	//*   5   10:goto            16
			l = 1L;
	//    6   13:lconst_1        
	//    7   14:lstore          4
		long l1 = b(xmlpullparser, "timescale", l);
	//    8   16:aload_1         
	//    9   17:ldc1            #176 <String "timescale">
	//   10   19:lload           4
	//   11   21:invokestatic    #178 <Method long b(XmlPullParser, String, long)>
	//   12   24:lstore          6
		if(bll1 != null)
	//*  13   26:aload_2         
	//*  14   27:ifnull          39
			l = bll1.c;
	//   15   30:aload_2         
	//   16   31:getfield        #243 <Field long bll.c>
	//   17   34:lstore          4
		else
	//*  18   36:goto            42
			l = 0L;
	//   19   39:lconst_0        
	//   20   40:lstore          4
		long l2 = b(xmlpullparser, "presentationTimeOffset", l);
	//   21   42:aload_1         
	//   22   43:ldc1            #182 <String "presentationTimeOffset">
	//   23   45:lload           4
	//   24   47:invokestatic    #178 <Method long b(XmlPullParser, String, long)>
	//   25   50:lstore          8
		if(bll1 != null)
	//*  26   52:aload_2         
	//*  27   53:ifnull          65
			l = bll1.e;
	//   28   56:aload_2         
	//   29   57:getfield        #244 <Field long bll.e>
	//   30   60:lstore          4
		else
	//*  31   62:goto            70
			l = 0x1L;
	//   32   65:ldc2w           #185 <Long 0x1L>
	//   33   68:lstore          4
		l = b(xmlpullparser, "duration", l);
	//   34   70:aload_1         
	//   35   71:ldc1            #188 <String "duration">
	//   36   73:lload           4
	//   37   75:invokestatic    #178 <Method long b(XmlPullParser, String, long)>
	//   38   78:lstore          4
		int i;
		if(bll1 != null)
	//*  39   80:aload_2         
	//*  40   81:ifnull          92
			i = bll1.d;
	//   41   84:aload_2         
	//   42   85:getfield        #245 <Field int bll.d>
	//   43   88:istore_3        
		else
	//*  44   89:goto            94
			i = 1;
	//   45   92:iconst_1        
	//   46   93:istore_3        
		i = a(xmlpullparser, "startNumber", i);
	//   47   94:aload_1         
	//   48   95:ldc1            #193 <String "startNumber">
	//   49   97:iload_3         
	//   50   98:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//   51  101:istore_3        
		bld bld2 = null;
	//   52  102:aconst_null     
	//   53  103:astore          12
		Object obj;
		if(bll1 != null)
	//*  54  105:aload_2         
	//*  55  106:ifnull          118
			obj = ((Object) (bll1.h));
	//   56  109:aload_2         
	//   57  110:getfield        #249 <Field blq bll.h>
	//   58  113:astore          10
		else
	//*  59  115:goto            121
			obj = null;
	//   60  118:aconst_null     
	//   61  119:astore          10
		blq blq1 = a(xmlpullparser, "media", ((blq) (obj)));
	//   62  121:aload_1         
	//   63  122:ldc1            #214 <String "media">
	//   64  124:aload           10
	//   65  126:invokestatic    #252 <Method blq a(XmlPullParser, String, blq)>
	//   66  129:astore          14
		if(bll1 != null)
	//*  67  131:aload_2         
	//*  68  132:ifnull          144
			obj = ((Object) (bll1.g));
	//   69  135:aload_2         
	//   70  136:getfield        #254 <Field blq bll.g>
	//   71  139:astore          10
		else
	//*  72  141:goto            147
			obj = null;
	//   73  144:aconst_null     
	//   74  145:astore          10
		blq blq2 = a(xmlpullparser, "initialization", ((blq) (obj)));
	//   75  147:aload_1         
	//   76  148:ldc2            #256 <String "initialization">
	//   77  151:aload           10
	//   78  153:invokestatic    #252 <Method blq a(XmlPullParser, String, blq)>
	//   79  156:astore          15
		List list = null;
	//   80  158:aconst_null     
	//   81  159:astore          13
		bld bld1;
		do
		{
			xmlpullparser.next();
	//   82  161:aload_1         
	//   83  162:invokeinterface #139 <Method int XmlPullParser.next()>
	//   84  167:pop             
			if(bny.b(xmlpullparser, "Initialization"))
	//*  85  168:aload_1         
	//*  86  169:ldc1            #197 <String "Initialization">
	//*  87  171:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*  88  174:ifeq            191
			{
				bld1 = d(xmlpullparser);
	//   89  177:aload_0         
	//   90  178:aload_1         
	//   91  179:invokespecial   #202 <Method bld d(XmlPullParser)>
	//   92  182:astore          11
				obj = ((Object) (list));
	//   93  184:aload           13
	//   94  186:astore          10
			} else
	//*  95  188:goto            218
			{
				obj = ((Object) (list));
	//   96  191:aload           13
	//   97  193:astore          10
				bld1 = bld2;
	//   98  195:aload           12
	//   99  197:astore          11
				if(bny.b(xmlpullparser, "SegmentTimeline"))
	//* 100  199:aload_1         
	//* 101  200:ldc1            #204 <String "SegmentTimeline">
	//* 102  202:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 103  205:ifeq            218
				{
					obj = ((Object) (c(xmlpullparser)));
	//  104  208:aload_1         
	//  105  209:invokestatic    #207 <Method List c(XmlPullParser)>
	//  106  212:astore          10
					bld1 = bld2;
	//  107  214:aload           12
	//  108  216:astore          11
				}
			}
			list = ((List) (obj));
	//  109  218:aload           10
	//  110  220:astore          13
			bld2 = bld1;
	//  111  222:aload           11
	//  112  224:astore          12
		} while(!bny.a(xmlpullparser, "SegmentTemplate"));
	//  113  226:aload_1         
	//  114  227:ldc2            #258 <String "SegmentTemplate">
	//  115  230:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//  116  233:ifeq            161
		if(bll1 != null)
	//* 117  236:aload_2         
	//* 118  237:ifnull          271
		{
			if(bld1 == null)
	//* 119  240:aload           11
	//* 120  242:ifnull          248
	//* 121  245:goto            254
				bld1 = bll1.a;
	//  122  248:aload_2         
	//  123  249:getfield        #259 <Field bld bll.a>
	//  124  252:astore          11
			if(obj == null)
	//* 125  254:aload           10
	//* 126  256:ifnull          262
	//* 127  259:goto            268
				obj = ((Object) (bll1.f));
	//  128  262:aload_2         
	//  129  263:getfield        #260 <Field List bll.f>
	//  130  266:astore          10
		}
	//* 131  268:goto            271
		return new bll(bld1, l1, l2, i, l, ((List) (obj)), blq2, blq1);
	//  132  271:new             #241 <Class bll>
	//  133  274:dup             
	//  134  275:aload           11
	//  135  277:lload           6
	//  136  279:lload           8
	//  137  281:iload_3         
	//  138  282:lload           4
	//  139  284:aload           10
	//  140  286:aload           15
	//  141  288:aload           14
	//  142  290:invokespecial   #263 <Method void bll(bld, long, long, int, long, List, blq, blq)>
	//  143  293:areturn         
	}

	private final bln a(XmlPullParser xmlpullparser, bln bln1)
	{
		long l;
		if(bln1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			l = bln1.b;
	//    2    4:aload_2         
	//    3    5:getfield        #267 <Field long bln.b>
	//    4    8:lstore_3        
		else
	//*   5    9:goto            14
			l = 1L;
	//    6   12:lconst_1        
	//    7   13:lstore_3        
		long l2 = b(xmlpullparser, "timescale", l);
	//    8   14:aload_1         
	//    9   15:ldc1            #176 <String "timescale">
	//   10   17:lload_3         
	//   11   18:invokestatic    #178 <Method long b(XmlPullParser, String, long)>
	//   12   21:lstore          7
		long l1 = 0L;
	//   13   23:lconst_0        
	//   14   24:lstore          5
		if(bln1 != null)
	//*  15   26:aload_2         
	//*  16   27:ifnull          38
			l = bln1.c;
	//   17   30:aload_2         
	//   18   31:getfield        #268 <Field long bln.c>
	//   19   34:lstore_3        
		else
	//*  20   35:goto            40
			l = 0L;
	//   21   38:lconst_0        
	//   22   39:lstore_3        
		long l3 = b(xmlpullparser, "presentationTimeOffset", l);
	//   23   40:aload_1         
	//   24   41:ldc1            #182 <String "presentationTimeOffset">
	//   25   43:lload_3         
	//   26   44:invokestatic    #178 <Method long b(XmlPullParser, String, long)>
	//   27   47:lstore          9
		if(bln1 != null)
	//*  28   49:aload_2         
	//*  29   50:ifnull          61
			l = bln1.d;
	//   30   53:aload_2         
	//   31   54:getfield        #270 <Field long bln.d>
	//   32   57:lstore_3        
		else
	//*  33   58:goto            63
			l = 0L;
	//   34   61:lconst_0        
	//   35   62:lstore_3        
		if(bln1 != null)
	//*  36   63:aload_2         
	//*  37   64:ifnull          73
			l1 = bln1.e;
	//   38   67:aload_2         
	//   39   68:getfield        #271 <Field long bln.e>
	//   40   71:lstore          5
		Object obj = null;
	//   41   73:aconst_null     
	//   42   74:astore          11
		String s = xmlpullparser.getAttributeValue(((String) (null)), "indexRange");
	//   43   76:aload_1         
	//   44   77:aconst_null     
	//   45   78:ldc2            #273 <String "indexRange">
	//   46   81:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//   47   86:astore          12
		if(s != null)
	//*  48   88:aload           12
	//*  49   90:ifnull          126
		{
			String as[] = s.split("-");
	//   50   93:aload           12
	//   51   95:ldc1            #152 <String "-">
	//   52   97:invokevirtual   #156 <Method String[] String.split(String)>
	//   53  100:astore          12
			l = Long.parseLong(as[0]);
	//   54  102:aload           12
	//   55  104:iconst_0        
	//   56  105:aaload          
	//   57  106:invokestatic    #161 <Method long Long.parseLong(String)>
	//   58  109:lstore_3        
			l1 = (Long.parseLong(as[1]) - l) + 1L;
	//   59  110:aload           12
	//   60  112:iconst_1        
	//   61  113:aaload          
	//   62  114:invokestatic    #161 <Method long Long.parseLong(String)>
	//   63  117:lload_3         
	//   64  118:lsub            
	//   65  119:lconst_1        
	//   66  120:ladd            
	//   67  121:lstore          5
		}
	//*  68  123:goto            126
		if(bln1 != null)
	//*  69  126:aload_2         
	//*  70  127:ifnull          136
			obj = ((Object) (bln1.a));
	//   71  130:aload_2         
	//   72  131:getfield        #274 <Field bld bln.a>
	//   73  134:astore          11
		do
		{
			xmlpullparser.next();
	//   74  136:aload_1         
	//   75  137:invokeinterface #139 <Method int XmlPullParser.next()>
	//   76  142:pop             
			bln1 = ((bln) (obj));
	//   77  143:aload           11
	//   78  145:astore_2        
			if(bny.b(xmlpullparser, "Initialization"))
	//*  79  146:aload_1         
	//*  80  147:ldc1            #197 <String "Initialization">
	//*  81  149:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*  82  152:ifeq            161
				bln1 = ((bln) (d(xmlpullparser)));
	//   83  155:aload_0         
	//   84  156:aload_1         
	//   85  157:invokespecial   #202 <Method bld d(XmlPullParser)>
	//   86  160:astore_2        
			obj = ((Object) (bln1));
	//   87  161:aload_2         
	//   88  162:astore          11
		} while(!bny.a(xmlpullparser, "SegmentBase"));
	//   89  164:aload_1         
	//   90  165:ldc2            #276 <String "SegmentBase">
	//   91  168:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//   92  171:ifeq            136
		return new bln(((bld) (bln1)), l2, l3, l, l1);
	//   93  174:new             #266 <Class bln>
	//   94  177:dup             
	//   95  178:aload_2         
	//   96  179:lload           7
	//   97  181:lload           9
	//   98  183:lload_3         
	//   99  184:lload           5
	//  100  186:invokespecial   #279 <Method void bln(bld, long, long, long, long)>
	//  101  189:areturn         
	}

	private static blq a(XmlPullParser xmlpullparser, String s, blq blq1)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_0        
		if(xmlpullparser != null)
	//*   5    9:aload_0         
	//*   6   10:ifnull          18
			return blq.a(((String) (xmlpullparser)));
	//    7   13:aload_0         
	//    8   14:invokestatic    #284 <Method blq blq.a(String)>
	//    9   17:areturn         
		else
			return blq1;
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	private static boolean a(String s)
	{
		return bnk.c(s) || "application/ttml+xml".equals(((Object) (s))) || "application/x-mp4-vtt".equals(((Object) (s))) || "application/cea-708".equals(((Object) (s))) || "application/cea-608".equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #289 <Method boolean bnk.c(String)>
	//    2    4:ifne            52
	//    3    7:ldc2            #291 <String "application/ttml+xml">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #112 <Method boolean String.equals(Object)>
	//    6   14:ifne            52
	//    7   17:ldc2            #293 <String "application/x-mp4-vtt">
	//    8   20:aload_0         
	//    9   21:invokevirtual   #112 <Method boolean String.equals(Object)>
	//   10   24:ifne            52
	//   11   27:ldc2            #295 <String "application/cea-708">
	//   12   30:aload_0         
	//   13   31:invokevirtual   #112 <Method boolean String.equals(Object)>
	//   14   34:ifne            52
	//   15   37:ldc2            #297 <String "application/cea-608">
	//   16   40:aload_0         
	//   17   41:invokevirtual   #112 <Method boolean String.equals(Object)>
	//   18   44:ifeq            50
	//   19   47:goto            52
	//   20   50:iconst_0        
	//   21   51:ireturn         
	//   22   52:iconst_1        
	//   23   53:ireturn         
	}

	private static long b(XmlPullParser xmlpullparser, String s, long l)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_0        
		if(xmlpullparser == null)
	//*   5    9:aload_0         
	//*   6   10:ifnonnull       15
			return l;
	//    7   13:lload_2         
	//    8   14:lreturn         
		else
			return Long.parseLong(((String) (xmlpullparser)));
	//    9   15:aload_0         
	//   10   16:invokestatic    #161 <Method long Long.parseLong(String)>
	//   11   19:lreturn         
	}

	private final bky b(Uri uri, InputStream inputstream)
	{
		int i;
		int j;
		int i1;
		int l1;
		int i2;
		long l3;
		long l5;
		long l6;
		long l8;
		long l9;
		long l10;
		boolean flag4;
		Object obj;
		Object obj1;
		InputStream inputstream1;
		InputStream inputstream2;
		Object obj2;
		Object obj4;
		float f;
		float f1;
		int k;
		int l;
		boolean flag1;
		int j1;
		int k1;
		boolean flag2;
		boolean flag3;
		int j2;
		int k2;
		int l2;
		int i3;
		int j3;
		int k3;
		long l4;
		long l7;
		long l11;
		ArrayList arraylist;
		String s;
		ArrayList arraylist1;
		ArrayList arraylist2;
		ArrayList arraylist3;
		Object obj3;
		String s1;
		String s2;
		Object obj5;
		String as[];
		Object obj6;
		String s3;
		XmlPullParser xmlpullparser;
		ArrayList arraylist4;
		ArrayList arraylist5;
		ArrayList arraylist6;
		ArrayList arraylist7;
		String s4;
		String s5;
		Matcher matcher;
		try
		{
			xmlpullparser = e.newPullParser();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field XmlPullParserFactory e>
	//    2    4:invokevirtual   #302 <Method XmlPullParser XmlPullParserFactory.newPullParser()>
	//    3    7:astore          61
		}
	//*   4    9:aconst_null     
	//*   5   10:astore          42
	//*   6   12:aload           61
	//*   7   14:aload_2         
	//*   8   15:aconst_null     
	//*   9   16:invokeinterface #306 <Method void XmlPullParser.setInput(InputStream, String)>
	//*  10   21:aload           61
	//*  11   23:invokeinterface #139 <Method int XmlPullParser.next()>
	//*  12   28:iconst_2        
	//*  13   29:icmpne          2853
	//*  14   32:ldc2            #308 <String "MPD">
	//*  15   35:aload           61
	//*  16   37:invokeinterface #312 <Method String XmlPullParser.getName()>
	//*  17   42:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  18   45:ifeq            2853
	//*  19   48:aload_1         
	//*  20   49:invokevirtual   #317 <Method String Uri.toString()>
	//*  21   52:astore_2        
	//*  22   53:aload           61
	//*  23   55:aconst_null     
	//*  24   56:ldc2            #319 <String "availabilityStartTime">
	//*  25   59:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//*  26   64:astore_1        
	//*  27   65:aload_1         
	//*  28   66:ifnonnull       77
	//*  29   69:ldc2w           #185 <Long 0x1L>
	//*  30   72:lstore          31
	//*  31   74:goto            83
	//*  32   77:aload_1         
	//*  33   78:invokestatic    #321 <Method long bnw.e(String)>
	//*  34   81:lstore          31
	//*  35   83:aload           61
	//*  36   85:ldc2            #323 <String "mediaPresentationDuration">
	//*  37   88:ldc2w           #185 <Long 0x1L>
	//*  38   91:invokestatic    #325 <Method long a(XmlPullParser, String, long)>
	//*  39   94:lstore          29
	//*  40   96:aload           61
	//*  41   98:ldc2            #327 <String "minBufferTime">
	//*  42  101:ldc2w           #185 <Long 0x1L>
	//*  43  104:invokestatic    #325 <Method long a(XmlPullParser, String, long)>
	//*  44  107:lstore          25
	//*  45  109:aload           61
	//*  46  111:aconst_null     
	//*  47  112:ldc2            #329 <String "type">
	//*  48  115:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//*  49  120:astore_1        
	//*  50  121:aload_1         
	//*  51  122:ifnull          2874
	//*  52  125:aload_1         
	//*  53  126:ldc2            #331 <String "dynamic">
	//*  54  129:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  55  132:ifeq            2874
	//*  56  135:iconst_1        
	//*  57  136:istore          41
	//*  58  138:goto            141
	//*  59  141:iload           41
	//*  60  143:ifeq            2880
	//*  61  146:aload           61
	//*  62  148:ldc2            #333 <String "minimumUpdatePeriod">
	//*  63  151:ldc2w           #185 <Long 0x1L>
	//*  64  154:invokestatic    #325 <Method long a(XmlPullParser, String, long)>
	//*  65  157:lstore          33
	//*  66  159:goto            162
	//*  67  162:iload           41
	//*  68  164:ifeq            2888
	//*  69  167:aload           61
	//*  70  169:ldc2            #335 <String "timeShiftBufferDepth">
	//*  71  172:ldc2w           #185 <Long 0x1L>
	//*  72  175:invokestatic    #325 <Method long a(XmlPullParser, String, long)>
	//*  73  178:lstore          35
	//*  74  180:goto            183
	//*  75  183:iload           41
	//*  76  185:ifeq            2896
	//*  77  188:aload           61
	//*  78  190:ldc2            #337 <String "suggestedPresentationDelay">
	//*  79  193:ldc2w           #185 <Long 0x1L>
	//*  80  196:invokestatic    #325 <Method long a(XmlPullParser, String, long)>
	//*  81  199:lstore          37
	//*  82  201:goto            204
	//*  83  204:new             #211 <Class ArrayList>
	//*  84  207:dup             
	//*  85  208:invokespecial   #212 <Method void ArrayList()>
	//*  86  211:astore_1        
	//*  87  212:iload           41
	//*  88  214:ifeq            2904
	//*  89  217:ldc2w           #185 <Long 0x1L>
	//*  90  220:lstore          23
	//*  91  222:goto            2907
	//*  92  225:aload           61
	//*  93  227:invokeinterface #139 <Method int XmlPullParser.next()>
	//*  94  232:pop             
	//*  95  233:aload           61
	//*  96  235:ldc2            #339 <String "BaseURL">
	//*  97  238:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*  98  241:ifeq            262
	//*  99  244:iload           5
	//* 100  246:ifne            2931
	//* 101  249:aload           61
	//* 102  251:aload_2         
	//* 103  252:invokestatic    #342 <Method String b(XmlPullParser, String)>
	//* 104  255:astore_2        
	//* 105  256:iconst_1        
	//* 106  257:istore          5
	//* 107  259:goto            2763
	//* 108  262:aload           61
	//* 109  264:ldc2            #344 <String "UTCTiming">
	//* 110  267:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 111  270:ifeq            307
	//* 112  273:new             #346 <Class blr>
	//* 113  276:dup             
	//* 114  277:aload           61
	//* 115  279:aload           42
	//* 116  281:ldc1            #126 <String "schemeIdUri">
	//* 117  283:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 118  288:aload           61
	//* 119  290:aload           42
	//* 120  292:ldc1            #133 <String "value">
	//* 121  294:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 122  299:invokespecial   #349 <Method void blr(String, String)>
	//* 123  302:astore          54
	//* 124  304:goto            2763
	//* 125  307:aload           61
	//* 126  309:ldc2            #351 <String "Location">
	//* 127  312:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 128  315:ifeq            333
	//* 129  318:aload           61
	//* 130  320:invokeinterface #354 <Method String XmlPullParser.nextText()>
	//* 131  325:invokestatic    #358 <Method Uri Uri.parse(String)>
	//* 132  328:astore          55
	//* 133  330:goto            2763
	//* 134  333:aload           61
	//* 135  335:ldc2            #360 <String "Period">
	//* 136  338:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 137  341:ifeq            3140
	//* 138  344:iload           10
	//* 139  346:ifne            3140
	//* 140  349:aload           61
	//* 141  351:aload           42
	//* 142  353:ldc1            #135 <String "id">
	//* 143  355:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 144  360:astore          48
	//* 145  362:aload           61
	//* 146  364:ldc2            #362 <String "start">
	//* 147  367:lload           27
	//* 148  369:invokestatic    #325 <Method long a(XmlPullParser, String, long)>
	//* 149  372:lstore          29
	//* 150  374:aload           61
	//* 151  376:ldc1            #188 <String "duration">
	//* 152  378:ldc2w           #185 <Long 0x1L>
	//* 153  381:invokestatic    #325 <Method long a(XmlPullParser, String, long)>
	//* 154  384:lstore          39
	//* 155  386:new             #211 <Class ArrayList>
	//* 156  389:dup             
	//* 157  390:invokespecial   #212 <Method void ArrayList()>
	//* 158  393:astore          46
	//* 159  395:aload_2         
	//* 160  396:astore          43
	//* 161  398:aconst_null     
	//* 162  399:astore          44
	//* 163  401:iconst_0        
	//* 164  402:istore          11
	//* 165  404:aload_2         
	//* 166  405:astore          45
	//* 167  407:aload_1         
	//* 168  408:astore          47
	//* 169  410:iload           5
	//* 170  412:istore          7
	//* 171  414:aload           61
	//* 172  416:invokeinterface #139 <Method int XmlPullParser.next()>
	//* 173  421:pop             
	//* 174  422:aload           61
	//* 175  424:ldc2            #339 <String "BaseURL">
	//* 176  427:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 177  430:ifeq            455
	//* 178  433:iload           11
	//* 179  435:ifne            2934
	//* 180  438:aload           61
	//* 181  440:aload           43
	//* 182  442:invokestatic    #342 <Method String b(XmlPullParser, String)>
	//* 183  445:astore_1        
	//* 184  446:iconst_1        
	//* 185  447:istore          11
	//* 186  449:aload           44
	//* 187  451:astore_2        
	//* 188  452:goto            2566
	//* 189  455:aload           61
	//* 190  457:ldc2            #364 <String "AdaptationSet">
	//* 191  460:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 192  463:ifeq            2498
	//* 193  466:aload           61
	//* 194  468:ldc1            #135 <String "id">
	//* 195  470:iconst_m1       
	//* 196  471:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//* 197  474:istore          18
	//* 198  476:aload           61
	//* 199  478:invokestatic    #366 <Method int a(XmlPullParser)>
	//* 200  481:istore          16
	//* 201  483:aload           61
	//* 202  485:aconst_null     
	//* 203  486:ldc2            #368 <String "mimeType">
	//* 204  489:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 205  494:astore          57
	//* 206  496:aload           61
	//* 207  498:aconst_null     
	//* 208  499:ldc2            #370 <String "codecs">
	//* 209  502:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 210  507:astore          56
	//* 211  509:aload           61
	//* 212  511:ldc2            #372 <String "width">
	//* 213  514:iconst_m1       
	//* 214  515:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//* 215  518:istore          13
	//* 216  520:aload           61
	//* 217  522:ldc2            #374 <String "height">
	//* 218  525:iconst_m1       
	//* 219  526:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//* 220  529:istore          5
	//* 221  531:aload           61
	//* 222  533:ldc2            #375 <Float -1F>
	//* 223  536:invokestatic    #377 <Method float a(XmlPullParser, float)>
	//* 224  539:fstore_3        
	//* 225  540:aload           61
	//* 226  542:ldc2            #379 <String "audioSamplingRate">
	//* 227  545:iconst_m1       
	//* 228  546:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//* 229  549:istore          12
	//* 230  551:aload           61
	//* 231  553:aconst_null     
	//* 232  554:ldc2            #381 <String "lang">
	//* 233  557:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 234  562:astore          52
	//* 235  564:new             #211 <Class ArrayList>
	//* 236  567:dup             
	//* 237  568:invokespecial   #212 <Method void ArrayList()>
	//* 238  571:astore          50
	//* 239  573:new             #211 <Class ArrayList>
	//* 240  576:dup             
	//* 241  577:invokespecial   #212 <Method void ArrayList()>
	//* 242  580:astore          49
	//* 243  582:new             #211 <Class ArrayList>
	//* 244  585:dup             
	//* 245  586:invokespecial   #212 <Method void ArrayList()>
	//* 246  589:astore          62
	//* 247  591:new             #211 <Class ArrayList>
	//* 248  594:dup             
	//* 249  595:invokespecial   #212 <Method void ArrayList()>
	//* 250  598:astore          51
	//* 251  600:new             #211 <Class ArrayList>
	//* 252  603:dup             
	//* 253  604:invokespecial   #212 <Method void ArrayList()>
	//* 254  607:astore          63
	//* 255  609:aload           43
	//* 256  611:astore_1        
	//* 257  612:aload           44
	//* 258  614:astore          53
	//* 259  616:iconst_0        
	//* 260  617:istore          15
	//* 261  619:iconst_0        
	//* 262  620:istore          14
	//* 263  622:iconst_m1       
	//* 264  623:istore          8
	//* 265  625:aload           61
	//* 266  627:invokeinterface #139 <Method int XmlPullParser.next()>
	//* 267  632:pop             
	//* 268  633:aload           61
	//* 269  635:ldc2            #339 <String "BaseURL">
	//* 270  638:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 271  641:ifeq            669
	//* 272  644:iload           15
	//* 273  646:ifne            2937
	//* 274  649:aload           61
	//* 275  651:aload_1         
	//* 276  652:invokestatic    #342 <Method String b(XmlPullParser, String)>
	//* 277  655:astore_1        
	//* 278  656:iconst_1        
	//* 279  657:istore          15
	//* 280  659:iload           16
	//* 281  661:istore          9
	//* 282  663:aload           53
	//* 283  665:astore_2        
	//* 284  666:goto            2246
	//* 285  669:aload           61
	//* 286  671:ldc2            #383 <String "ContentProtection">
	//* 287  674:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 288  677:ifeq            700
	//* 289  680:aload           61
	//* 290  682:invokestatic    #386 <Method zzhp$zza b(XmlPullParser)>
	//* 291  685:astore_2        
	//* 292  686:aload_2         
	//* 293  687:ifnull          2940
	//* 294  690:aload           50
	//* 295  692:aload_2         
	//* 296  693:invokevirtual   #387 <Method boolean ArrayList.add(Object)>
	//* 297  696:pop             
	//* 298  697:goto            2940
	//* 299  700:aload           61
	//* 300  702:ldc2            #389 <String "ContentComponent">
	//* 301  705:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 302  708:ifeq            761
	//* 303  711:aload           61
	//* 304  713:aconst_null     
	//* 305  714:ldc2            #381 <String "lang">
	//* 306  717:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 307  722:astore_2        
	//* 308  723:aload           52
	//* 309  725:ifnonnull       2943
	//* 310  728:aload_2         
	//* 311  729:astore          52
	//* 312  731:goto            743
	//* 313  734:aload           52
	//* 314  736:aload_2         
	//* 315  737:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 316  740:invokestatic    #101 <Method void bnf.b(boolean)>
	//* 317  743:iload           16
	//* 318  745:aload           61
	//* 319  747:invokestatic    #366 <Method int a(XmlPullParser)>
	//* 320  750:invokestatic    #391 <Method int a(int, int)>
	//* 321  753:istore          9
	//* 322  755:aload           53
	//* 323  757:astore_2        
	//* 324  758:goto            2246
	//* 325  761:aload_1         
	//* 326  762:astore_2        
	//* 327  763:aload           61
	//* 328  765:ldc2            #393 <String "Role">
	//* 329  768:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 330  771:ifeq            839
	//* 331  774:aload           61
	//* 332  776:ldc1            #126 <String "schemeIdUri">
	//* 333  778:aconst_null     
	//* 334  779:invokestatic    #131 <Method String b(XmlPullParser, String, String)>
	//* 335  782:astore_1        
	//* 336  783:aload           61
	//* 337  785:ldc1            #133 <String "value">
	//* 338  787:aconst_null     
	//* 339  788:invokestatic    #131 <Method String b(XmlPullParser, String, String)>
	//* 340  791:astore          42
	//* 341  793:aload           61
	//* 342  795:invokeinterface #139 <Method int XmlPullParser.next()>
	//* 343  800:pop             
	//* 344  801:aload           61
	//* 345  803:ldc2            #393 <String "Role">
	//* 346  806:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//* 347  809:ifeq            793
	//* 348  812:ldc2            #395 <String "urn:mpeg:dash:role:2011">
	//* 349  815:aload_1         
	//* 350  816:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 351  819:ifeq            2950
	//* 352  822:ldc2            #397 <String "main">
	//* 353  825:aload           42
	//* 354  827:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 355  830:ifeq            2950
	//* 356  833:iconst_1        
	//* 357  834:istore          6
	//* 358  836:goto            2953
	//* 359  839:aload           61
	//* 360  841:ldc2            #399 <String "AudioChannelConfiguration">
	//* 361  844:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 362  847:ifeq            869
	//* 363  850:aload           61
	//* 364  852:invokestatic    #401 <Method int e(XmlPullParser)>
	//* 365  855:istore          8
	//* 366  857:aload_2         
	//* 367  858:astore_1        
	//* 368  859:iload           16
	//* 369  861:istore          9
	//* 370  863:aload           53
	//* 371  865:astore_2        
	//* 372  866:goto            2246
	//* 373  869:aload           61
	//* 374  871:ldc2            #403 <String "Accessibility">
	//* 375  874:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 376  877:ifeq            897
	//* 377  880:aload           62
	//* 378  882:aload           61
	//* 379  884:ldc2            #403 <String "Accessibility">
	//* 380  887:invokestatic    #405 <Method blb a(XmlPullParser, String)>
	//* 381  890:invokevirtual   #387 <Method boolean ArrayList.add(Object)>
	//* 382  893:pop             
	//* 383  894:goto            3091
	//* 384  897:aload           61
	//* 385  899:ldc2            #407 <String "SupplementalProperty">
	//* 386  902:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 387  905:ifeq            925
	//* 388  908:aload           51
	//* 389  910:aload           61
	//* 390  912:ldc2            #407 <String "SupplementalProperty">
	//* 391  915:invokestatic    #405 <Method blb a(XmlPullParser, String)>
	//* 392  918:invokevirtual   #387 <Method boolean ArrayList.add(Object)>
	//* 393  921:pop             
	//* 394  922:goto            3091
	//* 395  925:aload           61
	//* 396  927:ldc2            #409 <String "Representation">
	//* 397  930:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 398  933:ifeq            2074
	//* 399  936:aload           61
	//* 400  938:aconst_null     
	//* 401  939:ldc1            #135 <String "id">
	//* 402  941:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 403  946:astore          66
	//* 404  948:aload           61
	//* 405  950:ldc2            #411 <String "bandwidth">
	//* 406  953:iconst_m1       
	//* 407  954:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//* 408  957:istore          19
	//* 409  959:aload           61
	//* 410  961:ldc2            #368 <String "mimeType">
	//* 411  964:aload           57
	//* 412  966:invokestatic    #131 <Method String b(XmlPullParser, String, String)>
	//* 413  969:astore          60
	//* 414  971:aload           61
	//* 415  973:ldc2            #370 <String "codecs">
	//* 416  976:aload           56
	//* 417  978:invokestatic    #131 <Method String b(XmlPullParser, String, String)>
	//* 418  981:astore          67
	//* 419  983:aload           61
	//* 420  985:ldc2            #372 <String "width">
	//* 421  988:iload           13
	//* 422  990:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//* 423  993:istore          20
	//* 424  995:aload           61
	//* 425  997:ldc2            #374 <String "height">
	//* 426 1000:iload           5
	//* 427 1002:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//* 428 1005:istore          21
	//* 429 1007:aload           61
	//* 430 1009:fload_3         
	//* 431 1010:invokestatic    #377 <Method float a(XmlPullParser, float)>
	//* 432 1013:fstore          4
	//* 433 1015:aload           61
	//* 434 1017:ldc2            #379 <String "audioSamplingRate">
	//* 435 1020:iload           12
	//* 436 1022:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//* 437 1025:istore          22
	//* 438 1027:new             #211 <Class ArrayList>
	//* 439 1030:dup             
	//* 440 1031:invokespecial   #212 <Method void ArrayList()>
	//* 441 1034:astore          64
	//* 442 1036:new             #211 <Class ArrayList>
	//* 443 1039:dup             
	//* 444 1040:invokespecial   #212 <Method void ArrayList()>
	//* 445 1043:astore          65
	//* 446 1045:iload           8
	//* 447 1047:istore          6
	//* 448 1049:aload           53
	//* 449 1051:astore_1        
	//* 450 1052:aload_2         
	//* 451 1053:astore          58
	//* 452 1055:iconst_0        
	//* 453 1056:istore          17
	//* 454 1058:iload           5
	//* 455 1060:istore          9
	//* 456 1062:aload           61
	//* 457 1064:invokeinterface #139 <Method int XmlPullParser.next()>
	//* 458 1069:pop             
	//* 459 1070:aload           61
	//* 460 1072:ldc2            #339 <String "BaseURL">
	//* 461 1075:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 462 1078:ifeq            1108
	//* 463 1081:iload           17
	//* 464 1083:ifne            2972
	//* 465 1086:aload           61
	//* 466 1088:aload           58
	//* 467 1090:invokestatic    #342 <Method String b(XmlPullParser, String)>
	//* 468 1093:astore          58
	//* 469 1095:iload           6
	//* 470 1097:istore          5
	//* 471 1099:iconst_1        
	//* 472 1100:istore          17
	//* 473 1102:aload_1         
	//* 474 1103:astore          42
	//* 475 1105:goto            1283
	//* 476 1108:aload           61
	//* 477 1110:ldc2            #399 <String "AudioChannelConfiguration">
	//* 478 1113:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 479 1116:ifeq            1132
	//* 480 1119:aload           61
	//* 481 1121:invokestatic    #401 <Method int e(XmlPullParser)>
	//* 482 1124:istore          5
	//* 483 1126:aload_1         
	//* 484 1127:astore          42
	//* 485 1129:goto            1283
	//* 486 1132:aload           61
	//* 487 1134:ldc2            #276 <String "SegmentBase">
	//* 488 1137:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 489 1140:ifeq            1162
	//* 490 1143:aload_0         
	//* 491 1144:aload           61
	//* 492 1146:aload_1         
	//* 493 1147:checkcast       #266 <Class bln>
	//* 494 1150:invokespecial   #413 <Method bln a(XmlPullParser, bln)>
	//* 495 1153:astore          42
	//* 496 1155:iload           6
	//* 497 1157:istore          5
	//* 498 1159:goto            1283
	//* 499 1162:aload           61
	//* 500 1164:ldc1            #225 <String "SegmentList">
	//* 501 1166:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 502 1169:ifeq            1191
	//* 503 1172:aload_0         
	//* 504 1173:aload           61
	//* 505 1175:aload_1         
	//* 506 1176:checkcast       #171 <Class blk>
	//* 507 1179:invokespecial   #415 <Method blk a(XmlPullParser, blk)>
	//* 508 1182:astore          42
	//* 509 1184:iload           6
	//* 510 1186:istore          5
	//* 511 1188:goto            1283
	//* 512 1191:aload           61
	//* 513 1193:ldc2            #258 <String "SegmentTemplate">
	//* 514 1196:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 515 1199:ifeq            1221
	//* 516 1202:aload_0         
	//* 517 1203:aload           61
	//* 518 1205:aload_1         
	//* 519 1206:checkcast       #241 <Class bll>
	//* 520 1209:invokespecial   #417 <Method bll a(XmlPullParser, bll)>
	//* 521 1212:astore          42
	//* 522 1214:iload           6
	//* 523 1216:istore          5
	//* 524 1218:goto            1283
	//* 525 1221:aload           61
	//* 526 1223:ldc2            #383 <String "ContentProtection">
	//* 527 1226:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 528 1229:ifeq            1255
	//* 529 1232:aload           61
	//* 530 1234:invokestatic    #386 <Method zzhp$zza b(XmlPullParser)>
	//* 531 1237:astore          42
	//* 532 1239:aload           42
	//* 533 1241:ifnull          2972
	//* 534 1244:aload           64
	//* 535 1246:aload           42
	//* 536 1248:invokevirtual   #387 <Method boolean ArrayList.add(Object)>
	//* 537 1251:pop             
	//* 538 1252:goto            2972
	//* 539 1255:aload           61
	//* 540 1257:ldc2            #419 <String "InbandEventStream">
	//* 541 1260:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 542 1263:ifeq            2972
	//* 543 1266:aload           65
	//* 544 1268:aload           61
	//* 545 1270:ldc2            #419 <String "InbandEventStream">
	//* 546 1273:invokestatic    #405 <Method blb a(XmlPullParser, String)>
	//* 547 1276:invokevirtual   #387 <Method boolean ArrayList.add(Object)>
	//* 548 1279:pop             
	//* 549 1280:goto            2972
	//* 550 1283:iload           9
	//* 551 1285:istore          6
	//* 552 1287:aload           61
	//* 553 1289:ldc2            #409 <String "Representation">
	//* 554 1292:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//* 555 1295:ifeq            3077
	//* 556 1298:aload           60
	//* 557 1300:invokestatic    #421 <Method boolean bnk.a(String)>
	//* 558 1303:ifeq            1359
	//* 559 1306:aload           67
	//* 560 1308:ifnull          2991
	//* 561 1311:aload           67
	//* 562 1313:ldc2            #423 <String ",">
	//* 563 1316:invokevirtual   #156 <Method String[] String.split(String)>
	//* 564 1319:astore          59
	//* 565 1321:aload           59
	//* 566 1323:arraylength     
	//* 567 1324:istore          17
	//* 568 1326:iconst_0        
	//* 569 1327:istore          9
	//* 570 1329:iload           9
	//* 571 1331:iload           17
	//* 572 1333:icmpge          2991
	//* 573 1336:aload           59
	//* 574 1338:iload           9
	//* 575 1340:aaload          
	//* 576 1341:invokestatic    #426 <Method String bnk.d(String)>
	//* 577 1344:astore_1        
	//* 578 1345:aload_1         
	//* 579 1346:ifnull          2982
	//* 580 1349:aload_1         
	//* 581 1350:invokestatic    #421 <Method boolean bnk.a(String)>
	//* 582 1353:ifeq            2982
	//* 583 1356:goto            1540
	//* 584 1359:aload           60
	//* 585 1361:invokestatic    #428 <Method boolean bnk.b(String)>
	//* 586 1364:ifeq            1420
	//* 587 1367:aload           67
	//* 588 1369:ifnull          3005
	//* 589 1372:aload           67
	//* 590 1374:ldc2            #423 <String ",">
	//* 591 1377:invokevirtual   #156 <Method String[] String.split(String)>
	//* 592 1380:astore          59
	//* 593 1382:aload           59
	//* 594 1384:arraylength     
	//* 595 1385:istore          17
	//* 596 1387:iconst_0        
	//* 597 1388:istore          9
	//* 598 1390:iload           9
	//* 599 1392:iload           17
	//* 600 1394:icmpge          3005
	//* 601 1397:aload           59
	//* 602 1399:iload           9
	//* 603 1401:aaload          
	//* 604 1402:invokestatic    #426 <Method String bnk.d(String)>
	//* 605 1405:astore_1        
	//* 606 1406:aload_1         
	//* 607 1407:ifnull          2996
	//* 608 1410:aload_1         
	//* 609 1411:invokestatic    #428 <Method boolean bnk.b(String)>
	//* 610 1414:ifeq            2996
	//* 611 1417:goto            1540
	//* 612 1420:aload           60
	//* 613 1422:invokestatic    #429 <Method boolean a(String)>
	//* 614 1425:ifeq            1434
	//* 615 1428:aload           60
	//* 616 1430:astore_1        
	//* 617 1431:goto            1540
	//* 618 1434:ldc2            #431 <String "application/mp4">
	//* 619 1437:aload           60
	//* 620 1439:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 621 1442:ifeq            1481
	//* 622 1445:ldc2            #433 <String "stpp">
	//* 623 1448:aload           67
	//* 624 1450:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 625 1453:ifeq            1463
	//* 626 1456:ldc2            #291 <String "application/ttml+xml">
	//* 627 1459:astore_1        
	//* 628 1460:goto            1540
	//* 629 1463:ldc2            #435 <String "wvtt">
	//* 630 1466:aload           67
	//* 631 1468:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 632 1471:ifeq            3022
	//* 633 1474:ldc2            #293 <String "application/x-mp4-vtt">
	//* 634 1477:astore_1        
	//* 635 1478:goto            1540
	//* 636 1481:ldc2            #437 <String "application/x-rawcc">
	//* 637 1484:aload           60
	//* 638 1486:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 639 1489:ifeq            3022
	//* 640 1492:aload           67
	//* 641 1494:ifnull          3017
	//* 642 1497:aload           67
	//* 643 1499:ldc2            #439 <String "cea708">
	//* 644 1502:invokevirtual   #442 <Method boolean String.contains(CharSequence)>
	//* 645 1505:ifeq            1515
	//* 646 1508:ldc2            #295 <String "application/cea-708">
	//* 647 1511:astore_1        
	//* 648 1512:goto            1540
	//* 649 1515:aload           67
	//* 650 1517:ldc2            #444 <String "eia608">
	//* 651 1520:invokevirtual   #442 <Method boolean String.contains(CharSequence)>
	//* 652 1523:ifne            3010
	//* 653 1526:aload           67
	//* 654 1528:ldc2            #446 <String "cea608">
	//* 655 1531:invokevirtual   #442 <Method boolean String.contains(CharSequence)>
	//* 656 1534:ifeq            3017
	//* 657 1537:goto            3010
	//* 658 1540:aload_1         
	//* 659 1541:ifnull          1939
	//* 660 1544:aload_1         
	//* 661 1545:invokestatic    #428 <Method boolean bnk.b(String)>
	//* 662 1548:ifeq            1576
	//* 663 1551:aload           66
	//* 664 1553:aload           60
	//* 665 1555:aload_1         
	//* 666 1556:aload           67
	//* 667 1558:iload           19
	//* 668 1560:iload           20
	//* 669 1562:iload           21
	//* 670 1564:fload           4
	//* 671 1566:aconst_null     
	//* 672 1567:iload           14
	//* 673 1569:invokestatic    #451 <Method zzfs zzfs.a(String, String, String, String, int, int, int, float, List, int)>
	//* 674 1572:astore_1        
	//* 675 1573:goto            3063
	//* 676 1576:aload_1         
	//* 677 1577:invokestatic    #421 <Method boolean bnk.a(String)>
	//* 678 1580:ifeq            1608
	//* 679 1583:aload           66
	//* 680 1585:aload           60
	//* 681 1587:aload_1         
	//* 682 1588:aload           67
	//* 683 1590:iload           19
	//* 684 1592:iload           5
	//* 685 1594:iload           22
	//* 686 1596:aconst_null     
	//* 687 1597:iload           14
	//* 688 1599:aload           52
	//* 689 1601:invokestatic    #454 <Method zzfs zzfs.a(String, String, String, String, int, int, int, List, int, String)>
	//* 690 1604:astore_1        
	//* 691 1605:goto            3063
	//* 692 1608:aload_1         
	//* 693 1609:invokestatic    #429 <Method boolean a(String)>
	//* 694 1612:ifeq            1939
	//* 695 1615:ldc2            #297 <String "application/cea-608">
	//* 696 1618:aload_1         
	//* 697 1619:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 698 1622:ifeq            1766
	//* 699 1625:iconst_0        
	//* 700 1626:istore          5
	//* 701 1628:iload           5
	//* 702 1630:aload           62
	//* 703 1632:invokeinterface #457 <Method int List.size()>
	//* 704 1637:icmpge          3036
	//* 705 1640:aload           62
	//* 706 1642:iload           5
	//* 707 1644:invokeinterface #461 <Method Object List.get(int)>
	//* 708 1649:checkcast       #146 <Class blb>
	//* 709 1652:astore          59
	//* 710 1654:ldc2            #463 <String "urn:scte:dash:cc:cea-608:2015">
	//* 711 1657:aload           59
	//* 712 1659:getfield        #465 <Field String blb.a>
	//* 713 1662:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 714 1665:ifeq            3027
	//* 715 1668:aload           59
	//* 716 1670:getfield        #467 <Field String blb.b>
	//* 717 1673:ifnull          3027
	//* 718 1676:getstatic       #30  <Field Pattern b>
	//* 719 1679:aload           59
	//* 720 1681:getfield        #467 <Field String blb.b>
	//* 721 1684:invokevirtual   #73  <Method Matcher Pattern.matcher(CharSequence)>
	//* 722 1687:astore          68
	//* 723 1689:aload           68
	//* 724 1691:invokevirtual   #79  <Method boolean Matcher.matches()>
	//* 725 1694:ifeq            1711
	//* 726 1697:aload           68
	//* 727 1699:iconst_1        
	//* 728 1700:invokevirtual   #83  <Method String Matcher.group(int)>
	//* 729 1703:invokestatic    #89  <Method int Integer.parseInt(String)>
	//* 730 1706:istore          5
	//* 731 1708:goto            3039
	//* 732 1711:aload           59
	//* 733 1713:getfield        #467 <Field String blb.b>
	//* 734 1716:invokestatic    #471 <Method String String.valueOf(Object)>
	//* 735 1719:astore          59
	//* 736 1721:aload           59
	//* 737 1723:invokevirtual   #474 <Method int String.length()>
	//* 738 1726:ifeq            1742
	//* 739 1729:ldc2            #476 <String "Unable to parse CEA-608 channel number from: ">
	//* 740 1732:aload           59
	//* 741 1734:invokevirtual   #479 <Method String String.concat(String)>
	//* 742 1737:astore          59
	//* 743 1739:goto            1754
	//* 744 1742:new             #108 <Class String>
	//* 745 1745:dup             
	//* 746 1746:ldc2            #476 <String "Unable to parse CEA-608 channel number from: ">
	//* 747 1749:invokespecial   #480 <Method void String(String)>
	//* 748 1752:astore          59
	//* 749 1754:ldc2            #482 <String "MpdParser">
	//* 750 1757:aload           59
	//* 751 1759:invokestatic    #488 <Method int Log.w(String, String)>
	//* 752 1762:pop             
	//* 753 1763:goto            3027
	//* 754 1766:ldc2            #295 <String "application/cea-708">
	//* 755 1769:aload_1         
	//* 756 1770:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 757 1773:ifeq            3057
	//* 758 1776:iconst_0        
	//* 759 1777:istore          5
	//* 760 1779:iload           5
	//* 761 1781:aload           62
	//* 762 1783:invokeinterface #457 <Method int List.size()>
	//* 763 1788:icmpge          3051
	//* 764 1791:aload           62
	//* 765 1793:iload           5
	//* 766 1795:invokeinterface #461 <Method Object List.get(int)>
	//* 767 1800:checkcast       #146 <Class blb>
	//* 768 1803:astore          59
	//* 769 1805:ldc2            #490 <String "urn:scte:dash:cc:cea-708:2015">
	//* 770 1808:aload           59
	//* 771 1810:getfield        #465 <Field String blb.a>
	//* 772 1813:invokevirtual   #112 <Method boolean String.equals(Object)>
	//* 773 1816:ifeq            3042
	//* 774 1819:aload           59
	//* 775 1821:getfield        #467 <Field String blb.b>
	//* 776 1824:ifnull          3042
	//* 777 1827:getstatic       #34  <Field Pattern c>
	//* 778 1830:aload           59
	//* 779 1832:getfield        #467 <Field String blb.b>
	//* 780 1835:invokevirtual   #73  <Method Matcher Pattern.matcher(CharSequence)>
	//* 781 1838:astore          68
	//* 782 1840:aload           68
	//* 783 1842:invokevirtual   #79  <Method boolean Matcher.matches()>
	//* 784 1845:ifeq            1862
	//* 785 1848:aload           68
	//* 786 1850:iconst_1        
	//* 787 1851:invokevirtual   #83  <Method String Matcher.group(int)>
	//* 788 1854:invokestatic    #89  <Method int Integer.parseInt(String)>
	//* 789 1857:istore          5
	//* 790 1859:goto            3054
	//* 791 1862:aload           59
	//* 792 1864:getfield        #467 <Field String blb.b>
	//* 793 1867:invokestatic    #471 <Method String String.valueOf(Object)>
	//* 794 1870:astore          59
	//* 795 1872:aload           59
	//* 796 1874:invokevirtual   #474 <Method int String.length()>
	//* 797 1877:ifeq            1893
	//* 798 1880:ldc2            #492 <String "Unable to parse CEA-708 service block number from: ">
	//* 799 1883:aload           59
	//* 800 1885:invokevirtual   #479 <Method String String.concat(String)>
	//* 801 1888:astore          59
	//* 802 1890:goto            1905
	//* 803 1893:new             #108 <Class String>
	//* 804 1896:dup             
	//* 805 1897:ldc2            #492 <String "Unable to parse CEA-708 service block number from: ">
	//* 806 1900:invokespecial   #480 <Method void String(String)>
	//* 807 1903:astore          59
	//* 808 1905:ldc2            #482 <String "MpdParser">
	//* 809 1908:aload           59
	//* 810 1910:invokestatic    #488 <Method int Log.w(String, String)>
	//* 811 1913:pop             
	//* 812 1914:goto            3042
	//* 813 1917:aload           66
	//* 814 1919:aload           60
	//* 815 1921:aload_1         
	//* 816 1922:aload           67
	//* 817 1924:iload           19
	//* 818 1926:iload           14
	//* 819 1928:aload           52
	//* 820 1930:iload           5
	//* 821 1932:invokestatic    #495 <Method zzfs zzfs.a(String, String, String, String, int, int, String, int)>
	//* 822 1935:astore_1        
	//* 823 1936:goto            3063
	//* 824 1939:aload           66
	//* 825 1941:aload           60
	//* 826 1943:aload_1         
	//* 827 1944:aload           67
	//* 828 1946:iload           19
	//* 829 1948:iload           14
	//* 830 1950:aload           52
	//* 831 1952:invokestatic    #498 <Method zzfs zzfs.a(String, String, String, String, int, int, String)>
	//* 832 1955:astore_1        
	//* 833 1956:goto            3063
	//* 834 1959:new             #266 <Class bln>
	//* 835 1962:dup             
	//* 836 1963:invokespecial   #499 <Method void bln()>
	//* 837 1966:astore          42
	//* 838 1968:new             #501 <Class bla>
	//* 839 1971:dup             
	//* 840 1972:aload_1         
	//* 841 1973:aload           58
	//* 842 1975:aload           42
	//* 843 1977:aload           64
	//* 844 1979:aload           65
	//* 845 1981:invokespecial   #504 <Method void bla(zzfs, String, bli, ArrayList, ArrayList)>
	//* 846 1984:astore_1        
	//* 847 1985:aload_1         
	//* 848 1986:getfield        #507 <Field zzfs bla.a>
	//* 849 1989:getfield        #509 <Field String zzfs.e>
	//* 850 1992:astore          42
	//* 851 1994:aload           42
	//* 852 1996:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 853 1999:ifne            3071
	//* 854 2002:aload           42
	//* 855 2004:invokestatic    #428 <Method boolean bnk.b(String)>
	//* 856 2007:ifeq            2016
	//* 857 2010:iconst_2        
	//* 858 2011:istore          5
	//* 859 2013:goto            2044
	//* 860 2016:aload           42
	//* 861 2018:invokestatic    #421 <Method boolean bnk.a(String)>
	//* 862 2021:ifeq            2030
	//* 863 2024:iconst_1        
	//* 864 2025:istore          5
	//* 865 2027:goto            2044
	//* 866 2030:aload           42
	//* 867 2032:invokestatic    #429 <Method boolean a(String)>
	//* 868 2035:ifeq            3071
	//* 869 2038:iconst_3        
	//* 870 2039:istore          5
	//* 871 2041:goto            2044
	//* 872 2044:iload           16
	//* 873 2046:iload           5
	//* 874 2048:invokestatic    #391 <Method int a(int, int)>
	//* 875 2051:istore          9
	//* 876 2053:aload           63
	//* 877 2055:aload_1         
	//* 878 2056:invokeinterface #223 <Method boolean List.add(Object)>
	//* 879 2061:pop             
	//* 880 2062:aload_2         
	//* 881 2063:astore_1        
	//* 882 2064:aload           53
	//* 883 2066:astore_2        
	//* 884 2067:iload           6
	//* 885 2069:istore          5
	//* 886 2071:goto            2246
	//* 887 2074:fload_3         
	//* 888 2075:fstore          4
	//* 889 2077:iload           5
	//* 890 2079:istore          6
	//* 891 2081:aload           61
	//* 892 2083:ldc2            #276 <String "SegmentBase">
	//* 893 2086:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 894 2089:ifeq            2124
	//* 895 2092:aload_0         
	//* 896 2093:aload           61
	//* 897 2095:aload           53
	//* 898 2097:checkcast       #266 <Class bln>
	//* 899 2100:invokespecial   #413 <Method bln a(XmlPullParser, bln)>
	//* 900 2103:astore          42
	//* 901 2105:aload_2         
	//* 902 2106:astore_1        
	//* 903 2107:iload           16
	//* 904 2109:istore          9
	//* 905 2111:aload           42
	//* 906 2113:astore_2        
	//* 907 2114:fload           4
	//* 908 2116:fstore_3        
	//* 909 2117:iload           6
	//* 910 2119:istore          5
	//* 911 2121:goto            2246
	//* 912 2124:aload           61
	//* 913 2126:ldc1            #225 <String "SegmentList">
	//* 914 2128:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 915 2131:ifeq            2166
	//* 916 2134:aload_0         
	//* 917 2135:aload           61
	//* 918 2137:aload           53
	//* 919 2139:checkcast       #171 <Class blk>
	//* 920 2142:invokespecial   #415 <Method blk a(XmlPullParser, blk)>
	//* 921 2145:astore          42
	//* 922 2147:aload_2         
	//* 923 2148:astore_1        
	//* 924 2149:iload           16
	//* 925 2151:istore          9
	//* 926 2153:aload           42
	//* 927 2155:astore_2        
	//* 928 2156:fload           4
	//* 929 2158:fstore_3        
	//* 930 2159:iload           6
	//* 931 2161:istore          5
	//* 932 2163:goto            2246
	//* 933 2166:aload           61
	//* 934 2168:ldc2            #258 <String "SegmentTemplate">
	//* 935 2171:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 936 2174:ifeq            2209
	//* 937 2177:aload_0         
	//* 938 2178:aload           61
	//* 939 2180:aload           53
	//* 940 2182:checkcast       #241 <Class bll>
	//* 941 2185:invokespecial   #417 <Method bll a(XmlPullParser, bll)>
	//* 942 2188:astore          42
	//* 943 2190:aload_2         
	//* 944 2191:astore_1        
	//* 945 2192:iload           16
	//* 946 2194:istore          9
	//* 947 2196:aload           42
	//* 948 2198:astore_2        
	//* 949 2199:fload           4
	//* 950 2201:fstore_3        
	//* 951 2202:iload           6
	//* 952 2204:istore          5
	//* 953 2206:goto            2246
	//* 954 2209:aload           61
	//* 955 2211:ldc2            #419 <String "InbandEventStream">
	//* 956 2214:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//* 957 2217:ifeq            2237
	//* 958 2220:aload           49
	//* 959 2222:aload           61
	//* 960 2224:ldc2            #419 <String "InbandEventStream">
	//* 961 2227:invokestatic    #405 <Method blb a(XmlPullParser, String)>
	//* 962 2230:invokevirtual   #387 <Method boolean ArrayList.add(Object)>
	//* 963 2233:pop             
	//* 964 2234:goto            3091
	//* 965 2237:aload           61
	//* 966 2239:invokestatic    #512 <Method boolean bny.a(XmlPullParser)>
	//* 967 2242:pop             
	//* 968 2243:goto            3091
	//* 969 2246:aload           61
	//* 970 2248:ldc2            #364 <String "AdaptationSet">
	//* 971 2251:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//* 972 2254:ifeq            3104
	//* 973 2257:new             #211 <Class ArrayList>
	//* 974 2260:dup             
	//* 975 2261:aload           63
	//* 976 2263:invokeinterface #457 <Method int List.size()>
	//* 977 2268:invokespecial   #515 <Method void ArrayList(int)>
	//* 978 2271:astore_2        
	//* 979 2272:iconst_0        
	//* 980 2273:istore          5
	//* 981 2275:iload           5
	//* 982 2277:aload           63
	//* 983 2279:invokeinterface #457 <Method int List.size()>
	//* 984 2284:icmpge          2471
	//* 985 2287:aload           63
	//* 986 2289:iload           5
	//* 987 2291:invokeinterface #461 <Method Object List.get(int)>
	//* 988 2296:checkcast       #501 <Class bla>
	//* 989 2299:astore          42
	//* 990 2301:aload           42
	//* 991 2303:getfield        #507 <Field zzfs bla.a>
	//* 992 2306:astore_1        
	//* 993 2307:aload           42
	//* 994 2309:getfield        #518 <Field ArrayList bla.d>
	//* 995 2312:astore          52
	//* 996 2314:aload           52
	//* 997 2316:aload           50
	//* 998 2318:invokevirtual   #522 <Method boolean ArrayList.addAll(java.util.Collection)>
	//* 999 2321:pop             
	//*1000 2322:aload           52
	//*1001 2324:invokevirtual   #524 <Method boolean ArrayList.isEmpty()>
	//*1002 2327:ifne            3101
	//*1003 2330:aload_1         
	//*1004 2331:new             #526 <Class zzhp>
	//*1005 2334:dup             
	//*1006 2335:aload           52
	//*1007 2337:invokespecial   #529 <Method void zzhp(List)>
	//*1008 2340:invokevirtual   #532 <Method zzfs zzfs.a(zzhp)>
	//*1009 2343:astore_1        
	//*1010 2344:goto            2347
	//*1011 2347:aload           42
	//*1012 2349:getfield        #534 <Field ArrayList bla.e>
	//*1013 2352:astore          52
	//*1014 2354:aload           52
	//*1015 2356:aload           49
	//*1016 2358:invokevirtual   #522 <Method boolean ArrayList.addAll(java.util.Collection)>
	//*1017 2361:pop             
	//*1018 2362:aload           42
	//*1019 2364:getfield        #535 <Field String bla.b>
	//*1020 2367:astore          53
	//*1021 2369:aload           42
	//*1022 2371:getfield        #538 <Field bli bla.c>
	//*1023 2374:astore          42
	//*1024 2376:aload           42
	//*1025 2378:instanceof      #266 <Class bln>
	//*1026 2381:ifeq            2413
	//*1027 2384:new             #540 <Class blh>
	//*1028 2387:dup             
	//*1029 2388:aconst_null     
	//*1030 2389:ldc2w           #162 <Long -1L>
	//*1031 2392:aload_1         
	//*1032 2393:aload           53
	//*1033 2395:aload           42
	//*1034 2397:checkcast       #266 <Class bln>
	//*1035 2400:aload           52
	//*1036 2402:aconst_null     
	//*1037 2403:ldc2w           #162 <Long -1L>
	//*1038 2406:invokespecial   #543 <Method void blh(String, long, zzfs, String, bln, List, String, long)>
	//*1039 2409:astore_1        
	//*1040 2410:goto            2443
	//*1041 2413:aload           42
	//*1042 2415:instanceof      #545 <Class blj>
	//*1043 2418:ifeq            2460
	//*1044 2421:new             #547 <Class blg>
	//*1045 2424:dup             
	//*1046 2425:aconst_null     
	//*1047 2426:ldc2w           #162 <Long -1L>
	//*1048 2429:aload_1         
	//*1049 2430:aload           53
	//*1050 2432:aload           42
	//*1051 2434:checkcast       #545 <Class blj>
	//*1052 2437:aload           52
	//*1053 2439:invokespecial   #550 <Method void blg(String, long, zzfs, String, blj, List)>
	//*1054 2442:astore_1        
	//*1055 2443:aload_2         
	//*1056 2444:aload_1         
	//*1057 2445:invokeinterface #223 <Method boolean List.add(Object)>
	//*1058 2450:pop             
	//*1059 2451:iload           5
	//*1060 2453:iconst_1        
	//*1061 2454:iadd            
	//*1062 2455:istore          5
	//*1063 2457:goto            2275
	//*1064 2460:new             #552 <Class IllegalArgumentException>
	//*1065 2463:dup             
	//*1066 2464:ldc2            #554 <String "segmentBase must be of type SingleSegmentBase or MultiSegmentBase">
	//*1067 2467:invokespecial   #555 <Method void IllegalArgumentException(String)>
	//*1068 2470:athrow          
	//*1069 2471:aload           46
	//*1070 2473:new             #557 <Class bkx>
	//*1071 2476:dup             
	//*1072 2477:iload           18
	//*1073 2479:iload           9
	//*1074 2481:aload_2         
	//*1075 2482:aload           62
	//*1076 2484:aload           51
	//*1077 2486:invokespecial   #560 <Method void bkx(int, int, List, List, List)>
	//*1078 2489:invokeinterface #223 <Method boolean List.add(Object)>
	//*1079 2494:pop             
	//*1080 2495:goto            3114
	//*1081 2498:aload           43
	//*1082 2500:astore_1        
	//*1083 2501:aload           61
	//*1084 2503:ldc2            #276 <String "SegmentBase">
	//*1085 2506:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*1086 2509:ifeq            2523
	//*1087 2512:aload_0         
	//*1088 2513:aload           61
	//*1089 2515:aconst_null     
	//*1090 2516:invokespecial   #413 <Method bln a(XmlPullParser, bln)>
	//*1091 2519:astore_2        
	//*1092 2520:goto            2566
	//*1093 2523:aload           61
	//*1094 2525:ldc1            #225 <String "SegmentList">
	//*1095 2527:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*1096 2530:ifeq            2544
	//*1097 2533:aload_0         
	//*1098 2534:aload           61
	//*1099 2536:aconst_null     
	//*1100 2537:invokespecial   #415 <Method blk a(XmlPullParser, blk)>
	//*1101 2540:astore_2        
	//*1102 2541:goto            2566
	//*1103 2544:aload           61
	//*1104 2546:ldc2            #258 <String "SegmentTemplate">
	//*1105 2549:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*1106 2552:ifeq            3114
	//*1107 2555:aload_0         
	//*1108 2556:aload           61
	//*1109 2558:aconst_null     
	//*1110 2559:invokespecial   #417 <Method bll a(XmlPullParser, bll)>
	//*1111 2562:astore_2        
	//*1112 2563:goto            2566
	//*1113 2566:aload           47
	//*1114 2568:astore          42
	//*1115 2570:aload           45
	//*1116 2572:astore          43
	//*1117 2574:aconst_null     
	//*1118 2575:astore          44
	//*1119 2577:aload           61
	//*1120 2579:ldc2            #360 <String "Period">
	//*1121 2582:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//*1122 2585:ifeq            3123
	//*1123 2588:new             #562 <Class blc>
	//*1124 2591:dup             
	//*1125 2592:aload           48
	//*1126 2594:lload           29
	//*1127 2596:aload           46
	//*1128 2598:invokespecial   #565 <Method void blc(String, long, List)>
	//*1129 2601:lload           39
	//*1130 2603:invokestatic    #568 <Method Long Long.valueOf(long)>
	//*1131 2606:invokestatic    #574 <Method Pair Pair.create(Object, Object)>
	//*1132 2609:astore_1        
	//*1133 2610:aload_1         
	//*1134 2611:getfield        #578 <Field Object Pair.first>
	//*1135 2614:checkcast       #562 <Class blc>
	//*1136 2617:astore_2        
	//*1137 2618:aload_2         
	//*1138 2619:getfield        #579 <Field long blc.b>
	//*1139 2622:ldc2w           #185 <Long 0x1L>
	//*1140 2625:lcmp            
	//*1141 2626:ifne            2700
	//*1142 2629:iload           41
	//*1143 2631:ifeq            2654
	//*1144 2634:iload           7
	//*1145 2636:istore          5
	//*1146 2638:aload           43
	//*1147 2640:astore_2        
	//*1148 2641:aload           42
	//*1149 2643:astore_1        
	//*1150 2644:iconst_1        
	//*1151 2645:istore          10
	//*1152 2647:aload           44
	//*1153 2649:astore          42
	//*1154 2651:goto            2763
	//*1155 2654:aload           42
	//*1156 2656:invokeinterface #457 <Method int List.size()>
	//*1157 2661:istore          5
	//*1158 2663:new             #581 <Class StringBuilder>
	//*1159 2666:dup             
	//*1160 2667:bipush          47
	//*1161 2669:invokespecial   #582 <Method void StringBuilder(int)>
	//*1162 2672:astore_1        
	//*1163 2673:aload_1         
	//*1164 2674:ldc2            #584 <String "Unable to determine start of period ">
	//*1165 2677:invokevirtual   #588 <Method StringBuilder StringBuilder.append(String)>
	//*1166 2680:pop             
	//*1167 2681:aload_1         
	//*1168 2682:iload           5
	//*1169 2684:invokevirtual   #591 <Method StringBuilder StringBuilder.append(int)>
	//*1170 2687:pop             
	//*1171 2688:new             #593 <Class bdj>
	//*1172 2691:dup             
	//*1173 2692:aload_1         
	//*1174 2693:invokevirtual   #594 <Method String StringBuilder.toString()>
	//*1175 2696:invokespecial   #595 <Method void bdj(String)>
	//*1176 2699:athrow          
	//*1177 2700:aload_1         
	//*1178 2701:getfield        #598 <Field Object Pair.second>
	//*1179 2704:checkcast       #158 <Class Long>
	//*1180 2707:invokevirtual   #602 <Method long Long.longValue()>
	//*1181 2710:lstore          27
	//*1182 2712:lload           27
	//*1183 2714:ldc2w           #185 <Long 0x1L>
	//*1184 2717:lcmp            
	//*1185 2718:ifne            2729
	//*1186 2721:ldc2w           #185 <Long 0x1L>
	//*1187 2724:lstore          27
	//*1188 2726:goto            2738
	//*1189 2729:lload           27
	//*1190 2731:aload_2         
	//*1191 2732:getfield        #579 <Field long blc.b>
	//*1192 2735:ladd            
	//*1193 2736:lstore          27
	//*1194 2738:aload           42
	//*1195 2740:astore_1        
	//*1196 2741:aload_1         
	//*1197 2742:aload_2         
	//*1198 2743:invokeinterface #223 <Method boolean List.add(Object)>
	//*1199 2748:pop             
	//*1200 2749:iload           7
	//*1201 2751:istore          5
	//*1202 2753:aload           43
	//*1203 2755:astore_2        
	//*1204 2756:aload           44
	//*1205 2758:astore          42
	//*1206 2760:goto            2763
	//*1207 2763:aload           61
	//*1208 2765:ldc2            #308 <String "MPD">
	//*1209 2768:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//*1210 2771:ifeq            3155
	//*1211 2774:lload           23
	//*1212 2776:ldc2w           #185 <Long 0x1L>
	//*1213 2779:lcmp            
	//*1214 2780:ifne            3148
	//*1215 2783:lload           27
	//*1216 2785:ldc2w           #185 <Long 0x1L>
	//*1217 2788:lcmp            
	//*1218 2789:ifeq            3143
	//*1219 2792:goto            2806
	//*1220 2795:new             #593 <Class bdj>
	//*1221 2798:dup             
	//*1222 2799:ldc2            #604 <String "Unable to determine duration of static manifest.">
	//*1223 2802:invokespecial   #595 <Method void bdj(String)>
	//*1224 2805:athrow          
	//*1225 2806:aload_1         
	//*1226 2807:invokeinterface #605 <Method boolean List.isEmpty()>
	//*1227 2812:ifne            2842
	//*1228 2815:new             #607 <Class bky>
	//*1229 2818:dup             
	//*1230 2819:lload           31
	//*1231 2821:lload           27
	//*1232 2823:lload           25
	//*1233 2825:iload           41
	//*1234 2827:lload           33
	//*1235 2829:lload           35
	//*1236 2831:lload           37
	//*1237 2833:aload           54
	//*1238 2835:aload           55
	//*1239 2837:aload_1         
	//*1240 2838:invokespecial   #610 <Method void bky(long, long, long, boolean, long, long, long, blr, Uri, List)>
	//*1241 2841:areturn         
	//*1242 2842:new             #593 <Class bdj>
	//*1243 2845:dup             
	//*1244 2846:ldc2            #612 <String "No periods found.">
	//*1245 2849:invokespecial   #595 <Method void bdj(String)>
	//*1246 2852:athrow          
	//*1247 2853:new             #593 <Class bdj>
	//*1248 2856:dup             
	//*1249 2857:ldc2            #614 <String "inputStream does not contain a valid media presentation description">
	//*1250 2860:invokespecial   #595 <Method void bdj(String)>
	//*1251 2863:athrow          
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*1252 2864:astore_1        
		{
			throw new bdj(((Throwable) (uri)));
	// 1253 2865:new             #593 <Class bdj>
	// 1254 2868:dup             
	// 1255 2869:aload_1         
	// 1256 2870:invokespecial   #617 <Method void bdj(Throwable)>
	// 1257 2873:athrow          
		}
		obj = null;
		xmlpullparser.setInput(inputstream, ((String) (null)));
		if(xmlpullparser.next() != 2 || !"MPD".equals(((Object) (xmlpullparser.getName())))) goto _L2; else goto _L1
_L1:
		inputstream = ((InputStream) (uri.toString()));
		uri = ((Uri) (xmlpullparser.getAttributeValue(((String) (null)), "availabilityStartTime")));
		if(uri == null)
		{
			l7 = 0x1L;
			break MISSING_BLOCK_LABEL_83;
		}
		l7 = bnw.e(((String) (uri)));
		l6 = a(xmlpullparser, "mediaPresentationDuration", 0x1L);
		l4 = a(xmlpullparser, "minBufferTime", 0x1L);
		uri = ((Uri) (xmlpullparser.getAttributeValue(((String) (null)), "type")));
		if(uri == null) goto _L4; else goto _L3
_L3:
		if(!((String) (uri)).equals("dynamic")) goto _L4; else goto _L5
_L5:
		flag4 = true;
_L142:
		if(!flag4) goto _L7; else goto _L6
_L6:
		l8 = a(xmlpullparser, "minimumUpdatePeriod", 0x1L);
_L143:
		if(!flag4) goto _L9; else goto _L8
_L8:
		l9 = a(xmlpullparser, "timeShiftBufferDepth", 0x1L);
_L144:
		if(!flag4) goto _L11; else goto _L10
_L10:
		l10 = a(xmlpullparser, "suggestedPresentationDelay", 0x1L);
_L145:
		uri = ((Uri) (new ArrayList()));
		  goto _L12
_L137:
		xmlpullparser.next();
		if(!bny.b(xmlpullparser, "BaseURL"))
			break MISSING_BLOCK_LABEL_262;
		if(i != 0)
			continue; /* Loop/switch isn't completed */
		inputstream = ((InputStream) (b(xmlpullparser, ((String) (inputstream)))));
		i = 1;
		continue; /* Loop/switch isn't completed */
		if(bny.b(xmlpullparser, "UTCTiming"))
		{
			blr1 = new blr(xmlpullparser.getAttributeValue(((String) (obj)), "schemeIdUri"), xmlpullparser.getAttributeValue(((String) (obj)), "value"));
			continue; /* Loop/switch isn't completed */
		}
		if(bny.b(xmlpullparser, "Location"))
		{
			uri1 = Uri.parse(xmlpullparser.nextText());
			continue; /* Loop/switch isn't completed */
		}
		if(!bny.b(xmlpullparser, "Period") || flag)
			continue; /* Loop/switch isn't completed */
		s = xmlpullparser.getAttributeValue(((String) (obj)), "id");
		l6 = a(xmlpullparser, "start", l5);
		l11 = a(xmlpullparser, "duration", 0x1L);
		arraylist = new ArrayList();
		obj1 = ((Object) (inputstream));
		inputstream1 = null;
		flag1 = false;
		inputstream2 = inputstream;
		obj2 = ((Object) (uri));
		k = i;
_L155:
		xmlpullparser.next();
		if(!bny.b(xmlpullparser, "BaseURL")) goto _L14; else goto _L13
_L13:
		if(flag1) goto _L16; else goto _L15
_L15:
		uri = ((Uri) (b(xmlpullparser, ((String) (obj1)))));
		flag1 = true;
		inputstream = inputstream1;
		  goto _L17
_L14:
		if(!bny.b(xmlpullparser, "AdaptationSet")) goto _L19; else goto _L18
_L18:
		k2 = a(xmlpullparser, "id", -1);
		i2 = a(xmlpullparser);
		s2 = xmlpullparser.getAttributeValue(((String) (null)), "mimeType");
		s1 = xmlpullparser.getAttributeValue(((String) (null)), "codecs");
		k1 = a(xmlpullparser, "width", -1);
		i = a(xmlpullparser, "height", -1);
		f = a(xmlpullparser, -1F);
		j1 = a(xmlpullparser, "audioSamplingRate", -1);
		obj3 = ((Object) (xmlpullparser.getAttributeValue(((String) (null)), "lang")));
		arraylist2 = new ArrayList();
		arraylist1 = new ArrayList();
		arraylist4 = new ArrayList();
		arraylist3 = new ArrayList();
		arraylist5 = new ArrayList();
		uri = ((Uri) (obj1));
		obj4 = ((Object) (inputstream1));
		flag2 = false;
		l1 = 0;
		l = -1;
_L154:
		xmlpullparser.next();
		if(!bny.b(xmlpullparser, "BaseURL")) goto _L21; else goto _L20
_L20:
		if(flag2) goto _L23; else goto _L22
_L22:
		uri = ((Uri) (b(xmlpullparser, ((String) (uri)))));
		flag2 = true;
		i1 = i2;
		inputstream = ((InputStream) (obj4));
		  goto _L24
_L21:
		if(!bny.b(xmlpullparser, "ContentProtection")) goto _L26; else goto _L25
_L25:
		inputstream = ((InputStream) (b(xmlpullparser)));
		if(inputstream == null) goto _L23; else goto _L27
_L27:
		arraylist2.add(((Object) (inputstream)));
		  goto _L23
_L26:
		if(!bny.b(xmlpullparser, "ContentComponent")) goto _L29; else goto _L28
_L28:
		inputstream = ((InputStream) (xmlpullparser.getAttributeValue(((String) (null)), "lang")));
		if(obj3 != null) goto _L31; else goto _L30
_L30:
		obj3 = ((Object) (inputstream));
		  goto _L32
_L146:
		bnf.b(((String) (obj3)).equals(((Object) (inputstream))));
_L32:
		i1 = a(i2, a(xmlpullparser));
		inputstream = ((InputStream) (obj4));
		  goto _L24
_L29:
		inputstream = ((InputStream) (uri));
		if(bny.b(xmlpullparser, "Role"))
		{
			uri = ((Uri) (b(xmlpullparser, "schemeIdUri", ((String) (null)))));
			obj = ((Object) (b(xmlpullparser, "value", ((String) (null)))));
			do
				xmlpullparser.next();
			while(!bny.a(xmlpullparser, "Role"));
			break MISSING_BLOCK_LABEL_812;
		}
		if(!bny.b(xmlpullparser, "AudioChannelConfiguration")) goto _L34; else goto _L33
_L33:
		l = e(xmlpullparser);
		uri = ((Uri) (inputstream));
		i1 = i2;
		inputstream = ((InputStream) (obj4));
		  goto _L24
_L34:
		if(!bny.b(xmlpullparser, "Accessibility")) goto _L36; else goto _L35
_L35:
		arraylist4.add(((Object) (a(xmlpullparser, "Accessibility"))));
		  goto _L23
_L36:
		if(!bny.b(xmlpullparser, "SupplementalProperty")) goto _L38; else goto _L37
_L37:
		arraylist3.add(((Object) (a(xmlpullparser, "SupplementalProperty"))));
		  goto _L23
_L38:
		if(!bny.b(xmlpullparser, "Representation")) goto _L40; else goto _L39
_L39:
		s4 = xmlpullparser.getAttributeValue(((String) (null)), "id");
		l2 = a(xmlpullparser, "bandwidth", -1);
		s3 = b(xmlpullparser, "mimeType", s2);
		s5 = b(xmlpullparser, "codecs", s1);
		i3 = a(xmlpullparser, "width", k1);
		j3 = a(xmlpullparser, "height", i);
		f1 = a(xmlpullparser, f);
		k3 = a(xmlpullparser, "audioSamplingRate", j1);
		arraylist6 = new ArrayList();
		arraylist7 = new ArrayList();
		j = l;
		uri = ((Uri) (obj4));
		obj5 = ((Object) (inputstream));
		flag3 = false;
		i1 = i;
_L153:
		xmlpullparser.next();
		if(!bny.b(xmlpullparser, "BaseURL")) goto _L42; else goto _L41
_L41:
		if(flag3) goto _L44; else goto _L43
_L43:
		obj5 = ((Object) (b(xmlpullparser, ((String) (obj5)))));
		i = j;
		flag3 = true;
		obj = ((Object) (uri));
		  goto _L45
_L42:
		if(!bny.b(xmlpullparser, "AudioChannelConfiguration")) goto _L47; else goto _L46
_L46:
		i = e(xmlpullparser);
		obj = ((Object) (uri));
		  goto _L45
_L47:
		if(!bny.b(xmlpullparser, "SegmentBase")) goto _L49; else goto _L48
_L48:
		obj = ((Object) (a(xmlpullparser, (bln)uri)));
		i = j;
		  goto _L45
_L49:
		if(!bny.b(xmlpullparser, "SegmentList")) goto _L51; else goto _L50
_L50:
		obj = ((Object) (a(xmlpullparser, (blk)uri)));
		i = j;
		  goto _L45
_L51:
		if(!bny.b(xmlpullparser, "SegmentTemplate")) goto _L53; else goto _L52
_L52:
		obj = ((Object) (a(xmlpullparser, (bll)uri)));
		i = j;
		  goto _L45
_L53:
		if(!bny.b(xmlpullparser, "ContentProtection")) goto _L55; else goto _L54
_L54:
		obj = ((Object) (b(xmlpullparser)));
		if(obj == null) goto _L44; else goto _L56
_L56:
		arraylist6.add(obj);
		  goto _L44
_L55:
		if(bny.b(xmlpullparser, "InbandEventStream"))
			arraylist7.add(((Object) (a(xmlpullparser, "InbandEventStream"))));
		  goto _L44
_L45:
		j = i1;
		if(!bny.a(xmlpullparser, "Representation")) goto _L58; else goto _L57
_L57:
		if(!bnk.a(s3)) goto _L60; else goto _L59
_L59:
		if(s5 == null) goto _L62; else goto _L61
_L61:
		as = s5.split(",");
		j2 = as.length;
		i1 = 0;
_L147:
		if(i1 >= j2) goto _L62; else goto _L63
_L63:
		uri = ((Uri) (bnk.d(as[i1])));
		if(uri == null)
			continue; /* Loop/switch isn't completed */
		if(!bnk.a(((String) (uri))))
			continue; /* Loop/switch isn't completed */
		  goto _L64
_L60:
		if(!bnk.b(s3)) goto _L66; else goto _L65
_L65:
		if(s5 == null) goto _L68; else goto _L67
_L67:
		as = s5.split(",");
		j2 = as.length;
		i1 = 0;
_L148:
		if(i1 >= j2) goto _L68; else goto _L69
_L69:
		uri = ((Uri) (bnk.d(as[i1])));
		if(uri == null)
			continue; /* Loop/switch isn't completed */
		if(!bnk.b(((String) (uri))))
			continue; /* Loop/switch isn't completed */
		  goto _L64
_L66:
		if(!a(s3)) goto _L71; else goto _L70
_L70:
		uri = ((Uri) (s3));
		  goto _L64
_L71:
		if(!"application/mp4".equals(((Object) (s3)))) goto _L73; else goto _L72
_L72:
		if(!"stpp".equals(((Object) (s5)))) goto _L75; else goto _L74
_L74:
		uri = "application/ttml+xml";
		  goto _L64
_L75:
		if(!"wvtt".equals(((Object) (s5)))) goto _L77; else goto _L76
_L76:
		uri = "application/x-mp4-vtt";
		  goto _L64
_L73:
		if(!"application/x-rawcc".equals(((Object) (s3)))) goto _L77; else goto _L78
_L78:
		if(s5 == null) goto _L80; else goto _L79
_L79:
		if(!s5.contains("cea708")) goto _L82; else goto _L81
_L81:
		uri = "application/cea-708";
		  goto _L64
_L82:
		if(!s5.contains("eia608") && !s5.contains("cea608")) goto _L80; else goto _L83
_L64:
		if(uri == null) goto _L85; else goto _L84
_L84:
		if(!bnk.b(((String) (uri)))) goto _L87; else goto _L86
_L86:
		uri = ((Uri) (zzfs.a(s4, s3, ((String) (uri)), s5, l2, i3, j3, f1, ((List) (null)), l1)));
		  goto _L88
_L87:
		if(!bnk.a(((String) (uri)))) goto _L90; else goto _L89
_L89:
		uri = ((Uri) (zzfs.a(s4, s3, ((String) (uri)), s5, l2, i, k3, ((List) (null)), l1, ((String) (obj3)))));
		  goto _L88
_L90:
		if(!a(((String) (uri)))) goto _L85; else goto _L91
_L91:
		if(!"application/cea-608".equals(((Object) (uri)))) goto _L93; else goto _L92
_L92:
		i = 0;
_L149:
		if(i >= ((List) (arraylist4)).size()) goto _L95; else goto _L94
_L94:
		obj6 = ((Object) ((blb)((List) (arraylist4)).get(i)));
		if(!"urn:scte:dash:cc:cea-608:2015".equals(((Object) (((blb) (obj6)).a))) || ((blb) (obj6)).b == null) goto _L97; else goto _L96
_L96:
		matcher = b.matcher(((CharSequence) (((blb) (obj6)).b)));
		if(!matcher.matches()) goto _L99; else goto _L98
_L98:
		i = Integer.parseInt(matcher.group(1));
		  goto _L100
_L99:
		obj6 = ((Object) (String.valueOf(((Object) (((blb) (obj6)).b)))));
		if(((String) (obj6)).length() != 0)
		{
			obj6 = ((Object) ("Unable to parse CEA-608 channel number from: ".concat(((String) (obj6)))));
			break MISSING_BLOCK_LABEL_1754;
		}
		obj6 = ((Object) (new String("Unable to parse CEA-608 channel number from: ")));
		Log.w("MpdParser", ((String) (obj6)));
		  goto _L97
_L93:
		if(!"application/cea-708".equals(((Object) (uri)))) goto _L102; else goto _L101
_L101:
		i = 0;
_L150:
		if(i >= ((List) (arraylist4)).size()) goto _L104; else goto _L103
_L103:
		obj6 = ((Object) ((blb)((List) (arraylist4)).get(i)));
		if(!"urn:scte:dash:cc:cea-708:2015".equals(((Object) (((blb) (obj6)).a))) || ((blb) (obj6)).b == null) goto _L106; else goto _L105
_L105:
		matcher = c.matcher(((CharSequence) (((blb) (obj6)).b)));
		if(!matcher.matches()) goto _L108; else goto _L107
_L107:
		i = Integer.parseInt(matcher.group(1));
		  goto _L100
_L108:
		obj6 = ((Object) (String.valueOf(((Object) (((blb) (obj6)).b)))));
		if(((String) (obj6)).length() != 0)
		{
			obj6 = ((Object) ("Unable to parse CEA-708 service block number from: ".concat(((String) (obj6)))));
			break MISSING_BLOCK_LABEL_1905;
		}
		obj6 = ((Object) (new String("Unable to parse CEA-708 service block number from: ")));
		Log.w("MpdParser", ((String) (obj6)));
		  goto _L106
_L100:
		uri = ((Uri) (zzfs.a(s4, s3, ((String) (uri)), s5, l2, l1, ((String) (obj3)), i)));
		  goto _L88
_L85:
		uri = ((Uri) (zzfs.a(s4, s3, ((String) (uri)), s5, l2, l1, ((String) (obj3)))));
		  goto _L88
_L152:
		obj = ((Object) (new bln()));
_L151:
		uri = ((Uri) (new bla(((zzfs) (uri)), ((String) (obj5)), ((bli) (obj)), arraylist6, arraylist7)));
		obj = ((Object) (((bla) (uri)).a.e));
		if(TextUtils.isEmpty(((CharSequence) (obj)))) goto _L110; else goto _L109
_L109:
		if(!bnk.b(((String) (obj)))) goto _L112; else goto _L111
_L111:
		i = 2;
		  goto _L113
_L112:
		if(!bnk.a(((String) (obj)))) goto _L115; else goto _L114
_L114:
		i = 1;
		  goto _L113
_L115:
		if(!a(((String) (obj)))) goto _L110; else goto _L116
_L116:
		i = 3;
_L113:
		i1 = a(i2, i);
		((List) (arraylist5)).add(((Object) (uri)));
		uri = ((Uri) (inputstream));
		inputstream = ((InputStream) (obj4));
		i = j;
		  goto _L24
_L40:
		f1 = f;
		j = i;
		if(!bny.b(xmlpullparser, "SegmentBase")) goto _L118; else goto _L117
_L117:
		obj = ((Object) (a(xmlpullparser, (bln)obj4)));
		uri = ((Uri) (inputstream));
		i1 = i2;
		inputstream = ((InputStream) (obj));
		f = f1;
		i = j;
		  goto _L24
_L118:
		if(!bny.b(xmlpullparser, "SegmentList")) goto _L120; else goto _L119
_L119:
		obj = ((Object) (a(xmlpullparser, (blk)obj4)));
		uri = ((Uri) (inputstream));
		i1 = i2;
		inputstream = ((InputStream) (obj));
		f = f1;
		i = j;
		  goto _L24
_L120:
		if(!bny.b(xmlpullparser, "SegmentTemplate")) goto _L122; else goto _L121
_L121:
		obj = ((Object) (a(xmlpullparser, (bll)obj4)));
		uri = ((Uri) (inputstream));
		i1 = i2;
		inputstream = ((InputStream) (obj));
		f = f1;
		i = j;
		  goto _L24
_L122:
		if(!bny.b(xmlpullparser, "InbandEventStream")) goto _L124; else goto _L123
_L123:
		arraylist1.add(((Object) (a(xmlpullparser, "InbandEventStream"))));
		  goto _L23
_L124:
		bny.a(xmlpullparser);
		  goto _L23
_L24:
		if(!bny.a(xmlpullparser, "AdaptationSet")) goto _L126; else goto _L125
_L125:
		inputstream = ((InputStream) (new ArrayList(((List) (arraylist5)).size())));
		i = 0;
_L128:
		if(i >= ((List) (arraylist5)).size())
			break MISSING_BLOCK_LABEL_2471;
		obj = ((Object) ((bla)((List) (arraylist5)).get(i)));
		uri = ((Uri) (((bla) (obj)).a));
		obj3 = ((Object) (((bla) (obj)).d));
		((ArrayList) (obj3)).addAll(((java.util.Collection) (arraylist2)));
		if(!((ArrayList) (obj3)).isEmpty())
			uri = ((Uri) (((zzfs) (uri)).a(new zzhp(((List) (obj3))))));
		obj3 = ((Object) (((bla) (obj)).e));
		((ArrayList) (obj3)).addAll(((java.util.Collection) (arraylist1)));
		obj4 = ((Object) (((bla) (obj)).b));
		obj = ((Object) (((bla) (obj)).c));
		if(obj instanceof bln)
		{
			uri = ((Uri) (new blh(((String) (null)), -1L, ((zzfs) (uri)), ((String) (obj4)), (bln)obj, ((List) (obj3)), ((String) (null)), -1L)));
			break MISSING_BLOCK_LABEL_2443;
		}
		if(!(obj instanceof blj))
			break; /* Loop/switch isn't completed */
		uri = ((Uri) (new blg(((String) (null)), -1L, ((zzfs) (uri)), ((String) (obj4)), (blj)obj, ((List) (obj3)))));
		((List) (inputstream)).add(((Object) (uri)));
		i++;
		if(true) goto _L128; else goto _L127
_L127:
		throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
		((List) (arraylist)).add(((Object) (new bkx(k2, i1, ((List) (inputstream)), ((List) (arraylist4)), ((List) (arraylist3))))));
		  goto _L16
_L19:
		uri = ((Uri) (obj1));
		if(!bny.b(xmlpullparser, "SegmentBase")) goto _L130; else goto _L129
_L129:
		inputstream = ((InputStream) (a(xmlpullparser, ((bln) (null)))));
		  goto _L17
_L130:
		if(!bny.b(xmlpullparser, "SegmentList")) goto _L132; else goto _L131
_L131:
		inputstream = ((InputStream) (a(xmlpullparser, ((blk) (null)))));
		  goto _L17
_L132:
		if(!bny.b(xmlpullparser, "SegmentTemplate")) goto _L16; else goto _L133
_L133:
		inputstream = ((InputStream) (a(xmlpullparser, ((bll) (null)))));
_L17:
		obj = obj2;
		obj1 = ((Object) (inputstream2));
		inputstream1 = null;
		if(!bny.a(xmlpullparser, "Period")) goto _L135; else goto _L134
_L134:
		uri = ((Uri) (Pair.create(((Object) (new blc(s, l6, ((List) (arraylist))))), ((Object) (Long.valueOf(l11))))));
		inputstream = ((InputStream) ((blc)((Pair) (uri)).first));
		if(((blc) (inputstream)).b != 0x1L)
			break MISSING_BLOCK_LABEL_2700;
		if(flag4)
		{
			i = k;
			inputstream = ((InputStream) (obj1));
			uri = ((Uri) (obj));
			flag = true;
			obj = ((Object) (inputstream1));
			continue; /* Loop/switch isn't completed */
		}
		i = ((List) (obj)).size();
		uri = ((Uri) (new StringBuilder(47)));
		((StringBuilder) (uri)).append("Unable to determine start of period ");
		((StringBuilder) (uri)).append(i);
		throw new bdj(((StringBuilder) (uri)).toString());
		l5 = ((Long)((Pair) (uri)).second).longValue();
		if(l5 == 0x1L)
		{
			l5 = 0x1L;
			break MISSING_BLOCK_LABEL_2738;
		}
		l5 += ((blc) (inputstream)).b;
		uri = ((Uri) (obj));
		((List) (uri)).add(((Object) (inputstream)));
		i = k;
		inputstream = ((InputStream) (obj1));
		obj = ((Object) (inputstream1));
		if(!bny.a(xmlpullparser, "MPD")) goto _L137; else goto _L136
_L136:
		if(l3 != 0x1L) goto _L139; else goto _L138
_L138:
		if(l5 == 0x1L) goto _L141; else goto _L140
_L156:
		throw new bdj("Unable to determine duration of static manifest.");
_L140:
		if(!((List) (uri)).isEmpty())
			return new bky(l7, l5, l4, flag4, l8, l9, l10, blr1, uri1, ((List) (uri)));
		else
			throw new bdj("No periods found.");
_L2:
		throw new bdj("inputStream does not contain a valid media presentation description");
_L4:
		flag4 = false;
	// 1258 2874:iconst_0        
	// 1259 2875:istore          41
		  goto _L142
	//*1260 2877:goto            141
_L7:
		l8 = 0x1L;
	// 1261 2880:ldc2w           #185 <Long 0x1L>
	// 1262 2883:lstore          33
		  goto _L143
	//*1263 2885:goto            162
_L9:
		l9 = 0x1L;
	// 1264 2888:ldc2w           #185 <Long 0x1L>
	// 1265 2891:lstore          35
		  goto _L144
	//*1266 2893:goto            183
_L11:
		l10 = 0x1L;
	// 1267 2896:ldc2w           #185 <Long 0x1L>
	// 1268 2899:lstore          37
		  goto _L145
_L12:
		boolean flag;
		blr blr1;
		Uri uri1;
		if(flag4)
			l3 = 0x1L;
		else
	//*1269 2901:goto            204
			l3 = 0L;
	// 1270 2904:lconst_0        
	// 1271 2905:lstore          23
		uri1 = null;
	// 1272 2907:aconst_null     
	// 1273 2908:astore          55
		l5 = l3;
	// 1274 2910:lload           23
	// 1275 2912:lstore          27
		i = 0;
	// 1276 2914:iconst_0        
	// 1277 2915:istore          5
		flag = false;
	// 1278 2917:iconst_0        
	// 1279 2918:istore          10
		blr1 = ((blr) (uri1));
	// 1280 2920:aload           55
	// 1281 2922:astore          54
		l3 = l6;
	// 1282 2924:lload           29
	// 1283 2926:lstore          23
		  goto _L137
	//*1284 2928:goto            225
	//*1285 2931:goto            3140
	//*1286 2934:goto            3114
	//*1287 2937:goto            3091
	//*1288 2940:goto            3091
_L31:
		if(inputstream != null) goto _L146; else goto _L32
	// 1289 2943:aload_2         
	// 1290 2944:ifnonnull       734
		if("urn:mpeg:dash:role:2011".equals(((Object) (uri))) && "main".equals(obj))
			j = 1;
		else
	//*1291 2947:goto            743
			j = 0;
	// 1292 2950:iconst_0        
	// 1293 2951:istore          6
		l1 |= j;
	// 1294 2953:iload           14
	// 1295 2955:iload           6
	// 1296 2957:ior             
	// 1297 2958:istore          14
		uri = ((Uri) (inputstream));
	// 1298 2960:aload_2         
	// 1299 2961:astore_1        
		i1 = i2;
	// 1300 2962:iload           16
	// 1301 2964:istore          9
		inputstream = ((InputStream) (obj4));
	// 1302 2966:aload           53
	// 1303 2968:astore_2        
		  goto _L24
	//*1304 2969:goto            2246
_L44:
		i = j;
	// 1305 2972:iload           6
	// 1306 2974:istore          5
		obj = ((Object) (uri));
	// 1307 2976:aload_1         
	// 1308 2977:astore          42
		  goto _L45
	//*1309 2979:goto            1283
		i1++;
	// 1310 2982:iload           9
	// 1311 2984:iconst_1        
	// 1312 2985:iadd            
	// 1313 2986:istore          9
		  goto _L147
	//*1314 2988:goto            1329
_L62:
		uri = null;
	// 1315 2991:aconst_null     
	// 1316 2992:astore_1        
		  goto _L64
	//*1317 2993:goto            1540
		i1++;
	// 1318 2996:iload           9
	// 1319 2998:iconst_1        
	// 1320 2999:iadd            
	// 1321 3000:istore          9
		  goto _L148
	//*1322 3002:goto            1390
_L68:
		uri = null;
	// 1323 3005:aconst_null     
	// 1324 3006:astore_1        
		  goto _L64
	//*1325 3007:goto            1540
_L83:
		uri = "application/cea-608";
	// 1326 3010:ldc2            #297 <String "application/cea-608">
	// 1327 3013:astore_1        
		  goto _L64
	//*1328 3014:goto            1540
_L80:
		uri = null;
	// 1329 3017:aconst_null     
	// 1330 3018:astore_1        
		  goto _L64
	//*1331 3019:goto            1540
_L77:
		uri = null;
	// 1332 3022:aconst_null     
	// 1333 3023:astore_1        
		  goto _L64
	//*1334 3024:goto            1540
_L97:
		i++;
	// 1335 3027:iload           5
	// 1336 3029:iconst_1        
	// 1337 3030:iadd            
	// 1338 3031:istore          5
		  goto _L149
	//*1339 3033:goto            1628
_L95:
		i = -1;
	// 1340 3036:iconst_m1       
	// 1341 3037:istore          5
		  goto _L100
	//*1342 3039:goto            1917
_L106:
		i++;
	// 1343 3042:iload           5
	// 1344 3044:iconst_1        
	// 1345 3045:iadd            
	// 1346 3046:istore          5
		  goto _L150
	//*1347 3048:goto            1779
_L104:
		i = -1;
	// 1348 3051:iconst_m1       
	// 1349 3052:istore          5
		  goto _L100
	//*1350 3054:goto            1917
_L102:
		i = -1;
	// 1351 3057:iconst_m1       
	// 1352 3058:istore          5
		  goto _L100
	//*1353 3060:goto            1917
_L88:
		if(obj == null) goto _L152; else goto _L151
	// 1354 3063:aload           42
	// 1355 3065:ifnull          1959
	//*1356 3068:goto            1968
_L110:
		i = -1;
	// 1357 3071:iconst_m1       
	// 1358 3072:istore          5
		  goto _L113
	//*1359 3074:goto            2044
_L58:
		uri = ((Uri) (obj));
	// 1360 3077:aload           42
	// 1361 3079:astore_1        
		i1 = j;
	// 1362 3080:iload           6
	// 1363 3082:istore          9
		j = i;
	// 1364 3084:iload           5
	// 1365 3086:istore          6
		  goto _L153
	//*1366 3088:goto            1062
_L23:
		i1 = i2;
	// 1367 3091:iload           16
	// 1368 3093:istore          9
		inputstream = ((InputStream) (obj4));
	// 1369 3095:aload           53
	// 1370 3097:astore_2        
		  goto _L24
	//*1371 3098:goto            2246
	//*1372 3101:goto            2347
_L126:
		i2 = i1;
	// 1373 3104:iload           9
	// 1374 3106:istore          16
		obj4 = ((Object) (inputstream));
	// 1375 3108:aload_2         
	// 1376 3109:astore          53
		  goto _L154
	//*1377 3111:goto            625
_L16:
		uri = ((Uri) (obj1));
	// 1378 3114:aload           43
	// 1379 3116:astore_1        
		inputstream = inputstream1;
	// 1380 3117:aload           44
	// 1381 3119:astore_2        
		  goto _L17
	//*1382 3120:goto            2566
_L135:
		inputstream2 = ((InputStream) (obj1));
	// 1383 3123:aload           43
	// 1384 3125:astore          45
		obj2 = obj;
	// 1385 3127:aload           42
	// 1386 3129:astore          47
		obj1 = ((Object) (uri));
	// 1387 3131:aload_1         
	// 1388 3132:astore          43
		inputstream1 = inputstream;
	// 1389 3134:aload_2         
	// 1390 3135:astore          44
		  goto _L155
	//*1391 3137:goto            414
	//*1392 3140:goto            2763
_L141:
		if(!flag4) goto _L156; else goto _L139
	// 1393 3143:iload           41
	// 1394 3145:ifeq            2795
_L139:
		l5 = l3;
	// 1395 3148:lload           23
	// 1396 3150:lstore          27
		  goto _L140
	//*1397 3152:goto            2806
	//*1398 3155:goto            225
	}

	private static zzhp.zza b(XmlPullParser xmlpullparser)
	{
		boolean flag2 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95".equals(((Object) (xmlpullparser.getAttributeValue(((String) (null)), "schemeIdUri"))));
	//    0    0:ldc2            #619 <String "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95">
	//    1    3:aload_0         
	//    2    4:aconst_null     
	//    3    5:ldc1            #126 <String "schemeIdUri">
	//    4    7:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//    5   12:invokevirtual   #112 <Method boolean String.equals(Object)>
	//    6   15:istore_3        
		Object obj = null;
	//    7   16:aconst_null     
	//    8   17:astore          7
		java.util.UUID uuid1 = ((java.util.UUID) (obj));
	//    9   19:aload           7
	//   10   21:astore          6
		boolean flag1 = false;
	//   11   23:iconst_0        
	//   12   24:istore_2        
		boolean flag;
		byte abyte0[];
		java.util.UUID uuid;
		do
		{
			xmlpullparser.next();
	//   13   25:aload_0         
	//   14   26:invokeinterface #139 <Method int XmlPullParser.next()>
	//   15   31:pop             
			if(obj == null && bny.b(xmlpullparser, "cenc:pssh") && xmlpullparser.next() == 4)
	//*  16   32:aload           7
	//*  17   34:ifnonnull       109
	//*  18   37:aload_0         
	//*  19   38:ldc2            #621 <String "cenc:pssh">
	//*  20   41:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*  21   44:ifeq            109
	//*  22   47:aload_0         
	//*  23   48:invokeinterface #139 <Method int XmlPullParser.next()>
	//*  24   53:iconst_4        
	//*  25   54:icmpne          109
			{
				abyte0 = Base64.decode(xmlpullparser.getText(), 0);
	//   26   57:aload_0         
	//   27   58:invokeinterface #624 <Method String XmlPullParser.getText()>
	//   28   63:iconst_0        
	//   29   64:invokestatic    #630 <Method byte[] Base64.decode(String, int)>
	//   30   67:astore          4
				uuid1 = bhf.a(abyte0);
	//   31   69:aload           4
	//   32   71:invokestatic    #635 <Method java.util.UUID bhf.a(byte[])>
	//   33   74:astore          6
				uuid = uuid1;
	//   34   76:aload           6
	//   35   78:astore          5
				flag = flag1;
	//   36   80:iload_2         
	//   37   81:istore_1        
				if(uuid1 == null)
	//*  38   82:aload           6
	//*  39   84:ifnonnull       237
				{
					Log.w("MpdParser", "Skipping malformed cenc:pssh data");
	//   40   87:ldc2            #482 <String "MpdParser">
	//   41   90:ldc2            #637 <String "Skipping malformed cenc:pssh data">
	//   42   93:invokestatic    #488 <Method int Log.w(String, String)>
	//   43   96:pop             
					abyte0 = null;
	//   44   97:aconst_null     
	//   45   98:astore          4
					uuid = uuid1;
	//   46  100:aload           6
	//   47  102:astore          5
					flag = flag1;
	//   48  104:iload_2         
	//   49  105:istore_1        
				}
			} else
	//*  50  106:goto            237
			if(obj == null && flag2 && bny.b(xmlpullparser, "mspr:pro") && xmlpullparser.next() == 4)
	//*  51  109:aload           7
	//*  52  111:ifnonnull       166
	//*  53  114:iload_3         
	//*  54  115:ifeq            166
	//*  55  118:aload_0         
	//*  56  119:ldc2            #639 <String "mspr:pro">
	//*  57  122:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*  58  125:ifeq            166
	//*  59  128:aload_0         
	//*  60  129:invokeinterface #139 <Method int XmlPullParser.next()>
	//*  61  134:iconst_4        
	//*  62  135:icmpne          166
			{
				abyte0 = bhf.a(bcr.c, Base64.decode(xmlpullparser.getText(), 0));
	//   63  138:getstatic       #644 <Field java.util.UUID bcr.c>
	//   64  141:aload_0         
	//   65  142:invokeinterface #624 <Method String XmlPullParser.getText()>
	//   66  147:iconst_0        
	//   67  148:invokestatic    #630 <Method byte[] Base64.decode(String, int)>
	//   68  151:invokestatic    #647 <Method byte[] bhf.a(java.util.UUID, byte[])>
	//   69  154:astore          4
				uuid = bcr.c;
	//   70  156:getstatic       #644 <Field java.util.UUID bcr.c>
	//   71  159:astore          5
				flag = flag1;
	//   72  161:iload_2         
	//   73  162:istore_1        
			} else
	//*  74  163:goto            237
			{
				abyte0 = ((byte []) (obj));
	//   75  166:aload           7
	//   76  168:astore          4
				uuid = uuid1;
	//   77  170:aload           6
	//   78  172:astore          5
				flag = flag1;
	//   79  174:iload_2         
	//   80  175:istore_1        
				if(bny.b(xmlpullparser, "widevine:license"))
	//*  81  176:aload_0         
	//*  82  177:ldc2            #649 <String "widevine:license">
	//*  83  180:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*  84  183:ifeq            237
				{
					abyte0 = ((byte []) (xmlpullparser.getAttributeValue(((String) (null)), "robustness_level")));
	//   85  186:aload_0         
	//   86  187:aconst_null     
	//   87  188:ldc2            #651 <String "robustness_level">
	//   88  191:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//   89  196:astore          4
					if(abyte0 != null && ((String) (abyte0)).startsWith("HW"))
	//*  90  198:aload           4
	//*  91  200:ifnull          227
	//*  92  203:aload           4
	//*  93  205:ldc2            #653 <String "HW">
	//*  94  208:invokevirtual   #656 <Method boolean String.startsWith(String)>
	//*  95  211:ifeq            227
					{
						flag = true;
	//   96  214:iconst_1        
	//   97  215:istore_1        
						abyte0 = ((byte []) (obj));
	//   98  216:aload           7
	//   99  218:astore          4
						uuid = uuid1;
	//  100  220:aload           6
	//  101  222:astore          5
					} else
	//* 102  224:goto            237
					{
						flag = false;
	//  103  227:iconst_0        
	//  104  228:istore_1        
						uuid = uuid1;
	//  105  229:aload           6
	//  106  231:astore          5
						abyte0 = ((byte []) (obj));
	//  107  233:aload           7
	//  108  235:astore          4
					}
				}
			}
			obj = ((Object) (abyte0));
	//  109  237:aload           4
	//  110  239:astore          7
			uuid1 = uuid;
	//  111  241:aload           5
	//  112  243:astore          6
			flag1 = flag;
	//  113  245:iload_1         
	//  114  246:istore_2        
		} while(!bny.a(xmlpullparser, "ContentProtection"));
	//  115  247:aload_0         
	//  116  248:ldc2            #383 <String "ContentProtection">
	//  117  251:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//  118  254:ifeq            25
		if(abyte0 != null)
	//* 119  257:aload           4
	//* 120  259:ifnull          278
			return new zzhp.zza(uuid, "video/mp4", abyte0, flag);
	//  121  262:new             #658 <Class zzhp$zza>
	//  122  265:dup             
	//  123  266:aload           5
	//  124  268:ldc2            #660 <String "video/mp4">
	//  125  271:aload           4
	//  126  273:iload_1         
	//  127  274:invokespecial   #663 <Method void zzhp$zza(java.util.UUID, String, byte[], boolean)>
	//  128  277:areturn         
		else
			return null;
	//  129  278:aconst_null     
	//  130  279:areturn         
	}

	private static String b(XmlPullParser xmlpullparser, String s)
	{
		xmlpullparser.next();
	//    0    0:aload_0         
	//    1    1:invokeinterface #139 <Method int XmlPullParser.next()>
	//    2    6:pop             
		return bnv.a(s, xmlpullparser.getText());
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokeinterface #624 <Method String XmlPullParser.getText()>
	//    6   14:invokestatic    #667 <Method String bnv.a(String, String)>
	//    7   17:areturn         
	}

	private static String b(XmlPullParser xmlpullparser, String s, String s1)
	{
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokeinterface #69  <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    8:astore_0        
		if(xmlpullparser == null)
	//*   5    9:aload_0         
	//*   6   10:ifnonnull       15
			return s1;
	//    7   13:aload_2         
	//    8   14:areturn         
		else
			return ((String) (xmlpullparser));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	private static List c(XmlPullParser xmlpullparser)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #211 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #212 <Method void ArrayList()>
	//    3    7:astore          9
		long l = 0L;
	//    4    9:lconst_0        
	//    5   10:lstore_3        
		do
		{
			xmlpullparser.next();
	//    6   11:aload_0         
	//    7   12:invokeinterface #139 <Method int XmlPullParser.next()>
	//    8   17:pop             
			long l1 = l;
	//    9   18:lload_3         
	//   10   19:lstore          5
			if(bny.b(xmlpullparser, "S"))
	//*  11   21:aload_0         
	//*  12   22:ldc2            #669 <String "S">
	//*  13   25:invokestatic    #199 <Method boolean bny.b(XmlPullParser, String)>
	//*  14   28:ifeq            103
			{
				l = b(xmlpullparser, "t", l);
	//   15   31:aload_0         
	//   16   32:ldc2            #671 <String "t">
	//   17   35:lload_3         
	//   18   36:invokestatic    #178 <Method long b(XmlPullParser, String, long)>
	//   19   39:lstore_3        
				long l2 = b(xmlpullparser, "d", 0x1L);
	//   20   40:aload_0         
	//   21   41:ldc2            #672 <String "d">
	//   22   44:ldc2w           #185 <Long 0x1L>
	//   23   47:invokestatic    #178 <Method long b(XmlPullParser, String, long)>
	//   24   50:lstore          7
				int i = 0;
	//   25   52:iconst_0        
	//   26   53:istore_1        
				int j = a(xmlpullparser, "r", 0);
	//   27   54:aload_0         
	//   28   55:ldc2            #674 <String "r">
	//   29   58:iconst_0        
	//   30   59:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//   31   62:istore_2        
				do
				{
					l1 = l;
	//   32   63:lload_3         
	//   33   64:lstore          5
					if(i >= j + 1)
						break;
	//   34   66:iload_1         
	//   35   67:iload_2         
	//   36   68:iconst_1        
	//   37   69:iadd            
	//   38   70:icmpge          103
					((List) (arraylist)).add(((Object) (new blm(l, l2))));
	//   39   73:aload           9
	//   40   75:new             #676 <Class blm>
	//   41   78:dup             
	//   42   79:lload_3         
	//   43   80:lload           7
	//   44   82:invokespecial   #679 <Method void blm(long, long)>
	//   45   85:invokeinterface #223 <Method boolean List.add(Object)>
	//   46   90:pop             
					l += l2;
	//   47   91:lload_3         
	//   48   92:lload           7
	//   49   94:ladd            
	//   50   95:lstore_3        
					i++;
	//   51   96:iload_1         
	//   52   97:iconst_1        
	//   53   98:iadd            
	//   54   99:istore_1        
				} while(true);
	//   55  100:goto            63
			}
			l = l1;
	//   56  103:lload           5
	//   57  105:lstore_3        
		} while(!bny.a(xmlpullparser, "SegmentTimeline"));
	//   58  106:aload_0         
	//   59  107:ldc1            #204 <String "SegmentTimeline">
	//   60  109:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//   61  112:ifeq            11
		return ((List) (arraylist));
	//   62  115:aload           9
	//   63  117:areturn         
	}

	private final bld d(XmlPullParser xmlpullparser)
	{
		return a(xmlpullparser, "sourceURL", "range");
	//    0    0:aload_1         
	//    1    1:ldc2            #681 <String "sourceURL">
	//    2    4:ldc2            #683 <String "range">
	//    3    7:invokestatic    #218 <Method bld a(XmlPullParser, String, String)>
	//    4   10:areturn         
	}

	private static int e(XmlPullParser xmlpullparser)
	{
		boolean flag = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(((Object) (b(xmlpullparser, "schemeIdUri", ((String) (null))))));
	//    0    0:ldc2            #685 <String "urn:mpeg:dash:23003:3:audio_channel_configuration:2011">
	//    1    3:aload_0         
	//    2    4:ldc1            #126 <String "schemeIdUri">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #131 <Method String b(XmlPullParser, String, String)>
	//    5   10:invokevirtual   #112 <Method boolean String.equals(Object)>
	//    6   13:istore_2        
		int i = -1;
	//    7   14:iconst_m1       
	//    8   15:istore_1        
		if(flag)
	//*   9   16:iload_2         
	//*  10   17:ifeq            28
			i = a(xmlpullparser, "value", -1);
	//   11   20:aload_0         
	//   12   21:ldc1            #133 <String "value">
	//   13   23:iconst_m1       
	//   14   24:invokestatic    #195 <Method int a(XmlPullParser, String, int)>
	//   15   27:istore_1        
		do
			xmlpullparser.next();
	//   16   28:aload_0         
	//   17   29:invokeinterface #139 <Method int XmlPullParser.next()>
	//   18   34:pop             
		while(!bny.a(xmlpullparser, "AudioChannelConfiguration"));
	//   19   35:aload_0         
	//   20   36:ldc2            #399 <String "AudioChannelConfiguration">
	//   21   39:invokestatic    #144 <Method boolean bny.a(XmlPullParser, String)>
	//   22   42:ifeq            28
		return i;
	//   23   45:iload_1         
	//   24   46:ireturn         
	}

	public final Object a(Uri uri, InputStream inputstream)
	{
		return ((Object) (b(uri, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #688 <Method bky b(Uri, InputStream)>
	//    4    6:areturn         
	}

	private static final Pattern a = Pattern.compile("(\\d+)(?:/(\\d+))?");
	private static final Pattern b = Pattern.compile("CC([1-4])=.*");
	private static final Pattern c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
	private final String d;
	private final XmlPullParserFactory e;

	static 
	{
	//    0    0:ldc1            #18  <String "(\\d+)(?:/(\\d+))?">
	//    1    2:invokestatic    #24  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #26  <Field Pattern a>
	//    3    8:ldc1            #28  <String "CC([1-4])=.*">
	//    4   10:invokestatic    #24  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #30  <Field Pattern b>
	//    6   16:ldc1            #32  <String "([1-9]|[1-5][0-9]|6[0-3])=.*">
	//    7   18:invokestatic    #24  <Method Pattern Pattern.compile(String)>
	//    8   21:putstatic       #34  <Field Pattern c>
	//*   9   24:return          
	}
}
