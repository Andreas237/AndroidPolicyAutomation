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
	static class LinkSpec
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
		addLinks(textview, pattern, s, ((String []) (null)), ((android.text.util.Linkify.MatchFilter) (null)), ((android.text.util.Linkify.TransformFilter) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokestatic    #59  <Method void addLinks(TextView, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//    7    9:return          
	}

	public static final void addLinks(TextView textview, Pattern pattern, String s, android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		addLinks(textview, pattern, s, ((String []) (null)), matchfilter, transformfilter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:invokestatic    #59  <Method void addLinks(TextView, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//    7   10:return          
	}

	public static final void addLinks(TextView textview, Pattern pattern, String s, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		SpannableString spannablestring = SpannableString.valueOf(textview.getText());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method CharSequence TextView.getText()>
	//    2    4:invokestatic    #70  <Method SpannableString SpannableString.valueOf(CharSequence)>
	//    3    7:astore          6
		if(addLinks(((Spannable) (spannablestring)), pattern, s, as, matchfilter, transformfilter))
	//*   4    9:aload           6
	//*   5   11:aload_1         
	//*   6   12:aload_2         
	//*   7   13:aload_3         
	//*   8   14:aload           4
	//*   9   16:aload           5
	//*  10   18:invokestatic    #73  <Method boolean addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//*  11   21:ifeq            34
		{
			textview.setText(((CharSequence) (spannablestring)));
	//   12   24:aload_0         
	//   13   25:aload           6
	//   14   27:invokevirtual   #77  <Method void TextView.setText(CharSequence)>
			addLinkMovementMethod(textview);
	//   15   30:aload_0         
	//   16   31:invokestatic    #79  <Method void addLinkMovementMethod(TextView)>
		}
	//   17   34:return          
	}

	public static final boolean addLinks(Spannable spannable, int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:invokeinterface #86  <Method int Spannable.length()>
	//    8   14:ldc1            #88  <Class URLSpan>
	//    9   16:invokeinterface #92  <Method Object[] Spannable.getSpans(int, int, Class)>
	//   10   21:checkcast       #94  <Class URLSpan[]>
	//   11   24:astore_3        
		for(int j = aurlspan.length - 1; j >= 0; j--)
	//*  12   25:aload_3         
	//*  13   26:arraylength     
	//*  14   27:iconst_1        
	//*  15   28:isub            
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:iflt            50
			spannable.removeSpan(((Object) (aurlspan[j])));
	//   19   34:aload_0         
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:aaload          
	//   23   38:invokeinterface #98  <Method void Spannable.removeSpan(Object)>

	//   24   43:iload_2         
	//   25   44:iconst_1        
	//   26   45:isub            
	//   27   46:istore_2        
	//*  28   47:goto            30
		if((i & 4) != 0)
	//*  29   50:iload_1         
	//*  30   51:iconst_4        
	//*  31   52:iand            
	//*  32   53:ifeq            62
			Linkify.addLinks(spannable, 4);
	//   33   56:aload_0         
	//   34   57:iconst_4        
	//   35   58:invokestatic    #102 <Method boolean Linkify.addLinks(Spannable, int)>
	//   36   61:pop             
		Object obj = ((Object) (new ArrayList()));
	//   37   62:new             #104 <Class ArrayList>
	//   38   65:dup             
	//   39   66:invokespecial   #105 <Method void ArrayList()>
	//   40   69:astore_3        
		if((i & 1) != 0)
	//*  41   70:iload_1         
	//*  42   71:iconst_1        
	//*  43   72:iand            
	//*  44   73:ifeq            115
		{
			Pattern pattern = PatternsCompat.AUTOLINK_WEB_URL;
	//   45   76:getstatic       #111 <Field Pattern PatternsCompat.AUTOLINK_WEB_URL>
	//   46   79:astore          4
			android.text.util.Linkify.MatchFilter matchfilter = Linkify.sUrlMatchFilter;
	//   47   81:getstatic       #115 <Field android.text.util.Linkify$MatchFilter Linkify.sUrlMatchFilter>
	//   48   84:astore          5
			gatherLinks(((ArrayList) (obj)), spannable, pattern, new String[] {
				"http://", "https://", "rtsp://"
			}, matchfilter, ((android.text.util.Linkify.TransformFilter) (null)));
	//   49   86:aload_3         
	//   50   87:aload_0         
	//   51   88:aload           4
	//   52   90:iconst_3        
	//   53   91:anewarray       String[]
	//   54   94:dup             
	//   55   95:iconst_0        
	//   56   96:ldc1            #117 <String "http://">
	//   57   98:aastore         
	//   58   99:dup             
	//   59  100:iconst_1        
	//   60  101:ldc1            #119 <String "https://">
	//   61  103:aastore         
	//   62  104:dup             
	//   63  105:iconst_2        
	//   64  106:ldc1            #121 <String "rtsp://">
	//   65  108:aastore         
	//   66  109:aload           5
	//   67  111:aconst_null     
	//   68  112:invokestatic    #125 <Method void gatherLinks(ArrayList, Spannable, Pattern, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
		}
		if((i & 2) != 0)
	//*  69  115:iload_1         
	//*  70  116:iconst_2        
	//*  71  117:iand            
	//*  72  118:ifeq            140
			gatherLinks(((ArrayList) (obj)), spannable, PatternsCompat.AUTOLINK_EMAIL_ADDRESS, new String[] {
				"mailto:"
			}, ((android.text.util.Linkify.MatchFilter) (null)), ((android.text.util.Linkify.TransformFilter) (null)));
	//   73  121:aload_3         
	//   74  122:aload_0         
	//   75  123:getstatic       #128 <Field Pattern PatternsCompat.AUTOLINK_EMAIL_ADDRESS>
	//   76  126:iconst_1        
	//   77  127:anewarray       String[]
	//   78  130:dup             
	//   79  131:iconst_0        
	//   80  132:ldc1            #130 <String "mailto:">
	//   81  134:aastore         
	//   82  135:aconst_null     
	//   83  136:aconst_null     
	//   84  137:invokestatic    #125 <Method void gatherLinks(ArrayList, Spannable, Pattern, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
		if((i & 8) != 0)
	//*  85  140:iload_1         
	//*  86  141:bipush          8
	//*  87  143:iand            
	//*  88  144:ifeq            152
			gatherMapLinks(((ArrayList) (obj)), spannable);
	//   89  147:aload_3         
	//   90  148:aload_0         
	//   91  149:invokestatic    #134 <Method void gatherMapLinks(ArrayList, Spannable)>
		pruneOverlaps(((ArrayList) (obj)), spannable);
	//   92  152:aload_3         
	//   93  153:aload_0         
	//   94  154:invokestatic    #137 <Method void pruneOverlaps(ArrayList, Spannable)>
		if(((ArrayList) (obj)).size() == 0)
	//*  95  157:aload_3         
	//*  96  158:invokevirtual   #140 <Method int ArrayList.size()>
	//*  97  161:ifne            166
			return false;
	//   98  164:iconst_0        
	//   99  165:ireturn         
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//  100  166:aload_3         
	//  101  167:invokevirtual   #144 <Method Iterator ArrayList.iterator()>
	//  102  170:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//  103  171:aload_3         
	//  104  172:invokeinterface #149 <Method boolean Iterator.hasNext()>
	//  105  177:ifeq            221
			LinkSpec linkspec = (LinkSpec)((Iterator) (obj)).next();
	//  106  180:aload_3         
	//  107  181:invokeinterface #153 <Method Object Iterator.next()>
	//  108  186:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//  109  189:astore          4
			if(linkspec.frameworkAddedSpan == null)
	//* 110  191:aload           4
	//* 111  193:getfield        #157 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
	//* 112  196:ifnonnull       218
				applyLink(linkspec.url, linkspec.start, linkspec.end, spannable);
	//  113  199:aload           4
	//  114  201:getfield        #161 <Field String LinkifyCompat$LinkSpec.url>
	//  115  204:aload           4
	//  116  206:getfield        #165 <Field int LinkifyCompat$LinkSpec.start>
	//  117  209:aload           4
	//  118  211:getfield        #168 <Field int LinkifyCompat$LinkSpec.end>
	//  119  214:aload_0         
	//  120  215:invokestatic    #172 <Method void applyLink(String, int, int, Spannable)>
		} while(true);
	//  121  218:goto            171
		return true;
	//  122  221:iconst_1        
	//  123  222:ireturn         
	}

	public static final boolean addLinks(Spannable spannable, Pattern pattern, String s)
	{
		return addLinks(spannable, pattern, s, ((String []) (null)), ((android.text.util.Linkify.MatchFilter) (null)), ((android.text.util.Linkify.TransformFilter) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokestatic    #73  <Method boolean addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//    7    9:ireturn         
	}

	public static final boolean addLinks(Spannable spannable, Pattern pattern, String s, android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		return addLinks(spannable, pattern, s, ((String []) (null)), matchfilter, transformfilter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:invokestatic    #73  <Method boolean addLinks(Spannable, Pattern, String, String[], android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter)>
	//    7   10:ireturn         
	}

	public static final boolean addLinks(Spannable spannable, Pattern pattern, String s, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		String s1;
label0:
		{
			s1 = s;
	//    0    0:aload_2         
	//    1    1:astore          10
			if(s == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       11
				s1 = "";
	//    4    7:ldc1            #176 <String "">
	//    5    9:astore          10
			if(as != null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          23
			{
				s = ((String) (as));
	//    8   15:aload_3         
	//    9   16:astore_2        
				if(as.length >= 1)
					break label0;
	//   10   17:aload_3         
	//   11   18:arraylength     
	//   12   19:iconst_1        
	//   13   20:icmpge          27
			}
			s = ((String) (EMPTY_STRING));
	//   14   23:getstatic       #23  <Field String[] EMPTY_STRING>
	//   15   26:astore_2        
		}
		String as1[] = new String[s.length + 1];
	//   16   27:aload_2         
	//   17   28:arraylength     
	//   18   29:iconst_1        
	//   19   30:iadd            
	//   20   31:anewarray       String[]
	//   21   34:astore          11
		as1[0] = s1.toLowerCase(Locale.ROOT);
	//   22   36:aload           11
	//   23   38:iconst_0        
	//   24   39:aload           10
	//   25   41:getstatic       #182 <Field Locale Locale.ROOT>
	//   26   44:invokevirtual   #186 <Method String String.toLowerCase(Locale)>
	//   27   47:aastore         
		for(int i = 0; i < s.length; i++)
	//*  28   48:iconst_0        
	//*  29   49:istore          6
	//*  30   51:iload           6
	//*  31   53:aload_2         
	//*  32   54:arraylength     
	//*  33   55:icmpge          98
		{
			as = ((String []) (s[i]));
	//   34   58:aload_2         
	//   35   59:iload           6
	//   36   61:aaload          
	//   37   62:astore_3        
			if(as == null)
	//*  38   63:aload_3         
	//*  39   64:ifnonnull       73
				as = "";
	//   40   67:ldc1            #176 <String "">
	//   41   69:astore_3        
			else
	//*  42   70:goto            81
				as = ((String []) (((String) (as)).toLowerCase(Locale.ROOT)));
	//   43   73:aload_3         
	//   44   74:getstatic       #182 <Field Locale Locale.ROOT>
	//   45   77:invokevirtual   #186 <Method String String.toLowerCase(Locale)>
	//   46   80:astore_3        
			as1[i + 1] = ((String) (as));
	//   47   81:aload           11
	//   48   83:iload           6
	//   49   85:iconst_1        
	//   50   86:iadd            
	//   51   87:aload_3         
	//   52   88:aastore         
		}

	//   53   89:iload           6
	//   54   91:iconst_1        
	//   55   92:iadd            
	//   56   93:istore          6
	//*  57   95:goto            51
		boolean flag = false;
	//   58   98:iconst_0        
	//   59   99:istore          8
		pattern = ((Pattern) (pattern.matcher(((CharSequence) (spannable)))));
	//   60  101:aload_1         
	//   61  102:aload_0         
	//   62  103:invokevirtual   #192 <Method Matcher Pattern.matcher(CharSequence)>
	//   63  106:astore_1        
		do
		{
			if(!((Matcher) (pattern)).find())
				break;
	//   64  107:aload_1         
	//   65  108:invokevirtual   #197 <Method boolean Matcher.find()>
	//   66  111:ifeq            180
			int j = ((Matcher) (pattern)).start();
	//   67  114:aload_1         
	//   68  115:invokevirtual   #199 <Method int Matcher.start()>
	//   69  118:istore          6
			int k = ((Matcher) (pattern)).end();
	//   70  120:aload_1         
	//   71  121:invokevirtual   #201 <Method int Matcher.end()>
	//   72  124:istore          7
			boolean flag1 = true;
	//   73  126:iconst_1        
	//   74  127:istore          9
			if(matchfilter != null)
	//*  75  129:aload           4
	//*  76  131:ifnull          148
				flag1 = matchfilter.acceptMatch(((CharSequence) (spannable)), j, k);
	//   77  134:aload           4
	//   78  136:aload_0         
	//   79  137:iload           6
	//   80  139:iload           7
	//   81  141:invokeinterface #207 <Method boolean android.text.util.Linkify$MatchFilter.acceptMatch(CharSequence, int, int)>
	//   82  146:istore          9
			if(flag1)
	//*  83  148:iload           9
	//*  84  150:ifeq            177
			{
				applyLink(makeUrl(((Matcher) (pattern)).group(0), as1, ((Matcher) (pattern)), transformfilter), j, k, spannable);
	//   85  153:aload_1         
	//   86  154:iconst_0        
	//   87  155:invokevirtual   #211 <Method String Matcher.group(int)>
	//   88  158:aload           11
	//   89  160:aload_1         
	//   90  161:aload           5
	//   91  163:invokestatic    #215 <Method String makeUrl(String, String[], Matcher, android.text.util.Linkify$TransformFilter)>
	//   92  166:iload           6
	//   93  168:iload           7
	//   94  170:aload_0         
	//   95  171:invokestatic    #172 <Method void applyLink(String, int, int, Spannable)>
				flag = true;
	//   96  174:iconst_1        
	//   97  175:istore          8
			}
		} while(true);
	//   98  177:goto            107
		return flag;
	//   99  180:iload           8
	//  100  182:ireturn         
	}

	public static final boolean addLinks(TextView textview, int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		Object obj = ((Object) (textview.getText()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #64  <Method CharSequence TextView.getText()>
	//    6   10:astore_2        
		if(obj instanceof Spannable)
	//*   7   11:aload_2         
	//*   8   12:instanceof      #82  <Class Spannable>
	//*   9   15:ifeq            37
			if(addLinks((Spannable)obj, i))
	//*  10   18:aload_2         
	//*  11   19:checkcast       #82  <Class Spannable>
	//*  12   22:iload_1         
	//*  13   23:invokestatic    #217 <Method boolean addLinks(Spannable, int)>
	//*  14   26:ifeq            35
			{
				addLinkMovementMethod(textview);
	//   15   29:aload_0         
	//   16   30:invokestatic    #79  <Method void addLinkMovementMethod(TextView)>
				return true;
	//   17   33:iconst_1        
	//   18   34:ireturn         
			} else
			{
				return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
			}
		obj = ((Object) (SpannableString.valueOf(((CharSequence) (obj)))));
	//   21   37:aload_2         
	//   22   38:invokestatic    #70  <Method SpannableString SpannableString.valueOf(CharSequence)>
	//   23   41:astore_2        
		if(addLinks(((Spannable) (obj)), i))
	//*  24   42:aload_2         
	//*  25   43:iload_1         
	//*  26   44:invokestatic    #217 <Method boolean addLinks(Spannable, int)>
	//*  27   47:ifeq            61
		{
			addLinkMovementMethod(textview);
	//   28   50:aload_0         
	//   29   51:invokestatic    #79  <Method void addLinkMovementMethod(TextView)>
			textview.setText(((CharSequence) (obj)));
	//   30   54:aload_0         
	//   31   55:aload_2         
	//   32   56:invokevirtual   #77  <Method void TextView.setText(CharSequence)>
			return true;
	//   33   59:iconst_1        
	//   34   60:ireturn         
		} else
		{
			return false;
	//   35   61:iconst_0        
	//   36   62:ireturn         
		}
	}

	private static void applyLink(String s, int i, int j, Spannable spannable)
	{
		spannable.setSpan(((Object) (new URLSpan(s))), i, j, 33);
	//    0    0:aload_3         
	//    1    1:new             #88  <Class URLSpan>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #220 <Method void URLSpan(String)>
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:bipush          33
	//    8   13:invokeinterface #224 <Method void Spannable.setSpan(Object, int, int, int)>
	//    9   18:return          
	}

	private static void gatherLinks(ArrayList arraylist, Spannable spannable, Pattern pattern, String as[], android.text.util.Linkify.MatchFilter matchfilter, android.text.util.Linkify.TransformFilter transformfilter)
	{
		pattern = ((Pattern) (pattern.matcher(((CharSequence) (spannable)))));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #192 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    5:astore_2        
		do
		{
			if(!((Matcher) (pattern)).find())
				break;
	//    4    6:aload_2         
	//    5    7:invokevirtual   #197 <Method boolean Matcher.find()>
	//    6   10:ifeq            95
			int i = ((Matcher) (pattern)).start();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #199 <Method int Matcher.start()>
	//    9   17:istore          6
			int j = ((Matcher) (pattern)).end();
	//   10   19:aload_2         
	//   11   20:invokevirtual   #201 <Method int Matcher.end()>
	//   12   23:istore          7
			if(matchfilter == null || matchfilter.acceptMatch(((CharSequence) (spannable)), i, j))
	//*  13   25:aload           4
	//*  14   27:ifnull          45
	//*  15   30:aload           4
	//*  16   32:aload_1         
	//*  17   33:iload           6
	//*  18   35:iload           7
	//*  19   37:invokeinterface #207 <Method boolean android.text.util.Linkify$MatchFilter.acceptMatch(CharSequence, int, int)>
	//*  20   42:ifeq            92
			{
				LinkSpec linkspec = new LinkSpec();
	//   21   45:new             #8   <Class LinkifyCompat$LinkSpec>
	//   22   48:dup             
	//   23   49:invokespecial   #225 <Method void LinkifyCompat$LinkSpec()>
	//   24   52:astore          8
				linkspec.url = makeUrl(((Matcher) (pattern)).group(0), as, ((Matcher) (pattern)), transformfilter);
	//   25   54:aload           8
	//   26   56:aload_2         
	//   27   57:iconst_0        
	//   28   58:invokevirtual   #211 <Method String Matcher.group(int)>
	//   29   61:aload_3         
	//   30   62:aload_2         
	//   31   63:aload           5
	//   32   65:invokestatic    #215 <Method String makeUrl(String, String[], Matcher, android.text.util.Linkify$TransformFilter)>
	//   33   68:putfield        #161 <Field String LinkifyCompat$LinkSpec.url>
				linkspec.start = i;
	//   34   71:aload           8
	//   35   73:iload           6
	//   36   75:putfield        #165 <Field int LinkifyCompat$LinkSpec.start>
				linkspec.end = j;
	//   37   78:aload           8
	//   38   80:iload           7
	//   39   82:putfield        #168 <Field int LinkifyCompat$LinkSpec.end>
				arraylist.add(((Object) (linkspec)));
	//   40   85:aload_0         
	//   41   86:aload           8
	//   42   88:invokevirtual   #229 <Method boolean ArrayList.add(Object)>
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
	//    1    1:invokevirtual   #239 <Method String Object.toString()>
	//    2    4:astore_1        
		i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
_L1:
		int j;
		int k;
		Object obj;
		String s;
		try
		{
			s = WebView.findAddress(((String) (spannable)));
	//    5    7:aload_1         
	//    6    8:invokestatic    #245 <Method String WebView.findAddress(String)>
	//    7   11:astore          6
		}
	//*   8   13:aload           6
	//*   9   15:ifnull          132
	//*  10   18:aload_1         
	//*  11   19:aload           6
	//*  12   21:invokevirtual   #249 <Method int String.indexOf(String)>
	//*  13   24:istore_3        
	//*  14   25:iload_3         
	//*  15   26:ifge            32
	//*  16   29:goto            132
	//*  17   32:new             #8   <Class LinkifyCompat$LinkSpec>
	//*  18   35:dup             
	//*  19   36:invokespecial   #225 <Method void LinkifyCompat$LinkSpec()>
	//*  20   39:astore          5
	//*  21   41:iload_3         
	//*  22   42:aload           6
	//*  23   44:invokevirtual   #250 <Method int String.length()>
	//*  24   47:iadd            
	//*  25   48:istore          4
	//*  26   50:aload           5
	//*  27   52:iload_2         
	//*  28   53:iload_3         
	//*  29   54:iadd            
	//*  30   55:putfield        #165 <Field int LinkifyCompat$LinkSpec.start>
	//*  31   58:aload           5
	//*  32   60:iload_2         
	//*  33   61:iload           4
	//*  34   63:iadd            
	//*  35   64:putfield        #168 <Field int LinkifyCompat$LinkSpec.end>
	//*  36   67:aload_1         
	//*  37   68:iload           4
	//*  38   70:invokevirtual   #253 <Method String String.substring(int)>
	//*  39   73:astore_1        
	//*  40   74:iload_2         
	//*  41   75:iload           4
	//*  42   77:iadd            
	//*  43   78:istore_2        
	//*  44   79:aload           6
	//*  45   81:ldc1            #255 <String "UTF-8">
	//*  46   83:invokestatic    #261 <Method String URLEncoder.encode(String, String)>
	//*  47   86:astore          6
	//*  48   88:goto            96
	//*  49   91:astore          5
	//*  50   93:goto            7
	//*  51   96:aload           5
	//*  52   98:new             #263 <Class StringBuilder>
	//*  53  101:dup             
	//*  54  102:invokespecial   #264 <Method void StringBuilder()>
	//*  55  105:ldc2            #266 <String "geo:0,0?q=">
	//*  56  108:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//*  57  111:aload           6
	//*  58  113:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//*  59  116:invokevirtual   #271 <Method String StringBuilder.toString()>
	//*  60  119:putfield        #161 <Field String LinkifyCompat$LinkSpec.url>
	//*  61  122:aload_0         
	//*  62  123:aload           5
	//*  63  125:invokevirtual   #229 <Method boolean ArrayList.add(Object)>
	//*  64  128:pop             
	//*  65  129:goto            7
	//*  66  132:return          
		// Misplaced declaration of an exception variable
		catch(ArrayList arraylist)
	//*  67  133:astore_0        
		{
			return;
	//   68  134:return          
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_132;
		j = ((String) (spannable)).indexOf(s);
		if(j < 0)
			break MISSING_BLOCK_LABEL_132;
		obj = ((Object) (new LinkSpec()));
		k = j + s.length();
		obj.start = i + j;
		obj.end = i + k;
		spannable = ((Spannable) (((String) (spannable)).substring(k)));
		i += k;
		s = URLEncoder.encode(s, "UTF-8");
		break MISSING_BLOCK_LABEL_96;
		obj;
		  goto _L1
		obj.url = (new StringBuilder()).append("geo:0,0?q=").append(s).toString();
		arraylist.add(obj);
		  goto _L1
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
	//    7   10:invokeinterface #278 <Method String android.text.util.Linkify$TransformFilter.transformUrl(Matcher, String)>
	//    8   15:astore          7
		boolean flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore          6
		int i = 0;
	//   11   20:iconst_0        
	//   12   21:istore          4
		boolean flag;
		do
		{
			flag = flag1;
	//   13   23:iload           6
	//   14   25:istore          5
			s = s1;
	//   15   27:aload           7
	//   16   29:astore_0        
			if(i >= as.length)
				break;
	//   17   30:iload           4
	//   18   32:aload_1         
	//   19   33:arraylength     
	//   20   34:icmpge          140
			if(s1.regionMatches(true, 0, as[i], 0, as[i].length()))
	//*  21   37:aload           7
	//*  22   39:iconst_1        
	//*  23   40:iconst_0        
	//*  24   41:aload_1         
	//*  25   42:iload           4
	//*  26   44:aaload          
	//*  27   45:iconst_0        
	//*  28   46:aload_1         
	//*  29   47:iload           4
	//*  30   49:aaload          
	//*  31   50:invokevirtual   #250 <Method int String.length()>
	//*  32   53:invokevirtual   #282 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//*  33   56:ifeq            131
			{
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
	//*  50   82:invokevirtual   #250 <Method int String.length()>
	//*  51   85:invokevirtual   #282 <Method boolean String.regionMatches(boolean, int, String, int, int)>
	//*  52   88:ifne            140
				{
					s = (new StringBuilder()).append(as[i]).append(s1.substring(as[i].length())).toString();
	//   53   91:new             #263 <Class StringBuilder>
	//   54   94:dup             
	//   55   95:invokespecial   #264 <Method void StringBuilder()>
	//   56   98:aload_1         
	//   57   99:iload           4
	//   58  101:aaload          
	//   59  102:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//   60  105:aload           7
	//   61  107:aload_1         
	//   62  108:iload           4
	//   63  110:aaload          
	//   64  111:invokevirtual   #250 <Method int String.length()>
	//   65  114:invokevirtual   #253 <Method String String.substring(int)>
	//   66  117:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//   67  120:invokevirtual   #271 <Method String StringBuilder.toString()>
	//   68  123:astore_0        
					flag = flag2;
	//   69  124:iload           6
	//   70  126:istore          5
				}
				break;
	//   71  128:goto            140
			}
			i++;
	//   72  131:iload           4
	//   73  133:iconst_1        
	//   74  134:iadd            
	//   75  135:istore          4
		} while(true);
	//   76  137:goto            23
		matcher = ((Matcher) (s));
	//   77  140:aload_0         
	//   78  141:astore_2        
		if(!flag)
	//*  79  142:iload           5
	//*  80  144:ifne            175
		{
			matcher = ((Matcher) (s));
	//   81  147:aload_0         
	//   82  148:astore_2        
			if(as.length > 0)
	//*  83  149:aload_1         
	//*  84  150:arraylength     
	//*  85  151:ifle            175
				matcher = ((Matcher) ((new StringBuilder()).append(as[0]).append(s).toString()));
	//   86  154:new             #263 <Class StringBuilder>
	//   87  157:dup             
	//   88  158:invokespecial   #264 <Method void StringBuilder()>
	//   89  161:aload_1         
	//   90  162:iconst_0        
	//   91  163:aaload          
	//   92  164:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//   93  167:aload_0         
	//   94  168:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//   95  171:invokevirtual   #271 <Method String StringBuilder.toString()>
	//   96  174:astore_2        
		}
		return ((String) (matcher));
	//   97  175:aload_2         
	//   98  176:areturn         
	}

	private static final void pruneOverlaps(ArrayList arraylist, Spannable spannable)
	{
		URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokeinterface #86  <Method int Spannable.length()>
	//    4    8:ldc1            #88  <Class URLSpan>
	//    5   10:invokeinterface #92  <Method Object[] Spannable.getSpans(int, int, Class)>
	//    6   15:checkcast       #94  <Class URLSpan[]>
	//    7   18:astore          5
		for(int i = 0; i < aurlspan.length; i++)
	//*   8   20:iconst_0        
	//*   9   21:istore_2        
	//*  10   22:iload_2         
	//*  11   23:aload           5
	//*  12   25:arraylength     
	//*  13   26:icmpge          91
		{
			LinkSpec linkspec1 = new LinkSpec();
	//   14   29:new             #8   <Class LinkifyCompat$LinkSpec>
	//   15   32:dup             
	//   16   33:invokespecial   #225 <Method void LinkifyCompat$LinkSpec()>
	//   17   36:astore          6
			linkspec1.frameworkAddedSpan = aurlspan[i];
	//   18   38:aload           6
	//   19   40:aload           5
	//   20   42:iload_2         
	//   21   43:aaload          
	//   22   44:putfield        #157 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
			linkspec1.start = spannable.getSpanStart(((Object) (aurlspan[i])));
	//   23   47:aload           6
	//   24   49:aload_1         
	//   25   50:aload           5
	//   26   52:iload_2         
	//   27   53:aaload          
	//   28   54:invokeinterface #286 <Method int Spannable.getSpanStart(Object)>
	//   29   59:putfield        #165 <Field int LinkifyCompat$LinkSpec.start>
			linkspec1.end = spannable.getSpanEnd(((Object) (aurlspan[i])));
	//   30   62:aload           6
	//   31   64:aload_1         
	//   32   65:aload           5
	//   33   67:iload_2         
	//   34   68:aaload          
	//   35   69:invokeinterface #289 <Method int Spannable.getSpanEnd(Object)>
	//   36   74:putfield        #168 <Field int LinkifyCompat$LinkSpec.end>
			arraylist.add(((Object) (linkspec1)));
	//   37   77:aload_0         
	//   38   78:aload           6
	//   39   80:invokevirtual   #229 <Method boolean ArrayList.add(Object)>
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
	//   48   95:invokestatic    #295 <Method void Collections.sort(java.util.List, Comparator)>
		int l = arraylist.size();
	//   49   98:aload_0         
	//   50   99:invokevirtual   #140 <Method int ArrayList.size()>
	//   51  102:istore          4
		int k = 0;
	//   52  104:iconst_0        
	//   53  105:istore_3        
		do
		{
			if(k >= l - 1)
				break;
	//   54  106:iload_3         
	//   55  107:iload           4
	//   56  109:iconst_1        
	//   57  110:isub            
	//   58  111:icmpge          296
			LinkSpec linkspec = (LinkSpec)arraylist.get(k);
	//   59  114:aload_0         
	//   60  115:iload_3         
	//   61  116:invokevirtual   #299 <Method Object ArrayList.get(int)>
	//   62  119:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   63  122:astore          5
			LinkSpec linkspec2 = (LinkSpec)arraylist.get(k + 1);
	//   64  124:aload_0         
	//   65  125:iload_3         
	//   66  126:iconst_1        
	//   67  127:iadd            
	//   68  128:invokevirtual   #299 <Method Object ArrayList.get(int)>
	//   69  131:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//   70  134:astore          6
			int j = -1;
	//   71  136:iconst_m1       
	//   72  137:istore_2        
			if(linkspec.start <= linkspec2.start && linkspec.end > linkspec2.start)
	//*  73  138:aload           5
	//*  74  140:getfield        #165 <Field int LinkifyCompat$LinkSpec.start>
	//*  75  143:aload           6
	//*  76  145:getfield        #165 <Field int LinkifyCompat$LinkSpec.start>
	//*  77  148:icmpgt          289
	//*  78  151:aload           5
	//*  79  153:getfield        #168 <Field int LinkifyCompat$LinkSpec.end>
	//*  80  156:aload           6
	//*  81  158:getfield        #165 <Field int LinkifyCompat$LinkSpec.start>
	//*  82  161:icmple          289
			{
				if(linkspec2.end <= linkspec.end)
	//*  83  164:aload           6
	//*  84  166:getfield        #168 <Field int LinkifyCompat$LinkSpec.end>
	//*  85  169:aload           5
	//*  86  171:getfield        #168 <Field int LinkifyCompat$LinkSpec.end>
	//*  87  174:icmpgt          184
					j = k + 1;
	//   88  177:iload_3         
	//   89  178:iconst_1        
	//   90  179:iadd            
	//   91  180:istore_2        
				else
	//*  92  181:goto            243
				if(linkspec.end - linkspec.start > linkspec2.end - linkspec2.start)
	//*  93  184:aload           5
	//*  94  186:getfield        #168 <Field int LinkifyCompat$LinkSpec.end>
	//*  95  189:aload           5
	//*  96  191:getfield        #165 <Field int LinkifyCompat$LinkSpec.start>
	//*  97  194:isub            
	//*  98  195:aload           6
	//*  99  197:getfield        #168 <Field int LinkifyCompat$LinkSpec.end>
	//* 100  200:aload           6
	//* 101  202:getfield        #165 <Field int LinkifyCompat$LinkSpec.start>
	//* 102  205:isub            
	//* 103  206:icmple          216
					j = k + 1;
	//  104  209:iload_3         
	//  105  210:iconst_1        
	//  106  211:iadd            
	//  107  212:istore_2        
				else
	//* 108  213:goto            243
				if(linkspec.end - linkspec.start < linkspec2.end - linkspec2.start)
	//* 109  216:aload           5
	//* 110  218:getfield        #168 <Field int LinkifyCompat$LinkSpec.end>
	//* 111  221:aload           5
	//* 112  223:getfield        #165 <Field int LinkifyCompat$LinkSpec.start>
	//* 113  226:isub            
	//* 114  227:aload           6
	//* 115  229:getfield        #168 <Field int LinkifyCompat$LinkSpec.end>
	//* 116  232:aload           6
	//* 117  234:getfield        #165 <Field int LinkifyCompat$LinkSpec.start>
	//* 118  237:isub            
	//* 119  238:icmpge          243
					j = k;
	//  120  241:iload_3         
	//  121  242:istore_2        
				if(j != -1)
	//* 122  243:iload_2         
	//* 123  244:iconst_m1       
	//* 124  245:icmpeq          289
				{
					URLSpan urlspan = ((LinkSpec)arraylist.get(j)).frameworkAddedSpan;
	//  125  248:aload_0         
	//  126  249:iload_2         
	//  127  250:invokevirtual   #299 <Method Object ArrayList.get(int)>
	//  128  253:checkcast       #8   <Class LinkifyCompat$LinkSpec>
	//  129  256:getfield        #157 <Field URLSpan LinkifyCompat$LinkSpec.frameworkAddedSpan>
	//  130  259:astore          5
					if(urlspan != null)
	//* 131  261:aload           5
	//* 132  263:ifnull          274
						spannable.removeSpan(((Object) (urlspan)));
	//  133  266:aload_1         
	//  134  267:aload           5
	//  135  269:invokeinterface #98  <Method void Spannable.removeSpan(Object)>
					arraylist.remove(j);
	//  136  274:aload_0         
	//  137  275:iload_2         
	//  138  276:invokevirtual   #302 <Method Object ArrayList.remove(int)>
	//  139  279:pop             
					l--;
	//  140  280:iload           4
	//  141  282:iconst_1        
	//  142  283:isub            
	//  143  284:istore          4
					continue;
	//  144  286:goto            106
				}
			}
			k++;
	//  145  289:iload_3         
	//  146  290:iconst_1        
	//  147  291:iadd            
	//  148  292:istore_3        
		} while(true);
	//  149  293:goto            106
	//  150  296:return          
	}

	private static final Comparator COMPARATOR = new Comparator() {

		public final int compare(LinkSpec linkspec, LinkSpec linkspec1)
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
