// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.table.GeneratedTableMapper;
import co.touchlab.squeaky.table.TableInfo;
import java.sql.SQLException;
import java.util.*;

// Referenced classes of package co.touchlab.squeaky.dao:
//			SqueakyContext

public class DaoHelper
{
	public static class ValBuilder
	{

		public ValBuilder add(String s, Object obj)
		{
			vals.put(((Object) (s)), obj);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map vals>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #28  <Method Object Map.put(Object, Object)>
		//    5   11:pop             
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public Map build()
		{
			return vals;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map vals>
		//    2    4:areturn         
		}

		Map vals;

		public ValBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			vals = ((Map) (new HashMap()));
		//    2    4:aload_0         
		//    3    5:new             #16  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #17  <Method void HashMap()>
		//    6   12:putfield        #19  <Field Map vals>
		//    7   15:return          
		}
	}


	public DaoHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static Dao.ForeignRefresh[] fillForeignRefreshMap(SqueakyContext squeakycontext, FieldType fieldtype, int i)
		throws SQLException
	{
		if(i == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return fillForeignRefreshMap(squeakycontext, squeakycontext.getGeneratedTableMapper(fieldtype.getFieldType()).getTableConfig().getFieldTypes(), i);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #22  <Method Class FieldType.getFieldType()>
	//    8   12:invokevirtual   #28  <Method GeneratedTableMapper SqueakyContext.getGeneratedTableMapper(Class)>
	//    9   15:invokeinterface #34  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   10   20:invokevirtual   #40  <Method FieldType[] TableInfo.getFieldTypes()>
	//   11   23:iload_2         
	//   12   24:invokestatic    #43  <Method Dao$ForeignRefresh[] fillForeignRefreshMap(SqueakyContext, FieldType[], int)>
	//   13   27:areturn         
	}

	public static Dao.ForeignRefresh[] fillForeignRefreshMap(SqueakyContext squeakycontext, Class class1, int i)
		throws SQLException
	{
		return fillForeignRefreshMap(squeakycontext, squeakycontext.getGeneratedTableMapper(class1).getTableConfig().getFieldTypes(), i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #28  <Method GeneratedTableMapper SqueakyContext.getGeneratedTableMapper(Class)>
	//    4    6:invokeinterface #34  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    5   11:invokevirtual   #40  <Method FieldType[] TableInfo.getFieldTypes()>
	//    6   14:iload_2         
	//    7   15:invokestatic    #43  <Method Dao$ForeignRefresh[] fillForeignRefreshMap(SqueakyContext, FieldType[], int)>
	//    8   18:areturn         
	}

	public static Dao.ForeignRefresh[] fillForeignRefreshMap(SqueakyContext squeakycontext, FieldType afieldtype[], int i)
		throws SQLException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #47  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void ArrayList()>
	//    3    7:astore          5
		int k = afieldtype.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore          4
		for(int j = 0; j < k; j++)
	//*   7   13:iconst_0        
	//*   8   14:istore_3        
	//*   9   15:iload_3         
	//*  10   16:iload           4
	//*  11   18:icmpge          78
		{
			FieldType fieldtype = afieldtype[j];
	//   12   21:aload_1         
	//   13   22:iload_3         
	//   14   23:aaload          
	//   15   24:astore          6
			if(fieldtype.isForeign() && fieldtype.isForeignAutoRefresh())
	//*  16   26:aload           6
	//*  17   28:invokevirtual   #52  <Method boolean FieldType.isForeign()>
	//*  18   31:ifeq            71
	//*  19   34:aload           6
	//*  20   36:invokevirtual   #55  <Method boolean FieldType.isForeignAutoRefresh()>
	//*  21   39:ifeq            71
				((List) (arraylist)).add(((Object) (new Dao.ForeignRefresh(fieldtype.getFieldName(), fillForeignRefreshMap(squeakycontext, fieldtype, i - 1)))));
	//   22   42:aload           5
	//   23   44:new             #57  <Class Dao$ForeignRefresh>
	//   24   47:dup             
	//   25   48:aload           6
	//   26   50:invokevirtual   #61  <Method String FieldType.getFieldName()>
	//   27   53:aload_0         
	//   28   54:aload           6
	//   29   56:iload_2         
	//   30   57:iconst_1        
	//   31   58:isub            
	//   32   59:invokestatic    #63  <Method Dao$ForeignRefresh[] fillForeignRefreshMap(SqueakyContext, FieldType, int)>
	//   33   62:invokespecial   #66  <Method void Dao$ForeignRefresh(String, Dao$ForeignRefresh[])>
	//   34   65:invokeinterface #72  <Method boolean List.add(Object)>
	//   35   70:pop             
		}

	//   36   71:iload_3         
	//   37   72:iconst_1        
	//   38   73:iadd            
	//   39   74:istore_3        
	//*  40   75:goto            15
		if(((List) (arraylist)).size() == 0)
	//*  41   78:aload           5
	//*  42   80:invokeinterface #76  <Method int List.size()>
	//*  43   85:ifne            90
			return null;
	//   44   88:aconst_null     
	//   45   89:areturn         
		else
			return (Dao.ForeignRefresh[])((List) (arraylist)).toArray(((Object []) (new Dao.ForeignRefresh[((List) (arraylist)).size()])));
	//   46   90:aload           5
	//   47   92:aload           5
	//   48   94:invokeinterface #76  <Method int List.size()>
	//   49   99:anewarray       Dao.ForeignRefresh[]
	//   50  102:invokeinterface #80  <Method Object[] List.toArray(Object[])>
	//   51  107:checkcast       #82  <Class Dao$ForeignRefresh[]>
	//   52  110:areturn         
	}

	public static Dao.ForeignRefresh findRefresh(Dao.ForeignRefresh aforeignrefresh[], String s)
	{
		int j = aforeignrefresh.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          37
		{
			Dao.ForeignRefresh foreignrefresh = aforeignrefresh[i];
	//    8   10:aload_0         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			if(foreignrefresh.field.equals(((Object) (s))))
	//*  12   15:aload           4
	//*  13   17:getfield        #88  <Field String Dao$ForeignRefresh.field>
	//*  14   20:aload_1         
	//*  15   21:invokevirtual   #93  <Method boolean String.equals(Object)>
	//*  16   24:ifeq            30
				return foreignrefresh;
	//   17   27:aload           4
	//   18   29:areturn         
		}

	//   19   30:iload_2         
	//   20   31:iconst_1        
	//   21   32:iadd            
	//   22   33:istore_2        
	//*  23   34:goto            5
		return null;
	//   24   37:aconst_null     
	//   25   38:areturn         
	}

	public static Dao.ForeignRefresh[] refresh(String s)
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #47  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void ArrayList()>
	//    3    7:astore          6
		int i1 = 0;
	//    4    9:iconst_0        
	//    5   10:istore          4
		int l = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		int k = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		while(k < s.length()) 
	//*  10   16:iload_2         
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #98  <Method int String.length()>
	//*  13   21:icmpge          125
		{
			int i;
			int j1;
			if(i1 == 0 && s.charAt(k) == ',')
	//*  14   24:iload           4
	//*  15   26:ifne            77
	//*  16   29:aload_0         
	//*  17   30:iload_2         
	//*  18   31:invokevirtual   #102 <Method char String.charAt(int)>
	//*  19   34:bipush          44
	//*  20   36:icmpne          77
			{
				((List) (obj)).add(((Object) (s.substring(l, k).trim())));
	//   21   39:aload           6
	//   22   41:aload_0         
	//   23   42:iload_3         
	//   24   43:iload_2         
	//   25   44:invokevirtual   #106 <Method String String.substring(int, int)>
	//   26   47:invokevirtual   #109 <Method String String.trim()>
	//   27   50:invokeinterface #72  <Method boolean List.add(Object)>
	//   28   55:pop             
				j1 = k + 1;
	//   29   56:iload_2         
	//   30   57:iconst_1        
	//   31   58:iadd            
	//   32   59:istore          5
				i = i1;
	//   33   61:iload           4
	//   34   63:istore_1        
			} else
	//*  35   64:iload_2         
	//*  36   65:iconst_1        
	//*  37   66:iadd            
	//*  38   67:istore_2        
	//*  39   68:iload_1         
	//*  40   69:istore          4
	//*  41   71:iload           5
	//*  42   73:istore_3        
	//*  43   74:goto            16
			if(s.charAt(k) == '[')
	//*  44   77:aload_0         
	//*  45   78:iload_2         
	//*  46   79:invokevirtual   #102 <Method char String.charAt(int)>
	//*  47   82:bipush          91
	//*  48   84:icmpne          98
			{
				i = i1 + 1;
	//   49   87:iload           4
	//   50   89:iconst_1        
	//   51   90:iadd            
	//   52   91:istore_1        
				j1 = l;
	//   53   92:iload_3         
	//   54   93:istore          5
			} else
	//*  55   95:goto            64
			{
				i = i1;
	//   56   98:iload           4
	//   57  100:istore_1        
				j1 = l;
	//   58  101:iload_3         
	//   59  102:istore          5
				if(s.charAt(k) == ']')
	//*  60  104:aload_0         
	//*  61  105:iload_2         
	//*  62  106:invokevirtual   #102 <Method char String.charAt(int)>
	//*  63  109:bipush          93
	//*  64  111:icmpne          64
				{
					i = i1 - 1;
	//   65  114:iload           4
	//   66  116:iconst_1        
	//   67  117:isub            
	//   68  118:istore_1        
					j1 = l;
	//   69  119:iload_3         
	//   70  120:istore          5
				}
			}
			k++;
			i1 = i;
			l = j1;
		}
	//*  71  122:goto            64
		if(i1 != 0)
	//*  72  125:iload           4
	//*  73  127:ifeq            157
			throw new RuntimeException((new StringBuilder()).append("Bad refresh format ").append(s).toString());
	//   74  130:new             #111 <Class RuntimeException>
	//   75  133:dup             
	//   76  134:new             #113 <Class StringBuilder>
	//   77  137:dup             
	//   78  138:invokespecial   #114 <Method void StringBuilder()>
	//   79  141:ldc1            #116 <String "Bad refresh format ">
	//   80  143:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   81  146:aload_0         
	//   82  147:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   83  150:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   84  153:invokespecial   #126 <Method void RuntimeException(String)>
	//   85  156:athrow          
		((List) (obj)).add(((Object) (s.substring(l).trim())));
	//   86  157:aload           6
	//   87  159:aload_0         
	//   88  160:iload_3         
	//   89  161:invokevirtual   #129 <Method String String.substring(int)>
	//   90  164:invokevirtual   #109 <Method String String.trim()>
	//   91  167:invokeinterface #72  <Method boolean List.add(Object)>
	//   92  172:pop             
		s = ((String) (new ArrayList(((List) (obj)).size())));
	//   93  173:new             #47  <Class ArrayList>
	//   94  176:dup             
	//   95  177:aload           6
	//   96  179:invokeinterface #76  <Method int List.size()>
	//   97  184:invokespecial   #132 <Method void ArrayList(int)>
	//   98  187:astore_0        
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  99  188:aload           6
	//* 100  190:invokeinterface #136 <Method Iterator List.iterator()>
	//* 101  195:astore          6
	//* 102  197:aload           6
	//* 103  199:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//* 104  204:ifeq            298
		{
			String s1 = (String)((Iterator) (obj)).next();
	//  105  207:aload           6
	//  106  209:invokeinterface #145 <Method Object Iterator.next()>
	//  107  214:checkcast       #90  <Class String>
	//  108  217:astore          7
			if(s1.contains("["))
	//* 109  219:aload           7
	//* 110  221:ldc1            #147 <String "[">
	//* 111  223:invokevirtual   #151 <Method boolean String.contains(CharSequence)>
	//* 112  226:ifeq            279
			{
				int j = s1.indexOf('[');
	//  113  229:aload           7
	//  114  231:bipush          91
	//  115  233:invokevirtual   #155 <Method int String.indexOf(int)>
	//  116  236:istore_1        
				((List) (s)).add(((Object) (new Dao.ForeignRefresh(s1.substring(0, j), refresh(s1.substring(j + 1, s1.length() - 1))))));
	//  117  237:aload_0         
	//  118  238:new             #57  <Class Dao$ForeignRefresh>
	//  119  241:dup             
	//  120  242:aload           7
	//  121  244:iconst_0        
	//  122  245:iload_1         
	//  123  246:invokevirtual   #106 <Method String String.substring(int, int)>
	//  124  249:aload           7
	//  125  251:iload_1         
	//  126  252:iconst_1        
	//  127  253:iadd            
	//  128  254:aload           7
	//  129  256:invokevirtual   #98  <Method int String.length()>
	//  130  259:iconst_1        
	//  131  260:isub            
	//  132  261:invokevirtual   #106 <Method String String.substring(int, int)>
	//  133  264:invokestatic    #157 <Method Dao$ForeignRefresh[] refresh(String)>
	//  134  267:invokespecial   #66  <Method void Dao$ForeignRefresh(String, Dao$ForeignRefresh[])>
	//  135  270:invokeinterface #72  <Method boolean List.add(Object)>
	//  136  275:pop             
			} else
	//* 137  276:goto            197
			{
				((List) (s)).add(((Object) (new Dao.ForeignRefresh(s1))));
	//  138  279:aload_0         
	//  139  280:new             #57  <Class Dao$ForeignRefresh>
	//  140  283:dup             
	//  141  284:aload           7
	//  142  286:invokespecial   #158 <Method void Dao$ForeignRefresh(String)>
	//  143  289:invokeinterface #72  <Method boolean List.add(Object)>
	//  144  294:pop             
			}
		}

	//* 145  295:goto            197
		return (Dao.ForeignRefresh[])((List) (s)).toArray(((Object []) (new Dao.ForeignRefresh[((List) (s)).size()])));
	//  146  298:aload_0         
	//  147  299:aload_0         
	//  148  300:invokeinterface #76  <Method int List.size()>
	//  149  305:anewarray       Dao.ForeignRefresh[]
	//  150  308:invokeinterface #80  <Method Object[] List.toArray(Object[])>
	//  151  313:checkcast       #82  <Class Dao$ForeignRefresh[]>
	//  152  316:areturn         
	}

	public static ValBuilder vals()
	{
		return new ValBuilder();
	//    0    0:new             #6   <Class DaoHelper$ValBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #161 <Method void DaoHelper$ValBuilder()>
	//    3    7:areturn         
	}
}
