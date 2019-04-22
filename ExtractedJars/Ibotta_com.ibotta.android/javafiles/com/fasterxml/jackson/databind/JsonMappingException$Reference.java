// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonMappingException

public static class JsonMappingException$Reference
	implements Serializable
{

	public String getDescription()
	{
		if(_desc == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field String _desc>
	//*   2    4:ifnonnull       182
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #46  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #47  <Method void StringBuilder()>
	//    6   14:astore_3        
			Object obj = _from;
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field Object _from>
	//    9   19:astore_2        
			if(obj == null)
	//*  10   20:aload_2         
	//*  11   21:ifnonnull       34
			{
				stringbuilder.append("UNKNOWN");
	//   12   24:aload_3         
	//   13   25:ldc1            #49  <String "UNKNOWN">
	//   14   27:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			} else
	//*  16   31:goto            102
			{
				if(obj instanceof Class)
	//*  17   34:aload_2         
	//*  18   35:instanceof      #55  <Class Class>
	//*  19   38:ifeq            49
					obj = ((Object) ((Class)obj));
	//   20   41:aload_2         
	//   21   42:checkcast       #55  <Class Class>
	//   22   45:astore_2        
				else
	//*  23   46:goto            54
					obj = ((Object) (obj.getClass()));
	//   24   49:aload_2         
	//   25   50:invokevirtual   #59  <Method Class Object.getClass()>
	//   26   53:astore_2        
				int i;
				for(i = 0; ((Class) (obj)).isArray(); i++)
	//*  27   54:iconst_0        
	//*  28   55:istore_1        
	//*  29   56:aload_2         
	//*  30   57:invokevirtual   #63  <Method boolean Class.isArray()>
	//*  31   60:ifeq            75
					obj = ((Object) (((Class) (obj)).getComponentType()));
	//   32   63:aload_2         
	//   33   64:invokevirtual   #66  <Method Class Class.getComponentType()>
	//   34   67:astore_2        

	//   35   68:iload_1         
	//   36   69:iconst_1        
	//   37   70:iadd            
	//   38   71:istore_1        
	//*  39   72:goto            56
				stringbuilder.append(((Class) (obj)).getName());
	//   40   75:aload_3         
	//   41   76:aload_2         
	//   42   77:invokevirtual   #69  <Method String Class.getName()>
	//   43   80:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   44   83:pop             
				do
				{
					i--;
	//   45   84:iload_1         
	//   46   85:iconst_1        
	//   47   86:isub            
	//   48   87:istore_1        
					if(i < 0)
						break;
	//   49   88:iload_1         
	//   50   89:iflt            102
					stringbuilder.append("[]");
	//   51   92:aload_3         
	//   52   93:ldc1            #71  <String "[]">
	//   53   95:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   54   98:pop             
				} while(true);
	//   55   99:goto            84
			}
			stringbuilder.append('[');
	//   56  102:aload_3         
	//   57  103:bipush          91
	//   58  105:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
	//   59  108:pop             
			if(_fieldName != null)
	//*  60  109:aload_0         
	//*  61  110:getfield        #33  <Field String _fieldName>
	//*  62  113:ifnull          142
			{
				stringbuilder.append('"');
	//   63  116:aload_3         
	//   64  117:bipush          34
	//   65  119:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
	//   66  122:pop             
				stringbuilder.append(_fieldName);
	//   67  123:aload_3         
	//   68  124:aload_0         
	//   69  125:getfield        #33  <Field String _fieldName>
	//   70  128:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   71  131:pop             
				stringbuilder.append('"');
	//   72  132:aload_3         
	//   73  133:bipush          34
	//   74  135:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
	//   75  138:pop             
			} else
	//*  76  139:goto            167
			{
				int j = _index;
	//   77  142:aload_0         
	//   78  143:getfield        #26  <Field int _index>
	//   79  146:istore_1        
				if(j >= 0)
	//*  80  147:iload_1         
	//*  81  148:iflt            160
					stringbuilder.append(j);
	//   82  151:aload_3         
	//   83  152:iload_1         
	//   84  153:invokevirtual   #77  <Method StringBuilder StringBuilder.append(int)>
	//   85  156:pop             
				else
	//*  86  157:goto            167
					stringbuilder.append('?');
	//   87  160:aload_3         
	//   88  161:bipush          63
	//   89  163:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
	//   90  166:pop             
			}
			stringbuilder.append(']');
	//   91  167:aload_3         
	//   92  168:bipush          93
	//   93  170:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
	//   94  173:pop             
			_desc = stringbuilder.toString();
	//   95  174:aload_0         
	//   96  175:aload_3         
	//   97  176:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   98  179:putfield        #44  <Field String _desc>
		}
		return _desc;
	//   99  182:aload_0         
	//  100  183:getfield        #44  <Field String _desc>
	//  101  186:areturn         
	}

	public String toString()
	{
		return getDescription();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method String getDescription()>
	//    2    4:areturn         
	}

	Object writeReplace()
	{
		getDescription();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method String getDescription()>
	//    2    4:pop             
		return ((Object) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final long serialVersionUID = 2L;
	protected String _desc;
	protected String _fieldName;
	protected transient Object _from;
	protected int _index;

	protected JsonMappingException$Reference()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_index = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #26  <Field int _index>
	//    5    9:return          
	}

	public JsonMappingException$Reference(Object obj, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_index = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #26  <Field int _index>
		_from = obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #30  <Field Object _from>
		_index = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #26  <Field int _index>
	//   11   19:return          
	}

	public JsonMappingException$Reference(Object obj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_index = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #26  <Field int _index>
		_from = obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #30  <Field Object _from>
		if(s != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          24
		{
			_fieldName = s;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #33  <Field String _fieldName>
			return;
	//   13   23:return          
		} else
		{
			throw new NullPointerException("Cannot pass null fieldName");
	//   14   24:new             #35  <Class NullPointerException>
	//   15   27:dup             
	//   16   28:ldc1            #37  <String "Cannot pass null fieldName">
	//   17   30:invokespecial   #40  <Method void NullPointerException(String)>
	//   18   33:athrow          
		}
	}
}
