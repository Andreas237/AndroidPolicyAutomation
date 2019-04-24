// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.table;

import co.touchlab.squeaky.field.*;
import java.sql.SQLException;

public class TableInfo
{

	public TableInfo(Class class1, String s, FieldsEnum afieldsenum[], ForeignCollectionInfo aforeigncollectioninfo[])
		throws SQLException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		super();
	//    2    3:aload_0         
	//    3    4:invokespecial   #23  <Method void Object()>
		dataClass = class1;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:putfield        #25  <Field Class dataClass>
		tableName = s;
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:putfield        #27  <Field String tableName>
		fieldTypes = new FieldType[afieldsenum.length];
	//   10   17:aload_0         
	//   11   18:aload_3         
	//   12   19:arraylength     
	//   13   20:anewarray       FieldType[]
	//   14   23:putfield        #31  <Field FieldType[] fieldTypes>
		int l = afieldsenum.length;
	//   15   26:aload_3         
	//   16   27:arraylength     
	//   17   28:istore          8
		int k = 0;
	//   18   30:iconst_0        
	//   19   31:istore          6
		for(int i = 0; k < l; i++)
	//*  20   33:iconst_0        
	//*  21   34:istore          5
	//*  22   36:iload           6
	//*  23   38:iload           8
	//*  24   40:icmpge          76
		{
			class1 = ((Class) (afieldsenum[k]));
	//   25   43:aload_3         
	//   26   44:iload           6
	//   27   46:aaload          
	//   28   47:astore_1        
			fieldTypes[i] = ((FieldsEnum) (class1)).getFieldType();
	//   29   48:aload_0         
	//   30   49:getfield        #31  <Field FieldType[] fieldTypes>
	//   31   52:iload           5
	//   32   54:aload_1         
	//   33   55:invokeinterface #37  <Method FieldType FieldsEnum.getFieldType()>
	//   34   60:aastore         
			k++;
	//   35   61:iload           6
	//   36   63:iconst_1        
	//   37   64:iadd            
	//   38   65:istore          6
		}

	//   39   67:iload           5
	//   40   69:iconst_1        
	//   41   70:iadd            
	//   42   71:istore          5
	//*  43   73:goto            36
		foreignCollections = aforeigncollectioninfo;
	//   44   76:aload_0         
	//   45   77:aload           4
	//   46   79:putfield        #39  <Field ForeignCollectionInfo[] foreignCollections>
		class1 = null;
	//   47   82:aconst_null     
	//   48   83:astore_1        
		aforeigncollectioninfo = ((ForeignCollectionInfo []) (fieldTypes));
	//   49   84:aload_0         
	//   50   85:getfield        #31  <Field FieldType[] fieldTypes>
	//   51   88:astore          4
		k = aforeigncollectioninfo.length;
	//   52   90:aload           4
	//   53   92:arraylength     
	//   54   93:istore          6
		for(int j = ((int) (flag)); j < k;)
	//*  55   95:iload           7
	//*  56   97:istore          5
	//*  57   99:iload           5
	//*  58  101:iload           6
	//*  59  103:icmpge          198
		{
label0:
			{
				afieldsenum = ((FieldsEnum []) (aforeigncollectioninfo[j]));
	//   60  106:aload           4
	//   61  108:iload           5
	//   62  110:aaload          
	//   63  111:astore_3        
				if(!((FieldType) (afieldsenum)).isId())
	//*  64  112:aload_3         
	//*  65  113:invokevirtual   #43  <Method boolean FieldType.isId()>
	//*  66  116:ifne            128
				{
					s = ((String) (class1));
	//   67  119:aload_1         
	//   68  120:astore_2        
					if(!((FieldType) (afieldsenum)).isGeneratedId())
						break label0;
	//   69  121:aload_3         
	//   70  122:invokevirtual   #46  <Method boolean FieldType.isGeneratedId()>
	//   71  125:ifeq            187
				}
				if(class1 != null)
	//*  72  128:aload_1         
	//*  73  129:ifnull          185
					throw new SQLException((new StringBuilder()).append("More than 1 idField configured for class ").append(((Object) (dataClass))).append(" (").append(((Object) (class1))).append(",").append(((Object) (afieldsenum))).append(")").toString());
	//   74  132:new             #20  <Class SQLException>
	//   75  135:dup             
	//   76  136:new             #48  <Class StringBuilder>
	//   77  139:dup             
	//   78  140:invokespecial   #49  <Method void StringBuilder()>
	//   79  143:ldc1            #51  <String "More than 1 idField configured for class ">
	//   80  145:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   81  148:aload_0         
	//   82  149:getfield        #25  <Field Class dataClass>
	//   83  152:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   84  155:ldc1            #60  <String " (">
	//   85  157:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   86  160:aload_1         
	//   87  161:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   88  164:ldc1            #62  <String ",">
	//   89  166:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   90  169:aload_3         
	//   91  170:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   92  173:ldc1            #64  <String ")">
	//   93  175:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   94  178:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   95  181:invokespecial   #71  <Method void SQLException(String)>
	//   96  184:athrow          
				s = ((String) (afieldsenum));
	//   97  185:aload_3         
	//   98  186:astore_2        
			}
			j++;
	//   99  187:iload           5
	//  100  189:iconst_1        
	//  101  190:iadd            
	//  102  191:istore          5
			class1 = ((Class) (s));
	//  103  193:aload_2         
	//  104  194:astore_1        
		}

	//* 105  195:goto            99
		idField = ((FieldType) (class1));
	//  106  198:aload_0         
	//  107  199:aload_1         
	//  108  200:putfield        #73  <Field FieldType idField>
	//  109  203:return          
	}

	public FieldType[] getFieldTypes()
	{
		return fieldTypes;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field FieldType[] fieldTypes>
	//    2    4:areturn         
	}

	public ForeignCollectionInfo[] getForeignCollections()
	{
		return foreignCollections;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ForeignCollectionInfo[] foreignCollections>
	//    2    4:areturn         
	}

	public String getTableName()
	{
		return tableName;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String tableName>
	//    2    4:areturn         
	}

	public final Class dataClass;
	private final FieldType fieldTypes[];
	private final ForeignCollectionInfo foreignCollections[];
	public final FieldType idField;
	private final String tableName;
}
