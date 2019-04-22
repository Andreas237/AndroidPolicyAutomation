// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp.plugins;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.facebook.stetho.dumpapp.*;
import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class SharedPreferencesDumperPlugin
	implements DumperPlugin
{
	private static final class Type extends Enum
	{

		public static StringBuilder appendNamesList(StringBuilder stringbuilder, String s)
		{
			Type atype[] = values();
		//    0    0:invokestatic    #71  <Method SharedPreferencesDumperPlugin$Type[] values()>
		//    1    3:astore          5
			int j = atype.length;
		//    2    5:aload           5
		//    3    7:arraylength     
		//    4    8:istore          4
			int i = 0;
		//    5   10:iconst_0        
		//    6   11:istore_2        
			boolean flag = true;
		//    7   12:iconst_1        
		//    8   13:istore_3        
			for(; i < j; i++)
		//*   9   14:iload_2         
		//*  10   15:iload           4
		//*  11   17:icmpge          58
			{
				Type type = atype[i];
		//   12   20:aload           5
		//   13   22:iload_2         
		//   14   23:aaload          
		//   15   24:astore          6
				if(flag)
		//*  16   26:iload_3         
		//*  17   27:ifeq            35
					flag = false;
		//   18   30:iconst_0        
		//   19   31:istore_3        
				else
		//*  20   32:goto            41
					stringbuilder.append(s);
		//   21   35:aload_0         
		//   22   36:aload_1         
		//   23   37:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   24   40:pop             
				stringbuilder.append(type.name);
		//   25   41:aload_0         
		//   26   42:aload           6
		//   27   44:getfield        #63  <Field String name>
		//   28   47:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   29   50:pop             
			}

		//   30   51:iload_2         
		//   31   52:iconst_1        
		//   32   53:iadd            
		//   33   54:istore_2        
		//*  34   55:goto            14
			return stringbuilder;
		//   35   58:aload_0         
		//   36   59:areturn         
		}

		public static Type of(String s)
		{
			Type atype[] = values();
		//    0    0:invokestatic    #71  <Method SharedPreferencesDumperPlugin$Type[] values()>
		//    1    3:astore_3        
			int j = atype.length;
		//    2    4:aload_3         
		//    3    5:arraylength     
		//    4    6:istore_2        
			for(int i = 0; i < j; i++)
		//*   5    7:iconst_0        
		//*   6    8:istore_1        
		//*   7    9:iload_1         
		//*   8   10:iload_2         
		//*   9   11:icmpge          41
			{
				Type type = atype[i];
		//   10   14:aload_3         
		//   11   15:iload_1         
		//   12   16:aaload          
		//   13   17:astore          4
				if(type.name.equals(((Object) (s))))
		//*  14   19:aload           4
		//*  15   21:getfield        #63  <Field String name>
		//*  16   24:aload_0         
		//*  17   25:invokevirtual   #86  <Method boolean String.equals(Object)>
		//*  18   28:ifeq            34
					return type;
		//   19   31:aload           4
		//   20   33:areturn         
			}

		//   21   34:iload_1         
		//   22   35:iconst_1        
		//   23   36:iadd            
		//   24   37:istore_1        
		//*  25   38:goto            9
			return null;
		//   26   41:aconst_null     
		//   27   42:areturn         
		}

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/facebook/stetho/dumpapp/plugins/SharedPreferencesDumperPlugin$Type, s);
		//    0    0:ldc1            #2   <Class SharedPreferencesDumperPlugin$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #91  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SharedPreferencesDumperPlugin$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #57  <Field SharedPreferencesDumperPlugin$Type[] $VALUES>
		//    1    3:invokevirtual   #96  <Method Object _5B_Lcom.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$Type_3B_.clone()>
		//    2    6:checkcast       #92  <Class SharedPreferencesDumperPlugin$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type BOOLEAN;
		public static final Type FLOAT;
		public static final Type INT;
		public static final Type LONG;
		public static final Type SET;
		public static final Type STRING;
		private final String name;

		static 
		{
			BOOLEAN = new Type("BOOLEAN", 0, "boolean");
		//    0    0:new             #2   <Class SharedPreferencesDumperPlugin$Type>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "BOOLEAN">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "boolean">
		//    5    9:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
		//    6   12:putstatic       #30  <Field SharedPreferencesDumperPlugin$Type BOOLEAN>
			INT = new Type("INT", 1, "int");
		//    7   15:new             #2   <Class SharedPreferencesDumperPlugin$Type>
		//    8   18:dup             
		//    9   19:ldc1            #31  <String "INT">
		//   10   21:iconst_1        
		//   11   22:ldc1            #33  <String "int">
		//   12   24:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
		//   13   27:putstatic       #35  <Field SharedPreferencesDumperPlugin$Type INT>
			LONG = new Type("LONG", 2, "long");
		//   14   30:new             #2   <Class SharedPreferencesDumperPlugin$Type>
		//   15   33:dup             
		//   16   34:ldc1            #36  <String "LONG">
		//   17   36:iconst_2        
		//   18   37:ldc1            #38  <String "long">
		//   19   39:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
		//   20   42:putstatic       #40  <Field SharedPreferencesDumperPlugin$Type LONG>
			FLOAT = new Type("FLOAT", 3, "float");
		//   21   45:new             #2   <Class SharedPreferencesDumperPlugin$Type>
		//   22   48:dup             
		//   23   49:ldc1            #41  <String "FLOAT">
		//   24   51:iconst_3        
		//   25   52:ldc1            #43  <String "float">
		//   26   54:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
		//   27   57:putstatic       #45  <Field SharedPreferencesDumperPlugin$Type FLOAT>
			STRING = new Type("STRING", 4, "string");
		//   28   60:new             #2   <Class SharedPreferencesDumperPlugin$Type>
		//   29   63:dup             
		//   30   64:ldc1            #46  <String "STRING">
		//   31   66:iconst_4        
		//   32   67:ldc1            #48  <String "string">
		//   33   69:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
		//   34   72:putstatic       #50  <Field SharedPreferencesDumperPlugin$Type STRING>
			SET = new Type("SET", 5, "set");
		//   35   75:new             #2   <Class SharedPreferencesDumperPlugin$Type>
		//   36   78:dup             
		//   37   79:ldc1            #51  <String "SET">
		//   38   81:iconst_5        
		//   39   82:ldc1            #53  <String "set">
		//   40   84:invokespecial   #28  <Method void SharedPreferencesDumperPlugin$Type(String, int, String)>
		//   41   87:putstatic       #55  <Field SharedPreferencesDumperPlugin$Type SET>
			$VALUES = (new Type[] {
				BOOLEAN, INT, LONG, FLOAT, STRING, SET
			});
		//   42   90:bipush          6
		//   43   92:anewarray       Type[]
		//   44   95:dup             
		//   45   96:iconst_0        
		//   46   97:getstatic       #30  <Field SharedPreferencesDumperPlugin$Type BOOLEAN>
		//   47  100:aastore         
		//   48  101:dup             
		//   49  102:iconst_1        
		//   50  103:getstatic       #35  <Field SharedPreferencesDumperPlugin$Type INT>
		//   51  106:aastore         
		//   52  107:dup             
		//   53  108:iconst_2        
		//   54  109:getstatic       #40  <Field SharedPreferencesDumperPlugin$Type LONG>
		//   55  112:aastore         
		//   56  113:dup             
		//   57  114:iconst_3        
		//   58  115:getstatic       #45  <Field SharedPreferencesDumperPlugin$Type FLOAT>
		//   59  118:aastore         
		//   60  119:dup             
		//   61  120:iconst_4        
		//   62  121:getstatic       #50  <Field SharedPreferencesDumperPlugin$Type STRING>
		//   63  124:aastore         
		//   64  125:dup             
		//   65  126:iconst_5        
		//   66  127:getstatic       #55  <Field SharedPreferencesDumperPlugin$Type SET>
		//   67  130:aastore         
		//   68  131:putstatic       #57  <Field SharedPreferencesDumperPlugin$Type[] $VALUES>
		//*  69  134:return          
		}

		private Type(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #61  <Method void Enum(String, int)>
			name = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #63  <Field String name>
		//    7   11:return          
		}
	}


	public SharedPreferencesDumperPlugin(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mAppContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #33  <Field Context mAppContext>
	//    6   12:return          
	}

	private void doPrint(PrintStream printstream, List list)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (obj)).append(mAppContext.getApplicationInfo().dataDir);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field Context mAppContext>
	//    7   13:invokevirtual   #43  <Method ApplicationInfo Context.getApplicationInfo()>
	//    8   16:getfield        #48  <Field String ApplicationInfo.dataDir>
	//    9   19:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		((StringBuilder) (obj)).append("/shared_prefs");
	//   11   23:aload_3         
	//   12   24:ldc1            #54  <String "/shared_prefs">
	//   13   26:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		String s = ((StringBuilder) (obj)).toString();
	//   15   30:aload_3         
	//   16   31:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   17   34:astore          4
		if(list.isEmpty())
	//*  18   36:aload_2         
	//*  19   37:invokeinterface #64  <Method boolean List.isEmpty()>
	//*  20   42:ifeq            51
			obj = "";
	//   21   45:ldc1            #66  <String "">
	//   22   47:astore_3        
		else
	//*  23   48:goto            62
			obj = ((Object) ((String)list.get(0)));
	//   24   51:aload_2         
	//   25   52:iconst_0        
	//   26   53:invokeinterface #70  <Method Object List.get(int)>
	//   27   58:checkcast       #72  <Class String>
	//   28   61:astore_3        
		if(list.size() > 1)
	//*  29   62:aload_2         
	//*  30   63:invokeinterface #76  <Method int List.size()>
	//*  31   68:iconst_1        
	//*  32   69:icmple          86
			list = ((List) ((String)list.get(1)));
	//   33   72:aload_2         
	//   34   73:iconst_1        
	//   35   74:invokeinterface #70  <Method Object List.get(int)>
	//   36   79:checkcast       #72  <Class String>
	//   37   82:astore_2        
		else
	//*  38   83:goto            89
			list = "";
	//   39   86:ldc1            #66  <String "">
	//   40   88:astore_2        
		printRecursive(printstream, s, "", ((String) (obj)), ((String) (list)));
	//   41   89:aload_0         
	//   42   90:aload_1         
	//   43   91:aload           4
	//   44   93:ldc1            #66  <String "">
	//   45   95:aload_3         
	//   46   96:aload_2         
	//   47   97:invokespecial   #80  <Method void printRecursive(PrintStream, String, String, String, String)>
	//   48  100:return          
	}

	private void doUsage(PrintStream printstream)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Usage: dumpapp prefs ");
	//    4    8:aload_2         
	//    5    9:ldc1            #86  <String "Usage: dumpapp prefs ">
	//    6   11:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("<command> [command-options]");
	//    8   15:aload_2         
	//    9   16:ldc1            #88  <String "<command> [command-options]">
	//   10   18:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		printstream.println(stringbuilder.toString());
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   15   27:invokevirtual   #94  <Method void PrintStream.println(String)>
		stringbuilder = new StringBuilder();
	//   16   30:new             #38  <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #39  <Method void StringBuilder()>
	//   19   37:astore_2        
		stringbuilder.append("Usage: dumpapp prefs ");
	//   20   38:aload_2         
	//   21   39:ldc1            #86  <String "Usage: dumpapp prefs ">
	//   22   41:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		stringbuilder.append("print [pathPrefix [keyPrefix]]");
	//   24   45:aload_2         
	//   25   46:ldc1            #96  <String "print [pathPrefix [keyPrefix]]">
	//   26   48:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		printstream.println(stringbuilder.toString());
	//   28   52:aload_1         
	//   29   53:aload_2         
	//   30   54:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   31   57:invokevirtual   #94  <Method void PrintStream.println(String)>
		stringbuilder = new StringBuilder("       dumpapp prefs ");
	//   32   60:new             #38  <Class StringBuilder>
	//   33   63:dup             
	//   34   64:ldc1            #98  <String "       dumpapp prefs ">
	//   35   66:invokespecial   #100 <Method void StringBuilder(String)>
	//   36   69:astore_2        
		stringbuilder.append("write <path> <key> <");
	//   37   70:aload_2         
	//   38   71:ldc1            #102 <String "write <path> <key> <">
	//   39   73:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   40   76:pop             
		stringbuilder = Type.appendNamesList(stringbuilder, "|");
	//   41   77:aload_2         
	//   42   78:ldc1            #104 <String "|">
	//   43   80:invokestatic    #108 <Method StringBuilder SharedPreferencesDumperPlugin$Type.appendNamesList(StringBuilder, String)>
	//   44   83:astore_2        
		stringbuilder.append("> <value>");
	//   45   84:aload_2         
	//   46   85:ldc1            #110 <String "> <value>">
	//   47   87:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   48   90:pop             
		printstream.println(((Object) (stringbuilder)));
	//   49   91:aload_1         
	//   50   92:aload_2         
	//   51   93:invokevirtual   #113 <Method void PrintStream.println(Object)>
		printstream.println();
	//   52   96:aload_1         
	//   53   97:invokevirtual   #115 <Method void PrintStream.println()>
		printstream.println("dumpapp prefs print: Print all matching values from the shared preferences");
	//   54  100:aload_1         
	//   55  101:ldc1            #117 <String "dumpapp prefs print: Print all matching values from the shared preferences">
	//   56  103:invokevirtual   #94  <Method void PrintStream.println(String)>
		printstream.println();
	//   57  106:aload_1         
	//   58  107:invokevirtual   #115 <Method void PrintStream.println()>
		printstream.println("dumpapp prefs write: Writes a value to the shared preferences");
	//   59  110:aload_1         
	//   60  111:ldc1            #119 <String "dumpapp prefs write: Writes a value to the shared preferences">
	//   61  113:invokevirtual   #94  <Method void PrintStream.println(String)>
	//   62  116:return          
	}

	private void doWrite(List list)
		throws DumpUsageException
	{
		list = ((List) (list.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #127 <Method Iterator List.iterator()>
	//    2    6:astore_1        
		Object obj = ((Object) (nextArg(((Iterator) (list)), "Expected <path>")));
	//    3    7:aload_1         
	//    4    8:ldc1            #129 <String "Expected <path>">
	//    5   10:invokestatic    #133 <Method String nextArg(Iterator, String)>
	//    6   13:astore          4
		String s = nextArg(((Iterator) (list)), "Expected <key>");
	//    7   15:aload_1         
	//    8   16:ldc1            #135 <String "Expected <key>">
	//    9   18:invokestatic    #133 <Method String nextArg(Iterator, String)>
	//   10   21:astore_2        
		Type type = Type.of(nextArg(((Iterator) (list)), "Expected <type>"));
	//   11   22:aload_1         
	//   12   23:ldc1            #137 <String "Expected <type>">
	//   13   25:invokestatic    #133 <Method String nextArg(Iterator, String)>
	//   14   28:invokestatic    #141 <Method SharedPreferencesDumperPlugin$Type SharedPreferencesDumperPlugin$Type.of(String)>
	//   15   31:astore_3        
		if(type != null)
	//*  16   32:aload_3         
	//*  17   33:ifnull          219
		{
			obj = ((Object) (getSharedPreferences(((String) (obj))).edit()));
	//   18   36:aload_0         
	//   19   37:aload           4
	//   20   39:invokespecial   #145 <Method SharedPreferences getSharedPreferences(String)>
	//   21   42:invokeinterface #151 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   22   47:astore          4
			static class _cls1
			{

				static final int $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[];

				static 
				{
					$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type = new int[Type.values().length];
				//    0    0:invokestatic    #18  <Method SharedPreferencesDumperPlugin$Type[] SharedPreferencesDumperPlugin$Type.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type>
					try
					{
						$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.BOOLEAN.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type>
				//    5   12:getstatic       #24  <Field SharedPreferencesDumperPlugin$Type SharedPreferencesDumperPlugin$Type.BOOLEAN>
				//    6   15:invokevirtual   #28  <Method int SharedPreferencesDumperPlugin$Type.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type>
				//*  10   23:getstatic       #31  <Field SharedPreferencesDumperPlugin$Type SharedPreferencesDumperPlugin$Type.INT>
				//*  11   26:invokevirtual   #28  <Method int SharedPreferencesDumperPlugin$Type.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type>
				//*  15   34:getstatic       #34  <Field SharedPreferencesDumperPlugin$Type SharedPreferencesDumperPlugin$Type.LONG>
				//*  16   37:invokevirtual   #28  <Method int SharedPreferencesDumperPlugin$Type.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type>
				//*  20   45:getstatic       #37  <Field SharedPreferencesDumperPlugin$Type SharedPreferencesDumperPlugin$Type.FLOAT>
				//*  21   48:invokevirtual   #28  <Method int SharedPreferencesDumperPlugin$Type.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type>
				//*  25   56:getstatic       #40  <Field SharedPreferencesDumperPlugin$Type SharedPreferencesDumperPlugin$Type.STRING>
				//*  26   59:invokevirtual   #28  <Method int SharedPreferencesDumperPlugin$Type.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type>
				//*  30   67:getstatic       #43  <Field SharedPreferencesDumperPlugin$Type SharedPreferencesDumperPlugin$Type.SET>
				//*  31   70:invokevirtual   #28  <Method int SharedPreferencesDumperPlugin$Type.ordinal()>
				//*  32   73:bipush          6
				//*  33   75:iastore         
				//*  34   76:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   35   77:astore_0        
					try
					{
						$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.INT.ordinal()] = 2;
					}
				//*  36   78:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   37   81:astore_0        
					try
					{
						$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.LONG.ordinal()] = 3;
					}
				//*  38   82:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   39   85:astore_0        
					try
					{
						$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.FLOAT.ordinal()] = 4;
					}
				//*  40   86:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   41   89:astore_0        
					try
					{
						$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.STRING.ordinal()] = 5;
					}
				//*  42   90:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   43   93:astore_0        
					try
					{
						$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.SET.ordinal()] = 6;
					}
				//*  44   94:goto            64
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   45   97:astore_0        
				//*  46   98:return          
				}
			}

			switch(_cls1..SwitchMap.com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin.Type[type.ordinal()])
	//*  23   49:getstatic       #155 <Field int[] SharedPreferencesDumperPlugin$1.$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type>
	//*  24   52:aload_3         
	//*  25   53:invokevirtual   #158 <Method int SharedPreferencesDumperPlugin$Type.ordinal()>
	//*  26   56:iaload          
			{
	//*  27   57:tableswitch     1 6: default 96
	//	               1 191
	//	               2 169
	//	               3 147
	//	               4 125
	//	               5 109
	//	               6 99
	//*  28   96:goto            210
			case 6: // '\006'
				putStringSet(((android.content.SharedPreferences.Editor) (obj)), s, ((Iterator) (list)));
	//   29   99:aload           4
	//   30  101:aload_2         
	//   31  102:aload_1         
	//   32  103:invokestatic    #162 <Method void putStringSet(android.content.SharedPreferences$Editor, String, Iterator)>
				break;

	//*  33  106:goto            210
			case 5: // '\005'
				((android.content.SharedPreferences.Editor) (obj)).putString(s, nextArgValue(((Iterator) (list))));
	//   34  109:aload           4
	//   35  111:aload_2         
	//   36  112:aload_1         
	//   37  113:invokestatic    #166 <Method String nextArgValue(Iterator)>
	//   38  116:invokeinterface #172 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   39  121:pop             
				break;

	//*  40  122:goto            210
			case 4: // '\004'
				((android.content.SharedPreferences.Editor) (obj)).putFloat(s, Float.valueOf(nextArgValue(((Iterator) (list)))).floatValue());
	//   41  125:aload           4
	//   42  127:aload_2         
	//   43  128:aload_1         
	//   44  129:invokestatic    #166 <Method String nextArgValue(Iterator)>
	//   45  132:invokestatic    #178 <Method Float Float.valueOf(String)>
	//   46  135:invokevirtual   #182 <Method float Float.floatValue()>
	//   47  138:invokeinterface #186 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   48  143:pop             
				break;

	//*  49  144:goto            210
			case 3: // '\003'
				((android.content.SharedPreferences.Editor) (obj)).putLong(s, Long.valueOf(nextArgValue(((Iterator) (list)))).longValue());
	//   50  147:aload           4
	//   51  149:aload_2         
	//   52  150:aload_1         
	//   53  151:invokestatic    #166 <Method String nextArgValue(Iterator)>
	//   54  154:invokestatic    #191 <Method Long Long.valueOf(String)>
	//   55  157:invokevirtual   #195 <Method long Long.longValue()>
	//   56  160:invokeinterface #199 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   57  165:pop             
				break;

	//*  58  166:goto            210
			case 2: // '\002'
				((android.content.SharedPreferences.Editor) (obj)).putInt(s, Integer.valueOf(nextArgValue(((Iterator) (list)))).intValue());
	//   59  169:aload           4
	//   60  171:aload_2         
	//   61  172:aload_1         
	//   62  173:invokestatic    #166 <Method String nextArgValue(Iterator)>
	//   63  176:invokestatic    #204 <Method Integer Integer.valueOf(String)>
	//   64  179:invokevirtual   #207 <Method int Integer.intValue()>
	//   65  182:invokeinterface #211 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   66  187:pop             
				break;

	//*  67  188:goto            210
			case 1: // '\001'
				((android.content.SharedPreferences.Editor) (obj)).putBoolean(s, Boolean.valueOf(nextArgValue(((Iterator) (list)))).booleanValue());
	//   68  191:aload           4
	//   69  193:aload_2         
	//   70  194:aload_1         
	//   71  195:invokestatic    #166 <Method String nextArgValue(Iterator)>
	//   72  198:invokestatic    #216 <Method Boolean Boolean.valueOf(String)>
	//   73  201:invokevirtual   #219 <Method boolean Boolean.booleanValue()>
	//   74  204:invokeinterface #223 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   75  209:pop             
				break;
			}
			((android.content.SharedPreferences.Editor) (obj)).commit();
	//   76  210:aload           4
	//   77  212:invokeinterface #226 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   78  217:pop             
			return;
	//   79  218:return          
		} else
		{
			throw new DumpUsageException(Type.appendNamesList(new StringBuilder("Usage: prefs write <path> <key> <type> <value>, where type is one of: "), ", ").toString());
	//   80  219:new             #123 <Class DumpUsageException>
	//   81  222:dup             
	//   82  223:new             #38  <Class StringBuilder>
	//   83  226:dup             
	//   84  227:ldc1            #228 <String "Usage: prefs write <path> <key> <type> <value>, where type is one of: ">
	//   85  229:invokespecial   #100 <Method void StringBuilder(String)>
	//   86  232:ldc1            #230 <String ", ">
	//   87  234:invokestatic    #108 <Method StringBuilder SharedPreferencesDumperPlugin$Type.appendNamesList(StringBuilder, String)>
	//   88  237:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   89  240:invokespecial   #231 <Method void DumpUsageException(String)>
	//   90  243:athrow          
		}
	}

	private SharedPreferences getSharedPreferences(String s)
	{
		return mAppContext.getSharedPreferences(s, 4);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Context mAppContext>
	//    2    4:aload_1         
	//    3    5:iconst_4        
	//    4    6:invokevirtual   #236 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5    9:areturn         
	}

	private static String nextArg(Iterator iterator, String s)
		throws DumpUsageException
	{
		if(iterator.hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #242 <Method boolean Iterator.hasNext()>
	//*   2    6:ifeq            19
			return (String)iterator.next();
	//    3    9:aload_0         
	//    4   10:invokeinterface #246 <Method Object Iterator.next()>
	//    5   15:checkcast       #72  <Class String>
	//    6   18:areturn         
		else
			throw new DumpUsageException(s);
	//    7   19:new             #123 <Class DumpUsageException>
	//    8   22:dup             
	//    9   23:aload_1         
	//   10   24:invokespecial   #231 <Method void DumpUsageException(String)>
	//   11   27:athrow          
	}

	private static String nextArgValue(Iterator iterator)
		throws DumpUsageException
	{
		return nextArg(iterator, "Expected <value>");
	//    0    0:aload_0         
	//    1    1:ldc1            #250 <String "Expected <value>">
	//    2    3:invokestatic    #133 <Method String nextArg(Iterator, String)>
	//    3    6:areturn         
	}

	private void printFile(PrintStream printstream, String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(s);
	//    4    9:aload           4
	//    5   11:aload_2         
	//    6   12:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(":");
	//    8   16:aload           4
	//    9   18:ldc1            #255 <String ":">
	//   10   20:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		printstream.println(stringbuilder.toString());
	//   12   24:aload_1         
	//   13   25:aload           4
	//   14   27:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   15   30:invokevirtual   #94  <Method void PrintStream.println(String)>
		s = ((String) (getSharedPreferences(s).getAll().entrySet().iterator()));
	//   16   33:aload_0         
	//   17   34:aload_2         
	//   18   35:invokespecial   #145 <Method SharedPreferences getSharedPreferences(String)>
	//   19   38:invokeinterface #259 <Method Map SharedPreferences.getAll()>
	//   20   43:invokeinterface #265 <Method Set Map.entrySet()>
	//   21   48:invokeinterface #268 <Method Iterator Set.iterator()>
	//   22   53:astore_2        
		do
		{
			if(!((Iterator) (s)).hasNext())
				break;
	//   23   54:aload_2         
	//   24   55:invokeinterface #242 <Method boolean Iterator.hasNext()>
	//   25   60:ifeq            159
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (s)).next();
	//   26   63:aload_2         
	//   27   64:invokeinterface #246 <Method Object Iterator.next()>
	//   28   69:checkcast       #270 <Class java.util.Map$Entry>
	//   29   72:astore          4
			if(((String)entry.getKey()).startsWith(s1))
	//*  30   74:aload           4
	//*  31   76:invokeinterface #273 <Method Object java.util.Map$Entry.getKey()>
	//*  32   81:checkcast       #72  <Class String>
	//*  33   84:aload_3         
	//*  34   85:invokevirtual   #277 <Method boolean String.startsWith(String)>
	//*  35   88:ifeq            54
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   36   91:new             #38  <Class StringBuilder>
	//   37   94:dup             
	//   38   95:invokespecial   #39  <Method void StringBuilder()>
	//   39   98:astore          5
				stringbuilder1.append("  ");
	//   40  100:aload           5
	//   41  102:ldc2            #279 <String "  ">
	//   42  105:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   43  108:pop             
				stringbuilder1.append((String)entry.getKey());
	//   44  109:aload           5
	//   45  111:aload           4
	//   46  113:invokeinterface #273 <Method Object java.util.Map$Entry.getKey()>
	//   47  118:checkcast       #72  <Class String>
	//   48  121:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   49  124:pop             
				stringbuilder1.append(" = ");
	//   50  125:aload           5
	//   51  127:ldc2            #281 <String " = ">
	//   52  130:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   53  133:pop             
				stringbuilder1.append(entry.getValue());
	//   54  134:aload           5
	//   55  136:aload           4
	//   56  138:invokeinterface #284 <Method Object java.util.Map$Entry.getValue()>
	//   57  143:invokevirtual   #287 <Method StringBuilder StringBuilder.append(Object)>
	//   58  146:pop             
				printstream.println(stringbuilder1.toString());
	//   59  147:aload_1         
	//   60  148:aload           5
	//   61  150:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   62  153:invokevirtual   #94  <Method void PrintStream.println(String)>
			}
		} while(true);
	//   63  156:goto            54
	//   64  159:return          
	}

	private void printRecursive(PrintStream printstream, String s, String s1, String s2, String s3)
	{
		File file = new File(s, s1);
	//    0    0:new             #289 <Class File>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #292 <Method void File(String, String)>
	//    5    9:astore          8
		boolean flag = file.isFile();
	//    6   11:aload           8
	//    7   13:invokevirtual   #295 <Method boolean File.isFile()>
	//    8   16:istore          7
		int i = 0;
	//    9   18:iconst_0        
	//   10   19:istore          6
		if(flag)
	//*  11   21:iload           7
	//*  12   23:ifeq            54
		{
			if(s1.endsWith(".xml"))
	//*  13   26:aload_3         
	//*  14   27:ldc1            #18  <String ".xml">
	//*  15   29:invokevirtual   #298 <Method boolean String.endsWith(String)>
	//*  16   32:ifeq            173
			{
				printFile(printstream, s1.substring(0, s1.length() - 4), s3);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:aload_3         
	//   20   38:iconst_0        
	//   21   39:aload_3         
	//   22   40:invokevirtual   #301 <Method int String.length()>
	//   23   43:iconst_4        
	//   24   44:isub            
	//   25   45:invokevirtual   #305 <Method String String.substring(int, int)>
	//   26   48:aload           5
	//   27   50:invokespecial   #307 <Method void printFile(PrintStream, String, String)>
				return;
	//   28   53:return          
			}
		} else
		if(file.isDirectory())
	//*  29   54:aload           8
	//*  30   56:invokevirtual   #310 <Method boolean File.isDirectory()>
	//*  31   59:ifeq            173
		{
			String as[] = file.list();
	//   32   62:aload           8
	//   33   64:invokevirtual   #314 <Method String[] File.list()>
	//   34   67:astore          9
			if(as != null)
	//*  35   69:aload           9
	//*  36   71:ifnull          173
				for(; i < as.length; i++)
	//*  37   74:iload           6
	//*  38   76:aload           9
	//*  39   78:arraylength     
	//*  40   79:icmpge          173
				{
					Object obj;
					if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  41   82:aload_3         
	//*  42   83:invokestatic    #319 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  43   86:ifeq            99
					{
						obj = ((Object) (as[i]));
	//   44   89:aload           9
	//   45   91:iload           6
	//   46   93:aaload          
	//   47   94:astore          8
					} else
	//*  48   96:goto            142
					{
						obj = ((Object) (new StringBuilder()));
	//   49   99:new             #38  <Class StringBuilder>
	//   50  102:dup             
	//   51  103:invokespecial   #39  <Method void StringBuilder()>
	//   52  106:astore          8
						((StringBuilder) (obj)).append(s1);
	//   53  108:aload           8
	//   54  110:aload_3         
	//   55  111:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   56  114:pop             
						((StringBuilder) (obj)).append(File.separator);
	//   57  115:aload           8
	//   58  117:getstatic       #322 <Field String File.separator>
	//   59  120:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   60  123:pop             
						((StringBuilder) (obj)).append(as[i]);
	//   61  124:aload           8
	//   62  126:aload           9
	//   63  128:iload           6
	//   64  130:aaload          
	//   65  131:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   66  134:pop             
						obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   67  135:aload           8
	//   68  137:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   69  140:astore          8
					}
					if(((String) (obj)).startsWith(s2))
	//*  70  142:aload           8
	//*  71  144:aload           4
	//*  72  146:invokevirtual   #277 <Method boolean String.startsWith(String)>
	//*  73  149:ifeq            164
						printRecursive(printstream, s, ((String) (obj)), s2, s3);
	//   74  152:aload_0         
	//   75  153:aload_1         
	//   76  154:aload_2         
	//   77  155:aload           8
	//   78  157:aload           4
	//   79  159:aload           5
	//   80  161:invokespecial   #80  <Method void printRecursive(PrintStream, String, String, String, String)>
				}

	//   81  164:iload           6
	//   82  166:iconst_1        
	//   83  167:iadd            
	//   84  168:istore          6
		}
	//*  85  170:goto            74
	//   86  173:return          
	}

	private static void putStringSet(android.content.SharedPreferences.Editor editor, String s, Iterator iterator)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #327 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #328 <Method void HashSet()>
	//    3    7:astore_3        
		for(; iterator.hasNext(); hashset.add(iterator.next()));
	//    4    8:aload_2         
	//    5    9:invokeinterface #242 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            31
	//    7   17:aload_3         
	//    8   18:aload_2         
	//    9   19:invokeinterface #246 <Method Object Iterator.next()>
	//   10   24:invokevirtual   #332 <Method boolean HashSet.add(Object)>
	//   11   27:pop             
	//*  12   28:goto            8
		editor.putStringSet(s, ((Set) (hashset)));
	//   13   31:aload_0         
	//   14   32:aload_1         
	//   15   33:aload_3         
	//   16   34:invokeinterface #335 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   17   39:pop             
	//   18   40:return          
	}

	public void dump(DumperContext dumpercontext)
		throws DumpUsageException
	{
		PrintStream printstream = dumpercontext.getStdout();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #345 <Method PrintStream DumperContext.getStdout()>
	//    2    4:astore_2        
		List list = dumpercontext.getArgsAsList();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #349 <Method List DumperContext.getArgsAsList()>
	//    5    9:astore_3        
		if(list.isEmpty())
	//*   6   10:aload_3         
	//*   7   11:invokeinterface #64  <Method boolean List.isEmpty()>
	//*   8   16:ifeq            25
			dumpercontext = "";
	//    9   19:ldc1            #66  <String "">
	//   10   21:astore_1        
		else
	//*  11   22:goto            36
			dumpercontext = ((DumperContext) ((String)list.remove(0)));
	//   12   25:aload_3         
	//   13   26:iconst_0        
	//   14   27:invokeinterface #352 <Method Object List.remove(int)>
	//   15   32:checkcast       #72  <Class String>
	//   16   35:astore_1        
		if(((String) (dumpercontext)).equals("print"))
	//*  17   36:aload_1         
	//*  18   37:ldc2            #354 <String "print">
	//*  19   40:invokevirtual   #357 <Method boolean String.equals(Object)>
	//*  20   43:ifeq            53
		{
			doPrint(printstream, list);
	//   21   46:aload_0         
	//   22   47:aload_2         
	//   23   48:aload_3         
	//   24   49:invokespecial   #359 <Method void doPrint(PrintStream, List)>
			return;
	//   25   52:return          
		}
		if(((String) (dumpercontext)).equals("write"))
	//*  26   53:aload_1         
	//*  27   54:ldc2            #361 <String "write">
	//*  28   57:invokevirtual   #357 <Method boolean String.equals(Object)>
	//*  29   60:ifeq            69
		{
			doWrite(list);
	//   30   63:aload_0         
	//   31   64:aload_3         
	//   32   65:invokespecial   #363 <Method void doWrite(List)>
			return;
	//   33   68:return          
		} else
		{
			doUsage(printstream);
	//   34   69:aload_0         
	//   35   70:aload_2         
	//   36   71:invokespecial   #365 <Method void doUsage(PrintStream)>
			return;
	//   37   74:return          
		}
	}

	public String getName()
	{
		return "prefs";
	//    0    0:ldc1            #15  <String "prefs">
	//    1    2:areturn         
	}

	private static final String NAME = "prefs";
	private static final String XML_SUFFIX = ".xml";
	private final Context mAppContext;
}
