// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.event.InPlayListener;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.util.OptionHelper;
import java.util.*;
import org.xml.sax.Locator;

// Referenced classes of package ch.qos.logback.core.joran.spi:
//			DefaultNestedComponentRegistry, Interpreter

public class InterpretationContext extends ContextAwareBase
	implements PropertyContainer
{

	public InterpretationContext(Context context, Interpreter interpreter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void ContextAwareBase()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field List listenerList>
		defaultNestedComponentRegistry = new DefaultNestedComponentRegistry();
	//    7   15:aload_0         
	//    8   16:new             #33  <Class DefaultNestedComponentRegistry>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void DefaultNestedComponentRegistry()>
	//   11   23:putfield        #36  <Field DefaultNestedComponentRegistry defaultNestedComponentRegistry>
		this.context = context;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #40  <Field Context context>
		joranInterpreter = interpreter;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #42  <Field Interpreter joranInterpreter>
		objectStack = new Stack();
	//   18   36:aload_0         
	//   19   37:new             #44  <Class Stack>
	//   20   40:dup             
	//   21   41:invokespecial   #45  <Method void Stack()>
	//   22   44:putfield        #47  <Field Stack objectStack>
		objectMap = ((Map) (new HashMap(5)));
	//   23   47:aload_0         
	//   24   48:new             #49  <Class HashMap>
	//   25   51:dup             
	//   26   52:iconst_5        
	//   27   53:invokespecial   #52  <Method void HashMap(int)>
	//   28   56:putfield        #54  <Field Map objectMap>
		propertiesMap = ((Map) (new HashMap(5)));
	//   29   59:aload_0         
	//   30   60:new             #49  <Class HashMap>
	//   31   63:dup             
	//   32   64:iconst_5        
	//   33   65:invokespecial   #52  <Method void HashMap(int)>
	//   34   68:putfield        #56  <Field Map propertiesMap>
	//   35   71:return          
	}

	public void addInPlayListener(InPlayListener inplaylistener)
	{
		if(listenerList.contains(((Object) (inplaylistener))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field List listenerList>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #65  <Method boolean List.contains(Object)>
	//*   4   10:ifeq            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   13:new             #67  <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #68  <Method void StringBuilder()>
	//    8   20:astore_2        
			stringbuilder.append("InPlayListener ");
	//    9   21:aload_2         
	//   10   22:ldc1            #70  <String "InPlayListener ">
	//   11   24:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
			stringbuilder.append(((Object) (inplaylistener)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
	//   16   33:pop             
			stringbuilder.append(" has been already registered");
	//   17   34:aload_2         
	//   18   35:ldc1            #79  <String " has been already registered">
	//   19   37:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			addWarn(stringbuilder.toString());
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   24   46:invokevirtual   #87  <Method void addWarn(String)>
			return;
	//   25   49:return          
		} else
		{
			listenerList.add(((Object) (inplaylistener)));
	//   26   50:aload_0         
	//   27   51:getfield        #31  <Field List listenerList>
	//   28   54:aload_1         
	//   29   55:invokeinterface #90  <Method boolean List.add(Object)>
	//   30   60:pop             
			return;
	//   31   61:return          
		}
	}

	public void addSubstitutionProperties(Properties properties)
	{
		if(properties == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		String s;
		for(Iterator iterator = properties.keySet().iterator(); iterator.hasNext(); addSubstitutionProperty(s, properties.getProperty(s)))
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #98  <Method Set Properties.keySet()>
	//*   5    9:invokeinterface #104 <Method Iterator Set.iterator()>
	//*   6   14:astore_2        
	//*   7   15:aload_2         
	//*   8   16:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            47
			s = (String)iterator.next();
	//   10   24:aload_2         
	//   11   25:invokeinterface #114 <Method Object Iterator.next()>
	//   12   30:checkcast       #116 <Class String>
	//   13   33:astore_3        

	//   14   34:aload_0         
	//   15   35:aload_3         
	//   16   36:aload_1         
	//   17   37:aload_3         
	//   18   38:invokevirtual   #120 <Method String Properties.getProperty(String)>
	//   19   41:invokevirtual   #124 <Method void addSubstitutionProperty(String, String)>
	//*  20   44:goto            15
	//   21   47:return          
	}

	public void addSubstitutionProperty(String s, String s1)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
		{
			if(s1 == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       9
				return;
	//    4    8:return          
			s1 = s1.trim();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #127 <Method String String.trim()>
	//    7   13:astore_2        
			propertiesMap.put(((Object) (s)), ((Object) (s1)));
	//    8   14:aload_0         
	//    9   15:getfield        #56  <Field Map propertiesMap>
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokeinterface #133 <Method Object Map.put(Object, Object)>
	//   13   25:pop             
		}
	//   14   26:return          
	}

	void fireInPlay(SaxEvent saxevent)
	{
		for(Iterator iterator = listenerList.iterator(); iterator.hasNext(); ((InPlayListener)iterator.next()).inPlay(saxevent));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List listenerList>
	//    2    4:invokeinterface #136 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #114 <Method Object Iterator.next()>
	//    9   25:checkcast       #138 <Class InPlayListener>
	//   10   28:aload_1         
	//   11   29:invokeinterface #141 <Method void InPlayListener.inPlay(SaxEvent)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	public Map getCopyOfPropertyMap()
	{
		return ((Map) (new HashMap(propertiesMap)));
	//    0    0:new             #49  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field Map propertiesMap>
	//    4    8:invokespecial   #146 <Method void HashMap(Map)>
	//    5   11:areturn         
	}

	public DefaultNestedComponentRegistry getDefaultNestedComponentRegistry()
	{
		return defaultNestedComponentRegistry;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field DefaultNestedComponentRegistry defaultNestedComponentRegistry>
	//    2    4:areturn         
	}

	public Interpreter getJoranInterpreter()
	{
		return joranInterpreter;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Interpreter joranInterpreter>
	//    2    4:areturn         
	}

	public Locator getLocator()
	{
		return joranInterpreter.getLocator();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Interpreter joranInterpreter>
	//    2    4:invokevirtual   #158 <Method Locator Interpreter.getLocator()>
	//    3    7:areturn         
	}

	public Object getObject(int i)
	{
		return objectStack.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Stack objectStack>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #163 <Method Object Stack.get(int)>
	//    4    8:areturn         
	}

	public Map getObjectMap()
	{
		return objectMap;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Map objectMap>
	//    2    4:areturn         
	}

	public Stack getObjectStack()
	{
		return objectStack;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Stack objectStack>
	//    2    4:areturn         
	}

	public String getProperty(String s)
	{
		String s1 = (String)propertiesMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Map propertiesMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #171 <Method Object Map.get(Object)>
	//    4   10:checkcast       #116 <Class String>
	//    5   13:astore_2        
		if(s1 != null)
	//*   6   14:aload_2         
	//*   7   15:ifnull          20
			return s1;
	//    8   18:aload_2         
	//    9   19:areturn         
		else
			return context.getProperty(s);
	//   10   20:aload_0         
	//   11   21:getfield        #40  <Field Context context>
	//   12   24:aload_1         
	//   13   25:invokeinterface #174 <Method String Context.getProperty(String)>
	//   14   30:areturn         
	}

	public boolean isEmpty()
	{
		return objectStack.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Stack objectStack>
	//    2    4:invokevirtual   #177 <Method boolean Stack.isEmpty()>
	//    3    7:ireturn         
	}

	public boolean isListenerListEmpty()
	{
		return listenerList.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List listenerList>
	//    2    4:invokeinterface #179 <Method boolean List.isEmpty()>
	//    3    9:ireturn         
	}

	public Object peekObject()
	{
		return objectStack.peek();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Stack objectStack>
	//    2    4:invokevirtual   #183 <Method Object Stack.peek()>
	//    3    7:areturn         
	}

	public Object popObject()
	{
		return objectStack.pop();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Stack objectStack>
	//    2    4:invokevirtual   #187 <Method Object Stack.pop()>
	//    3    7:areturn         
	}

	public void pushObject(Object obj)
	{
		objectStack.push(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Stack objectStack>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #192 <Method Object Stack.push(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public boolean removeInPlayListener(InPlayListener inplaylistener)
	{
		return listenerList.remove(((Object) (inplaylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List listenerList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #197 <Method boolean List.remove(Object)>
	//    4   10:ireturn         
	}

	void setPropertiesMap(Map map)
	{
		propertiesMap = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field Map propertiesMap>
	//    3    5:return          
	}

	public String subst(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return OptionHelper.substVars(s, ((PropertyContainer) (this)), ((PropertyContainer) (context)));
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #40  <Field Context context>
	//    8   12:invokestatic    #206 <Method String OptionHelper.substVars(String, PropertyContainer, PropertyContainer)>
	//    9   15:areturn         
	}

	String updateLocationInfo(String s)
	{
		Locator locator = joranInterpreter.getLocator();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Interpreter joranInterpreter>
	//    2    4:invokevirtual   #158 <Method Locator Interpreter.getLocator()>
	//    3    7:astore_3        
		Object obj = ((Object) (s));
	//    4    8:aload_1         
	//    5    9:astore_2        
		if(locator != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          62
		{
			obj = ((Object) (new StringBuilder()));
	//    8   14:new             #67  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #68  <Method void StringBuilder()>
	//   11   21:astore_2        
			((StringBuilder) (obj)).append(s);
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
			((StringBuilder) (obj)).append(locator.getLineNumber());
	//   16   28:aload_2         
	//   17   29:aload_3         
	//   18   30:invokeinterface #213 <Method int Locator.getLineNumber()>
	//   19   35:invokevirtual   #216 <Method StringBuilder StringBuilder.append(int)>
	//   20   38:pop             
			((StringBuilder) (obj)).append(":");
	//   21   39:aload_2         
	//   22   40:ldc1            #218 <String ":">
	//   23   42:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
			((StringBuilder) (obj)).append(locator.getColumnNumber());
	//   25   46:aload_2         
	//   26   47:aload_3         
	//   27   48:invokeinterface #221 <Method int Locator.getColumnNumber()>
	//   28   53:invokevirtual   #216 <Method StringBuilder StringBuilder.append(int)>
	//   29   56:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   30   57:aload_2         
	//   31   58:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   32   61:astore_2        
		}
		return ((String) (obj));
	//   33   62:aload_2         
	//   34   63:areturn         
	}

	DefaultNestedComponentRegistry defaultNestedComponentRegistry;
	Interpreter joranInterpreter;
	final List listenerList = new ArrayList();
	Map objectMap;
	Stack objectStack;
	Map propertiesMap;
}
