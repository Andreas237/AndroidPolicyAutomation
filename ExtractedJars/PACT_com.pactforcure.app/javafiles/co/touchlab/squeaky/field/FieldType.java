// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;

import android.database.Cursor;
import android.text.TextUtils;
import co.touchlab.squeaky.field.types.BigDecimalStringType;
import co.touchlab.squeaky.field.types.DateStringType;
import co.touchlab.squeaky.field.types.TimeStampStringType;
import co.touchlab.squeaky.field.types.TimeStampType;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field:
//			DataType, DataPersister, FieldConverter, SqlType, 
//			BaseFieldConverter

public class FieldType
{
	protected static class BooleanNumberFieldConverter extends BaseFieldConverter
	{

		public SqlType getSqlType()
		{
			return SqlType.BOOLEAN;
		//    0    0:getstatic       #20  <Field SqlType SqlType.BOOLEAN>
		//    1    3:areturn         
		}

		public Object javaToSqlArg(FieldType fieldtype, Object obj)
		{
			if(((Boolean)obj).booleanValue())
		//*   0    0:aload_2         
		//*   1    1:checkcast       #24  <Class Boolean>
		//*   2    4:invokevirtual   #28  <Method boolean Boolean.booleanValue()>
		//*   3    7:ifeq            15
				return ((Object) (Byte.valueOf((byte)1)));
		//    4   10:iconst_1        
		//    5   11:invokestatic    #34  <Method Byte Byte.valueOf(byte)>
		//    6   14:areturn         
			else
				return ((Object) (Byte.valueOf((byte)0)));
		//    7   15:iconst_0        
		//    8   16:invokestatic    #34  <Method Byte Byte.valueOf(byte)>
		//    9   19:areturn         
		}

		public Object parseDefaultString(FieldType fieldtype, String s)
		{
			if(Boolean.parseBoolean(s))
		//*   0    0:aload_2         
		//*   1    1:invokestatic    #40  <Method boolean Boolean.parseBoolean(String)>
		//*   2    4:ifeq            12
				return ((Object) (Byte.valueOf((byte)1)));
		//    3    7:iconst_1        
		//    4    8:invokestatic    #34  <Method Byte Byte.valueOf(byte)>
		//    5   11:areturn         
			else
				return ((Object) (Byte.valueOf((byte)0)));
		//    6   12:iconst_0        
		//    7   13:invokestatic    #34  <Method Byte Byte.valueOf(byte)>
		//    8   16:areturn         
		}

		public Object resultToJava(FieldType fieldtype, Cursor cursor, int i)
			throws SQLException
		{
			return sqlArgToJava(fieldtype, resultToSqlArg(fieldtype, cursor, i), i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_0         
		//    3    3:aload_1         
		//    4    4:aload_2         
		//    5    5:iload_3         
		//    6    6:invokevirtual   #47  <Method Object resultToSqlArg(FieldType, Cursor, int)>
		//    7    9:iload_3         
		//    8   10:invokevirtual   #51  <Method Object sqlArgToJava(FieldType, Object, int)>
		//    9   13:areturn         
		}

		public Object resultToSqlArg(FieldType fieldtype, Cursor cursor, int i)
			throws SQLException
		{
			return ((Object) (Byte.valueOf((byte)cursor.getShort(i))));
		//    0    0:aload_2         
		//    1    1:iload_3         
		//    2    2:invokeinterface #58  <Method short Cursor.getShort(int)>
		//    3    7:int2byte        
		//    4    8:invokestatic    #34  <Method Byte Byte.valueOf(byte)>
		//    5   11:areturn         
		}

		public Object sqlArgToJava(FieldType fieldtype, Object obj, int i)
		{
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore          4
			if(((Byte)obj).byteValue() != 1)
		//*   2    3:aload_2         
		//*   3    4:checkcast       #30  <Class Byte>
		//*   4    7:invokevirtual   #62  <Method byte Byte.byteValue()>
		//*   5   10:iconst_1        
		//*   6   11:icmpne          20
		//*   7   14:iload           4
		//*   8   16:invokestatic    #65  <Method Boolean Boolean.valueOf(boolean)>
		//*   9   19:areturn         
				flag = false;
		//   10   20:iconst_0        
		//   11   21:istore          4
			return ((Object) (Boolean.valueOf(flag)));
		//*  12   23:goto            14
		}

		protected BooleanNumberFieldConverter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void BaseFieldConverter()>
		//    2    4:return          
		}
	}

	private static class LevelCounters
	{

		int autoRefreshLevel;
		int autoRefreshLevelMax;
		int foreignCollectionLevel;
		int foreignCollectionLevelMax;

		private LevelCounters()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	public FieldType(String s, String s1, String s2, boolean flag, boolean flag1, boolean flag2, DataType datatype, 
			Class class1, boolean flag3, String s3, boolean flag4, boolean flag5, boolean flag6, boolean flag7, 
			String s4, String s5, String s6, boolean flag8)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		fieldName = s1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #79  <Field String fieldName>
		indexNameBase = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #81  <Field String indexNameBase>
		canBeNull = flag3;
	//    8   14:aload_0         
	//    9   15:iload           9
	//   10   17:putfield        #83  <Field boolean canBeNull>
		format = s3;
	//   11   20:aload_0         
	//   12   21:aload           10
	//   13   23:putfield        #85  <Field String format>
		unique = flag4;
	//   14   26:aload_0         
	//   15   27:iload           11
	//   16   29:putfield        #87  <Field boolean unique>
		uniqueCombo = flag5;
	//   17   32:aload_0         
	//   18   33:iload           12
	//   19   35:putfield        #89  <Field boolean uniqueCombo>
		index = flag6;
	//   20   38:aload_0         
	//   21   39:iload           13
	//   22   41:putfield        #91  <Field boolean index>
		uniqueIndex = flag7;
	//   23   44:aload_0         
	//   24   45:iload           14
	//   25   47:putfield        #93  <Field boolean uniqueIndex>
		indexName = s4;
	//   26   50:aload_0         
	//   27   51:aload           15
	//   28   53:putfield        #95  <Field String indexName>
		uniqueIndexName = s5;
	//   29   56:aload_0         
	//   30   57:aload           16
	//   31   59:putfield        #97  <Field String uniqueIndexName>
		foreignAutoRefresh = flag8;
	//   32   62:aload_0         
	//   33   63:iload           18
	//   34   65:putfield        #99  <Field boolean foreignAutoRefresh>
		dataPersister = datatype.getDataPersister();
	//   35   68:aload_0         
	//   36   69:aload           7
	//   37   71:invokevirtual   #105 <Method DataPersister DataType.getDataPersister()>
	//   38   74:putfield        #107 <Field DataPersister dataPersister>
		isForeign = flag2;
	//   39   77:aload_0         
	//   40   78:iload           6
	//   41   80:putfield        #109 <Field boolean isForeign>
		dataType = datatype;
	//   42   83:aload_0         
	//   43   84:aload           7
	//   44   86:putfield        #111 <Field DataType dataType>
		fieldType = class1;
	//   45   89:aload_0         
	//   46   90:aload           8
	//   47   92:putfield        #113 <Field Class fieldType>
		columnName = s2;
	//   48   95:aload_0         
	//   49   96:aload_3         
	//   50   97:putfield        #115 <Field String columnName>
		isId = flag;
	//   51  100:aload_0         
	//   52  101:iload           4
	//   53  103:putfield        #117 <Field boolean isId>
		isGeneratedId = flag1;
	//   54  106:aload_0         
	//   55  107:iload           5
	//   56  109:putfield        #119 <Field boolean isGeneratedId>
		if((isId || isGeneratedId) && isForeign)
	//*  57  112:aload_0         
	//*  58  113:getfield        #117 <Field boolean isId>
	//*  59  116:ifne            126
	//*  60  119:aload_0         
	//*  61  120:getfield        #119 <Field boolean isGeneratedId>
	//*  62  123:ifeq            165
	//*  63  126:aload_0         
	//*  64  127:getfield        #109 <Field boolean isForeign>
	//*  65  130:ifeq            165
			throw new IllegalArgumentException((new StringBuilder()).append("Id field ").append(s1).append(" cannot also be a foreign object").toString());
	//   66  133:new             #121 <Class IllegalArgumentException>
	//   67  136:dup             
	//   68  137:new             #123 <Class StringBuilder>
	//   69  140:dup             
	//   70  141:invokespecial   #124 <Method void StringBuilder()>
	//   71  144:ldc1            #126 <String "Id field ">
	//   72  146:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   73  149:aload_2         
	//   74  150:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   75  153:ldc1            #132 <String " cannot also be a foreign object">
	//   76  155:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   77  158:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   78  161:invokespecial   #139 <Method void IllegalArgumentException(String)>
	//   79  164:athrow          
		try
		{
			assignDataType(dataPersister, s6);
	//   80  165:aload_0         
	//   81  166:aload_0         
	//   82  167:getfield        #107 <Field DataPersister dataPersister>
	//   83  170:aload           17
	//   84  172:invokespecial   #143 <Method void assignDataType(DataPersister, String)>
			return;
	//   85  175:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  86  176:astore_1        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   87  177:new             #145 <Class RuntimeException>
	//   88  180:dup             
	//   89  181:aload_1         
	//   90  182:invokespecial   #148 <Method void RuntimeException(Throwable)>
	//   91  185:athrow          
		}
	}

	private void assignDataType(DataPersister datapersister, String s)
		throws SQLException
	{
		datapersister = getDataPersister(datapersister);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #151 <Method DataPersister getDataPersister(DataPersister)>
	//    3    5:astore_1        
		dataPersister = datapersister;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #107 <Field DataPersister dataPersister>
		fieldConverter = getFieldConverter(datapersister);
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #155 <Method FieldConverter getFieldConverter(DataPersister)>
	//   11   17:putfield        #157 <Field FieldConverter fieldConverter>
		dataTypeConfigObj = datapersister.makeConfigObject(this);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:aload_0         
	//   15   23:invokeinterface #163 <Method Object DataPersister.makeConfigObject(FieldType)>
	//   16   28:putfield        #165 <Field Object dataTypeConfigObj>
		if(s == null)
	//*  17   31:aload_2         
	//*  18   32:ifnonnull       41
		{
			defaultValue = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #167 <Field Object defaultValue>
			return;
	//   22   40:return          
		}
		if(isGeneratedId)
	//*  23   41:aload_0         
	//*  24   42:getfield        #119 <Field boolean isGeneratedId>
	//*  25   45:ifeq            92
		{
			throw new SQLException((new StringBuilder()).append("Field '").append(fieldName).append("' cannot be a generatedId and have a default value '").append(s).append("'").toString());
	//   26   48:new             #76  <Class SQLException>
	//   27   51:dup             
	//   28   52:new             #123 <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #124 <Method void StringBuilder()>
	//   31   59:ldc1            #169 <String "Field '">
	//   32   61:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   33   64:aload_0         
	//   34   65:getfield        #79  <Field String fieldName>
	//   35   68:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:ldc1            #171 <String "' cannot be a generatedId and have a default value '">
	//   37   73:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   38   76:aload_2         
	//   39   77:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:ldc1            #173 <String "'">
	//   41   82:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   42   85:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   43   88:invokespecial   #174 <Method void SQLException(String)>
	//   44   91:athrow          
		} else
		{
			defaultValue = fieldConverter.parseDefaultString(this, s);
	//   45   92:aload_0         
	//   46   93:aload_0         
	//   47   94:getfield        #157 <Field FieldConverter fieldConverter>
	//   48   97:aload_0         
	//   49   98:aload_2         
	//   50   99:invokeinterface #180 <Method Object FieldConverter.parseDefaultString(FieldType, String)>
	//   51  104:putfield        #167 <Field Object defaultValue>
			return;
	//   52  107:return          
		}
	}

	private String findIndexName(String s)
	{
		if(columnName == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field String columnName>
	//*   2    4:ifnonnull       39
			return (new StringBuilder()).append(s).append("_").append(fieldName).append("_idx").toString();
	//    3    7:new             #123 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #124 <Method void StringBuilder()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:ldc1            #185 <String "_">
	//    9   20:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #79  <Field String fieldName>
	//   12   27:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:ldc1            #187 <String "_idx">
	//   14   32:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   16   38:areturn         
		else
			return (new StringBuilder()).append(s).append("_").append(columnName).append("_idx").toString();
	//   17   39:new             #123 <Class StringBuilder>
	//   18   42:dup             
	//   19   43:invokespecial   #124 <Method void StringBuilder()>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   22   50:ldc1            #185 <String "_">
	//   23   52:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   24   55:aload_0         
	//   25   56:getfield        #115 <Field String columnName>
	//   26   59:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   27   62:ldc1            #187 <String "_idx">
	//   28   64:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   29   67:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   30   70:areturn         
	}

	public Object convertJavaFieldToSqlArgValue(Object obj)
		throws SQLException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return fieldConverter.javaToSqlArg(this, obj);
	//    4    6:aload_0         
	//    5    7:getfield        #157 <Field FieldConverter fieldConverter>
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokeinterface #193 <Method Object FieldConverter.javaToSqlArg(FieldType, Object)>
	//    9   17:areturn         
	}

	public String getColumnName()
	{
		return columnName;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String columnName>
	//    2    4:areturn         
	}

	public DataPersister getDataPersister()
	{
		return dataPersister;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field DataPersister dataPersister>
	//    2    4:areturn         
	}

	public DataPersister getDataPersister(DataPersister datapersister)
	{
		if(datapersister == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		static class _cls1
		{

			static final int $SwitchMap$co$touchlab$squeaky$field$SqlType[];

			static 
			{
				$SwitchMap$co$touchlab$squeaky$field$SqlType = new int[SqlType.values().length];
			//    0    0:invokestatic    #18  <Method SqlType[] SqlType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.DATE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//    5   12:getstatic       #24  <Field SqlType SqlType.DATE>
			//    6   15:invokevirtual   #28  <Method int SqlType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  10   23:getstatic       #31  <Field SqlType SqlType.BOOLEAN>
			//*  11   26:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  15   34:getstatic       #34  <Field SqlType SqlType.BIG_DECIMAL>
			//*  16   37:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
			//*  20   43:astore_0        
			//*  21   44:return          
			//*  22   45:astore_0        
			//*  23   46:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   49:astore_0        
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BOOLEAN.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BIG_DECIMAL.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  25   50:goto            20
			}
		}

		switch(_cls1..SwitchMap.co.touchlab.squeaky.field.SqlType[datapersister.getSqlType().ordinal()])
	//*   4    6:getstatic       #198 <Field int[] FieldType$1.$SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #202 <Method SqlType DataPersister.getSqlType()>
	//*   7   15:invokevirtual   #208 <Method int SqlType.ordinal()>
	//*   8   18:iaload          
		{
	//*   9   19:tableswitch     1 1: default 36
	//	               1 38
		default:
			return datapersister;
	//   10   36:aload_1         
	//   11   37:areturn         

		case 1: // '\001'
			break;
		}
		if(datapersister instanceof TimeStampType)
	//*  12   38:aload_1         
	//*  13   39:instanceof      #210 <Class TimeStampType>
	//*  14   42:ifeq            49
			return ((DataPersister) (TimeStampStringType.getSingleton()));
	//   15   45:invokestatic    #216 <Method TimeStampStringType TimeStampStringType.getSingleton()>
	//   16   48:areturn         
		else
			return ((DataPersister) (DateStringType.getSingleton()));
	//   17   49:invokestatic    #221 <Method DateStringType DateStringType.getSingleton()>
	//   18   52:areturn         
	}

	public DataType getDataType()
	{
		return dataType;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field DataType dataType>
	//    2    4:areturn         
	}

	public Object getDataTypeConfigObj()
	{
		return dataTypeConfigObj;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field Object dataTypeConfigObj>
	//    2    4:areturn         
	}

	public Object getDefaultValue()
	{
		return defaultValue;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field Object defaultValue>
	//    2    4:areturn         
	}

	public FieldConverter getFieldConverter(DataPersister datapersister)
	{
		switch(_cls1..SwitchMap.co.touchlab.squeaky.field.SqlType[datapersister.getSqlType().ordinal()])
	//*   0    0:getstatic       #198 <Field int[] FieldType$1.$SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*   1    3:aload_1         
	//*   2    4:invokeinterface #202 <Method SqlType DataPersister.getSqlType()>
	//*   3    9:invokevirtual   #208 <Method int SqlType.ordinal()>
	//*   4   12:iaload          
		{
	//*   5   13:tableswitch     2 3: default 36
	//	               2 38
	//	               3 42
		default:
			return ((FieldConverter) (datapersister));
	//    6   36:aload_1         
	//    7   37:areturn         

		case 2: // '\002'
			return booleanConverter;
	//    8   38:getstatic       #72  <Field FieldConverter booleanConverter>
	//    9   41:areturn         

		case 3: // '\003'
			return ((FieldConverter) (BigDecimalStringType.getSingleton()));
	//   10   42:invokestatic    #231 <Method BigDecimalStringType BigDecimalStringType.getSingleton()>
	//   11   45:areturn         
		}
	}

	public String getFieldName()
	{
		return fieldName;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String fieldName>
	//    2    4:areturn         
	}

	public Class getFieldType()
	{
		return fieldType;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Class fieldType>
	//    2    4:areturn         
	}

	public String getFormat()
	{
		return format;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String format>
	//    2    4:areturn         
	}

	public String getIndexName()
	{
		return getIndexName(indexNameBase);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #81  <Field String indexNameBase>
	//    3    5:invokevirtual   #238 <Method String getIndexName(String)>
	//    4    8:areturn         
	}

	public String getIndexName(String s)
	{
		if(index && TextUtils.isEmpty(((CharSequence) (indexName))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field boolean index>
	//*   2    4:ifeq            26
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field String indexName>
	//*   5   11:invokestatic    #244 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   14:ifeq            26
			indexName = findIndexName(s);
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #246 <Method String findIndexName(String)>
	//   11   23:putfield        #95  <Field String indexName>
		return indexName;
	//   12   26:aload_0         
	//   13   27:getfield        #95  <Field String indexName>
	//   14   30:areturn         
	}

	public Object getJavaDefaultValueDefault()
	{
		if(dataType != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field DataType dataType>
	//*   2    4:ifnonnull       9
	//*   3    7:aconst_null     
	//*   4    8:areturn         
		{
			if(dataType == DataType.BOOLEAN)
	//*   5    9:aload_0         
	//*   6   10:getfield        #111 <Field DataType dataType>
	//*   7   13:getstatic       #250 <Field DataType DataType.BOOLEAN>
	//*   8   16:if_acmpne       26
				return ((Object) (Boolean.valueOf(DEFAULT_VALUE_BOOLEAN)));
	//    9   19:getstatic       #252 <Field boolean DEFAULT_VALUE_BOOLEAN>
	//   10   22:invokestatic    #258 <Method Boolean Boolean.valueOf(boolean)>
	//   11   25:areturn         
			if(dataType == DataType.BYTE || dataType == DataType.CHAR_OBJ)
	//*  12   26:aload_0         
	//*  13   27:getfield        #111 <Field DataType dataType>
	//*  14   30:getstatic       #261 <Field DataType DataType.BYTE>
	//*  15   33:if_acmpeq       46
	//*  16   36:aload_0         
	//*  17   37:getfield        #111 <Field DataType dataType>
	//*  18   40:getstatic       #264 <Field DataType DataType.CHAR_OBJ>
	//*  19   43:if_acmpne       53
				return ((Object) (Byte.valueOf(DEFAULT_VALUE_BYTE)));
	//   20   46:getstatic       #266 <Field byte DEFAULT_VALUE_BYTE>
	//   21   49:invokestatic    #271 <Method Byte Byte.valueOf(byte)>
	//   22   52:areturn         
			if(dataType == DataType.CHAR || dataType == DataType.CHAR_OBJ)
	//*  23   53:aload_0         
	//*  24   54:getfield        #111 <Field DataType dataType>
	//*  25   57:getstatic       #274 <Field DataType DataType.CHAR>
	//*  26   60:if_acmpeq       73
	//*  27   63:aload_0         
	//*  28   64:getfield        #111 <Field DataType dataType>
	//*  29   67:getstatic       #264 <Field DataType DataType.CHAR_OBJ>
	//*  30   70:if_acmpne       80
				return ((Object) (Character.valueOf(DEFAULT_VALUE_CHAR)));
	//   31   73:getstatic       #276 <Field char DEFAULT_VALUE_CHAR>
	//   32   76:invokestatic    #281 <Method Character Character.valueOf(char)>
	//   33   79:areturn         
			if(dataType == DataType.SHORT || dataType == DataType.SHORT_OBJ)
	//*  34   80:aload_0         
	//*  35   81:getfield        #111 <Field DataType dataType>
	//*  36   84:getstatic       #284 <Field DataType DataType.SHORT>
	//*  37   87:if_acmpeq       100
	//*  38   90:aload_0         
	//*  39   91:getfield        #111 <Field DataType dataType>
	//*  40   94:getstatic       #287 <Field DataType DataType.SHORT_OBJ>
	//*  41   97:if_acmpne       107
				return ((Object) (Short.valueOf(DEFAULT_VALUE_SHORT)));
	//   42  100:getstatic       #289 <Field short DEFAULT_VALUE_SHORT>
	//   43  103:invokestatic    #294 <Method Short Short.valueOf(short)>
	//   44  106:areturn         
			if(dataType == DataType.INTEGER || dataType == DataType.INTEGER_OBJ)
	//*  45  107:aload_0         
	//*  46  108:getfield        #111 <Field DataType dataType>
	//*  47  111:getstatic       #297 <Field DataType DataType.INTEGER>
	//*  48  114:if_acmpeq       127
	//*  49  117:aload_0         
	//*  50  118:getfield        #111 <Field DataType dataType>
	//*  51  121:getstatic       #300 <Field DataType DataType.INTEGER_OBJ>
	//*  52  124:if_acmpne       134
				return ((Object) (Integer.valueOf(DEFAULT_VALUE_INT)));
	//   53  127:getstatic       #302 <Field int DEFAULT_VALUE_INT>
	//   54  130:invokestatic    #307 <Method Integer Integer.valueOf(int)>
	//   55  133:areturn         
			if(dataType == DataType.LONG || dataType == DataType.LONG_OBJ)
	//*  56  134:aload_0         
	//*  57  135:getfield        #111 <Field DataType dataType>
	//*  58  138:getstatic       #310 <Field DataType DataType.LONG>
	//*  59  141:if_acmpeq       154
	//*  60  144:aload_0         
	//*  61  145:getfield        #111 <Field DataType dataType>
	//*  62  148:getstatic       #313 <Field DataType DataType.LONG_OBJ>
	//*  63  151:if_acmpne       161
				return ((Object) (Long.valueOf(DEFAULT_VALUE_LONG)));
	//   64  154:getstatic       #315 <Field long DEFAULT_VALUE_LONG>
	//   65  157:invokestatic    #320 <Method Long Long.valueOf(long)>
	//   66  160:areturn         
			if(dataType == DataType.FLOAT || dataType == DataType.FLOAT_OBJ)
	//*  67  161:aload_0         
	//*  68  162:getfield        #111 <Field DataType dataType>
	//*  69  165:getstatic       #323 <Field DataType DataType.FLOAT>
	//*  70  168:if_acmpeq       181
	//*  71  171:aload_0         
	//*  72  172:getfield        #111 <Field DataType dataType>
	//*  73  175:getstatic       #326 <Field DataType DataType.FLOAT_OBJ>
	//*  74  178:if_acmpne       188
				return ((Object) (Float.valueOf(DEFAULT_VALUE_FLOAT)));
	//   75  181:getstatic       #328 <Field float DEFAULT_VALUE_FLOAT>
	//   76  184:invokestatic    #333 <Method Float Float.valueOf(float)>
	//   77  187:areturn         
			if(dataType == DataType.DOUBLE || dataType == DataType.DOUBLE_OBJ)
	//*  78  188:aload_0         
	//*  79  189:getfield        #111 <Field DataType dataType>
	//*  80  192:getstatic       #336 <Field DataType DataType.DOUBLE>
	//*  81  195:if_acmpeq       208
	//*  82  198:aload_0         
	//*  83  199:getfield        #111 <Field DataType dataType>
	//*  84  202:getstatic       #339 <Field DataType DataType.DOUBLE_OBJ>
	//*  85  205:if_acmpne       7
				return ((Object) (Double.valueOf(DEFAULT_VALUE_DOUBLE)));
	//   86  208:getstatic       #341 <Field double DEFAULT_VALUE_DOUBLE>
	//   87  211:invokestatic    #346 <Method Double Double.valueOf(double)>
	//   88  214:areturn         
		}
		return ((Object) (null));
	}

	public SqlType getSqlType()
	{
		return fieldConverter.getSqlType();
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field FieldConverter fieldConverter>
	//    2    4:invokeinterface #347 <Method SqlType FieldConverter.getSqlType()>
	//    3    9:areturn         
	}

	public String getUniqueIndexName()
	{
		return getUniqueIndexName(indexNameBase);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #81  <Field String indexNameBase>
	//    3    5:invokevirtual   #350 <Method String getUniqueIndexName(String)>
	//    4    8:areturn         
	}

	public String getUniqueIndexName(String s)
	{
		if(uniqueIndex && (uniqueIndexName == null || uniqueIndexName.equals("")))
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field boolean uniqueIndex>
	//*   2    4:ifeq            36
	//*   3    7:aload_0         
	//*   4    8:getfield        #97  <Field String uniqueIndexName>
	//*   5   11:ifnull          27
	//*   6   14:aload_0         
	//*   7   15:getfield        #97  <Field String uniqueIndexName>
	//*   8   18:ldc2            #352 <String "">
	//*   9   21:invokevirtual   #358 <Method boolean String.equals(Object)>
	//*  10   24:ifeq            36
			uniqueIndexName = findIndexName(s);
	//   11   27:aload_0         
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:invokespecial   #246 <Method String findIndexName(String)>
	//   15   33:putfield        #97  <Field String uniqueIndexName>
		return uniqueIndexName;
	//   16   36:aload_0         
	//   17   37:getfield        #97  <Field String uniqueIndexName>
	//   18   40:areturn         
	}

	public boolean isCanBeNull()
	{
		return canBeNull;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean canBeNull>
	//    2    4:ireturn         
	}

	public boolean isComparable()
		throws SQLException
	{
		if(dataPersister == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field DataPersister dataPersister>
	//*   2    4:ifnonnull       35
			throw new SQLException((new StringBuilder()).append("Internal error.  Data-persister is not configured for field.  Please post _full_ exception with associated data objects to mailing list: ").append(((Object) (this))).toString());
	//    3    7:new             #76  <Class SQLException>
	//    4   10:dup             
	//    5   11:new             #123 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #124 <Method void StringBuilder()>
	//    8   18:ldc2            #363 <String "Internal error.  Data-persister is not configured for field.  Please post _full_ exception with associated data objects to mailing list: ">
	//    9   21:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #366 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   13   31:invokespecial   #174 <Method void SQLException(String)>
	//   14   34:athrow          
		else
			return dataPersister.isComparable();
	//   15   35:aload_0         
	//   16   36:getfield        #107 <Field DataPersister dataPersister>
	//   17   39:invokeinterface #368 <Method boolean DataPersister.isComparable()>
	//   18   44:ireturn         
	}

	public boolean isEscapedDefaultValue()
	{
		return dataPersister.isEscapedDefaultValue();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field DataPersister dataPersister>
	//    2    4:invokeinterface #371 <Method boolean DataPersister.isEscapedDefaultValue()>
	//    3    9:ireturn         
	}

	public boolean isEscapedValue()
	{
		return dataPersister.isEscapedValue();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field DataPersister dataPersister>
	//    2    4:invokeinterface #374 <Method boolean DataPersister.isEscapedValue()>
	//    3    9:ireturn         
	}

	public boolean isForeign()
	{
		return isForeign;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field boolean isForeign>
	//    2    4:ireturn         
	}

	public boolean isForeignAutoRefresh()
	{
		return foreignAutoRefresh;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean foreignAutoRefresh>
	//    2    4:ireturn         
	}

	public boolean isGeneratedId()
	{
		return isGeneratedId;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field boolean isGeneratedId>
	//    2    4:ireturn         
	}

	public boolean isId()
	{
		return isId;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field boolean isId>
	//    2    4:ireturn         
	}

	public boolean isUnique()
	{
		return unique;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean unique>
	//    2    4:ireturn         
	}

	public boolean isUniqueCombo()
	{
		return uniqueCombo;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field boolean uniqueCombo>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(":name=").append(fieldName).append(",type=").append(((Object) (dataType))).toString();
	//    0    0:new             #123 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #380 <Method Class Object.getClass()>
	//    5   11:invokevirtual   #385 <Method String Class.getSimpleName()>
	//    6   14:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc2            #387 <String ":name=">
	//    8   20:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:aload_0         
	//   10   24:getfield        #79  <Field String fieldName>
	//   11   27:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   12   30:ldc2            #389 <String ",type=">
	//   13   33:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   14   36:aload_0         
	//   15   37:getfield        #111 <Field DataType dataType>
	//   16   40:invokevirtual   #366 <Method StringBuilder StringBuilder.append(Object)>
	//   17   43:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   18   46:areturn         
	}

	private static boolean DEFAULT_VALUE_BOOLEAN = false;
	private static byte DEFAULT_VALUE_BYTE = 0;
	private static char DEFAULT_VALUE_CHAR = 0;
	private static double DEFAULT_VALUE_DOUBLE = 0D;
	private static float DEFAULT_VALUE_FLOAT = 0F;
	private static int DEFAULT_VALUE_INT = 0;
	private static long DEFAULT_VALUE_LONG = 0L;
	private static short DEFAULT_VALUE_SHORT = 0;
	public static final String FOREIGN_ID_FIELD_SUFFIX = "_id";
	private static final FieldConverter booleanConverter = new BooleanNumberFieldConverter();
	private final boolean canBeNull;
	private final String columnName;
	private DataPersister dataPersister;
	private final DataType dataType;
	private Object dataTypeConfigObj;
	private Object defaultValue;
	private FieldConverter fieldConverter;
	private final String fieldName;
	private final Class fieldType;
	private final boolean foreignAutoRefresh;
	private final String format;
	private final boolean index;
	private String indexName;
	private String indexNameBase;
	private final boolean isForeign;
	private final boolean isGeneratedId;
	private final boolean isId;
	private final boolean unique;
	private final boolean uniqueCombo;
	private final boolean uniqueIndex;
	private String uniqueIndexName;

	static 
	{
	//    0    0:new             #8   <Class FieldType$BooleanNumberFieldConverter>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void FieldType$BooleanNumberFieldConverter()>
	//    3    7:putstatic       #72  <Field FieldConverter booleanConverter>
	//*   4   10:return          
	}
}
