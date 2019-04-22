// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.*;
import java.util.*;

public class SubTypeValidator
{

	protected SubTypeValidator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void Object()>
		_cfgIllegalClassNames = DEFAULT_NO_DESER_CLASS_NAMES;
	//    2    4:aload_0         
	//    3    5:getstatic       #69  <Field Set DEFAULT_NO_DESER_CLASS_NAMES>
	//    4    8:putfield        #76  <Field Set _cfgIllegalClassNames>
	//    5   11:return          
	}

	public static SubTypeValidator instance()
	{
		return instance;
	//    0    0:getstatic       #72  <Field SubTypeValidator instance>
	//    1    3:areturn         
	}

	public void validateSubType(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException
	{
label0:
		{
			javatype = ((JavaType) (javatype.getRawClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #87  <Method Class JavaType.getRawClass()>
	//    2    4:astore_2        
			String s = ((Class) (javatype)).getName();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #93  <Method String Class.getName()>
	//    5    9:astore          4
			if(!_cfgIllegalClassNames.contains(((Object) (s))))
	//*   6   11:aload_0         
	//*   7   12:getfield        #76  <Field Set _cfgIllegalClassNames>
	//*   8   15:aload           4
	//*   9   17:invokeinterface #96  <Method boolean Set.contains(Object)>
	//*  10   22:ifeq            28
	//*  11   25:goto            92
			{
				if(((Class) (javatype)).isInterface() || !s.startsWith("org.springframework."))
					break label0;
	//   12   28:aload_2         
	//   13   29:invokevirtual   #100 <Method boolean Class.isInterface()>
	//   14   32:ifne            110
	//   15   35:aload           4
	//   16   37:ldc1            #102 <String "org.springframework.">
	//   17   39:invokevirtual   #108 <Method boolean String.startsWith(String)>
	//   18   42:ifeq            110
				do
				{
					if(javatype == null || javatype == java/lang/Object)
						break label0;
	//   19   45:aload_2         
	//   20   46:ifnull          110
	//   21   49:aload_2         
	//   22   50:ldc1            #4   <Class Object>
	//   23   52:if_acmpeq       110
					String s1 = ((Class) (javatype)).getSimpleName();
	//   24   55:aload_2         
	//   25   56:invokevirtual   #111 <Method String Class.getSimpleName()>
	//   26   59:astore          5
					if("AbstractPointcutAdvisor".equals(((Object) (s1))) || "AbstractApplicationContext".equals(((Object) (s1))))
	//*  27   61:ldc1            #113 <String "AbstractPointcutAdvisor">
	//*  28   63:aload           5
	//*  29   65:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  30   68:ifne            92
	//*  31   71:ldc1            #118 <String "AbstractApplicationContext">
	//*  32   73:aload           5
	//*  33   75:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  34   78:ifeq            84
						break;
	//   35   81:goto            92
					javatype = ((JavaType) (((Class) (javatype)).getSuperclass()));
	//   36   84:aload_2         
	//   37   85:invokevirtual   #121 <Method Class Class.getSuperclass()>
	//   38   88:astore_2        
				} while(true);
	//   39   89:goto            45
			}
			deserializationcontext.reportBadTypeDefinition(beandescription, "Illegal type (%s) to deserialize: prevented for security reasons", new Object[] {
				s
			});
	//   40   92:aload_1         
	//   41   93:aload_3         
	//   42   94:ldc1            #123 <String "Illegal type (%s) to deserialize: prevented for security reasons">
	//   43   96:iconst_1        
	//   44   97:anewarray       Object[]
	//   45  100:dup             
	//   46  101:iconst_0        
	//   47  102:aload           4
	//   48  104:aastore         
	//   49  105:invokevirtual   #129 <Method Object DeserializationContext.reportBadTypeDefinition(BeanDescription, String, Object[])>
	//   50  108:pop             
			return;
	//   51  109:return          
		}
	//   52  110:return          
	}

	protected static final Set DEFAULT_NO_DESER_CLASS_NAMES;
	private static final SubTypeValidator instance = new SubTypeValidator();
	protected Set _cfgIllegalClassNames;

	static 
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #14  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void HashSet()>
	//    3    7:astore_0        
		((Set) (hashset)).add("org.apache.commons.collections.functors.InvokerTransformer");
	//    4    8:aload_0         
	//    5    9:ldc1            #19  <String "org.apache.commons.collections.functors.InvokerTransformer">
	//    6   11:invokeinterface #25  <Method boolean Set.add(Object)>
	//    7   16:pop             
		((Set) (hashset)).add("org.apache.commons.collections.functors.InstantiateTransformer");
	//    8   17:aload_0         
	//    9   18:ldc1            #27  <String "org.apache.commons.collections.functors.InstantiateTransformer">
	//   10   20:invokeinterface #25  <Method boolean Set.add(Object)>
	//   11   25:pop             
		((Set) (hashset)).add("org.apache.commons.collections4.functors.InvokerTransformer");
	//   12   26:aload_0         
	//   13   27:ldc1            #29  <String "org.apache.commons.collections4.functors.InvokerTransformer">
	//   14   29:invokeinterface #25  <Method boolean Set.add(Object)>
	//   15   34:pop             
		((Set) (hashset)).add("org.apache.commons.collections4.functors.InstantiateTransformer");
	//   16   35:aload_0         
	//   17   36:ldc1            #31  <String "org.apache.commons.collections4.functors.InstantiateTransformer">
	//   18   38:invokeinterface #25  <Method boolean Set.add(Object)>
	//   19   43:pop             
		((Set) (hashset)).add("org.codehaus.groovy.runtime.ConvertedClosure");
	//   20   44:aload_0         
	//   21   45:ldc1            #33  <String "org.codehaus.groovy.runtime.ConvertedClosure">
	//   22   47:invokeinterface #25  <Method boolean Set.add(Object)>
	//   23   52:pop             
		((Set) (hashset)).add("org.codehaus.groovy.runtime.MethodClosure");
	//   24   53:aload_0         
	//   25   54:ldc1            #35  <String "org.codehaus.groovy.runtime.MethodClosure">
	//   26   56:invokeinterface #25  <Method boolean Set.add(Object)>
	//   27   61:pop             
		((Set) (hashset)).add("org.springframework.beans.factory.ObjectFactory");
	//   28   62:aload_0         
	//   29   63:ldc1            #37  <String "org.springframework.beans.factory.ObjectFactory">
	//   30   65:invokeinterface #25  <Method boolean Set.add(Object)>
	//   31   70:pop             
		((Set) (hashset)).add("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
	//   32   71:aload_0         
	//   33   72:ldc1            #39  <String "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl">
	//   34   74:invokeinterface #25  <Method boolean Set.add(Object)>
	//   35   79:pop             
		((Set) (hashset)).add("org.apache.xalan.xsltc.trax.TemplatesImpl");
	//   36   80:aload_0         
	//   37   81:ldc1            #41  <String "org.apache.xalan.xsltc.trax.TemplatesImpl">
	//   38   83:invokeinterface #25  <Method boolean Set.add(Object)>
	//   39   88:pop             
		((Set) (hashset)).add("com.sun.rowset.JdbcRowSetImpl");
	//   40   89:aload_0         
	//   41   90:ldc1            #43  <String "com.sun.rowset.JdbcRowSetImpl">
	//   42   92:invokeinterface #25  <Method boolean Set.add(Object)>
	//   43   97:pop             
		((Set) (hashset)).add("java.util.logging.FileHandler");
	//   44   98:aload_0         
	//   45   99:ldc1            #45  <String "java.util.logging.FileHandler">
	//   46  101:invokeinterface #25  <Method boolean Set.add(Object)>
	//   47  106:pop             
		((Set) (hashset)).add("java.rmi.server.UnicastRemoteObject");
	//   48  107:aload_0         
	//   49  108:ldc1            #47  <String "java.rmi.server.UnicastRemoteObject">
	//   50  110:invokeinterface #25  <Method boolean Set.add(Object)>
	//   51  115:pop             
		((Set) (hashset)).add("org.springframework.beans.factory.config.PropertyPathFactoryBean");
	//   52  116:aload_0         
	//   53  117:ldc1            #49  <String "org.springframework.beans.factory.config.PropertyPathFactoryBean">
	//   54  119:invokeinterface #25  <Method boolean Set.add(Object)>
	//   55  124:pop             
		((Set) (hashset)).add("com.mchange.v2.c3p0.JndiRefForwardingDataSource");
	//   56  125:aload_0         
	//   57  126:ldc1            #51  <String "com.mchange.v2.c3p0.JndiRefForwardingDataSource">
	//   58  128:invokeinterface #25  <Method boolean Set.add(Object)>
	//   59  133:pop             
		((Set) (hashset)).add("com.mchange.v2.c3p0.WrapperConnectionPoolDataSource");
	//   60  134:aload_0         
	//   61  135:ldc1            #53  <String "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource">
	//   62  137:invokeinterface #25  <Method boolean Set.add(Object)>
	//   63  142:pop             
		((Set) (hashset)).add("org.apache.tomcat.dbcp.dbcp2.BasicDataSource");
	//   64  143:aload_0         
	//   65  144:ldc1            #55  <String "org.apache.tomcat.dbcp.dbcp2.BasicDataSource">
	//   66  146:invokeinterface #25  <Method boolean Set.add(Object)>
	//   67  151:pop             
		((Set) (hashset)).add("com.sun.org.apache.bcel.internal.util.ClassLoader");
	//   68  152:aload_0         
	//   69  153:ldc1            #57  <String "com.sun.org.apache.bcel.internal.util.ClassLoader">
	//   70  155:invokeinterface #25  <Method boolean Set.add(Object)>
	//   71  160:pop             
		((Set) (hashset)).add("org.hibernate.jmx.StatisticsService");
	//   72  161:aload_0         
	//   73  162:ldc1            #59  <String "org.hibernate.jmx.StatisticsService">
	//   74  164:invokeinterface #25  <Method boolean Set.add(Object)>
	//   75  169:pop             
		((Set) (hashset)).add("org.apache.ibatis.datasource.jndi.JndiDataSourceFactory");
	//   76  170:aload_0         
	//   77  171:ldc1            #61  <String "org.apache.ibatis.datasource.jndi.JndiDataSourceFactory">
	//   78  173:invokeinterface #25  <Method boolean Set.add(Object)>
	//   79  178:pop             
		DEFAULT_NO_DESER_CLASS_NAMES = Collections.unmodifiableSet(((Set) (hashset)));
	//   80  179:aload_0         
	//   81  180:invokestatic    #67  <Method Set Collections.unmodifiableSet(Set)>
	//   82  183:putstatic       #69  <Field Set DEFAULT_NO_DESER_CLASS_NAMES>
	//   83  186:new             #2   <Class SubTypeValidator>
	//   84  189:dup             
	//   85  190:invokespecial   #70  <Method void SubTypeValidator()>
	//   86  193:putstatic       #72  <Field SubTypeValidator instance>
	//*  87  196:return          
	}
}
