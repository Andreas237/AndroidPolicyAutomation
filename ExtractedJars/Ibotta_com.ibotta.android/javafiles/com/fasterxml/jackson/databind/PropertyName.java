// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.ClassUtil;
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
	//    3    3:invokespecial   #26  <Method void PropertyName(String, String)>
	//    4    6:return          
	}

	public PropertyName(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		_simpleName = ClassUtil.nonNullString(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #44  <Method String ClassUtil.nonNullString(String)>
	//    5    9:putfield        #46  <Field String _simpleName>
		_namespace = s1;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #48  <Field String _namespace>
	//    9   17:return          
	}

	public static PropertyName construct(String s)
	{
		if(s != null && s.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          30
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #54  <Method int String.length()>
	//*   4    8:ifne            14
	//*   5   11:goto            30
			return new PropertyName(InternCache.instance.intern(s), ((String) (null)));
	//    6   14:new             #2   <Class PropertyName>
	//    7   17:dup             
	//    8   18:getstatic       #60  <Field InternCache InternCache.instance>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #63  <Method String InternCache.intern(String)>
	//   11   25:aconst_null     
	//   12   26:invokespecial   #26  <Method void PropertyName(String, String)>
	//   13   29:areturn         
		else
			return USE_DEFAULT;
	//   14   30:getstatic       #28  <Field PropertyName USE_DEFAULT>
	//   15   33:areturn         
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
	//    4    6:ldc1            #22  <String "">
	//    5    8:astore_2        
		if(s1 == null && s2.length() == 0)
	//*   6    9:aload_1         
	//*   7   10:ifnonnull       24
	//*   8   13:aload_2         
	//*   9   14:invokevirtual   #54  <Method int String.length()>
	//*  10   17:ifne            24
			return USE_DEFAULT;
	//   11   20:getstatic       #28  <Field PropertyName USE_DEFAULT>
	//   12   23:areturn         
		else
			return new PropertyName(InternCache.instance.intern(s2), s1);
	//   13   24:new             #2   <Class PropertyName>
	//   14   27:dup             
	//   15   28:getstatic       #60  <Field InternCache InternCache.instance>
	//   16   31:aload_2         
	//   17   32:invokevirtual   #63  <Method String InternCache.intern(String)>
	//   18   35:aload_1         
	//   19   36:invokespecial   #26  <Method void PropertyName(String, String)>
	//   20   39:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(obj.getClass() != ((Object)this).getClass())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #70  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #70  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((PropertyName)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class PropertyName>
	//   18   30:astore_1        
		String s = _simpleName;
	//   19   31:aload_0         
	//   20   32:getfield        #46  <Field String _simpleName>
	//   21   35:astore_2        
		if(s == null)
	//*  22   36:aload_2         
	//*  23   37:ifnonnull       49
		{
			if(((PropertyName) (obj))._simpleName != null)
	//*  24   40:aload_1         
	//*  25   41:getfield        #46  <Field String _simpleName>
	//*  26   44:ifnull          62
				return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
		} else
		if(!s.equals(((Object) (((PropertyName) (obj))._simpleName))))
	//*  29   49:aload_2         
	//*  30   50:aload_1         
	//*  31   51:getfield        #46  <Field String _simpleName>
	//*  32   54:invokevirtual   #72  <Method boolean String.equals(Object)>
	//*  33   57:ifne            62
			return false;
	//   34   60:iconst_0        
	//   35   61:ireturn         
		s = _namespace;
	//   36   62:aload_0         
	//   37   63:getfield        #48  <Field String _namespace>
	//   38   66:astore_2        
		if(s == null)
	//*  39   67:aload_2         
	//*  40   68:ifnonnull       82
			return ((PropertyName) (obj))._namespace == null;
	//   41   71:aload_1         
	//   42   72:getfield        #48  <Field String _namespace>
	//   43   75:ifnonnull       80
	//   44   78:iconst_1        
	//   45   79:ireturn         
	//   46   80:iconst_0        
	//   47   81:ireturn         
		else
			return s.equals(((Object) (((PropertyName) (obj))._namespace)));
	//   48   82:aload_2         
	//   49   83:aload_1         
	//   50   84:getfield        #48  <Field String _namespace>
	//   51   87:invokevirtual   #72  <Method boolean String.equals(Object)>
	//   52   90:ireturn         
	}

	public String getSimpleName()
	{
		return _simpleName;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String _simpleName>
	//    2    4:areturn         
	}

	public boolean hasNamespace()
	{
		return _namespace != null;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String _namespace>
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
	//    1    1:getfield        #46  <Field String _simpleName>
	//    2    4:invokevirtual   #54  <Method int String.length()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean hasSimpleName(String s)
	{
		return _simpleName.equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String _simpleName>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #72  <Method boolean String.equals(Object)>
	//    4    8:ireturn         
	}

	public int hashCode()
	{
		String s = _namespace;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String _namespace>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       17
			return _simpleName.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field String _simpleName>
	//    7   13:invokevirtual   #81  <Method int String.hashCode()>
	//    8   16:ireturn         
		else
			return s.hashCode() ^ _simpleName.hashCode();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #81  <Method int String.hashCode()>
	//   11   21:aload_0         
	//   12   22:getfield        #46  <Field String _simpleName>
	//   13   25:invokevirtual   #81  <Method int String.hashCode()>
	//   14   28:ixor            
	//   15   29:ireturn         
	}

	public PropertyName internSimpleName()
	{
		if(_simpleName.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field String _simpleName>
	//*   2    4:invokevirtual   #54  <Method int String.length()>
	//*   3    7:ifne            12
			return this;
	//    4   10:aload_0         
	//    5   11:areturn         
		String s = InternCache.instance.intern(_simpleName);
	//    6   12:getstatic       #60  <Field InternCache InternCache.instance>
	//    7   15:aload_0         
	//    8   16:getfield        #46  <Field String _simpleName>
	//    9   19:invokevirtual   #63  <Method String InternCache.intern(String)>
	//   10   22:astore_1        
		if(s == _simpleName)
	//*  11   23:aload_1         
	//*  12   24:aload_0         
	//*  13   25:getfield        #46  <Field String _simpleName>
	//*  14   28:if_acmpne       33
			return this;
	//   15   31:aload_0         
	//   16   32:areturn         
		else
			return new PropertyName(s, _namespace);
	//   17   33:new             #2   <Class PropertyName>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #48  <Field String _namespace>
	//   22   42:invokespecial   #26  <Method void PropertyName(String, String)>
	//   23   45:areturn         
	}

	public boolean isEmpty()
	{
		return _namespace == null && _simpleName.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String _namespace>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field String _simpleName>
	//    5   11:invokevirtual   #86  <Method boolean String.isEmpty()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected Object readResolve()
	{
		if(_namespace == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field String _namespace>
	//*   2    4:ifnonnull       29
		{
			String s = _simpleName;
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field String _simpleName>
	//    5   11:astore_1        
			if(s == null || "".equals(((Object) (s))))
	//*   6   12:aload_1         
	//*   7   13:ifnull          25
	//*   8   16:ldc1            #22  <String "">
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #72  <Method boolean String.equals(Object)>
	//*  11   22:ifeq            29
				return ((Object) (USE_DEFAULT));
	//   12   25:getstatic       #28  <Field PropertyName USE_DEFAULT>
	//   13   28:areturn         
		}
		return ((Object) (this));
	//   14   29:aload_0         
	//   15   30:areturn         
	}

	public SerializableString simpleAsEncoded(MapperConfig mapperconfig)
	{
		SerializableString serializablestring = _encodedSimple;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field SerializableString _encodedSimple>
	//    2    4:astore_3        
		Object obj = ((Object) (serializablestring));
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(serializablestring == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       46
		{
			if(mapperconfig == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       30
				mapperconfig = ((MapperConfig) (new SerializedString(_simpleName)));
	//    9   15:new             #94  <Class SerializedString>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #46  <Field String _simpleName>
	//   13   23:invokespecial   #95  <Method void SerializedString(String)>
	//   14   26:astore_1        
			else
	//*  15   27:goto            39
				mapperconfig = ((MapperConfig) (mapperconfig.compileString(_simpleName)));
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #46  <Field String _simpleName>
	//   19   35:invokevirtual   #101 <Method SerializableString MapperConfig.compileString(String)>
	//   20   38:astore_1        
			_encodedSimple = ((SerializableString) (mapperconfig));
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:putfield        #92  <Field SerializableString _encodedSimple>
			obj = ((Object) (mapperconfig));
	//   24   44:aload_1         
	//   25   45:astore_2        
		}
		return ((SerializableString) (obj));
	//   26   46:aload_2         
	//   27   47:areturn         
	}

	public String toString()
	{
		if(_namespace == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field String _namespace>
	//*   2    4:ifnonnull       12
		{
			return _simpleName;
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field String _simpleName>
	//    5   11:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #106 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #107 <Method void StringBuilder()>
	//    9   19:astore_1        
			stringbuilder.append("{");
	//   10   20:aload_1         
	//   11   21:ldc1            #109 <String "{">
	//   12   23:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			stringbuilder.append(_namespace);
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #48  <Field String _namespace>
	//   17   32:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			stringbuilder.append("}");
	//   19   36:aload_1         
	//   20   37:ldc1            #115 <String "}">
	//   21   39:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append(_simpleName);
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #46  <Field String _simpleName>
	//   26   48:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			return stringbuilder.toString();
	//   28   52:aload_1         
	//   29   53:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   30   56:areturn         
		}
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
	//    4    6:ldc1            #22  <String "">
	//    5    8:astore_2        
		if(s1.equals(((Object) (_simpleName))))
	//*   6    9:aload_2         
	//*   7   10:aload_0         
	//*   8   11:getfield        #46  <Field String _simpleName>
	//*   9   14:invokevirtual   #72  <Method boolean String.equals(Object)>
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
	//   17   28:getfield        #48  <Field String _namespace>
	//   18   31:invokespecial   #26  <Method void PropertyName(String, String)>
	//   19   34:areturn         
	}

	public static final PropertyName NO_NAME = new PropertyName(new String(""), ((String) (null)));
	public static final PropertyName USE_DEFAULT = new PropertyName("", ((String) (null)));
	private static final long serialVersionUID = 1L;
	protected SerializableString _encodedSimple;
	protected final String _namespace;
	protected final String _simpleName;

	static 
	{
	//    0    0:new             #2   <Class PropertyName>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "">
	//    3    6:aconst_null     
	//    4    7:invokespecial   #26  <Method void PropertyName(String, String)>
	//    5   10:putstatic       #28  <Field PropertyName USE_DEFAULT>
	//    6   13:new             #2   <Class PropertyName>
	//    7   16:dup             
	//    8   17:new             #30  <Class String>
	//    9   20:dup             
	//   10   21:ldc1            #22  <String "">
	//   11   23:invokespecial   #33  <Method void String(String)>
	//   12   26:aconst_null     
	//   13   27:invokespecial   #26  <Method void PropertyName(String, String)>
	//   14   30:putstatic       #35  <Field PropertyName NO_NAME>
	//*  15   33:return          
	}
}
