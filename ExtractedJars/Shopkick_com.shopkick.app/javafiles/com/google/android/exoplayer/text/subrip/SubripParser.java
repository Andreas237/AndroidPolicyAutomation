// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.subrip;

import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.text.*;
import com.google.android.exoplayer.util.LongArray;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer.text.subrip:
//			SubripSubtitle

public final class SubripParser
	implements SubtitleParser
{

	public SubripParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #35  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void StringBuilder()>
	//    6   12:putfield        #38  <Field StringBuilder textBuilder>
	//    7   15:return          
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

	public boolean canParse(String s)
	{
		return "application/x-subrip".equals(((Object) (s)));
	//    0    0:ldc1            #60  <String "application/x-subrip">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #66  <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	public volatile Subtitle parse(byte abyte0[], int i, int j)
		throws ParserException
	{
		return ((Subtitle) (parse(abyte0, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #73  <Method SubripSubtitle parse(byte[], int, int)>
	//    5    7:areturn         
	}

	public SubripSubtitle parse(byte abyte0[], int i, int j)
	{
		ArrayList arraylist;
		LongArray longarray;
		arraylist = new ArrayList();
	//    0    0:new             #78  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void ArrayList()>
	//    3    7:astore          4
		longarray = new LongArray();
	//    4    9:new             #81  <Class LongArray>
	//    5   12:dup             
	//    6   13:invokespecial   #82  <Method void LongArray()>
	//    7   16:astore          5
		abyte0 = ((byte []) (new ParsableByteArray(abyte0, j + i)));
	//    8   18:new             #84  <Class ParsableByteArray>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:iload_3         
	//   12   24:iload_2         
	//   13   25:iadd            
	//   14   26:invokespecial   #87  <Method void ParsableByteArray(byte[], int)>
	//   15   29:astore_1        
		((ParsableByteArray) (abyte0)).setPosition(i);
	//   16   30:aload_1         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #91  <Method void ParsableByteArray.setPosition(int)>
_L2:
		String s;
		s = ((ParsableByteArray) (abyte0)).readLine();
	//   19   35:aload_1         
	//   20   36:invokevirtual   #95  <Method String ParsableByteArray.readLine()>
	//   21   39:astore          6
		if(s == null)
			break; /* Loop/switch isn't completed */
	//   22   41:aload           6
	//   23   43:ifnull          303
		if(s.length() == 0)
	//*  24   46:aload           6
	//*  25   48:invokevirtual   #99  <Method int String.length()>
	//*  26   51:ifne            57
			continue; /* Loop/switch isn't completed */
	//   27   54:goto            35
		Integer.parseInt(s);
	//   28   57:aload           6
	//   29   59:invokestatic    #105 <Method int Integer.parseInt(String)>
	//   30   62:pop             
		s = ((ParsableByteArray) (abyte0)).readLine();
	//   31   63:aload_1         
	//   32   64:invokevirtual   #95  <Method String ParsableByteArray.readLine()>
	//   33   67:astore          6
		Matcher matcher = SUBRIP_TIMING_LINE.matcher(((CharSequence) (s)));
	//   34   69:getstatic       #29  <Field Pattern SUBRIP_TIMING_LINE>
	//   35   72:aload           6
	//   36   74:invokevirtual   #109 <Method Matcher Pattern.matcher(CharSequence)>
	//   37   77:astore          7
		if(matcher.matches())
	//*  38   79:aload           7
	//*  39   81:invokevirtual   #113 <Method boolean Matcher.matches()>
	//*  40   84:ifeq            225
		{
			i = 1;
	//   41   87:iconst_1        
	//   42   88:istore_2        
			longarray.add(parseTimecode(matcher, 1));
	//   43   89:aload           5
	//   44   91:aload           7
	//   45   93:iconst_1        
	//   46   94:invokestatic    #115 <Method long parseTimecode(Matcher, int)>
	//   47   97:invokevirtual   #119 <Method void LongArray.add(long)>
			if(!TextUtils.isEmpty(((CharSequence) (matcher.group(6)))))
	//*  48  100:aload           7
	//*  49  102:bipush          6
	//*  50  104:invokevirtual   #46  <Method String Matcher.group(int)>
	//*  51  107:invokestatic    #125 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  52  110:ifne            128
				longarray.add(parseTimecode(matcher, 6));
	//   53  113:aload           5
	//   54  115:aload           7
	//   55  117:bipush          6
	//   56  119:invokestatic    #115 <Method long parseTimecode(Matcher, int)>
	//   57  122:invokevirtual   #119 <Method void LongArray.add(long)>
			else
	//*  58  125:goto            130
				i = 0;
	//   59  128:iconst_0        
	//   60  129:istore_2        
			textBuilder.setLength(0);
	//   61  130:aload_0         
	//   62  131:getfield        #38  <Field StringBuilder textBuilder>
	//   63  134:iconst_0        
	//   64  135:invokevirtual   #128 <Method void StringBuilder.setLength(int)>
			do
			{
				s = ((ParsableByteArray) (abyte0)).readLine();
	//   65  138:aload_1         
	//   66  139:invokevirtual   #95  <Method String ParsableByteArray.readLine()>
	//   67  142:astore          6
				if(TextUtils.isEmpty(((CharSequence) (s))))
					break;
	//   68  144:aload           6
	//   69  146:invokestatic    #125 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   70  149:ifne            188
				if(textBuilder.length() > 0)
	//*  71  152:aload_0         
	//*  72  153:getfield        #38  <Field StringBuilder textBuilder>
	//*  73  156:invokevirtual   #129 <Method int StringBuilder.length()>
	//*  74  159:ifle            172
					textBuilder.append("<br>");
	//   75  162:aload_0         
	//   76  163:getfield        #38  <Field StringBuilder textBuilder>
	//   77  166:ldc1            #131 <String "<br>">
	//   78  168:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   79  171:pop             
				textBuilder.append(s.trim());
	//   80  172:aload_0         
	//   81  173:getfield        #38  <Field StringBuilder textBuilder>
	//   82  176:aload           6
	//   83  178:invokevirtual   #138 <Method String String.trim()>
	//   84  181:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   85  184:pop             
			} while(true);
	//   86  185:goto            138
			arraylist.add(((Object) (new Cue(((CharSequence) (Html.fromHtml(textBuilder.toString())))))));
	//   87  188:aload           4
	//   88  190:new             #140 <Class Cue>
	//   89  193:dup             
	//   90  194:aload_0         
	//   91  195:getfield        #38  <Field StringBuilder textBuilder>
	//   92  198:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   93  201:invokestatic    #149 <Method android.text.Spanned Html.fromHtml(String)>
	//   94  204:invokespecial   #152 <Method void Cue(CharSequence)>
	//   95  207:invokevirtual   #154 <Method boolean ArrayList.add(Object)>
	//   96  210:pop             
			if(i != 0)
	//*  97  211:iload_2         
	//*  98  212:ifeq            35
				arraylist.add(((Object) (null)));
	//   99  215:aload           4
	//  100  217:aconst_null     
	//  101  218:invokevirtual   #154 <Method boolean ArrayList.add(Object)>
	//  102  221:pop             
		} else
	//* 103  222:goto            35
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  104  225:new             #35  <Class StringBuilder>
	//  105  228:dup             
	//  106  229:invokespecial   #36  <Method void StringBuilder()>
	//  107  232:astore          7
			stringbuilder.append("Skipping invalid timing: ");
	//  108  234:aload           7
	//  109  236:ldc1            #156 <String "Skipping invalid timing: ">
	//  110  238:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//  111  241:pop             
			stringbuilder.append(s);
	//  112  242:aload           7
	//  113  244:aload           6
	//  114  246:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//  115  249:pop             
			Log.w("SubripParser", stringbuilder.toString());
	//  116  250:ldc1            #15  <String "SubripParser">
	//  117  252:aload           7
	//  118  254:invokevirtual   #143 <Method String StringBuilder.toString()>
	//  119  257:invokestatic    #162 <Method int Log.w(String, String)>
	//  120  260:pop             
		}
		continue; /* Loop/switch isn't completed */
	//  121  261:goto            35
_L3:
		StringBuilder stringbuilder1 = new StringBuilder();
	//  122  264:new             #35  <Class StringBuilder>
	//  123  267:dup             
	//  124  268:invokespecial   #36  <Method void StringBuilder()>
	//  125  271:astore          7
		stringbuilder1.append("Skipping invalid index: ");
	//  126  273:aload           7
	//  127  275:ldc1            #164 <String "Skipping invalid index: ">
	//  128  277:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//  129  280:pop             
		stringbuilder1.append(s);
	//  130  281:aload           7
	//  131  283:aload           6
	//  132  285:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//  133  288:pop             
		Log.w("SubripParser", stringbuilder1.toString());
	//  134  289:ldc1            #15  <String "SubripParser">
	//  135  291:aload           7
	//  136  293:invokevirtual   #143 <Method String StringBuilder.toString()>
	//  137  296:invokestatic    #162 <Method int Log.w(String, String)>
	//  138  299:pop             
		if(true) goto _L2; else goto _L1
	//  139  300:goto            35
_L1:
		abyte0 = ((byte []) (new Cue[arraylist.size()]));
	//  140  303:aload           4
	//  141  305:invokevirtual   #167 <Method int ArrayList.size()>
	//  142  308:anewarray       Cue[]
	//  143  311:astore_1        
		arraylist.toArray(((Object []) (abyte0)));
	//  144  312:aload           4
	//  145  314:aload_1         
	//  146  315:invokevirtual   #171 <Method Object[] ArrayList.toArray(Object[])>
	//  147  318:pop             
		return new SubripSubtitle(((Cue []) (abyte0)), longarray.toArray());
	//  148  319:new             #173 <Class SubripSubtitle>
	//  149  322:dup             
	//  150  323:aload_1         
	//  151  324:aload           5
	//  152  326:invokevirtual   #176 <Method long[] LongArray.toArray()>
	//  153  329:invokespecial   #179 <Method void SubripSubtitle(Cue[], long[])>
	//  154  332:areturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//  155  333:astore          7
		  goto _L3
	//* 156  335:goto            264
	}

	private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+),(\\d+)";
	private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
	private static final String TAG = "SubripParser";
	private final StringBuilder textBuilder = new StringBuilder();

	static 
	{
	//    0    0:ldc1            #21  <String "\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*">
	//    1    2:invokestatic    #27  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #29  <Field Pattern SUBRIP_TIMING_LINE>
	//*   3    8:return          
	}
}
