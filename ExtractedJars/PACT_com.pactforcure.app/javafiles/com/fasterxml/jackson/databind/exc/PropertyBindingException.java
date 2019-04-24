// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.*;

public abstract class PropertyBindingException extends JsonMappingException
{

	protected PropertyBindingException(JsonParser jsonparser, String s, JsonLocation jsonlocation, Class class1, String s1, Collection collection)
	{
		super(((java.io.Closeable) (jsonparser)), s, jsonlocation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #21  <Method void JsonMappingException(java.io.Closeable, String, JsonLocation)>
		_referringClass = class1;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #23  <Field Class _referringClass>
		_propertyName = s1;
	//    8   13:aload_0         
	//    9   14:aload           5
	//   10   16:putfield        #25  <Field String _propertyName>
		_propertyIds = collection;
	//   11   19:aload_0         
	//   12   20:aload           6
	//   13   22:putfield        #27  <Field Collection _propertyIds>
	//   14   25:return          
	}

	protected PropertyBindingException(String s, JsonLocation jsonlocation, Class class1, String s1, Collection collection)
	{
		this(((JsonParser) (null)), s, jsonlocation, class1, s1, collection);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:aload           5
	//    7    9:invokespecial   #34  <Method void PropertyBindingException(JsonParser, String, JsonLocation, Class, String, Collection)>
	//    8   12:return          
	}

	public Collection getKnownPropertyIds()
	{
		if(_propertyIds == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Collection _propertyIds>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return Collections.unmodifiableCollection(_propertyIds);
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field Collection _propertyIds>
	//    7   13:invokestatic    #44  <Method Collection Collections.unmodifiableCollection(Collection)>
	//    8   16:areturn         
	}

	public String getMessageSuffix()
	{
		Object obj;
		String s;
		s = _propertiesAsString;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String _propertiesAsString>
	//    2    4:astore_3        
		obj = ((Object) (s));
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(s != null) goto _L2; else goto _L1
	//    5    7:aload_3         
	//    6    8:ifnonnull       98
_L1:
		obj = ((Object) (s));
	//    7   11:aload_3         
	//    8   12:astore_2        
		if(_propertyIds == null) goto _L2; else goto _L3
	//    9   13:aload_0         
	//   10   14:getfield        #27  <Field Collection _propertyIds>
	//   11   17:ifnull          98
_L3:
		int i;
		obj = ((Object) (new StringBuilder(100)));
	//   12   20:new             #51  <Class StringBuilder>
	//   13   23:dup             
	//   14   24:bipush          100
	//   15   26:invokespecial   #54  <Method void StringBuilder(int)>
	//   16   29:astore_2        
		i = _propertyIds.size();
	//   17   30:aload_0         
	//   18   31:getfield        #27  <Field Collection _propertyIds>
	//   19   34:invokeinterface #60  <Method int Collection.size()>
	//   20   39:istore_1        
		if(i != 1) goto _L5; else goto _L4
	//   21   40:iload_1         
	//   22   41:iconst_1        
	//   23   42:icmpne          100
_L4:
		((StringBuilder) (obj)).append(" (one known property: \"");
	//   24   45:aload_2         
	//   25   46:ldc1            #62  <String " (one known property: \"">
	//   26   48:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		((StringBuilder) (obj)).append(String.valueOf(_propertyIds.iterator().next()));
	//   28   52:aload_2         
	//   29   53:aload_0         
	//   30   54:getfield        #27  <Field Collection _propertyIds>
	//   31   57:invokeinterface #70  <Method Iterator Collection.iterator()>
	//   32   62:invokeinterface #76  <Method Object Iterator.next()>
	//   33   67:invokestatic    #82  <Method String String.valueOf(Object)>
	//   34   70:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   35   73:pop             
		((StringBuilder) (obj)).append('"');
	//   36   74:aload_2         
	//   37   75:bipush          34
	//   38   77:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   39   80:pop             
_L7:
		((StringBuilder) (obj)).append("])");
	//   40   81:aload_2         
	//   41   82:ldc1            #87  <String "])">
	//   42   84:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   44   88:aload_2         
	//   45   89:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   46   92:astore_2        
		_propertiesAsString = ((String) (obj));
	//   47   93:aload_0         
	//   48   94:aload_2         
	//   49   95:putfield        #49  <Field String _propertiesAsString>
_L2:
		return ((String) (obj));
	//   50   98:aload_2         
	//   51   99:areturn         
_L5:
		((StringBuilder) (obj)).append(" (").append(i).append(" known properties: ");
	//   52  100:aload_2         
	//   53  101:ldc1            #92  <String " (">
	//   54  103:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   55  106:iload_1         
	//   56  107:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   57  110:ldc1            #97  <String " known properties: ">
	//   58  112:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   59  115:pop             
		Iterator iterator = _propertyIds.iterator();
	//   60  116:aload_0         
	//   61  117:getfield        #27  <Field Collection _propertyIds>
	//   62  120:invokeinterface #70  <Method Iterator Collection.iterator()>
	//   63  125:astore_3        
		do
		{
			if(iterator.hasNext())
	//*  64  126:aload_3         
	//*  65  127:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*  66  132:ifeq            81
			{
label0:
				{
					((StringBuilder) (obj)).append('"');
	//   67  135:aload_2         
	//   68  136:bipush          34
	//   69  138:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   70  141:pop             
					((StringBuilder) (obj)).append(String.valueOf(iterator.next()));
	//   71  142:aload_2         
	//   72  143:aload_3         
	//   73  144:invokeinterface #76  <Method Object Iterator.next()>
	//   74  149:invokestatic    #82  <Method String String.valueOf(Object)>
	//   75  152:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   76  155:pop             
					((StringBuilder) (obj)).append('"');
	//   77  156:aload_2         
	//   78  157:bipush          34
	//   79  159:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   80  162:pop             
					if(((StringBuilder) (obj)).length() <= 1000)
						break label0;
	//   81  163:aload_2         
	//   82  164:invokevirtual   #104 <Method int StringBuilder.length()>
	//   83  167:sipush          1000
	//   84  170:icmple          183
					((StringBuilder) (obj)).append(" [truncated]");
	//   85  173:aload_2         
	//   86  174:ldc1            #106 <String " [truncated]">
	//   87  176:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   88  179:pop             
				}
			}
			if(true)
				continue;
	//   89  180:goto            81
			if(iterator.hasNext())
	//*  90  183:aload_3         
	//*  91  184:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*  92  189:ifeq            126
				((StringBuilder) (obj)).append(", ");
	//   93  192:aload_2         
	//   94  193:ldc1            #108 <String ", ">
	//   95  195:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   96  198:pop             
		} while(true);
	//   97  199:goto            126
		if(true) goto _L7; else goto _L6
_L6:
	}

	public String getPropertyName()
	{
		return _propertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String _propertyName>
	//    2    4:areturn         
	}

	public Class getReferringClass()
	{
		return _referringClass;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Class _referringClass>
	//    2    4:areturn         
	}

	private static final int MAX_DESC_LENGTH = 1000;
	protected transient String _propertiesAsString;
	protected final Collection _propertyIds;
	protected final String _propertyName;
	protected final Class _referringClass;
}
