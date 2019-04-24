// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser;

import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.css.parser.state.CommentEnd;
import com.itextpdf.tool.xml.css.parser.state.CommentInside;
import com.itextpdf.tool.xml.css.parser.state.CommentStart;
import com.itextpdf.tool.xml.css.parser.state.Properties;
import com.itextpdf.tool.xml.css.parser.state.Rule;
import com.itextpdf.tool.xml.css.parser.state.Unknown;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css.parser:
//			State

public class CssStateController
{

	public CssStateController(CssFile cssfile)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		css = cssfile;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field CssFile css>
	//    5    9:aload_0         
	//    6   10:invokestatic    #34  <Method CssUtils CssUtils.getInstance()>
	//    7   13:putfield        #36  <Field CssUtils utils>
	//    8   16:aload_0         
	//    9   17:new             #38  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #39  <Method void StringBuilder()>
	//   12   24:putfield        #41  <Field StringBuilder buffer>
	//   13   27:aload_0         
	//   14   28:new             #43  <Class CommentStart>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #46  <Method void CommentStart(CssStateController)>
	//   18   36:putfield        #48  <Field State commentStart>
	//   19   39:aload_0         
	//   20   40:new             #50  <Class CommentEnd>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:invokespecial   #51  <Method void CommentEnd(CssStateController)>
	//   24   48:putfield        #53  <Field State commentEnd>
	//   25   51:aload_0         
	//   26   52:new             #55  <Class CommentInside>
	//   27   55:dup             
	//   28   56:aload_0         
	//   29   57:invokespecial   #56  <Method void CommentInside(CssStateController)>
	//   30   60:putfield        #58  <Field State commentInside>
	//   31   63:aload_0         
	//   32   64:new             #60  <Class Unknown>
	//   33   67:dup             
	//   34   68:aload_0         
	//   35   69:invokespecial   #61  <Method void Unknown(CssStateController)>
	//   36   72:putfield        #63  <Field State unknown>
	//   37   75:aload_0         
	//   38   76:new             #65  <Class Properties>
	//   39   79:dup             
	//   40   80:aload_0         
	//   41   81:invokespecial   #66  <Method void Properties(CssStateController)>
	//   42   84:putfield        #68  <Field State properties>
	//   43   87:aload_0         
	//   44   88:new             #70  <Class Rule>
	//   45   91:dup             
	//   46   92:aload_0         
	//   47   93:invokespecial   #71  <Method void Rule(CssStateController)>
	//   48   96:putfield        #73  <Field State rule>
		current = unknown;
	//   49   99:aload_0         
	//   50  100:aload_0         
	//   51  101:getfield        #63  <Field State unknown>
	//   52  104:putfield        #75  <Field State current>
	//   53  107:return          
	}

	private void processProps(String s)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		String as[] = s.split(";");
	//    2    2:aload_1         
	//    3    3:ldc1            #80  <String ";">
	//    4    5:invokevirtual   #86  <Method String[] String.split(String)>
	//    5    8:astore          5
		s = ((String) (new LinkedHashMap()));
	//    6   10:new             #88  <Class LinkedHashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #89  <Method void LinkedHashMap()>
	//    9   17:astore_1        
		int k = as.length;
	//   10   18:aload           5
	//   11   20:arraylength     
	//   12   21:istore          4
		for(int i = 0; i < k; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:iload           4
	//*  17   28:icmpge          85
		{
			String as1[] = as[i].split(":");
	//   18   31:aload           5
	//   19   33:iload_2         
	//   20   34:aaload          
	//   21   35:ldc1            #91  <String ":">
	//   22   37:invokevirtual   #86  <Method String[] String.split(String)>
	//   23   40:astore          6
			if(as1.length == 2)
	//*  24   42:aload           6
	//*  25   44:arraylength     
	//*  26   45:iconst_2        
	//*  27   46:icmpne          78
				((Map) (s)).put(((Object) (utils.stripDoubleSpacesTrimAndToLowerCase(as1[0]))), ((Object) (utils.stripDoubleSpacesAndTrim(as1[1]))));
	//   28   49:aload_1         
	//   29   50:aload_0         
	//   30   51:getfield        #36  <Field CssUtils utils>
	//   31   54:aload           6
	//   32   56:iconst_0        
	//   33   57:aaload          
	//   34   58:invokevirtual   #95  <Method String CssUtils.stripDoubleSpacesTrimAndToLowerCase(String)>
	//   35   61:aload_0         
	//   36   62:getfield        #36  <Field CssUtils utils>
	//   37   65:aload           6
	//   38   67:iconst_1        
	//   39   68:aaload          
	//   40   69:invokevirtual   #98  <Method String CssUtils.stripDoubleSpacesAndTrim(String)>
	//   41   72:invokeinterface #104 <Method Object Map.put(Object, Object)>
	//   42   77:pop             
		}

	//   43   78:iload_2         
	//   44   79:iconst_1        
	//   45   80:iadd            
	//   46   81:istore_2        
	//*  47   82:goto            25
		int j;
		String s1;
		if(currentSelector.contains(","))
	//*  48   85:aload_0         
	//*  49   86:getfield        #106 <Field String currentSelector>
	//*  50   89:ldc1            #108 <String ",">
	//*  51   91:invokevirtual   #112 <Method boolean String.contains(CharSequence)>
	//*  52   94:ifeq            197
		{
			as = currentSelector.split(",");
	//   53   97:aload_0         
	//   54   98:getfield        #106 <Field String currentSelector>
	//   55  101:ldc1            #108 <String ",">
	//   56  103:invokevirtual   #86  <Method String[] String.split(String)>
	//   57  106:astore          5
			j = 0;
	//   58  108:iconst_0        
	//   59  109:istore_2        
		} else
	//*  60  110:iload_2         
	//*  61  111:aload           5
	//*  62  113:arraylength     
	//*  63  114:icmpge          150
	//*  64  117:aload           5
	//*  65  119:iload_2         
	//*  66  120:aload_0         
	//*  67  121:getfield        #36  <Field CssUtils utils>
	//*  68  124:aload           5
	//*  69  126:iload_2         
	//*  70  127:aaload          
	//*  71  128:invokevirtual   #98  <Method String CssUtils.stripDoubleSpacesAndTrim(String)>
	//*  72  131:aastore         
	//*  73  132:aload           5
	//*  74  134:iload_2         
	//*  75  135:aaload          
	//*  76  136:invokevirtual   #116 <Method int String.length()>
	//*  77  139:ifne            143
	//*  78  142:return          
	//*  79  143:iload_2         
	//*  80  144:iconst_1        
	//*  81  145:iadd            
	//*  82  146:istore_2        
	//*  83  147:goto            110
	//*  84  150:aload           5
	//*  85  152:arraylength     
	//*  86  153:istore          4
	//*  87  155:iload_3         
	//*  88  156:istore_2        
	//*  89  157:iload_2         
	//*  90  158:iload           4
	//*  91  160:icmpge          142
	//*  92  163:aload           5
	//*  93  165:iload_2         
	//*  94  166:aaload          
	//*  95  167:astore          6
	//*  96  169:aload_0         
	//*  97  170:getfield        #28  <Field CssFile css>
	//*  98  173:aload           6
	//*  99  175:aload_1         
	//* 100  176:invokeinterface #122 <Method boolean CssFile.add(String, Map)>
	//* 101  181:ifne            190
	//* 102  184:aload_1         
	//* 103  185:invokeinterface #125 <Method void Map.clear()>
	//* 104  190:iload_2         
	//* 105  191:iconst_1        
	//* 106  192:iadd            
	//* 107  193:istore_2        
	//* 108  194:goto            157
		{
			css.add(utils.stripDoubleSpacesAndTrim(currentSelector), ((Map) (s)));
	//  109  197:aload_0         
	//  110  198:getfield        #28  <Field CssFile css>
	//  111  201:aload_0         
	//  112  202:getfield        #36  <Field CssUtils utils>
	//  113  205:aload_0         
	//  114  206:getfield        #106 <Field String currentSelector>
	//  115  209:invokevirtual   #98  <Method String CssUtils.stripDoubleSpacesAndTrim(String)>
	//  116  212:aload_1         
	//  117  213:invokeinterface #122 <Method boolean CssFile.add(String, Map)>
	//  118  218:pop             
			return;
	//  119  219:return          
		}
		if(j >= as.length)
			break MISSING_BLOCK_LABEL_150;
		as[j] = utils.stripDoubleSpacesAndTrim(as[j]);
		if(as[j].length() != 0) goto _L2; else goto _L1
_L1:
		return;
_L2:
		j++;
		break MISSING_BLOCK_LABEL_110;
		k = as.length;
		j = ((int) (flag));
		while(j < k) 
		{
			s1 = as[j];
			if(!css.add(s1, ((Map) (s))))
				((Map) (s)).clear();
			j++;
		}
		if(true) goto _L1; else goto _L3
_L3:
	}

	private void setPrevious()
	{
		previous = current;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #75  <Field State current>
	//    3    5:putfield        #128 <Field State previous>
	//    4    8:return          
	}

	private void setState(State state)
	{
		current = state;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field State current>
	//    3    5:return          
	}

	public void append(char c)
	{
		buffer.append(c);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field StringBuilder buffer>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #135 <Method StringBuilder StringBuilder.append(char)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void previous()
	{
		current = previous;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field State previous>
	//    3    5:putfield        #75  <Field State current>
	//    4    8:return          
	}

	public void process(char c)
	{
		current.process(c);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field State current>
	//    2    4:iload_1         
	//    3    5:invokeinterface #140 <Method void State.process(char)>
	//    4   10:return          
	}

	public void stateCommentEnd()
	{
		setState(commentEnd);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #53  <Field State commentEnd>
	//    3    5:invokespecial   #143 <Method void setState(State)>
	//    4    8:return          
	}

	public void stateCommentInside()
	{
		setState(commentInside);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field State commentInside>
	//    3    5:invokespecial   #143 <Method void setState(State)>
	//    4    8:return          
	}

	public void stateCommentStart()
	{
		setPrevious();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void setPrevious()>
		setState(commentStart);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field State commentStart>
	//    5    9:invokespecial   #143 <Method void setState(State)>
	//    6   12:return          
	}

	public void stateProperties()
	{
		previous = current;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #75  <Field State current>
	//    3    5:putfield        #128 <Field State previous>
		setState(properties);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #68  <Field State properties>
	//    7   13:invokespecial   #143 <Method void setState(State)>
	//    8   16:return          
	}

	public void stateRule()
	{
		setState(rule);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field State rule>
	//    3    5:invokespecial   #143 <Method void setState(State)>
	//    4    8:return          
	}

	public void stateUnknown()
	{
		setState(unknown);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field State unknown>
	//    3    5:invokespecial   #143 <Method void setState(State)>
	//    4    8:return          
	}

	public void storeProperties()
	{
		processProps(buffer.toString());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field StringBuilder buffer>
	//    3    5:invokevirtual   #155 <Method String StringBuilder.toString()>
	//    4    8:invokespecial   #157 <Method void processProps(String)>
		buffer.setLength(0);
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field StringBuilder buffer>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #161 <Method void StringBuilder.setLength(int)>
	//    9   19:return          
	}

	public void storeSelector()
	{
		currentSelector = buffer.toString();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field StringBuilder buffer>
	//    3    5:invokevirtual   #155 <Method String StringBuilder.toString()>
	//    4    8:putfield        #106 <Field String currentSelector>
		buffer.setLength(0);
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field StringBuilder buffer>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #161 <Method void StringBuilder.setLength(int)>
	//    9   19:return          
	}

	private final StringBuilder buffer = new StringBuilder();
	private final State commentEnd = new CommentEnd(this);
	private final State commentInside = new CommentInside(this);
	private final State commentStart = new CommentStart(this);
	private final CssFile css;
	private State current;
	private String currentSelector;
	private State previous;
	private final State properties = new Properties(this);
	private final State rule = new Rule(this);
	private final State unknown = new Unknown(this);
	private final CssUtils utils = CssUtils.getInstance();
}
