// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android.core:
//			ProcMapEntry

final class ProcMapEntryParser
{

	private ProcMapEntryParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static ProcMapEntry parse(String s)
	{
		Exception exception;
		Object obj = ((Object) (MAP_REGEX.matcher(((CharSequence) (s)))));
	//    0    0:getstatic       #18  <Field Pattern MAP_REGEX>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #30  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_3        
		if(!((Matcher) (obj)).matches())
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #36  <Method boolean Matcher.matches()>
	//*   6   12:ifne            17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		StringBuilder stringbuilder;
		try
		{
			long l = Long.valueOf(((Matcher) (obj)).group(1), 16).longValue();
	//    9   17:aload_3         
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #40  <Method String Matcher.group(int)>
	//   12   22:bipush          16
	//   13   24:invokestatic    #46  <Method Long Long.valueOf(String, int)>
	//   14   27:invokevirtual   #50  <Method long Long.longValue()>
	//   15   30:lstore_1        
			obj = ((Object) (new ProcMapEntry(l, Long.valueOf(((Matcher) (obj)).group(2), 16).longValue() - l, ((Matcher) (obj)).group(3), ((Matcher) (obj)).group(4))));
	//   16   31:new             #52  <Class ProcMapEntry>
	//   17   34:dup             
	//   18   35:lload_1         
	//   19   36:aload_3         
	//   20   37:iconst_2        
	//   21   38:invokevirtual   #40  <Method String Matcher.group(int)>
	//   22   41:bipush          16
	//   23   43:invokestatic    #46  <Method Long Long.valueOf(String, int)>
	//   24   46:invokevirtual   #50  <Method long Long.longValue()>
	//   25   49:lload_1         
	//   26   50:lsub            
	//   27   51:aload_3         
	//   28   52:iconst_3        
	//   29   53:invokevirtual   #40  <Method String Matcher.group(int)>
	//   30   56:aload_3         
	//   31   57:iconst_4        
	//   32   58:invokevirtual   #40  <Method String Matcher.group(int)>
	//   33   61:invokespecial   #55  <Method void ProcMapEntry(long, long, String, String)>
	//   34   64:astore_3        
		}
	//*  35   65:aload_3         
	//*  36   66:areturn         
	//*  37   67:invokestatic    #61  <Method Logger Fabric.getLogger()>
	//*  38   70:astore_3        
	//*  39   71:new             #63  <Class StringBuilder>
	//*  40   74:dup             
	//*  41   75:invokespecial   #64  <Method void StringBuilder()>
	//*  42   78:astore          4
	//*  43   80:aload           4
	//*  44   82:ldc1            #66  <String "Could not parse map entry: ">
	//*  45   84:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//*  46   87:pop             
	//*  47   88:aload           4
	//*  48   90:aload_0         
	//*  49   91:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//*  50   94:pop             
	//*  51   95:aload_3         
	//*  52   96:ldc1            #72  <String "CrashlyticsCore">
	//*  53   98:aload           4
	//*  54  100:invokevirtual   #76  <Method String StringBuilder.toString()>
	//*  55  103:invokeinterface #82  <Method void Logger.d(String, String)>
	//*  56  108:aconst_null     
	//*  57  109:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			obj = ((Object) (Fabric.getLogger()));
			stringbuilder = new StringBuilder();
			stringbuilder.append("Could not parse map entry: ");
			stringbuilder.append(s);
			((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
			return null;
		}
		return ((ProcMapEntry) (obj));
	//*  58  110:astore_3        
	//*  59  111:goto            67
	}

	private static final Pattern MAP_REGEX = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

	static 
	{
	//    0    0:ldc1            #10  <String "\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)">
	//    1    2:invokestatic    #16  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #18  <Field Pattern MAP_REGEX>
	//*   3    8:return          
	}
}
