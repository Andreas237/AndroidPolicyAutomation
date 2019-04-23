// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.content.Context;

public class Room
{

	public Room()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static RoomDatabase.Builder databaseBuilder(Context context, Class class1, String s)
	{
		if(s != null && s.trim().length() != 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          25
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #28  <Method String String.trim()>
	//*   4    8:invokevirtual   #32  <Method int String.length()>
	//*   5   11:ifeq            25
			return new RoomDatabase.Builder(context, class1, s);
	//    6   14:new             #34  <Class RoomDatabase$Builder>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #37  <Method void RoomDatabase$Builder(Context, Class, String)>
	//   12   24:areturn         
		else
			throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
	//   13   25:new             #39  <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:ldc1            #41  <String "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder">
	//   16   31:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   17   34:athrow          
	}

	static Object getGeneratedImplementation(Class class1, String s)
	{
		String s1;
		String s2;
		s2 = class1.getPackage().getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method Package Class.getPackage()>
	//    2    4:invokevirtual   #67  <Method String Package.getName()>
	//    3    7:astore_3        
		s1 = class1.getCanonicalName();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #70  <Method String Class.getCanonicalName()>
	//    6   12:astore_2        
		if(!s2.isEmpty())
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #74  <Method boolean String.isEmpty()>
	//*   9   17:ifeq            23
	//*  10   20:goto            34
			s1 = s1.substring(s2.length() + 1);
	//   11   23:aload_2         
	//   12   24:aload_3         
	//   13   25:invokevirtual   #32  <Method int String.length()>
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:invokevirtual   #78  <Method String String.substring(int)>
	//   17   33:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   18   34:new             #80  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #81  <Method void StringBuilder()>
	//   21   41:astore          4
		stringbuilder.append(s1.replace('.', '_'));
	//   22   43:aload           4
	//   23   45:aload_2         
	//   24   46:bipush          46
	//   25   48:bipush          95
	//   26   50:invokevirtual   #85  <Method String String.replace(char, char)>
	//   27   53:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append(s);
	//   29   57:aload           4
	//   30   59:aload_1         
	//   31   60:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
		s1 = stringbuilder.toString();
	//   33   64:aload           4
	//   34   66:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   35   69:astore_2        
		if(s2.isEmpty())
	//*  36   70:aload_3         
	//*  37   71:invokevirtual   #74  <Method boolean String.isEmpty()>
	//*  38   74:ifeq            82
		{
			s = s1;
	//   39   77:aload_2         
	//   40   78:astore_1        
			break MISSING_BLOCK_LABEL_114;
	//   41   79:goto            114
		}
		s = ((String) (new StringBuilder()));
	//   42   82:new             #80  <Class StringBuilder>
	//   43   85:dup             
	//   44   86:invokespecial   #81  <Method void StringBuilder()>
	//   45   89:astore_1        
		((StringBuilder) (s)).append(s2);
	//   46   90:aload_1         
	//   47   91:aload_3         
	//   48   92:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   49   95:pop             
		((StringBuilder) (s)).append(".");
	//   50   96:aload_1         
	//   51   97:ldc1            #94  <String ".">
	//   52   99:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   53  102:pop             
		((StringBuilder) (s)).append(s1);
	//   54  103:aload_1         
	//   55  104:aload_2         
	//   56  105:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   57  108:pop             
		s = ((StringBuilder) (s)).toString();
	//   58  109:aload_1         
	//   59  110:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   60  113:astore_1        
		s = ((String) (Class.forName(s).newInstance()));
	//   61  114:aload_1         
	//   62  115:invokestatic    #98  <Method Class Class.forName(String)>
	//   63  118:invokevirtual   #102 <Method Object Class.newInstance()>
	//   64  121:astore_1        
		return ((Object) (s));
	//   65  122:aload_1         
	//   66  123:areturn         
_L6:
		s = ((String) (new StringBuilder()));
	//   67  124:new             #80  <Class StringBuilder>
	//   68  127:dup             
	//   69  128:invokespecial   #81  <Method void StringBuilder()>
	//   70  131:astore_1        
		((StringBuilder) (s)).append("Failed to create an instance of ");
	//   71  132:aload_1         
	//   72  133:ldc1            #104 <String "Failed to create an instance of ">
	//   73  135:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   74  138:pop             
		((StringBuilder) (s)).append(class1.getCanonicalName());
	//   75  139:aload_1         
	//   76  140:aload_0         
	//   77  141:invokevirtual   #70  <Method String Class.getCanonicalName()>
	//   78  144:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   79  147:pop             
		throw new RuntimeException(((StringBuilder) (s)).toString());
	//   80  148:new             #106 <Class RuntimeException>
	//   81  151:dup             
	//   82  152:aload_1         
	//   83  153:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   84  156:invokespecial   #107 <Method void RuntimeException(String)>
	//   85  159:athrow          
_L4:
		s = ((String) (new StringBuilder()));
	//   86  160:new             #80  <Class StringBuilder>
	//   87  163:dup             
	//   88  164:invokespecial   #81  <Method void StringBuilder()>
	//   89  167:astore_1        
		((StringBuilder) (s)).append("Cannot access the constructor");
	//   90  168:aload_1         
	//   91  169:ldc1            #109 <String "Cannot access the constructor">
	//   92  171:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   93  174:pop             
		((StringBuilder) (s)).append(class1.getCanonicalName());
	//   94  175:aload_1         
	//   95  176:aload_0         
	//   96  177:invokevirtual   #70  <Method String Class.getCanonicalName()>
	//   97  180:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   98  183:pop             
		throw new RuntimeException(((StringBuilder) (s)).toString());
	//   99  184:new             #106 <Class RuntimeException>
	//  100  187:dup             
	//  101  188:aload_1         
	//  102  189:invokevirtual   #92  <Method String StringBuilder.toString()>
	//  103  192:invokespecial   #107 <Method void RuntimeException(String)>
	//  104  195:athrow          
_L2:
		s = ((String) (new StringBuilder()));
	//  105  196:new             #80  <Class StringBuilder>
	//  106  199:dup             
	//  107  200:invokespecial   #81  <Method void StringBuilder()>
	//  108  203:astore_1        
		((StringBuilder) (s)).append("cannot find implementation for ");
	//  109  204:aload_1         
	//  110  205:ldc1            #111 <String "cannot find implementation for ">
	//  111  207:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  112  210:pop             
		((StringBuilder) (s)).append(class1.getCanonicalName());
	//  113  211:aload_1         
	//  114  212:aload_0         
	//  115  213:invokevirtual   #70  <Method String Class.getCanonicalName()>
	//  116  216:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  117  219:pop             
		((StringBuilder) (s)).append(". ");
	//  118  220:aload_1         
	//  119  221:ldc1            #113 <String ". ">
	//  120  223:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  121  226:pop             
		((StringBuilder) (s)).append(s1);
	//  122  227:aload_1         
	//  123  228:aload_2         
	//  124  229:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  125  232:pop             
		((StringBuilder) (s)).append(" does not exist");
	//  126  233:aload_1         
	//  127  234:ldc1            #115 <String " does not exist">
	//  128  236:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  129  239:pop             
		throw new RuntimeException(((StringBuilder) (s)).toString());
	//  130  240:new             #106 <Class RuntimeException>
	//  131  243:dup             
	//  132  244:aload_1         
	//  133  245:invokevirtual   #92  <Method String StringBuilder.toString()>
	//  134  248:invokespecial   #107 <Method void RuntimeException(String)>
	//  135  251:athrow          
		s;
	//  136  252:astore_1        
		if(true) goto _L2; else goto _L1
	//  137  253:goto            196
_L1:
		s;
	//  138  256:astore_1        
		if(true) goto _L4; else goto _L3
	//  139  257:goto            160
_L3:
		s;
	//  140  260:astore_1        
		if(true) goto _L6; else goto _L5
_L5:
	//* 141  261:goto            124
	}

	public static RoomDatabase.Builder inMemoryDatabaseBuilder(Context context, Class class1)
	{
		return new RoomDatabase.Builder(context, class1, ((String) (null)));
	//    0    0:new             #34  <Class RoomDatabase$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #37  <Method void RoomDatabase$Builder(Context, Class, String)>
	//    6   10:areturn         
	}

	private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";
	static final String LOG_TAG = "ROOM";
	public static final String MASTER_TABLE_NAME = "room_master_table";
}
