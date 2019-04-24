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
		pattern = ((Pattern) (pattern.matcher(((CharSequence) (spannable)))));
	//   71  122:aload_1         
	//   72  123:aload_0         
	//   73  124:invokevirtual   #207 <Method Matcher Pattern.matcher(CharSequence)>
	//   74  127:astore_1        
		boolean flag = false;
	//   75  128:iconst_0        
	//   76  129:istore          8
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
			if(matchfilter != null)
	//*  88  154:aload           4
	//*  89  156:ifnull          205
				flag1 = matchfilter.acceptMatch(((CharSequence) (spannable)), j, k);
	//   90  159:aload           4
	//   91  161:aload_0         
	//   92  162:iload           6
	//   93  164:iload           7
	//   94  166:invokeinterface #222 <Method boolean android.text.util.Linkify$MatchFilter.acceptMatch(CharSequence, int, int)>
	//   95  171:istore          9
			else
	//*  96  173:iload           9
	//*  97  175:ifeq            131
	//*  98  178:aload_1         
	//*  99  179:iconst_0        
	//* 100  180:invokevirtual   #226 <Method String Matcher.group(int)>
	//* 101  183:aload           11
	//* 102  185:aload_1         
	//* 103  186:aload           5
	//* 104  188:invokestatic    #230 <Method String makeUrl(String, String[], Matcher, android.text.util.Linkify$TransformFilter)>
	//* 105  191:iload           6
	//* 106  193:iload           7
	//* 107  195:aload_0         
	//* 108  196:invokestatic    #182 <Method void applyLink(String, int, int, Spannable)>
	//* 109  199:iconst_1        
	//* 110  200:istore          8
	//* 111  202:goto            131
				flag1 = true;
	//  112  205:iconst_1        
	//  113  206:istore          9
			if(flag1)
			{
				applyLink(makeUrl(((Matcher) (pattern)).group(0), as1, ((Matcher) (pattern)), transformfilter), j, k, spannable);
				flag = true;
			}
		} while(true);
	//  114  208:goto            173
		if(true) goto _L4; else goto _L3
_L3:
	}

	public static final boolean addLinks(TextView textview, int i)
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
	//*  21   39:aload           6
	//*  22   41:invokevirtual   #267 <Method int String.length()>
	//*  23   44:iload_3         
	//*  24   45:iadd            
	//*  25   46:istore          4
	//*  26   48:aload           5
	//*  27   50:iload_3         
	//*  28   51:iload_2         
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
		k = s.length() + j;
		linkspec.start = j + i;
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
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		int i;
		boolean flag;
		if(transformfilter != null)
	//*   2    3:aload_3         
	//*   3    4:ifnull          164
			matcher = ((Matcher) (transformfilter.transformUrl(matcher, s)));
	//    4    7:aload_3         
	//    5    8:aload_2         
	//    6    9:aload_0         
	//    7   10:invokeinterface #295 <Method String android.text.util.Linkify$TransformFilter.transformUrl(Matcher, String)>
	//    8   15:astore_2        
		else
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:aload_1         
	//*  13   22:arraylength     
	//*  14   23:icmpge          156
	//*  15   26:aload_2         
	//*  16   27:iconst_1        
	//*  17   28:iconst_0        
	//*  18   29:aload_1         
	//*  19   30:iload           4
	//*  20   32:aaload          
	//*  21   33:iconst_0        
	//*  22   34:aload_1         
	//*  23   35:iload           4
	//*  24   37:aaload          
	//*  25   38:invokevirtual   #267 <Method int String.length()>
	//*  26   41:invokevirtual   #299 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//*  27   44:ifeq            147
	//*  28   47:aload_2         
	//*  29   48:astore_0        
	//*  30   49:iload           6
	//*  31   51:istore          5
	//*  32   53:aload_2         
	//*  33   54:iconst_0        
	//*  34   55:iconst_0        
	//*  35   56:aload_1         
	//*  36   57:iload           4
	//*  37   59:aaload          
	//*  38   60:iconst_0        
	//*  39   61:aload_1         
	//*  40   62:iload           4
	//*  41   64:aaload          
	//*  42   65:invokevirtual   #267 <Method int String.length()>
	//*  43   68:invokevirtual   #299 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//*  44   71:ifne            110
	//*  45   74:new             #280 <Class StringBuilder>
	//*  46   77:dup             
	//*  47   78:invokespecial   #281 <Method void StringBuilder()>
	//*  48   81:aload_1         
	//*  49   82:iload           4
	//*  50   84:aaload          
	//*  51   85:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//*  52   88:aload_2         
	//*  53   89:aload_1         
	//*  54   90:iload           4
	//*  55   92:aaload          
	//*  56   93:invokevirtual   #267 <Method int String.length()>
	//*  57   96:invokevirtual   #270 <Method String String.substring(int)>
	//*  58   99:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//*  59  102:invokevirtual   #288 <Method String StringBuilder.toString()>
	//*  60  105:astore_0        
	//*  61  106:iload           6
	//*  62  108:istore          5
	//*  63  110:aload_0         
	//*  64  111:astore_2        
	//*  65  112:iload           5
	//*  66  114:ifne            145
	//*  67  117:aload_0         
	//*  68  118:astore_2        
	//*  69  119:aload_1         
	//*  70  120:arraylength     
	//*  71  121:ifle            145
	//*  72  124:new             #280 <Class StringBuilder>
	//*  73  127:dup             
	//*  74  128:invokespecial   #281 <Method void StringBuilder()>
	//*  75  131:aload_1         
	//*  76  132:iconst_0        
	//*  77  133:aaload          
	//*  78  134:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//*  79  137:aload_0         
	//*  80  138:invokevirtual   #287 <Method StringBuilder StringBuilder.append(String)>
	//*  81  141:invokevirtual   #288 <Method String StringBuilder.toString()>
	//*  82  144:astore_2        
	//*  83  145:aload_2         
	//*  84  146:areturn         
	//*  85  147:iload           4
	//*  86  149:iconst_1        
	//*  87  150:iadd            
	//*  88  151:istore          4
	//*  89  153:goto            19
	//*  90  156:iconst_0        
	//*  91  157:istore          5
	//*  92  159:aload_2         
	//*  93  160:astore_0        
	//*  94  161:goto            110
			matcher = ((Matcher) (s));
	//   95  164:aload_0         
	//   96  165:astore_2        
		i = 0;
		if(i >= as.length)
			break MISSING_BLOCK_LABEL_156;
		if(!((String) (matcher)).regionMatches(true, 0, as[i], 0, as[i].length())) goto _L2; else goto _L1
_L1:
		s = ((String) (matcher));
		flag = flag1;
		if(!((String) (matcher)).regionMatches(false, 0, as[i], 0, as[i].length()))
		{
			s = (new StringBuilder()).append(as[i]).append(((String) (matcher)).substring(as[i].length())).toString();
			flag = flag1;
		}
_L4:
		matcher = ((Matcher) (s));
		if(!flag)
		{
			matcher = ((Matcher) (s));
			if(as.length > 0)
				matcher = ((Matcher) ((new StringBuilder()).append(as[0]).append(s).toString()));
		}
		return ((String) (matcher));
_L2:
		i++;
		break MISSING_BLOCK_LABEL_19;
		flag = false;
		s = ((String) (matcher));
		if(true) goto _L4; else goto _L3
_L3:
	//*  97  166:goto            16
	}

	private static final void pruneOverlaps(ArrayList arraylist, Spannable spannable)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:aload_1         
	//    5    5:invokeinterface #101 <Method int Spannable.length()>
	//    6   10:ldc1            #103 <Class URLSpan>
	//    7   12:invokeinterface #107 <Method Object[] Spannable.getSpans(int, int, Class)>
	//    8   17:checkcast       #109 <Class URLSpan[]>
	//    9   20:astore          5
		for(int i = 0; i < aurlspan.length; i++)
	//*  10   22:iconst_0        
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:aload           5
	//*  14   27:arraylength     
	//*  15   28:icmpge          93
		{
			LinkSpec linkspec = new LinkSpec();
	//   16   31:new             #8   <Class LinkifyCompat$LinkSpec>
	//   17   34:dup             
	//   18   35:invokespecial   #242 <Method void LinkifyCompat$LinkSpec()>
	//   19   38:astore          6
			linkspec.frameworkAddedSpan = aurlspan[i];
	//   20   40:aload           6
	//   21   42:aload           5
	//   22   44:iload_2         
	//   23   45:aaload          
	//   24   46:putfield        #168 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
			linkspec.start = spannable.getSpanStart(((Object) (aurlspan[i])));
	//   25   49:aload           6
	//   26   51:aload_1         
	//   27   52:aload           5
	//   28   54:iload_2         
	//   29   55:aaload          
	//   30   56:invokeinterface #303 <Method int Spannable.getSpanStart(Object)>
	//   31   61:putfield        #175 <Field int LinkifyCompat$LinkSpec.start>
			linkspec.end = spannable.getSpanEnd(((Object) (aurlspan[i])));
	//   32   64:aload           6
	//   33   66:aload_1         
	//   34   67:aload           5
	//   35   69:iload_2         
	//   36   70:aaload          
	//   37   71:invokeinterface #306 <Method int Spannable.getSpanEnd(Object)>
	//   38   76:putfield        #178 <Field int LinkifyCompat$LinkSpec.end>
			arraylist.add(((Object) (linkspec)));
	//   39   79:aload_0         
	//   40   80:aload           6
	//   41   82:invokevirtual   #246 <Method boolean ArrayList.add(Object)>
	//   42   85:pop             
		}

	//   43   86:iload_2         
	//   44   87:iconst_1        
	//   45   88:iadd            
	//   46   89:istore_2        
	//*  47   90:goto            24
		Collections.sort(((java.util.List) (arraylist)), COMPARATOR);
	//   48   93:aload_0         
	//   49   94:getstatic       #28  <Field Comparator COMPARATOR>
	//   50   97:invokestatic    #312 <Method void Collections.sort(java.util.List, Comparator)>
		int l = arraylist.size();
	//   51  100:aload_0         
	//   52  101:invokevirtual   #151 <Method int ArrayList.size()>
	//   53  104:istore          4
		do
		{
			if(k >= l - 1)
				break;
	//   54  106:iload_3         
	//   55  107:iload           4
	//   56  109:iconst_1        
	//   57  110:isub            
	//   58  111:icmpge          294
			Object obj = ((Object) ((LinkSpec)arraylist.get(k)));
	//   59  114:aload_0         
	//   60  115:iload_3         
	//   61  116:invokevirtual   #316 <Method Object ArrayList.get(int)>
	//   62  119:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   63  122:astore          5
			LinkSpec linkspec1 = (LinkSpec)arraylist.get(k + 1);
	//   64  124:aload_0         
	//   65  125:iload_3         
	//   66  126:iconst_1        
	//   67  127:iadd            
	//   68  128:invokevirtual   #316 <Method Object ArrayList.get(int)>
	//   69  131:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   70  134:astore          6
			if(((LinkSpec) (obj)).start <= linkspec1.start && ((LinkSpec) (obj)).end > linkspec1.start)
	//*  71  136:aload           5
	//*  72  138:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//*  73  141:aload           6
	//*  74  143:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//*  75  146:icmpgt          287
	//*  76  149:aload           5
	//*  77  151:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//*  78  154:aload           6
	//*  79  156:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//*  80  159:icmple          287
			{
				int j;
				if(linkspec1.end <= ((LinkSpec) (obj)).end)
	//*  81  162:aload           6
	//*  82  164:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//*  83  167:aload           5
	//*  84  169:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//*  85  172:icmpgt          225
					j = k + 1;
	//   86  175:iload_3         
	//   87  176:iconst_1        
	//   88  177:iadd            
	//   89  178:istore_2        
				else
	//*  90  179:iload_2         
	//*  91  180:iconst_m1       
	//*  92  181:icmpeq          287
	//*  93  184:aload_0         
	//*  94  185:iload_2         
	//*  95  186:invokevirtual   #316 <Method Object ArrayList.get(int)>
	//*  96  189:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//*  97  192:getfield        #168 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
	//*  98  195:astore          5
	//*  99  197:aload           5
	//* 100  199:ifnull          210
	//* 101  202:aload_1         
	//* 102  203:aload           5
	//* 103  205:invokeinterface #113 <Method void Spannable.removeSpan(Object)>
	//* 104  210:aload_0         
	//* 105  211:iload_2         
	//* 106  212:invokevirtual   #319 <Method Object ArrayList.remove(int)>
	//* 107  215:pop             
	//* 108  216:iload           4
	//* 109  218:iconst_1        
	//* 110  219:isub            
	//* 111  220:istore          4
	//* 112  222:goto            106
				if(((LinkSpec) (obj)).end - ((LinkSpec) (obj)).start > linkspec1.end - linkspec1.start)
	//* 113  225:aload           5
	//* 114  227:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 115  230:aload           5
	//* 116  232:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 117  235:isub            
	//* 118  236:aload           6
	//* 119  238:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 120  241:aload           6
	//* 121  243:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 122  246:isub            
	//* 123  247:icmple          257
					j = k + 1;
	//  124  250:iload_3         
	//  125  251:iconst_1        
	//  126  252:iadd            
	//  127  253:istore_2        
				else
	//* 128  254:goto            179
				if(((LinkSpec) (obj)).end - ((LinkSpec) (obj)).start < linkspec1.end - linkspec1.start)
	//* 129  257:aload           5
	//* 130  259:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 131  262:aload           5
	//* 132  264:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 133  267:isub            
	//* 134  268:aload           6
	//* 135  270:getfield        #178 <Field int LinkifyCompat$LinkSpec.end>
	//* 136  273:aload           6
	//* 137  275:getfield        #175 <Field int LinkifyCompat$LinkSpec.start>
	//* 138  278:isub            
	//* 139  279:icmpge          295
					j = k;
	//  140  282:iload_3         
	//  141  283:istore_2        
				else
	//* 142  284:goto            179
	//* 143  287:iload_3         
	//* 144  288:iconst_1        
	//* 145  289:iadd            
	//* 146  290:istore_3        
	//* 147  291:goto            106
	//* 148  294:return          
					j = -1;
	//  149  295:iconst_m1       
	//  150  296:istore_2        
				if(j != -1)
				{
					obj = ((Object) (((LinkSpec)arraylist.get(j)).frameworkAddedSpan));
					if(obj != null)
						spannable.removeSpan(obj);
					arraylist.remove(j);
					l--;
					continue;
				}
			}
			k++;
		} while(true);
	//* 151  297:goto            179
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
