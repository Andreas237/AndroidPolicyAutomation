// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.*;

public final class ManagedReferenceProperty extends com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
{

	public ManagedReferenceProperty(SettableBeanProperty settablebeanproperty, String s, SettableBeanProperty settablebeanproperty1, boolean flag)
	{
		super(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating(SettableBeanProperty)>
		_referenceName = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String _referenceName>
		_backProperty = settablebeanproperty1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field SettableBeanProperty _backProperty>
		_isContainer = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #25  <Field boolean _isContainer>
	//   12   21:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		set(obj, _flddelegate.deserialize(jsonparser, deserializationcontext));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload_0         
	//    3    3:getfield        #33  <Field SettableBeanProperty _flddelegate>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #39  <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//    7   11:invokevirtual   #43  <Method void set(Object, Object)>
	//    8   14:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return setAndReturn(obj, deserialize(jsonparser, deserializationcontext));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokevirtual   #47  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    6    8:invokevirtual   #51  <Method Object setAndReturn(Object, Object)>
	//    7   11:areturn         
	}

	public void fixAccess(DeserializationConfig deserializationconfig)
	{
		_flddelegate.fixAccess(deserializationconfig);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SettableBeanProperty _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #55  <Method void SettableBeanProperty.fixAccess(DeserializationConfig)>
		_backProperty.fixAccess(deserializationconfig);
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field SettableBeanProperty _backProperty>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #55  <Method void SettableBeanProperty.fixAccess(DeserializationConfig)>
	//    8   16:return          
	}

	public final void set(Object obj, Object obj1)
		throws IOException
	{
		setAndReturn(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #51  <Method Object setAndReturn(Object, Object)>
	//    4    6:pop             
	//    5    7:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		if(obj1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          251
			if(_isContainer)
	//*   2    4:aload_0         
	//*   3    5:getfield        #25  <Field boolean _isContainer>
	//*   4    8:ifeq            242
			{
				if(obj1 instanceof Object[])
	//*   5   11:aload_2         
	//*   6   12:instanceof      #57  <Class Object[]>
	//*   7   15:ifeq            65
				{
					Object aobj[] = (Object[])obj1;
	//    8   18:aload_2         
	//    9   19:checkcast       #57  <Class Object[]>
	//   10   22:astore          5
					int j = aobj.length;
	//   11   24:aload           5
	//   12   26:arraylength     
	//   13   27:istore          4
					for(int i = 0; i < j; i++)
	//*  14   29:iconst_0        
	//*  15   30:istore_3        
	//*  16   31:iload_3         
	//*  17   32:iload           4
	//*  18   34:icmpge          251
					{
						Object obj2 = aobj[i];
	//   19   37:aload           5
	//   20   39:iload_3         
	//   21   40:aaload          
	//   22   41:astore          6
						if(obj2 != null)
	//*  23   43:aload           6
	//*  24   45:ifnull          58
							_backProperty.set(obj2, obj);
	//   25   48:aload_0         
	//   26   49:getfield        #23  <Field SettableBeanProperty _backProperty>
	//   27   52:aload           6
	//   28   54:aload_1         
	//   29   55:invokevirtual   #58  <Method void SettableBeanProperty.set(Object, Object)>
					}

	//   30   58:iload_3         
	//   31   59:iconst_1        
	//   32   60:iadd            
	//   33   61:istore_3        
				} else
	//*  34   62:goto            31
				if(obj1 instanceof Collection)
	//*  35   65:aload_2         
	//*  36   66:instanceof      #60  <Class Collection>
	//*  37   69:ifeq            120
				{
					Iterator iterator = ((Collection)obj1).iterator();
	//   38   72:aload_2         
	//   39   73:checkcast       #60  <Class Collection>
	//   40   76:invokeinterface #64  <Method Iterator Collection.iterator()>
	//   41   81:astore          5
					do
					{
						if(!iterator.hasNext())
							break;
	//   42   83:aload           5
	//   43   85:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   44   90:ifeq            251
						Object obj3 = iterator.next();
	//   45   93:aload           5
	//   46   95:invokeinterface #74  <Method Object Iterator.next()>
	//   47  100:astore          6
						if(obj3 != null)
	//*  48  102:aload           6
	//*  49  104:ifnull          83
							_backProperty.set(obj3, obj);
	//   50  107:aload_0         
	//   51  108:getfield        #23  <Field SettableBeanProperty _backProperty>
	//   52  111:aload           6
	//   53  113:aload_1         
	//   54  114:invokevirtual   #58  <Method void SettableBeanProperty.set(Object, Object)>
					} while(true);
	//   55  117:goto            83
				} else
				if(obj1 instanceof Map)
	//*  56  120:aload_2         
	//*  57  121:instanceof      #76  <Class Map>
	//*  58  124:ifeq            180
				{
					Iterator iterator1 = ((Map)obj1).values().iterator();
	//   59  127:aload_2         
	//   60  128:checkcast       #76  <Class Map>
	//   61  131:invokeinterface #80  <Method Collection Map.values()>
	//   62  136:invokeinterface #64  <Method Iterator Collection.iterator()>
	//   63  141:astore          5
					do
					{
						if(!iterator1.hasNext())
							break;
	//   64  143:aload           5
	//   65  145:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   66  150:ifeq            251
						Object obj4 = iterator1.next();
	//   67  153:aload           5
	//   68  155:invokeinterface #74  <Method Object Iterator.next()>
	//   69  160:astore          6
						if(obj4 != null)
	//*  70  162:aload           6
	//*  71  164:ifnull          143
							_backProperty.set(obj4, obj);
	//   72  167:aload_0         
	//   73  168:getfield        #23  <Field SettableBeanProperty _backProperty>
	//   74  171:aload           6
	//   75  173:aload_1         
	//   76  174:invokevirtual   #58  <Method void SettableBeanProperty.set(Object, Object)>
					} while(true);
	//   77  177:goto            143
				} else
				{
					obj = ((Object) (new StringBuilder()));
	//   78  180:new             #82  <Class StringBuilder>
	//   79  183:dup             
	//   80  184:invokespecial   #85  <Method void StringBuilder()>
	//   81  187:astore_1        
					((StringBuilder) (obj)).append("Unsupported container type (");
	//   82  188:aload_1         
	//   83  189:ldc1            #87  <String "Unsupported container type (">
	//   84  191:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   85  194:pop             
					((StringBuilder) (obj)).append(obj1.getClass().getName());
	//   86  195:aload_1         
	//   87  196:aload_2         
	//   88  197:invokevirtual   #97  <Method Class Object.getClass()>
	//   89  200:invokevirtual   #103 <Method String Class.getName()>
	//   90  203:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   91  206:pop             
					((StringBuilder) (obj)).append(") when resolving reference '");
	//   92  207:aload_1         
	//   93  208:ldc1            #105 <String ") when resolving reference '">
	//   94  210:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   95  213:pop             
					((StringBuilder) (obj)).append(_referenceName);
	//   96  214:aload_1         
	//   97  215:aload_0         
	//   98  216:getfield        #21  <Field String _referenceName>
	//   99  219:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  100  222:pop             
					((StringBuilder) (obj)).append("'");
	//  101  223:aload_1         
	//  102  224:ldc1            #107 <String "'">
	//  103  226:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  104  229:pop             
					throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//  105  230:new             #109 <Class IllegalStateException>
	//  106  233:dup             
	//  107  234:aload_1         
	//  108  235:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  109  238:invokespecial   #115 <Method void IllegalStateException(String)>
	//  110  241:athrow          
				}
			} else
			{
				_backProperty.set(obj1, obj);
	//  111  242:aload_0         
	//  112  243:getfield        #23  <Field SettableBeanProperty _backProperty>
	//  113  246:aload_2         
	//  114  247:aload_1         
	//  115  248:invokevirtual   #58  <Method void SettableBeanProperty.set(Object, Object)>
			}
		return _flddelegate.setAndReturn(obj, obj1);
	//  116  251:aload_0         
	//  117  252:getfield        #33  <Field SettableBeanProperty _flddelegate>
	//  118  255:aload_1         
	//  119  256:aload_2         
	//  120  257:invokevirtual   #116 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//  121  260:areturn         
	}

	protected SettableBeanProperty withDelegate(SettableBeanProperty settablebeanproperty)
	{
		throw new IllegalStateException("Should never try to reset delegate");
	//    0    0:new             #109 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #120 <String "Should never try to reset delegate">
	//    3    6:invokespecial   #115 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	private static final long serialVersionUID = 1L;
	protected final SettableBeanProperty _backProperty;
	protected final boolean _isContainer;
	protected final String _referenceName;
}
