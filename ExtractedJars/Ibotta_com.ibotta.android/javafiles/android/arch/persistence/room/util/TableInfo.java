// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room.util;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.database.Cursor;
import java.util.*;

public class TableInfo
{
	public static class Column
	{

		private static int findAffinity(String s)
		{
			if(s == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return 5;
		//    2    4:iconst_5        
		//    3    5:ireturn         
			s = s.toUpperCase(Locale.US);
		//    4    6:aload_0         
		//    5    7:getstatic       #43  <Field Locale Locale.US>
		//    6   10:invokevirtual   #49  <Method String String.toUpperCase(Locale)>
		//    7   13:astore_0        
			if(s.contains("INT"))
		//*   8   14:aload_0         
		//*   9   15:ldc1            #51  <String "INT">
		//*  10   17:invokevirtual   #55  <Method boolean String.contains(CharSequence)>
		//*  11   20:ifeq            25
				return 3;
		//   12   23:iconst_3        
		//   13   24:ireturn         
			if(!s.contains("CHAR") && !s.contains("CLOB") && !s.contains("TEXT"))
		//*  14   25:aload_0         
		//*  15   26:ldc1            #57  <String "CHAR">
		//*  16   28:invokevirtual   #55  <Method boolean String.contains(CharSequence)>
		//*  17   31:ifne            100
		//*  18   34:aload_0         
		//*  19   35:ldc1            #59  <String "CLOB">
		//*  20   37:invokevirtual   #55  <Method boolean String.contains(CharSequence)>
		//*  21   40:ifne            100
		//*  22   43:aload_0         
		//*  23   44:ldc1            #61  <String "TEXT">
		//*  24   46:invokevirtual   #55  <Method boolean String.contains(CharSequence)>
		//*  25   49:ifeq            55
		//*  26   52:goto            100
			{
				if(s.contains("BLOB"))
		//*  27   55:aload_0         
		//*  28   56:ldc1            #63  <String "BLOB">
		//*  29   58:invokevirtual   #55  <Method boolean String.contains(CharSequence)>
		//*  30   61:ifeq            66
					return 5;
		//   31   64:iconst_5        
		//   32   65:ireturn         
				return !s.contains("REAL") && !s.contains("FLOA") && !s.contains("DOUB") ? 1 : 4;
		//   33   66:aload_0         
		//   34   67:ldc1            #65  <String "REAL">
		//   35   69:invokevirtual   #55  <Method boolean String.contains(CharSequence)>
		//   36   72:ifne            98
		//   37   75:aload_0         
		//   38   76:ldc1            #67  <String "FLOA">
		//   39   78:invokevirtual   #55  <Method boolean String.contains(CharSequence)>
		//   40   81:ifne            98
		//   41   84:aload_0         
		//   42   85:ldc1            #69  <String "DOUB">
		//   43   87:invokevirtual   #55  <Method boolean String.contains(CharSequence)>
		//   44   90:ifeq            96
		//   45   93:goto            98
		//   46   96:iconst_1        
		//   47   97:ireturn         
		//   48   98:iconst_4        
		//   49   99:ireturn         
			} else
			{
				return 2;
		//   50  100:iconst_2        
		//   51  101:ireturn         
			}
		}

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          107
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #77  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #77  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((Column)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class TableInfo$Column>
		//   16   28:astore_1        
				if(android.os.Build.VERSION.SDK_INT >= 20)
		//*  17   29:getstatic       #82  <Field int android.os.Build$VERSION.SDK_INT>
		//*  18   32:bipush          20
		//*  19   34:icmplt          50
				{
					if(primaryKeyPosition != ((Column) (obj)).primaryKeyPosition)
		//*  20   37:aload_0         
		//*  21   38:getfield        #29  <Field int primaryKeyPosition>
		//*  22   41:aload_1         
		//*  23   42:getfield        #29  <Field int primaryKeyPosition>
		//*  24   45:icmpeq          63
						return false;
		//   25   48:iconst_0        
		//   26   49:ireturn         
				} else
				if(isPrimaryKey() != ((Column) (obj)).isPrimaryKey())
		//*  27   50:aload_0         
		//*  28   51:invokevirtual   #86  <Method boolean isPrimaryKey()>
		//*  29   54:aload_1         
		//*  30   55:invokevirtual   #86  <Method boolean isPrimaryKey()>
		//*  31   58:icmpeq          63
					return false;
		//   32   61:iconst_0        
		//   33   62:ireturn         
				if(!name.equals(((Object) (((Column) (obj)).name))))
		//*  34   63:aload_0         
		//*  35   64:getfield        #23  <Field String name>
		//*  36   67:aload_1         
		//*  37   68:getfield        #23  <Field String name>
		//*  38   71:invokevirtual   #88  <Method boolean String.equals(Object)>
		//*  39   74:ifne            79
					return false;
		//   40   77:iconst_0        
		//   41   78:ireturn         
				if(notNull != ((Column) (obj)).notNull)
		//*  42   79:aload_0         
		//*  43   80:getfield        #27  <Field boolean notNull>
		//*  44   83:aload_1         
		//*  45   84:getfield        #27  <Field boolean notNull>
		//*  46   87:icmpeq          92
					return false;
		//   47   90:iconst_0        
		//   48   91:ireturn         
				return affinity == ((Column) (obj)).affinity;
		//   49   92:aload_0         
		//   50   93:getfield        #35  <Field int affinity>
		//   51   96:aload_1         
		//   52   97:getfield        #35  <Field int affinity>
		//   53  100:icmpne          105
		//   54  103:iconst_1        
		//   55  104:ireturn         
		//   56  105:iconst_0        
		//   57  106:ireturn         
			} else
			{
				return false;
		//   58  107:iconst_0        
		//   59  108:ireturn         
			}
		}

		public int hashCode()
		{
			int i = name.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String name>
		//    2    4:invokevirtual   #92  <Method int String.hashCode()>
		//    3    7:istore_2        
			int j = affinity;
		//    4    8:aload_0         
		//    5    9:getfield        #35  <Field int affinity>
		//    6   12:istore_3        
			char c;
			if(notNull)
		//*   7   13:aload_0         
		//*   8   14:getfield        #27  <Field boolean notNull>
		//*   9   17:ifeq            27
				c = '\u04CF';
		//   10   20:sipush          1231
		//   11   23:istore_1        
			else
		//*  12   24:goto            31
				c = '\u04D5';
		//   13   27:sipush          1237
		//   14   30:istore_1        
			return ((i * 31 + j) * 31 + c) * 31 + primaryKeyPosition;
		//   15   31:iload_2         
		//   16   32:bipush          31
		//   17   34:imul            
		//   18   35:iload_3         
		//   19   36:iadd            
		//   20   37:bipush          31
		//   21   39:imul            
		//   22   40:iload_1         
		//   23   41:iadd            
		//   24   42:bipush          31
		//   25   44:imul            
		//   26   45:aload_0         
		//   27   46:getfield        #29  <Field int primaryKeyPosition>
		//   28   49:iadd            
		//   29   50:ireturn         
		}

		public boolean isPrimaryKey()
		{
			return primaryKeyPosition > 0;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int primaryKeyPosition>
		//    2    4:ifle            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #96  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #97  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("Column{name='");
		//    4    8:aload_1         
		//    5    9:ldc1            #99  <String "Column{name='">
		//    6   11:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(name);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #23  <Field String name>
		//   11   20:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append('\'');
		//   13   24:aload_1         
		//   14   25:bipush          39
		//   15   27:invokevirtual   #106 <Method StringBuilder StringBuilder.append(char)>
		//   16   30:pop             
			stringbuilder.append(", type='");
		//   17   31:aload_1         
		//   18   32:ldc1            #108 <String ", type='">
		//   19   34:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   20   37:pop             
			stringbuilder.append(type);
		//   21   38:aload_1         
		//   22   39:aload_0         
		//   23   40:getfield        #25  <Field String type>
		//   24   43:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append('\'');
		//   26   47:aload_1         
		//   27   48:bipush          39
		//   28   50:invokevirtual   #106 <Method StringBuilder StringBuilder.append(char)>
		//   29   53:pop             
			stringbuilder.append(", affinity='");
		//   30   54:aload_1         
		//   31   55:ldc1            #110 <String ", affinity='">
		//   32   57:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   33   60:pop             
			stringbuilder.append(affinity);
		//   34   61:aload_1         
		//   35   62:aload_0         
		//   36   63:getfield        #35  <Field int affinity>
		//   37   66:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
		//   38   69:pop             
			stringbuilder.append('\'');
		//   39   70:aload_1         
		//   40   71:bipush          39
		//   41   73:invokevirtual   #106 <Method StringBuilder StringBuilder.append(char)>
		//   42   76:pop             
			stringbuilder.append(", notNull=");
		//   43   77:aload_1         
		//   44   78:ldc1            #115 <String ", notNull=">
		//   45   80:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   46   83:pop             
			stringbuilder.append(notNull);
		//   47   84:aload_1         
		//   48   85:aload_0         
		//   49   86:getfield        #27  <Field boolean notNull>
		//   50   89:invokevirtual   #118 <Method StringBuilder StringBuilder.append(boolean)>
		//   51   92:pop             
			stringbuilder.append(", primaryKeyPosition=");
		//   52   93:aload_1         
		//   53   94:ldc1            #120 <String ", primaryKeyPosition=">
		//   54   96:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   55   99:pop             
			stringbuilder.append(primaryKeyPosition);
		//   56  100:aload_1         
		//   57  101:aload_0         
		//   58  102:getfield        #29  <Field int primaryKeyPosition>
		//   59  105:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
		//   60  108:pop             
			stringbuilder.append('}');
		//   61  109:aload_1         
		//   62  110:bipush          125
		//   63  112:invokevirtual   #106 <Method StringBuilder StringBuilder.append(char)>
		//   64  115:pop             
			return stringbuilder.toString();
		//   65  116:aload_1         
		//   66  117:invokevirtual   #122 <Method String StringBuilder.toString()>
		//   67  120:areturn         
		}

		public final int affinity;
		public final String name;
		public final boolean notNull;
		public final int primaryKeyPosition;
		public final String type;

		public Column(String s, String s1, boolean flag, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			name = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field String name>
			type = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field String type>
			notNull = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #27  <Field boolean notNull>
			primaryKeyPosition = i;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #29  <Field int primaryKeyPosition>
			affinity = findAffinity(s1);
		//   14   25:aload_0         
		//   15   26:aload_2         
		//   16   27:invokestatic    #33  <Method int findAffinity(String)>
		//   17   30:putfield        #35  <Field int affinity>
		//   18   33:return          
		}
	}

	public static class ForeignKey
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          109
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #51  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #51  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((ForeignKey)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class TableInfo$ForeignKey>
		//   16   28:astore_1        
				if(!referenceTable.equals(((Object) (((ForeignKey) (obj)).referenceTable))))
		//*  17   29:aload_0         
		//*  18   30:getfield        #27  <Field String referenceTable>
		//*  19   33:aload_1         
		//*  20   34:getfield        #27  <Field String referenceTable>
		//*  21   37:invokevirtual   #55  <Method boolean String.equals(Object)>
		//*  22   40:ifne            45
					return false;
		//   23   43:iconst_0        
		//   24   44:ireturn         
				if(!onDelete.equals(((Object) (((ForeignKey) (obj)).onDelete))))
		//*  25   45:aload_0         
		//*  26   46:getfield        #29  <Field String onDelete>
		//*  27   49:aload_1         
		//*  28   50:getfield        #29  <Field String onDelete>
		//*  29   53:invokevirtual   #55  <Method boolean String.equals(Object)>
		//*  30   56:ifne            61
					return false;
		//   31   59:iconst_0        
		//   32   60:ireturn         
				if(!onUpdate.equals(((Object) (((ForeignKey) (obj)).onUpdate))))
		//*  33   61:aload_0         
		//*  34   62:getfield        #31  <Field String onUpdate>
		//*  35   65:aload_1         
		//*  36   66:getfield        #31  <Field String onUpdate>
		//*  37   69:invokevirtual   #55  <Method boolean String.equals(Object)>
		//*  38   72:ifne            77
					return false;
		//   39   75:iconst_0        
		//   40   76:ireturn         
				if(!columnNames.equals(((Object) (((ForeignKey) (obj)).columnNames))))
		//*  41   77:aload_0         
		//*  42   78:getfield        #39  <Field List columnNames>
		//*  43   81:aload_1         
		//*  44   82:getfield        #39  <Field List columnNames>
		//*  45   85:invokeinterface #58  <Method boolean List.equals(Object)>
		//*  46   90:ifne            95
					return false;
		//   47   93:iconst_0        
		//   48   94:ireturn         
				else
					return referenceColumnNames.equals(((Object) (((ForeignKey) (obj)).referenceColumnNames)));
		//   49   95:aload_0         
		//   50   96:getfield        #41  <Field List referenceColumnNames>
		//   51   99:aload_1         
		//   52  100:getfield        #41  <Field List referenceColumnNames>
		//   53  103:invokeinterface #58  <Method boolean List.equals(Object)>
		//   54  108:ireturn         
			} else
			{
				return false;
		//   55  109:iconst_0        
		//   56  110:ireturn         
			}
		}

		public int hashCode()
		{
			return (((referenceTable.hashCode() * 31 + onDelete.hashCode()) * 31 + onUpdate.hashCode()) * 31 + columnNames.hashCode()) * 31 + referenceColumnNames.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field String referenceTable>
		//    2    4:invokevirtual   #62  <Method int String.hashCode()>
		//    3    7:bipush          31
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #29  <Field String onDelete>
		//    7   14:invokevirtual   #62  <Method int String.hashCode()>
		//    8   17:iadd            
		//    9   18:bipush          31
		//   10   20:imul            
		//   11   21:aload_0         
		//   12   22:getfield        #31  <Field String onUpdate>
		//   13   25:invokevirtual   #62  <Method int String.hashCode()>
		//   14   28:iadd            
		//   15   29:bipush          31
		//   16   31:imul            
		//   17   32:aload_0         
		//   18   33:getfield        #39  <Field List columnNames>
		//   19   36:invokeinterface #63  <Method int List.hashCode()>
		//   20   41:iadd            
		//   21   42:bipush          31
		//   22   44:imul            
		//   23   45:aload_0         
		//   24   46:getfield        #41  <Field List referenceColumnNames>
		//   25   49:invokeinterface #63  <Method int List.hashCode()>
		//   26   54:iadd            
		//   27   55:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #67  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #68  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("ForeignKey{referenceTable='");
		//    4    8:aload_1         
		//    5    9:ldc1            #70  <String "ForeignKey{referenceTable='">
		//    6   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(referenceTable);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #27  <Field String referenceTable>
		//   11   20:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append('\'');
		//   13   24:aload_1         
		//   14   25:bipush          39
		//   15   27:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
		//   16   30:pop             
			stringbuilder.append(", onDelete='");
		//   17   31:aload_1         
		//   18   32:ldc1            #79  <String ", onDelete='">
		//   19   34:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   20   37:pop             
			stringbuilder.append(onDelete);
		//   21   38:aload_1         
		//   22   39:aload_0         
		//   23   40:getfield        #29  <Field String onDelete>
		//   24   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append('\'');
		//   26   47:aload_1         
		//   27   48:bipush          39
		//   28   50:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
		//   29   53:pop             
			stringbuilder.append(", onUpdate='");
		//   30   54:aload_1         
		//   31   55:ldc1            #81  <String ", onUpdate='">
		//   32   57:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   33   60:pop             
			stringbuilder.append(onUpdate);
		//   34   61:aload_1         
		//   35   62:aload_0         
		//   36   63:getfield        #31  <Field String onUpdate>
		//   37   66:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   38   69:pop             
			stringbuilder.append('\'');
		//   39   70:aload_1         
		//   40   71:bipush          39
		//   41   73:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
		//   42   76:pop             
			stringbuilder.append(", columnNames=");
		//   43   77:aload_1         
		//   44   78:ldc1            #83  <String ", columnNames=">
		//   45   80:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   46   83:pop             
			stringbuilder.append(((Object) (columnNames)));
		//   47   84:aload_1         
		//   48   85:aload_0         
		//   49   86:getfield        #39  <Field List columnNames>
		//   50   89:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   51   92:pop             
			stringbuilder.append(", referenceColumnNames=");
		//   52   93:aload_1         
		//   53   94:ldc1            #88  <String ", referenceColumnNames=">
		//   54   96:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   55   99:pop             
			stringbuilder.append(((Object) (referenceColumnNames)));
		//   56  100:aload_1         
		//   57  101:aload_0         
		//   58  102:getfield        #41  <Field List referenceColumnNames>
		//   59  105:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   60  108:pop             
			stringbuilder.append('}');
		//   61  109:aload_1         
		//   62  110:bipush          125
		//   63  112:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
		//   64  115:pop             
			return stringbuilder.toString();
		//   65  116:aload_1         
		//   66  117:invokevirtual   #90  <Method String StringBuilder.toString()>
		//   67  120:areturn         
		}

		public final List columnNames;
		public final String onDelete;
		public final String onUpdate;
		public final List referenceColumnNames;
		public final String referenceTable;

		public ForeignKey(String s, String s1, String s2, List list, List list1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			referenceTable = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field String referenceTable>
			onDelete = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #29  <Field String onDelete>
			onUpdate = s2;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #31  <Field String onUpdate>
			columnNames = Collections.unmodifiableList(list);
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:invokestatic    #37  <Method List Collections.unmodifiableList(List)>
		//   14   25:putfield        #39  <Field List columnNames>
			referenceColumnNames = Collections.unmodifiableList(list1);
		//   15   28:aload_0         
		//   16   29:aload           5
		//   17   31:invokestatic    #37  <Method List Collections.unmodifiableList(List)>
		//   18   34:putfield        #41  <Field List referenceColumnNames>
		//   19   37:return          
		}
	}

	static class ForeignKeyWithSequence
		implements Comparable
	{

		public int compareTo(ForeignKeyWithSequence foreignkeywithsequence)
		{
			int i = mId - foreignkeywithsequence.mId;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int mId>
		//    2    4:aload_1         
		//    3    5:getfield        #27  <Field int mId>
		//    4    8:isub            
		//    5    9:istore_2        
			if(i == 0)
		//*   6   10:iload_2         
		//*   7   11:ifne            24
				return mSequence - foreignkeywithsequence.mSequence;
		//    8   14:aload_0         
		//    9   15:getfield        #29  <Field int mSequence>
		//   10   18:aload_1         
		//   11   19:getfield        #29  <Field int mSequence>
		//   12   22:isub            
		//   13   23:ireturn         
			else
				return i;
		//   14   24:iload_2         
		//   15   25:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((ForeignKeyWithSequence)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class TableInfo$ForeignKeyWithSequence>
		//    3    5:invokevirtual   #41  <Method int compareTo(TableInfo$ForeignKeyWithSequence)>
		//    4    8:ireturn         
		}

		final String mFrom;
		final int mId;
		final int mSequence;
		final String mTo;

		ForeignKeyWithSequence(int i, int j, String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			mId = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #27  <Field int mId>
			mSequence = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #29  <Field int mSequence>
			mFrom = s;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #31  <Field String mFrom>
			mTo = s1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #33  <Field String mTo>
		//   14   25:return          
		}
	}

	public static class Index
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          94
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #38  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #38  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((Index)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class TableInfo$Index>
		//   16   28:astore_1        
				if(unique != ((Index) (obj)).unique)
		//*  17   29:aload_0         
		//*  18   30:getfield        #27  <Field boolean unique>
		//*  19   33:aload_1         
		//*  20   34:getfield        #27  <Field boolean unique>
		//*  21   37:icmpeq          42
					return false;
		//   22   40:iconst_0        
		//   23   41:ireturn         
				if(!columns.equals(((Object) (((Index) (obj)).columns))))
		//*  24   42:aload_0         
		//*  25   43:getfield        #29  <Field List columns>
		//*  26   46:aload_1         
		//*  27   47:getfield        #29  <Field List columns>
		//*  28   50:invokeinterface #42  <Method boolean List.equals(Object)>
		//*  29   55:ifne            60
					return false;
		//   30   58:iconst_0        
		//   31   59:ireturn         
				if(name.startsWith("index_"))
		//*  32   60:aload_0         
		//*  33   61:getfield        #25  <Field String name>
		//*  34   64:ldc1            #44  <String "index_">
		//*  35   66:invokevirtual   #50  <Method boolean String.startsWith(String)>
		//*  36   69:ifeq            82
					return ((Index) (obj)).name.startsWith("index_");
		//   37   72:aload_1         
		//   38   73:getfield        #25  <Field String name>
		//   39   76:ldc1            #44  <String "index_">
		//   40   78:invokevirtual   #50  <Method boolean String.startsWith(String)>
		//   41   81:ireturn         
				else
					return name.equals(((Object) (((Index) (obj)).name)));
		//   42   82:aload_0         
		//   43   83:getfield        #25  <Field String name>
		//   44   86:aload_1         
		//   45   87:getfield        #25  <Field String name>
		//   46   90:invokevirtual   #51  <Method boolean String.equals(Object)>
		//   47   93:ireturn         
			} else
			{
				return false;
		//   48   94:iconst_0        
		//   49   95:ireturn         
			}
		}

		public int hashCode()
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #55  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #57  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #62  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #66  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #67  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("Index{name='");
		//    4    8:aload_1         
		//    5    9:ldc1            #69  <String "Index{name='">
		//    6   11:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(name);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #25  <Field String name>
		//   11   20:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append('\'');
		//   13   24:aload_1         
		//   14   25:bipush          39
		//   15   27:invokevirtual   #76  <Method StringBuilder StringBuilder.append(char)>
		//   16   30:pop             
			stringbuilder.append(", unique=");
		//   17   31:aload_1         
		//   18   32:ldc1            #78  <String ", unique=">
		//   19   34:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   20   37:pop             
			stringbuilder.append(unique);
		//   21   38:aload_1         
		//   22   39:aload_0         
		//   23   40:getfield        #27  <Field boolean unique>
		//   24   43:invokevirtual   #81  <Method StringBuilder StringBuilder.append(boolean)>
		//   25   46:pop             
			stringbuilder.append(", columns=");
		//   26   47:aload_1         
		//   27   48:ldc1            #83  <String ", columns=">
		//   28   50:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   29   53:pop             
			stringbuilder.append(((Object) (columns)));
		//   30   54:aload_1         
		//   31   55:aload_0         
		//   32   56:getfield        #29  <Field List columns>
		//   33   59:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   34   62:pop             
			stringbuilder.append('}');
		//   35   63:aload_1         
		//   36   64:bipush          125
		//   37   66:invokevirtual   #76  <Method StringBuilder StringBuilder.append(char)>
		//   38   69:pop             
			return stringbuilder.toString();
		//   39   70:aload_1         
		//   40   71:invokevirtual   #88  <Method String StringBuilder.toString()>
		//   41   74:areturn         
		}

		public final List columns;
		public final String name;
		public final boolean unique;

		public Index(String s, boolean flag, List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			name = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field String name>
			unique = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #27  <Field boolean unique>
			columns = list;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #29  <Field List columns>
		//   11   19:return          
		}
	}


	public TableInfo(String s, Map map, Set set, Set set1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field String name>
		columns = Collections.unmodifiableMap(map);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #44  <Method Map Collections.unmodifiableMap(Map)>
	//    8   14:putfield        #46  <Field Map columns>
		foreignKeys = Collections.unmodifiableSet(set);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokestatic    #50  <Method Set Collections.unmodifiableSet(Set)>
	//   12   22:putfield        #52  <Field Set foreignKeys>
		if(set1 == null)
	//*  13   25:aload           4
	//*  14   27:ifnonnull       35
			s = null;
	//   15   30:aconst_null     
	//   16   31:astore_1        
		else
	//*  17   32:goto            41
			s = ((String) (Collections.unmodifiableSet(set1)));
	//   18   35:aload           4
	//   19   37:invokestatic    #50  <Method Set Collections.unmodifiableSet(Set)>
	//   20   40:astore_1        
		indices = ((Set) (s));
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:putfield        #54  <Field Set indices>
	//   24   46:return          
	}

	public static TableInfo read(SupportSQLiteDatabase supportsqlitedatabase, String s)
	{
		return new TableInfo(s, readColumns(supportsqlitedatabase, s), readForeignKeys(supportsqlitedatabase, s), readIndices(supportsqlitedatabase, s));
	//    0    0:new             #2   <Class TableInfo>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #63  <Method Map readColumns(SupportSQLiteDatabase, String)>
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #67  <Method Set readForeignKeys(SupportSQLiteDatabase, String)>
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokestatic    #70  <Method Set readIndices(SupportSQLiteDatabase, String)>
	//   12   20:invokespecial   #72  <Method void TableInfo(String, Map, Set, Set)>
	//   13   23:areturn         
	}

	private static Map readColumns(SupportSQLiteDatabase supportsqlitedatabase, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:astore          7
		stringbuilder.append("PRAGMA table_info(`");
	//    4    9:aload           7
	//    5   11:ldc1            #77  <String "PRAGMA table_info(`">
	//    6   13:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(s);
	//    8   17:aload           7
	//    9   19:aload_1         
	//   10   20:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append("`)");
	//   12   24:aload           7
	//   13   26:ldc1            #83  <String "`)">
	//   14   28:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		supportsqlitedatabase = ((SupportSQLiteDatabase) (supportsqlitedatabase.query(stringbuilder.toString())));
	//   16   32:aload_0         
	//   17   33:aload           7
	//   18   35:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   19   38:invokeinterface #93  <Method Cursor SupportSQLiteDatabase.query(String)>
	//   20   43:astore_0        
		s = ((String) (new HashMap()));
	//   21   44:new             #95  <Class HashMap>
	//   22   47:dup             
	//   23   48:invokespecial   #96  <Method void HashMap()>
	//   24   51:astore_1        
		int i;
		int j;
		int k;
		int l;
		if(((Cursor) (supportsqlitedatabase)).getColumnCount() <= 0)
			break MISSING_BLOCK_LABEL_176;
	//   25   52:aload_0         
	//   26   53:invokeinterface #102 <Method int Cursor.getColumnCount()>
	//   27   58:ifle            176
		i = ((Cursor) (supportsqlitedatabase)).getColumnIndex("name");
	//   28   61:aload_0         
	//   29   62:ldc1            #103 <String "name">
	//   30   64:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   31   69:istore_2        
		j = ((Cursor) (supportsqlitedatabase)).getColumnIndex("type");
	//   32   70:aload_0         
	//   33   71:ldc1            #109 <String "type">
	//   34   73:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   35   78:istore_3        
		k = ((Cursor) (supportsqlitedatabase)).getColumnIndex("notnull");
	//   36   79:aload_0         
	//   37   80:ldc1            #111 <String "notnull">
	//   38   82:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   39   87:istore          4
		l = ((Cursor) (supportsqlitedatabase)).getColumnIndex("pk");
	//   40   89:aload_0         
	//   41   90:ldc1            #113 <String "pk">
	//   42   92:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   43   97:istore          5
_L1:
		String s1;
		String s2;
		if(!((Cursor) (supportsqlitedatabase)).moveToNext())
			break MISSING_BLOCK_LABEL_176;
	//   44   99:aload_0         
	//   45  100:invokeinterface #117 <Method boolean Cursor.moveToNext()>
	//   46  105:ifeq            176
		s1 = ((Cursor) (supportsqlitedatabase)).getString(i);
	//   47  108:aload_0         
	//   48  109:iload_2         
	//   49  110:invokeinterface #121 <Method String Cursor.getString(int)>
	//   50  115:astore          7
		s2 = ((Cursor) (supportsqlitedatabase)).getString(j);
	//   51  117:aload_0         
	//   52  118:iload_3         
	//   53  119:invokeinterface #121 <Method String Cursor.getString(int)>
	//   54  124:astore          8
		boolean flag;
		if(((Cursor) (supportsqlitedatabase)).getInt(k) != 0)
	//*  55  126:aload_0         
	//*  56  127:iload           4
	//*  57  129:invokeinterface #125 <Method int Cursor.getInt(int)>
	//*  58  134:ifeq            193
			flag = true;
	//   59  137:iconst_1        
	//   60  138:istore          6
		else
	//*  61  140:goto            143
	//*  62  143:aload_1         
	//*  63  144:aload           7
	//*  64  146:new             #6   <Class TableInfo$Column>
	//*  65  149:dup             
	//*  66  150:aload           7
	//*  67  152:aload           8
	//*  68  154:iload           6
	//*  69  156:aload_0         
	//*  70  157:iload           5
	//*  71  159:invokeinterface #125 <Method int Cursor.getInt(int)>
	//*  72  164:invokespecial   #128 <Method void TableInfo$Column(String, String, boolean, int)>
	//*  73  167:invokeinterface #134 <Method Object Map.put(Object, Object)>
	//*  74  172:pop             
	//*  75  173:goto            99
	//*  76  176:aload_0         
	//*  77  177:invokeinterface #137 <Method void Cursor.close()>
	//*  78  182:aload_1         
	//*  79  183:areturn         
	//*  80  184:astore_1        
	//*  81  185:aload_0         
	//*  82  186:invokeinterface #137 <Method void Cursor.close()>
	//*  83  191:aload_1         
	//*  84  192:athrow          
			flag = false;
	//   85  193:iconst_0        
	//   86  194:istore          6
		((Map) (s)).put(((Object) (s1)), ((Object) (new Column(s1, s2, flag, ((Cursor) (supportsqlitedatabase)).getInt(l)))));
		  goto _L1
		((Cursor) (supportsqlitedatabase)).close();
		return ((Map) (s));
		s;
		((Cursor) (supportsqlitedatabase)).close();
		throw s;
	//*  87  196:goto            143
	}

	private static List readForeignKeyFieldMappings(Cursor cursor)
	{
		int j = cursor.getColumnIndex("id");
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "id">
	//    2    3:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//    3    8:istore_2        
		int k = cursor.getColumnIndex("seq");
	//    4    9:aload_0         
	//    5   10:ldc1            #144 <String "seq">
	//    6   12:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//    7   17:istore_3        
		int l = cursor.getColumnIndex("from");
	//    8   18:aload_0         
	//    9   19:ldc1            #146 <String "from">
	//   10   21:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   11   26:istore          4
		int i1 = cursor.getColumnIndex("to");
	//   12   28:aload_0         
	//   13   29:ldc1            #148 <String "to">
	//   14   31:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   15   36:istore          5
		int j1 = cursor.getCount();
	//   16   38:aload_0         
	//   17   39:invokeinterface #151 <Method int Cursor.getCount()>
	//   18   44:istore          6
		ArrayList arraylist = new ArrayList();
	//   19   46:new             #153 <Class ArrayList>
	//   20   49:dup             
	//   21   50:invokespecial   #154 <Method void ArrayList()>
	//   22   53:astore          7
		for(int i = 0; i < j1; i++)
	//*  23   55:iconst_0        
	//*  24   56:istore_1        
	//*  25   57:iload_1         
	//*  26   58:iload           6
	//*  27   60:icmpge          123
		{
			cursor.moveToPosition(i);
	//   28   63:aload_0         
	//   29   64:iload_1         
	//   30   65:invokeinterface #158 <Method boolean Cursor.moveToPosition(int)>
	//   31   70:pop             
			((List) (arraylist)).add(((Object) (new ForeignKeyWithSequence(cursor.getInt(j), cursor.getInt(k), cursor.getString(l), cursor.getString(i1)))));
	//   32   71:aload           7
	//   33   73:new             #12  <Class TableInfo$ForeignKeyWithSequence>
	//   34   76:dup             
	//   35   77:aload_0         
	//   36   78:iload_2         
	//   37   79:invokeinterface #125 <Method int Cursor.getInt(int)>
	//   38   84:aload_0         
	//   39   85:iload_3         
	//   40   86:invokeinterface #125 <Method int Cursor.getInt(int)>
	//   41   91:aload_0         
	//   42   92:iload           4
	//   43   94:invokeinterface #121 <Method String Cursor.getString(int)>
	//   44   99:aload_0         
	//   45  100:iload           5
	//   46  102:invokeinterface #121 <Method String Cursor.getString(int)>
	//   47  107:invokespecial   #161 <Method void TableInfo$ForeignKeyWithSequence(int, int, String, String)>
	//   48  110:invokeinterface #167 <Method boolean List.add(Object)>
	//   49  115:pop             
		}

	//   50  116:iload_1         
	//   51  117:iconst_1        
	//   52  118:iadd            
	//   53  119:istore_1        
	//*  54  120:goto            57
		Collections.sort(((List) (arraylist)));
	//   55  123:aload           7
	//   56  125:invokestatic    #171 <Method void Collections.sort(List)>
		return ((List) (arraylist));
	//   57  128:aload           7
	//   58  130:areturn         
	}

	private static Set readForeignKeys(SupportSQLiteDatabase supportsqlitedatabase, String s)
	{
		HashSet hashset;
		hashset = new HashSet();
	//    0    0:new             #174 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #175 <Method void HashSet()>
	//    3    7:astore          10
		StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #74  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #75  <Method void StringBuilder()>
	//    7   16:astore          11
		stringbuilder.append("PRAGMA foreign_key_list(`");
	//    8   18:aload           11
	//    9   20:ldc1            #177 <String "PRAGMA foreign_key_list(`">
	//   10   22:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
		stringbuilder.append(s);
	//   12   26:aload           11
	//   13   28:aload_1         
	//   14   29:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append("`)");
	//   16   33:aload           11
	//   17   35:ldc1            #83  <String "`)">
	//   18   37:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		supportsqlitedatabase = ((SupportSQLiteDatabase) (supportsqlitedatabase.query(stringbuilder.toString())));
	//   20   41:aload_0         
	//   21   42:aload           11
	//   22   44:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   23   47:invokeinterface #93  <Method Cursor SupportSQLiteDatabase.query(String)>
	//   24   52:astore_0        
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		j = ((Cursor) (supportsqlitedatabase)).getColumnIndex("id");
	//   25   53:aload_0         
	//   26   54:ldc1            #142 <String "id">
	//   27   56:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   28   61:istore_3        
		k = ((Cursor) (supportsqlitedatabase)).getColumnIndex("seq");
	//   29   62:aload_0         
	//   30   63:ldc1            #144 <String "seq">
	//   31   65:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   32   70:istore          4
		l = ((Cursor) (supportsqlitedatabase)).getColumnIndex("table");
	//   33   72:aload_0         
	//   34   73:ldc1            #179 <String "table">
	//   35   75:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   36   80:istore          5
		i1 = ((Cursor) (supportsqlitedatabase)).getColumnIndex("on_delete");
	//   37   82:aload_0         
	//   38   83:ldc1            #181 <String "on_delete">
	//   39   85:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   40   90:istore          6
		j1 = ((Cursor) (supportsqlitedatabase)).getColumnIndex("on_update");
	//   41   92:aload_0         
	//   42   93:ldc1            #183 <String "on_update">
	//   43   95:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   44  100:istore          7
		s = ((String) (readForeignKeyFieldMappings(((Cursor) (supportsqlitedatabase)))));
	//   45  102:aload_0         
	//   46  103:invokestatic    #185 <Method List readForeignKeyFieldMappings(Cursor)>
	//   47  106:astore_1        
		k1 = ((Cursor) (supportsqlitedatabase)).getCount();
	//   48  107:aload_0         
	//   49  108:invokeinterface #151 <Method int Cursor.getCount()>
	//   50  113:istore          8
		int i = 0;
	//   51  115:iconst_0        
	//   52  116:istore_2        
_L3:
		if(i >= k1) goto _L2; else goto _L1
	//   53  117:iload_2         
	//   54  118:iload           8
	//   55  120:icmpge          291
_L1:
		((Cursor) (supportsqlitedatabase)).moveToPosition(i);
	//   56  123:aload_0         
	//   57  124:iload_2         
	//   58  125:invokeinterface #158 <Method boolean Cursor.moveToPosition(int)>
	//   59  130:pop             
		if(((Cursor) (supportsqlitedatabase)).getInt(k) != 0)
	//*  60  131:aload_0         
	//*  61  132:iload           4
	//*  62  134:invokeinterface #125 <Method int Cursor.getInt(int)>
	//*  63  139:ifeq            145
			continue; /* Loop/switch isn't completed */
	//   64  142:goto            284
		ArrayList arraylist;
		ArrayList arraylist1;
		int l1 = ((Cursor) (supportsqlitedatabase)).getInt(j);
	//   65  145:aload_0         
	//   66  146:iload_3         
	//   67  147:invokeinterface #125 <Method int Cursor.getInt(int)>
	//   68  152:istore          9
		arraylist = new ArrayList();
	//   69  154:new             #153 <Class ArrayList>
	//   70  157:dup             
	//   71  158:invokespecial   #154 <Method void ArrayList()>
	//   72  161:astore          11
		arraylist1 = new ArrayList();
	//   73  163:new             #153 <Class ArrayList>
	//   74  166:dup             
	//   75  167:invokespecial   #154 <Method void ArrayList()>
	//   76  170:astore          12
		Iterator iterator = ((List) (s)).iterator();
	//   77  172:aload_1         
	//   78  173:invokeinterface #189 <Method Iterator List.iterator()>
	//   79  178:astore          13
		do
		{
			if(!iterator.hasNext())
				break;
	//   80  180:aload           13
	//   81  182:invokeinterface #194 <Method boolean Iterator.hasNext()>
	//   82  187:ifeq            241
			ForeignKeyWithSequence foreignkeywithsequence = (ForeignKeyWithSequence)iterator.next();
	//   83  190:aload           13
	//   84  192:invokeinterface #198 <Method Object Iterator.next()>
	//   85  197:checkcast       #12  <Class TableInfo$ForeignKeyWithSequence>
	//   86  200:astore          14
			if(foreignkeywithsequence.mId == l1)
	//*  87  202:aload           14
	//*  88  204:getfield        #202 <Field int TableInfo$ForeignKeyWithSequence.mId>
	//*  89  207:iload           9
	//*  90  209:icmpne          180
			{
				((List) (arraylist)).add(((Object) (foreignkeywithsequence.mFrom)));
	//   91  212:aload           11
	//   92  214:aload           14
	//   93  216:getfield        #205 <Field String TableInfo$ForeignKeyWithSequence.mFrom>
	//   94  219:invokeinterface #167 <Method boolean List.add(Object)>
	//   95  224:pop             
				((List) (arraylist1)).add(((Object) (foreignkeywithsequence.mTo)));
	//   96  225:aload           12
	//   97  227:aload           14
	//   98  229:getfield        #208 <Field String TableInfo$ForeignKeyWithSequence.mTo>
	//   99  232:invokeinterface #167 <Method boolean List.add(Object)>
	//  100  237:pop             
			}
		} while(true);
	//  101  238:goto            180
		((Set) (hashset)).add(((Object) (new ForeignKey(((Cursor) (supportsqlitedatabase)).getString(l), ((Cursor) (supportsqlitedatabase)).getString(i1), ((Cursor) (supportsqlitedatabase)).getString(j1), ((List) (arraylist)), ((List) (arraylist1))))));
	//  102  241:aload           10
	//  103  243:new             #9   <Class TableInfo$ForeignKey>
	//  104  246:dup             
	//  105  247:aload_0         
	//  106  248:iload           5
	//  107  250:invokeinterface #121 <Method String Cursor.getString(int)>
	//  108  255:aload_0         
	//  109  256:iload           6
	//  110  258:invokeinterface #121 <Method String Cursor.getString(int)>
	//  111  263:aload_0         
	//  112  264:iload           7
	//  113  266:invokeinterface #121 <Method String Cursor.getString(int)>
	//  114  271:aload           11
	//  115  273:aload           12
	//  116  275:invokespecial   #211 <Method void TableInfo$ForeignKey(String, String, String, List, List)>
	//  117  278:invokeinterface #214 <Method boolean Set.add(Object)>
	//  118  283:pop             
		i++;
	//  119  284:iload_2         
	//  120  285:iconst_1        
	//  121  286:iadd            
	//  122  287:istore_2        
		  goto _L3
	//* 123  288:goto            117
_L2:
		((Cursor) (supportsqlitedatabase)).close();
	//  124  291:aload_0         
	//  125  292:invokeinterface #137 <Method void Cursor.close()>
		return ((Set) (hashset));
	//  126  297:aload           10
	//  127  299:areturn         
		s;
	//  128  300:astore_1        
		((Cursor) (supportsqlitedatabase)).close();
	//  129  301:aload_0         
	//  130  302:invokeinterface #137 <Method void Cursor.close()>
		throw s;
	//  131  307:aload_1         
	//  132  308:athrow          
	}

	private static Index readIndex(SupportSQLiteDatabase supportsqlitedatabase, String s, boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append("PRAGMA index_xinfo(`");
	//    4    9:aload           6
	//    5   11:ldc1            #219 <String "PRAGMA index_xinfo(`">
	//    6   13:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(s);
	//    8   17:aload           6
	//    9   19:aload_1         
	//   10   20:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append("`)");
	//   12   24:aload           6
	//   13   26:ldc1            #83  <String "`)">
	//   14   28:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		supportsqlitedatabase = ((SupportSQLiteDatabase) (supportsqlitedatabase.query(stringbuilder.toString())));
	//   16   32:aload_0         
	//   17   33:aload           6
	//   18   35:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   19   38:invokeinterface #93  <Method Cursor SupportSQLiteDatabase.query(String)>
	//   20   43:astore_0        
		int i;
		int j;
		int k;
		i = ((Cursor) (supportsqlitedatabase)).getColumnIndex("seqno");
	//   21   44:aload_0         
	//   22   45:ldc1            #221 <String "seqno">
	//   23   47:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   24   52:istore_3        
		j = ((Cursor) (supportsqlitedatabase)).getColumnIndex("cid");
	//   25   53:aload_0         
	//   26   54:ldc1            #223 <String "cid">
	//   27   56:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   28   61:istore          4
		k = ((Cursor) (supportsqlitedatabase)).getColumnIndex("name");
	//   29   63:aload_0         
	//   30   64:ldc1            #103 <String "name">
	//   31   66:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   32   71:istore          5
		if(i == -1 || j == -1 || k == -1)
	//*  33   73:iload_3         
	//*  34   74:iconst_m1       
	//*  35   75:icmpeq          199
	//*  36   78:iload           4
	//*  37   80:iconst_m1       
	//*  38   81:icmpeq          199
	//*  39   84:iload           5
	//*  40   86:iconst_m1       
	//*  41   87:icmpne          93
			break MISSING_BLOCK_LABEL_199;
	//   42   90:goto            199
		TreeMap treemap = new TreeMap();
	//   43   93:new             #225 <Class TreeMap>
	//   44   96:dup             
	//   45   97:invokespecial   #226 <Method void TreeMap()>
	//   46  100:astore          6
_L1:
		do
			if(!((Cursor) (supportsqlitedatabase)).moveToNext())
				break MISSING_BLOCK_LABEL_152;
	//   47  102:aload_0         
	//   48  103:invokeinterface #117 <Method boolean Cursor.moveToNext()>
	//   49  108:ifeq            152
		while(((Cursor) (supportsqlitedatabase)).getInt(j) < 0);
	//   50  111:aload_0         
	//   51  112:iload           4
	//   52  114:invokeinterface #125 <Method int Cursor.getInt(int)>
	//   53  119:ifge            125
	//*  54  122:goto            102
		treemap.put(((Object) (Integer.valueOf(((Cursor) (supportsqlitedatabase)).getInt(i)))), ((Object) (((Cursor) (supportsqlitedatabase)).getString(k))));
	//   55  125:aload           6
	//   56  127:aload_0         
	//   57  128:iload_3         
	//   58  129:invokeinterface #125 <Method int Cursor.getInt(int)>
	//   59  134:invokestatic    #232 <Method Integer Integer.valueOf(int)>
	//   60  137:aload_0         
	//   61  138:iload           5
	//   62  140:invokeinterface #121 <Method String Cursor.getString(int)>
	//   63  145:invokevirtual   #233 <Method Object TreeMap.put(Object, Object)>
	//   64  148:pop             
		  goto _L1
	//*  65  149:goto            102
		ArrayList arraylist = new ArrayList(treemap.size());
	//   66  152:new             #153 <Class ArrayList>
	//   67  155:dup             
	//   68  156:aload           6
	//   69  158:invokevirtual   #236 <Method int TreeMap.size()>
	//   70  161:invokespecial   #239 <Method void ArrayList(int)>
	//   71  164:astore          7
		((List) (arraylist)).addAll(treemap.values());
	//   72  166:aload           7
	//   73  168:aload           6
	//   74  170:invokevirtual   #243 <Method java.util.Collection TreeMap.values()>
	//   75  173:invokeinterface #247 <Method boolean List.addAll(java.util.Collection)>
	//   76  178:pop             
		s = ((String) (new Index(s, flag, ((List) (arraylist)))));
	//   77  179:new             #15  <Class TableInfo$Index>
	//   78  182:dup             
	//   79  183:aload_1         
	//   80  184:iload_2         
	//   81  185:aload           7
	//   82  187:invokespecial   #250 <Method void TableInfo$Index(String, boolean, List)>
	//   83  190:astore_1        
		((Cursor) (supportsqlitedatabase)).close();
	//   84  191:aload_0         
	//   85  192:invokeinterface #137 <Method void Cursor.close()>
		return ((Index) (s));
	//   86  197:aload_1         
	//   87  198:areturn         
		((Cursor) (supportsqlitedatabase)).close();
	//   88  199:aload_0         
	//   89  200:invokeinterface #137 <Method void Cursor.close()>
		return null;
	//   90  205:aconst_null     
	//   91  206:areturn         
		s;
	//   92  207:astore_1        
		((Cursor) (supportsqlitedatabase)).close();
	//   93  208:aload_0         
	//   94  209:invokeinterface #137 <Method void Cursor.close()>
		throw s;
	//   95  214:aload_1         
	//   96  215:athrow          
	}

	private static Set readIndices(SupportSQLiteDatabase supportsqlitedatabase, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:astore          7
		stringbuilder.append("PRAGMA index_list(`");
	//    4    9:aload           7
	//    5   11:ldc1            #253 <String "PRAGMA index_list(`">
	//    6   13:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(s);
	//    8   17:aload           7
	//    9   19:aload_1         
	//   10   20:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append("`)");
	//   12   24:aload           7
	//   13   26:ldc1            #83  <String "`)">
	//   14   28:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		s = ((String) (supportsqlitedatabase.query(stringbuilder.toString())));
	//   16   32:aload_0         
	//   17   33:aload           7
	//   18   35:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   19   38:invokeinterface #93  <Method Cursor SupportSQLiteDatabase.query(String)>
	//   20   43:astore_1        
		int i;
		int j;
		int k;
		i = ((Cursor) (s)).getColumnIndex("name");
	//   21   44:aload_1         
	//   22   45:ldc1            #103 <String "name">
	//   23   47:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   24   52:istore_2        
		j = ((Cursor) (s)).getColumnIndex("origin");
	//   25   53:aload_1         
	//   26   54:ldc1            #255 <String "origin">
	//   27   56:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   28   61:istore_3        
		k = ((Cursor) (s)).getColumnIndex("unique");
	//   29   62:aload_1         
	//   30   63:ldc2            #257 <String "unique">
	//   31   66:invokeinterface #107 <Method int Cursor.getColumnIndex(String)>
	//   32   71:istore          4
		if(i == -1 || j == -1 || k == -1)
	//*  33   73:iload_2         
	//*  34   74:iconst_m1       
	//*  35   75:icmpeq          203
	//*  36   78:iload_3         
	//*  37   79:iconst_m1       
	//*  38   80:icmpeq          203
	//*  39   83:iload           4
	//*  40   85:iconst_m1       
	//*  41   86:icmpne          92
			break MISSING_BLOCK_LABEL_203;
	//   42   89:goto            203
		HashSet hashset = new HashSet();
	//   43   92:new             #174 <Class HashSet>
	//   44   95:dup             
	//   45   96:invokespecial   #175 <Method void HashSet()>
	//   46   99:astore          7
_L1:
		do
			if(!((Cursor) (s)).moveToNext())
				break MISSING_BLOCK_LABEL_194;
	//   47  101:aload_1         
	//   48  102:invokeinterface #117 <Method boolean Cursor.moveToNext()>
	//   49  107:ifeq            194
		while(!"c".equals(((Object) (((Cursor) (s)).getString(j)))));
	//   50  110:ldc2            #259 <String "c">
	//   51  113:aload_1         
	//   52  114:iload_3         
	//   53  115:invokeinterface #121 <Method String Cursor.getString(int)>
	//   54  120:invokevirtual   #264 <Method boolean String.equals(Object)>
	//   55  123:ifne            129
	//*  56  126:goto            101
		int l;
		Object obj;
		obj = ((Object) (((Cursor) (s)).getString(i)));
	//   57  129:aload_1         
	//   58  130:iload_2         
	//   59  131:invokeinterface #121 <Method String Cursor.getString(int)>
	//   60  136:astore          8
		l = ((Cursor) (s)).getInt(k);
	//   61  138:aload_1         
	//   62  139:iload           4
	//   63  141:invokeinterface #125 <Method int Cursor.getInt(int)>
	//   64  146:istore          5
		boolean flag = true;
	//   65  148:iconst_1        
	//   66  149:istore          6
		if(l != 1)
	//*  67  151:iload           5
	//*  68  153:iconst_1        
	//*  69  154:icmpne          220
	//*  70  157:goto            160
	//*  71  160:aload_0         
	//*  72  161:aload           8
	//*  73  163:iload           6
	//*  74  165:invokestatic    #266 <Method TableInfo$Index readIndex(SupportSQLiteDatabase, String, boolean)>
	//*  75  168:astore          8
	//*  76  170:aload           8
	//*  77  172:ifnonnull       183
	//*  78  175:aload_1         
	//*  79  176:invokeinterface #137 <Method void Cursor.close()>
	//*  80  181:aconst_null     
	//*  81  182:areturn         
	//*  82  183:aload           7
	//*  83  185:aload           8
	//*  84  187:invokevirtual   #267 <Method boolean HashSet.add(Object)>
	//*  85  190:pop             
	//*  86  191:goto            101
	//*  87  194:aload_1         
	//*  88  195:invokeinterface #137 <Method void Cursor.close()>
	//*  89  200:aload           7
	//*  90  202:areturn         
	//*  91  203:aload_1         
	//*  92  204:invokeinterface #137 <Method void Cursor.close()>
	//*  93  209:aconst_null     
	//*  94  210:areturn         
	//*  95  211:astore_0        
	//*  96  212:aload_1         
	//*  97  213:invokeinterface #137 <Method void Cursor.close()>
	//*  98  218:aload_0         
	//*  99  219:athrow          
			flag = false;
	//  100  220:iconst_0        
	//  101  221:istore          6
		obj = ((Object) (readIndex(supportsqlitedatabase, ((String) (obj)), flag)));
		if(obj == null)
		{
			((Cursor) (s)).close();
			return null;
		}
		hashset.add(obj);
		  goto _L1
		((Cursor) (s)).close();
		return ((Set) (hashset));
		((Cursor) (s)).close();
		return null;
		supportsqlitedatabase;
		((Cursor) (s)).close();
		throw supportsqlitedatabase;
	//* 102  223:goto            160
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          156
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #272 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #272 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((TableInfo)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TableInfo>
	//   16   28:astore_1        
			Object obj1 = ((Object) (name));
	//   17   29:aload_0         
	//   18   30:getfield        #38  <Field String name>
	//   19   33:astore_2        
			if(obj1 != null)
	//*  20   34:aload_2         
	//*  21   35:ifnull          51
			{
				if(!((String) (obj1)).equals(((Object) (((TableInfo) (obj)).name))))
	//*  22   38:aload_2         
	//*  23   39:aload_1         
	//*  24   40:getfield        #38  <Field String name>
	//*  25   43:invokevirtual   #264 <Method boolean String.equals(Object)>
	//*  26   46:ifne            60
					return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
			} else
			if(((TableInfo) (obj)).name != null)
	//*  29   51:aload_1         
	//*  30   52:getfield        #38  <Field String name>
	//*  31   55:ifnull          60
				return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
			obj1 = ((Object) (columns));
	//   34   60:aload_0         
	//   35   61:getfield        #46  <Field Map columns>
	//   36   64:astore_2        
			if(obj1 != null)
	//*  37   65:aload_2         
	//*  38   66:ifnull          84
			{
				if(!((Map) (obj1)).equals(((Object) (((TableInfo) (obj)).columns))))
	//*  39   69:aload_2         
	//*  40   70:aload_1         
	//*  41   71:getfield        #46  <Field Map columns>
	//*  42   74:invokeinterface #273 <Method boolean Map.equals(Object)>
	//*  43   79:ifne            93
					return false;
	//   44   82:iconst_0        
	//   45   83:ireturn         
			} else
			if(((TableInfo) (obj)).columns != null)
	//*  46   84:aload_1         
	//*  47   85:getfield        #46  <Field Map columns>
	//*  48   88:ifnull          93
				return false;
	//   49   91:iconst_0        
	//   50   92:ireturn         
			obj1 = ((Object) (foreignKeys));
	//   51   93:aload_0         
	//   52   94:getfield        #52  <Field Set foreignKeys>
	//   53   97:astore_2        
			if(obj1 != null)
	//*  54   98:aload_2         
	//*  55   99:ifnull          117
			{
				if(!((Set) (obj1)).equals(((Object) (((TableInfo) (obj)).foreignKeys))))
	//*  56  102:aload_2         
	//*  57  103:aload_1         
	//*  58  104:getfield        #52  <Field Set foreignKeys>
	//*  59  107:invokeinterface #274 <Method boolean Set.equals(Object)>
	//*  60  112:ifne            126
					return false;
	//   61  115:iconst_0        
	//   62  116:ireturn         
			} else
			if(((TableInfo) (obj)).foreignKeys != null)
	//*  63  117:aload_1         
	//*  64  118:getfield        #52  <Field Set foreignKeys>
	//*  65  121:ifnull          126
				return false;
	//   66  124:iconst_0        
	//   67  125:ireturn         
			obj1 = ((Object) (indices));
	//   68  126:aload_0         
	//   69  127:getfield        #54  <Field Set indices>
	//   70  130:astore_2        
			if(obj1 != null)
	//*  71  131:aload_2         
	//*  72  132:ifnull          154
			{
				obj = ((Object) (((TableInfo) (obj)).indices));
	//   73  135:aload_1         
	//   74  136:getfield        #54  <Field Set indices>
	//   75  139:astore_1        
				if(obj == null)
	//*  76  140:aload_1         
	//*  77  141:ifnonnull       146
					return true;
	//   78  144:iconst_1        
	//   79  145:ireturn         
				else
					return ((Set) (obj1)).equals(obj);
	//   80  146:aload_2         
	//   81  147:aload_1         
	//   82  148:invokeinterface #274 <Method boolean Set.equals(Object)>
	//   83  153:ireturn         
			} else
			{
				return true;
	//   84  154:iconst_1        
	//   85  155:ireturn         
			}
		} else
		{
			return false;
	//   86  156:iconst_0        
	//   87  157:ireturn         
		}
	}

	public int hashCode()
	{
		Object obj = ((Object) (name));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String name>
	//    2    4:astore          4
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i;
		if(obj != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          22
			i = ((String) (obj)).hashCode();
	//    7   13:aload           4
	//    8   15:invokevirtual   #277 <Method int String.hashCode()>
	//    9   18:istore_1        
		else
	//*  10   19:goto            24
			i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_1        
		obj = ((Object) (columns));
	//   13   24:aload_0         
	//   14   25:getfield        #46  <Field Map columns>
	//   15   28:astore          4
		int j;
		if(obj != null)
	//*  16   30:aload           4
	//*  17   32:ifnull          46
			j = ((Map) (obj)).hashCode();
	//   18   35:aload           4
	//   19   37:invokeinterface #278 <Method int Map.hashCode()>
	//   20   42:istore_2        
		else
	//*  21   43:goto            48
			j = 0;
	//   22   46:iconst_0        
	//   23   47:istore_2        
		obj = ((Object) (foreignKeys));
	//   24   48:aload_0         
	//   25   49:getfield        #52  <Field Set foreignKeys>
	//   26   52:astore          4
		if(obj != null)
	//*  27   54:aload           4
	//*  28   56:ifnull          67
			k = ((Set) (obj)).hashCode();
	//   29   59:aload           4
	//   30   61:invokeinterface #279 <Method int Set.hashCode()>
	//   31   66:istore_3        
		return (i * 31 + j) * 31 + k;
	//   32   67:iload_1         
	//   33   68:bipush          31
	//   34   70:imul            
	//   35   71:iload_2         
	//   36   72:iadd            
	//   37   73:bipush          31
	//   38   75:imul            
	//   39   76:iload_3         
	//   40   77:iadd            
	//   41   78:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("TableInfo{name='");
	//    4    8:aload_1         
	//    5    9:ldc2            #281 <String "TableInfo{name='">
	//    6   12:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(name);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field String name>
	//   11   21:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append('\'');
	//   13   25:aload_1         
	//   14   26:bipush          39
	//   15   28:invokevirtual   #284 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		stringbuilder.append(", columns=");
	//   17   32:aload_1         
	//   18   33:ldc2            #286 <String ", columns=">
	//   19   36:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		stringbuilder.append(((Object) (columns)));
	//   21   40:aload_1         
	//   22   41:aload_0         
	//   23   42:getfield        #46  <Field Map columns>
	//   24   45:invokevirtual   #289 <Method StringBuilder StringBuilder.append(Object)>
	//   25   48:pop             
		stringbuilder.append(", foreignKeys=");
	//   26   49:aload_1         
	//   27   50:ldc2            #291 <String ", foreignKeys=">
	//   28   53:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
		stringbuilder.append(((Object) (foreignKeys)));
	//   30   57:aload_1         
	//   31   58:aload_0         
	//   32   59:getfield        #52  <Field Set foreignKeys>
	//   33   62:invokevirtual   #289 <Method StringBuilder StringBuilder.append(Object)>
	//   34   65:pop             
		stringbuilder.append(", indices=");
	//   35   66:aload_1         
	//   36   67:ldc2            #293 <String ", indices=">
	//   37   70:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   38   73:pop             
		stringbuilder.append(((Object) (indices)));
	//   39   74:aload_1         
	//   40   75:aload_0         
	//   41   76:getfield        #54  <Field Set indices>
	//   42   79:invokevirtual   #289 <Method StringBuilder StringBuilder.append(Object)>
	//   43   82:pop             
		stringbuilder.append('}');
	//   44   83:aload_1         
	//   45   84:bipush          125
	//   46   86:invokevirtual   #284 <Method StringBuilder StringBuilder.append(char)>
	//   47   89:pop             
		return stringbuilder.toString();
	//   48   90:aload_1         
	//   49   91:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   50   94:areturn         
	}

	public final Map columns;
	public final Set foreignKeys;
	public final Set indices;
	public final String name;
}
