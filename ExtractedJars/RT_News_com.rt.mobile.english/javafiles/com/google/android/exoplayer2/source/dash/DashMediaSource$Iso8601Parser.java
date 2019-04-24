// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.io.*;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashMediaSource

static final class DashMediaSource$Iso8601Parser
	implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
{

	public Long parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		inputstream = ((InputStream) ((new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream, Charset.forName("UTF-8")))))).readLine()));
	//    0    0:new             #36  <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #38  <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:ldc1            #40  <String "UTF-8">
	//    6   11:invokestatic    #46  <Method Charset Charset.forName(String)>
	//    7   14:invokespecial   #49  <Method void InputStreamReader(InputStream, Charset)>
	//    8   17:invokespecial   #52  <Method void BufferedReader(java.io.Reader)>
	//    9   20:invokevirtual   #56  <Method String BufferedReader.readLine()>
	//   10   23:astore_2        
		long l2;
		uri = ((Uri) (TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(((CharSequence) (inputstream)))));
	//   11   24:getstatic       #24  <Field Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN>
	//   12   27:aload_2         
	//   13   28:invokevirtual   #60  <Method Matcher Pattern.matcher(CharSequence)>
	//   14   31:astore_1        
		if(!((Matcher) (uri)).matches())
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #66  <Method boolean Matcher.matches()>
	//*  17   36:ifne            72
		{
			uri = ((Uri) (new StringBuilder()));
	//   18   39:new             #68  <Class StringBuilder>
	//   19   42:dup             
	//   20   43:invokespecial   #69  <Method void StringBuilder()>
	//   21   46:astore_1        
			((StringBuilder) (uri)).append("Couldn't parse timestamp: ");
	//   22   47:aload_1         
	//   23   48:ldc1            #71  <String "Couldn't parse timestamp: ">
	//   24   50:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
			((StringBuilder) (uri)).append(((String) (inputstream)));
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
			throw new ParserException(((StringBuilder) (uri)).toString());
	//   30   60:new             #77  <Class ParserException>
	//   31   63:dup             
	//   32   64:aload_1         
	//   33   65:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   34   68:invokespecial   #83  <Method void ParserException(String)>
	//   35   71:athrow          
		}
		inputstream = ((InputStream) (((Matcher) (uri)).group(1)));
	//   36   72:aload_1         
	//   37   73:iconst_1        
	//   38   74:invokevirtual   #87  <Method String Matcher.group(int)>
	//   39   77:astore_2        
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
	//   40   78:new             #89  <Class SimpleDateFormat>
	//   41   81:dup             
	//   42   82:ldc1            #91  <String "yyyy-MM-dd'T'HH:mm:ss">
	//   43   84:getstatic       #97  <Field Locale Locale.US>
	//   44   87:invokespecial   #100 <Method void SimpleDateFormat(String, Locale)>
	//   45   90:astore          11
		simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
	//   46   92:aload           11
	//   47   94:ldc1            #102 <String "UTC">
	//   48   96:invokestatic    #108 <Method TimeZone TimeZone.getTimeZone(String)>
	//   49   99:invokevirtual   #112 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		l2 = simpledateformat.parse(((String) (inputstream))).getTime();
	//   50  102:aload           11
	//   51  104:aload_2         
	//   52  105:invokevirtual   #115 <Method Date SimpleDateFormat.parse(String)>
	//   53  108:invokevirtual   #121 <Method long Date.getTime()>
	//   54  111:lstore          7
		if(!"Z".equals(((Object) (((Matcher) (uri)).group(2))))) goto _L2; else goto _L1
	//   55  113:ldc1            #123 <String "Z">
	//   56  115:aload_1         
	//   57  116:iconst_2        
	//   58  117:invokevirtual   #87  <Method String Matcher.group(int)>
	//   59  120:invokevirtual   #129 <Method boolean String.equals(Object)>
	//   60  123:ifeq            132
_L1:
		long l = l2;
	//   61  126:lload           7
	//   62  128:lstore_3        
		  goto _L3
	//*  63  129:goto            189
_L2:
		long l3;
		if("+".equals(((Object) (((Matcher) (uri)).group(4)))))
	//*  64  132:ldc1            #131 <String "+">
	//*  65  134:aload_1         
	//*  66  135:iconst_4        
	//*  67  136:invokevirtual   #87  <Method String Matcher.group(int)>
	//*  68  139:invokevirtual   #129 <Method boolean String.equals(Object)>
	//*  69  142:ifeq            204
			l = 1L;
	//   70  145:lconst_1        
	//   71  146:lstore_3        
		else
	//*  72  147:goto            150
	//*  73  150:aload_1         
	//*  74  151:iconst_5        
	//*  75  152:invokevirtual   #87  <Method String Matcher.group(int)>
	//*  76  155:invokestatic    #137 <Method long Long.parseLong(String)>
	//*  77  158:lstore          9
	//*  78  160:aload_1         
	//*  79  161:bipush          7
	//*  80  163:invokevirtual   #87  <Method String Matcher.group(int)>
	//*  81  166:astore_1        
	//*  82  167:aload_1         
	//*  83  168:invokestatic    #143 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  84  171:ifeq            180
	//*  85  174:lconst_0        
	//*  86  175:lstore          5
	//*  87  177:goto            211
	//*  88  180:aload_1         
	//*  89  181:invokestatic    #137 <Method long Long.parseLong(String)>
	//*  90  184:lstore          5
	//*  91  186:goto            211
	//*  92  189:lload_3         
	//*  93  190:invokestatic    #147 <Method Long Long.valueOf(long)>
	//*  94  193:areturn         
	//*  95  194:astore_1        
	//*  96  195:new             #77  <Class ParserException>
	//*  97  198:dup             
	//*  98  199:aload_1         
	//*  99  200:invokespecial   #150 <Method void ParserException(Throwable)>
	//* 100  203:athrow          
			l = -1L;
	//  101  204:ldc2w           #151 <Long -1L>
	//  102  207:lstore_3        
		l3 = Long.parseLong(((Matcher) (uri)).group(5));
		uri = ((Uri) (((Matcher) (uri)).group(7)));
		long l1;
		if(TextUtils.isEmpty(((CharSequence) (uri))))
			l1 = 0L;
		else
			try
			{
				l1 = Long.parseLong(((String) (uri)));
			}
			// Misplaced declaration of an exception variable
			catch(Uri uri)
			{
				throw new ParserException(((Throwable) (uri)));
			}
	//* 103  208:goto            150
		l = l2 - l * ((l3 * 60L + l1) * 60L * 1000L);
	//  104  211:lload           7
	//  105  213:lload_3         
	//  106  214:lload           9
	//  107  216:ldc2w           #153 <Long 60L>
	//  108  219:lmul            
	//  109  220:lload           5
	//  110  222:ladd            
	//  111  223:ldc2w           #153 <Long 60L>
	//  112  226:lmul            
	//  113  227:ldc2w           #155 <Long 1000L>
	//  114  230:lmul            
	//  115  231:lmul            
	//  116  232:lsub            
	//  117  233:lstore_3        
		  goto _L4
_L3:
		return Long.valueOf(l);
_L4:
		if(true) goto _L3; else goto _L5
	//  118  234:goto            189
_L5:
	}

	public volatile Object parse(Uri uri, InputStream inputstream)
		throws IOException
	{
		return ((Object) (parse(uri, inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #160 <Method Long parse(Uri, InputStream)>
	//    4    6:areturn         
	}

	private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|\u2212)(\\d\\d)(:?(\\d\\d))?))");

	static 
	{
	//    0    0:ldc1            #16  <String "(.+?)(Z|((\\+|-|\u2212)(\\d\\d)(:?(\\d\\d))?))">
	//    1    2:invokestatic    #22  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #24  <Field Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN>
	//*   3    8:return          
	}

	DashMediaSource$Iso8601Parser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}
}
