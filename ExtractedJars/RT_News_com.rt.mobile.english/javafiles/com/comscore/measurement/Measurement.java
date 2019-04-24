// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.measurement;

import com.comscore.analytics.Core;
import com.comscore.utils.Constants;
import com.comscore.utils.Date;
import java.util.*;

// Referenced classes of package com.comscore.measurement:
//			Label, PrivilegedLabel

public class Measurement
{

	protected Measurement(Core core)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void HashMap()>
	//    6   12:putfield        #21  <Field HashMap a>
		setPixelURL(core.getPixelURL());
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #27  <Method String Core.getPixelURL()>
	//   10   20:invokevirtual   #31  <Method void setPixelURL(String)>
		c = Date.unixTime();
	//   11   23:aload_0         
	//   12   24:invokestatic    #37  <Method long Date.unixTime()>
	//   13   27:putfield        #39  <Field long c>
	//   14   30:return          
	}

	protected Boolean a(String s, long l)
	{
		return a(s, Long.toString(l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #47  <Method String Long.toString(long)>
	//    4    6:invokevirtual   #50  <Method Boolean a(String, String)>
	//    5    9:areturn         
	}

	protected Boolean a(String s, String s1)
	{
		s = ((String) ((Label)a.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field HashMap a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #56  <Class Label>
	//    5   11:astore_1        
		boolean flag;
		if(s != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          30
			flag = ((Label) (s)).value.equals(((Object) (s1)));
	//    8   16:aload_1         
	//    9   17:getfield        #59  <Field String Label.value>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #65  <Method boolean String.equals(Object)>
	//   12   24:istore_3        
		else
	//*  13   25:iload_3         
	//*  14   26:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//*  15   29:areturn         
			flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_3        
		return Boolean.valueOf(flag);
	//*  18   32:goto            25
	}

	protected void a(Label label)
	{
		if(a.get(((Object) (label.name))) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field HashMap a>
	//*   2    4:aload_1         
	//*   3    5:getfield        #75  <Field String Label.name>
	//*   4    8:invokevirtual   #54  <Method Object HashMap.get(Object)>
	//*   5   11:ifnonnull       27
			a.put(((Object) (label.name)), ((Object) (label)));
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field HashMap a>
	//    8   18:aload_1         
	//    9   19:getfield        #75  <Field String Label.name>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #79  <Method Object HashMap.put(Object, Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	protected void a(String s, String s1, Boolean boolean1, Boolean boolean2)
	{
		if(boolean2.booleanValue())
	//*   0    0:aload           4
	//*   1    2:invokevirtual   #84  <Method boolean Boolean.booleanValue()>
	//*   2    5:ifeq            25
			s = ((String) (new PrivilegedLabel(s, s1, boolean1)));
	//    3    8:new             #86  <Class PrivilegedLabel>
	//    4   11:dup             
	//    5   12:aload_1         
	//    6   13:aload_2         
	//    7   14:aload_3         
	//    8   15:invokespecial   #89  <Method void PrivilegedLabel(String, String, Boolean)>
	//    9   18:astore_1        
		else
	//*  10   19:aload_0         
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #91  <Method void a(Label)>
	//*  13   24:return          
			s = ((String) (new Label(s, s1, boolean1)));
	//   14   25:new             #56  <Class Label>
	//   15   28:dup             
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:aload_3         
	//   19   32:invokespecial   #92  <Method void Label(String, String, Boolean)>
	//   20   35:astore_1        
		a(((Label) (s)));
	//*  21   36:goto            19
	}

	protected void a(HashMap hashmap)
	{
		a(hashmap, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #96  <Method void a(HashMap, boolean)>
	//    4    6:return          
	}

	protected void a(HashMap hashmap, boolean flag)
	{
		if(hashmap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          56
		{
			String s;
			for(Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); setLabel(s, (String)hashmap.get(((Object) (s))), Boolean.valueOf(flag)))
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #102 <Method Set HashMap.keySet()>
	//*   4    8:invokeinterface #108 <Method Iterator Set.iterator()>
	//*   5   13:astore_3        
	//*   6   14:aload_3         
	//*   7   15:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//*   8   20:ifeq            56
				s = (String)iterator.next();
	//    9   23:aload_3         
	//   10   24:invokeinterface #117 <Method Object Iterator.next()>
	//   11   29:checkcast       #61  <Class String>
	//   12   32:astore          4

	//   13   34:aload_0         
	//   14   35:aload           4
	//   15   37:aload_1         
	//   16   38:aload           4
	//   17   40:invokevirtual   #54  <Method Object HashMap.get(Object)>
	//   18   43:checkcast       #61  <Class String>
	//   19   46:iload_2         
	//   20   47:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//   21   50:invokevirtual   #120 <Method void setLabel(String, String, Boolean)>
		}
	//*  22   53:goto            14
	//   23   56:return          
	}

	protected void b(String s, String s1, Boolean boolean1, Boolean boolean2)
	{
		removeLabel(s, boolean1, boolean2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #125 <Method void removeLabel(String, Boolean, Boolean)>
		a(s, s1, boolean1, boolean2);
	//    5    8:aload_0         
	//    6    9:aload_1         
	//    7   10:aload_2         
	//    8   11:aload_3         
	//    9   12:aload           4
	//   10   14:invokevirtual   #127 <Method void a(String, String, Boolean, Boolean)>
	//   11   17:return          
	}

	public Label getLabel(String s)
	{
		return (Label)a.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field HashMap a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #56  <Class Label>
	//    5   11:areturn         
	}

	public String getPixelURL()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field String b>
	//    2    4:areturn         
	}

	public Boolean hasLabel(String s)
	{
		return Boolean.valueOf(a.containsKey(((Object) (s))));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field HashMap a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method boolean HashMap.containsKey(Object)>
	//    4    8:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//    5   11:areturn         
	}

	public void removeLabel(String s, Boolean boolean1, Boolean boolean2)
	{
		Label label = (Label)a.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field HashMap a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #56  <Class Label>
	//    5   11:astore          4
		if(label != null && (!(label instanceof PrivilegedLabel) || boolean2.booleanValue() || boolean1.booleanValue()))
	//*   6   13:aload           4
	//*   7   15:ifnull          49
	//*   8   18:aload           4
	//*   9   20:instanceof      #86  <Class PrivilegedLabel>
	//*  10   23:ifeq            40
	//*  11   26:aload_3         
	//*  12   27:invokevirtual   #84  <Method boolean Boolean.booleanValue()>
	//*  13   30:ifne            40
	//*  14   33:aload_2         
	//*  15   34:invokevirtual   #84  <Method boolean Boolean.booleanValue()>
	//*  16   37:ifeq            49
			a.remove(((Object) (s)));
	//   17   40:aload_0         
	//   18   41:getfield        #21  <Field HashMap a>
	//   19   44:aload_1         
	//   20   45:invokevirtual   #139 <Method Object HashMap.remove(Object)>
	//   21   48:pop             
	//   22   49:return          
	}

	public String retrieveLabelsAsString(String as[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #143 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #144 <Method void StringBuilder()>
	//    3    7:astore          4
		HashMap hashmap = new HashMap(((Map) (a)));
	//    4    9:new             #18  <Class HashMap>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:getfield        #21  <Field HashMap a>
	//    8   17:invokespecial   #147 <Method void HashMap(Map)>
	//    9   20:astore          5
		int k = as.length;
	//   10   22:aload_1         
	//   11   23:arraylength     
	//   12   24:istore_3        
		for(int i = 0; i < k; i++)
	//*  13   25:iconst_0        
	//*  14   26:istore_2        
	//*  15   27:iload_2         
	//*  16   28:iload_3         
	//*  17   29:icmpge          84
		{
			String s = as[i];
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:aaload          
	//   21   35:astore          6
			Label label = (Label)((Map) (hashmap)).get(((Object) (s)));
	//   22   37:aload           5
	//   23   39:aload           6
	//   24   41:invokeinterface #150 <Method Object Map.get(Object)>
	//   25   46:checkcast       #56  <Class Label>
	//   26   49:astore          7
			if(label != null)
	//*  27   51:aload           7
	//*  28   53:ifnull          77
			{
				stringbuilder.append(label.pack());
	//   29   56:aload           4
	//   30   58:aload           7
	//   31   60:invokevirtual   #153 <Method String Label.pack()>
	//   32   63:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
				((Map) (hashmap)).remove(((Object) (s)));
	//   34   67:aload           5
	//   35   69:aload           6
	//   36   71:invokeinterface #158 <Method Object Map.remove(Object)>
	//   37   76:pop             
			}
		}

	//   38   77:iload_2         
	//   39   78:iconst_1        
	//   40   79:iadd            
	//   41   80:istore_2        
	//*  42   81:goto            27
		if(as != Constants.LABELS_ORDER)
	//*  43   84:aload_1         
	//*  44   85:getstatic       #164 <Field String[] Constants.LABELS_ORDER>
	//*  45   88:if_acmpeq       157
		{
			as = Constants.LABELS_ORDER;
	//   46   91:getstatic       #164 <Field String[] Constants.LABELS_ORDER>
	//   47   94:astore_1        
			int l = as.length;
	//   48   95:aload_1         
	//   49   96:arraylength     
	//   50   97:istore_3        
			for(int j = 0; j < l; j++)
	//*  51   98:iconst_0        
	//*  52   99:istore_2        
	//*  53  100:iload_2         
	//*  54  101:iload_3         
	//*  55  102:icmpge          157
			{
				String s1 = as[j];
	//   56  105:aload_1         
	//   57  106:iload_2         
	//   58  107:aaload          
	//   59  108:astore          6
				Label label1 = (Label)((Map) (hashmap)).get(((Object) (s1)));
	//   60  110:aload           5
	//   61  112:aload           6
	//   62  114:invokeinterface #150 <Method Object Map.get(Object)>
	//   63  119:checkcast       #56  <Class Label>
	//   64  122:astore          7
				if(label1 != null)
	//*  65  124:aload           7
	//*  66  126:ifnull          150
				{
					stringbuilder.append(label1.pack());
	//   67  129:aload           4
	//   68  131:aload           7
	//   69  133:invokevirtual   #153 <Method String Label.pack()>
	//   70  136:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   71  139:pop             
					((Map) (hashmap)).remove(((Object) (s1)));
	//   72  140:aload           5
	//   73  142:aload           6
	//   74  144:invokeinterface #158 <Method Object Map.remove(Object)>
	//   75  149:pop             
				}
			}

	//   76  150:iload_2         
	//   77  151:iconst_1        
	//   78  152:iadd            
	//   79  153:istore_2        
		}
	//*  80  154:goto            100
		for(as = ((String []) (((Map) (hashmap)).values().iterator())); ((Iterator) (as)).hasNext(); stringbuilder.append(((Label)((Iterator) (as)).next()).pack()));
	//   81  157:aload           5
	//   82  159:invokeinterface #168 <Method Collection Map.values()>
	//   83  164:invokeinterface #171 <Method Iterator Collection.iterator()>
	//   84  169:astore_1        
	//   85  170:aload_1         
	//   86  171:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//   87  176:ifeq            200
	//   88  179:aload           4
	//   89  181:aload_1         
	//   90  182:invokeinterface #117 <Method Object Iterator.next()>
	//   91  187:checkcast       #56  <Class Label>
	//   92  190:invokevirtual   #153 <Method String Label.pack()>
	//   93  193:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   94  196:pop             
	//*  95  197:goto            170
		if(stringbuilder.length() > 0 && stringbuilder.charAt(0) == '&')
	//*  96  200:aload           4
	//*  97  202:invokevirtual   #175 <Method int StringBuilder.length()>
	//*  98  205:ifle            226
	//*  99  208:aload           4
	//* 100  210:iconst_0        
	//* 101  211:invokevirtual   #179 <Method char StringBuilder.charAt(int)>
	//* 102  214:bipush          38
	//* 103  216:icmpne          226
			return stringbuilder.substring(1);
	//  104  219:aload           4
	//  105  221:iconst_1        
	//  106  222:invokevirtual   #183 <Method String StringBuilder.substring(int)>
	//  107  225:areturn         
		else
			return stringbuilder.toString();
	//  108  226:aload           4
	//  109  228:invokevirtual   #185 <Method String StringBuilder.toString()>
	//  110  231:areturn         
	}

	public void setLabel(Label label)
	{
		removeLabel(label.name, label.aggregate, Boolean.valueOf(label instanceof PrivilegedLabel));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #75  <Field String Label.name>
	//    3    5:aload_1         
	//    4    6:getfield        #189 <Field Boolean Label.aggregate>
	//    5    9:aload_1         
	//    6   10:instanceof      #86  <Class PrivilegedLabel>
	//    7   13:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//    8   16:invokevirtual   #125 <Method void removeLabel(String, Boolean, Boolean)>
		a(label);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #91  <Method void a(Label)>
	//   12   24:return          
	}

	public void setLabel(String s, String s1)
	{
		setLabel(s, s1, Boolean.valueOf(false));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//    5    7:invokevirtual   #120 <Method void setLabel(String, String, Boolean)>
	//    6   10:return          
	}

	public void setLabel(String s, String s1, Boolean boolean1)
	{
		removeLabel(s, boolean1, Boolean.valueOf(false));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//    5    7:invokevirtual   #125 <Method void removeLabel(String, Boolean, Boolean)>
		a(s, s1, boolean1, Boolean.valueOf(false));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:iconst_0        
	//   11   15:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//   12   18:invokevirtual   #127 <Method void a(String, String, Boolean, Boolean)>
	//   13   21:return          
	}

	public void setPixelURL(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field String b>
	//    3    5:return          
	}

	protected HashMap a;
	protected String b;
	protected long c;
}
