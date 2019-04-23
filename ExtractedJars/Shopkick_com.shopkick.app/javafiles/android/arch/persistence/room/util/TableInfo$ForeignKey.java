// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room.util;

import java.util.Collections;
import java.util.List;

// Referenced classes of package android.arch.persistence.room.util:
//			TableInfo

public static class TableInfo$ForeignKey
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
			obj = ((Object) ((TableInfo$ForeignKey)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TableInfo$ForeignKey>
	//   16   28:astore_1        
			if(!referenceTable.equals(((Object) (((TableInfo$ForeignKey) (obj)).referenceTable))))
	//*  17   29:aload_0         
	//*  18   30:getfield        #27  <Field String referenceTable>
	//*  19   33:aload_1         
	//*  20   34:getfield        #27  <Field String referenceTable>
	//*  21   37:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  22   40:ifne            45
				return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
			if(!onDelete.equals(((Object) (((TableInfo$ForeignKey) (obj)).onDelete))))
	//*  25   45:aload_0         
	//*  26   46:getfield        #29  <Field String onDelete>
	//*  27   49:aload_1         
	//*  28   50:getfield        #29  <Field String onDelete>
	//*  29   53:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  30   56:ifne            61
				return false;
	//   31   59:iconst_0        
	//   32   60:ireturn         
			if(!onUpdate.equals(((Object) (((TableInfo$ForeignKey) (obj)).onUpdate))))
	//*  33   61:aload_0         
	//*  34   62:getfield        #31  <Field String onUpdate>
	//*  35   65:aload_1         
	//*  36   66:getfield        #31  <Field String onUpdate>
	//*  37   69:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  38   72:ifne            77
				return false;
	//   39   75:iconst_0        
	//   40   76:ireturn         
			if(!columnNames.equals(((Object) (((TableInfo$ForeignKey) (obj)).columnNames))))
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
				return referenceColumnNames.equals(((Object) (((TableInfo$ForeignKey) (obj)).referenceColumnNames)));
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

	public TableInfo$ForeignKey(String s, String s1, String s2, List list, List list1)
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
