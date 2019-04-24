// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.StringUtils;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;

public class NameAlias
	implements Query
{
	public static class Builder
	{

		public Builder as(String s)
		{
			aliasName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field String aliasName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public NameAlias build()
		{
			return new NameAlias(this);
		//    0    0:new             #6   <Class NameAlias>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #56  <Method void NameAlias(NameAlias$Builder, NameAlias$1)>
		//    5    9:areturn         
		}

		public Builder distinct()
		{
			return keyword("DISTINCT");
		//    0    0:aload_0         
		//    1    1:ldc1            #60  <String "DISTINCT">
		//    2    3:invokevirtual   #62  <Method NameAlias$Builder keyword(String)>
		//    3    6:areturn         
		}

		public Builder keyword(String s)
		{
			keyword = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field String keyword>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder shouldAddIdentifierToAliasName(boolean flag)
		{
			shouldAddIdentifierToAliasName = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #30  <Field boolean shouldAddIdentifierToAliasName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder shouldAddIdentifierToName(boolean flag)
		{
			shouldAddIdentifierToQuery = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #28  <Field boolean shouldAddIdentifierToQuery>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder shouldStripAliasName(boolean flag)
		{
			shouldStripAliasName = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #26  <Field boolean shouldStripAliasName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder shouldStripIdentifier(boolean flag)
		{
			shouldStripIdentifier = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #24  <Field boolean shouldStripIdentifier>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder withTable(String s)
		{
			tableName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #47  <Field String tableName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String aliasName;
		private String keyword;
		private final String name;
		private boolean shouldAddIdentifierToAliasName;
		private boolean shouldAddIdentifierToQuery;
		private boolean shouldStripAliasName;
		private boolean shouldStripIdentifier;
		private String tableName;


/*
		static boolean access$000(Builder builder1)
		{
			return builder1.shouldStripIdentifier;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field boolean shouldStripIdentifier>
		//    2    4:ireturn         
		}

*/


/*
		static String access$100(Builder builder1)
		{
			return builder1.name;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field String name>
		//    2    4:areturn         
		}

*/


/*
		static String access$200(Builder builder1)
		{
			return builder1.keyword;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field String keyword>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$300(Builder builder1)
		{
			return builder1.shouldStripAliasName;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field boolean shouldStripAliasName>
		//    2    4:ireturn         
		}

*/


/*
		static String access$400(Builder builder1)
		{
			return builder1.aliasName;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field String aliasName>
		//    2    4:areturn         
		}

*/


/*
		static String access$500(Builder builder1)
		{
			return builder1.tableName;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field String tableName>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$600(Builder builder1)
		{
			return builder1.shouldAddIdentifierToQuery;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field boolean shouldAddIdentifierToQuery>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$700(Builder builder1)
		{
			return builder1.shouldAddIdentifierToAliasName;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field boolean shouldAddIdentifierToAliasName>
		//    2    4:ireturn         
		}

*/

		public Builder(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			shouldStripIdentifier = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #24  <Field boolean shouldStripIdentifier>
			shouldStripAliasName = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #26  <Field boolean shouldStripAliasName>
			shouldAddIdentifierToQuery = true;
		//    8   14:aload_0         
		//    9   15:iconst_1        
		//   10   16:putfield        #28  <Field boolean shouldAddIdentifierToQuery>
			shouldAddIdentifierToAliasName = true;
		//   11   19:aload_0         
		//   12   20:iconst_1        
		//   13   21:putfield        #30  <Field boolean shouldAddIdentifierToAliasName>
			name = s;
		//   14   24:aload_0         
		//   15   25:aload_1         
		//   16   26:putfield        #32  <Field String name>
		//   17   29:return          
		}
	}


	private NameAlias(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		if(builder1.shouldStripIdentifier)
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #30  <Method boolean NameAlias$Builder.access$000(NameAlias$Builder)>
	//*   4    8:ifeq            102
			name = QueryBuilder.stripQuotes(builder1.name);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #34  <Method String NameAlias$Builder.access$100(NameAlias$Builder)>
	//    8   16:invokestatic    #40  <Method String QueryBuilder.stripQuotes(String)>
	//    9   19:putfield        #42  <Field String name>
		else
	//*  10   22:aload_0         
	//*  11   23:aload_1         
	//*  12   24:invokestatic    #45  <Method String NameAlias$Builder.access$200(NameAlias$Builder)>
	//*  13   27:putfield        #47  <Field String keyword>
	//*  14   30:aload_1         
	//*  15   31:invokestatic    #50  <Method boolean NameAlias$Builder.access$300(NameAlias$Builder)>
	//*  16   34:ifeq            113
	//*  17   37:aload_0         
	//*  18   38:aload_1         
	//*  19   39:invokestatic    #53  <Method String NameAlias$Builder.access$400(NameAlias$Builder)>
	//*  20   42:invokestatic    #40  <Method String QueryBuilder.stripQuotes(String)>
	//*  21   45:putfield        #55  <Field String aliasName>
	//*  22   48:aload_1         
	//*  23   49:invokestatic    #58  <Method String NameAlias$Builder.access$500(NameAlias$Builder)>
	//*  24   52:invokestatic    #64  <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//*  25   55:ifeq            124
	//*  26   58:aload_0         
	//*  27   59:aload_1         
	//*  28   60:invokestatic    #58  <Method String NameAlias$Builder.access$500(NameAlias$Builder)>
	//*  29   63:invokestatic    #67  <Method String QueryBuilder.quoteIfNeeded(String)>
	//*  30   66:putfield        #69  <Field String tableName>
	//*  31   69:aload_0         
	//*  32   70:aload_1         
	//*  33   71:invokestatic    #30  <Method boolean NameAlias$Builder.access$000(NameAlias$Builder)>
	//*  34   74:putfield        #71  <Field boolean shouldStripIdentifier>
	//*  35   77:aload_0         
	//*  36   78:aload_1         
	//*  37   79:invokestatic    #50  <Method boolean NameAlias$Builder.access$300(NameAlias$Builder)>
	//*  38   82:putfield        #73  <Field boolean shouldStripAliasName>
	//*  39   85:aload_0         
	//*  40   86:aload_1         
	//*  41   87:invokestatic    #76  <Method boolean NameAlias$Builder.access$600(NameAlias$Builder)>
	//*  42   90:putfield        #78  <Field boolean shouldAddIdentifierToQuery>
	//*  43   93:aload_0         
	//*  44   94:aload_1         
	//*  45   95:invokestatic    #81  <Method boolean NameAlias$Builder.access$700(NameAlias$Builder)>
	//*  46   98:putfield        #83  <Field boolean shouldAddIdentifierToAliasName>
	//*  47  101:return          
			name = builder1.name;
	//   48  102:aload_0         
	//   49  103:aload_1         
	//   50  104:invokestatic    #34  <Method String NameAlias$Builder.access$100(NameAlias$Builder)>
	//   51  107:putfield        #42  <Field String name>
		keyword = builder1.keyword;
		if(builder1.shouldStripAliasName)
			aliasName = QueryBuilder.stripQuotes(builder1.aliasName);
		else
	//*  52  110:goto            22
			aliasName = builder1.aliasName;
	//   53  113:aload_0         
	//   54  114:aload_1         
	//   55  115:invokestatic    #53  <Method String NameAlias$Builder.access$400(NameAlias$Builder)>
	//   56  118:putfield        #55  <Field String aliasName>
		if(StringUtils.isNotNullOrEmpty(builder1.tableName))
			tableName = QueryBuilder.quoteIfNeeded(builder1.tableName);
		else
	//*  57  121:goto            48
			tableName = null;
	//   58  124:aload_0         
	//   59  125:aconst_null     
	//   60  126:putfield        #69  <Field String tableName>
		shouldStripIdentifier = builder1.shouldStripIdentifier;
		shouldStripAliasName = builder1.shouldStripAliasName;
		shouldAddIdentifierToQuery = builder1.shouldAddIdentifierToQuery;
		shouldAddIdentifierToAliasName = builder1.shouldAddIdentifierToAliasName;
	//*  61  129:goto            69
	}


	public static Builder builder(String s)
	{
		return new Builder(s);
	//    0    0:new             #10  <Class NameAlias$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #92  <Method void NameAlias$Builder(String)>
	//    4    8:areturn         
	}

	public static transient NameAlias joinNames(String s, String as[])
	{
		if(as.length == 0)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:ifne            7
			return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
		String s1 = "";
	//    5    7:ldc1            #96  <String "">
	//    6    9:astore_3        
		for(int i = 0; i < as.length; i++)
	//*   7   10:iconst_0        
	//*   8   11:istore_2        
	//*   9   12:iload_2         
	//*  10   13:aload_1         
	//*  11   14:arraylength     
	//*  12   15:icmpge          84
		{
			String s2 = s1;
	//   13   18:aload_3         
	//   14   19:astore          4
			if(i > 0)
	//*  15   21:iload_2         
	//*  16   22:ifle            55
				s2 = (new StringBuilder()).append(s1).append(" ").append(s).append(" ").toString();
	//   17   25:new             #98  <Class StringBuilder>
	//   18   28:dup             
	//   19   29:invokespecial   #99  <Method void StringBuilder()>
	//   20   32:aload_3         
	//   21   33:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   22   36:ldc1            #105 <String " ">
	//   23   38:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   24   41:aload_0         
	//   25   42:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   26   45:ldc1            #105 <String " ">
	//   27   47:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   28   50:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   29   53:astore          4
			s1 = (new StringBuilder()).append(s2).append(as[i]).toString();
	//   30   55:new             #98  <Class StringBuilder>
	//   31   58:dup             
	//   32   59:invokespecial   #99  <Method void StringBuilder()>
	//   33   62:aload           4
	//   34   64:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:aload_1         
	//   36   68:iload_2         
	//   37   69:aaload          
	//   38   70:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   39   73:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   40   76:astore_3        
		}

	//   41   77:iload_2         
	//   42   78:iconst_1        
	//   43   79:iadd            
	//   44   80:istore_2        
	//*  45   81:goto            12
		return rawBuilder(s1).build();
	//   46   84:aload_3         
	//   47   85:invokestatic    #112 <Method NameAlias$Builder rawBuilder(String)>
	//   48   88:invokevirtual   #116 <Method NameAlias NameAlias$Builder.build()>
	//   49   91:areturn         
	}

	public static Builder rawBuilder(String s)
	{
		return (new Builder(s)).shouldStripIdentifier(false).shouldAddIdentifierToName(false);
	//    0    0:new             #10  <Class NameAlias$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #92  <Method void NameAlias$Builder(String)>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #119 <Method NameAlias$Builder NameAlias$Builder.shouldStripIdentifier(boolean)>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #122 <Method NameAlias$Builder NameAlias$Builder.shouldAddIdentifierToName(boolean)>
	//    8   16:areturn         
	}

	public String aliasName()
	{
		if(StringUtils.isNotNullOrEmpty(aliasName) && shouldAddIdentifierToAliasName)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field String aliasName>
	//*   2    4:invokestatic    #64  <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//*   3    7:ifeq            25
	//*   4   10:aload_0         
	//*   5   11:getfield        #83  <Field boolean shouldAddIdentifierToAliasName>
	//*   6   14:ifeq            25
			return QueryBuilder.quoteIfNeeded(aliasName);
	//    7   17:aload_0         
	//    8   18:getfield        #55  <Field String aliasName>
	//    9   21:invokestatic    #67  <Method String QueryBuilder.quoteIfNeeded(String)>
	//   10   24:areturn         
		else
			return aliasName;
	//   11   25:aload_0         
	//   12   26:getfield        #55  <Field String aliasName>
	//   13   29:areturn         
	}

	public String aliasNameRaw()
	{
		if(shouldStripAliasName)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean shouldStripAliasName>
	//*   2    4:ifeq            12
			return aliasName;
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field String aliasName>
	//    5   11:areturn         
		else
			return QueryBuilder.stripQuotes(aliasName);
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field String aliasName>
	//    8   16:invokestatic    #40  <Method String QueryBuilder.stripQuotes(String)>
	//    9   19:areturn         
	}

	public String fullName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #98  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void StringBuilder()>
	//    3    7:astore_2        
		String s;
		if(StringUtils.isNotNullOrEmpty(tableName))
	//*   4    8:aload_0         
	//*   5    9:getfield        #69  <Field String tableName>
	//*   6   12:invokestatic    #64  <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//*   7   15:ifeq            57
			s = (new StringBuilder()).append(tableName()).append(".").toString();
	//    8   18:new             #98  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #99  <Method void StringBuilder()>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #126 <Method String tableName()>
	//   13   29:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:ldc1            #128 <String ".">
	//   15   34:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   17   40:astore_1        
		else
	//*  18   41:aload_2         
	//*  19   42:aload_1         
	//*  20   43:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  21   46:aload_0         
	//*  22   47:invokevirtual   #130 <Method String name()>
	//*  23   50:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  24   53:invokevirtual   #109 <Method String StringBuilder.toString()>
	//*  25   56:areturn         
			s = "";
	//   26   57:ldc1            #96  <String "">
	//   27   59:astore_1        
		return stringbuilder.append(s).append(name()).toString();
	//*  28   60:goto            41
	}

	public String getFullQuery()
	{
		String s1 = fullName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method String fullName()>
	//    2    4:astore_2        
		String s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(StringUtils.isNotNullOrEmpty(aliasName))
	//*   5    7:aload_0         
	//*   6    8:getfield        #55  <Field String aliasName>
	//*   7   11:invokestatic    #64  <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//*   8   14:ifeq            44
			s = (new StringBuilder()).append(s1).append(" AS ").append(aliasName()).toString();
	//    9   17:new             #98  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #99  <Method void StringBuilder()>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:ldc1            #135 <String " AS ">
	//   15   30:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:aload_0         
	//   17   34:invokevirtual   #137 <Method String aliasName()>
	//   18   37:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   20   43:astore_1        
		s1 = s;
	//   21   44:aload_1         
	//   22   45:astore_2        
		if(StringUtils.isNotNullOrEmpty(keyword))
	//*  23   46:aload_0         
	//*  24   47:getfield        #47  <Field String keyword>
	//*  25   50:invokestatic    #64  <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//*  26   53:ifeq            83
			s1 = (new StringBuilder()).append(keyword).append(" ").append(s).toString();
	//   27   56:new             #98  <Class StringBuilder>
	//   28   59:dup             
	//   29   60:invokespecial   #99  <Method void StringBuilder()>
	//   30   63:aload_0         
	//   31   64:getfield        #47  <Field String keyword>
	//   32   67:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   33   70:ldc1            #105 <String " ">
	//   34   72:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   35   75:aload_1         
	//   36   76:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   37   79:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   38   82:astore_2        
		return s1;
	//   39   83:aload_2         
	//   40   84:areturn         
	}

	public String getNameAsKey()
	{
		if(StringUtils.isNotNullOrEmpty(aliasName))
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field String aliasName>
	//*   2    4:invokestatic    #64  <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//*   3    7:ifeq            15
			return aliasNameRaw();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #140 <Method String aliasNameRaw()>
	//    6   14:areturn         
		else
			return nameRaw();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #143 <Method String nameRaw()>
	//    9   19:areturn         
	}

	public String getQuery()
	{
		if(StringUtils.isNotNullOrEmpty(aliasName))
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field String aliasName>
	//*   2    4:invokestatic    #64  <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//*   3    7:ifeq            15
			return aliasName();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #137 <Method String aliasName()>
	//    6   14:areturn         
		if(StringUtils.isNotNullOrEmpty(name))
	//*   7   15:aload_0         
	//*   8   16:getfield        #42  <Field String name>
	//*   9   19:invokestatic    #64  <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//*  10   22:ifeq            30
			return fullName();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #133 <Method String fullName()>
	//   13   29:areturn         
		else
			return "";
	//   14   30:ldc1            #96  <String "">
	//   15   32:areturn         
	}

	public String keyword()
	{
		return keyword;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String keyword>
	//    2    4:areturn         
	}

	public String name()
	{
		if(StringUtils.isNotNullOrEmpty(name) && shouldAddIdentifierToQuery)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field String name>
	//*   2    4:invokestatic    #64  <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//*   3    7:ifeq            25
	//*   4   10:aload_0         
	//*   5   11:getfield        #78  <Field boolean shouldAddIdentifierToQuery>
	//*   6   14:ifeq            25
			return QueryBuilder.quoteIfNeeded(name);
	//    7   17:aload_0         
	//    8   18:getfield        #42  <Field String name>
	//    9   21:invokestatic    #67  <Method String QueryBuilder.quoteIfNeeded(String)>
	//   10   24:areturn         
		else
			return name;
	//   11   25:aload_0         
	//   12   26:getfield        #42  <Field String name>
	//   13   29:areturn         
	}

	public String nameRaw()
	{
		if(shouldStripIdentifier)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean shouldStripIdentifier>
	//*   2    4:ifeq            12
			return name;
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field String name>
	//    5   11:areturn         
		else
			return QueryBuilder.stripQuotes(name);
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field String name>
	//    8   16:invokestatic    #40  <Method String QueryBuilder.stripQuotes(String)>
	//    9   19:areturn         
	}

	public Builder newBuilder()
	{
		return (new Builder(name)).keyword(keyword).as(aliasName).shouldStripAliasName(shouldStripAliasName).shouldStripIdentifier(shouldStripIdentifier).shouldAddIdentifierToName(shouldAddIdentifierToQuery).shouldAddIdentifierToAliasName(shouldAddIdentifierToAliasName).withTable(tableName);
	//    0    0:new             #10  <Class NameAlias$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field String name>
	//    4    8:invokespecial   #92  <Method void NameAlias$Builder(String)>
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field String keyword>
	//    7   15:invokevirtual   #148 <Method NameAlias$Builder NameAlias$Builder.keyword(String)>
	//    8   18:aload_0         
	//    9   19:getfield        #55  <Field String aliasName>
	//   10   22:invokevirtual   #151 <Method NameAlias$Builder NameAlias$Builder.as(String)>
	//   11   25:aload_0         
	//   12   26:getfield        #73  <Field boolean shouldStripAliasName>
	//   13   29:invokevirtual   #153 <Method NameAlias$Builder NameAlias$Builder.shouldStripAliasName(boolean)>
	//   14   32:aload_0         
	//   15   33:getfield        #71  <Field boolean shouldStripIdentifier>
	//   16   36:invokevirtual   #119 <Method NameAlias$Builder NameAlias$Builder.shouldStripIdentifier(boolean)>
	//   17   39:aload_0         
	//   18   40:getfield        #78  <Field boolean shouldAddIdentifierToQuery>
	//   19   43:invokevirtual   #122 <Method NameAlias$Builder NameAlias$Builder.shouldAddIdentifierToName(boolean)>
	//   20   46:aload_0         
	//   21   47:getfield        #83  <Field boolean shouldAddIdentifierToAliasName>
	//   22   50:invokevirtual   #155 <Method NameAlias$Builder NameAlias$Builder.shouldAddIdentifierToAliasName(boolean)>
	//   23   53:aload_0         
	//   24   54:getfield        #69  <Field String tableName>
	//   25   57:invokevirtual   #158 <Method NameAlias$Builder NameAlias$Builder.withTable(String)>
	//   26   60:areturn         
	}

	public boolean shouldStripAliasName()
	{
		return shouldStripAliasName;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field boolean shouldStripAliasName>
	//    2    4:ireturn         
	}

	public boolean shouldStripIdentifier()
	{
		return shouldStripIdentifier;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean shouldStripIdentifier>
	//    2    4:ireturn         
	}

	public String tableName()
	{
		return tableName;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String tableName>
	//    2    4:areturn         
	}

	public String toString()
	{
		return getFullQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #161 <Method String getFullQuery()>
	//    2    4:areturn         
	}

	private final String aliasName;
	private final String keyword;
	private final String name;
	private final boolean shouldAddIdentifierToAliasName;
	private final boolean shouldAddIdentifierToQuery;
	private final boolean shouldStripAliasName;
	private final boolean shouldStripIdentifier;
	private final String tableName;
}
