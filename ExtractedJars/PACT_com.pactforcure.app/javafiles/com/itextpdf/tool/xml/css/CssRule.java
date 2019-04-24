// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssSelector

public class CssRule
	implements Comparable
{

	public CssRule(List list, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		selector = new CssSelector(list);
	//    2    4:aload_0         
	//    3    5:new             #34  <Class CssSelector>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #37  <Method void CssSelector(List)>
	//    7   13:putfield        #39  <Field CssSelector selector>
		normalDeclarations = map;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #41  <Field Map normalDeclarations>
		importantDeclarations = ((Map) (new LinkedHashMap()));
	//   11   21:aload_0         
	//   12   22:new             #43  <Class LinkedHashMap>
	//   13   25:dup             
	//   14   26:invokespecial   #44  <Method void LinkedHashMap()>
	//   15   29:putfield        #46  <Field Map importantDeclarations>
		list = ((List) (normalDeclarations.entrySet().iterator()));
	//   16   32:aload_0         
	//   17   33:getfield        #41  <Field Map normalDeclarations>
	//   18   36:invokeinterface #52  <Method Set Map.entrySet()>
	//   19   41:invokeinterface #58  <Method Iterator Set.iterator()>
	//   20   46:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   21   47:aload_1         
	//   22   48:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            142
			map = ((Map) ((java.util.Map.Entry)((Iterator) (list)).next()));
	//   24   56:aload_1         
	//   25   57:invokeinterface #68  <Method Object Iterator.next()>
	//   26   62:checkcast       #70  <Class java.util.Map$Entry>
	//   27   65:astore_2        
			int i = ((String)((java.util.Map.Entry) (map)).getValue()).indexOf('!');
	//   28   66:aload_2         
	//   29   67:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//   30   72:checkcast       #75  <Class String>
	//   31   75:bipush          33
	//   32   77:invokevirtual   #79  <Method int String.indexOf(int)>
	//   33   80:istore_3        
			if(i > 0 && importantMatcher.matcher((CharSequence)((java.util.Map.Entry) (map)).getValue()).matches())
	//*  34   81:iload_3         
	//*  35   82:ifle            47
	//*  36   85:getstatic       #27  <Field Pattern importantMatcher>
	//*  37   88:aload_2         
	//*  38   89:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//*  39   94:checkcast       #81  <Class CharSequence>
	//*  40   97:invokevirtual   #85  <Method Matcher Pattern.matcher(CharSequence)>
	//*  41  100:invokevirtual   #90  <Method boolean Matcher.matches()>
	//*  42  103:ifeq            47
				importantDeclarations.put(((java.util.Map.Entry) (map)).getKey(), ((Object) (((String)((java.util.Map.Entry) (map)).getValue()).substring(0, i).trim())));
	//   43  106:aload_0         
	//   44  107:getfield        #46  <Field Map importantDeclarations>
	//   45  110:aload_2         
	//   46  111:invokeinterface #93  <Method Object java.util.Map$Entry.getKey()>
	//   47  116:aload_2         
	//   48  117:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//   49  122:checkcast       #75  <Class String>
	//   50  125:iconst_0        
	//   51  126:iload_3         
	//   52  127:invokevirtual   #97  <Method String String.substring(int, int)>
	//   53  130:invokevirtual   #101 <Method String String.trim()>
	//   54  133:invokeinterface #105 <Method Object Map.put(Object, Object)>
	//   55  138:pop             
		} while(true);
	//   56  139:goto            47
		for(list = ((List) (importantDeclarations.keySet().iterator())); ((Iterator) (list)).hasNext(); normalDeclarations.remove(((Object) (map))))
	//*  57  142:aload_0         
	//*  58  143:getfield        #46  <Field Map importantDeclarations>
	//*  59  146:invokeinterface #108 <Method Set Map.keySet()>
	//*  60  151:invokeinterface #58  <Method Iterator Set.iterator()>
	//*  61  156:astore_1        
	//*  62  157:aload_1         
	//*  63  158:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*  64  163:ifeq            190
			map = ((Map) ((String)((Iterator) (list)).next()));
	//   65  166:aload_1         
	//   66  167:invokeinterface #68  <Method Object Iterator.next()>
	//   67  172:checkcast       #75  <Class String>
	//   68  175:astore_2        

	//   69  176:aload_0         
	//   70  177:getfield        #41  <Field Map normalDeclarations>
	//   71  180:aload_2         
	//   72  181:invokeinterface #112 <Method Object Map.remove(Object)>
	//   73  186:pop             
	//*  74  187:goto            157
	//   75  190:return          
	}

	public int compareTo(CssRule cssrule)
	{
		return selector.calculateSpecifity() - cssrule.selector.calculateSpecifity();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field CssSelector selector>
	//    2    4:invokevirtual   #120 <Method int CssSelector.calculateSpecifity()>
	//    3    7:aload_1         
	//    4    8:getfield        #39  <Field CssSelector selector>
	//    5   11:invokevirtual   #120 <Method int CssSelector.calculateSpecifity()>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((CssRule)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class CssRule>
	//    3    5:invokevirtual   #123 <Method int compareTo(CssRule)>
	//    4    8:ireturn         
	}

	public Map getImportantDeclarations()
	{
		return importantDeclarations;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map importantDeclarations>
	//    2    4:areturn         
	}

	public Map getNormalDeclarations()
	{
		return normalDeclarations;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Map normalDeclarations>
	//    2    4:areturn         
	}

	public CssSelector getSelector()
	{
		return selector;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field CssSelector selector>
	//    2    4:areturn         
	}

	public String toString()
	{
		return String.format("%s { count: %d } #spec:%d", new Object[] {
			selector.toString(), Integer.valueOf(normalDeclarations.size() + importantDeclarations.size()), Integer.valueOf(selector.calculateSpecifity())
		});
	//    0    0:ldc1            #132 <String "%s { count: %d } #spec:%d">
	//    1    2:iconst_3        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #39  <Field CssSelector selector>
	//    7   12:invokevirtual   #134 <Method String CssSelector.toString()>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #41  <Field Map normalDeclarations>
	//   13   22:invokeinterface #137 <Method int Map.size()>
	//   14   27:aload_0         
	//   15   28:getfield        #46  <Field Map importantDeclarations>
	//   16   31:invokeinterface #137 <Method int Map.size()>
	//   17   36:iadd            
	//   18   37:invokestatic    #143 <Method Integer Integer.valueOf(int)>
	//   19   40:aastore         
	//   20   41:dup             
	//   21   42:iconst_2        
	//   22   43:aload_0         
	//   23   44:getfield        #39  <Field CssSelector selector>
	//   24   47:invokevirtual   #120 <Method int CssSelector.calculateSpecifity()>
	//   25   50:invokestatic    #143 <Method Integer Integer.valueOf(int)>
	//   26   53:aastore         
	//   27   54:invokestatic    #147 <Method String String.format(String, Object[])>
	//   28   57:areturn         
	}

	private static final Pattern importantMatcher = Pattern.compile(".*!\\s*important$");
	private Map importantDeclarations;
	private Map normalDeclarations;
	private CssSelector selector;

	static 
	{
	//    0    0:ldc1            #19  <String ".*!\\s*important$">
	//    1    2:invokestatic    #25  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #27  <Field Pattern importantMatcher>
	//*   3    8:return          
	}
}
