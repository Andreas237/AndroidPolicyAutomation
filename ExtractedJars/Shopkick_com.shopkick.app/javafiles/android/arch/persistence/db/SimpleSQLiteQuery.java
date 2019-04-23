// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db;


// Referenced classes of package android.arch.persistence.db:
//			SupportSQLiteQuery, SupportSQLiteProgram

public final class SimpleSQLiteQuery
	implements SupportSQLiteQuery
{

	public SimpleSQLiteQuery(String s)
	{
		this(s, ((Object []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #16  <Method void SimpleSQLiteQuery(String, Object[])>
	//    4    6:return          
	}

	public SimpleSQLiteQuery(String s, Object aobj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mQuery = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field String mQuery>
		mBindArgs = aobj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Object[] mBindArgs>
	//    8   14:return          
	}

	private static void bind(SupportSQLiteProgram supportsqliteprogram, int i, Object obj)
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
		{
			supportsqliteprogram.bindNull(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokeinterface #33  <Method void SupportSQLiteProgram.bindNull(int)>
			return;
	//    5   11:return          
		}
		if(obj instanceof byte[])
	//*   6   12:aload_2         
	//*   7   13:instanceof      #35  <Class byte[]>
	//*   8   16:ifeq            31
		{
			supportsqliteprogram.bindBlob(i, (byte[])obj);
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:checkcast       #35  <Class byte[]>
	//   13   25:invokeinterface #39  <Method void SupportSQLiteProgram.bindBlob(int, byte[])>
			return;
	//   14   30:return          
		}
		if(obj instanceof Float)
	//*  15   31:aload_2         
	//*  16   32:instanceof      #41  <Class Float>
	//*  17   35:ifeq            54
		{
			supportsqliteprogram.bindDouble(i, ((Float)obj).floatValue());
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:aload_2         
	//   21   41:checkcast       #41  <Class Float>
	//   22   44:invokevirtual   #45  <Method float Float.floatValue()>
	//   23   47:f2d             
	//   24   48:invokeinterface #49  <Method void SupportSQLiteProgram.bindDouble(int, double)>
			return;
	//   25   53:return          
		}
		if(obj instanceof Double)
	//*  26   54:aload_2         
	//*  27   55:instanceof      #51  <Class Double>
	//*  28   58:ifeq            76
		{
			supportsqliteprogram.bindDouble(i, ((Double)obj).doubleValue());
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:aload_2         
	//   32   64:checkcast       #51  <Class Double>
	//   33   67:invokevirtual   #55  <Method double Double.doubleValue()>
	//   34   70:invokeinterface #49  <Method void SupportSQLiteProgram.bindDouble(int, double)>
			return;
	//   35   75:return          
		}
		if(obj instanceof Long)
	//*  36   76:aload_2         
	//*  37   77:instanceof      #57  <Class Long>
	//*  38   80:ifeq            98
		{
			supportsqliteprogram.bindLong(i, ((Long)obj).longValue());
	//   39   83:aload_0         
	//   40   84:iload_1         
	//   41   85:aload_2         
	//   42   86:checkcast       #57  <Class Long>
	//   43   89:invokevirtual   #61  <Method long Long.longValue()>
	//   44   92:invokeinterface #65  <Method void SupportSQLiteProgram.bindLong(int, long)>
			return;
	//   45   97:return          
		}
		if(obj instanceof Integer)
	//*  46   98:aload_2         
	//*  47   99:instanceof      #67  <Class Integer>
	//*  48  102:ifeq            121
		{
			supportsqliteprogram.bindLong(i, ((Integer)obj).intValue());
	//   49  105:aload_0         
	//   50  106:iload_1         
	//   51  107:aload_2         
	//   52  108:checkcast       #67  <Class Integer>
	//   53  111:invokevirtual   #71  <Method int Integer.intValue()>
	//   54  114:i2l             
	//   55  115:invokeinterface #65  <Method void SupportSQLiteProgram.bindLong(int, long)>
			return;
	//   56  120:return          
		}
		if(obj instanceof Short)
	//*  57  121:aload_2         
	//*  58  122:instanceof      #73  <Class Short>
	//*  59  125:ifeq            144
		{
			supportsqliteprogram.bindLong(i, ((Short)obj).shortValue());
	//   60  128:aload_0         
	//   61  129:iload_1         
	//   62  130:aload_2         
	//   63  131:checkcast       #73  <Class Short>
	//   64  134:invokevirtual   #77  <Method short Short.shortValue()>
	//   65  137:i2l             
	//   66  138:invokeinterface #65  <Method void SupportSQLiteProgram.bindLong(int, long)>
			return;
	//   67  143:return          
		}
		if(obj instanceof Byte)
	//*  68  144:aload_2         
	//*  69  145:instanceof      #79  <Class Byte>
	//*  70  148:ifeq            167
		{
			supportsqliteprogram.bindLong(i, ((Byte)obj).byteValue());
	//   71  151:aload_0         
	//   72  152:iload_1         
	//   73  153:aload_2         
	//   74  154:checkcast       #79  <Class Byte>
	//   75  157:invokevirtual   #83  <Method byte Byte.byteValue()>
	//   76  160:i2l             
	//   77  161:invokeinterface #65  <Method void SupportSQLiteProgram.bindLong(int, long)>
			return;
	//   78  166:return          
		}
		if(obj instanceof String)
	//*  79  167:aload_2         
	//*  80  168:instanceof      #85  <Class String>
	//*  81  171:ifeq            186
		{
			supportsqliteprogram.bindString(i, (String)obj);
	//   82  174:aload_0         
	//   83  175:iload_1         
	//   84  176:aload_2         
	//   85  177:checkcast       #85  <Class String>
	//   86  180:invokeinterface #89  <Method void SupportSQLiteProgram.bindString(int, String)>
			return;
	//   87  185:return          
		}
		if(obj instanceof Boolean)
	//*  88  186:aload_2         
	//*  89  187:instanceof      #91  <Class Boolean>
	//*  90  190:ifeq            219
		{
			long l;
			if(((Boolean)obj).booleanValue())
	//*  91  193:aload_2         
	//*  92  194:checkcast       #91  <Class Boolean>
	//*  93  197:invokevirtual   #95  <Method boolean Boolean.booleanValue()>
	//*  94  200:ifeq            208
				l = 1L;
	//   95  203:lconst_1        
	//   96  204:lstore_3        
			else
	//*  97  205:goto            210
				l = 0L;
	//   98  208:lconst_0        
	//   99  209:lstore_3        
			supportsqliteprogram.bindLong(i, l);
	//  100  210:aload_0         
	//  101  211:iload_1         
	//  102  212:lload_3         
	//  103  213:invokeinterface #65  <Method void SupportSQLiteProgram.bindLong(int, long)>
			return;
	//  104  218:return          
		} else
		{
			supportsqliteprogram = ((SupportSQLiteProgram) (new StringBuilder()));
	//  105  219:new             #97  <Class StringBuilder>
	//  106  222:dup             
	//  107  223:invokespecial   #98  <Method void StringBuilder()>
	//  108  226:astore_0        
			((StringBuilder) (supportsqliteprogram)).append("Cannot bind ");
	//  109  227:aload_0         
	//  110  228:ldc1            #100 <String "Cannot bind ">
	//  111  230:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  112  233:pop             
			((StringBuilder) (supportsqliteprogram)).append(obj);
	//  113  234:aload_0         
	//  114  235:aload_2         
	//  115  236:invokevirtual   #107 <Method StringBuilder StringBuilder.append(Object)>
	//  116  239:pop             
			((StringBuilder) (supportsqliteprogram)).append(" at index ");
	//  117  240:aload_0         
	//  118  241:ldc1            #109 <String " at index ">
	//  119  243:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  120  246:pop             
			((StringBuilder) (supportsqliteprogram)).append(i);
	//  121  247:aload_0         
	//  122  248:iload_1         
	//  123  249:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//  124  252:pop             
			((StringBuilder) (supportsqliteprogram)).append(" Supported types: null, byte[], float, double, long, int, short, byte,");
	//  125  253:aload_0         
	//  126  254:ldc1            #114 <String " Supported types: null, byte[], float, double, long, int, short, byte,">
	//  127  256:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  128  259:pop             
			((StringBuilder) (supportsqliteprogram)).append(" string");
	//  129  260:aload_0         
	//  130  261:ldc1            #116 <String " string">
	//  131  263:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  132  266:pop             
			throw new IllegalArgumentException(((StringBuilder) (supportsqliteprogram)).toString());
	//  133  267:new             #118 <Class IllegalArgumentException>
	//  134  270:dup             
	//  135  271:aload_0         
	//  136  272:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  137  275:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//  138  278:athrow          
		}
	}

	public static void bind(SupportSQLiteProgram supportsqliteprogram, Object aobj[])
	{
		if(aobj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int j = aobj.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore_3        
		for(int i = 0; i < j;)
	//*   6    8:iconst_0        
	//*   7    9:istore_2        
	//*   8   10:iload_2         
	//*   9   11:iload_3         
	//*  10   12:icmpge          34
		{
			Object obj = aobj[i];
	//   11   15:aload_1         
	//   12   16:iload_2         
	//   13   17:aaload          
	//   14   18:astore          4
			i++;
	//   15   20:iload_2         
	//   16   21:iconst_1        
	//   17   22:iadd            
	//   18   23:istore_2        
			bind(supportsqliteprogram, i, obj);
	//   19   24:aload_0         
	//   20   25:iload_2         
	//   21   26:aload           4
	//   22   28:invokestatic    #127 <Method void bind(SupportSQLiteProgram, int, Object)>
		}

	//*  23   31:goto            10
	//   24   34:return          
	}

	public void bindTo(SupportSQLiteProgram supportsqliteprogram)
	{
		bind(supportsqliteprogram, mBindArgs);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field Object[] mBindArgs>
	//    3    5:invokestatic    #131 <Method void bind(SupportSQLiteProgram, Object[])>
	//    4    8:return          
	}

	public int getArgCount()
	{
		Object aobj[] = mBindArgs;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object[] mBindArgs>
	//    2    4:astore_1        
		if(aobj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return aobj.length;
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:ireturn         
	}

	public String getSql()
	{
		return mQuery;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String mQuery>
	//    2    4:areturn         
	}

	private final Object mBindArgs[];
	private final String mQuery;
}
