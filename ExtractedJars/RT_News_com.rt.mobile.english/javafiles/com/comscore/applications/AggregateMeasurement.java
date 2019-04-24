// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.applications;

import com.comscore.analytics.Core;
import com.comscore.measurement.Label;
import java.util.*;

// Referenced classes of package com.comscore.applications:
//			ApplicationMeasurement, EventType

public class AggregateMeasurement extends ApplicationMeasurement
{

	protected AggregateMeasurement(Core core, EventType eventtype, String s)
	{
		super(core, eventtype, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #8   <Method void ApplicationMeasurement(Core, EventType, String)>
	//    5    7:return          
	}

	private Boolean a(String s)
	{
		for(int i = 0; i < s.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #17  <Method int String.length()>
	//*   5    7:icmpge          59
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #19  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #22  <Method void StringBuilder()>
	//    9   17:astore_3        
			stringbuilder.append("");
	//   10   18:aload_3         
	//   11   19:ldc1            #24  <String "">
	//   12   21:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			stringbuilder.append(s.charAt(i));
	//   14   25:aload_3         
	//   15   26:aload_1         
	//   16   27:iload_2         
	//   17   28:invokevirtual   #32  <Method char String.charAt(int)>
	//   18   31:invokevirtual   #35  <Method StringBuilder StringBuilder.append(char)>
	//   19   34:pop             
			if(!"0123456789".contains(((CharSequence) (stringbuilder.toString()))))
	//*  20   35:ldc1            #37  <String "0123456789">
	//*  21   37:aload_3         
	//*  22   38:invokevirtual   #41  <Method String StringBuilder.toString()>
	//*  23   41:invokevirtual   #45  <Method boolean String.contains(CharSequence)>
	//*  24   44:ifne            52
				return Boolean.valueOf(false);
	//   25   47:iconst_0        
	//   26   48:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   27   51:areturn         
		}

	//   28   52:iload_2         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_2        
	//*  32   56:goto            2
		return Boolean.valueOf(true);
	//   33   59:iconst_1        
	//   34   60:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   35   63:areturn         
	}

	private Boolean b(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return Boolean.valueOf(false);
	//    2    4:iconst_0        
	//    3    5:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:areturn         
		if(!s.contains(","))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #54  <String ",">
	//*   7   12:invokevirtual   #45  <Method boolean String.contains(CharSequence)>
	//*   8   15:ifne            23
			return Boolean.valueOf(false);
	//    9   18:iconst_0        
	//   10   19:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   11   22:areturn         
		if(!s.contains(" "))
	//*  12   23:aload_1         
	//*  13   24:ldc1            #56  <String " ">
	//*  14   26:invokevirtual   #45  <Method boolean String.contains(CharSequence)>
	//*  15   29:ifne            37
			return Boolean.valueOf(true);
	//   16   32:iconst_1        
	//   17   33:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   18   36:areturn         
		else
			return Boolean.valueOf(false);
	//   19   37:iconst_0        
	//   20   38:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   21   41:areturn         
	}

	private Boolean b(String s, String s1)
	{
		return Boolean.valueOf(s.contains(((CharSequence) (s1))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #45  <Method boolean String.contains(CharSequence)>
	//    3    5:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:areturn         
	}

	private String c(String s, String s1)
	{
		s1 = ((String) (new StringBuilder(s1)));
	//    0    0:new             #19  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #62  <Method void StringBuilder(String)>
	//    4    8:astore_2        
		for(s = ((String) (c(s).iterator())); ((Iterator) (s)).hasNext();)
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:invokespecial   #65  <Method List c(String)>
	//*   8   14:invokeinterface #71  <Method Iterator List.iterator()>
	//*   9   19:astore_1        
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*  12   26:ifeq            231
		{
			String s2 = (String)((Iterator) (s)).next();
	//   13   29:aload_1         
	//   14   30:invokeinterface #81  <Method Object Iterator.next()>
	//   15   35:checkcast       #13  <Class String>
	//   16   38:astore          5
			if(!((StringBuilder) (s1)).toString().contains(((CharSequence) (s2))))
	//*  17   40:aload_2         
	//*  18   41:invokevirtual   #41  <Method String StringBuilder.toString()>
	//*  19   44:aload           5
	//*  20   46:invokevirtual   #45  <Method boolean String.contains(CharSequence)>
	//*  21   49:ifne            91
			{
				if(!((StringBuilder) (s1)).toString().equals(""))
	//*  22   52:aload_2         
	//*  23   53:invokevirtual   #41  <Method String StringBuilder.toString()>
	//*  24   56:ldc1            #24  <String "">
	//*  25   58:invokevirtual   #85  <Method boolean String.equals(Object)>
	//*  26   61:ifeq            81
	//*  27   64:aload_2         
	//*  28   65:aload           5
	//*  29   67:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//*  30   70:pop             
	//*  31   71:aload_2         
	//*  32   72:ldc1            #87  <String ":1">
	//*  33   74:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//*  34   77:pop             
	//*  35   78:goto            20
					((StringBuilder) (s1)).append(";");
	//   36   81:aload_2         
	//   37   82:ldc1            #89  <String ";">
	//   38   84:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   39   87:pop             
				((StringBuilder) (s1)).append(s2);
				((StringBuilder) (s1)).append(":1");
			} else
	//*  40   88:goto            64
			{
				String as[] = ((StringBuilder) (s1)).toString().split(";");
	//   41   91:aload_2         
	//   42   92:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   43   95:ldc1            #89  <String ";">
	//   44   97:invokevirtual   #93  <Method String[] String.split(String)>
	//   45  100:astore          6
				int i = 0;
	//   46  102:iconst_0        
	//   47  103:istore_3        
				while(i < as.length) 
	//*  48  104:iload_3         
	//*  49  105:aload           6
	//*  50  107:arraylength     
	//*  51  108:icmpge          20
				{
					if(as[i].contains(((CharSequence) (s2))))
	//*  52  111:aload           6
	//*  53  113:iload_3         
	//*  54  114:aaload          
	//*  55  115:aload           5
	//*  56  117:invokevirtual   #45  <Method boolean String.contains(CharSequence)>
	//*  57  120:ifeq            224
					{
						String as1[] = as[i].split(":");
	//   58  123:aload           6
	//   59  125:iload_3         
	//   60  126:aaload          
	//   61  127:ldc1            #95  <String ":">
	//   62  129:invokevirtual   #93  <Method String[] String.split(String)>
	//   63  132:astore          7
						int j = Integer.valueOf(as1[1]).intValue();
	//   64  134:aload           7
	//   65  136:iconst_1        
	//   66  137:aaload          
	//   67  138:invokestatic    #100 <Method Integer Integer.valueOf(String)>
	//   68  141:invokevirtual   #103 <Method int Integer.intValue()>
	//   69  144:istore          4
						StringBuilder stringbuilder = new StringBuilder();
	//   70  146:new             #19  <Class StringBuilder>
	//   71  149:dup             
	//   72  150:invokespecial   #22  <Method void StringBuilder()>
	//   73  153:astore          8
						stringbuilder.append(as1[0]);
	//   74  155:aload           8
	//   75  157:aload           7
	//   76  159:iconst_0        
	//   77  160:aaload          
	//   78  161:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   79  164:pop             
						stringbuilder.append(":");
	//   80  165:aload           8
	//   81  167:ldc1            #95  <String ":">
	//   82  169:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   83  172:pop             
						stringbuilder.append(((Object) (Integer.valueOf(j + 1))));
	//   84  173:aload           8
	//   85  175:iload           4
	//   86  177:iconst_1        
	//   87  178:iadd            
	//   88  179:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   89  182:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   90  185:pop             
						String s3 = stringbuilder.toString();
	//   91  186:aload           8
	//   92  188:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   93  191:astore          7
						((StringBuilder) (s1)).replace(((StringBuilder) (s1)).indexOf(as[i]), ((StringBuilder) (s1)).indexOf(as[i]) + as[i].length(), s3);
	//   94  193:aload_2         
	//   95  194:aload_2         
	//   96  195:aload           6
	//   97  197:iload_3         
	//   98  198:aaload          
	//   99  199:invokevirtual   #113 <Method int StringBuilder.indexOf(String)>
	//  100  202:aload_2         
	//  101  203:aload           6
	//  102  205:iload_3         
	//  103  206:aaload          
	//  104  207:invokevirtual   #113 <Method int StringBuilder.indexOf(String)>
	//  105  210:aload           6
	//  106  212:iload_3         
	//  107  213:aaload          
	//  108  214:invokevirtual   #17  <Method int String.length()>
	//  109  217:iadd            
	//  110  218:aload           7
	//  111  220:invokevirtual   #117 <Method StringBuilder StringBuilder.replace(int, int, String)>
	//  112  223:pop             
					}
					i++;
	//  113  224:iload_3         
	//  114  225:iconst_1        
	//  115  226:iadd            
	//  116  227:istore_3        
				}
			}
		}

	//* 117  228:goto            104
		return ((StringBuilder) (s1)).toString();
	//  118  231:aload_2         
	//  119  232:invokevirtual   #41  <Method String StringBuilder.toString()>
	//  120  235:areturn         
	}

	private List c(String s)
	{
		s = ((String) (s.split(",")));
	//    0    0:aload_1         
	//    1    1:ldc1            #54  <String ",">
	//    2    3:invokevirtual   #93  <Method String[] String.split(String)>
	//    3    6:astore_1        
		ArrayList arraylist = new ArrayList();
	//    4    7:new             #119 <Class ArrayList>
	//    5   10:dup             
	//    6   11:invokespecial   #120 <Method void ArrayList()>
	//    7   14:astore_3        
		for(int i = 0; i < s.length; i++)
	//*   8   15:iconst_0        
	//*   9   16:istore_2        
	//*  10   17:iload_2         
	//*  11   18:aload_1         
	//*  12   19:arraylength     
	//*  13   20:icmpge          38
			arraylist.add(((Object) (s[i])));
	//   14   23:aload_3         
	//   15   24:aload_1         
	//   16   25:iload_2         
	//   17   26:aaload          
	//   18   27:invokevirtual   #123 <Method boolean ArrayList.add(Object)>
	//   19   30:pop             

	//   20   31:iload_2         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_2        
	//*  24   35:goto            17
		return ((List) (arraylist));
	//   25   38:aload_3         
	//   26   39:areturn         
	}

	public void aggregateLabels(List list)
	{
		Iterator iterator = list.iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #71  <Method Iterator List.iterator()>
	//    2    6:astore          5
_L10:
		Object obj;
		Label label;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_293;
	//    3    8:aload           5
	//    4   10:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//    5   15:ifeq            293
		obj = ((Object) ((Label)iterator.next()));
	//    6   18:aload           5
	//    7   20:invokeinterface #81  <Method Object Iterator.next()>
	//    8   25:checkcast       #129 <Class Label>
	//    9   28:astore          4
		label = (Label)a.get(((Object) (((Label) (obj)).name)));
	//   10   30:aload_0         
	//   11   31:getfield        #132 <Field HashMap a>
	//   12   34:aload           4
	//   13   36:getfield        #136 <Field String Label.name>
	//   14   39:invokevirtual   #142 <Method Object HashMap.get(Object)>
	//   15   42:checkcast       #129 <Class Label>
	//   16   45:astore          6
		if(label != null) goto _L2; else goto _L1
	//   17   47:aload           6
	//   18   49:ifnonnull       105
_L1:
		if(!b(((Label) (obj)).value).booleanValue()) goto _L4; else goto _L3
	//   19   52:aload_0         
	//   20   53:aload           4
	//   21   55:getfield        #145 <Field String Label.value>
	//   22   58:invokespecial   #147 <Method Boolean b(String)>
	//   23   61:invokevirtual   #150 <Method boolean Boolean.booleanValue()>
	//   24   64:ifeq            96
_L3:
		list = ((List) (c(((Label) (obj)).value, "")));
	//   25   67:aload_0         
	//   26   68:aload           4
	//   27   70:getfield        #145 <Field String Label.value>
	//   28   73:ldc1            #24  <String "">
	//   29   75:invokespecial   #152 <Method String c(String, String)>
	//   30   78:astore_1        
_L7:
		setLabel(((Label) (obj)).name, ((String) (list)), Boolean.valueOf(true));
	//   31   79:aload_0         
	//   32   80:aload           4
	//   33   82:getfield        #136 <Field String Label.name>
	//   34   85:aload_1         
	//   35   86:iconst_1        
	//   36   87:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   37   90:invokevirtual   #156 <Method void setLabel(String, String, Boolean)>
		continue; /* Loop/switch isn't completed */
	//   38   93:goto            8
_L4:
		setLabel(((Label) (obj)));
	//   39   96:aload_0         
	//   40   97:aload           4
	//   41   99:invokevirtual   #159 <Method void setLabel(Label)>
		continue; /* Loop/switch isn't completed */
	//   42  102:goto            8
_L2:
		if(!a(label.value).booleanValue() || !a(((Label) (obj)).value).booleanValue()) goto _L6; else goto _L5
	//   43  105:aload_0         
	//   44  106:aload           6
	//   45  108:getfield        #145 <Field String Label.value>
	//   46  111:invokespecial   #161 <Method Boolean a(String)>
	//   47  114:invokevirtual   #150 <Method boolean Boolean.booleanValue()>
	//   48  117:ifeq            190
	//   49  120:aload_0         
	//   50  121:aload           4
	//   51  123:getfield        #145 <Field String Label.value>
	//   52  126:invokespecial   #161 <Method Boolean a(String)>
	//   53  129:invokevirtual   #150 <Method boolean Boolean.booleanValue()>
	//   54  132:ifeq            190
_L5:
		int i = Integer.valueOf(label.value).intValue();
	//   55  135:aload           6
	//   56  137:getfield        #145 <Field String Label.value>
	//   57  140:invokestatic    #100 <Method Integer Integer.valueOf(String)>
	//   58  143:invokevirtual   #103 <Method int Integer.intValue()>
	//   59  146:istore_2        
		int j = Integer.valueOf(((Label) (obj)).value).intValue();
	//   60  147:aload           4
	//   61  149:getfield        #145 <Field String Label.value>
	//   62  152:invokestatic    #100 <Method Integer Integer.valueOf(String)>
	//   63  155:invokevirtual   #103 <Method int Integer.intValue()>
	//   64  158:istore_3        
		obj = ((Object) (label.name));
	//   65  159:aload           6
	//   66  161:getfield        #136 <Field String Label.name>
	//   67  164:astore          4
		list = ((List) (Integer.valueOf(i + j).toString()));
	//   68  166:iload_2         
	//   69  167:iload_3         
	//   70  168:iadd            
	//   71  169:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   72  172:invokevirtual   #162 <Method String Integer.toString()>
	//   73  175:astore_1        
_L8:
		setLabel(((String) (obj)), ((String) (list)), Boolean.valueOf(true));
	//   74  176:aload_0         
	//   75  177:aload           4
	//   76  179:aload_1         
	//   77  180:iconst_1        
	//   78  181:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   79  184:invokevirtual   #156 <Method void setLabel(String, String, Boolean)>
		continue; /* Loop/switch isn't completed */
	//   80  187:goto            8
_L6:
label0:
		{
			if(!b(((Label) (obj)).value).booleanValue())
				break label0;
	//   81  190:aload_0         
	//   82  191:aload           4
	//   83  193:getfield        #145 <Field String Label.value>
	//   84  196:invokespecial   #147 <Method Boolean b(String)>
	//   85  199:invokevirtual   #150 <Method boolean Boolean.booleanValue()>
	//   86  202:ifeq            223
			list = ((List) (c(((Label) (obj)).value, label.value)));
	//   87  205:aload_0         
	//   88  206:aload           4
	//   89  208:getfield        #145 <Field String Label.value>
	//   90  211:aload           6
	//   91  213:getfield        #145 <Field String Label.value>
	//   92  216:invokespecial   #152 <Method String c(String, String)>
	//   93  219:astore_1        
		}
		  goto _L7
	//*  94  220:goto            79
		if(b(label.value, ((Label) (obj)).value).booleanValue())
			continue; /* Loop/switch isn't completed */
	//   95  223:aload_0         
	//   96  224:aload           6
	//   97  226:getfield        #145 <Field String Label.value>
	//   98  229:aload           4
	//   99  231:getfield        #145 <Field String Label.value>
	//  100  234:invokespecial   #164 <Method Boolean b(String, String)>
	//  101  237:invokevirtual   #150 <Method boolean Boolean.booleanValue()>
	//  102  240:ifne            8
		list = ((List) (new StringBuilder()));
	//  103  243:new             #19  <Class StringBuilder>
	//  104  246:dup             
	//  105  247:invokespecial   #22  <Method void StringBuilder()>
	//  106  250:astore_1        
		((StringBuilder) (list)).append(label.value);
	//  107  251:aload_1         
	//  108  252:aload           6
	//  109  254:getfield        #145 <Field String Label.value>
	//  110  257:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  111  260:pop             
		((StringBuilder) (list)).append(",");
	//  112  261:aload_1         
	//  113  262:ldc1            #54  <String ",">
	//  114  264:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  115  267:pop             
		((StringBuilder) (list)).append(((Label) (obj)).value);
	//  116  268:aload_1         
	//  117  269:aload           4
	//  118  271:getfield        #145 <Field String Label.value>
	//  119  274:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  120  277:pop             
		list = ((List) (((StringBuilder) (list)).toString()));
	//  121  278:aload_1         
	//  122  279:invokevirtual   #41  <Method String StringBuilder.toString()>
	//  123  282:astore_1        
		obj = ((Object) (label.name));
	//  124  283:aload           6
	//  125  285:getfield        #136 <Field String Label.name>
	//  126  288:astore          4
		  goto _L8
	//* 127  290:goto            176
		return;
	//  128  293:return          
		if(true) goto _L10; else goto _L9
_L9:
	}

	public void formatLists()
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore_1        
		Iterator iterator = a.values().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #132 <Field HashMap a>
	//    6   12:invokevirtual   #170 <Method Collection HashMap.values()>
	//    7   15:invokeinterface #173 <Method Iterator Collection.iterator()>
	//    8   20:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   21:aload_2         
	//   10   22:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            63
			Label label1 = (Label)iterator.next();
	//   12   30:aload_2         
	//   13   31:invokeinterface #81  <Method Object Iterator.next()>
	//   14   36:checkcast       #129 <Class Label>
	//   15   39:astore_3        
			if(b(label1.value).booleanValue())
	//*  16   40:aload_0         
	//*  17   41:aload_3         
	//*  18   42:getfield        #145 <Field String Label.value>
	//*  19   45:invokespecial   #147 <Method Boolean b(String)>
	//*  20   48:invokevirtual   #150 <Method boolean Boolean.booleanValue()>
	//*  21   51:ifeq            21
				((ArrayList) (obj)).add(((Object) (label1)));
	//   22   54:aload_1         
	//   23   55:aload_3         
	//   24   56:invokevirtual   #123 <Method boolean ArrayList.add(Object)>
	//   25   59:pop             
		} while(true);
	//   26   60:goto            21
		Label label;
		for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); setLabel(label.name, c(label.value, ""), Boolean.valueOf(true)))
	//*  27   63:aload_1         
	//*  28   64:invokevirtual   #174 <Method Iterator ArrayList.iterator()>
	//*  29   67:astore_1        
	//*  30   68:aload_1         
	//*  31   69:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*  32   74:ifeq            112
			label = (Label)((Iterator) (obj)).next();
	//   33   77:aload_1         
	//   34   78:invokeinterface #81  <Method Object Iterator.next()>
	//   35   83:checkcast       #129 <Class Label>
	//   36   86:astore_2        

	//   37   87:aload_0         
	//   38   88:aload_2         
	//   39   89:getfield        #136 <Field String Label.name>
	//   40   92:aload_0         
	//   41   93:aload_2         
	//   42   94:getfield        #145 <Field String Label.value>
	//   43   97:ldc1            #24  <String "">
	//   44   99:invokespecial   #152 <Method String c(String, String)>
	//   45  102:iconst_1        
	//   46  103:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   47  106:invokevirtual   #156 <Method void setLabel(String, String, Boolean)>
	//*  48  109:goto            68
	//   49  112:return          
	}

	public List getAggregateLabels()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore_1        
		Iterator iterator = a.values().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #132 <Field HashMap a>
	//    6   12:invokevirtual   #170 <Method Collection HashMap.values()>
	//    7   15:invokeinterface #173 <Method Iterator Collection.iterator()>
	//    8   20:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   21:aload_2         
	//   10   22:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            59
			Label label = (Label)iterator.next();
	//   12   30:aload_2         
	//   13   31:invokeinterface #81  <Method Object Iterator.next()>
	//   14   36:checkcast       #129 <Class Label>
	//   15   39:astore_3        
			if(label.aggregate.booleanValue())
	//*  16   40:aload_3         
	//*  17   41:getfield        #180 <Field Boolean Label.aggregate>
	//*  18   44:invokevirtual   #150 <Method boolean Boolean.booleanValue()>
	//*  19   47:ifeq            21
				arraylist.add(((Object) (label)));
	//   20   50:aload_1         
	//   21   51:aload_3         
	//   22   52:invokevirtual   #123 <Method boolean ArrayList.add(Object)>
	//   23   55:pop             
		} while(true);
	//   24   56:goto            21
		return ((List) (arraylist));
	//   25   59:aload_1         
	//   26   60:areturn         
	}
}
