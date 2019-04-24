// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.SQLiteType;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.sql.language.property.PropertyFactory;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			NameAlias

public class Method extends Property
{
	public static class Cast
	{

		public IProperty as(SQLiteType sqlitetype)
		{
			return ((IProperty) (new Method("CAST", new IProperty[] {
				new Property(property.getTable(), property.getNameAlias().newBuilder().shouldAddIdentifierToAliasName(false).as(sqlitetype.name()).build())
			})));
		//    0    0:new             #6   <Class Method>
		//    1    3:dup             
		//    2    4:ldc1            #26  <String "CAST">
		//    3    6:iconst_1        
		//    4    7:anewarray       IProperty[]
		//    5   10:dup             
		//    6   11:iconst_0        
		//    7   12:new             #30  <Class Property>
		//    8   15:dup             
		//    9   16:aload_0         
		//   10   17:getfield        #17  <Field IProperty property>
		//   11   20:invokeinterface #34  <Method Class IProperty.getTable()>
		//   12   25:aload_0         
		//   13   26:getfield        #17  <Field IProperty property>
		//   14   29:invokeinterface #38  <Method NameAlias IProperty.getNameAlias()>
		//   15   34:invokevirtual   #44  <Method NameAlias$Builder NameAlias.newBuilder()>
		//   16   37:iconst_0        
		//   17   38:invokevirtual   #50  <Method NameAlias$Builder NameAlias$Builder.shouldAddIdentifierToAliasName(boolean)>
		//   18   41:aload_1         
		//   19   42:invokevirtual   #56  <Method String SQLiteType.name()>
		//   20   45:invokevirtual   #59  <Method NameAlias$Builder NameAlias$Builder.as(String)>
		//   21   48:invokevirtual   #62  <Method NameAlias NameAlias$Builder.build()>
		//   22   51:invokespecial   #65  <Method void Property(Class, NameAlias)>
		//   23   54:aastore         
		//   24   55:invokespecial   #68  <Method void Method(String, IProperty[])>
		//   25   58:areturn         
		}

		private final IProperty property;

		private Cast(IProperty iproperty)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			property = iproperty;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field IProperty property>
		//    5    9:return          
		}

	}


	public transient Method(String s, IProperty aiproperty[])
	{
		super(((Class) (null)), (String)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:checkcast       #20  <Class String>
	//    4    6:invokespecial   #23  <Method void Property(Class, String)>
		propertyList = ((List) (new ArrayList()));
	//    5    9:aload_0         
	//    6   10:new             #25  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #28  <Method void ArrayList()>
	//    9   17:putfield        #30  <Field List propertyList>
		operationsList = ((List) (new ArrayList()));
	//   10   20:aload_0         
	//   11   21:new             #25  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #28  <Method void ArrayList()>
	//   14   28:putfield        #32  <Field List operationsList>
		methodProperty = ((IProperty) (new Property(((Class) (null)), NameAlias.rawBuilder(s).build())));
	//   15   31:aload_0         
	//   16   32:new             #4   <Class Property>
	//   17   35:dup             
	//   18   36:aconst_null     
	//   19   37:aload_1         
	//   20   38:invokestatic    #38  <Method NameAlias$Builder NameAlias.rawBuilder(String)>
	//   21   41:invokevirtual   #44  <Method NameAlias NameAlias$Builder.build()>
	//   22   44:invokespecial   #47  <Method void Property(Class, NameAlias)>
	//   23   47:putfield        #49  <Field IProperty methodProperty>
		if(aiproperty.length == 0)
	//*  24   50:aload_2         
	//*  25   51:arraylength     
	//*  26   52:ifne            69
		{
			propertyList.add(((Object) (Property.ALL_PROPERTY)));
	//   27   55:aload_0         
	//   28   56:getfield        #30  <Field List propertyList>
	//   29   59:getstatic       #53  <Field Property Property.ALL_PROPERTY>
	//   30   62:invokeinterface #59  <Method boolean List.add(Object)>
	//   31   67:pop             
		} else
	//*  32   68:return          
		{
			int j = aiproperty.length;
	//   33   69:aload_2         
	//   34   70:arraylength     
	//   35   71:istore          4
			int i = 0;
	//   36   73:iconst_0        
	//   37   74:istore_3        
			while(i < j) 
	//*  38   75:iload_3         
	//*  39   76:iload           4
	//*  40   78:icmpge          68
			{
				addProperty(aiproperty[i]);
	//   41   81:aload_0         
	//   42   82:aload_2         
	//   43   83:iload_3         
	//   44   84:aaload          
	//   45   85:invokevirtual   #63  <Method Method addProperty(IProperty)>
	//   46   88:pop             
				i++;
	//   47   89:iload_3         
	//   48   90:iconst_1        
	//   49   91:iadd            
	//   50   92:istore_3        
			}
		}
	//*  51   93:goto            75
	}

	public transient Method(IProperty aiproperty[])
	{
		this(((String) (null)), aiproperty);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokespecial   #67  <Method void Method(String, IProperty[])>
	//    4    6:return          
	}

	public static transient Method avg(IProperty aiproperty[])
	{
		return new Method("AVG", aiproperty);
	//    0    0:new             #2   <Class Method>
	//    1    3:dup             
	//    2    4:ldc1            #71  <String "AVG">
	//    3    6:aload_0         
	//    4    7:invokespecial   #67  <Method void Method(String, IProperty[])>
	//    5   10:areturn         
	}

	public static Cast cast(IProperty iproperty)
	{
		return new Cast(iproperty);
	//    0    0:new             #8   <Class Method$Cast>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #77  <Method void Method$Cast(IProperty, Method$1)>
	//    5    9:areturn         
	}

	public static transient Method count(IProperty aiproperty[])
	{
		return new Method("COUNT", aiproperty);
	//    0    0:new             #2   <Class Method>
	//    1    3:dup             
	//    2    4:ldc1            #81  <String "COUNT">
	//    3    6:aload_0         
	//    4    7:invokespecial   #67  <Method void Method(String, IProperty[])>
	//    5   10:areturn         
	}

	public static transient Method group_concat(IProperty aiproperty[])
	{
		return new Method("GROUP_CONCAT", aiproperty);
	//    0    0:new             #2   <Class Method>
	//    1    3:dup             
	//    2    4:ldc1            #84  <String "GROUP_CONCAT">
	//    3    6:aload_0         
	//    4    7:invokespecial   #67  <Method void Method(String, IProperty[])>
	//    5   10:areturn         
	}

	public static transient Method max(IProperty aiproperty[])
	{
		return new Method("MAX", aiproperty);
	//    0    0:new             #2   <Class Method>
	//    1    3:dup             
	//    2    4:ldc1            #87  <String "MAX">
	//    3    6:aload_0         
	//    4    7:invokespecial   #67  <Method void Method(String, IProperty[])>
	//    5   10:areturn         
	}

	public static transient Method min(IProperty aiproperty[])
	{
		return new Method("MIN", aiproperty);
	//    0    0:new             #2   <Class Method>
	//    1    3:dup             
	//    2    4:ldc1            #90  <String "MIN">
	//    3    6:aload_0         
	//    4    7:invokespecial   #67  <Method void Method(String, IProperty[])>
	//    5   10:areturn         
	}

	public static Method replace(IProperty iproperty, String s, String s1)
	{
		return new Method("REPLACE", new IProperty[] {
			iproperty, PropertyFactory.from(((Object) (s))), PropertyFactory.from(((Object) (s1)))
		});
	//    0    0:new             #2   <Class Method>
	//    1    3:dup             
	//    2    4:ldc1            #94  <String "REPLACE">
	//    3    6:iconst_3        
	//    4    7:anewarray       IProperty[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:aload_1         
	//   12   17:invokestatic    #102 <Method Property PropertyFactory.from(Object)>
	//   13   20:aastore         
	//   14   21:dup             
	//   15   22:iconst_2        
	//   16   23:aload_2         
	//   17   24:invokestatic    #102 <Method Property PropertyFactory.from(Object)>
	//   18   27:aastore         
	//   19   28:invokespecial   #67  <Method void Method(String, IProperty[])>
	//   20   31:areturn         
	}

	public static transient Method sum(IProperty aiproperty[])
	{
		return new Method("SUM", aiproperty);
	//    0    0:new             #2   <Class Method>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "SUM">
	//    3    6:aload_0         
	//    4    7:invokespecial   #67  <Method void Method(String, IProperty[])>
	//    5   10:areturn         
	}

	public static transient Method total(IProperty aiproperty[])
	{
		return new Method("TOTAL", aiproperty);
	//    0    0:new             #2   <Class Method>
	//    1    3:dup             
	//    2    4:ldc1            #108 <String "TOTAL">
	//    3    6:aload_0         
	//    4    7:invokespecial   #67  <Method void Method(String, IProperty[])>
	//    5   10:areturn         
	}

	public Method addProperty(IProperty iproperty)
	{
		if(propertyList.size() == 1 && propertyList.get(0) == Property.ALL_PROPERTY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field List propertyList>
	//*   2    4:invokeinterface #112 <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          40
	//*   5   13:aload_0         
	//*   6   14:getfield        #30  <Field List propertyList>
	//*   7   17:iconst_0        
	//*   8   18:invokeinterface #116 <Method Object List.get(int)>
	//*   9   23:getstatic       #53  <Field Property Property.ALL_PROPERTY>
	//*  10   26:if_acmpne       40
			propertyList.remove(0);
	//   11   29:aload_0         
	//   12   30:getfield        #30  <Field List propertyList>
	//   13   33:iconst_0        
	//   14   34:invokeinterface #119 <Method Object List.remove(int)>
	//   15   39:pop             
		return append(iproperty, ",");
	//   16   40:aload_0         
	//   17   41:aload_1         
	//   18   42:ldc1            #121 <String ",">
	//   19   44:invokevirtual   #125 <Method Method append(IProperty, String)>
	//   20   47:areturn         
	}

	public Method append(IProperty iproperty, String s)
	{
		propertyList.add(((Object) (iproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List propertyList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #59  <Method boolean List.add(Object)>
	//    4   10:pop             
		operationsList.add(((Object) (s)));
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field List operationsList>
	//    7   15:aload_2         
	//    8   16:invokeinterface #59  <Method boolean List.add(Object)>
	//    9   21:pop             
		return this;
	//   10   22:aload_0         
	//   11   23:areturn         
	}

	public NameAlias getNameAlias()
	{
		if(nameAlias == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field NameAlias nameAlias>
	//*   2    4:ifnonnull       184
		{
			String s1 = methodProperty.getQuery();
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field IProperty methodProperty>
	//    5   11:invokeinterface #134 <Method String IProperty.getQuery()>
	//    6   16:astore_3        
			String s = s1;
	//    7   17:aload_3         
	//    8   18:astore_2        
			if(s1 == null)
	//*   9   19:aload_3         
	//*  10   20:ifnonnull       26
				s = "";
	//   11   23:ldc1            #136 <String "">
	//   12   25:astore_2        
			s = (new StringBuilder()).append(s).append("(").toString();
	//   13   26:new             #138 <Class StringBuilder>
	//   14   29:dup             
	//   15   30:invokespecial   #139 <Method void StringBuilder()>
	//   16   33:aload_2         
	//   17   34:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:ldc1            #144 <String "(">
	//   19   39:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   21   45:astore_2        
			List list = getPropertyList();
	//   22   46:aload_0         
	//   23   47:invokevirtual   #151 <Method List getPropertyList()>
	//   24   50:astore          4
			for(int i = 0; i < list.size(); i++)
	//*  25   52:iconst_0        
	//*  26   53:istore_1        
	//*  27   54:iload_1         
	//*  28   55:aload           4
	//*  29   57:invokeinterface #112 <Method int List.size()>
	//*  30   62:icmpge          155
			{
				IProperty iproperty = (IProperty)list.get(i);
	//   31   65:aload           4
	//   32   67:iload_1         
	//   33   68:invokeinterface #116 <Method Object List.get(int)>
	//   34   73:checkcast       #96  <Class IProperty>
	//   35   76:astore          5
				String s2 = s;
	//   36   78:aload_2         
	//   37   79:astore_3        
				if(i > 0)
	//*  38   80:iload_1         
	//*  39   81:ifle            125
					s2 = (new StringBuilder()).append(s).append(" ").append((String)operationsList.get(i)).append(" ").toString();
	//   40   84:new             #138 <Class StringBuilder>
	//   41   87:dup             
	//   42   88:invokespecial   #139 <Method void StringBuilder()>
	//   43   91:aload_2         
	//   44   92:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   45   95:ldc1            #153 <String " ">
	//   46   97:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   47  100:aload_0         
	//   48  101:getfield        #32  <Field List operationsList>
	//   49  104:iload_1         
	//   50  105:invokeinterface #116 <Method Object List.get(int)>
	//   51  110:checkcast       #20  <Class String>
	//   52  113:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   53  116:ldc1            #153 <String " ">
	//   54  118:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   55  121:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   56  124:astore_3        
				s = (new StringBuilder()).append(s2).append(((Object) (iproperty)).toString()).toString();
	//   57  125:new             #138 <Class StringBuilder>
	//   58  128:dup             
	//   59  129:invokespecial   #139 <Method void StringBuilder()>
	//   60  132:aload_3         
	//   61  133:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   62  136:aload           5
	//   63  138:invokevirtual   #156 <Method String Object.toString()>
	//   64  141:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   65  144:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   66  147:astore_2        
			}

	//   67  148:iload_1         
	//   68  149:iconst_1        
	//   69  150:iadd            
	//   70  151:istore_1        
	//*  71  152:goto            54
			nameAlias = NameAlias.rawBuilder((new StringBuilder()).append(s).append(")").toString()).build();
	//   72  155:aload_0         
	//   73  156:new             #138 <Class StringBuilder>
	//   74  159:dup             
	//   75  160:invokespecial   #139 <Method void StringBuilder()>
	//   76  163:aload_2         
	//   77  164:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   78  167:ldc1            #158 <String ")">
	//   79  169:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   80  172:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   81  175:invokestatic    #38  <Method NameAlias$Builder NameAlias.rawBuilder(String)>
	//   82  178:invokevirtual   #44  <Method NameAlias NameAlias$Builder.build()>
	//   83  181:putfield        #130 <Field NameAlias nameAlias>
		}
		return nameAlias;
	//   84  184:aload_0         
	//   85  185:getfield        #130 <Field NameAlias nameAlias>
	//   86  188:areturn         
	}

	protected List getPropertyList()
	{
		return propertyList;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List propertyList>
	//    2    4:areturn         
	}

	public Method minus(IProperty iproperty)
	{
		return append(iproperty, "-");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #164 <String "-">
	//    3    4:invokevirtual   #125 <Method Method append(IProperty, String)>
	//    4    7:areturn         
	}

	public volatile IProperty minus(IProperty iproperty)
	{
		return ((IProperty) (minus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #167 <Method Method minus(IProperty)>
	//    3    5:areturn         
	}

	public volatile Property minus(IProperty iproperty)
	{
		return ((Property) (minus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #167 <Method Method minus(IProperty)>
	//    3    5:areturn         
	}

	public Method plus(IProperty iproperty)
	{
		return append(iproperty, "+");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #171 <String "+">
	//    3    4:invokevirtual   #125 <Method Method append(IProperty, String)>
	//    4    7:areturn         
	}

	public volatile IProperty plus(IProperty iproperty)
	{
		return ((IProperty) (plus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #173 <Method Method plus(IProperty)>
	//    3    5:areturn         
	}

	public volatile Property plus(IProperty iproperty)
	{
		return ((Property) (plus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #173 <Method Method plus(IProperty)>
	//    3    5:areturn         
	}

	private final IProperty methodProperty;
	private List operationsList;
	private final List propertyList;
}
