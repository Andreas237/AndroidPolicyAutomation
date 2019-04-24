// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text.util;

import android.support.v4.util.PatternsCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.net.URLEncoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LinkifyCompat
{
	private static class LinkSpec
	{

		int end;
		URLSpan frameworkAddedSpan;
		int start;
		String url;

		LinkSpec()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface LinkifyMask
		extends Annotation
	{
	}


	private LinkifyCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	private static void addLinkMovementMethod(TextView textview)
	{
		android.text.method.MovementMethod movementmethod = textview.getMovementMethod();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method android.text.method.MovementMethod TextView.getMovementMethod()>
	//    2    4:astore_1        
		if((movementmethod == null || !(movementmethod instanceof LinkMovementMethod)) && textview.getLinksClickable())
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
	//*   5    9:aload_1         
	//*   6   10:instanceof      #41  <Class LinkMovementMethod>
	//*   7   13:ifne            30
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #45  <Method boolean TextView.getLinksClickable()>
	//*  10   20:ifeq            30
			textview.setMovementMethod(LinkMovementMethod.getInstance());
	//   11   23:aload_0         
	//   12   24:invokestatic    #48  <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   13   27:invokevirtual   #52  <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
	//   14   30:return          
	}

	public static void addLinks(TextView textview, Pattern pattern, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
		{
			Linkify.addLinks(textview, pattern, s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokestatic    #66  <Method void Linkify.addLinks(TextView, Pattern, String)>
			return;
	//    7   14:return          
		} else
		{
			addLinks(textview, pattern, s, ((String []) (null)), ((android.text.util.Linkify.MatchFilter) (null)), ((android.text.util.Linkify.TransformFilter) (null)));
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:aconst_null     
	//   12   19:aconst_null     
	//   13   20:aconst_null     
	//   14   21:invokestatic    #69  <Method void addLinks(TextView, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
			return;
	//   15   24:return          
		}
	}

	public static void addLinks(TextView textview, Pattern pattern, String s, android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          18
		{
			Linkify.addLinks(textview, pattern, s, matchfilter, transformfilter);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:invokestatic    #72  <Method void Linkify.addLinks(TextView, Pattern, String, android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
			return;
	//    9   17:return          
		} else
		{
			addLinks(textview, pattern, s, ((String []) (null)), matchfilter, transformfilter);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aconst_null     
	//   14   22:aload_3         
	//   15   23:aload           4
	//   16   25:invokestatic    #69  <Method void addLinks(TextView, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
			return;
	//   17   28:return          
		}
	}

	public static void addLinks(TextView textview, Pattern pattern, String s, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          20
		{
			Linkify.addLinks(textview, pattern, s, as, matchfilter, transformfilter);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:aload           5
	//    9   16:invokestatic    #73  <Method void Linkify.addLinks(TextView, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
			return;
	//   10   19:return          
		}
		SpannableString spannablestring = SpannableString.valueOf(textview.getText());
	//   11   20:aload_0         
	//   12   21:invokevirtual   #77  <Method CharSequence TextView.getText()>
	//   13   24:invokestatic    #83  <Method SpannableString SpannableString.valueOf(CharSequence)>
	//   14   27:astore          6
		if(addLinks(((Spannable) (spannablestring)), pattern, s, as, matchfilter, transformfilter))
	//*  15   29:aload           6
	//*  16   31:aload_1         
	//*  17   32:aload_2         
	//*  18   33:aload_3         
	//*  19   34:aload           4
	//*  20   36:aload           5
	//*  21   38:invokestatic    #86  <Method boolean addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//*  22   41:ifeq            54
		{
			textview.setText(((CharSequence) (spannablestring)));
	//   23   44:aload_0         
	//   24   45:aload           6
	//   25   47:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
			addLinkMovementMethod(textview);
	//   26   50:aload_0         
	//   27   51:invokestatic    #92  <Method void addLinkMovementMethod(TextView)>
		}
	//   28   54:return          
	}

	public static boolean addLinks(Spannable spannable, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          14
			return Linkify.addLinks(spannable, i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #95  <Method boolean Linkify.addLinks(Spannable, int)>
	//    6   13:ireturn         
		if(i == 0)
	//*   7   14:iload_1         
	//*   8   15:ifne            20
			return false;
	//    9   18:iconst_0        
	//   10   19:ireturn         
		URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:aload_0         
	//   14   23:invokeinterface #101 <Method int Spannable.length()>
	//   15   28:ldc1            #103 <Class URLSpan>
	//   16   30:invokeinterface #107 <Method Object[] Spannable.getSpans(int, int, Class)>
	//   17   35:checkcast       #109 <Class URLSpan[]>
	//   18   38:astore_3        
		for(int j = aurlspan.length - 1; j >= 0; j--)
	//*  19   39:aload_3         
	//*  20   40:arraylength     
	//*  21   41:iconst_1        
	//*  22   42:isub            
	//*  23   43:istore_2        
	//*  24   44:iload_2         
	//*  25   45:iflt            64
			spannable.removeSpan(((Object) (aurlspan[j])));
	//   26   48:aload_0         
	//   27   49:aload_3         
	//   28   50:iload_2         
	//   29   51:aaload          
	//   30   52:invokeinterface #113 <Method void Spannable.removeSpan(Object)>

	//   31   57:iload_2         
	//   32   58:iconst_1        
	//   33   59:isub            
	//   34   60:istore_2        
	//*  35   61:goto            44
		if((i & 4) != 0)
	//*  36   64:iload_1         
	//*  37   65:iconst_4        
	//*  38   66:iand            
	//*  39   67:ifeq            76
			Linkify.addLinks(spannable, 4);
	//   40   70:aload_0         
	//   41   71:iconst_4        
	//   42   72:invokestatic    #95  <Method boolean Linkify.addLinks(Spannable, int)>
	//   43   75:pop             
		Object obj = ((Object) (new ArrayList()));
	//   44   76:new             #115 <Class ArrayList>
	//   45   79:dup             
	//   46   80:invokespecial   #116 <Method void ArrayList()>
	//   47   83:astore_3        
		if((i & 1) != 0)
	//*  48   84:iload_1         
	//*  49   85:iconst_1        
	//*  50   86:iand            
	//*  51   87:ifeq            129
		{
			Pattern pattern = PatternsCompat.AUTOLINK_WEB_URL;
	//   52   90:getstatic       #122 <Field Pattern PatternsCompat.AUTOLINK_WEB_URL>
	//   53   93:astore          4
			android.text.util.Linkify.MatchFilter matchfilter = Linkify.sUrlMatchFilter;
	//   54   95:getstatic       #126 <Field android.text.util.Linkify$MatchFilter Linkify.sUrlMatchFilter>
	//   55   98:astore          5
			gatherLinks(((ArrayList) (obj)), spannable, pattern, new String[] {
				"http://", "https://", "rtsp://"
			}, matchfilter, ((android.text.util.Linkify.TransformFilter) (null)));
	//   56  100:aload_3         
	//   57  101:aload_0         
	//   58  102:aload           4
	//   59  104:iconst_3        
	//   60  105:anewarray       String[]
	//   61  108:dup             
	//   62  109:iconst_0        
	//   63  110:ldc1            #128 <String "http://">
	//   64  112:aastore         
	//   65  113:dup             
	//   66  114:iconst_1        
	//   67  115:ldc1            #130 <String "https://">
	//   68  117:aastore         
	//   69  118:dup             
	//   70  119:iconst_2        
	//   71  120:ldc1            #132 <String "rtsp://">
	//   72  122:aastore         
	//   73  123:aload           5
	//   74  125:aconst_null     
	//   75  126:invokestatic    #136 <Method void gatherLinks(ArrayList, Spannable, Pattern, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
		}
		if((i & 2) != 0)
	//*  76  129:iload_1         
	//*  77  130:iconst_2        
	//*  78  131:iand            
	//*  79  132:ifeq            154
			gatherLinks(((ArrayList) (obj)), spannable, PatternsCompat.AUTOLINK_EMAIL_ADDRESS, new String[] {
				"mailto:"
			}, ((android.text.util.Linkify.MatchFilter) (null)), ((android.text.util.Linkify.TransformFilter) (null)));
	//   80  135:aload_3         
	//   81  136:aload_0         
	//   82  137:getstatic       #139 <Field Pattern PatternsCompat.AUTOLINK_EMAIL_ADDRESS>
	//   83  140:iconst_1        
	//   84  141:anewarray       String[]
	//   85  144:dup             
	//   86  145:iconst_0        
	//   87  146:ldc1            #141 <String "mailto:">
	//   88  148:aastore         
	//   89  149:aconst_null     
	//   90  150:aconst_null     
	//   91  151:invokestatic    #136 <Method void gatherLinks(ArrayList, Spannable, Pattern, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
		if((i & 8) != 0)
	//*  92  154:iload_1         
	//*  93  155:bipush          8
	//*  94  157:iand            
	//*  95  158:ifeq            166
			gatherMapLinks(((ArrayList) (obj)), spannable);
	//   96  161:aload_3         
	//   97  162:aload_0         
	//   98  163:invokestatic    #145 <Method void gatherMapLinks(ArrayList, Spannable)>
		pruneOverlaps(((ArrayList) (obj)), spannable);
	//   99  166:aload_3         
	//  100  167:aload_0         
	//  101  168:invokestatic    #148 <Method void pruneOverlaps(ArrayList, Spannable)>
		if(((ArrayList) (obj)).size() == 0)
	//* 102  171:aload_3         
	//* 103  172:invokevirtual   #151 <Method int ArrayList.size()>
	//* 104  175:ifne            180
			return false;
	//  105  178:iconst_0        
	//  106  179:ireturn         
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//  107  180:aload_3         
	//  108  181:invokevirtual   #155 <Method Iterator ArrayList.iterator()>
	//  109  184:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//  110  185:aload_3         
	//  111  186:invokeinterface #160 <Method boolean Iterator.hasNext()>
	//  112  191:ifeq            235
			LinkSpec linkspec = (LinkSpec)((Iterator) (obj)).next();
	//  113  194:aload_3         
	//  114  195:invokeinterface #164 <Method Object Iterator.next()>
	//  115  200:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//  116  203:astore          4
			if(linkspec.frameworkAddedSpan == null)
	//* 117  205:aload           4
	//* 118  207:getfield        #168 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
	//* 119  210:ifnonnull       185
				applyLink(linkspec.url, linkspec.start, linkspec.end, spannable);
	//  120  213:aload           4
	//  121  215:getfield        #172 <Field String LinkifyCompat$LinkSpec.url>
	//  122  218:aload           4
	//  123  220:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//  124  223:aload           4
	//  125  225:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//  126  228:aload_0         
	//  127  229:invokestatic    #182 <Method void applyLink(String, int, int, Spannable)>
		} while(true);
	//  128  232:goto            185
		return true;
	//  129  235:iconst_1        
	//  130  236:ireturn         
	}

	public static boolean addLinks(Spannable spannable, Pattern pattern, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
			return Linkify.addLinks(spannable, pattern, s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokestatic    #185 <Method boolean Linkify.addLinks(Spannable, Pattern, String)>
	//    7   14:ireturn         
		else
			return addLinks(spannable, pattern, s, ((String []) (null)), ((android.text.util.Linkify.MatchFilter) (null)), ((android.text.util.Linkify.TransformFilter) (null)));
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:aconst_null     
	//   12   19:aconst_null     
	//   13   20:aconst_null     
	//   14   21:invokestatic    #86  <Method boolean addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//   15   24:ireturn         
	}

	public static boolean addLinks(Spannable spannable, Pattern pattern, String s, android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          18
			return Linkify.addLinks(spannable, pattern, s, matchfilter, transformfilter);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:invokestatic    #188 <Method boolean Linkify.addLinks(Spannable, Pattern, String, android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//    9   17:ireturn         
		else
			return addLinks(spannable, pattern, s, ((String []) (null)), matchfilter, transformfilter);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aconst_null     
	//   14   22:aload_3         
	//   15   23:aload           4
	//   16   25:invokestatic    #86  <Method boolean addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//   17   28:ireturn         
	}

	public static boolean addLinks(Spannable spannable, Pattern pattern, String s, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		String s1;
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          20
				return Linkify.addLinks(spannable, pattern, s, as, matchfilter, transformfilter);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:aload           5
	//    9   16:invokestatic    #189 <Method boolean Linkify.addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//   10   19:ireturn         
			s1 = s;
	//   11   20:aload_2         
	//   12   21:astore          10
			if(s == null)
	//*  13   23:aload_2         
	//*  14   24:ifnonnull       31
				s1 = "";
	//   15   27:ldc1            #191 <String "">
	//   16   29:astore          10
			if(as != null)
	//*  17   31:aload_3         
	//*  18   32:ifnull          43
			{
				s = ((String) (as));
	//   19   35:aload_3         
	//   20   36:astore_2        
				if(as.length >= 1)
					break label0;
	//   21   37:aload_3         
	//   22   38:arraylength     
	//   23   39:iconst_1        
	//   24   40:icmpge          47
			}
			s = ((String) (EMPTY_STRING));
	//   25   43:getstatic       #23  <Field String[] EMPTY_STRING>
	//   26   46:astore_2        
		}
		String as1[] = new String[s.length + 1];
	//   27   47:aload_2         
	//   28   48:arraylength     
	//   29   49:iconst_1        
	//   30   50:iadd            
	//   31   51:anewarray       String[]
	//   32   54:astore          11
		as1[0] = s1.toLowerCase(Locale.ROOT);
	//   33   56:aload           11
	//   34   58:iconst_0        
	//   35   59:aload           10
	//   36   61:getstatic       #197 <Field Locale Locale.ROOT>
	//   37   64:invokevirtual   #201 <Method String String.toLowerCase(Locale)>
	//   38   67:aastore         
		for(int i = 0; i < s.length;)
	//*  39   68:iconst_0        
	//*  40   69:istore          6
	//*  41   71:iload           6
	//*  42   73:aload_2         
	//*  43   74:arraylength     
	//*  44   75:icmpge          116
		{
			as = ((String []) (s[i]));
	//   45   78:aload_2         
	//   46   79:iload           6
	//   47   81:aaload          
	//   48   82:astore_3        
			i++;
	//   49   83:iload           6
	//   50   85:iconst_1        
	//   51   86:iadd            
	//   52   87:istore          6
			if(as == null)
	//*  53   89:aload_3         
	//*  54   90:ifnonnull       99
				as = "";
	//   55   93:ldc1            #191 <String "">
	//   56   95:astore_3        
			else
	//*  57   96:goto            107
				as = ((String []) (((String) (as)).toLowerCase(Locale.ROOT)));
	//   58   99:aload_3         
	//   59  100:getstatic       #197 <Field Locale Locale.ROOT>
	//   60  103:invokevirtual   #201 <Method String String.toLowerCase(Locale)>
	//   61  106:astore_3        
			as1[i] = ((String) (as));
	//   62  107:aload           11
	//   63  109:iload           6
	//   64  111:aload_3         
	//   65  112:aastore         
		}

	//*  66  113:goto            71
		pattern = ((Pattern) (pattern.matcher(((CharSequence) (spannable)))));
	//   67  116:aload_1         
	//   68  117:aload_0         
	//   69  118:invokevirtual   #207 <Method Matcher Pattern.matcher(CharSequence)>
	//   70  121:astore_1        
		boolean flag = false;
	//   71  122:iconst_0        
	//   72  123:istore          8
		do
		{
			if(!((Matcher) (pattern)).find())
				break;
	//   73  125:aload_1         
	//   74  126:invokevirtual   #212 <Method boolean Matcher.find()>
	//   75  129:ifeq            201
			int j = ((Matcher) (pattern)).start();
	//   76  132:aload_1         
	//   77  133:invokevirtual   #214 <Method int Matcher.start()>
	//   78  136:istore          6
			int k = ((Matcher) (pattern)).end();
	//   79  138:aload_1         
	//   80  139:invokevirtual   #216 <Method int Matcher.end()>
	//   81  142:istore          7
			boolean flag1;
			if(matchfilter != null)
	//*  82  144:aload           4
	//*  83  146:ifnull          166
				flag1 = matchfilter.acceptMatch(((CharSequence) (spannable)), j, k);
	//   84  149:aload           4
	//   85  151:aload_0         
	//   86  152:iload           6
	//   87  154:iload           7
	//   88  156:invokeinterface #222 <Method boolean android.text.util.Linkify$MatchFilter.acceptMatch(CharSequence, int, int)>
	//   89  161:istore          9
			else
	//*  90  163:goto            169
				flag1 = true;
	//   91  166:iconst_1        
	//   92  167:istore          9
			if(flag1)
	//*  93  169:iload           9
	//*  94  171:ifeq            125
			{
				applyLink(makeUrl(((Matcher) (pattern)).group(0), as1, ((Matcher) (pattern)), transformfilter), j, k, spannable);
	//   95  174:aload_1         
	//   96  175:iconst_0        
	//   97  176:invokevirtual   #226 <Method String Matcher.group(int)>
	//   98  179:aload           11
	//   99  181:aload_1         
	//  100  182:aload           5
	//  101  184:invokestatic    #230 <Method String makeUrl(String, String[], Matcher, android.text.util.Linkify$TransformFilter)>
	//  102  187:iload           6
	//  103  189:iload           7
	//  104  191:aload_0         
	//  105  192:invokestatic    #182 <Method void applyLink(String, int, int, Spannable)>
				flag = true;
	//  106  195:iconst_1        
	//  107  196:istore          8
			}
		} while(true);
	//  108  198:goto            125
		return flag;
	//  109  201:iload           8
	//  110  203:ireturn         
	}

	public static boolean addLinks(TextView textview, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          14
			return Linkify.addLinks(textview, i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #233 <Method boolean Linkify.addLinks(TextView, int)>
	//    6   13:ireturn         
		if(i == 0)
	//*   7   14:iload_1         
	//*   8   15:ifne            20
			return false;
	//    9   18:iconst_0        
	//   10   19:ireturn         
		Object obj = ((Object) (textview.getText()));
	//   11   20:aload_0         
	//   12   21:invokevirtual   #77  <Method CharSequence TextView.getText()>
	//   13   24:astore_2        
		if(obj instanceof Spannable)
	//*  14   25:aload_2         
	//*  15   26:instanceof      #97  <Class Spannable>
	//*  16   29:ifeq            51
			if(addLinks((Spannable)obj, i))
	//*  17   32:aload_2         
	//*  18   33:checkcast       #97  <Class Spannable>
	//*  19   36:iload_1         
	//*  20   37:invokestatic    #234 <Method boolean addLinks(Spannable, int)>
	//*  21   40:ifeq            49
			{
				addLinkMovementMethod(textview);
	//   22   43:aload_0         
	//   23   44:invokestatic    #92  <Method void addLinkMovementMethod(TextView)>
				return true;
	//   24   47:iconst_1        
	//   25   48:ireturn         
			} else
			{
				return false;
	//   26   49:iconst_0        
	//   27   50:ireturn         
			}
		obj = ((Object) (SpannableString.valueOf(((CharSequence) (obj)))));
	//   28   51:aload_2         
	//   29   52:invokestatic    #83  <Method SpannableString SpannableString.valueOf(CharSequence)>
	//   30   55:astore_2        
		if(addLinks(((Spannable) (obj)), i))
	//*  31   56:aload_2         
	//*  32   57:iload_1         
	//*  33   58:invokestatic    #234 <Method boolean addLinks(Spannable, int)>
	//*  34   61:ifeq            75
		{
			addLinkMovementMethod(textview);
	//   35   64:aload_0         
	//   36   65:invokestatic    #92  <Method void addLinkMovementMethod(TextView)>
			textview.setText(((CharSequence) (obj)));
	//   37   68:aload_0         
	//   38   69:aload_2         
	//   39   70:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
			return true;
	//   40   73:iconst_1        
	//   41   74:ireturn         
		} else
		{
			return false;
	//   42   75:iconst_0        
	//   43   76:ireturn         
		}
	}

	private static void applyLink(String s, int i, int j, Spannable spannable)
	{
		spannable.setSpan(((Object) (new URLSpan(s))), i, j, 33);
	//    0    0:aload_3         
	//    1    1:new             #103 <Class URLSpan>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #237 <Method void URLSpan(String)>
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:bipush          33
	//    8   13:invokeinterface #241 <Method void Spannable.setSpan(Object, int, int, int)>
	//    9   18:return          
	}

	private static void gatherLinks(ArrayList arraylist, Spannable spannable, Pattern pattern, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		pattern = ((Pattern) (pattern.matcher(((CharSequence) (spannable)))));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #207 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    5:astore_2        
		do
		{
			if(!((Matcher) (pattern)).find())
				break;
	//    4    6:aload_2         
	//    5    7:invokevirtual   #212 <Method boolean Matcher.find()>
	//    6   10:ifeq            95
			int i = ((Matcher) (pattern)).start();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #214 <Method int Matcher.start()>
	//    9   17:istore          6
			int j = ((Matcher) (pattern)).end();
	//   10   19:aload_2         
	//   11   20:invokevirtual   #216 <Method int Matcher.end()>
	//   12   23:istore          7
			if(matchfilter == null || matchfilter.acceptMatch(((CharSequence) (spannable)), i, j))
	//*  13   25:aload           4
	//*  14   27:ifnull          45
	//*  15   30:aload           4
	//*  16   32:aload_1         
	//*  17   33:iload           6
	//*  18   35:iload           7
	//*  19   37:invokeinterface #222 <Method boolean android.text.util.Linkify$MatchFilter.acceptMatch(CharSequence, int, int)>
	//*  20   42:ifeq            6
			{
				LinkSpec linkspec = new LinkSpec();
	//   21   45:new             #8   <Class LinkifyCompat$LinkSpec>
	//   22   48:dup             
	//   23   49:invokespecial   #242 <Method void LinkifyCompat$LinkSpec()>
	//   24   52:astore          8
				linkspec.url = makeUrl(((Matcher) (pattern)).group(0), as, ((Matcher) (pattern)), transformfilter);
	//   25   54:aload           8
	//   26   56:aload_2         
	//   27   57:iconst_0        
	//   28   58:invokevirtual   #226 <Method String Matcher.group(int)>
	//   29   61:aload_3         
	//   30   62:aload_2         
	//   31   63:aload           5
	//   32   65:invokestatic    #230 <Method String makeUrl(String, String[], Matcher, android.text.util.Linkify$TransformFilter)>
	//   33   68:putfield        #172 <Field String LinkifyCompat$LinkSpec.url>
				linkspec.start = i;
	//   34   71:aload           8
	//   35   73:iload           6
	//   36   75:putfield        #175 <Field int LinkifyCompat$LinkSpec.start>
				linkspec.end = j;
	//   37   78:aload           8
	//   38   80:iload           7
	//   39   82:putfield        #178 <Field int LinkifyCompat$LinkSpec.end>
				arraylist.add(((Object) (linkspec)));
	//   40   85:aload_0         
	//   41   86:aload           8
	//   42   88:invokevirtual   #246 <Method boolean ArrayList.add(Object)>
	//   43   91:pop             
			}
		} while(true);
	//   44   92:goto            6
	//   45   95:return          
	}

	private static void gatherMapLinks(ArrayList arraylist, Spannable spannable)
	{
		int i;
		spannable = ((Spannable) (((Object) (spannable)).toString()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #256 <Method String Object.toString()>
	//    2    4:astore_1        
		i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
_L2:
		int j;
		int k;
		LinkSpec linkspec;
		String s;
		StringBuilder stringbuilder;
		try
		{
			s = WebView.findAddress(((String) (spannable)));
	//    5    7:aload_1         
	//    6    8:invokestatic    #262 <Method String WebView.findAddress(String)>
	//    7   11:astore          6
		}
	//*   8   13:aload           6
	//*   9   15:ifnull          131
	//*  10   18:aload_1         
	//*  11   19:aload           6
	//*  12   21:invokevirtual   #266 <Method int String.indexOf(String)>
	//*  13   24:istore          4
	//*  14   26:iload           4
	//*  15   28:ifge            32
	//*  16   31:return          
	//*  17   32:new             #8   <Class LinkifyCompat$LinkSpec>
	//*  18   35:dup             
	//*  19   36:invokespecial   #242 <Method void LinkifyCompat$LinkSpec()>
	//*  20   39:astore          5
	//*  21   41:aload           6
	//*  22   43:invokevirtual   #267 <Method int String.length()>
	//*  23   46:iload           4
	//*  24   48:iadd            
	//*  25   49:istore_3        
	//*  26   50:aload           5
	//*  27   52:iload           4
	//*  28   54:iload_2         
	//*  29   55:iadd            
	//*  30   56:putfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//*  31   59:iload_2         
	//*  32   60:iload_3         
	//*  33   61:iadd            
	//*  34   62:istore_2        
	//*  35   63:aload           5
	//*  36   65:iload_2         
	//*  37   66:putfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//*  38   69:aload_1         
	//*  39   70:iload_3         
	//*  40   71:invokevirtual   #270 <Method String String.substring(int)>
	//*  41   74:astore_1        
	//*  42   75:aload           6
	//*  43   77:ldc2            #272 <String "UTF-8">
	//*  44   80:invokestatic    #278 <Method String URLEncoder.encode(String, String)>
	//*  45   83:astore          6
	//*  46   85:new             #280 <Class StringBuilder>
	//*  47   88:dup             
	//*  48   89:invokespecial   #281 <Method void StringBuilder()>
	//*  49   92:astore          7
	//*  50   94:aload           7
	//*  51   96:ldc2            #283 <String "geo:0,0?q=">
	//*  52   99:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//*  53  102:pop             
	//*  54  103:aload           7
	//*  55  105:aload           6
	//*  56  107:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//*  57  110:pop             
	//*  58  111:aload           5
	//*  59  113:aload           7
	//*  60  115:invokevirtual   #288 <Method String StringBuilder.toString()>
	//*  61  118:putfield        #172 <Field String LinkifyCompat$LinkSpec.url>
	//*  62  121:aload_0         
	//*  63  122:aload           5
	//*  64  124:invokevirtual   #246 <Method boolean ArrayList.add(Object)>
	//*  65  127:pop             
	//*  66  128:goto            7
	//*  67  131:return          
		// Misplaced declaration of an exception variable
		catch(ArrayList arraylist)
	//*  68  132:astore_0        
		{
			return;
	//   69  133:return          
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_131;
		k = ((String) (spannable)).indexOf(s);
		if(k < 0)
			return;
		linkspec = new LinkSpec();
		j = s.length() + k;
		linkspec.start = k + i;
		i += j;
		linkspec.end = i;
		spannable = ((Spannable) (((String) (spannable)).substring(j)));
		s = URLEncoder.encode(s, "UTF-8");
		stringbuilder = new StringBuilder();
		stringbuilder.append("geo:0,0?q=");
		stringbuilder.append(s);
		linkspec.url = stringbuilder.toString();
		arraylist.add(((Object) (linkspec)));
		continue; /* Loop/switch isn't completed */
		return;
		UnsupportedEncodingException unsupportedencodingexception;
		unsupportedencodingexception;
	//   70  134:astore          5
		if(true) goto _L2; else goto _L1
	//   71  136:goto            7
_L1:
	}

	private static String makeUrl(String s, String as[], Matcher matcher, android.text.util.Linkify.TransformFilter transformfilter)
	{
		boolean flag;
label0:
		{
			String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore          7
			if(transformfilter != null)
	//*   2    3:aload_3         
	//*   3    4:ifnull          17
				s1 = transformfilter.transformUrl(matcher, s);
	//    4    7:aload_3         
	//    5    8:aload_2         
	//    6    9:aload_0         
	//    7   10:invokeinterface #295 <Method String android.text.util.Linkify$TransformFilter.transformUrl(Matcher, String)>
	//    8   15:astore          7
			int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore          4
			do
			{
				boolean flag1 = true;
	//   11   20:iconst_1        
	//   12   21:istore          6
				if(i >= as.length)
					break;
	//   13   23:iload           4
	//   14   25:aload_1         
	//   15   26:arraylength     
	//   16   27:icmpge          136
				if(s1.regionMatches(true, 0, as[i], 0, as[i].length()))
	//*  17   30:aload           7
	//*  18   32:iconst_1        
	//*  19   33:iconst_0        
	//*  20   34:aload_1         
	//*  21   35:iload           4
	//*  22   37:aaload          
	//*  23   38:iconst_0        
	//*  24   39:aload_1         
	//*  25   40:iload           4
	//*  26   42:aaload          
	//*  27   43:invokevirtual   #267 <Method int String.length()>
	//*  28   46:invokevirtual   #299 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//*  29   49:ifeq            127
				{
					flag = flag1;
	//   30   52:iload           6
	//   31   54:istore          5
					s = s1;
	//   32   56:aload           7
	//   33   58:astore_0        
					if(!s1.regionMatches(false, 0, as[i], 0, as[i].length()))
	//*  34   59:aload           7
	//*  35   61:iconst_0        
	//*  36   62:iconst_0        
	//*  37   63:aload_1         
	//*  38   64:iload           4
	//*  39   66:aaload          
	//*  40   67:iconst_0        
	//*  41   68:aload_1         
	//*  42   69:iload           4
	//*  43   71:aaload          
	//*  44   72:invokevirtual   #267 <Method int String.length()>
	//*  45   75:invokevirtual   #299 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//*  46   78:ifne            142
					{
						s = ((String) (new StringBuilder()));
	//   47   81:new             #280 <Class StringBuilder>
	//   48   84:dup             
	//   49   85:invokespecial   #281 <Method void StringBuilder()>
	//   50   88:astore_0        
						((StringBuilder) (s)).append(as[i]);
	//   51   89:aload_0         
	//   52   90:aload_1         
	//   53   91:iload           4
	//   54   93:aaload          
	//   55   94:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//   56   97:pop             
						((StringBuilder) (s)).append(s1.substring(as[i].length()));
	//   57   98:aload_0         
	//   58   99:aload           7
	//   59  101:aload_1         
	//   60  102:iload           4
	//   61  104:aaload          
	//   62  105:invokevirtual   #267 <Method int String.length()>
	//   63  108:invokevirtual   #270 <Method String String.substring(int)>
	//   64  111:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//   65  114:pop             
						s = ((StringBuilder) (s)).toString();
	//   66  115:aload_0         
	//   67  116:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   68  119:astore_0        
						flag = flag1;
	//   69  120:iload           6
	//   70  122:istore          5
					}
					break label0;
	//   71  124:goto            142
				}
				i++;
	//   72  127:iload           4
	//   73  129:iconst_1        
	//   74  130:iadd            
	//   75  131:istore          4
			} while(true);
	//   76  133:goto            20
			flag = false;
	//   77  136:iconst_0        
	//   78  137:istore          5
			s = s1;
	//   79  139:aload           7
	//   80  141:astore_0        
		}
		matcher = ((Matcher) (s));
	//   81  142:aload_0         
	//   82  143:astore_2        
		if(!flag)
	//*  83  144:iload           5
	//*  84  146:ifne            183
		{
			matcher = ((Matcher) (s));
	//   85  149:aload_0         
	//   86  150:astore_2        
			if(as.length > 0)
	//*  87  151:aload_1         
	//*  88  152:arraylength     
	//*  89  153:ifle            183
			{
				matcher = ((Matcher) (new StringBuilder()));
	//   90  156:new             #280 <Class StringBuilder>
	//   91  159:dup             
	//   92  160:invokespecial   #281 <Method void StringBuilder()>
	//   93  163:astore_2        
				((StringBuilder) (matcher)).append(as[0]);
	//   94  164:aload_2         
	//   95  165:aload_1         
	//   96  166:iconst_0        
	//   97  167:aaload          
	//   98  168:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//   99  171:pop             
				((StringBuilder) (matcher)).append(s);
	//  100  172:aload_2         
	//  101  173:aload_0         
	//  102  174:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//  103  177:pop             
				matcher = ((Matcher) (((StringBuilder) (matcher)).toString()));
	//  104  178:aload_2         
	//  105  179:invokevirtual   #288 <Method String StringBuilder.toString()>
	//  106  182:astore_2        
			}
		}
		return ((String) (matcher));
	//  107  183:aload_2         
	//  108  184:areturn         
	}

	private static void pruneOverlaps(ArrayList arraylist, Spannable spannable)
	{
		int i = spannable.length();
	//    0    0:aload_1         
	//    1    1:invokeinterface #101 <Method int Spannable.length()>
	//    2    6:istore_2        
		boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, i, android/text/style/URLSpan);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:iload_2         
	//    8   12:ldc1            #103 <Class URLSpan>
	//    9   14:invokeinterface #107 <Method Object[] Spannable.getSpans(int, int, Class)>
	//   10   19:checkcast       #109 <Class URLSpan[]>
	//   11   22:astore          6
		for(i = 0; i < aurlspan.length; i++)
	//*  12   24:iconst_0        
	//*  13   25:istore_2        
	//*  14   26:iload_2         
	//*  15   27:aload           6
	//*  16   29:arraylength     
	//*  17   30:icmpge          95
		{
			LinkSpec linkspec1 = new LinkSpec();
	//   18   33:new             #8   <Class LinkifyCompat$LinkSpec>
	//   19   36:dup             
	//   20   37:invokespecial   #242 <Method void LinkifyCompat$LinkSpec()>
	//   21   40:astore          7
			linkspec1.frameworkAddedSpan = aurlspan[i];
	//   22   42:aload           7
	//   23   44:aload           6
	//   24   46:iload_2         
	//   25   47:aaload          
	//   26   48:putfield        #168 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
			linkspec1.start = spannable.getSpanStart(((Object) (aurlspan[i])));
	//   27   51:aload           7
	//   28   53:aload_1         
	//   29   54:aload           6
	//   30   56:iload_2         
	//   31   57:aaload          
	//   32   58:invokeinterface #303 <Method int Spannable.getSpanStart(Object)>
	//   33   63:putfield        #175 <Field int LinkifyCompat$LinkSpec.start>
			linkspec1.end = spannable.getSpanEnd(((Object) (aurlspan[i])));
	//   34   66:aload           7
	//   35   68:aload_1         
	//   36   69:aload           6
	//   37   71:iload_2         
	//   38   72:aaload          
	//   39   73:invokeinterface #306 <Method int Spannable.getSpanEnd(Object)>
	//   40   78:putfield        #178 <Field int LinkifyCompat$LinkSpec.end>
			arraylist.add(((Object) (linkspec1)));
	//   41   81:aload_0         
	//   42   82:aload           7
	//   43   84:invokevirtual   #246 <Method boolean ArrayList.add(Object)>
	//   44   87:pop             
		}

	//   45   88:iload_2         
	//   46   89:iconst_1        
	//   47   90:iadd            
	//   48   91:istore_2        
	//*  49   92:goto            26
		Collections.sort(((java.util.List) (arraylist)), COMPARATOR);
	//   50   95:aload_0         
	//   51   96:getstatic       #28  <Field Comparator COMPARATOR>
	//   52   99:invokestatic    #312 <Method void Collections.sort(java.util.List, Comparator)>
		int k = arraylist.size();
	//   53  102:aload_0         
	//   54  103:invokevirtual   #151 <Method int ArrayList.size()>
	//   55  106:istore          4
		i = ((int) (flag));
	//   56  108:iload_3         
	//   57  109:istore_2        
		do
		{
			if(i >= k - 1)
				break;
	//   58  110:iload_2         
	//   59  111:iload           4
	//   60  113:iconst_1        
	//   61  114:isub            
	//   62  115:icmpge          301
			LinkSpec linkspec = (LinkSpec)arraylist.get(i);
	//   63  118:aload_0         
	//   64  119:iload_2         
	//   65  120:invokevirtual   #316 <Method Object ArrayList.get(int)>
	//   66  123:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   67  126:astore          6
			int l = i + 1;
	//   68  128:iload_2         
	//   69  129:iconst_1        
	//   70  130:iadd            
	//   71  131:istore          5
			LinkSpec linkspec2 = (LinkSpec)arraylist.get(l);
	//   72  133:aload_0         
	//   73  134:iload           5
	//   74  136:invokevirtual   #316 <Method Object ArrayList.get(int)>
	//   75  139:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   76  142:astore          7
			if(linkspec.start <= linkspec2.start && linkspec.end > linkspec2.start)
	//*  77  144:aload           6
	//*  78  146:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//*  79  149:aload           7
	//*  80  151:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//*  81  154:icmpgt          295
	//*  82  157:aload           6
	//*  83  159:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//*  84  162:aload           7
	//*  85  164:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//*  86  167:icmple          295
			{
				int j;
				if(linkspec2.end <= linkspec.end || linkspec.end - linkspec.start > linkspec2.end - linkspec2.start)
	//*  87  170:aload           7
	//*  88  172:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//*  89  175:aload           6
	//*  90  177:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//*  91  180:icmpgt          189
					j = l;
	//   92  183:iload           5
	//   93  185:istore_3        
				else
	//*  94  186:goto            249
	//*  95  189:aload           6
	//*  96  191:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//*  97  194:aload           6
	//*  98  196:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//*  99  199:isub            
	//* 100  200:aload           7
	//* 101  202:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 102  205:aload           7
	//* 103  207:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 104  210:isub            
	//* 105  211:icmple          217
	//* 106  214:goto            183
				if(linkspec.end - linkspec.start < linkspec2.end - linkspec2.start)
	//* 107  217:aload           6
	//* 108  219:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 109  222:aload           6
	//* 110  224:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 111  227:isub            
	//* 112  228:aload           7
	//* 113  230:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 114  233:aload           7
	//* 115  235:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 116  238:isub            
	//* 117  239:icmpge          247
					j = i;
	//  118  242:iload_2         
	//  119  243:istore_3        
				else
	//* 120  244:goto            249
					j = -1;
	//  121  247:iconst_m1       
	//  122  248:istore_3        
				if(j != -1)
	//* 123  249:iload_3         
	//* 124  250:iconst_m1       
	//* 125  251:icmpeq          295
				{
					URLSpan urlspan = ((LinkSpec)arraylist.get(j)).frameworkAddedSpan;
	//  126  254:aload_0         
	//  127  255:iload_3         
	//  128  256:invokevirtual   #316 <Method Object ArrayList.get(int)>
	//  129  259:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//  130  262:getfield        #168 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
	//  131  265:astore          6
					if(urlspan != null)
	//* 132  267:aload           6
	//* 133  269:ifnull          280
						spannable.removeSpan(((Object) (urlspan)));
	//  134  272:aload_1         
	//  135  273:aload           6
	//  136  275:invokeinterface #113 <Method void Spannable.removeSpan(Object)>
					arraylist.remove(j);
	//  137  280:aload_0         
	//  138  281:iload_3         
	//  139  282:invokevirtual   #319 <Method Object ArrayList.remove(int)>
	//  140  285:pop             
					k--;
	//  141  286:iload           4
	//  142  288:iconst_1        
	//  143  289:isub            
	//  144  290:istore          4
					continue;
	//  145  292:goto            110
				}
			}
			i = l;
	//  146  295:iload           5
	//  147  297:istore_2        
		} while(true);
	//  148  298:goto            110
	//  149  301:return          
	}

	private static final Comparator COMPARATOR = new Comparator() {

		public int compare(LinkSpec linkspec, LinkSpec linkspec1)
		{
			if(linkspec.start < linkspec1.start)
		//*   0    0:aload_1         
		//*   1    1:getfield        #22  <Field int LinkifyCompat$LinkSpec.start>
		//*   2    4:aload_2         
		//*   3    5:getfield        #22  <Field int LinkifyCompat$LinkSpec.start>
		//*   4    8:icmpge          13
				return -1;
		//    5   11:iconst_m1       
		//    6   12:ireturn         
			if(linkspec.start > linkspec1.start)
		//*   7   13:aload_1         
		//*   8   14:getfield        #22  <Field int LinkifyCompat$LinkSpec.start>
		//*   9   17:aload_2         
		//*  10   18:getfield        #22  <Field int LinkifyCompat$LinkSpec.start>
		//*  11   21:icmple          26
				return 1;
		//   12   24:iconst_1        
		//   13   25:ireturn         
			if(linkspec.end < linkspec1.end)
		//*  14   26:aload_1         
		//*  15   27:getfield        #25  <Field int LinkifyCompat$LinkSpec.end>
		//*  16   30:aload_2         
		//*  17   31:getfield        #25  <Field int LinkifyCompat$LinkSpec.end>
		//*  18   34:icmpge          39
				return 1;
		//   19   37:iconst_1        
		//   20   38:ireturn         
			return linkspec.end <= linkspec1.end ? 0 : -1;
		//   21   39:aload_1         
		//   22   40:getfield        #25  <Field int LinkifyCompat$LinkSpec.end>
		//   23   43:aload_2         
		//   24   44:getfield        #25  <Field int LinkifyCompat$LinkSpec.end>
		//   25   47:icmple          52
		//   26   50:iconst_m1       
		//   27   51:ireturn         
		//   28   52:iconst_0        
		//   29   53:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((LinkSpec)obj, (LinkSpec)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class LinkifyCompat$LinkSpec>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class LinkifyCompat$LinkSpec>
		//    5    9:invokevirtual   #28  <Method int compare(LinkifyCompat$LinkSpec, LinkifyCompat$LinkSpec)>
		//    6   12:ireturn         
		}

	}
;
	private static final String EMPTY_STRING[] = new String[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       String[]
	//    2    4:putstatic       #23  <Field String[] EMPTY_STRING>
	//    3    7:new             #6   <Class LinkifyCompat$1>
	//    4   10:dup             
	//    5   11:invokespecial   #26  <Method void LinkifyCompat$1()>
	//    6   14:putstatic       #28  <Field Comparator COMPARATOR>
	//*   7   17:return          
	}
}
