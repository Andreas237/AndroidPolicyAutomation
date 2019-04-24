// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.OptionHelper;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.joran.spi:
//			RuleStore, ElementSelector, ElementPath

public class SimpleRuleStore extends ContextAwareBase
	implements RuleStore
{

	public SimpleRuleStore(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ContextAwareBase()>
		rules = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashMap()>
	//    6   12:putfield        #25  <Field HashMap rules>
		setContext(context);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #28  <Method void setContext(Context)>
	//   10   20:return          
	}

	private boolean isKleeneStar(String s)
	{
		return KLEENE_STAR.equals(((Object) (s)));
	//    0    0:getstatic       #32  <Field String KLEENE_STAR>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #38  <Method boolean String.equals(Object)>
	//    3    7:ireturn         
	}

	private boolean isSuffixPattern(ElementSelector elementselector)
	{
		int i = elementselector.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #46  <Method int ElementSelector.size()>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		boolean flag = flag1;
	//    5    8:iload           4
	//    6   10:istore_3        
		if(i > 1)
	//*   7   11:iload_2         
	//*   8   12:iconst_1        
	//*   9   13:icmple          35
		{
			flag = flag1;
	//   10   16:iload           4
	//   11   18:istore_3        
			if(elementselector.get(0).equals(((Object) (KLEENE_STAR))))
	//*  12   19:aload_1         
	//*  13   20:iconst_0        
	//*  14   21:invokevirtual   #50  <Method String ElementSelector.get(int)>
	//*  15   24:getstatic       #32  <Field String KLEENE_STAR>
	//*  16   27:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*  17   30:ifeq            35
				flag = true;
	//   18   33:iconst_1        
	//   19   34:istore_3        
		}
		return flag;
	//   20   35:iload_3         
	//   21   36:ireturn         
	}

	public void addRule(ElementSelector elementselector, Action action)
	{
		action.setContext(context);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field Context context>
	//    3    5:invokevirtual   #59  <Method void Action.setContext(Context)>
		List list = (List)rules.get(((Object) (elementselector)));
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field HashMap rules>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//    8   16:checkcast       #64  <Class List>
	//    9   19:astore          4
		Object obj = ((Object) (list));
	//   10   21:aload           4
	//   11   23:astore_3        
		if(list == null)
	//*  12   24:aload           4
	//*  13   26:ifnonnull       47
		{
			obj = ((Object) (new ArrayList()));
	//   14   29:new             #66  <Class ArrayList>
	//   15   32:dup             
	//   16   33:invokespecial   #67  <Method void ArrayList()>
	//   17   36:astore_3        
			rules.put(((Object) (elementselector)), obj);
	//   18   37:aload_0         
	//   19   38:getfield        #25  <Field HashMap rules>
	//   20   41:aload_1         
	//   21   42:aload_3         
	//   22   43:invokevirtual   #71  <Method Object HashMap.put(Object, Object)>
	//   23   46:pop             
		}
		((List) (obj)).add(((Object) (action)));
	//   24   47:aload_3         
	//   25   48:aload_2         
	//   26   49:invokeinterface #74  <Method boolean List.add(Object)>
	//   27   54:pop             
	//   28   55:return          
	}

	public void addRule(ElementSelector elementselector, String s)
	{
		Action action = (Action)OptionHelper.instantiateByClassName(s, ch/qos/logback/core/joran/action/Action, context);
	//    0    0:aload_2         
	//    1    1:ldc1            #58  <Class Action>
	//    2    3:aload_0         
	//    3    4:getfield        #56  <Field Context context>
	//    4    7:invokestatic    #83  <Method Object OptionHelper.instantiateByClassName(String, Class, Context)>
	//    5   10:checkcast       #58  <Class Action>
	//    6   13:astore_3        
		s = ((String) (action));
	//    7   14:aload_3         
	//    8   15:astore_2        
		break MISSING_BLOCK_LABEL_64;
	//    9   16:goto            64
		Exception exception;
		exception;
	//   10   19:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   20:new             #85  <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #86  <Method void StringBuilder()>
	//   14   27:astore          4
		stringbuilder.append("Could not instantiate class [");
	//   15   29:aload           4
	//   16   31:ldc1            #88  <String "Could not instantiate class [">
	//   17   33:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		stringbuilder.append(s);
	//   19   37:aload           4
	//   20   39:aload_2         
	//   21   40:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
		stringbuilder.append("]");
	//   23   44:aload           4
	//   24   46:ldc1            #94  <String "]">
	//   25   48:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		addError(stringbuilder.toString(), ((Throwable) (exception)));
	//   27   52:aload_0         
	//   28   53:aload           4
	//   29   55:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   30   58:aload_3         
	//   31   59:invokevirtual   #102 <Method void addError(String, Throwable)>
		s = null;
	//   32   62:aconst_null     
	//   33   63:astore_2        
		if(s != null)
	//*  34   64:aload_2         
	//*  35   65:ifnull          74
			addRule(elementselector, ((Action) (s)));
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:aload_2         
	//   39   71:invokevirtual   #104 <Method void addRule(ElementSelector, Action)>
		return;
	//   40   74:return          
	}

	List fullPathMatch(ElementPath elementpath)
	{
		for(Iterator iterator = rules.keySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field HashMap rules>
	//*   2    4:invokevirtual   #110 <Method Set HashMap.keySet()>
	//*   3    7:invokeinterface #116 <Method Iterator Set.iterator()>
	//*   4   12:astore_2        
	//*   5   13:aload_2         
	//*   6   14:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            52
		{
			ElementSelector elementselector = (ElementSelector)iterator.next();
	//    8   22:aload_2         
	//    9   23:invokeinterface #126 <Method Object Iterator.next()>
	//   10   28:checkcast       #42  <Class ElementSelector>
	//   11   31:astore_3        
			if(elementselector.fullPathMatch(elementpath))
	//*  12   32:aload_3         
	//*  13   33:aload_1         
	//*  14   34:invokevirtual   #129 <Method boolean ElementSelector.fullPathMatch(ElementPath)>
	//*  15   37:ifeq            13
				return (List)rules.get(((Object) (elementselector)));
	//   16   40:aload_0         
	//   17   41:getfield        #25  <Field HashMap rules>
	//   18   44:aload_3         
	//   19   45:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//   20   48:checkcast       #64  <Class List>
	//   21   51:areturn         
		}

		return null;
	//   22   52:aconst_null     
	//   23   53:areturn         
	}

	public List matchActions(ElementPath elementpath)
	{
		List list = fullPathMatch(elementpath);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #134 <Method List fullPathMatch(ElementPath)>
	//    3    5:astore_2        
		if(list != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          12
			return list;
	//    6   10:aload_2         
	//    7   11:areturn         
		list = suffixMatch(elementpath);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #137 <Method List suffixMatch(ElementPath)>
	//   11   17:astore_2        
		if(list != null)
	//*  12   18:aload_2         
	//*  13   19:ifnull          24
			return list;
	//   14   22:aload_2         
	//   15   23:areturn         
		list = prefixMatch(elementpath);
	//   16   24:aload_0         
	//   17   25:aload_1         
	//   18   26:invokevirtual   #140 <Method List prefixMatch(ElementPath)>
	//   19   29:astore_2        
		if(list != null)
	//*  20   30:aload_2         
	//*  21   31:ifnull          36
			return list;
	//   22   34:aload_2         
	//   23   35:areturn         
		elementpath = ((ElementPath) (middleMatch(elementpath)));
	//   24   36:aload_0         
	//   25   37:aload_1         
	//   26   38:invokevirtual   #143 <Method List middleMatch(ElementPath)>
	//   27   41:astore_1        
		if(elementpath != null)
	//*  28   42:aload_1         
	//*  29   43:ifnull          48
			return ((List) (elementpath));
	//   30   46:aload_1         
	//   31   47:areturn         
		else
			return null;
	//   32   48:aconst_null     
	//   33   49:areturn         
	}

	List middleMatch(ElementPath elementpath)
	{
		Iterator iterator = rules.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field HashMap rules>
	//    2    4:invokevirtual   #110 <Method Set HashMap.keySet()>
	//    3    7:invokeinterface #116 <Method Iterator Set.iterator()>
	//    4   12:astore          7
		ElementSelector elementselector = null;
	//    5   14:aconst_null     
	//    6   15:astore          4
		int j = 0;
	//    7   17:iconst_0        
	//    8   18:istore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   19:aload           7
	//   10   21:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//   11   26:ifeq            178
			ElementSelector elementselector1 = (ElementSelector)iterator.next();
	//   12   29:aload           7
	//   13   31:invokeinterface #126 <Method Object Iterator.next()>
	//   14   36:checkcast       #42  <Class ElementSelector>
	//   15   39:astore          6
			String s1 = elementselector1.peekLast();
	//   16   41:aload           6
	//   17   43:invokevirtual   #146 <Method String ElementSelector.peekLast()>
	//   18   46:astore          8
			String s;
			if(elementselector1.size() > 1)
	//*  19   48:aload           6
	//*  20   50:invokevirtual   #46  <Method int ElementSelector.size()>
	//*  21   53:iconst_1        
	//*  22   54:icmple          68
				s = elementselector1.get(0);
	//   23   57:aload           6
	//   24   59:iconst_0        
	//   25   60:invokevirtual   #50  <Method String ElementSelector.get(int)>
	//   26   63:astore          5
			else
	//*  27   65:goto            71
				s = null;
	//   28   68:aconst_null     
	//   29   69:astore          5
			if(isKleeneStar(s1) && isKleeneStar(s))
	//*  30   71:aload_0         
	//*  31   72:aload           8
	//*  32   74:invokespecial   #148 <Method boolean isKleeneStar(String)>
	//*  33   77:ifeq            19
	//*  34   80:aload_0         
	//*  35   81:aload           5
	//*  36   83:invokespecial   #148 <Method boolean isKleeneStar(String)>
	//*  37   86:ifeq            19
			{
				Object obj = ((Object) (elementselector1.getCopyOfPartList()));
	//   38   89:aload           6
	//   39   91:invokevirtual   #152 <Method List ElementSelector.getCopyOfPartList()>
	//   40   94:astore          5
				if(((List) (obj)).size() > 2)
	//*  41   96:aload           5
	//*  42   98:invokeinterface #153 <Method int List.size()>
	//*  43  103:iconst_2        
	//*  44  104:icmple          133
				{
					((List) (obj)).remove(0);
	//   45  107:aload           5
	//   46  109:iconst_0        
	//   47  110:invokeinterface #157 <Method Object List.remove(int)>
	//   48  115:pop             
					((List) (obj)).remove(((List) (obj)).size() - 1);
	//   49  116:aload           5
	//   50  118:aload           5
	//   51  120:invokeinterface #153 <Method int List.size()>
	//   52  125:iconst_1        
	//   53  126:isub            
	//   54  127:invokeinterface #157 <Method Object List.remove(int)>
	//   55  132:pop             
				}
				obj = ((Object) (new ElementSelector(((List) (obj)))));
	//   56  133:new             #42  <Class ElementSelector>
	//   57  136:dup             
	//   58  137:aload           5
	//   59  139:invokespecial   #160 <Method void ElementSelector(List)>
	//   60  142:astore          5
				int i;
				if(((ElementSelector) (obj)).isContainedIn(elementpath))
	//*  61  144:aload           5
	//*  62  146:aload_1         
	//*  63  147:invokevirtual   #163 <Method boolean ElementSelector.isContainedIn(ElementPath)>
	//*  64  150:ifeq            162
					i = ((ElementSelector) (obj)).size();
	//   65  153:aload           5
	//   66  155:invokevirtual   #46  <Method int ElementSelector.size()>
	//   67  158:istore_2        
				else
	//*  68  159:goto            164
					i = 0;
	//   69  162:iconst_0        
	//   70  163:istore_2        
				if(i > j)
	//*  71  164:iload_2         
	//*  72  165:iload_3         
	//*  73  166:icmple          19
				{
					elementselector = elementselector1;
	//   74  169:aload           6
	//   75  171:astore          4
					j = i;
	//   76  173:iload_2         
	//   77  174:istore_3        
				}
			}
		} while(true);
	//   78  175:goto            19
		if(elementselector != null)
	//*  79  178:aload           4
	//*  80  180:ifnull          196
			return (List)rules.get(((Object) (elementselector)));
	//   81  183:aload_0         
	//   82  184:getfield        #25  <Field HashMap rules>
	//   83  187:aload           4
	//   84  189:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//   85  192:checkcast       #64  <Class List>
	//   86  195:areturn         
		else
			return null;
	//   87  196:aconst_null     
	//   88  197:areturn         
	}

	List prefixMatch(ElementPath elementpath)
	{
		Iterator iterator = rules.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field HashMap rules>
	//    2    4:invokevirtual   #110 <Method Set HashMap.keySet()>
	//    3    7:invokeinterface #116 <Method Iterator Set.iterator()>
	//    4   12:astore          6
		ElementSelector elementselector = null;
	//    5   14:aconst_null     
	//    6   15:astore          4
		int i = 0;
	//    7   17:iconst_0        
	//    8   18:istore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   19:aload           6
	//   10   21:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//   11   26:ifeq            85
			ElementSelector elementselector1 = (ElementSelector)iterator.next();
	//   12   29:aload           6
	//   13   31:invokeinterface #126 <Method Object Iterator.next()>
	//   14   36:checkcast       #42  <Class ElementSelector>
	//   15   39:astore          5
			if(isKleeneStar(elementselector1.peekLast()))
	//*  16   41:aload_0         
	//*  17   42:aload           5
	//*  18   44:invokevirtual   #146 <Method String ElementSelector.peekLast()>
	//*  19   47:invokespecial   #148 <Method boolean isKleeneStar(String)>
	//*  20   50:ifeq            19
			{
				int j = elementselector1.getPrefixMatchLength(elementpath);
	//   21   53:aload           5
	//   22   55:aload_1         
	//   23   56:invokevirtual   #167 <Method int ElementSelector.getPrefixMatchLength(ElementPath)>
	//   24   59:istore_3        
				if(j == elementselector1.size() - 1 && j > i)
	//*  25   60:iload_3         
	//*  26   61:aload           5
	//*  27   63:invokevirtual   #46  <Method int ElementSelector.size()>
	//*  28   66:iconst_1        
	//*  29   67:isub            
	//*  30   68:icmpne          19
	//*  31   71:iload_3         
	//*  32   72:iload_2         
	//*  33   73:icmple          19
				{
					elementselector = elementselector1;
	//   34   76:aload           5
	//   35   78:astore          4
					i = j;
	//   36   80:iload_3         
	//   37   81:istore_2        
				}
			}
		} while(true);
	//   38   82:goto            19
		if(elementselector != null)
	//*  39   85:aload           4
	//*  40   87:ifnull          103
			return (List)rules.get(((Object) (elementselector)));
	//   41   90:aload_0         
	//   42   91:getfield        #25  <Field HashMap rules>
	//   43   94:aload           4
	//   44   96:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//   45   99:checkcast       #64  <Class List>
	//   46  102:areturn         
		else
			return null;
	//   47  103:aconst_null     
	//   48  104:areturn         
	}

	List suffixMatch(ElementPath elementpath)
	{
		Iterator iterator = rules.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field HashMap rules>
	//    2    4:invokevirtual   #110 <Method Set HashMap.keySet()>
	//    3    7:invokeinterface #116 <Method Iterator Set.iterator()>
	//    4   12:astore          6
		ElementSelector elementselector = null;
	//    5   14:aconst_null     
	//    6   15:astore          4
		int i = 0;
	//    7   17:iconst_0        
	//    8   18:istore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   19:aload           6
	//   10   21:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//   11   26:ifeq            71
			ElementSelector elementselector1 = (ElementSelector)iterator.next();
	//   12   29:aload           6
	//   13   31:invokeinterface #126 <Method Object Iterator.next()>
	//   14   36:checkcast       #42  <Class ElementSelector>
	//   15   39:astore          5
			if(isSuffixPattern(elementselector1))
	//*  16   41:aload_0         
	//*  17   42:aload           5
	//*  18   44:invokespecial   #169 <Method boolean isSuffixPattern(ElementSelector)>
	//*  19   47:ifeq            19
			{
				int j = elementselector1.getTailMatchLength(elementpath);
	//   20   50:aload           5
	//   21   52:aload_1         
	//   22   53:invokevirtual   #172 <Method int ElementSelector.getTailMatchLength(ElementPath)>
	//   23   56:istore_3        
				if(j > i)
	//*  24   57:iload_3         
	//*  25   58:iload_2         
	//*  26   59:icmple          19
				{
					elementselector = elementselector1;
	//   27   62:aload           5
	//   28   64:astore          4
					i = j;
	//   29   66:iload_3         
	//   30   67:istore_2        
				}
			}
		} while(true);
	//   31   68:goto            19
		if(elementselector != null)
	//*  32   71:aload           4
	//*  33   73:ifnull          89
			return (List)rules.get(((Object) (elementselector)));
	//   34   76:aload_0         
	//   35   77:getfield        #25  <Field HashMap rules>
	//   36   80:aload           4
	//   37   82:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//   38   85:checkcast       #64  <Class List>
	//   39   88:areturn         
		else
			return null;
	//   40   89:aconst_null     
	//   41   90:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #85  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("SimpleRuleStore ( ");
	//    4    8:aload_1         
	//    5    9:ldc1            #174 <String "SimpleRuleStore ( ">
	//    6   11:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("rules = ");
	//    8   15:aload_1         
	//    9   16:ldc1            #176 <String "rules = ">
	//   10   18:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(((Object) (rules)));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #25  <Field HashMap rules>
	//   15   27:invokevirtual   #179 <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
		stringbuilder.append("  ");
	//   17   31:aload_1         
	//   18   32:ldc1            #181 <String "  ">
	//   19   34:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(" )");
	//   21   38:aload_1         
	//   22   39:ldc1            #183 <String " )">
	//   23   41:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
		return stringbuilder.toString();
	//   25   45:aload_1         
	//   26   46:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   27   49:areturn         
	}

	static String KLEENE_STAR = "*";
	HashMap rules;

	static 
	{
	//    0    0:return          
	}
}
