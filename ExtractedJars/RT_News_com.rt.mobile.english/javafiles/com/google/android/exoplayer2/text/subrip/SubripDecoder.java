// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.text.subrip:
//			SubripSubtitle

public final class SubripDecoder extends SimpleSubtitleDecoder
{

	public SubripDecoder()
	{
		super("SubripDecoder");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "SubripDecoder">
	//    2    3:invokespecial   #32  <Method void SimpleSubtitleDecoder(String)>
	//    3    6:aload_0         
	//    4    7:new             #34  <Class StringBuilder>
	//    5   10:dup             
	//    6   11:invokespecial   #36  <Method void StringBuilder()>
	//    7   14:putfield        #38  <Field StringBuilder textBuilder>
	//    8   17:return          
	}

	private static long parseTimecode(Matcher matcher, int i)
	{
		return (Long.parseLong(matcher.group(i + 1)) * 60L * 60L * 1000L + Long.parseLong(matcher.group(i + 2)) * 60L * 1000L + Long.parseLong(matcher.group(i + 3)) * 1000L + Long.parseLong(matcher.group(i + 4))) * 1000L;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokevirtual   #46  <Method String Matcher.group(int)>
	//    5    7:invokestatic    #52  <Method long Long.parseLong(String)>
	//    6   10:ldc2w           #53  <Long 60L>
	//    7   13:lmul            
	//    8   14:ldc2w           #53  <Long 60L>
	//    9   17:lmul            
	//   10   18:ldc2w           #55  <Long 1000L>
	//   11   21:lmul            
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:iconst_2        
	//   15   25:iadd            
	//   16   26:invokevirtual   #46  <Method String Matcher.group(int)>
	//   17   29:invokestatic    #52  <Method long Long.parseLong(String)>
	//   18   32:ldc2w           #53  <Long 60L>
	//   19   35:lmul            
	//   20   36:ldc2w           #55  <Long 1000L>
	//   21   39:lmul            
	//   22   40:ladd            
	//   23   41:aload_0         
	//   24   42:iload_1         
	//   25   43:iconst_3        
	//   26   44:iadd            
	//   27   45:invokevirtual   #46  <Method String Matcher.group(int)>
	//   28   48:invokestatic    #52  <Method long Long.parseLong(String)>
	//   29   51:ldc2w           #55  <Long 1000L>
	//   30   54:lmul            
	//   31   55:ladd            
	//   32   56:aload_0         
	//   33   57:iload_1         
	//   34   58:iconst_4        
	//   35   59:iadd            
	//   36   60:invokevirtual   #46  <Method String Matcher.group(int)>
	//   37   63:invokestatic    #52  <Method long Long.parseLong(String)>
	//   38   66:ladd            
	//   39   67:ldc2w           #55  <Long 1000L>
	//   40   70:lmul            
	//   41   71:lreturn         
	}

	protected volatile Subtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		return ((Subtitle) (decode(abyte0, i, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #63  <Method SubripSubtitle decode(byte[], int, boolean)>
	//    5    7:areturn         
	}

	protected SubripSubtitle decode(byte abyte0[], int i, boolean flag)
	{
		ArrayList arraylist;
		LongArray longarray;
		arraylist = new ArrayList();
	//    0    0:new             #68  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void ArrayList()>
	//    3    7:astore          4
		longarray = new LongArray();
	//    4    9:new             #71  <Class LongArray>
	//    5   12:dup             
	//    6   13:invokespecial   #72  <Method void LongArray()>
	//    7   16:astore          5
		abyte0 = ((byte []) (new ParsableByteArray(abyte0, i)));
	//    8   18:new             #74  <Class ParsableByteArray>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:iload_2         
	//   12   24:invokespecial   #77  <Method void ParsableByteArray(byte[], int)>
	//   13   27:astore_1        
_L2:
		String s;
		s = ((ParsableByteArray) (abyte0)).readLine();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #81  <Method String ParsableByteArray.readLine()>
	//   16   32:astore          6
		if(s == null)
			break; /* Loop/switch isn't completed */
	//   17   34:aload           6
	//   18   36:ifnull          312
		if(s.length() == 0)
	//*  19   39:aload           6
	//*  20   41:invokevirtual   #87  <Method int String.length()>
	//*  21   44:ifne            50
			continue; /* Loop/switch isn't completed */
	//   22   47:goto            28
		Integer.parseInt(s);
	//   23   50:aload           6
	//   24   52:invokestatic    #93  <Method int Integer.parseInt(String)>
	//   25   55:pop             
		s = ((ParsableByteArray) (abyte0)).readLine();
	//   26   56:aload_1         
	//   27   57:invokevirtual   #81  <Method String ParsableByteArray.readLine()>
	//   28   60:astore          6
		if(s == null)
	//*  29   62:aload           6
	//*  30   64:ifnonnull       78
		{
			Log.w("SubripDecoder", "Unexpected end");
	//   31   67:ldc1            #13  <String "SubripDecoder">
	//   32   69:ldc1            #95  <String "Unexpected end">
	//   33   71:invokestatic    #101 <Method int Log.w(String, String)>
	//   34   74:pop             
			break; /* Loop/switch isn't completed */
	//   35   75:goto            312
		}
		Matcher matcher = SUBRIP_TIMING_LINE.matcher(((CharSequence) (s)));
	//   36   78:getstatic       #27  <Field Pattern SUBRIP_TIMING_LINE>
	//   37   81:aload           6
	//   38   83:invokevirtual   #105 <Method Matcher Pattern.matcher(CharSequence)>
	//   39   86:astore          7
		if(matcher.matches())
	//*  40   88:aload           7
	//*  41   90:invokevirtual   #109 <Method boolean Matcher.matches()>
	//*  42   93:ifeq            234
		{
			i = 1;
	//   43   96:iconst_1        
	//   44   97:istore_2        
			longarray.add(parseTimecode(matcher, 1));
	//   45   98:aload           5
	//   46  100:aload           7
	//   47  102:iconst_1        
	//   48  103:invokestatic    #111 <Method long parseTimecode(Matcher, int)>
	//   49  106:invokevirtual   #115 <Method void LongArray.add(long)>
			if(!TextUtils.isEmpty(((CharSequence) (matcher.group(6)))))
	//*  50  109:aload           7
	//*  51  111:bipush          6
	//*  52  113:invokevirtual   #46  <Method String Matcher.group(int)>
	//*  53  116:invokestatic    #121 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  54  119:ifne            137
				longarray.add(parseTimecode(matcher, 6));
	//   55  122:aload           5
	//   56  124:aload           7
	//   57  126:bipush          6
	//   58  128:invokestatic    #111 <Method long parseTimecode(Matcher, int)>
	//   59  131:invokevirtual   #115 <Method void LongArray.add(long)>
			else
	//*  60  134:goto            139
				i = 0;
	//   61  137:iconst_0        
	//   62  138:istore_2        
			textBuilder.setLength(0);
	//   63  139:aload_0         
	//   64  140:getfield        #38  <Field StringBuilder textBuilder>
	//   65  143:iconst_0        
	//   66  144:invokevirtual   #125 <Method void StringBuilder.setLength(int)>
			do
			{
				s = ((ParsableByteArray) (abyte0)).readLine();
	//   67  147:aload_1         
	//   68  148:invokevirtual   #81  <Method String ParsableByteArray.readLine()>
	//   69  151:astore          6
				if(TextUtils.isEmpty(((CharSequence) (s))))
					break;
	//   70  153:aload           6
	//   71  155:invokestatic    #121 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   72  158:ifne            197
				if(textBuilder.length() > 0)
	//*  73  161:aload_0         
	//*  74  162:getfield        #38  <Field StringBuilder textBuilder>
	//*  75  165:invokevirtual   #126 <Method int StringBuilder.length()>
	//*  76  168:ifle            181
					textBuilder.append("<br>");
	//   77  171:aload_0         
	//   78  172:getfield        #38  <Field StringBuilder textBuilder>
	//   79  175:ldc1            #128 <String "<br>">
	//   80  177:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   81  180:pop             
				textBuilder.append(s.trim());
	//   82  181:aload_0         
	//   83  182:getfield        #38  <Field StringBuilder textBuilder>
	//   84  185:aload           6
	//   85  187:invokevirtual   #135 <Method String String.trim()>
	//   86  190:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   87  193:pop             
			} while(true);
	//   88  194:goto            147
			arraylist.add(((Object) (new Cue(((CharSequence) (Html.fromHtml(textBuilder.toString())))))));
	//   89  197:aload           4
	//   90  199:new             #137 <Class Cue>
	//   91  202:dup             
	//   92  203:aload_0         
	//   93  204:getfield        #38  <Field StringBuilder textBuilder>
	//   94  207:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   95  210:invokestatic    #146 <Method android.text.Spanned Html.fromHtml(String)>
	//   96  213:invokespecial   #149 <Method void Cue(CharSequence)>
	//   97  216:invokevirtual   #152 <Method boolean ArrayList.add(Object)>
	//   98  219:pop             
			if(i != 0)
	//*  99  220:iload_2         
	//* 100  221:ifeq            28
				arraylist.add(((Object) (null)));
	//  101  224:aload           4
	//  102  226:aconst_null     
	//  103  227:invokevirtual   #152 <Method boolean ArrayList.add(Object)>
	//  104  230:pop             
		} else
	//* 105  231:goto            28
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  106  234:new             #34  <Class StringBuilder>
	//  107  237:dup             
	//  108  238:invokespecial   #36  <Method void StringBuilder()>
	//  109  241:astore          7
			stringbuilder.append("Skipping invalid timing: ");
	//  110  243:aload           7
	//  111  245:ldc1            #154 <String "Skipping invalid timing: ">
	//  112  247:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//  113  250:pop             
			stringbuilder.append(s);
	//  114  251:aload           7
	//  115  253:aload           6
	//  116  255:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//  117  258:pop             
			Log.w("SubripDecoder", stringbuilder.toString());
	//  118  259:ldc1            #13  <String "SubripDecoder">
	//  119  261:aload           7
	//  120  263:invokevirtual   #140 <Method String StringBuilder.toString()>
	//  121  266:invokestatic    #101 <Method int Log.w(String, String)>
	//  122  269:pop             
		}
		continue; /* Loop/switch isn't completed */
	//  123  270:goto            28
_L3:
		StringBuilder stringbuilder1 = new StringBuilder();
	//  124  273:new             #34  <Class StringBuilder>
	//  125  276:dup             
	//  126  277:invokespecial   #36  <Method void StringBuilder()>
	//  127  280:astore          7
		stringbuilder1.append("Skipping invalid index: ");
	//  128  282:aload           7
	//  129  284:ldc1            #156 <String "Skipping invalid index: ">
	//  130  286:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//  131  289:pop             
		stringbuilder1.append(s);
	//  132  290:aload           7
	//  133  292:aload           6
	//  134  294:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//  135  297:pop             
		Log.w("SubripDecoder", stringbuilder1.toString());
	//  136  298:ldc1            #13  <String "SubripDecoder">
	//  137  300:aload           7
	//  138  302:invokevirtual   #140 <Method String StringBuilder.toString()>
	//  139  305:invokestatic    #101 <Method int Log.w(String, String)>
	//  140  308:pop             
		if(true) goto _L2; else goto _L1
	//  141  309:goto            28
_L1:
		abyte0 = ((byte []) (new Cue[arraylist.size()]));
	//  142  312:aload           4
	//  143  314:invokevirtual   #159 <Method int ArrayList.size()>
	//  144  317:anewarray       Cue[]
	//  145  320:astore_1        
		arraylist.toArray(((Object []) (abyte0)));
	//  146  321:aload           4
	//  147  323:aload_1         
	//  148  324:invokevirtual   #163 <Method Object[] ArrayList.toArray(Object[])>
	//  149  327:pop             
		return new SubripSubtitle(((Cue []) (abyte0)), longarray.toArray());
	//  150  328:new             #165 <Class SubripSubtitle>
	//  151  331:dup             
	//  152  332:aload_1         
	//  153  333:aload           5
	//  154  335:invokevirtual   #168 <Method long[] LongArray.toArray()>
	//  155  338:invokespecial   #171 <Method void SubripSubtitle(Cue[], long[])>
	//  156  341:areturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//  157  342:astore          7
		  goto _L3
	//* 158  344:goto            273
	}

	private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+),(\\d+)";
	private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
	private static final String TAG = "SubripDecoder";
	private final StringBuilder textBuilder = new StringBuilder();

	static 
	{
	//    0    0:ldc1            #19  <String "\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*">
	//    1    2:invokestatic    #25  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #27  <Field Pattern SUBRIP_TIMING_LINE>
	//*   3    8:return          
	}
}
