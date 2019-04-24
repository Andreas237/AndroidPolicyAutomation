// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.android;

import android.util.Log;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.UnsynchronizedAppenderBase;

public class LogcatAppender extends UnsynchronizedAppenderBase
{

	public LogcatAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void UnsynchronizedAppenderBase()>
		encoder = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field PatternLayoutEncoder encoder>
		tagEncoder = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field PatternLayoutEncoder tagEncoder>
		checkLoggable = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #23  <Field boolean checkLoggable>
	//   11   19:return          
	}

	public void append(ILoggingEvent iloggingevent)
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #30  <Method boolean isStarted()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		String s = getTag(iloggingevent);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #34  <Method String getTag(ILoggingEvent)>
	//    7   13:astore_3        
		int i = iloggingevent.getLevel().levelInt;
	//    8   14:aload_1         
	//    9   15:invokeinterface #40  <Method Level ILoggingEvent.getLevel()>
	//   10   20:getfield        #45  <Field int Level.levelInt>
	//   11   23:istore_2        
		if(i != 0x80000000 && i != 5000)
	//*  12   24:iload_2         
	//*  13   25:ldc1            #46  <Int 0x80000000>
	//*  14   27:icmpeq          202
	//*  15   30:iload_2         
	//*  16   31:sipush          5000
	//*  17   34:icmpeq          202
		{
			if(i != 10000)
	//*  18   37:iload_2         
	//*  19   38:sipush          10000
	//*  20   41:icmpeq          168
			{
				if(i != 20000)
	//*  21   44:iload_2         
	//*  22   45:sipush          20000
	//*  23   48:icmpeq          134
				{
					if(i != 30000)
	//*  24   51:iload_2         
	//*  25   52:sipush          30000
	//*  26   55:icmpeq          100
					{
						if(i != 40000)
	//*  27   58:iload_2         
	//*  28   59:ldc1            #47  <Int 40000>
	//*  29   61:icmpeq          65
							return;
	//   30   64:return          
						if(!checkLoggable || Log.isLoggable(s, 6))
	//*  31   65:aload_0         
	//*  32   66:getfield        #23  <Field boolean checkLoggable>
	//*  33   69:ifeq            81
	//*  34   72:aload_3         
	//*  35   73:bipush          6
	//*  36   75:invokestatic    #53  <Method boolean Log.isLoggable(String, int)>
	//*  37   78:ifeq            235
						{
							Log.e(s, encoder.getLayout().doLayout(((Object) (iloggingevent))));
	//   38   81:aload_3         
	//   39   82:aload_0         
	//   40   83:getfield        #19  <Field PatternLayoutEncoder encoder>
	//   41   86:invokevirtual   #59  <Method Layout PatternLayoutEncoder.getLayout()>
	//   42   89:aload_1         
	//   43   90:invokeinterface #65  <Method String Layout.doLayout(Object)>
	//   44   95:invokestatic    #69  <Method int Log.e(String, String)>
	//   45   98:pop             
							return;
	//   46   99:return          
						}
					} else
					if(!checkLoggable || Log.isLoggable(s, 5))
	//*  47  100:aload_0         
	//*  48  101:getfield        #23  <Field boolean checkLoggable>
	//*  49  104:ifeq            115
	//*  50  107:aload_3         
	//*  51  108:iconst_5        
	//*  52  109:invokestatic    #53  <Method boolean Log.isLoggable(String, int)>
	//*  53  112:ifeq            235
					{
						Log.w(s, encoder.getLayout().doLayout(((Object) (iloggingevent))));
	//   54  115:aload_3         
	//   55  116:aload_0         
	//   56  117:getfield        #19  <Field PatternLayoutEncoder encoder>
	//   57  120:invokevirtual   #59  <Method Layout PatternLayoutEncoder.getLayout()>
	//   58  123:aload_1         
	//   59  124:invokeinterface #65  <Method String Layout.doLayout(Object)>
	//   60  129:invokestatic    #72  <Method int Log.w(String, String)>
	//   61  132:pop             
						return;
	//   62  133:return          
					}
				} else
				if(!checkLoggable || Log.isLoggable(s, 4))
	//*  63  134:aload_0         
	//*  64  135:getfield        #23  <Field boolean checkLoggable>
	//*  65  138:ifeq            149
	//*  66  141:aload_3         
	//*  67  142:iconst_4        
	//*  68  143:invokestatic    #53  <Method boolean Log.isLoggable(String, int)>
	//*  69  146:ifeq            235
				{
					Log.i(s, encoder.getLayout().doLayout(((Object) (iloggingevent))));
	//   70  149:aload_3         
	//   71  150:aload_0         
	//   72  151:getfield        #19  <Field PatternLayoutEncoder encoder>
	//   73  154:invokevirtual   #59  <Method Layout PatternLayoutEncoder.getLayout()>
	//   74  157:aload_1         
	//   75  158:invokeinterface #65  <Method String Layout.doLayout(Object)>
	//   76  163:invokestatic    #75  <Method int Log.i(String, String)>
	//   77  166:pop             
					return;
	//   78  167:return          
				}
			} else
			if(!checkLoggable || Log.isLoggable(s, 3))
	//*  79  168:aload_0         
	//*  80  169:getfield        #23  <Field boolean checkLoggable>
	//*  81  172:ifeq            183
	//*  82  175:aload_3         
	//*  83  176:iconst_3        
	//*  84  177:invokestatic    #53  <Method boolean Log.isLoggable(String, int)>
	//*  85  180:ifeq            235
			{
				Log.d(s, encoder.getLayout().doLayout(((Object) (iloggingevent))));
	//   86  183:aload_3         
	//   87  184:aload_0         
	//   88  185:getfield        #19  <Field PatternLayoutEncoder encoder>
	//   89  188:invokevirtual   #59  <Method Layout PatternLayoutEncoder.getLayout()>
	//   90  191:aload_1         
	//   91  192:invokeinterface #65  <Method String Layout.doLayout(Object)>
	//   92  197:invokestatic    #78  <Method int Log.d(String, String)>
	//   93  200:pop             
				return;
	//   94  201:return          
			}
		} else
		if(!checkLoggable || Log.isLoggable(s, 2))
	//*  95  202:aload_0         
	//*  96  203:getfield        #23  <Field boolean checkLoggable>
	//*  97  206:ifeq            217
	//*  98  209:aload_3         
	//*  99  210:iconst_2        
	//* 100  211:invokestatic    #53  <Method boolean Log.isLoggable(String, int)>
	//* 101  214:ifeq            235
			Log.v(s, encoder.getLayout().doLayout(((Object) (iloggingevent))));
	//  102  217:aload_3         
	//  103  218:aload_0         
	//  104  219:getfield        #19  <Field PatternLayoutEncoder encoder>
	//  105  222:invokevirtual   #59  <Method Layout PatternLayoutEncoder.getLayout()>
	//  106  225:aload_1         
	//  107  226:invokeinterface #65  <Method String Layout.doLayout(Object)>
	//  108  231:invokestatic    #81  <Method int Log.v(String, String)>
	//  109  234:pop             
	//  110  235:return          
	}

	public volatile void append(Object obj)
	{
		append((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class ILoggingEvent>
	//    3    5:invokevirtual   #84  <Method void append(ILoggingEvent)>
	//    4    8:return          
	}

	public boolean getCheckLoggable()
	{
		return checkLoggable;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field boolean checkLoggable>
	//    2    4:ireturn         
	}

	public PatternLayoutEncoder getEncoder()
	{
		return encoder;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PatternLayoutEncoder encoder>
	//    2    4:areturn         
	}

	protected String getTag(ILoggingEvent iloggingevent)
	{
		if(tagEncoder != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field PatternLayoutEncoder tagEncoder>
	//*   2    4:ifnull          24
			iloggingevent = ((ILoggingEvent) (tagEncoder.getLayout().doLayout(((Object) (iloggingevent)))));
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field PatternLayoutEncoder tagEncoder>
	//    5   11:invokevirtual   #59  <Method Layout PatternLayoutEncoder.getLayout()>
	//    6   14:aload_1         
	//    7   15:invokeinterface #65  <Method String Layout.doLayout(Object)>
	//    8   20:astore_1        
		else
	//*   9   21:goto            31
			iloggingevent = ((ILoggingEvent) (iloggingevent.getLoggerName()));
	//   10   24:aload_1         
	//   11   25:invokeinterface #91  <Method String ILoggingEvent.getLoggerName()>
	//   12   30:astore_1        
		Object obj = ((Object) (iloggingevent));
	//   13   31:aload_1         
	//   14   32:astore_2        
		if(checkLoggable)
	//*  15   33:aload_0         
	//*  16   34:getfield        #23  <Field boolean checkLoggable>
	//*  17   37:ifeq            83
		{
			obj = ((Object) (iloggingevent));
	//   18   40:aload_1         
	//   19   41:astore_2        
			if(((String) (iloggingevent)).length() > 23)
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #97  <Method int String.length()>
	//*  22   46:bipush          23
	//*  23   48:icmple          83
			{
				obj = ((Object) (new StringBuilder()));
	//   24   51:new             #99  <Class StringBuilder>
	//   25   54:dup             
	//   26   55:invokespecial   #100 <Method void StringBuilder()>
	//   27   58:astore_2        
				((StringBuilder) (obj)).append(((String) (iloggingevent)).substring(0, 22));
	//   28   59:aload_2         
	//   29   60:aload_1         
	//   30   61:iconst_0        
	//   31   62:bipush          22
	//   32   64:invokevirtual   #104 <Method String String.substring(int, int)>
	//   33   67:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
				((StringBuilder) (obj)).append("*");
	//   35   71:aload_2         
	//   36   72:ldc1            #109 <String "*">
	//   37   74:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   38   77:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   39   78:aload_2         
	//   40   79:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   41   82:astore_2        
			}
		}
		return ((String) (obj));
	//   42   83:aload_2         
	//   43   84:areturn         
	}

	public PatternLayoutEncoder getTagEncoder()
	{
		return tagEncoder;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PatternLayoutEncoder tagEncoder>
	//    2    4:areturn         
	}

	public void setCheckLoggable(boolean flag)
	{
		checkLoggable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field boolean checkLoggable>
	//    3    5:return          
	}

	public void setEncoder(PatternLayoutEncoder patternlayoutencoder)
	{
		encoder = patternlayoutencoder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PatternLayoutEncoder encoder>
	//    3    5:return          
	}

	public void setTagEncoder(PatternLayoutEncoder patternlayoutencoder)
	{
		tagEncoder = patternlayoutencoder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field PatternLayoutEncoder tagEncoder>
	//    3    5:return          
	}

	public void start()
	{
		if(encoder != null && encoder.getLayout() != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PatternLayoutEncoder encoder>
	//    2    4:ifnull          170
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field PatternLayoutEncoder encoder>
	//    5   11:invokevirtual   #59  <Method Layout PatternLayoutEncoder.getLayout()>
	//    6   14:ifnonnull       20
	//*   7   17:goto            170
_L2:
		if(tagEncoder == null) goto _L4; else goto _L3
	//    8   20:aload_0         
	//    9   21:getfield        #21  <Field PatternLayoutEncoder tagEncoder>
	//   10   24:ifnull          165
_L3:
		Object obj = ((Object) (tagEncoder.getLayout()));
	//   11   27:aload_0         
	//   12   28:getfield        #21  <Field PatternLayoutEncoder tagEncoder>
	//   13   31:invokevirtual   #59  <Method Layout PatternLayoutEncoder.getLayout()>
	//   14   34:astore_1        
		if(obj != null) goto _L6; else goto _L5
	//   15   35:aload_1         
	//   16   36:ifnonnull       81
_L5:
		String s;
		obj = ((Object) (new StringBuilder()));
	//   17   39:new             #99  <Class StringBuilder>
	//   18   42:dup             
	//   19   43:invokespecial   #100 <Method void StringBuilder()>
	//   20   46:astore_1        
		s = "No tag layout set for the appender named [";
	//   21   47:ldc1            #121 <String "No tag layout set for the appender named [">
	//   22   49:astore_2        
_L8:
		((StringBuilder) (obj)).append(s);
	//   23   50:aload_1         
	//   24   51:aload_2         
	//   25   52:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
		((StringBuilder) (obj)).append(name);
	//   27   56:aload_1         
	//   28   57:aload_0         
	//   29   58:getfield        #125 <Field String name>
	//   30   61:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		((StringBuilder) (obj)).append("].");
	//   32   65:aload_1         
	//   33   66:ldc1            #127 <String "].">
	//   34   68:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
		addError(((StringBuilder) (obj)).toString());
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   39   77:invokevirtual   #131 <Method void addError(String)>
		return;
	//   40   80:return          
_L6:
		if(obj instanceof PatternLayout)
	//*  41   81:aload_1         
	//*  42   82:instanceof      #133 <Class PatternLayout>
	//*  43   85:ifeq            165
		{
			s = tagEncoder.getPattern();
	//   44   88:aload_0         
	//   45   89:getfield        #21  <Field PatternLayoutEncoder tagEncoder>
	//   46   92:invokevirtual   #136 <Method String PatternLayoutEncoder.getPattern()>
	//   47   95:astore_2        
			if(!s.contains("%nopex"))
	//*  48   96:aload_2         
	//*  49   97:ldc1            #138 <String "%nopex">
	//*  50   99:invokevirtual   #142 <Method boolean String.contains(CharSequence)>
	//*  51  102:ifne            157
			{
				tagEncoder.stop();
	//   52  105:aload_0         
	//   53  106:getfield        #21  <Field PatternLayoutEncoder tagEncoder>
	//   54  109:invokevirtual   #145 <Method void PatternLayoutEncoder.stop()>
				PatternLayoutEncoder patternlayoutencoder = tagEncoder;
	//   55  112:aload_0         
	//   56  113:getfield        #21  <Field PatternLayoutEncoder tagEncoder>
	//   57  116:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   58  117:new             #99  <Class StringBuilder>
	//   59  120:dup             
	//   60  121:invokespecial   #100 <Method void StringBuilder()>
	//   61  124:astore          4
				stringbuilder.append(s);
	//   62  126:aload           4
	//   63  128:aload_2         
	//   64  129:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   65  132:pop             
				stringbuilder.append("%nopex");
	//   66  133:aload           4
	//   67  135:ldc1            #138 <String "%nopex">
	//   68  137:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   69  140:pop             
				patternlayoutencoder.setPattern(stringbuilder.toString());
	//   70  141:aload_3         
	//   71  142:aload           4
	//   72  144:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   73  147:invokevirtual   #148 <Method void PatternLayoutEncoder.setPattern(String)>
				tagEncoder.start();
	//   74  150:aload_0         
	//   75  151:getfield        #21  <Field PatternLayoutEncoder tagEncoder>
	//   76  154:invokevirtual   #150 <Method void PatternLayoutEncoder.start()>
			}
			((PatternLayout)obj).setPostCompileProcessor(((ch.qos.logback.core.pattern.PostCompileProcessor) (null)));
	//   77  157:aload_1         
	//   78  158:checkcast       #133 <Class PatternLayout>
	//   79  161:aconst_null     
	//   80  162:invokevirtual   #154 <Method void PatternLayout.setPostCompileProcessor(ch.qos.logback.core.pattern.PostCompileProcessor)>
		}
_L4:
		super.start();
	//   81  165:aload_0         
	//   82  166:invokespecial   #155 <Method void UnsynchronizedAppenderBase.start()>
		return;
	//   83  169:return          
_L1:
		obj = ((Object) (new StringBuilder()));
	//   84  170:new             #99  <Class StringBuilder>
	//   85  173:dup             
	//   86  174:invokespecial   #100 <Method void StringBuilder()>
	//   87  177:astore_1        
		s = "No layout set for the appender named [";
	//   88  178:ldc1            #157 <String "No layout set for the appender named [">
	//   89  180:astore_2        
		if(true) goto _L8; else goto _L7
	//   90  181:goto            50
_L7:
	}

	private static final int MAX_TAG_LENGTH = 23;
	private boolean checkLoggable;
	private PatternLayoutEncoder encoder;
	private PatternLayoutEncoder tagEncoder;
}
