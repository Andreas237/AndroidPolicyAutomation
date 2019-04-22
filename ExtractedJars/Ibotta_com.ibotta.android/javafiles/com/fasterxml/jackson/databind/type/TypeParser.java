// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeFactory, TypeBindings

public class TypeParser
	implements Serializable
{
	static final class MyTokenizer extends StringTokenizer
	{

		public String getAllInput()
		{
			return _input;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String _input>
		//    2    4:areturn         
		}

		public String getRemainingInput()
		{
			return _input.substring(_index);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String _input>
		//    2    4:aload_0         
		//    3    5:getfield        #27  <Field int _index>
		//    4    8:invokevirtual   #33  <Method String String.substring(int)>
		//    5   11:areturn         
		}

		public boolean hasMoreTokens()
		{
			return _pushbackToken != null || super.hasMoreTokens();
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field String _pushbackToken>
		//    2    4:ifnonnull       19
		//    3    7:aload_0         
		//    4    8:invokespecial   #39  <Method boolean StringTokenizer.hasMoreTokens()>
		//    5   11:ifeq            17
		//    6   14:goto            19
		//    7   17:iconst_0        
		//    8   18:ireturn         
		//    9   19:iconst_1        
		//   10   20:ireturn         
		}

		public String nextToken()
		{
			String s = _pushbackToken;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field String _pushbackToken>
		//    2    4:astore_1        
			if(s != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          16
			{
				_pushbackToken = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #37  <Field String _pushbackToken>
				return s;
		//    8   14:aload_1         
		//    9   15:areturn         
			} else
			{
				String s1 = super.nextToken();
		//   10   16:aload_0         
		//   11   17:invokespecial   #42  <Method String StringTokenizer.nextToken()>
		//   12   20:astore_1        
				_index = _index + s1.length();
		//   13   21:aload_0         
		//   14   22:aload_0         
		//   15   23:getfield        #27  <Field int _index>
		//   16   26:aload_1         
		//   17   27:invokevirtual   #46  <Method int String.length()>
		//   18   30:iadd            
		//   19   31:putfield        #27  <Field int _index>
				return s1.trim();
		//   20   34:aload_1         
		//   21   35:invokevirtual   #49  <Method String String.trim()>
		//   22   38:areturn         
			}
		}

		public void pushBack(String s)
		{
			_pushbackToken = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field String _pushbackToken>
		//    3    5:return          
		}

		protected int _index;
		protected final String _input;
		protected String _pushbackToken;

		public MyTokenizer(String s)
		{
			super(s, "<,>", true);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #16  <String "<,>">
		//    3    4:iconst_1        
		//    4    5:invokespecial   #19  <Method void StringTokenizer(String, String, boolean)>
			_input = s;
		//    5    8:aload_0         
		//    6    9:aload_1         
		//    7   10:putfield        #21  <Field String _input>
		//    8   13:return          
		}
	}


	public TypeParser(TypeFactory typefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		_factory = typefactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field TypeFactory _factory>
	//    5    9:return          
	}

	protected IllegalArgumentException _problem(MyTokenizer mytokenizer, String s)
	{
		return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", new Object[] {
			mytokenizer.getAllInput(), mytokenizer.getRemainingInput(), s
		}));
	//    0    0:new             #27  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "Failed to parse type '%s' (remaining: '%s'): %s">
	//    3    6:iconst_3        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_1         
	//    8   13:invokevirtual   #33  <Method String TypeParser$MyTokenizer.getAllInput()>
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_1        
	//   12   19:aload_1         
	//   13   20:invokevirtual   #36  <Method String TypeParser$MyTokenizer.getRemainingInput()>
	//   14   23:aastore         
	//   15   24:dup             
	//   16   25:iconst_2        
	//   17   26:aload_2         
	//   18   27:aastore         
	//   19   28:invokestatic    #42  <Method String String.format(String, Object[])>
	//   20   31:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   21   34:areturn         
	}

	protected Class findClass(String s, MyTokenizer mytokenizer)
	{
		Class class1;
		try
		{
			class1 = _factory.findClass(s);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TypeFactory _factory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method Class TypeFactory.findClass(String)>
	//    4    8:astore_3        
		}
	//*   5    9:aload_3         
	//*   6   10:areturn         
		catch(Exception exception)
	//*   7   11:astore_3        
		{
			ClassUtil.throwIfRTE(((Throwable) (exception)));
	//    8   12:aload_3         
	//    9   13:invokestatic    #60  <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//   10   16:pop             
			StringBuilder stringbuilder = new StringBuilder();
	//   11   17:new             #62  <Class StringBuilder>
	//   12   20:dup             
	//   13   21:invokespecial   #63  <Method void StringBuilder()>
	//   14   24:astore          4
			stringbuilder.append("Cannot locate class '");
	//   15   26:aload           4
	//   16   28:ldc1            #65  <String "Cannot locate class '">
	//   17   30:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append(s);
	//   19   34:aload           4
	//   20   36:aload_1         
	//   21   37:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			stringbuilder.append("', problem: ");
	//   23   41:aload           4
	//   24   43:ldc1            #71  <String "', problem: ">
	//   25   45:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			stringbuilder.append(exception.getMessage());
	//   27   49:aload           4
	//   28   51:aload_3         
	//   29   52:invokevirtual   #74  <Method String Exception.getMessage()>
	//   30   55:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
			throw _problem(mytokenizer, stringbuilder.toString());
	//   32   59:aload_0         
	//   33   60:aload_2         
	//   34   61:aload           4
	//   35   63:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   36   66:invokevirtual   #79  <Method IllegalArgumentException _problem(TypeParser$MyTokenizer, String)>
	//   37   69:athrow          
		}
		return class1;
	}

	public JavaType parse(String s)
		throws IllegalArgumentException
	{
		s = ((String) (new MyTokenizer(s.trim())));
	//    0    0:new             #8   <Class TypeParser$MyTokenizer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #86  <Method String String.trim()>
	//    4    8:invokespecial   #87  <Method void TypeParser$MyTokenizer(String)>
	//    5   11:astore_1        
		JavaType javatype = parseType(((MyTokenizer) (s)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #91  <Method JavaType parseType(TypeParser$MyTokenizer)>
	//    9   17:astore_2        
		if(!((MyTokenizer) (s)).hasMoreTokens())
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #95  <Method boolean TypeParser$MyTokenizer.hasMoreTokens()>
	//*  12   22:ifne            27
			return javatype;
	//   13   25:aload_2         
	//   14   26:areturn         
		else
			throw _problem(((MyTokenizer) (s)), "Unexpected tokens after complete type");
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:ldc1            #97  <String "Unexpected tokens after complete type">
	//   18   31:invokevirtual   #79  <Method IllegalArgumentException _problem(TypeParser$MyTokenizer, String)>
	//   19   34:athrow          
	}

	protected JavaType parseType(MyTokenizer mytokenizer)
		throws IllegalArgumentException
	{
		if(mytokenizer.hasMoreTokens())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #95  <Method boolean TypeParser$MyTokenizer.hasMoreTokens()>
	//*   2    4:ifeq            75
		{
			Class class1 = findClass(mytokenizer.nextToken(), mytokenizer);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #101 <Method String TypeParser$MyTokenizer.nextToken()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #103 <Method Class findClass(String, TypeParser$MyTokenizer)>
	//    8   16:astore_2        
			if(mytokenizer.hasMoreTokens())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #95  <Method boolean TypeParser$MyTokenizer.hasMoreTokens()>
	//*  11   21:ifeq            64
			{
				String s = mytokenizer.nextToken();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #101 <Method String TypeParser$MyTokenizer.nextToken()>
	//   14   28:astore_3        
				if("<".equals(((Object) (s))))
	//*  15   29:ldc1            #105 <String "<">
	//*  16   31:aload_3         
	//*  17   32:invokevirtual   #109 <Method boolean String.equals(Object)>
	//*  18   35:ifeq            59
				{
					mytokenizer = ((MyTokenizer) (TypeBindings.create(class1, parseTypes(mytokenizer))));
	//   19   38:aload_2         
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #113 <Method List parseTypes(TypeParser$MyTokenizer)>
	//   23   44:invokestatic    #119 <Method TypeBindings TypeBindings.create(Class, List)>
	//   24   47:astore_1        
					return _factory._fromClass(((ClassStack) (null)), class1, ((TypeBindings) (mytokenizer)));
	//   25   48:aload_0         
	//   26   49:getfield        #22  <Field TypeFactory _factory>
	//   27   52:aconst_null     
	//   28   53:aload_2         
	//   29   54:aload_1         
	//   30   55:invokevirtual   #123 <Method JavaType TypeFactory._fromClass(ClassStack, Class, TypeBindings)>
	//   31   58:areturn         
				}
				mytokenizer.pushBack(s);
	//   32   59:aload_1         
	//   33   60:aload_3         
	//   34   61:invokevirtual   #126 <Method void TypeParser$MyTokenizer.pushBack(String)>
			}
			return _factory._fromClass(((ClassStack) (null)), class1, ((TypeBindings) (null)));
	//   35   64:aload_0         
	//   36   65:getfield        #22  <Field TypeFactory _factory>
	//   37   68:aconst_null     
	//   38   69:aload_2         
	//   39   70:aconst_null     
	//   40   71:invokevirtual   #123 <Method JavaType TypeFactory._fromClass(ClassStack, Class, TypeBindings)>
	//   41   74:areturn         
		} else
		{
			throw _problem(mytokenizer, "Unexpected end-of-string");
	//   42   75:aload_0         
	//   43   76:aload_1         
	//   44   77:ldc1            #128 <String "Unexpected end-of-string">
	//   45   79:invokevirtual   #79  <Method IllegalArgumentException _problem(TypeParser$MyTokenizer, String)>
	//   46   82:athrow          
		}
	}

	protected List parseTypes(MyTokenizer mytokenizer)
		throws IllegalArgumentException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #130 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #131 <Method void ArrayList()>
	//    3    7:astore_3        
		do
		{
			if(!mytokenizer.hasMoreTokens())
				break;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #95  <Method boolean TypeParser$MyTokenizer.hasMoreTokens()>
	//    6   12:ifeq            98
			arraylist.add(((Object) (parseType(mytokenizer))));
	//    7   15:aload_3         
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #91  <Method JavaType parseType(TypeParser$MyTokenizer)>
	//   11   21:invokevirtual   #134 <Method boolean ArrayList.add(Object)>
	//   12   24:pop             
			if(!mytokenizer.hasMoreTokens())
				break;
	//   13   25:aload_1         
	//   14   26:invokevirtual   #95  <Method boolean TypeParser$MyTokenizer.hasMoreTokens()>
	//   15   29:ifeq            98
			String s = mytokenizer.nextToken();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #101 <Method String TypeParser$MyTokenizer.nextToken()>
	//   18   36:astore_2        
			if(">".equals(((Object) (s))))
	//*  19   37:ldc1            #136 <String ">">
	//*  20   39:aload_2         
	//*  21   40:invokevirtual   #109 <Method boolean String.equals(Object)>
	//*  22   43:ifeq            48
				return ((List) (arraylist));
	//   23   46:aload_3         
	//   24   47:areturn         
			if(!",".equals(((Object) (s))))
	//*  25   48:ldc1            #138 <String ",">
	//*  26   50:aload_2         
	//*  27   51:invokevirtual   #109 <Method boolean String.equals(Object)>
	//*  28   54:ifeq            60
	//*  29   57:goto            8
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   30   60:new             #62  <Class StringBuilder>
	//   31   63:dup             
	//   32   64:invokespecial   #63  <Method void StringBuilder()>
	//   33   67:astore_3        
				stringbuilder.append("Unexpected token '");
	//   34   68:aload_3         
	//   35   69:ldc1            #140 <String "Unexpected token '">
	//   36   71:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
				stringbuilder.append(s);
	//   38   75:aload_3         
	//   39   76:aload_2         
	//   40   77:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
				stringbuilder.append("', expected ',' or '>')");
	//   42   81:aload_3         
	//   43   82:ldc1            #142 <String "', expected ',' or '>')">
	//   44   84:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   45   87:pop             
				throw _problem(mytokenizer, stringbuilder.toString());
	//   46   88:aload_0         
	//   47   89:aload_1         
	//   48   90:aload_3         
	//   49   91:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   50   94:invokevirtual   #79  <Method IllegalArgumentException _problem(TypeParser$MyTokenizer, String)>
	//   51   97:athrow          
			}
		} while(true);
		throw _problem(mytokenizer, "Unexpected end-of-string");
	//   52   98:aload_0         
	//   53   99:aload_1         
	//   54  100:ldc1            #128 <String "Unexpected end-of-string">
	//   55  102:invokevirtual   #79  <Method IllegalArgumentException _problem(TypeParser$MyTokenizer, String)>
	//   56  105:athrow          
	}

	public TypeParser withFactory(TypeFactory typefactory)
	{
		if(typefactory == _factory)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #22  <Field TypeFactory _factory>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new TypeParser(typefactory);
	//    6   10:new             #2   <Class TypeParser>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #147 <Method void TypeParser(TypeFactory)>
	//   10   18:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final TypeFactory _factory;
}
