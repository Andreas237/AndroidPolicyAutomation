// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
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

		public String getUsedInput()
		{
			return _input.substring(0, _index);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String _input>
		//    2    4:iconst_0        
		//    3    5:aload_0         
		//    4    6:getfield        #27  <Field int _index>
		//    5    9:invokevirtual   #37  <Method String String.substring(int, int)>
		//    6   12:areturn         
		}

		public boolean hasMoreTokens()
		{
			return _pushbackToken != null || super.hasMoreTokens();
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field String _pushbackToken>
		//    2    4:ifnonnull       14
		//    3    7:aload_0         
		//    4    8:invokespecial   #43  <Method boolean StringTokenizer.hasMoreTokens()>
		//    5   11:ifeq            16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public String nextToken()
		{
			String s;
			if(_pushbackToken != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field String _pushbackToken>
		//*   2    4:ifnull          32
			{
				s = _pushbackToken;
		//    3    7:aload_0         
		//    4    8:getfield        #41  <Field String _pushbackToken>
		//    5   11:astore_1        
				_pushbackToken = null;
		//    6   12:aload_0         
		//    7   13:aconst_null     
		//    8   14:putfield        #41  <Field String _pushbackToken>
			} else
		//*   9   17:aload_0         
		//*  10   18:aload_0         
		//*  11   19:getfield        #27  <Field int _index>
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #48  <Method int String.length()>
		//*  14   26:iadd            
		//*  15   27:putfield        #27  <Field int _index>
		//*  16   30:aload_1         
		//*  17   31:areturn         
			{
				s = super.nextToken();
		//   18   32:aload_0         
		//   19   33:invokespecial   #50  <Method String StringTokenizer.nextToken()>
		//   20   36:astore_1        
			}
			_index = _index + s.length();
			return s;
		//*  21   37:goto            17
		}

		public void pushBack(String s)
		{
			_pushbackToken = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field String _pushbackToken>
			_index = _index - s.length();
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #27  <Field int _index>
		//    6   10:aload_1         
		//    7   11:invokevirtual   #48  <Method int String.length()>
		//    8   14:isub            
		//    9   15:putfield        #27  <Field int _index>
		//   10   18:return          
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
		return new IllegalArgumentException((new StringBuilder()).append("Failed to parse type '").append(mytokenizer.getAllInput()).append("' (remaining: '").append(mytokenizer.getRemainingInput()).append("'): ").append(s).toString());
	//    0    0:new             #27  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:new             #29  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #30  <Method void StringBuilder()>
	//    5   11:ldc1            #32  <String "Failed to parse type '">
	//    6   13:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #40  <Method String TypeParser$MyTokenizer.getAllInput()>
	//    9   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:ldc1            #42  <String "' (remaining: '">
	//   11   25:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #45  <Method String TypeParser$MyTokenizer.getRemainingInput()>
	//   14   32:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   35:ldc1            #47  <String "'): ">
	//   16   37:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   17   40:aload_2         
	//   18   41:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   44:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   20   47:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   21   50:areturn         
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
	//    3    5:invokevirtual   #62  <Method Class TypeFactory.findClass(String)>
	//    4    8:astore_3        
		}
	//*   5    9:aload_3         
	//*   6   10:areturn         
		catch(Exception exception)
	//*   7   11:astore_3        
		{
			if(exception instanceof RuntimeException)
	//*   8   12:aload_3         
	//*   9   13:instanceof      #64  <Class RuntimeException>
	//*  10   16:ifeq            24
				throw (RuntimeException)exception;
	//   11   19:aload_3         
	//   12   20:checkcast       #64  <Class RuntimeException>
	//   13   23:athrow          
			else
				throw _problem(mytokenizer, (new StringBuilder()).append("Can not locate class '").append(s).append("', problem: ").append(exception.getMessage()).toString());
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:new             #29  <Class StringBuilder>
	//   17   29:dup             
	//   18   30:invokespecial   #30  <Method void StringBuilder()>
	//   19   33:ldc1            #66  <String "Can not locate class '">
	//   20   35:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   21   38:aload_1         
	//   22   39:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   23   42:ldc1            #68  <String "', problem: ">
	//   24   44:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:aload_3         
	//   26   48:invokevirtual   #71  <Method String Exception.getMessage()>
	//   27   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   28   54:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   29   57:invokevirtual   #73  <Method IllegalArgumentException _problem(TypeParser$MyTokenizer, String)>
	//   30   60:athrow          
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
	//    3    5:invokevirtual   #82  <Method String String.trim()>
	//    4    8:invokespecial   #83  <Method void TypeParser$MyTokenizer(String)>
	//    5   11:astore_1        
		JavaType javatype = parseType(((MyTokenizer) (s)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #87  <Method JavaType parseType(TypeParser$MyTokenizer)>
	//    9   17:astore_2        
		if(((MyTokenizer) (s)).hasMoreTokens())
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #91  <Method boolean TypeParser$MyTokenizer.hasMoreTokens()>
	//*  12   22:ifeq            33
			throw _problem(((MyTokenizer) (s)), "Unexpected tokens after complete type");
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:ldc1            #93  <String "Unexpected tokens after complete type">
	//   16   29:invokevirtual   #73  <Method IllegalArgumentException _problem(TypeParser$MyTokenizer, String)>
	//   17   32:athrow          
		else
			return javatype;
	//   18   33:aload_2         
	//   19   34:areturn         
	}

	protected JavaType parseType(MyTokenizer mytokenizer)
		throws IllegalArgumentException
	{
		if(!mytokenizer.hasMoreTokens())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #91  <Method boolean TypeParser$MyTokenizer.hasMoreTokens()>
	//*   2    4:ifne            15
			throw _problem(mytokenizer, "Unexpected end-of-string");
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:ldc1            #96  <String "Unexpected end-of-string">
	//    6   11:invokevirtual   #73  <Method IllegalArgumentException _problem(TypeParser$MyTokenizer, String)>
	//    7   14:athrow          
		Class class1 = findClass(mytokenizer.nextToken(), mytokenizer);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #99  <Method String TypeParser$MyTokenizer.nextToken()>
	//   11   20:aload_1         
	//   12   21:invokevirtual   #101 <Method Class findClass(String, TypeParser$MyTokenizer)>
	//   13   24:astore_2        
		if(mytokenizer.hasMoreTokens())
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #91  <Method boolean TypeParser$MyTokenizer.hasMoreTokens()>
	//*  16   29:ifeq            72
		{
			String s = mytokenizer.nextToken();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #99  <Method String TypeParser$MyTokenizer.nextToken()>
	//   19   36:astore_3        
			if("<".equals(((Object) (s))))
	//*  20   37:ldc1            #103 <String "<">
	//*  21   39:aload_3         
	//*  22   40:invokevirtual   #107 <Method boolean String.equals(Object)>
	//*  23   43:ifeq            67
			{
				mytokenizer = ((MyTokenizer) (TypeBindings.create(class1, parseTypes(mytokenizer))));
	//   24   46:aload_2         
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #111 <Method List parseTypes(TypeParser$MyTokenizer)>
	//   28   52:invokestatic    #117 <Method TypeBindings TypeBindings.create(Class, List)>
	//   29   55:astore_1        
				return _factory._fromClass(((ClassStack) (null)), class1, ((TypeBindings) (mytokenizer)));
	//   30   56:aload_0         
	//   31   57:getfield        #22  <Field TypeFactory _factory>
	//   32   60:aconst_null     
	//   33   61:aload_2         
	//   34   62:aload_1         
	//   35   63:invokevirtual   #121 <Method JavaType TypeFactory._fromClass(ClassStack, Class, TypeBindings)>
	//   36   66:areturn         
			}
			mytokenizer.pushBack(s);
	//   37   67:aload_1         
	//   38   68:aload_3         
	//   39   69:invokevirtual   #124 <Method void TypeParser$MyTokenizer.pushBack(String)>
		}
		return _factory._fromClass(((ClassStack) (null)), class1, ((TypeBindings) (null)));
	//   40   72:aload_0         
	//   41   73:getfield        #22  <Field TypeFactory _factory>
	//   42   76:aconst_null     
	//   43   77:aload_2         
	//   44   78:aconst_null     
	//   45   79:invokevirtual   #121 <Method JavaType TypeFactory._fromClass(ClassStack, Class, TypeBindings)>
	//   46   82:areturn         
	}

	protected List parseTypes(MyTokenizer mytokenizer)
		throws IllegalArgumentException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #126 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void ArrayList()>
	//    3    7:astore_2        
		do
		{
label0:
			{
				if(mytokenizer.hasMoreTokens())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #91  <Method boolean TypeParser$MyTokenizer.hasMoreTokens()>
	//*   6   12:ifeq            32
				{
					arraylist.add(((Object) (parseType(mytokenizer))));
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #87  <Method JavaType parseType(TypeParser$MyTokenizer)>
	//   11   21:invokevirtual   #130 <Method boolean ArrayList.add(Object)>
	//   12   24:pop             
					if(mytokenizer.hasMoreTokens())
						break label0;
	//   13   25:aload_1         
	//   14   26:invokevirtual   #91  <Method boolean TypeParser$MyTokenizer.hasMoreTokens()>
	//   15   29:ifne            40
				}
				throw _problem(mytokenizer, "Unexpected end-of-string");
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:ldc1            #96  <String "Unexpected end-of-string">
	//   19   36:invokevirtual   #73  <Method IllegalArgumentException _problem(TypeParser$MyTokenizer, String)>
	//   20   39:athrow          
			}
			String s = mytokenizer.nextToken();
	//   21   40:aload_1         
	//   22   41:invokevirtual   #99  <Method String TypeParser$MyTokenizer.nextToken()>
	//   23   44:astore_3        
			if(">".equals(((Object) (s))))
	//*  24   45:ldc1            #132 <String ">">
	//*  25   47:aload_3         
	//*  26   48:invokevirtual   #107 <Method boolean String.equals(Object)>
	//*  27   51:ifeq            56
				return ((List) (arraylist));
	//   28   54:aload_2         
	//   29   55:areturn         
			if(!",".equals(((Object) (s))))
	//*  30   56:ldc1            #134 <String ",">
	//*  31   58:aload_3         
	//*  32   59:invokevirtual   #107 <Method boolean String.equals(Object)>
	//*  33   62:ifne            8
				throw _problem(mytokenizer, (new StringBuilder()).append("Unexpected token '").append(s).append("', expected ',' or '>')").toString());
	//   34   65:aload_0         
	//   35   66:aload_1         
	//   36   67:new             #29  <Class StringBuilder>
	//   37   70:dup             
	//   38   71:invokespecial   #30  <Method void StringBuilder()>
	//   39   74:ldc1            #136 <String "Unexpected token '">
	//   40   76:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   41   79:aload_3         
	//   42   80:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   43   83:ldc1            #138 <String "', expected ',' or '>')">
	//   44   85:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   45   88:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   46   91:invokevirtual   #73  <Method IllegalArgumentException _problem(TypeParser$MyTokenizer, String)>
	//   47   94:athrow          
		} while(true);
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
	//    9   15:invokespecial   #143 <Method void TypeParser(TypeFactory)>
	//   10   18:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final TypeFactory _factory;
}
