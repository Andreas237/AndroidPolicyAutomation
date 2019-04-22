// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room.util;

import java.util.Locale;

// Referenced classes of package android.arch.persistence.room.util:
//			TableInfo

public static class TableInfo$Column
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
			obj = ((Object) ((TableInfo$Column)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TableInfo$Column>
	//   16   28:astore_1        
			if(android.os.Build.VERSION.SDK_INT >= 20)
	//*  17   29:getstatic       #82  <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   32:bipush          20
	//*  19   34:icmplt          50
			{
				if(primaryKeyPosition != ((TableInfo$Column) (obj)).primaryKeyPosition)
	//*  20   37:aload_0         
	//*  21   38:getfield        #29  <Field int primaryKeyPosition>
	//*  22   41:aload_1         
	//*  23   42:getfield        #29  <Field int primaryKeyPosition>
	//*  24   45:icmpeq          63
					return false;
	//   25   48:iconst_0        
	//   26   49:ireturn         
			} else
			if(isPrimaryKey() != ((TableInfo$Column) (obj)).isPrimaryKey())
	//*  27   50:aload_0         
	//*  28   51:invokevirtual   #86  <Method boolean isPrimaryKey()>
	//*  29   54:aload_1         
	//*  30   55:invokevirtual   #86  <Method boolean isPrimaryKey()>
	//*  31   58:icmpeq          63
				return false;
	//   32   61:iconst_0        
	//   33   62:ireturn         
			if(!name.equals(((Object) (((TableInfo$Column) (obj)).name))))
	//*  34   63:aload_0         
	//*  35   64:getfield        #23  <Field String name>
	//*  36   67:aload_1         
	//*  37   68:getfield        #23  <Field String name>
	//*  38   71:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  39   74:ifne            79
				return false;
	//   40   77:iconst_0        
	//   41   78:ireturn         
			if(notNull != ((TableInfo$Column) (obj)).notNull)
	//*  42   79:aload_0         
	//*  43   80:getfield        #27  <Field boolean notNull>
	//*  44   83:aload_1         
	//*  45   84:getfield        #27  <Field boolean notNull>
	//*  46   87:icmpeq          92
				return false;
	//   47   90:iconst_0        
	//   48   91:ireturn         
			return affinity == ((TableInfo$Column) (obj)).affinity;
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

	public TableInfo$Column(String s, String s1, boolean flag, int i)
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
