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

	public static final void addLinks(TextView textview, Pattern pattern, String s)
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

	public static final void addLinks(TextView textview, Pattern pattern, String s, android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
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

	public static final void addLinks(TextView textview, Pattern pattern, String s, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
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
		} else
	//*  10   19:return          
		{
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
	//*  22   41:ifeq            19
			{
				textview.setText(((CharSequence) (spannablestring)));
	//   23   44:aload_0         
	//   24   45:aload           6
	//   25   47:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
				addLinkMovementMethod(textview);
	//   26   50:aload_0         
	//   27   51:invokestatic    #92  <Method void addLinkMovementMethod(TextView)>
				return;
	//   28   54:return          
			}
		}
	}

	public static final boolean addLinks(Spannable spannable, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
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

	public static final boolean addLinks(Spannable spannable, Pattern pattern, String s)
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

	public static final boolean addLinks(Spannable spannable, Pattern pattern, String s, android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
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

	public static final boolean addLinks(Spannable spannable, Pattern pattern, String s, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		if(android.os.Build.VERSION.SDK_INT < 26) goto _L2; else goto _L1
	//    0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          26
	//    2    5:icmplt          24
_L1:
		boolean flag1 = Linkify.addLinks(spannable, pattern, s, as, matchfilter, transformfilter);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:aload           5
	//    9   16:invokestatic    #189 <Method boolean Linkify.addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//   10   19:istore          9
_L4:
		return flag1;
	//   11   21:iload           9
	//   12   23:ireturn         
_L2:
		String s1;
label0:
		{
			s1 = s;
	//   13   24:aload_2         
	//   14   25:astore          10
			if(s == null)
	//*  15   27:aload_2         
	//*  16   28:ifnonnull       35
				s1 = "";
	//   17   31:ldc1            #191 <String "">
	//   18   33:astore          10
			if(as != null)
	//*  19   35:aload_3         
	//*  20   36:ifnull          47
			{
				s = ((String) (as));
	//   21   39:aload_3         
	//   22   40:astore_2        
				if(as.length >= 1)
					break label0;
	//   23   41:aload_3         
	//   24   42:arraylength     
	//   25   43:iconst_1        
	//   26   44:icmpge          51
			}
			s = ((String) (EMPTY_STRING));
	//   27   47:getstatic       #23  <Field String[] EMPTY_STRING>
	//   28   50:astore_2        
		}
		String as1[] = new String[s.length + 1];
	//   29   51:aload_2         
	//   30   52:arraylength     
	//   31   53:iconst_1        
	//   32   54:iadd            
	//   33   55:anewarray       String[]
	//   34   58:astore          11
		as1[0] = s1.toLowerCase(Locale.ROOT);
	//   35   60:aload           11
	//   36   62:iconst_0        
	//   37   63:aload           10
	//   38   65:getstatic       #197 <Field Locale Locale.ROOT>
	//   39   68:invokevirtual   #201 <Method String String.toLowerCase(Locale)>
	//   40   71:aastore         
		int i = 0;
	//   41   72:iconst_0        
	//   42   73:istore          6
		while(i < s.length) 
	//*  43   75:iload           6
	//*  44   77:aload_2         
	//*  45   78:arraylength     
	//*  46   79:icmpge          122
		{
			as = ((String []) (s[i]));
	//   47   82:aload_2         
	//   48   83:iload           6
	//   49   85:aaload          
	//   50   86:astore_3        
			if(as == null)
	//*  51   87:aload_3         
	//*  52   88:ifnonnull       111
				as = "";
	//   53   91:ldc1            #191 <String "">
	//   54   93:astore_3        
			else
	//*  55   94:aload           11
	//*  56   96:iload           6
	//*  57   98:iconst_1        
	//*  58   99:iadd            
	//*  59  100:aload_3         
	//*  60  101:aastore         
	//*  61  102:iload           6
	//*  62  104:iconst_1        
	//*  63  105:iadd            
	//*  64  106:istore          6
	//*  65  108:goto            75
				as = ((String []) (((String) (as)).toLowerCase(Locale.ROOT)));
	//   66  111:aload_3         
	//   67  112:getstatic       #197 <Field Locale Locale.ROOT>
	//   68  115:invokevirtual   #201 <Method String String.toLowerCase(Locale)>
	//   69  118:astore_3        
			as1[i + 1] = ((String) (as));
			i++;
		}
	//*  70  119:goto            94
		boolean flag = false;
	//   71  122:iconst_0        
	//   72  123:istore          8
		pattern = ((Pattern) (pattern.matcher(((CharSequence) (spannable)))));
	//   73  125:aload_1         
	//   74  126:aload_0         
	//   75  127:invokevirtual   #207 <Method Matcher Pattern.matcher(CharSequence)>
	//   76  130:astore_1        
		do
		{
			flag1 = flag;
	//   77  131:iload           8
	//   78  133:istore          9
			if(!((Matcher) (pattern)).find())
				continue;
	//   79  135:aload_1         
	//   80  136:invokevirtual   #212 <Method boolean Matcher.find()>
	//   81  139:ifeq            21
			int j = ((Matcher) (pattern)).start();
	//   82  142:aload_1         
	//   83  143:invokevirtual   #214 <Method int Matcher.start()>
	//   84  146:istore          6
			int k = ((Matcher) (pattern)).end();
	//   85  148:aload_1         
	//   86  149:invokevirtual   #216 <Method int Matcher.end()>
	//   87  152:istore          7
			flag1 = true;
	//   88  154:iconst_1        
	//   89  155:istore          9
			if(matchfilter != null)
	//*  90  157:aload           4
	//*  91  159:ifnull          176
				flag1 = matchfilter.acceptMatch(((CharSequence) (spannable)), j, k);
	//   92  162:aload           4
	//   93  164:aload_0         
	//   94  165:iload           6
	//   95  167:iload           7
	//   96  169:invokeinterface #222 <Method boolean android.text.util.Linkify$MatchFilter.acceptMatch(CharSequence, int, int)>
	//   97  174:istore          9
			if(flag1)
	//*  98  176:iload           9
	//*  99  178:ifeq            131
			{
				applyLink(makeUrl(((Matcher) (pattern)).group(0), as1, ((Matcher) (pattern)), transformfilter), j, k, spannable);
	//  100  181:aload_1         
	//  101  182:iconst_0        
	//  102  183:invokevirtual   #226 <Method String Matcher.group(int)>
	//  103  186:aload           11
	//  104  188:aload_1         
	//  105  189:aload           5
	//  106  191:invokestatic    #230 <Method String makeUrl(String, String[], Matcher, android.text.util.Linkify$TransformFilter)>
	//  107  194:iload           6
	//  108  196:iload           7
	//  109  198:aload_0         
	//  110  199:invokestatic    #182 <Method void applyLink(String, int, int, Spannable)>
				flag = true;
	//  111  202:iconst_1        
	//  112  203:istore          8
			}
		} while(true);
	//  113  205:goto            131
		if(true) goto _L4; else goto _L3
_L3:
	}

	public static final boolean addLinks(TextView textview, int i)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(android.os.Build.VERSION.SDK_INT < 26) goto _L2; else goto _L1
	//    2    2:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//    3    5:bipush          26
	//    4    7:icmplt          18
_L1:
		boolean flag = Linkify.addLinks(textview, i);
	//    5   10:aload_0         
	//    6   11:iload_1         
	//    7   12:invokestatic    #233 <Method boolean Linkify.addLinks(TextView, int)>
	//    8   15:istore_2        
_L4:
		return flag;
	//    9   16:iload_2         
	//   10   17:ireturn         
_L2:
		Object obj;
		flag = flag1;
	//   11   18:iload_3         
	//   12   19:istore_2        
		if(i == 0)
			continue; /* Loop/switch isn't completed */
	//   13   20:iload_1         
	//   14   21:ifeq            16
		obj = ((Object) (textview.getText()));
	//   15   24:aload_0         
	//   16   25:invokevirtual   #77  <Method CharSequence TextView.getText()>
	//   17   28:astore          4
		if(!(obj instanceof Spannable))
			break; /* Loop/switch isn't completed */
	//   18   30:aload           4
	//   19   32:instanceof      #97  <Class Spannable>
	//   20   35:ifeq            58
		flag = flag1;
	//   21   38:iload_3         
	//   22   39:istore_2        
		if(addLinks((Spannable)obj, i))
	//*  23   40:aload           4
	//*  24   42:checkcast       #97  <Class Spannable>
	//*  25   45:iload_1         
	//*  26   46:invokestatic    #234 <Method boolean addLinks(Spannable, int)>
	//*  27   49:ifeq            16
		{
			addLinkMovementMethod(textview);
	//   28   52:aload_0         
	//   29   53:invokestatic    #92  <Method void addLinkMovementMethod(TextView)>
			return true;
	//   30   56:iconst_1        
	//   31   57:ireturn         
		}
		if(true) goto _L4; else goto _L3
_L3:
		obj = ((Object) (SpannableString.valueOf(((CharSequence) (obj)))));
	//   32   58:aload           4
	//   33   60:invokestatic    #83  <Method SpannableString SpannableString.valueOf(CharSequence)>
	//   34   63:astore          4
		flag = flag1;
	//   35   65:iload_3         
	//   36   66:istore_2        
		if(addLinks(((Spannable) (obj)), i))
	//*  37   67:aload           4
	//*  38   69:iload_1         
	//*  39   70:invokestatic    #234 <Method boolean addLinks(Spannable, int)>
	//*  40   73:ifeq            16
		{
			addLinkMovementMethod(textview);
	//   41   76:aload_0         
	//   42   77:invokestatic    #92  <Method void addLinkMovementMethod(TextView)>
			textview.setText(((CharSequence) (obj)));
	//   43   80:aload_0         
	//   44   81:aload           4
	//   45   83:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
			return true;
	//   46   86:iconst_1        
	//   47   87:ireturn         
		}
		if(true) goto _L4; else goto _L5
_L5:
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

	private static final void gatherMapLinks(ArrayList arraylist, Spannable spannable)
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
		try
		{
			s = WebView.findAddress(((String) (spannable)));
	//    5    7:aload_1         
	//    6    8:invokestatic    #262 <Method String WebView.findAddress(String)>
	//    7   11:astore          6
		}
	//*   8   13:aload           6
	//*   9   15:ifnull          130
	//*  10   18:aload_1         
	//*  11   19:aload           6
	//*  12   21:invokevirtual   #266 <Method int String.indexOf(String)>
	//*  13   24:istore_3        
	//*  14   25:iload_3         
	//*  15   26:ifge            30
	//*  16   29:return          
	//*  17   30:new             #8   <Class LinkifyCompat$LinkSpec>
	//*  18   33:dup             
	//*  19   34:invokespecial   #242 <Method void LinkifyCompat$LinkSpec()>
	//*  20   37:astore          5
	//*  21   39:iload_3         
	//*  22   40:aload           6
	//*  23   42:invokevirtual   #267 <Method int String.length()>
	//*  24   45:iadd            
	//*  25   46:istore          4
	//*  26   48:aload           5
	//*  27   50:iload_2         
	//*  28   51:iload_3         
	//*  29   52:iadd            
	//*  30   53:putfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//*  31   56:aload           5
	//*  32   58:iload_2         
	//*  33   59:iload           4
	//*  34   61:iadd            
	//*  35   62:putfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//*  36   65:aload_1         
	//*  37   66:iload           4
	//*  38   68:invokevirtual   #270 <Method String String.substring(int)>
	//*  39   71:astore_1        
	//*  40   72:iload_2         
	//*  41   73:iload           4
	//*  42   75:iadd            
	//*  43   76:istore_2        
	//*  44   77:aload           6
	//*  45   79:ldc2            #272 <String "UTF-8">
	//*  46   82:invokestatic    #278 <Method String URLEncoder.encode(String, String)>
	//*  47   85:astore          6
	//*  48   87:aload           5
	//*  49   89:new             #280 <Class StringBuilder>
	//*  50   92:dup             
	//*  51   93:invokespecial   #281 <Method void StringBuilder()>
	//*  52   96:ldc2            #283 <String "geo:0,0?q=">
	//*  53   99:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//*  54  102:aload           6
	//*  55  104:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//*  56  107:invokevirtual   #288 <Method String StringBuilder.toString()>
	//*  57  110:putfield        #172 <Field String LinkifyCompat$LinkSpec.url>
	//*  58  113:aload_0         
	//*  59  114:aload           5
	//*  60  116:invokevirtual   #246 <Method boolean ArrayList.add(Object)>
	//*  61  119:pop             
	//*  62  120:goto            7
		// Misplaced declaration of an exception variable
		catch(ArrayList arraylist)
	//*  63  123:astore_0        
		{
			return;
	//   64  124:return          
		}
		if(s == null)
			break; /* Loop/switch isn't completed */
		j = ((String) (spannable)).indexOf(s);
		if(j < 0)
			return;
		linkspec = new LinkSpec();
		k = j + s.length();
		linkspec.start = i + j;
		linkspec.end = i + k;
		spannable = ((Spannable) (((String) (spannable)).substring(k)));
		i += k;
		s = URLEncoder.encode(s, "UTF-8");
		linkspec.url = (new StringBuilder()).append("geo:0,0?q=").append(s).toString();
		arraylist.add(((Object) (linkspec)));
		continue; /* Loop/switch isn't completed */
		UnsupportedEncodingException unsupportedencodingexception;
		unsupportedencodingexception;
	//   65  125:astore          5
		if(true) goto _L2; else goto _L1
	//   66  127:goto            7
_L1:
	//   67  130:return          
	}

	private static String makeUrl(String s, String as[], Matcher matcher, android.text.util.Linkify.TransformFilter transformfilter)
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
		boolean flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore          6
		int i = 0;
	//   11   20:iconst_0        
	//   12   21:istore          4
		do
		{
label0:
			{
				boolean flag = flag1;
	//   13   23:iload           6
	//   14   25:istore          5
				s = s1;
	//   15   27:aload           7
	//   16   29:astore_0        
				if(i < as.length)
	//*  17   30:iload           4
	//*  18   32:aload_1         
	//*  19   33:arraylength     
	//*  20   34:icmpge          128
				{
					if(!s1.regionMatches(true, 0, as[i], 0, as[i].length()))
						break label0;
	//   21   37:aload           7
	//   22   39:iconst_1        
	//   23   40:iconst_0        
	//   24   41:aload_1         
	//   25   42:iload           4
	//   26   44:aaload          
	//   27   45:iconst_0        
	//   28   46:aload_1         
	//   29   47:iload           4
	//   30   49:aaload          
	//   31   50:invokevirtual   #267 <Method int String.length()>
	//   32   53:invokevirtual   #299 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//   33   56:ifeq            165
					boolean flag2 = true;
	//   34   59:iconst_1        
	//   35   60:istore          6
					flag = flag2;
	//   36   62:iload           6
	//   37   64:istore          5
					s = s1;
	//   38   66:aload           7
	//   39   68:astore_0        
					if(!s1.regionMatches(false, 0, as[i], 0, as[i].length()))
	//*  40   69:aload           7
	//*  41   71:iconst_0        
	//*  42   72:iconst_0        
	//*  43   73:aload_1         
	//*  44   74:iload           4
	//*  45   76:aaload          
	//*  46   77:iconst_0        
	//*  47   78:aload_1         
	//*  48   79:iload           4
	//*  49   81:aaload          
	//*  50   82:invokevirtual   #267 <Method int String.length()>
	//*  51   85:invokevirtual   #299 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//*  52   88:ifne            128
					{
						s = (new StringBuilder()).append(as[i]).append(s1.substring(as[i].length())).toString();
	//   53   91:new             #280 <Class StringBuilder>
	//   54   94:dup             
	//   55   95:invokespecial   #281 <Method void StringBuilder()>
	//   56   98:aload_1         
	//   57   99:iload           4
	//   58  101:aaload          
	//   59  102:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//   60  105:aload           7
	//   61  107:aload_1         
	//   62  108:iload           4
	//   63  110:aaload          
	//   64  111:invokevirtual   #267 <Method int String.length()>
	//   65  114:invokevirtual   #270 <Method String String.substring(int)>
	//   66  117:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//   67  120:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   68  123:astore_0        
						flag = flag2;
	//   69  124:iload           6
	//   70  126:istore          5
					}
				}
				matcher = ((Matcher) (s));
	//   71  128:aload_0         
	//   72  129:astore_2        
				if(!flag)
	//*  73  130:iload           5
	//*  74  132:ifne            163
				{
					matcher = ((Matcher) (s));
	//   75  135:aload_0         
	//   76  136:astore_2        
					if(as.length > 0)
	//*  77  137:aload_1         
	//*  78  138:arraylength     
	//*  79  139:ifle            163
						matcher = ((Matcher) ((new StringBuilder()).append(as[0]).append(s).toString()));
	//   80  142:new             #280 <Class StringBuilder>
	//   81  145:dup             
	//   82  146:invokespecial   #281 <Method void StringBuilder()>
	//   83  149:aload_1         
	//   84  150:iconst_0        
	//   85  151:aaload          
	//   86  152:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//   87  155:aload_0         
	//   88  156:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//   89  159:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   90  162:astore_2        
				}
				return ((String) (matcher));
	//   91  163:aload_2         
	//   92  164:areturn         
			}
			i++;
	//   93  165:iload           4
	//   94  167:iconst_1        
	//   95  168:iadd            
	//   96  169:istore          4
		} while(true);
	//   97  171:goto            23
	}

	private static final void pruneOverlaps(ArrayList arraylist, Spannable spannable)
	{
		int k;
		int l;
		URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokeinterface #101 <Method int Spannable.length()>
	//    4    8:ldc1            #103 <Class URLSpan>
	//    5   10:invokeinterface #107 <Method Object[] Spannable.getSpans(int, int, Class)>
	//    6   15:checkcast       #109 <Class URLSpan[]>
	//    7   18:astore          5
		for(int i = 0; i < aurlspan.length; i++)
	//*   8   20:iconst_0        
	//*   9   21:istore_2        
	//*  10   22:iload_2         
	//*  11   23:aload           5
	//*  12   25:arraylength     
	//*  13   26:icmpge          91
		{
			LinkSpec linkspec = new LinkSpec();
	//   14   29:new             #8   <Class LinkifyCompat$LinkSpec>
	//   15   32:dup             
	//   16   33:invokespecial   #242 <Method void LinkifyCompat$LinkSpec()>
	//   17   36:astore          6
			linkspec.frameworkAddedSpan = aurlspan[i];
	//   18   38:aload           6
	//   19   40:aload           5
	//   20   42:iload_2         
	//   21   43:aaload          
	//   22   44:putfield        #168 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
			linkspec.start = spannable.getSpanStart(((Object) (aurlspan[i])));
	//   23   47:aload           6
	//   24   49:aload_1         
	//   25   50:aload           5
	//   26   52:iload_2         
	//   27   53:aaload          
	//   28   54:invokeinterface #303 <Method int Spannable.getSpanStart(Object)>
	//   29   59:putfield        #175 <Field int LinkifyCompat$LinkSpec.start>
			linkspec.end = spannable.getSpanEnd(((Object) (aurlspan[i])));
	//   30   62:aload           6
	//   31   64:aload_1         
	//   32   65:aload           5
	//   33   67:iload_2         
	//   34   68:aaload          
	//   35   69:invokeinterface #306 <Method int Spannable.getSpanEnd(Object)>
	//   36   74:putfield        #178 <Field int LinkifyCompat$LinkSpec.end>
			arraylist.add(((Object) (linkspec)));
	//   37   77:aload_0         
	//   38   78:aload           6
	//   39   80:invokevirtual   #246 <Method boolean ArrayList.add(Object)>
	//   40   83:pop             
		}

	//   41   84:iload_2         
	//   42   85:iconst_1        
	//   43   86:iadd            
	//   44   87:istore_2        
	//*  45   88:goto            22
		Collections.sort(((java.util.List) (arraylist)), COMPARATOR);
	//   46   91:aload_0         
	//   47   92:getstatic       #28  <Field Comparator COMPARATOR>
	//   48   95:invokestatic    #312 <Method void Collections.sort(java.util.List, Comparator)>
		l = arraylist.size();
	//   49   98:aload_0         
	//   50   99:invokevirtual   #151 <Method int ArrayList.size()>
	//   51  102:istore          4
		k = 0;
	//   52  104:iconst_0        
	//   53  105:istore_3        
_L7:
		int j;
		Object obj;
		LinkSpec linkspec1;
		if(k >= l - 1)
			break; /* Loop/switch isn't completed */
	//   54  106:iload_3         
	//   55  107:iload           4
	//   56  109:iconst_1        
	//   57  110:isub            
	//   58  111:icmpge          296
		obj = ((Object) ((LinkSpec)arraylist.get(k)));
	//   59  114:aload_0         
	//   60  115:iload_3         
	//   61  116:invokevirtual   #316 <Method Object ArrayList.get(int)>
	//   62  119:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   63  122:astore          5
		linkspec1 = (LinkSpec)arraylist.get(k + 1);
	//   64  124:aload_0         
	//   65  125:iload_3         
	//   66  126:iconst_1        
	//   67  127:iadd            
	//   68  128:invokevirtual   #316 <Method Object ArrayList.get(int)>
	//   69  131:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   70  134:astore          6
		j = -1;
	//   71  136:iconst_m1       
	//   72  137:istore_2        
		if(((LinkSpec) (obj)).start > linkspec1.start || ((LinkSpec) (obj)).end <= linkspec1.start) goto _L2; else goto _L1
	//   73  138:aload           5
	//   74  140:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//   75  143:aload           6
	//   76  145:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//   77  148:icmpgt          289
	//   78  151:aload           5
	//   79  153:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//   80  156:aload           6
	//   81  158:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//   82  161:icmple          289
_L1:
		if(linkspec1.end > ((LinkSpec) (obj)).end) goto _L4; else goto _L3
	//   83  164:aload           6
	//   84  166:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//   85  169:aload           5
	//   86  171:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//   87  174:icmpgt          227
_L3:
		j = k + 1;
	//   88  177:iload_3         
	//   89  178:iconst_1        
	//   90  179:iadd            
	//   91  180:istore_2        
_L5:
		if(j == -1)
			break; /* Loop/switch isn't completed */
	//   92  181:iload_2         
	//   93  182:iconst_m1       
	//   94  183:icmpeq          289
		obj = ((Object) (((LinkSpec)arraylist.get(j)).frameworkAddedSpan));
	//   95  186:aload_0         
	//   96  187:iload_2         
	//   97  188:invokevirtual   #316 <Method Object ArrayList.get(int)>
	//   98  191:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   99  194:getfield        #168 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
	//  100  197:astore          5
		if(obj != null)
	//* 101  199:aload           5
	//* 102  201:ifnull          212
			spannable.removeSpan(obj);
	//  103  204:aload_1         
	//  104  205:aload           5
	//  105  207:invokeinterface #113 <Method void Spannable.removeSpan(Object)>
		arraylist.remove(j);
	//  106  212:aload_0         
	//  107  213:iload_2         
	//  108  214:invokevirtual   #319 <Method Object ArrayList.remove(int)>
	//  109  217:pop             
		l--;
	//  110  218:iload           4
	//  111  220:iconst_1        
	//  112  221:isub            
	//  113  222:istore          4
		continue; /* Loop/switch isn't completed */
	//  114  224:goto            106
_L4:
		if(((LinkSpec) (obj)).end - ((LinkSpec) (obj)).start > linkspec1.end - linkspec1.start)
	//* 115  227:aload           5
	//* 116  229:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 117  232:aload           5
	//* 118  234:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 119  237:isub            
	//* 120  238:aload           6
	//* 121  240:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 122  243:aload           6
	//* 123  245:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 124  248:isub            
	//* 125  249:icmple          259
			j = k + 1;
	//  126  252:iload_3         
	//  127  253:iconst_1        
	//  128  254:iadd            
	//  129  255:istore_2        
		else
	//* 130  256:goto            181
		if(((LinkSpec) (obj)).end - ((LinkSpec) (obj)).start < linkspec1.end - linkspec1.start)
	//* 131  259:aload           5
	//* 132  261:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 133  264:aload           5
	//* 134  266:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 135  269:isub            
	//* 136  270:aload           6
	//* 137  272:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 138  275:aload           6
	//* 139  277:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 140  280:isub            
	//* 141  281:icmpge          181
			j = k;
	//  142  284:iload_3         
	//  143  285:istore_2        
		if(true) goto _L5; else goto _L2
	//  144  286:goto            181
_L2:
		k++;
	//  145  289:iload_3         
	//  146  290:iconst_1        
	//  147  291:iadd            
	//  148  292:istore_3        
		if(true) goto _L7; else goto _L6
	//  149  293:goto            106
_L6:
	//  150  296:return          
	}

	private static final Comparator COMPARATOR = new Comparator() {

		public final int compare(LinkSpec linkspec, LinkSpec linkspec1)
		{
			if(linkspec.start >= linkspec1.start)
		//*   0    0:aload_1         
		//*   1    1:getfield        #22  <Field int LinkifyCompat$LinkSpec.start>
		//*   2    4:aload_2         
		//*   3    5:getfield        #22  <Field int LinkifyCompat$LinkSpec.start>
		//*   4    8:icmpge          13
		//*   5   11:iconst_m1       
		//*   6   12:ireturn         
			{
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
				if(linkspec.end <= linkspec1.end)
		//*  21   39:aload_1         
		//*  22   40:getfield        #25  <Field int LinkifyCompat$LinkSpec.end>
		//*  23   43:aload_2         
		//*  24   44:getfield        #25  <Field int LinkifyCompat$LinkSpec.end>
		//*  25   47:icmpgt          11
					return 0;
		//   26   50:iconst_0        
		//   27   51:ireturn         
			}
			return -1;
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
