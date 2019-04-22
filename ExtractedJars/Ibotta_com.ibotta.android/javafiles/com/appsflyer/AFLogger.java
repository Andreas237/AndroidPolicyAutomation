// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.appsflyer:
//			AppsFlyerProperties, v

public class AFLogger
{
	public static final class LogLevel extends Enum
	{

		public static LogLevel valueOf(String s)
		{
			return (LogLevel)Enum.valueOf(com/appsflyer/AFLogger$LogLevel, s);
		//    0    0:ldc1            #2   <Class AFLogger$LogLevel>
		//    1    2:aload_0         
		//    2    3:invokestatic    #58  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AFLogger$LogLevel>
		//    4    9:areturn         
		}

		public static LogLevel[] values()
		{
			return (LogLevel[])((LogLevel []) (_fld02CF)).clone();
		//    0    0:getstatic       #45  <Field AFLogger$LogLevel[] _fld02CF>
		//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.appsflyer.AFLogger$LogLevel_3B_.clone()>
		//    2    6:checkcast       #61  <Class AFLogger$LogLevel[]>
		//    3    9:areturn         
		}

		public final int getLevel()
		{
			return _fld02CE;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field int _fld02CE>
		//    2    4:ireturn         
		}

		public static final LogLevel DEBUG;
		public static final LogLevel ERROR;
		public static final LogLevel INFO;
		public static final LogLevel NONE;
		public static final LogLevel VERBOSE;
		public static final LogLevel WARNING;
		private static final LogLevel _fld02CF[];
		private int _fld02CE;

		static 
		{
			NONE = new LogLevel("NONE", 0, 0);
		//    0    0:new             #2   <Class AFLogger$LogLevel>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
		//    6   11:putstatic       #28  <Field AFLogger$LogLevel NONE>
			ERROR = new LogLevel("ERROR", 1, 1);
		//    7   14:new             #2   <Class AFLogger$LogLevel>
		//    8   17:dup             
		//    9   18:ldc1            #29  <String "ERROR">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
		//   13   25:putstatic       #31  <Field AFLogger$LogLevel ERROR>
			WARNING = new LogLevel("WARNING", 2, 2);
		//   14   28:new             #2   <Class AFLogger$LogLevel>
		//   15   31:dup             
		//   16   32:ldc1            #32  <String "WARNING">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
		//   20   39:putstatic       #34  <Field AFLogger$LogLevel WARNING>
			INFO = new LogLevel("INFO", 3, 3);
		//   21   42:new             #2   <Class AFLogger$LogLevel>
		//   22   45:dup             
		//   23   46:ldc1            #35  <String "INFO">
		//   24   48:iconst_3        
		//   25   49:iconst_3        
		//   26   50:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
		//   27   53:putstatic       #37  <Field AFLogger$LogLevel INFO>
			DEBUG = new LogLevel("DEBUG", 4, 4);
		//   28   56:new             #2   <Class AFLogger$LogLevel>
		//   29   59:dup             
		//   30   60:ldc1            #38  <String "DEBUG">
		//   31   62:iconst_4        
		//   32   63:iconst_4        
		//   33   64:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
		//   34   67:putstatic       #40  <Field AFLogger$LogLevel DEBUG>
			VERBOSE = new LogLevel("VERBOSE", 5, 5);
		//   35   70:new             #2   <Class AFLogger$LogLevel>
		//   36   73:dup             
		//   37   74:ldc1            #41  <String "VERBOSE">
		//   38   76:iconst_5        
		//   39   77:iconst_5        
		//   40   78:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
		//   41   81:putstatic       #43  <Field AFLogger$LogLevel VERBOSE>
			_fld02CF = (new LogLevel[] {
				NONE, ERROR, WARNING, INFO, DEBUG, VERBOSE
			});
		//   42   84:bipush          6
		//   43   86:anewarray       LogLevel[]
		//   44   89:dup             
		//   45   90:iconst_0        
		//   46   91:getstatic       #28  <Field AFLogger$LogLevel NONE>
		//   47   94:aastore         
		//   48   95:dup             
		//   49   96:iconst_1        
		//   50   97:getstatic       #31  <Field AFLogger$LogLevel ERROR>
		//   51  100:aastore         
		//   52  101:dup             
		//   53  102:iconst_2        
		//   54  103:getstatic       #34  <Field AFLogger$LogLevel WARNING>
		//   55  106:aastore         
		//   56  107:dup             
		//   57  108:iconst_3        
		//   58  109:getstatic       #37  <Field AFLogger$LogLevel INFO>
		//   59  112:aastore         
		//   60  113:dup             
		//   61  114:iconst_4        
		//   62  115:getstatic       #40  <Field AFLogger$LogLevel DEBUG>
		//   63  118:aastore         
		//   64  119:dup             
		//   65  120:iconst_5        
		//   66  121:getstatic       #43  <Field AFLogger$LogLevel VERBOSE>
		//   67  124:aastore         
		//   68  125:putstatic       #45  <Field AFLogger$LogLevel[] _fld02CF>
		//*  69  128:return          
		}

		private LogLevel(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
			_fld02CE = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #51  <Field int _fld02CE>
		//    7   11:return          
		}
	}


	public static void afDebugLog(String s)
	{
		boolean flag;
		if(LogLevel.DEBUG.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()))
	//*   0    0:getstatic       #26  <Field AFLogger$LogLevel AFLogger$LogLevel.DEBUG>
	//*   1    3:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   2    6:invokestatic    #36  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*   3    9:ldc1            #38  <String "logLevel">
	//*   4   11:getstatic       #41  <Field AFLogger$LogLevel AFLogger$LogLevel.NONE>
	//*   5   14:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   6   17:invokevirtual   #45  <Method int AppsFlyerProperties.getInt(String, int)>
	//*   7   20:icmpgt          28
			flag = true;
	//    8   23:iconst_1        
	//    9   24:istore_1        
		else
	//*  10   25:goto            30
			flag = false;
	//   11   28:iconst_0        
	//   12   29:istore_1        
		if(flag)
	//*  13   30:iload_1         
	//*  14   31:ifeq            45
			Log.d("AppsFlyer_4.8.9", _mth02CF(s, false));
	//   15   34:ldc1            #47  <String "AppsFlyer_4.8.9">
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:invokestatic    #51  <Method String _mth02CF(String, boolean)>
	//   19   41:invokestatic    #57  <Method int Log.d(String, String)>
	//   20   44:pop             
		v._mth02CB()._mth02CF("D", _mth02CF(s, true));
	//   21   45:invokestatic    #62  <Method v v._mth02CB()>
	//   22   48:ldc1            #64  <String "D">
	//   23   50:aload_0         
	//   24   51:iconst_1        
	//   25   52:invokestatic    #51  <Method String _mth02CF(String, boolean)>
	//   26   55:invokevirtual   #67  <Method void v._mth02CF(String, String)>
	//   27   58:return          
	}

	public static void afErrorLog(String s, Throwable throwable)
	{
		_mth02CF(s, throwable, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #72  <Method void _mth02CF(String, Throwable, boolean)>
	//    4    6:return          
	}

	public static void afInfoLog(String s)
	{
		afInfoLog(s, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #76  <Method void afInfoLog(String, boolean)>
	//    3    5:return          
	}

	public static void afInfoLog(String s, boolean flag)
	{
		boolean flag1;
		if(LogLevel.INFO.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()))
	//*   0    0:getstatic       #79  <Field AFLogger$LogLevel AFLogger$LogLevel.INFO>
	//*   1    3:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   2    6:invokestatic    #36  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*   3    9:ldc1            #38  <String "logLevel">
	//*   4   11:getstatic       #41  <Field AFLogger$LogLevel AFLogger$LogLevel.NONE>
	//*   5   14:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   6   17:invokevirtual   #45  <Method int AppsFlyerProperties.getInt(String, int)>
	//*   7   20:icmpgt          28
			flag1 = true;
	//    8   23:iconst_1        
	//    9   24:istore_2        
		else
	//*  10   25:goto            30
			flag1 = false;
	//   11   28:iconst_0        
	//   12   29:istore_2        
		if(flag1)
	//*  13   30:iload_2         
	//*  14   31:ifeq            45
			Log.i("AppsFlyer_4.8.9", _mth02CF(s, false));
	//   15   34:ldc1            #47  <String "AppsFlyer_4.8.9">
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:invokestatic    #51  <Method String _mth02CF(String, boolean)>
	//   19   41:invokestatic    #82  <Method int Log.i(String, String)>
	//   20   44:pop             
		if(flag)
	//*  21   45:iload_1         
	//*  22   46:ifeq            62
			v._mth02CB()._mth02CF("I", _mth02CF(s, true));
	//   23   49:invokestatic    #62  <Method v v._mth02CB()>
	//   24   52:ldc1            #84  <String "I">
	//   25   54:aload_0         
	//   26   55:iconst_1        
	//   27   56:invokestatic    #51  <Method String _mth02CF(String, boolean)>
	//   28   59:invokevirtual   #67  <Method void v._mth02CF(String, String)>
	//   29   62:return          
	}

	public static void afRDLog(String s)
	{
		boolean flag;
		if(LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()))
	//*   0    0:getstatic       #88  <Field AFLogger$LogLevel AFLogger$LogLevel.VERBOSE>
	//*   1    3:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   2    6:invokestatic    #36  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*   3    9:ldc1            #38  <String "logLevel">
	//*   4   11:getstatic       #41  <Field AFLogger$LogLevel AFLogger$LogLevel.NONE>
	//*   5   14:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   6   17:invokevirtual   #45  <Method int AppsFlyerProperties.getInt(String, int)>
	//*   7   20:icmpgt          28
			flag = true;
	//    8   23:iconst_1        
	//    9   24:istore_1        
		else
	//*  10   25:goto            30
			flag = false;
	//   11   28:iconst_0        
	//   12   29:istore_1        
		if(flag)
	//*  13   30:iload_1         
	//*  14   31:ifeq            45
			Log.v("AppsFlyer_4.8.9", _mth02CF(s, false));
	//   15   34:ldc1            #47  <String "AppsFlyer_4.8.9">
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:invokestatic    #51  <Method String _mth02CF(String, boolean)>
	//   19   41:invokestatic    #91  <Method int Log.v(String, String)>
	//   20   44:pop             
		v._mth02CB()._mth02CF("V", _mth02CF(s, true));
	//   21   45:invokestatic    #62  <Method v v._mth02CB()>
	//   22   48:ldc1            #93  <String "V">
	//   23   50:aload_0         
	//   24   51:iconst_1        
	//   25   52:invokestatic    #51  <Method String _mth02CF(String, boolean)>
	//   26   55:invokevirtual   #67  <Method void v._mth02CF(String, String)>
	//   27   58:return          
	}

	public static void afWarnLog(String s)
	{
		boolean flag;
		if(LogLevel.WARNING.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()))
	//*   0    0:getstatic       #97  <Field AFLogger$LogLevel AFLogger$LogLevel.WARNING>
	//*   1    3:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   2    6:invokestatic    #36  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*   3    9:ldc1            #38  <String "logLevel">
	//*   4   11:getstatic       #41  <Field AFLogger$LogLevel AFLogger$LogLevel.NONE>
	//*   5   14:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   6   17:invokevirtual   #45  <Method int AppsFlyerProperties.getInt(String, int)>
	//*   7   20:icmpgt          28
			flag = true;
	//    8   23:iconst_1        
	//    9   24:istore_1        
		else
	//*  10   25:goto            30
			flag = false;
	//   11   28:iconst_0        
	//   12   29:istore_1        
		if(flag)
	//*  13   30:iload_1         
	//*  14   31:ifeq            45
			Log.w("AppsFlyer_4.8.9", _mth02CF(s, false));
	//   15   34:ldc1            #47  <String "AppsFlyer_4.8.9">
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:invokestatic    #51  <Method String _mth02CF(String, boolean)>
	//   19   41:invokestatic    #100 <Method int Log.w(String, String)>
	//   20   44:pop             
		v._mth02CB()._mth02CF("W", _mth02CF(s, true));
	//   21   45:invokestatic    #62  <Method v v._mth02CB()>
	//   22   48:ldc1            #102 <String "W">
	//   23   50:aload_0         
	//   24   51:iconst_1        
	//   25   52:invokestatic    #51  <Method String _mth02CF(String, boolean)>
	//   26   55:invokevirtual   #67  <Method void v._mth02CF(String, String)>
	//   27   58:return          
	}

	public static void resetDeltaTime()
	{
		_fld02CB = System.currentTimeMillis();
	//    0    0:invokestatic    #17  <Method long System.currentTimeMillis()>
	//    1    3:putstatic       #19  <Field long _fld02CB>
	//    2    6:return          
	}

	private static String _mth02CA(long l)
	{
		long l1 = TimeUnit.MILLISECONDS.toHours(l);
	//    0    0:getstatic       #111 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    1    3:lload_0         
	//    2    4:invokevirtual   #115 <Method long TimeUnit.toHours(long)>
	//    3    7:lstore_2        
		long l2 = l - TimeUnit.HOURS.toMillis(l1);
	//    4    8:lload_0         
	//    5    9:getstatic       #118 <Field TimeUnit TimeUnit.HOURS>
	//    6   12:lload_2         
	//    7   13:invokevirtual   #121 <Method long TimeUnit.toMillis(long)>
	//    8   16:lsub            
	//    9   17:lstore          4
		l = TimeUnit.MILLISECONDS.toMinutes(l2);
	//   10   19:getstatic       #111 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   11   22:lload           4
	//   12   24:invokevirtual   #124 <Method long TimeUnit.toMinutes(long)>
	//   13   27:lstore_0        
		long l3 = l2 - TimeUnit.MINUTES.toMillis(l);
	//   14   28:lload           4
	//   15   30:getstatic       #127 <Field TimeUnit TimeUnit.MINUTES>
	//   16   33:lload_0         
	//   17   34:invokevirtual   #121 <Method long TimeUnit.toMillis(long)>
	//   18   37:lsub            
	//   19   38:lstore          6
		l2 = TimeUnit.MILLISECONDS.toSeconds(l3);
	//   20   40:getstatic       #111 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   21   43:lload           6
	//   22   45:invokevirtual   #130 <Method long TimeUnit.toSeconds(long)>
	//   23   48:lstore          4
		long l4 = TimeUnit.SECONDS.toMillis(l2);
	//   24   50:getstatic       #133 <Field TimeUnit TimeUnit.SECONDS>
	//   25   53:lload           4
	//   26   55:invokevirtual   #121 <Method long TimeUnit.toMillis(long)>
	//   27   58:lstore          8
		l3 = TimeUnit.MILLISECONDS.toMillis(l3 - l4);
	//   28   60:getstatic       #111 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   29   63:lload           6
	//   30   65:lload           8
	//   31   67:lsub            
	//   32   68:invokevirtual   #121 <Method long TimeUnit.toMillis(long)>
	//   33   71:lstore          6
		return String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[] {
			Long.valueOf(l1), Long.valueOf(l), Long.valueOf(l2), Long.valueOf(l3)
		});
	//   34   73:invokestatic    #139 <Method Locale Locale.getDefault()>
	//   35   76:ldc1            #141 <String "%02d:%02d:%02d:%03d">
	//   36   78:iconst_4        
	//   37   79:anewarray       Object[]
	//   38   82:dup             
	//   39   83:iconst_0        
	//   40   84:lload_2         
	//   41   85:invokestatic    #147 <Method Long Long.valueOf(long)>
	//   42   88:aastore         
	//   43   89:dup             
	//   44   90:iconst_1        
	//   45   91:lload_0         
	//   46   92:invokestatic    #147 <Method Long Long.valueOf(long)>
	//   47   95:aastore         
	//   48   96:dup             
	//   49   97:iconst_2        
	//   50   98:lload           4
	//   51  100:invokestatic    #147 <Method Long Long.valueOf(long)>
	//   52  103:aastore         
	//   53  104:dup             
	//   54  105:iconst_3        
	//   55  106:lload           6
	//   56  108:invokestatic    #147 <Method Long Long.valueOf(long)>
	//   57  111:aastore         
	//   58  112:invokestatic    #153 <Method String String.format(Locale, String, Object[])>
	//   59  115:areturn         
	}

	static void _mth02CB(String s)
	{
		if(!AppsFlyerProperties.getInstance().isLogsDisabledCompletely())
	//*   0    0:invokestatic    #36  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*   1    3:invokevirtual   #157 <Method boolean AppsFlyerProperties.isLogsDisabledCompletely()>
	//*   2    6:ifne            20
			Log.d("AppsFlyer_4.8.9", _mth02CF(s, false));
	//    3    9:ldc1            #47  <String "AppsFlyer_4.8.9">
	//    4   11:aload_0         
	//    5   12:iconst_0        
	//    6   13:invokestatic    #51  <Method String _mth02CF(String, boolean)>
	//    7   16:invokestatic    #57  <Method int Log.d(String, String)>
	//    8   19:pop             
		v._mth02CB()._mth02CF("F", s);
	//    9   20:invokestatic    #62  <Method v v._mth02CB()>
	//   10   23:ldc1            #159 <String "F">
	//   11   25:aload_0         
	//   12   26:invokevirtual   #67  <Method void v._mth02CF(String, String)>
	//   13   29:return          
	}

	private static String _mth02CF(String s, boolean flag)
	{
		if(!flag && LogLevel.VERBOSE.getLevel() != AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()))
	//*   0    0:iload_1         
	//*   1    1:ifne            32
	//*   2    4:getstatic       #88  <Field AFLogger$LogLevel AFLogger$LogLevel.VERBOSE>
	//*   3    7:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   4   10:invokestatic    #36  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*   5   13:ldc1            #38  <String "logLevel">
	//*   6   15:getstatic       #41  <Field AFLogger$LogLevel AFLogger$LogLevel.NONE>
	//*   7   18:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   8   21:invokevirtual   #45  <Method int AppsFlyerProperties.getInt(String, int)>
	//*   9   24:icmpne          30
	//*  10   27:goto            32
		{
			return s;
	//   11   30:aload_0         
	//   12   31:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder("(");
	//   13   32:new             #162 <Class StringBuilder>
	//   14   35:dup             
	//   15   36:ldc1            #164 <String "(">
	//   16   38:invokespecial   #167 <Method void StringBuilder(String)>
	//   17   41:astore_2        
			stringbuilder.append(_mth02CA(System.currentTimeMillis() - _fld02CB));
	//   18   42:aload_2         
	//   19   43:invokestatic    #17  <Method long System.currentTimeMillis()>
	//   20   46:getstatic       #19  <Field long _fld02CB>
	//   21   49:lsub            
	//   22   50:invokestatic    #169 <Method String _mth02CA(long)>
	//   23   53:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:pop             
			stringbuilder.append(") ");
	//   25   57:aload_2         
	//   26   58:ldc1            #175 <String ") ">
	//   27   60:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   28   63:pop             
			stringbuilder.append(s);
	//   29   64:aload_2         
	//   30   65:aload_0         
	//   31   66:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   32   69:pop             
			return ((Object) (stringbuilder)).toString();
	//   33   70:aload_2         
	//   34   71:invokevirtual   #179 <Method String Object.toString()>
	//   35   74:areturn         
		}
	}

	private static void _mth02CF(String s, Throwable throwable, boolean flag)
	{
		boolean flag1;
		if(LogLevel.ERROR.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()))
	//*   0    0:getstatic       #183 <Field AFLogger$LogLevel AFLogger$LogLevel.ERROR>
	//*   1    3:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   2    6:invokestatic    #36  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*   3    9:ldc1            #38  <String "logLevel">
	//*   4   11:getstatic       #41  <Field AFLogger$LogLevel AFLogger$LogLevel.NONE>
	//*   5   14:invokevirtual   #30  <Method int AFLogger$LogLevel.getLevel()>
	//*   6   17:invokevirtual   #45  <Method int AppsFlyerProperties.getInt(String, int)>
	//*   7   20:icmpgt          28
			flag1 = true;
	//    8   23:iconst_1        
	//    9   24:istore_3        
		else
	//*  10   25:goto            30
			flag1 = false;
	//   11   28:iconst_0        
	//   12   29:istore_3        
		if(flag1 && flag)
	//*  13   30:iload_3         
	//*  14   31:ifeq            50
	//*  15   34:iload_2         
	//*  16   35:ifeq            50
			Log.e("AppsFlyer_4.8.9", _mth02CF(s, false), throwable);
	//   17   38:ldc1            #47  <String "AppsFlyer_4.8.9">
	//   18   40:aload_0         
	//   19   41:iconst_0        
	//   20   42:invokestatic    #51  <Method String _mth02CF(String, boolean)>
	//   21   45:aload_1         
	//   22   46:invokestatic    #187 <Method int Log.e(String, String, Throwable)>
	//   23   49:pop             
		v._mth02CB()._mth02CA(throwable);
	//   24   50:invokestatic    #62  <Method v v._mth02CB()>
	//   25   53:aload_1         
	//   26   54:invokevirtual   #190 <Method void v._mth02CA(Throwable)>
	//   27   57:return          
	}

	private static long _fld02CB = System.currentTimeMillis();

	static 
	{
	//    0    0:invokestatic    #17  <Method long System.currentTimeMillis()>
	//    1    3:putstatic       #19  <Field long _fld02CB>
	//*   2    6:return          
	}
}
