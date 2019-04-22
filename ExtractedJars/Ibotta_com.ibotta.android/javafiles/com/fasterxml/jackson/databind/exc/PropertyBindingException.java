// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.exc:
//			MismatchedInputException

public abstract class PropertyBindingException extends MismatchedInputException
{

	protected PropertyBindingException(JsonParser jsonparser, String s, JsonLocation jsonlocation, Class class1, String s1, Collection collection)
	{
		super(jsonparser, s, jsonlocation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #18  <Method void MismatchedInputException(JsonParser, String, JsonLocation)>
		_referringClass = class1;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #20  <Field Class _referringClass>
		_propertyName = s1;
	//    8   13:aload_0         
	//    9   14:aload           5
	//   10   16:putfield        #22  <Field String _propertyName>
		_propertyIds = collection;
	//   11   19:aload_0         
	//   12   20:aload           6
	//   13   22:putfield        #24  <Field Collection _propertyIds>
	//   14   25:return          
	}

	public String getMessageSuffix()
	{
		String s = _propertiesAsString;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String _propertiesAsString>
	//    2    4:astore_3        
		Object obj = ((Object) (s));
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(s == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       207
		{
			obj = ((Object) (s));
	//    7   11:aload_3         
	//    8   12:astore_2        
			if(_propertyIds != null)
	//*   9   13:aload_0         
	//*  10   14:getfield        #24  <Field Collection _propertyIds>
	//*  11   17:ifnull          207
			{
				obj = ((Object) (new StringBuilder(100)));
	//   12   20:new             #33  <Class StringBuilder>
	//   13   23:dup             
	//   14   24:bipush          100
	//   15   26:invokespecial   #36  <Method void StringBuilder(int)>
	//   16   29:astore_2        
				int i = _propertyIds.size();
	//   17   30:aload_0         
	//   18   31:getfield        #24  <Field Collection _propertyIds>
	//   19   34:invokeinterface #42  <Method int Collection.size()>
	//   20   39:istore_1        
				if(i == 1)
	//*  21   40:iload_1         
	//*  22   41:iconst_1        
	//*  23   42:icmpne          84
				{
					((StringBuilder) (obj)).append(" (one known property: \"");
	//   24   45:aload_2         
	//   25   46:ldc1            #44  <String " (one known property: \"">
	//   26   48:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
					((StringBuilder) (obj)).append(String.valueOf(_propertyIds.iterator().next()));
	//   28   52:aload_2         
	//   29   53:aload_0         
	//   30   54:getfield        #24  <Field Collection _propertyIds>
	//   31   57:invokeinterface #52  <Method Iterator Collection.iterator()>
	//   32   62:invokeinterface #58  <Method Object Iterator.next()>
	//   33   67:invokestatic    #64  <Method String String.valueOf(Object)>
	//   34   70:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   35   73:pop             
					((StringBuilder) (obj)).append('"');
	//   36   74:aload_2         
	//   37   75:bipush          34
	//   38   77:invokevirtual   #67  <Method StringBuilder StringBuilder.append(char)>
	//   39   80:pop             
				} else
	//*  40   81:goto            190
				{
					((StringBuilder) (obj)).append(" (");
	//   41   84:aload_2         
	//   42   85:ldc1            #69  <String " (">
	//   43   87:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
					((StringBuilder) (obj)).append(i);
	//   45   91:aload_2         
	//   46   92:iload_1         
	//   47   93:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   48   96:pop             
					((StringBuilder) (obj)).append(" known properties: ");
	//   49   97:aload_2         
	//   50   98:ldc1            #74  <String " known properties: ">
	//   51  100:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   52  103:pop             
					Iterator iterator = _propertyIds.iterator();
	//   53  104:aload_0         
	//   54  105:getfield        #24  <Field Collection _propertyIds>
	//   55  108:invokeinterface #52  <Method Iterator Collection.iterator()>
	//   56  113:astore_3        
					do
					{
						if(!iterator.hasNext())
							break;
	//   57  114:aload_3         
	//   58  115:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//   59  120:ifeq            190
						((StringBuilder) (obj)).append('"');
	//   60  123:aload_2         
	//   61  124:bipush          34
	//   62  126:invokevirtual   #67  <Method StringBuilder StringBuilder.append(char)>
	//   63  129:pop             
						((StringBuilder) (obj)).append(String.valueOf(iterator.next()));
	//   64  130:aload_2         
	//   65  131:aload_3         
	//   66  132:invokeinterface #58  <Method Object Iterator.next()>
	//   67  137:invokestatic    #64  <Method String String.valueOf(Object)>
	//   68  140:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   69  143:pop             
						((StringBuilder) (obj)).append('"');
	//   70  144:aload_2         
	//   71  145:bipush          34
	//   72  147:invokevirtual   #67  <Method StringBuilder StringBuilder.append(char)>
	//   73  150:pop             
						if(((StringBuilder) (obj)).length() > 1000)
	//*  74  151:aload_2         
	//*  75  152:invokevirtual   #81  <Method int StringBuilder.length()>
	//*  76  155:sipush          1000
	//*  77  158:icmple          171
						{
							((StringBuilder) (obj)).append(" [truncated]");
	//   78  161:aload_2         
	//   79  162:ldc1            #83  <String " [truncated]">
	//   80  164:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   81  167:pop             
							break;
	//   82  168:goto            190
						}
						if(iterator.hasNext())
	//*  83  171:aload_3         
	//*  84  172:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  85  177:ifeq            114
							((StringBuilder) (obj)).append(", ");
	//   86  180:aload_2         
	//   87  181:ldc1            #85  <String ", ">
	//   88  183:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   89  186:pop             
					} while(true);
	//   90  187:goto            114
				}
				((StringBuilder) (obj)).append("])");
	//   91  190:aload_2         
	//   92  191:ldc1            #87  <String "])">
	//   93  193:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   94  196:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   95  197:aload_2         
	//   96  198:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   97  201:astore_2        
				_propertiesAsString = ((String) (obj));
	//   98  202:aload_0         
	//   99  203:aload_2         
	//  100  204:putfield        #31  <Field String _propertiesAsString>
			}
		}
		return ((String) (obj));
	//  101  207:aload_2         
	//  102  208:areturn         
	}

	protected transient String _propertiesAsString;
	protected final Collection _propertyIds;
	protected final String _propertyName;
	protected final Class _referringClass;
}
