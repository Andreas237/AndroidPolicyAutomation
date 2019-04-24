// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.*;

final class ExceptionUtils
{

	private ExceptionUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static String getMessage(Throwable throwable)
	{
		throwable = ((Throwable) (throwable.getLocalizedMessage()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method String Throwable.getLocalizedMessage()>
	//    2    4:astore_0        
		if(throwable == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ((String) (throwable)).replaceAll("(\r\n|\n|\f)", " ");
	//    7   11:aload_0         
	//    8   12:ldc1            #19  <String "(\r\n|\n|\f)">
	//    9   14:ldc1            #21  <String " ">
	//   10   16:invokevirtual   #27  <Method String String.replaceAll(String, String)>
	//   11   19:areturn         
	}

	public static void writeStackTrace(Context context, Throwable throwable, String s)
	{
		Context context1;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		context1 = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		context = ((Context) (new PrintWriter(((OutputStream) (context.openFileOutput(s, 0))))));
	//    4    5:new             #33  <Class PrintWriter>
	//    5    8:dup             
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:iconst_0        
	//    9   12:invokevirtual   #39  <Method java.io.FileOutputStream Context.openFileOutput(String, int)>
	//   10   15:invokespecial   #42  <Method void PrintWriter(OutputStream)>
	//   11   18:astore_0        
		try
		{
			writeStackTrace(throwable, ((Writer) (context)));
	//   12   19:aload_1         
	//   13   20:aload_0         
	//   14   21:invokestatic    #45  <Method void writeStackTrace(Throwable, Writer)>
		}
	//*  15   24:aload_0         
	//*  16   25:ldc1            #47  <String "Failed to close stack trace writer.">
	//*  17   27:invokestatic    #53  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  18   30:return          
	//*  19   31:astore_1        
	//*  20   32:aload_0         
	//*  21   33:astore_3        
	//*  22   34:aload_1         
	//*  23   35:astore_0        
	//*  24   36:goto            73
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
	//*  25   39:astore_1        
		{
			break MISSING_BLOCK_LABEL_51;
	//   26   40:goto            51
		}
		CommonUtils.closeOrLog(((java.io.Closeable) (context)), "Failed to close stack trace writer.");
		return;
		throwable;
		context1 = context;
		context = ((Context) (throwable));
		break MISSING_BLOCK_LABEL_73;
		context;
	//   27   43:astore_0        
		break MISSING_BLOCK_LABEL_73;
	//   28   44:goto            73
		throwable;
	//   29   47:astore_1        
		context = ((Context) (obj));
	//   30   48:aload           4
	//   31   50:astore_0        
		context1 = context;
	//   32   51:aload_0         
	//   33   52:astore_3        
		Fabric.getLogger().e("CrashlyticsCore", "Failed to create PrintWriter", throwable);
	//   34   53:invokestatic    #59  <Method Logger Fabric.getLogger()>
	//   35   56:ldc1            #61  <String "CrashlyticsCore">
	//   36   58:ldc1            #63  <String "Failed to create PrintWriter">
	//   37   60:aload_1         
	//   38   61:invokeinterface #69  <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeOrLog(((java.io.Closeable) (context)), "Failed to close stack trace writer.");
	//   39   66:aload_0         
	//   40   67:ldc1            #47  <String "Failed to close stack trace writer.">
	//   41   69:invokestatic    #53  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   42   72:return          
		CommonUtils.closeOrLog(((java.io.Closeable) (context1)), "Failed to close stack trace writer.");
	//   43   73:aload_3         
	//   44   74:ldc1            #47  <String "Failed to close stack trace writer.">
	//   45   76:invokestatic    #53  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw context;
	//   46   79:aload_0         
	//   47   80:athrow          
	}

	private static void writeStackTrace(Throwable throwable, OutputStream outputstream)
	{
		Object obj;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
		outputstream = ((OutputStream) (new PrintWriter(outputstream)));
	//    4    4:new             #33  <Class PrintWriter>
	//    5    7:dup             
	//    6    8:aload_1         
	//    7    9:invokespecial   #42  <Method void PrintWriter(OutputStream)>
	//    8   12:astore_1        
		try
		{
			writeStackTrace(throwable, ((Writer) (outputstream)));
	//    9   13:aload_0         
	//   10   14:aload_1         
	//   11   15:invokestatic    #45  <Method void writeStackTrace(Throwable, Writer)>
		}
	//*  12   18:aload_1         
	//*  13   19:ldc1            #47  <String "Failed to close stack trace writer.">
	//*  14   21:invokestatic    #53  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  15   24:return          
	//*  16   25:astore_0        
	//*  17   26:aload_1         
	//*  18   27:astore_2        
	//*  19   28:goto            68
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  20   31:astore_2        
		{
			throwable = ((Throwable) (outputstream));
	//   21   32:aload_1         
	//   22   33:astore_0        
			outputstream = ((OutputStream) (obj));
	//   23   34:aload_2         
	//   24   35:astore_1        
			break MISSING_BLOCK_LABEL_46;
	//   25   36:goto            46
		}
		CommonUtils.closeOrLog(((java.io.Closeable) (outputstream)), "Failed to close stack trace writer.");
		return;
		throwable;
		obj = ((Object) (outputstream));
		break MISSING_BLOCK_LABEL_68;
		throwable;
	//   26   39:astore_0        
		break MISSING_BLOCK_LABEL_68;
	//   27   40:goto            68
		outputstream;
	//   28   43:astore_1        
		throwable = ((Throwable) (obj1));
	//   29   44:aload_3         
	//   30   45:astore_0        
		obj = ((Object) (throwable));
	//   31   46:aload_0         
	//   32   47:astore_2        
		Fabric.getLogger().e("CrashlyticsCore", "Failed to create PrintWriter", ((Throwable) (outputstream)));
	//   33   48:invokestatic    #59  <Method Logger Fabric.getLogger()>
	//   34   51:ldc1            #61  <String "CrashlyticsCore">
	//   35   53:ldc1            #63  <String "Failed to create PrintWriter">
	//   36   55:aload_1         
	//   37   56:invokeinterface #69  <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeOrLog(((java.io.Closeable) (throwable)), "Failed to close stack trace writer.");
	//   38   61:aload_0         
	//   39   62:ldc1            #47  <String "Failed to close stack trace writer.">
	//   40   64:invokestatic    #53  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   41   67:return          
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close stack trace writer.");
	//   42   68:aload_2         
	//   43   69:ldc1            #47  <String "Failed to close stack trace writer.">
	//   44   71:invokestatic    #53  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw throwable;
	//   45   74:aload_0         
	//   46   75:athrow          
	}

	private static void writeStackTrace(Throwable throwable, Writer writer)
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
_L5:
		if(throwable == null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:ifnull          182
_L1:
		Object obj = ((Object) (getMessage(throwable)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #72  <Method String getMessage(Throwable)>
	//    6   10:astore          4
		String s;
		int j;
		StringBuilder stringbuilder;
		if(obj == null)
	//*   7   12:aload           4
	//*   8   14:ifnull          183
	//*   9   17:goto            187
	//*  10   20:new             #74  <Class StringBuilder>
	//*  11   23:dup             
	//*  12   24:invokespecial   #75  <Method void StringBuilder()>
	//*  13   27:astore          6
	//*  14   29:aload           6
	//*  15   31:aload           5
	//*  16   33:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  17   36:pop             
	//*  18   37:aload           6
	//*  19   39:aload_0         
	//*  20   40:invokevirtual   #83  <Method Class Object.getClass()>
	//*  21   43:invokevirtual   #88  <Method String Class.getName()>
	//*  22   46:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  23   49:pop             
	//*  24   50:aload           6
	//*  25   52:ldc1            #90  <String ": ">
	//*  26   54:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  27   57:pop             
	//*  28   58:aload           6
	//*  29   60:aload           4
	//*  30   62:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  31   65:pop             
	//*  32   66:aload           6
	//*  33   68:ldc1            #92  <String "\n">
	//*  34   70:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  35   73:pop             
	//*  36   74:aload_1         
	//*  37   75:aload           6
	//*  38   77:invokevirtual   #95  <Method String StringBuilder.toString()>
	//*  39   80:invokevirtual   #101 <Method void Writer.write(String)>
	//*  40   83:aload_0         
	//*  41   84:invokevirtual   #105 <Method StackTraceElement[] Throwable.getStackTrace()>
	//*  42   87:astore          4
	//*  43   89:aload           4
	//*  44   91:arraylength     
	//*  45   92:istore_3        
	//*  46   93:iconst_0        
	//*  47   94:istore_2        
	//*  48   95:iload_2         
	//*  49   96:iload_3         
	//*  50   97:icmpge          158
	//*  51  100:aload           4
	//*  52  102:iload_2         
	//*  53  103:aaload          
	//*  54  104:astore          5
	//*  55  106:new             #74  <Class StringBuilder>
	//*  56  109:dup             
	//*  57  110:invokespecial   #75  <Method void StringBuilder()>
	//*  58  113:astore          6
	//*  59  115:aload           6
	//*  60  117:ldc1            #107 <String "\tat ">
	//*  61  119:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  62  122:pop             
	//*  63  123:aload           6
	//*  64  125:aload           5
	//*  65  127:invokevirtual   #110 <Method String StackTraceElement.toString()>
	//*  66  130:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  67  133:pop             
	//*  68  134:aload           6
	//*  69  136:ldc1            #92  <String "\n">
	//*  70  138:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  71  141:pop             
	//*  72  142:aload_1         
	//*  73  143:aload           6
	//*  74  145:invokevirtual   #95  <Method String StringBuilder.toString()>
	//*  75  148:invokevirtual   #101 <Method void Writer.write(String)>
	//*  76  151:iload_2         
	//*  77  152:iconst_1        
	//*  78  153:iadd            
	//*  79  154:istore_2        
	//*  80  155:goto            95
	//*  81  158:aload_0         
	//*  82  159:invokevirtual   #114 <Method Throwable Throwable.getCause()>
	//*  83  162:astore_0        
	//*  84  163:iconst_0        
	//*  85  164:istore_2        
	//*  86  165:goto            2
	//*  87  168:astore_0        
	//*  88  169:invokestatic    #59  <Method Logger Fabric.getLogger()>
	//*  89  172:ldc1            #61  <String "CrashlyticsCore">
	//*  90  174:ldc1            #116 <String "Could not write stack trace">
	//*  91  176:aload_0         
	//*  92  177:invokeinterface #69  <Method void Logger.e(String, String, Throwable)>
	//*  93  182:return          
			obj = "";
	//   94  183:ldc1            #118 <String "">
	//   95  185:astore          4
		break MISSING_BLOCK_LABEL_187;
_L6:
		stringbuilder = new StringBuilder();
		stringbuilder.append(s);
		stringbuilder.append(((Object) (throwable)).getClass().getName());
		stringbuilder.append(": ");
		stringbuilder.append(((String) (obj)));
		stringbuilder.append("\n");
		writer.write(stringbuilder.toString());
		obj = ((Object) (throwable.getStackTrace()));
		j = obj.length;
		i = 0;
_L4:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		s = ((String) (obj[i]));
		stringbuilder = new StringBuilder();
		stringbuilder.append("\tat ");
		stringbuilder.append(((StackTraceElement) (s)).toString());
		stringbuilder.append("\n");
		writer.write(stringbuilder.toString());
		i++;
		if(true) goto _L4; else goto _L3
_L3:
		throwable = throwable.getCause();
		i = 0;
		  goto _L5
		throwable;
		Fabric.getLogger().e("CrashlyticsCore", "Could not write stack trace", throwable);
_L2:
		return;
		if(i != 0)
	//*  96  187:iload_2         
	//*  97  188:ifeq            198
			s = "";
	//   98  191:ldc1            #118 <String "">
	//   99  193:astore          5
		else
	//* 100  195:goto            20
			s = "Caused by: ";
	//  101  198:ldc1            #120 <String "Caused by: ">
	//  102  200:astore          5
		  goto _L6
	//* 103  202:goto            20
	}

	public static void writeStackTraceIfNotNull(Throwable throwable, OutputStream outputstream)
	{
		if(outputstream != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			writeStackTrace(throwable, outputstream);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #123 <Method void writeStackTrace(Throwable, OutputStream)>
	//    5    9:return          
	}
}
