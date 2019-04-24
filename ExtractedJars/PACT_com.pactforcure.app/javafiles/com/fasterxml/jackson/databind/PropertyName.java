// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

public class PropertyName
	implements Serializable
{

	public PropertyName(String s)
	{
		this(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #28  <Method void PropertyName(String, String)>
	//    4    6:return          
	}

	public PropertyName(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		String s2 = s;
	//    2    4:aload_1         
	//    3    5:astore_3        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       13
			s2 = "";
	//    6   10:ldc1            #13  <String "">
	//    7   12:astore_3        
		_simpleName = s2;
	//    8   13:aload_0         
	//    9   14:aload_3         
	//   10   15:putfield        #42  <Field String _simpleName>
		_namespace = s1;
	//   11   18:aload_0         
	//   12   19:aload_2         
	//   13   20:putfield        #44  <Field String _namespace>
	//   14   23:return          
	}

	public static PropertyName construct(String s)
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #50  <Method int String.length()>
	//*   4    8:ifne            15
			return USE_DEFAULT;
	//    5   11:getstatic       #30  <Field PropertyName USE_DEFAULT>
	//    6   14:areturn         
		else
			return new PropertyName(InternCache.instance.intern(s), ((String) (null)));
	//    7   15:new             #2   <Class PropertyName>
	//    8   18:dup             
	//    9   19:getstatic       #56  <Field InternCache InternCache.instance>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #60  <Method String InternCache.intern(String)>
	//   12   26:aconst_null     
	//   13   27:invokespecial   #28  <Method void PropertyName(String, String)>
	//   14   30:areturn         
	}

	public static PropertyName construct(String s, String s1)
	{
		String s2 = s;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(s == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       9
			s2 = "";
	//    4    6:ldc1            #13  <String "">
	//    5    8:astore_2        
		if(s1 == null && s2.length() == 0)
	//*   6    9:aload_1         
	//*   7   10:ifnonnull       24
	//*   8   13:aload_2         
	//*   9   14:invokevirtual   #50  <Method int String.length()>
	//*  10   17:ifne            24
			return USE_DEFAULT;
	//   11   20:getstatic       #30  <Field PropertyName USE_DEFAULT>
	//   12   23:areturn         
		else
			return new PropertyName(InternCache.instance.intern(s2), s1);
	//   13   24:new             #2   <Class PropertyName>
	//   14   27:dup             
	//   15   28:getstatic       #56  <Field InternCache InternCache.instance>
	//   16   31:aload_2         
	//   17   32:invokevirtual   #60  <Method String InternCache.intern(String)>
	//   18   35:aload_1         
	//   19   36:invokespecial   #28  <Method void PropertyName(String, String)>
	//   20   39:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag2;
		boolean flag3;
		flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		flag3 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		if(obj != this) goto _L2; else goto _L1
	//    4    5:aload_1         
	//    5    6:aload_0         
	//    6    7:if_acmpne       14
_L1:
		boolean flag = true;
	//    7   10:iconst_1        
	//    8   11:istore_2        
_L4:
		return flag;
	//    9   12:iload_2         
	//   10   13:ireturn         
_L2:
		flag = flag3;
	//   11   14:iload           4
	//   12   16:istore_2        
		if(obj == null) goto _L4; else goto _L3
	//   13   17:aload_1         
	//   14   18:ifnull          12
_L3:
		flag = flag3;
	//   15   21:iload           4
	//   16   23:istore_2        
		if(obj.getClass() != ((Object)this).getClass()) goto _L4; else goto _L5
	//   17   24:aload_1         
	//   18   25:invokevirtual   #67  <Method Class Object.getClass()>
	//   19   28:aload_0         
	//   20   29:invokevirtual   #67  <Method Class Object.getClass()>
	//   21   32:if_acmpne       12
_L5:
		obj = ((Object) ((PropertyName)obj));
	//   22   35:aload_1         
	//   23   36:checkcast       #2   <Class PropertyName>
	//   24   39:astore_1        
		if(_simpleName != null)
			break MISSING_BLOCK_LABEL_75;
	//   25   40:aload_0         
	//   26   41:getfield        #42  <Field String _simpleName>
	//   27   44:ifnonnull       75
		flag = flag3;
	//   28   47:iload           4
	//   29   49:istore_2        
		if(((PropertyName) (obj))._simpleName != null) goto _L4; else goto _L6
	//   30   50:aload_1         
	//   31   51:getfield        #42  <Field String _simpleName>
	//   32   54:ifnonnull       12
_L6:
		if(_namespace == null)
	//*  33   57:aload_0         
	//*  34   58:getfield        #44  <Field String _namespace>
	//*  35   61:ifnonnull       96
		{
			boolean flag1;
			if(((PropertyName) (obj))._namespace == null)
	//*  36   64:aload_1         
	//*  37   65:getfield        #44  <Field String _namespace>
	//*  38   68:ifnonnull       91
				flag1 = flag2;
	//   39   71:iload_3         
	//   40   72:istore_2        
			else
	//*  41   73:iload_2         
	//*  42   74:ireturn         
	//*  43   75:aload_0         
	//*  44   76:getfield        #42  <Field String _simpleName>
	//*  45   79:aload_1         
	//*  46   80:getfield        #42  <Field String _simpleName>
	//*  47   83:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*  48   86:ifne            57
	//*  49   89:iconst_0        
	//*  50   90:ireturn         
				flag1 = false;
	//   51   91:iconst_0        
	//   52   92:istore_2        
			return flag1;
		} else
	//*  53   93:goto            73
		{
			return _namespace.equals(((Object) (((PropertyName) (obj))._namespace)));
	//   54   96:aload_0         
	//   55   97:getfield        #44  <Field String _namespace>
	//   56  100:aload_1         
	//   57  101:getfield        #44  <Field String _namespace>
	//   58  104:invokevirtual   #69  <Method boolean String.equals(Object)>
	//   59  107:ireturn         
		}
		if(!_simpleName.equals(((Object) (((PropertyName) (obj))._simpleName))))
			return false;
		  goto _L6
	}

	public String getNamespace()
	{
		return _namespace;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String _namespace>
	//    2    4:areturn         
	}

	public String getSimpleName()
	{
		return _simpleName;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String _simpleName>
	//    2    4:areturn         
	}

	public boolean hasNamespace()
	{
		return _namespace != null;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String _namespace>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasSimpleName()
	{
		return _simpleName.length() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String _simpleName>
	//    2    4:invokevirtual   #50  <Method int String.length()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean hasSimpleName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			return _simpleName == null;
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field String _simpleName>
	//    4    8:ifnonnull       13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
		else
			return s.equals(((Object) (_simpleName)));
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #42  <Field String _simpleName>
	//   12   20:invokevirtual   #69  <Method boolean String.equals(Object)>
	//   13   23:ireturn         
	}

	public int hashCode()
	{
		if(_namespace == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field String _namespace>
	//*   2    4:ifnonnull       15
			return _simpleName.hashCode();
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field String _simpleName>
	//    5   11:invokevirtual   #79  <Method int String.hashCode()>
	//    6   14:ireturn         
		else
			return _namespace.hashCode() ^ _simpleName.hashCode();
	//    7   15:aload_0         
	//    8   16:getfield        #44  <Field String _namespace>
	//    9   19:invokevirtual   #79  <Method int String.hashCode()>
	//   10   22:aload_0         
	//   11   23:getfield        #42  <Field String _simpleName>
	//   12   26:invokevirtual   #79  <Method int String.hashCode()>
	//   13   29:ixor            
	//   14   30:ireturn         
	}

	public PropertyName internSimpleName()
	{
		String s;
		if(_simpleName.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field String _simpleName>
	//*   2    4:invokevirtual   #50  <Method int String.length()>
	//*   3    7:ifne            12
	//*   4   10:aload_0         
	//*   5   11:areturn         
	//*   6   12:getstatic       #56  <Field InternCache InternCache.instance>
	//*   7   15:aload_0         
	//*   8   16:getfield        #42  <Field String _simpleName>
	//*   9   19:invokevirtual   #60  <Method String InternCache.intern(String)>
	//*  10   22:astore_1        
			if((s = InternCache.instance.intern(_simpleName)) != _simpleName)
	//*  11   23:aload_1         
	//*  12   24:aload_0         
	//*  13   25:getfield        #42  <Field String _simpleName>
	//*  14   28:if_acmpeq       10
				return new PropertyName(s, _namespace);
	//   15   31:new             #2   <Class PropertyName>
	//   16   34:dup             
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #44  <Field String _namespace>
	//   20   40:invokespecial   #28  <Method void PropertyName(String, String)>
	//   21   43:areturn         
		return this;
	}

	public boolean isEmpty()
	{
		return _namespace == null && _simpleName.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String _namespace>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field String _simpleName>
	//    5   11:invokevirtual   #84  <Method boolean String.isEmpty()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected Object readResolve()
	{
		PropertyName propertyname;
		if(_simpleName == null || "".equals(((Object) (_simpleName))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field String _simpleName>
	//*   2    4:ifnull          19
	//*   3    7:ldc1            #13  <String "">
	//*   4    9:aload_0         
	//*   5   10:getfield        #42  <Field String _simpleName>
	//*   6   13:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*   7   16:ifeq            25
		{
			propertyname = USE_DEFAULT;
	//    8   19:getstatic       #30  <Field PropertyName USE_DEFAULT>
	//    9   22:astore_1        
		} else
	//*  10   23:aload_1         
	//*  11   24:areturn         
		{
			propertyname = this;
	//   12   25:aload_0         
	//   13   26:astore_1        
			if(_simpleName.equals(""))
	//*  14   27:aload_0         
	//*  15   28:getfield        #42  <Field String _simpleName>
	//*  16   31:ldc1            #13  <String "">
	//*  17   33:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*  18   36:ifeq            23
			{
				propertyname = this;
	//   19   39:aload_0         
	//   20   40:astore_1        
				if(_namespace == null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #44  <Field String _namespace>
	//*  23   45:ifnonnull       23
					return ((Object) (NO_NAME));
	//   24   48:getstatic       #37  <Field PropertyName NO_NAME>
	//   25   51:areturn         
			}
		}
		return ((Object) (propertyname));
	}

	public SerializableString simpleAsEncoded(MapperConfig mapperconfig)
	{
		SerializableString serializablestring = _encodedSimple;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field SerializableString _encodedSimple>
	//    2    4:astore_3        
		Object obj = ((Object) (serializablestring));
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(serializablestring == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       34
		{
			if(mapperconfig == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       36
				mapperconfig = ((MapperConfig) (new SerializedString(_simpleName)));
	//    9   15:new             #92  <Class SerializedString>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #42  <Field String _simpleName>
	//   13   23:invokespecial   #93  <Method void SerializedString(String)>
	//   14   26:astore_1        
			else
	//*  15   27:aload_0         
	//*  16   28:aload_1         
	//*  17   29:putfield        #90  <Field SerializableString _encodedSimple>
	//*  18   32:aload_1         
	//*  19   33:astore_2        
	//*  20   34:aload_2         
	//*  21   35:areturn         
				mapperconfig = ((MapperConfig) (mapperconfig.compileString(_simpleName)));
	//   22   36:aload_1         
	//   23   37:aload_0         
	//   24   38:getfield        #42  <Field String _simpleName>
	//   25   41:invokevirtual   #99  <Method SerializableString MapperConfig.compileString(String)>
	//   26   44:astore_1        
			_encodedSimple = ((SerializableString) (mapperconfig));
			obj = ((Object) (mapperconfig));
		}
		return ((SerializableString) (obj));
	//*  27   45:goto            27
	}

	public String toString()
	{
		if(_namespace == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field String _namespace>
	//*   2    4:ifnonnull       12
			return _simpleName;
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field String _simpleName>
	//    5   11:areturn         
		else
			return (new StringBuilder()).append("{").append(_namespace).append("}").append(_simpleName).toString();
	//    6   12:new             #104 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #105 <Method void StringBuilder()>
	//    9   19:ldc1            #107 <String "{">
	//   10   21:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_0         
	//   12   25:getfield        #44  <Field String _namespace>
	//   13   28:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:ldc1            #113 <String "}">
	//   15   33:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:aload_0         
	//   17   37:getfield        #42  <Field String _simpleName>
	//   18   40:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   19   43:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   20   46:areturn         
	}

	public PropertyName withNamespace(String s)
	{
		if(s != null ? s.equals(((Object) (_namespace))) : _namespace == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
	//*   2    4:aload_0         
	//*   3    5:getfield        #44  <Field String _namespace>
	//*   4    8:ifnonnull       24
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #44  <Field String _namespace>
	//*  10   18:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*  11   21:ifne            11
			return new PropertyName(_simpleName, s);
	//   12   24:new             #2   <Class PropertyName>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #42  <Field String _simpleName>
	//   16   32:aload_1         
	//   17   33:invokespecial   #28  <Method void PropertyName(String, String)>
	//   18   36:areturn         
	}

	public PropertyName withSimpleName(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
			s1 = "";
	//    4    6:ldc1            #13  <String "">
	//    5    8:astore_2        
		if(s1.equals(((Object) (_simpleName))))
	//*   6    9:aload_2         
	//*   7   10:aload_0         
	//*   8   11:getfield        #42  <Field String _simpleName>
	//*   9   14:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*  10   17:ifeq            22
			return this;
	//   11   20:aload_0         
	//   12   21:areturn         
		else
			return new PropertyName(s1, _namespace);
	//   13   22:new             #2   <Class PropertyName>
	//   14   25:dup             
	//   15   26:aload_2         
	//   16   27:aload_0         
	//   17   28:getfield        #44  <Field String _namespace>
	//   18   31:invokespecial   #28  <Method void PropertyName(String, String)>
	//   19   34:areturn         
	}

	public static final PropertyName NO_NAME = new PropertyName(new String(""), ((String) (null)));
	public static final PropertyName USE_DEFAULT = new PropertyName("", ((String) (null)));
	private static final String _NO_NAME = "";
	private static final String _USE_DEFAULT = "";
	private static final long serialVersionUID = 1L;
	protected SerializableString _encodedSimple;
	protected final String _namespace;
	protected final String _simpleName;

	static 
	{
	//    0    0:new             #2   <Class PropertyName>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "">
	//    3    6:aconst_null     
	//    4    7:invokespecial   #28  <Method void PropertyName(String, String)>
	//    5   10:putstatic       #30  <Field PropertyName USE_DEFAULT>
	//    6   13:new             #2   <Class PropertyName>
	//    7   16:dup             
	//    8   17:new             #32  <Class String>
	//    9   20:dup             
	//   10   21:ldc1            #13  <String "">
	//   11   23:invokespecial   #35  <Method void String(String)>
	//   12   26:aconst_null     
	//   13   27:invokespecial   #28  <Method void PropertyName(String, String)>
	//   14   30:putstatic       #37  <Field PropertyName NO_NAME>
	//*  15   33:return          
	}
}
