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

// Referenced classes of package android.support.v4.text.util:
//			FindAddress

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
		if(shouldAddLinksFallbackToFramework())
	//*   0    0:invokestatic    #59  <Method boolean shouldAddLinksFallbackToFramework()>
	//*   1    3:ifeq            13
		{
			Linkify.addLinks(textview, pattern, s);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokestatic    #63  <Method void Linkify.addLinks(TextView, Pattern, String)>
			return;
	//    6   12:return          
		} else
		{
			addLinks(textview, pattern, s, ((String []) (null)), ((android.text.util.Linkify.MatchFilter) (null)), ((android.text.util.Linkify.TransformFilter) (null)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aconst_null     
	//   11   17:aconst_null     
	//   12   18:aconst_null     
	//   13   19:invokestatic    #66  <Method void addLinks(TextView, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
			return;
	//   14   22:return          
		}
	}

	public static void addLinks(TextView textview, Pattern pattern, String s, android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		if(shouldAddLinksFallbackToFramework())
	//*   0    0:invokestatic    #59  <Method boolean shouldAddLinksFallbackToFramework()>
	//*   1    3:ifeq            16
		{
			Linkify.addLinks(textview, pattern, s, matchfilter, transformfilter);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:invokestatic    #69  <Method void Linkify.addLinks(TextView, Pattern, String, android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
			return;
	//    8   15:return          
		} else
		{
			addLinks(textview, pattern, s, ((String []) (null)), matchfilter, transformfilter);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:aconst_null     
	//   13   20:aload_3         
	//   14   21:aload           4
	//   15   23:invokestatic    #66  <Method void addLinks(TextView, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
			return;
	//   16   26:return          
		}
	}

	public static void addLinks(TextView textview, Pattern pattern, String s, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		if(shouldAddLinksFallbackToFramework())
	//*   0    0:invokestatic    #59  <Method boolean shouldAddLinksFallbackToFramework()>
	//*   1    3:ifeq            18
		{
			Linkify.addLinks(textview, pattern, s, as, matchfilter, transformfilter);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aload           5
	//    8   14:invokestatic    #73  <Method void Linkify.addLinks(TextView, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
			return;
	//    9   17:return          
		}
		SpannableString spannablestring = SpannableString.valueOf(textview.getText());
	//   10   18:aload_0         
	//   11   19:invokevirtual   #77  <Method CharSequence TextView.getText()>
	//   12   22:invokestatic    #83  <Method SpannableString SpannableString.valueOf(CharSequence)>
	//   13   25:astore          6
		if(addLinks(((Spannable) (spannablestring)), pattern, s, as, matchfilter, transformfilter))
	//*  14   27:aload           6
	//*  15   29:aload_1         
	//*  16   30:aload_2         
	//*  17   31:aload_3         
	//*  18   32:aload           4
	//*  19   34:aload           5
	//*  20   36:invokestatic    #86  <Method boolean addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//*  21   39:ifeq            52
		{
			textview.setText(((CharSequence) (spannablestring)));
	//   22   42:aload_0         
	//   23   43:aload           6
	//   24   45:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
			addLinkMovementMethod(textview);
	//   25   48:aload_0         
	//   26   49:invokestatic    #92  <Method void addLinkMovementMethod(TextView)>
		}
	//   27   52:return          
	}

	public static boolean addLinks(Spannable spannable, int i)
	{
		if(shouldAddLinksFallbackToFramework())
	//*   0    0:invokestatic    #59  <Method boolean shouldAddLinksFallbackToFramework()>
	//*   1    3:ifeq            12
			return Linkify.addLinks(spannable, i);
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:invokestatic    #96  <Method boolean Linkify.addLinks(Spannable, int)>
	//    5   11:ireturn         
		if(i == 0)
	//*   6   12:iload_1         
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:aload_0         
	//   13   21:invokeinterface #102 <Method int Spannable.length()>
	//   14   26:ldc1            #104 <Class URLSpan>
	//   15   28:invokeinterface #108 <Method Object[] Spannable.getSpans(int, int, Class)>
	//   16   33:checkcast       #110 <Class URLSpan[]>
	//   17   36:astore_3        
		for(int j = aurlspan.length - 1; j >= 0; j--)
	//*  18   37:aload_3         
	//*  19   38:arraylength     
	//*  20   39:iconst_1        
	//*  21   40:isub            
	//*  22   41:istore_2        
	//*  23   42:iload_2         
	//*  24   43:iflt            62
			spannable.removeSpan(((Object) (aurlspan[j])));
	//   25   46:aload_0         
	//   26   47:aload_3         
	//   27   48:iload_2         
	//   28   49:aaload          
	//   29   50:invokeinterface #114 <Method void Spannable.removeSpan(Object)>

	//   30   55:iload_2         
	//   31   56:iconst_1        
	//   32   57:isub            
	//   33   58:istore_2        
	//*  34   59:goto            42
		if((i & 4) != 0)
	//*  35   62:iload_1         
	//*  36   63:iconst_4        
	//*  37   64:iand            
	//*  38   65:ifeq            74
			Linkify.addLinks(spannable, 4);
	//   39   68:aload_0         
	//   40   69:iconst_4        
	//   41   70:invokestatic    #96  <Method boolean Linkify.addLinks(Spannable, int)>
	//   42   73:pop             
		Object obj = ((Object) (new ArrayList()));
	//   43   74:new             #116 <Class ArrayList>
	//   44   77:dup             
	//   45   78:invokespecial   #117 <Method void ArrayList()>
	//   46   81:astore_3        
		if((i & 1) != 0)
	//*  47   82:iload_1         
	//*  48   83:iconst_1        
	//*  49   84:iand            
	//*  50   85:ifeq            127
		{
			Pattern pattern = PatternsCompat.AUTOLINK_WEB_URL;
	//   51   88:getstatic       #123 <Field Pattern PatternsCompat.AUTOLINK_WEB_URL>
	//   52   91:astore          4
			android.text.util.Linkify.MatchFilter matchfilter = Linkify.sUrlMatchFilter;
	//   53   93:getstatic       #127 <Field android.text.util.Linkify$MatchFilter Linkify.sUrlMatchFilter>
	//   54   96:astore          5
			gatherLinks(((ArrayList) (obj)), spannable, pattern, new String[] {
				"http://", "https://", "rtsp://"
			}, matchfilter, ((android.text.util.Linkify.TransformFilter) (null)));
	//   55   98:aload_3         
	//   56   99:aload_0         
	//   57  100:aload           4
	//   58  102:iconst_3        
	//   59  103:anewarray       String[]
	//   60  106:dup             
	//   61  107:iconst_0        
	//   62  108:ldc1            #129 <String "http://">
	//   63  110:aastore         
	//   64  111:dup             
	//   65  112:iconst_1        
	//   66  113:ldc1            #131 <String "https://">
	//   67  115:aastore         
	//   68  116:dup             
	//   69  117:iconst_2        
	//   70  118:ldc1            #133 <String "rtsp://">
	//   71  120:aastore         
	//   72  121:aload           5
	//   73  123:aconst_null     
	//   74  124:invokestatic    #137 <Method void gatherLinks(ArrayList, Spannable, Pattern, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
		}
		if((i & 2) != 0)
	//*  75  127:iload_1         
	//*  76  128:iconst_2        
	//*  77  129:iand            
	//*  78  130:ifeq            152
			gatherLinks(((ArrayList) (obj)), spannable, PatternsCompat.AUTOLINK_EMAIL_ADDRESS, new String[] {
				"mailto:"
			}, ((android.text.util.Linkify.MatchFilter) (null)), ((android.text.util.Linkify.TransformFilter) (null)));
	//   79  133:aload_3         
	//   80  134:aload_0         
	//   81  135:getstatic       #140 <Field Pattern PatternsCompat.AUTOLINK_EMAIL_ADDRESS>
	//   82  138:iconst_1        
	//   83  139:anewarray       String[]
	//   84  142:dup             
	//   85  143:iconst_0        
	//   86  144:ldc1            #142 <String "mailto:">
	//   87  146:aastore         
	//   88  147:aconst_null     
	//   89  148:aconst_null     
	//   90  149:invokestatic    #137 <Method void gatherLinks(ArrayList, Spannable, Pattern, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
		if((i & 8) != 0)
	//*  91  152:iload_1         
	//*  92  153:bipush          8
	//*  93  155:iand            
	//*  94  156:ifeq            164
			gatherMapLinks(((ArrayList) (obj)), spannable);
	//   95  159:aload_3         
	//   96  160:aload_0         
	//   97  161:invokestatic    #146 <Method void gatherMapLinks(ArrayList, Spannable)>
		pruneOverlaps(((ArrayList) (obj)), spannable);
	//   98  164:aload_3         
	//   99  165:aload_0         
	//  100  166:invokestatic    #149 <Method void pruneOverlaps(ArrayList, Spannable)>
		if(((ArrayList) (obj)).size() == 0)
	//* 101  169:aload_3         
	//* 102  170:invokevirtual   #152 <Method int ArrayList.size()>
	//* 103  173:ifne            178
			return false;
	//  104  176:iconst_0        
	//  105  177:ireturn         
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//  106  178:aload_3         
	//  107  179:invokevirtual   #156 <Method Iterator ArrayList.iterator()>
	//  108  182:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//  109  183:aload_3         
	//  110  184:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//  111  189:ifeq            233
			LinkSpec linkspec = (LinkSpec)((Iterator) (obj)).next();
	//  112  192:aload_3         
	//  113  193:invokeinterface #165 <Method Object Iterator.next()>
	//  114  198:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//  115  201:astore          4
			if(linkspec.frameworkAddedSpan == null)
	//* 116  203:aload           4
	//* 117  205:getfield        #169 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
	//* 118  208:ifnonnull       183
				applyLink(linkspec.url, linkspec.start, linkspec.end, spannable);
	//  119  211:aload           4
	//  120  213:getfield        #173 <Field String LinkifyCompat$LinkSpec.url>
	//  121  216:aload           4
	//  122  218:getfield        #177 <Field int LinkifyCompat$LinkSpec.start>
	//  123  221:aload           4
	//  124  223:getfield        #180 <Field int LinkifyCompat$LinkSpec.end>
	//  125  226:aload_0         
	//  126  227:invokestatic    #184 <Method void applyLink(String, int, int, Spannable)>
		} while(true);
	//  127  230:goto            183
		return true;
	//  128  233:iconst_1        
	//  129  234:ireturn         
	}

	public static boolean addLinks(Spannable spannable, Pattern pattern, String s)
	{
		if(shouldAddLinksFallbackToFramework())
	//*   0    0:invokestatic    #59  <Method boolean shouldAddLinksFallbackToFramework()>
	//*   1    3:ifeq            13
			return Linkify.addLinks(spannable, pattern, s);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokestatic    #187 <Method boolean Linkify.addLinks(Spannable, Pattern, String)>
	//    6   12:ireturn         
		else
			return addLinks(spannable, pattern, s, ((String []) (null)), ((android.text.util.Linkify.MatchFilter) (null)), ((android.text.util.Linkify.TransformFilter) (null)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aconst_null     
	//   11   17:aconst_null     
	//   12   18:aconst_null     
	//   13   19:invokestatic    #86  <Method boolean addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//   14   22:ireturn         
	}

	public static boolean addLinks(Spannable spannable, Pattern pattern, String s, android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		if(shouldAddLinksFallbackToFramework())
	//*   0    0:invokestatic    #59  <Method boolean shouldAddLinksFallbackToFramework()>
	//*   1    3:ifeq            16
			return Linkify.addLinks(spannable, pattern, s, matchfilter, transformfilter);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:invokestatic    #190 <Method boolean Linkify.addLinks(Spannable, Pattern, String, android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//    8   15:ireturn         
		else
			return addLinks(spannable, pattern, s, ((String []) (null)), matchfilter, transformfilter);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:aconst_null     
	//   13   20:aload_3         
	//   14   21:aload           4
	//   15   23:invokestatic    #86  <Method boolean addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//   16   26:ireturn         
	}

	public static boolean addLinks(Spannable spannable, Pattern pattern, String s, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		String s1;
label0:
		{
			if(shouldAddLinksFallbackToFramework())
	//*   0    0:invokestatic    #59  <Method boolean shouldAddLinksFallbackToFramework()>
	//*   1    3:ifeq            18
				return Linkify.addLinks(spannable, pattern, s, as, matchfilter, transformfilter);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aload           5
	//    8   14:invokestatic    #191 <Method boolean Linkify.addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//    9   17:ireturn         
			s1 = s;
	//   10   18:aload_2         
	//   11   19:astore          10
			if(s == null)
	//*  12   21:aload_2         
	//*  13   22:ifnonnull       29
				s1 = "";
	//   14   25:ldc1            #193 <String "">
	//   15   27:astore          10
			if(as != null)
	//*  16   29:aload_3         
	//*  17   30:ifnull          41
			{
				s = ((String) (as));
	//   18   33:aload_3         
	//   19   34:astore_2        
				if(as.length >= 1)
					break label0;
	//   20   35:aload_3         
	//   21   36:arraylength     
	//   22   37:iconst_1        
	//   23   38:icmpge          45
			}
			s = ((String) (EMPTY_STRING));
	//   24   41:getstatic       #23  <Field String[] EMPTY_STRING>
	//   25   44:astore_2        
		}
		String as1[] = new String[s.length + 1];
	//   26   45:aload_2         
	//   27   46:arraylength     
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:anewarray       String[]
	//   31   52:astore          11
		as1[0] = s1.toLowerCase(Locale.ROOT);
	//   32   54:aload           11
	//   33   56:iconst_0        
	//   34   57:aload           10
	//   35   59:getstatic       #199 <Field Locale Locale.ROOT>
	//   36   62:invokevirtual   #203 <Method String String.toLowerCase(Locale)>
	//   37   65:aastore         
		for(int i = 0; i < s.length;)
	//*  38   66:iconst_0        
	//*  39   67:istore          6
	//*  40   69:iload           6
	//*  41   71:aload_2         
	//*  42   72:arraylength     
	//*  43   73:icmpge          114
		{
			as = ((String []) (s[i]));
	//   44   76:aload_2         
	//   45   77:iload           6
	//   46   79:aaload          
	//   47   80:astore_3        
			i++;
	//   48   81:iload           6
	//   49   83:iconst_1        
	//   50   84:iadd            
	//   51   85:istore          6
			if(as == null)
	//*  52   87:aload_3         
	//*  53   88:ifnonnull       97
				as = "";
	//   54   91:ldc1            #193 <String "">
	//   55   93:astore_3        
			else
	//*  56   94:goto            105
				as = ((String []) (((String) (as)).toLowerCase(Locale.ROOT)));
	//   57   97:aload_3         
	//   58   98:getstatic       #199 <Field Locale Locale.ROOT>
	//   59  101:invokevirtual   #203 <Method String String.toLowerCase(Locale)>
	//   60  104:astore_3        
			as1[i] = ((String) (as));
	//   61  105:aload           11
	//   62  107:iload           6
	//   63  109:aload_3         
	//   64  110:aastore         
		}

	//*  65  111:goto            69
		pattern = ((Pattern) (pattern.matcher(((CharSequence) (spannable)))));
	//   66  114:aload_1         
	//   67  115:aload_0         
	//   68  116:invokevirtual   #209 <Method Matcher Pattern.matcher(CharSequence)>
	//   69  119:astore_1        
		boolean flag = false;
	//   70  120:iconst_0        
	//   71  121:istore          8
		do
		{
			if(!((Matcher) (pattern)).find())
				break;
	//   72  123:aload_1         
	//   73  124:invokevirtual   #214 <Method boolean Matcher.find()>
	//   74  127:ifeq            199
			int j = ((Matcher) (pattern)).start();
	//   75  130:aload_1         
	//   76  131:invokevirtual   #216 <Method int Matcher.start()>
	//   77  134:istore          6
			int k = ((Matcher) (pattern)).end();
	//   78  136:aload_1         
	//   79  137:invokevirtual   #218 <Method int Matcher.end()>
	//   80  140:istore          7
			boolean flag1;
			if(matchfilter != null)
	//*  81  142:aload           4
	//*  82  144:ifnull          164
				flag1 = matchfilter.acceptMatch(((CharSequence) (spannable)), j, k);
	//   83  147:aload           4
	//   84  149:aload_0         
	//   85  150:iload           6
	//   86  152:iload           7
	//   87  154:invokeinterface #224 <Method boolean android.text.util.Linkify$MatchFilter.acceptMatch(CharSequence, int, int)>
	//   88  159:istore          9
			else
	//*  89  161:goto            167
				flag1 = true;
	//   90  164:iconst_1        
	//   91  165:istore          9
			if(flag1)
	//*  92  167:iload           9
	//*  93  169:ifeq            123
			{
				applyLink(makeUrl(((Matcher) (pattern)).group(0), as1, ((Matcher) (pattern)), transformfilter), j, k, spannable);
	//   94  172:aload_1         
	//   95  173:iconst_0        
	//   96  174:invokevirtual   #228 <Method String Matcher.group(int)>
	//   97  177:aload           11
	//   98  179:aload_1         
	//   99  180:aload           5
	//  100  182:invokestatic    #232 <Method String makeUrl(String, String[], Matcher, android.text.util.Linkify$TransformFilter)>
	//  101  185:iload           6
	//  102  187:iload           7
	//  103  189:aload_0         
	//  104  190:invokestatic    #184 <Method void applyLink(String, int, int, Spannable)>
				flag = true;
	//  105  193:iconst_1        
	//  106  194:istore          8
			}
		} while(true);
	//  107  196:goto            123
		return flag;
	//  108  199:iload           8
	//  109  201:ireturn         
	}

	public static boolean addLinks(TextView textview, int i)
	{
		if(shouldAddLinksFallbackToFramework())
	//*   0    0:invokestatic    #59  <Method boolean shouldAddLinksFallbackToFramework()>
	//*   1    3:ifeq            12
			return Linkify.addLinks(textview, i);
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:invokestatic    #235 <Method boolean Linkify.addLinks(TextView, int)>
	//    5   11:ireturn         
		if(i == 0)
	//*   6   12:iload_1         
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		Object obj = ((Object) (textview.getText()));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #77  <Method CharSequence TextView.getText()>
	//   12   22:astore_2        
		if(obj instanceof Spannable)
	//*  13   23:aload_2         
	//*  14   24:instanceof      #98  <Class Spannable>
	//*  15   27:ifeq            49
			if(addLinks((Spannable)obj, i))
	//*  16   30:aload_2         
	//*  17   31:checkcast       #98  <Class Spannable>
	//*  18   34:iload_1         
	//*  19   35:invokestatic    #236 <Method boolean addLinks(Spannable, int)>
	//*  20   38:ifeq            47
			{
				addLinkMovementMethod(textview);
	//   21   41:aload_0         
	//   22   42:invokestatic    #92  <Method void addLinkMovementMethod(TextView)>
				return true;
	//   23   45:iconst_1        
	//   24   46:ireturn         
			} else
			{
				return false;
	//   25   47:iconst_0        
	//   26   48:ireturn         
			}
		obj = ((Object) (SpannableString.valueOf(((CharSequence) (obj)))));
	//   27   49:aload_2         
	//   28   50:invokestatic    #83  <Method SpannableString SpannableString.valueOf(CharSequence)>
	//   29   53:astore_2        
		if(addLinks(((Spannable) (obj)), i))
	//*  30   54:aload_2         
	//*  31   55:iload_1         
	//*  32   56:invokestatic    #236 <Method boolean addLinks(Spannable, int)>
	//*  33   59:ifeq            73
		{
			addLinkMovementMethod(textview);
	//   34   62:aload_0         
	//   35   63:invokestatic    #92  <Method void addLinkMovementMethod(TextView)>
			textview.setText(((CharSequence) (obj)));
	//   36   66:aload_0         
	//   37   67:aload_2         
	//   38   68:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
			return true;
	//   39   71:iconst_1        
	//   40   72:ireturn         
		} else
		{
			return false;
	//   41   73:iconst_0        
	//   42   74:ireturn         
		}
	}

	private static void applyLink(String s, int i, int j, Spannable spannable)
	{
		spannable.setSpan(((Object) (new URLSpan(s))), i, j, 33);
	//    0    0:aload_3         
	//    1    1:new             #104 <Class URLSpan>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #239 <Method void URLSpan(String)>
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:bipush          33
	//    8   13:invokeinterface #243 <Method void Spannable.setSpan(Object, int, int, int)>
	//    9   18:return          
	}

	private static String findAddress(String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #250 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return WebView.findAddress(s);
	//    3    8:aload_0         
	//    4    9:invokestatic    #254 <Method String WebView.findAddress(String)>
	//    5   12:areturn         
		else
			return FindAddress.findAddress(s);
	//    6   13:aload_0         
	//    7   14:invokestatic    #257 <Method String FindAddress.findAddress(String)>
	//    8   17:areturn         
	}

	private static void gatherLinks(ArrayList arraylist, Spannable spannable, Pattern pattern, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		pattern = ((Pattern) (pattern.matcher(((CharSequence) (spannable)))));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #209 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    5:astore_2        
		do
		{
			if(!((Matcher) (pattern)).find())
				break;
	//    4    6:aload_2         
	//    5    7:invokevirtual   #214 <Method boolean Matcher.find()>
	//    6   10:ifeq            95
			int i = ((Matcher) (pattern)).start();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #216 <Method int Matcher.start()>
	//    9   17:istore          6
			int j = ((Matcher) (pattern)).end();
	//   10   19:aload_2         
	//   11   20:invokevirtual   #218 <Method int Matcher.end()>
	//   12   23:istore          7
			if(matchfilter == null || matchfilter.acceptMatch(((CharSequence) (spannable)), i, j))
	//*  13   25:aload           4
	//*  14   27:ifnull          45
	//*  15   30:aload           4
	//*  16   32:aload_1         
	//*  17   33:iload           6
	//*  18   35:iload           7
	//*  19   37:invokeinterface #224 <Method boolean android.text.util.Linkify$MatchFilter.acceptMatch(CharSequence, int, int)>
	//*  20   42:ifeq            6
			{
				LinkSpec linkspec = new LinkSpec();
	//   21   45:new             #8   <Class LinkifyCompat$LinkSpec>
	//   22   48:dup             
	//   23   49:invokespecial   #258 <Method void LinkifyCompat$LinkSpec()>
	//   24   52:astore          8
				linkspec.url = makeUrl(((Matcher) (pattern)).group(0), as, ((Matcher) (pattern)), transformfilter);
	//   25   54:aload           8
	//   26   56:aload_2         
	//   27   57:iconst_0        
	//   28   58:invokevirtual   #228 <Method String Matcher.group(int)>
	//   29   61:aload_3         
	//   30   62:aload_2         
	//   31   63:aload           5
	//   32   65:invokestatic    #232 <Method String makeUrl(String, String[], Matcher, android.text.util.Linkify$TransformFilter)>
	//   33   68:putfield        #173 <Field String LinkifyCompat$LinkSpec.url>
				linkspec.start = i;
	//   34   71:aload           8
	//   35   73:iload           6
	//   36   75:putfield        #177 <Field int LinkifyCompat$LinkSpec.start>
				linkspec.end = j;
	//   37   78:aload           8
	//   38   80:iload           7
	//   39   82:putfield        #180 <Field int LinkifyCompat$LinkSpec.end>
				arraylist.add(((Object) (linkspec)));
	//   40   85:aload_0         
	//   41   86:aload           8
	//   42   88:invokevirtual   #262 <Method boolean ArrayList.add(Object)>
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
	//    1    1:invokevirtual   #272 <Method String Object.toString()>
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
			s = findAddress(((String) (spannable)));
	//    5    7:aload_1         
	//    6    8:invokestatic    #273 <Method String findAddress(String)>
	//    7   11:astore          6
		}
	//*   8   13:aload           6
	//*   9   15:ifnull          131
	//*  10   18:aload_1         
	//*  11   19:aload           6
	//*  12   21:invokevirtual   #277 <Method int String.indexOf(String)>
	//*  13   24:istore          4
	//*  14   26:iload           4
	//*  15   28:ifge            32
	//*  16   31:return          
	//*  17   32:new             #8   <Class LinkifyCompat$LinkSpec>
	//*  18   35:dup             
	//*  19   36:invokespecial   #258 <Method void LinkifyCompat$LinkSpec()>
	//*  20   39:astore          5
	//*  21   41:aload           6
	//*  22   43:invokevirtual   #278 <Method int String.length()>
	//*  23   46:iload           4
	//*  24   48:iadd            
	//*  25   49:istore_3        
	//*  26   50:aload           5
	//*  27   52:iload           4
	//*  28   54:iload_2         
	//*  29   55:iadd            
	//*  30   56:putfield        #177 <Field int LinkifyCompat$LinkSpec.start>
	//*  31   59:iload_2         
	//*  32   60:iload_3         
	//*  33   61:iadd            
	//*  34   62:istore_2        
	//*  35   63:aload           5
	//*  36   65:iload_2         
	//*  37   66:putfield        #180 <Field int LinkifyCompat$LinkSpec.end>
	//*  38   69:aload_1         
	//*  39   70:iload_3         
	//*  40   71:invokevirtual   #281 <Method String String.substring(int)>
	//*  41   74:astore_1        
	//*  42   75:aload           6
	//*  43   77:ldc2            #283 <String "UTF-8">
	//*  44   80:invokestatic    #289 <Method String URLEncoder.encode(String, String)>
	//*  45   83:astore          6
	//*  46   85:new             #291 <Class StringBuilder>
	//*  47   88:dup             
	//*  48   89:invokespecial   #292 <Method void StringBuilder()>
	//*  49   92:astore          7
	//*  50   94:aload           7
	//*  51   96:ldc2            #294 <String "geo:0,0?q=">
	//*  52   99:invokevirtual   #298 <Method StringBuilder StringBuilder.append(String)>
	//*  53  102:pop             
	//*  54  103:aload           7
	//*  55  105:aload           6
	//*  56  107:invokevirtual   #298 <Method StringBuilder StringBuilder.append(String)>
	//*  57  110:pop             
	//*  58  111:aload           5
	//*  59  113:aload           7
	//*  60  115:invokevirtual   #299 <Method String StringBuilder.toString()>
	//*  61  118:putfield        #173 <Field String LinkifyCompat$LinkSpec.url>
	//*  62  121:aload_0         
	//*  63  122:aload           5
	//*  64  124:invokevirtual   #262 <Method boolean ArrayList.add(Object)>
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
	//    7   10:invokeinterface #306 <Method String android.text.util.Linkify$TransformFilter.transformUrl(Matcher, String)>
	//    8   15:astore          7
			int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore          4
			do
			{
				int j = as.length;
	//   11   20:aload_1         
	//   12   21:arraylength     
	//   13   22:istore          5
				boolean flag1 = true;
	//   14   24:iconst_1        
	//   15   25:istore          6
				if(i >= j)
					break;
	//   16   27:iload           4
	//   17   29:iload           5
	//   18   31:icmpge          140
				if(s1.regionMatches(true, 0, as[i], 0, as[i].length()))
	//*  19   34:aload           7
	//*  20   36:iconst_1        
	//*  21   37:iconst_0        
	//*  22   38:aload_1         
	//*  23   39:iload           4
	//*  24   41:aaload          
	//*  25   42:iconst_0        
	//*  26   43:aload_1         
	//*  27   44:iload           4
	//*  28   46:aaload          
	//*  29   47:invokevirtual   #278 <Method int String.length()>
	//*  30   50:invokevirtual   #310 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//*  31   53:ifeq            131
				{
					flag = flag1;
	//   32   56:iload           6
	//   33   58:istore          5
					s = s1;
	//   34   60:aload           7
	//   35   62:astore_0        
					if(!s1.regionMatches(false, 0, as[i], 0, as[i].length()))
	//*  36   63:aload           7
	//*  37   65:iconst_0        
	//*  38   66:iconst_0        
	//*  39   67:aload_1         
	//*  40   68:iload           4
	//*  41   70:aaload          
	//*  42   71:iconst_0        
	//*  43   72:aload_1         
	//*  44   73:iload           4
	//*  45   75:aaload          
	//*  46   76:invokevirtual   #278 <Method int String.length()>
	//*  47   79:invokevirtual   #310 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//*  48   82:ifne            146
					{
						s = ((String) (new StringBuilder()));
	//   49   85:new             #291 <Class StringBuilder>
	//   50   88:dup             
	//   51   89:invokespecial   #292 <Method void StringBuilder()>
	//   52   92:astore_0        
						((StringBuilder) (s)).append(as[i]);
	//   53   93:aload_0         
	//   54   94:aload_1         
	//   55   95:iload           4
	//   56   97:aaload          
	//   57   98:invokevirtual   #298 <Method StringBuilder StringBuilder.append(String)>
	//   58  101:pop             
						((StringBuilder) (s)).append(s1.substring(as[i].length()));
	//   59  102:aload_0         
	//   60  103:aload           7
	//   61  105:aload_1         
	//   62  106:iload           4
	//   63  108:aaload          
	//   64  109:invokevirtual   #278 <Method int String.length()>
	//   65  112:invokevirtual   #281 <Method String String.substring(int)>
	//   66  115:invokevirtual   #298 <Method StringBuilder StringBuilder.append(String)>
	//   67  118:pop             
						s = ((StringBuilder) (s)).toString();
	//   68  119:aload_0         
	//   69  120:invokevirtual   #299 <Method String StringBuilder.toString()>
	//   70  123:astore_0        
						flag = flag1;
	//   71  124:iload           6
	//   72  126:istore          5
					}
					break label0;
	//   73  128:goto            146
				}
				i++;
	//   74  131:iload           4
	//   75  133:iconst_1        
	//   76  134:iadd            
	//   77  135:istore          4
			} while(true);
	//   78  137:goto            20
			flag = false;
	//   79  140:iconst_0        
	//   80  141:istore          5
			s = s1;
	//   81  143:aload           7
	//   82  145:astore_0        
		}
		matcher = ((Matcher) (s));
	//   83  146:aload_0         
	//   84  147:astore_2        
		if(!flag)
	//*  85  148:iload           5
	//*  86  150:ifne            187
		{
			matcher = ((Matcher) (s));
	//   87  153:aload_0         
	//   88  154:astore_2        
			if(as.length > 0)
	//*  89  155:aload_1         
	//*  90  156:arraylength     
	//*  91  157:ifle            187
			{
				matcher = ((Matcher) (new StringBuilder()));
	//   92  160:new             #291 <Class StringBuilder>
	//   93  163:dup             
	//   94  164:invokespecial   #292 <Method void StringBuilder()>
	//   95  167:astore_2        
				((StringBuilder) (matcher)).append(as[0]);
	//   96  168:aload_2         
	//   97  169:aload_1         
	//   98  170:iconst_0        
	//   99  171:aaload          
	//  100  172:invokevirtual   #298 <Method StringBuilder StringBuilder.append(String)>
	//  101  175:pop             
				((StringBuilder) (matcher)).append(s);
	//  102  176:aload_2         
	//  103  177:aload_0         
	//  104  178:invokevirtual   #298 <Method StringBuilder StringBuilder.append(String)>
	//  105  181:pop             
				matcher = ((Matcher) (((StringBuilder) (matcher)).toString()));
	//  106  182:aload_2         
	//  107  183:invokevirtual   #299 <Method String StringBuilder.toString()>
	//  108  186:astore_2        
			}
		}
		return ((String) (matcher));
	//  109  187:aload_2         
	//  110  188:areturn         
	}

	private static void pruneOverlaps(ArrayList arraylist, Spannable spannable)
	{
		int i = spannable.length();
	//    0    0:aload_1         
	//    1    1:invokeinterface #102 <Method int Spannable.length()>
	//    2    6:istore_2        
		int l = 0;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, i, android/text/style/URLSpan);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:iload_2         
	//    8   12:ldc1            #104 <Class URLSpan>
	//    9   14:invokeinterface #108 <Method Object[] Spannable.getSpans(int, int, Class)>
	//   10   19:checkcast       #110 <Class URLSpan[]>
	//   11   22:astore          6
		for(int j = 0; j < aurlspan.length; j++)
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
	//   20   37:invokespecial   #258 <Method void LinkifyCompat$LinkSpec()>
	//   21   40:astore          7
			linkspec1.frameworkAddedSpan = aurlspan[j];
	//   22   42:aload           7
	//   23   44:aload           6
	//   24   46:iload_2         
	//   25   47:aaload          
	//   26   48:putfield        #169 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
			linkspec1.start = spannable.getSpanStart(((Object) (aurlspan[j])));
	//   27   51:aload           7
	//   28   53:aload_1         
	//   29   54:aload           6
	//   30   56:iload_2         
	//   31   57:aaload          
	//   32   58:invokeinterface #314 <Method int Spannable.getSpanStart(Object)>
	//   33   63:putfield        #177 <Field int LinkifyCompat$LinkSpec.start>
			linkspec1.end = spannable.getSpanEnd(((Object) (aurlspan[j])));
	//   34   66:aload           7
	//   35   68:aload_1         
	//   36   69:aload           6
	//   37   71:iload_2         
	//   38   72:aaload          
	//   39   73:invokeinterface #317 <Method int Spannable.getSpanEnd(Object)>
	//   40   78:putfield        #180 <Field int LinkifyCompat$LinkSpec.end>
			arraylist.add(((Object) (linkspec1)));
	//   41   81:aload_0         
	//   42   82:aload           7
	//   43   84:invokevirtual   #262 <Method boolean ArrayList.add(Object)>
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
	//   52   99:invokestatic    #323 <Method void Collections.sort(java.util.List, Comparator)>
		int j1 = arraylist.size();
	//   53  102:aload_0         
	//   54  103:invokevirtual   #152 <Method int ArrayList.size()>
	//   55  106:istore          5
		do
		{
			if(l >= j1 - 1)
				break;
	//   56  108:iload_3         
	//   57  109:iload           5
	//   58  111:iconst_1        
	//   59  112:isub            
	//   60  113:icmpge          302
			LinkSpec linkspec = (LinkSpec)arraylist.get(l);
	//   61  116:aload_0         
	//   62  117:iload_3         
	//   63  118:invokevirtual   #327 <Method Object ArrayList.get(int)>
	//   64  121:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   65  124:astore          6
			int i1 = l + 1;
	//   66  126:iload_3         
	//   67  127:iconst_1        
	//   68  128:iadd            
	//   69  129:istore          4
			LinkSpec linkspec2 = (LinkSpec)arraylist.get(i1);
	//   70  131:aload_0         
	//   71  132:iload           4
	//   72  134:invokevirtual   #327 <Method Object ArrayList.get(int)>
	//   73  137:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   74  140:astore          7
			if(linkspec.start <= linkspec2.start && linkspec.end > linkspec2.start)
	//*  75  142:aload           6
	//*  76  144:getfield        #177 <Field int LinkifyCompat$LinkSpec.start>
	//*  77  147:aload           7
	//*  78  149:getfield        #177 <Field int LinkifyCompat$LinkSpec.start>
	//*  79  152:icmpgt          296
	//*  80  155:aload           6
	//*  81  157:getfield        #180 <Field int LinkifyCompat$LinkSpec.end>
	//*  82  160:aload           7
	//*  83  162:getfield        #177 <Field int LinkifyCompat$LinkSpec.start>
	//*  84  165:icmple          296
			{
				int k;
				if(linkspec2.end <= linkspec.end)
	//*  85  168:aload           7
	//*  86  170:getfield        #180 <Field int LinkifyCompat$LinkSpec.end>
	//*  87  173:aload           6
	//*  88  175:getfield        #180 <Field int LinkifyCompat$LinkSpec.end>
	//*  89  178:icmpgt          187
					k = i1;
	//   90  181:iload           4
	//   91  183:istore_2        
				else
	//*  92  184:goto            250
				if(linkspec.end - linkspec.start > linkspec2.end - linkspec2.start)
	//*  93  187:aload           6
	//*  94  189:getfield        #180 <Field int LinkifyCompat$LinkSpec.end>
	//*  95  192:aload           6
	//*  96  194:getfield        #177 <Field int LinkifyCompat$LinkSpec.start>
	//*  97  197:isub            
	//*  98  198:aload           7
	//*  99  200:getfield        #180 <Field int LinkifyCompat$LinkSpec.end>
	//* 100  203:aload           7
	//* 101  205:getfield        #177 <Field int LinkifyCompat$LinkSpec.start>
	//* 102  208:isub            
	//* 103  209:icmple          218
					k = i1;
	//  104  212:iload           4
	//  105  214:istore_2        
				else
	//* 106  215:goto            250
				if(linkspec.end - linkspec.start < linkspec2.end - linkspec2.start)
	//* 107  218:aload           6
	//* 108  220:getfield        #180 <Field int LinkifyCompat$LinkSpec.end>
	//* 109  223:aload           6
	//* 110  225:getfield        #177 <Field int LinkifyCompat$LinkSpec.start>
	//* 111  228:isub            
	//* 112  229:aload           7
	//* 113  231:getfield        #180 <Field int LinkifyCompat$LinkSpec.end>
	//* 114  234:aload           7
	//* 115  236:getfield        #177 <Field int LinkifyCompat$LinkSpec.start>
	//* 116  239:isub            
	//* 117  240:icmpge          248
					k = l;
	//  118  243:iload_3         
	//  119  244:istore_2        
				else
	//* 120  245:goto            250
					k = -1;
	//  121  248:iconst_m1       
	//  122  249:istore_2        
				if(k != -1)
	//* 123  250:iload_2         
	//* 124  251:iconst_m1       
	//* 125  252:icmpeq          296
				{
					URLSpan urlspan = ((LinkSpec)arraylist.get(k)).frameworkAddedSpan;
	//  126  255:aload_0         
	//  127  256:iload_2         
	//  128  257:invokevirtual   #327 <Method Object ArrayList.get(int)>
	//  129  260:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//  130  263:getfield        #169 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
	//  131  266:astore          6
					if(urlspan != null)
	//* 132  268:aload           6
	//* 133  270:ifnull          281
						spannable.removeSpan(((Object) (urlspan)));
	//  134  273:aload_1         
	//  135  274:aload           6
	//  136  276:invokeinterface #114 <Method void Spannable.removeSpan(Object)>
					arraylist.remove(k);
	//  137  281:aload_0         
	//  138  282:iload_2         
	//  139  283:invokevirtual   #330 <Method Object ArrayList.remove(int)>
	//  140  286:pop             
					j1--;
	//  141  287:iload           5
	//  142  289:iconst_1        
	//  143  290:isub            
	//  144  291:istore          5
					continue;
	//  145  293:goto            108
				}
			}
			l = i1;
	//  146  296:iload           4
	//  147  298:istore_3        
		} while(true);
	//  148  299:goto            108
	//  149  302:return          
	}

	private static boolean shouldAddLinksFallbackToFramework()
	{
		return android.os.Build.VERSION.SDK_INT >= 28;
	//    0    0:getstatic       #250 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          28
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
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
