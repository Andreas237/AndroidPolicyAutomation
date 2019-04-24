// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonMappingException

public static class JsonMappingException$Reference
	implements Serializable
{

	public String getFieldName()
	{
		return _fieldName;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String _fieldName>
	//    2    4:areturn         
	}

	public Object getFrom()
	{
		return _from;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object _from>
	//    2    4:areturn         
	}

	public int getIndex()
	{
		return _index;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _index>
	//    2    4:ireturn         
	}

	public void setFieldName(String s)
	{
		_fieldName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String _fieldName>
	//    3    5:return          
	}

	public void setFrom(Object obj)
	{
		_from = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field Object _from>
	//    3    5:return          
	}

	public void setIndex(int i)
	{
		_index = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int _index>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void StringBuilder()>
	//    3    7:astore_2        
		Class class1;
		String s;
		if(_from instanceof Class)
	//*   4    8:aload_0         
	//*   5    9:getfield        #29  <Field Object _from>
	//*   6   12:instanceof      #56  <Class Class>
	//*   7   15:ifeq            106
			class1 = (Class)_from;
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field Object _from>
	//   10   22:checkcast       #56  <Class Class>
	//   11   25:astore_1        
		else
	//*  12   26:aload_1         
	//*  13   27:invokestatic    #62  <Method String ClassUtil.getPackageName(Class)>
	//*  14   30:astore_3        
	//*  15   31:aload_3         
	//*  16   32:ifnull          48
	//*  17   35:aload_2         
	//*  18   36:aload_3         
	//*  19   37:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//*  20   40:pop             
	//*  21   41:aload_2         
	//*  22   42:bipush          46
	//*  23   44:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
	//*  24   47:pop             
	//*  25   48:aload_2         
	//*  26   49:aload_1         
	//*  27   50:invokevirtual   #72  <Method String Class.getSimpleName()>
	//*  28   53:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//*  29   56:pop             
	//*  30   57:aload_2         
	//*  31   58:bipush          91
	//*  32   60:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
	//*  33   63:pop             
	//*  34   64:aload_0         
	//*  35   65:getfield        #40  <Field String _fieldName>
	//*  36   68:ifnull          117
	//*  37   71:aload_2         
	//*  38   72:bipush          34
	//*  39   74:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
	//*  40   77:pop             
	//*  41   78:aload_2         
	//*  42   79:aload_0         
	//*  43   80:getfield        #40  <Field String _fieldName>
	//*  44   83:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//*  45   86:pop             
	//*  46   87:aload_2         
	//*  47   88:bipush          34
	//*  48   90:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
	//*  49   93:pop             
	//*  50   94:aload_2         
	//*  51   95:bipush          93
	//*  52   97:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
	//*  53  100:pop             
	//*  54  101:aload_2         
	//*  55  102:invokevirtual   #74  <Method String StringBuilder.toString()>
	//*  56  105:areturn         
			class1 = _from.getClass();
	//   57  106:aload_0         
	//   58  107:getfield        #29  <Field Object _from>
	//   59  110:invokevirtual   #78  <Method Class Object.getClass()>
	//   60  113:astore_1        
		s = ClassUtil.getPackageName(class1);
		if(s != null)
		{
			stringbuilder.append(s);
			stringbuilder.append('.');
		}
		stringbuilder.append(class1.getSimpleName());
		stringbuilder.append('[');
		if(_fieldName != null)
		{
			stringbuilder.append('"');
			stringbuilder.append(_fieldName);
			stringbuilder.append('"');
		} else
	//*  61  114:goto            26
		if(_index >= 0)
	//*  62  117:aload_0         
	//*  63  118:getfield        #25  <Field int _index>
	//*  64  121:iflt            136
			stringbuilder.append(_index);
	//   65  124:aload_2         
	//   66  125:aload_0         
	//   67  126:getfield        #25  <Field int _index>
	//   68  129:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   69  132:pop             
		else
	//*  70  133:goto            94
			stringbuilder.append('?');
	//   71  136:aload_2         
	//   72  137:bipush          63
	//   73  139:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
	//   74  142:pop             
		stringbuilder.append(']');
		return stringbuilder.toString();
	//*  75  143:goto            94
	}

	private static final long serialVersionUID = 1L;
	protected String _fieldName;
	protected Object _from;
	protected int _index;

	protected JsonMappingException$Reference()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		_index = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #25  <Field int _index>
	//    5    9:return          
	}

	public JsonMappingException$Reference(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		_index = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #25  <Field int _index>
		_from = obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field Object _from>
	//    8   14:return          
	}

	public JsonMappingException$Reference(Object obj, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		_index = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #25  <Field int _index>
		_from = obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field Object _from>
		_index = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #25  <Field int _index>
	//   11   19:return          
	}

	public JsonMappingException$Reference(Object obj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		_index = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #25  <Field int _index>
		_from = obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field Object _from>
		if(s == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       28
		{
			throw new NullPointerException("Can not pass null fieldName");
	//   10   18:new             #33  <Class NullPointerException>
	//   11   21:dup             
	//   12   22:ldc1            #35  <String "Can not pass null fieldName">
	//   13   24:invokespecial   #38  <Method void NullPointerException(String)>
	//   14   27:athrow          
		} else
		{
			_fieldName = s;
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:putfield        #40  <Field String _fieldName>
			return;
	//   18   33:return          
		}
	}
}
