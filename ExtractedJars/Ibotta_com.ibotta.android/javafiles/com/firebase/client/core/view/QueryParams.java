// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.firebase.client.core.view.filter.IndexedFilter;
import com.firebase.client.core.view.filter.LimitedFilter;
import com.firebase.client.core.view.filter.NodeFilter;
import com.firebase.client.core.view.filter.RangedFilter;
import com.firebase.client.snapshot.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class QueryParams
{
	private static final class ViewFrom extends Enum
	{

		public static ViewFrom valueOf(String s)
		{
			return (ViewFrom)Enum.valueOf(com/firebase/client/core/view/QueryParams$ViewFrom, s);
		//    0    0:ldc1            #2   <Class QueryParams$ViewFrom>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class QueryParams$ViewFrom>
		//    4    9:areturn         
		}

		public static ViewFrom[] values()
		{
			return (ViewFrom[])((ViewFrom []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field QueryParams$ViewFrom[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.firebase.client.core.view.QueryParams$ViewFrom_3B_.clone()>
		//    2    6:checkcast       #38  <Class QueryParams$ViewFrom[]>
		//    3    9:areturn         
		}

		private static final ViewFrom $VALUES[];
		public static final ViewFrom LEFT;
		public static final ViewFrom RIGHT;

		static 
		{
			LEFT = new ViewFrom("LEFT", 0);
		//    0    0:new             #2   <Class QueryParams$ViewFrom>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "LEFT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void QueryParams$ViewFrom(String, int)>
		//    5   10:putstatic       #22  <Field QueryParams$ViewFrom LEFT>
			RIGHT = new ViewFrom("RIGHT", 1);
		//    6   13:new             #2   <Class QueryParams$ViewFrom>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "RIGHT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void QueryParams$ViewFrom(String, int)>
		//   11   23:putstatic       #25  <Field QueryParams$ViewFrom RIGHT>
			$VALUES = (new ViewFrom[] {
				LEFT, RIGHT
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       ViewFrom[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field QueryParams$ViewFrom LEFT>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field QueryParams$ViewFrom RIGHT>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field QueryParams$ViewFrom[] $VALUES>
		//*  23   45:return          
		}

		private ViewFrom(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public QueryParams()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Object()>
		indexStartValue = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #77  <Field Node indexStartValue>
		indexStartName = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #79  <Field ChildKey indexStartName>
		indexEndValue = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #81  <Field Node indexEndValue>
		indexEndName = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #83  <Field ChildKey indexEndName>
		index = ((Index) (PriorityIndex.getInstance()));
	//   14   24:aload_0         
	//   15   25:invokestatic    #89  <Method PriorityIndex PriorityIndex.getInstance()>
	//   16   28:putfield        #91  <Field Index index>
		jsonSerialization = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #93  <Field String jsonSerialization>
	//   20   36:return          
	}

	private QueryParams copy()
	{
		QueryParams queryparams = new QueryParams();
	//    0    0:new             #2   <Class QueryParams>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void QueryParams()>
	//    3    7:astore_1        
		queryparams.limit = limit;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #97  <Field Integer limit>
	//    7   13:putfield        #97  <Field Integer limit>
		queryparams.indexStartValue = indexStartValue;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #77  <Field Node indexStartValue>
	//   11   21:putfield        #77  <Field Node indexStartValue>
		queryparams.indexStartName = indexStartName;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #79  <Field ChildKey indexStartName>
	//   15   29:putfield        #79  <Field ChildKey indexStartName>
		queryparams.indexEndValue = indexEndValue;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #81  <Field Node indexEndValue>
	//   19   37:putfield        #81  <Field Node indexEndValue>
		queryparams.indexEndName = indexEndName;
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #83  <Field ChildKey indexEndName>
	//   23   45:putfield        #83  <Field ChildKey indexEndName>
		queryparams.viewFrom = viewFrom;
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #99  <Field QueryParams$ViewFrom viewFrom>
	//   27   53:putfield        #99  <Field QueryParams$ViewFrom viewFrom>
		queryparams.index = index;
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #91  <Field Index index>
	//   31   61:putfield        #91  <Field Index index>
		return queryparams;
	//   32   64:aload_1         
	//   33   65:areturn         
	}

	public static QueryParams fromQueryObject(Map map)
	{
		QueryParams queryparams = new QueryParams();
	//    0    0:new             #2   <Class QueryParams>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void QueryParams()>
	//    3    7:astore_2        
		queryparams.limit = (Integer)map.get("l");
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:ldc1            #33  <String "l">
	//    7   12:invokeinterface #107 <Method Object Map.get(Object)>
	//    8   17:checkcast       #109 <Class Integer>
	//    9   20:putfield        #97  <Field Integer limit>
		if(map.containsKey("sp"))
	//*  10   23:aload_0         
	//*  11   24:ldc1            #30  <String "sp">
	//*  12   26:invokeinterface #113 <Method boolean Map.containsKey(Object)>
	//*  13   31:ifeq            73
		{
			queryparams.indexStartValue = NodeUtilities.NodeFromJSON(map.get("sp"));
	//   14   34:aload_2         
	//   15   35:aload_0         
	//   16   36:ldc1            #30  <String "sp">
	//   17   38:invokeinterface #107 <Method Object Map.get(Object)>
	//   18   43:invokestatic    #119 <Method Node NodeUtilities.NodeFromJSON(Object)>
	//   19   46:putfield        #77  <Field Node indexStartValue>
			String s = (String)map.get("sn");
	//   20   49:aload_0         
	//   21   50:ldc1            #27  <String "sn">
	//   22   52:invokeinterface #107 <Method Object Map.get(Object)>
	//   23   57:checkcast       #121 <Class String>
	//   24   60:astore_1        
			if(s != null)
	//*  25   61:aload_1         
	//*  26   62:ifnull          73
				queryparams.indexStartName = ChildKey.fromString(s);
	//   27   65:aload_2         
	//   28   66:aload_1         
	//   29   67:invokestatic    #127 <Method ChildKey ChildKey.fromString(String)>
	//   30   70:putfield        #79  <Field ChildKey indexStartName>
		}
		if(map.containsKey("ep"))
	//*  31   73:aload_0         
	//*  32   74:ldc1            #24  <String "ep">
	//*  33   76:invokeinterface #113 <Method boolean Map.containsKey(Object)>
	//*  34   81:ifeq            123
		{
			queryparams.indexEndValue = NodeUtilities.NodeFromJSON(map.get("ep"));
	//   35   84:aload_2         
	//   36   85:aload_0         
	//   37   86:ldc1            #24  <String "ep">
	//   38   88:invokeinterface #107 <Method Object Map.get(Object)>
	//   39   93:invokestatic    #119 <Method Node NodeUtilities.NodeFromJSON(Object)>
	//   40   96:putfield        #81  <Field Node indexEndValue>
			String s1 = (String)map.get("en");
	//   41   99:aload_0         
	//   42  100:ldc1            #21  <String "en">
	//   43  102:invokeinterface #107 <Method Object Map.get(Object)>
	//   44  107:checkcast       #121 <Class String>
	//   45  110:astore_1        
			if(s1 != null)
	//*  46  111:aload_1         
	//*  47  112:ifnull          123
				queryparams.indexEndName = ChildKey.fromString(s1);
	//   48  115:aload_2         
	//   49  116:aload_1         
	//   50  117:invokestatic    #127 <Method ChildKey ChildKey.fromString(String)>
	//   51  120:putfield        #83  <Field ChildKey indexEndName>
		}
		Object obj = ((Object) ((String)map.get("vf")));
	//   52  123:aload_0         
	//   53  124:ldc1            #36  <String "vf">
	//   54  126:invokeinterface #107 <Method Object Map.get(Object)>
	//   55  131:checkcast       #121 <Class String>
	//   56  134:astore_1        
		if(obj != null)
	//*  57  135:aload_1         
	//*  58  136:ifnull          164
		{
			if(((String) (obj)).equals("l"))
	//*  59  139:aload_1         
	//*  60  140:ldc1            #33  <String "l">
	//*  61  142:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  62  145:ifeq            155
				obj = ((Object) (ViewFrom.LEFT));
	//   63  148:getstatic       #133 <Field QueryParams$ViewFrom QueryParams$ViewFrom.LEFT>
	//   64  151:astore_1        
			else
	//*  65  152:goto            159
				obj = ((Object) (ViewFrom.RIGHT));
	//   66  155:getstatic       #136 <Field QueryParams$ViewFrom QueryParams$ViewFrom.RIGHT>
	//   67  158:astore_1        
			queryparams.viewFrom = ((ViewFrom) (obj));
	//   68  159:aload_2         
	//   69  160:aload_1         
	//   70  161:putfield        #99  <Field QueryParams$ViewFrom viewFrom>
		}
		map = ((Map) ((String)map.get("i")));
	//   71  164:aload_0         
	//   72  165:ldc1            #18  <String "i">
	//   73  167:invokeinterface #107 <Method Object Map.get(Object)>
	//   74  172:checkcast       #121 <Class String>
	//   75  175:astore_0        
		if(map != null)
	//*  76  176:aload_0         
	//*  77  177:ifnull          188
			queryparams.index = Index.fromQueryDefinition(((String) (map)));
	//   78  180:aload_2         
	//   79  181:aload_0         
	//   80  182:invokestatic    #142 <Method Index Index.fromQueryDefinition(String)>
	//   81  185:putfield        #91  <Field Index index>
		return queryparams;
	//   82  188:aload_2         
	//   83  189:areturn         
	}

	public QueryParams endAt(Node node, ChildKey childkey)
	{
		QueryParams queryparams = copy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method QueryParams copy()>
	//    2    4:astore_3        
		queryparams.indexEndValue = node;
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:putfield        #81  <Field Node indexEndValue>
		queryparams.indexEndName = childkey;
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:putfield        #83  <Field ChildKey indexEndName>
		return queryparams;
	//    9   15:aload_3         
	//   10   16:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          230
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #152 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #152 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((QueryParams)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class QueryParams>
	//   16   28:astore_1        
			Object obj1 = ((Object) (limit));
	//   17   29:aload_0         
	//   18   30:getfield        #97  <Field Integer limit>
	//   19   33:astore_2        
			if(obj1 != null)
	//*  20   34:aload_2         
	//*  21   35:ifnull          51
			{
				if(!((Integer) (obj1)).equals(((Object) (((QueryParams) (obj)).limit))))
	//*  22   38:aload_2         
	//*  23   39:aload_1         
	//*  24   40:getfield        #97  <Field Integer limit>
	//*  25   43:invokevirtual   #153 <Method boolean Integer.equals(Object)>
	//*  26   46:ifne            60
					return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
			} else
			if(((QueryParams) (obj)).limit != null)
	//*  29   51:aload_1         
	//*  30   52:getfield        #97  <Field Integer limit>
	//*  31   55:ifnull          60
				return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
			obj1 = ((Object) (index));
	//   34   60:aload_0         
	//   35   61:getfield        #91  <Field Index index>
	//   36   64:astore_2        
			if(obj1 != null)
	//*  37   65:aload_2         
	//*  38   66:ifnull          82
			{
				if(!obj1.equals(((Object) (((QueryParams) (obj)).index))))
	//*  39   69:aload_2         
	//*  40   70:aload_1         
	//*  41   71:getfield        #91  <Field Index index>
	//*  42   74:invokevirtual   #154 <Method boolean Object.equals(Object)>
	//*  43   77:ifne            91
					return false;
	//   44   80:iconst_0        
	//   45   81:ireturn         
			} else
			if(((QueryParams) (obj)).index != null)
	//*  46   82:aload_1         
	//*  47   83:getfield        #91  <Field Index index>
	//*  48   86:ifnull          91
				return false;
	//   49   89:iconst_0        
	//   50   90:ireturn         
			obj1 = ((Object) (indexEndName));
	//   51   91:aload_0         
	//   52   92:getfield        #83  <Field ChildKey indexEndName>
	//   53   95:astore_2        
			if(obj1 != null)
	//*  54   96:aload_2         
	//*  55   97:ifnull          113
			{
				if(!((ChildKey) (obj1)).equals(((Object) (((QueryParams) (obj)).indexEndName))))
	//*  56  100:aload_2         
	//*  57  101:aload_1         
	//*  58  102:getfield        #83  <Field ChildKey indexEndName>
	//*  59  105:invokevirtual   #155 <Method boolean ChildKey.equals(Object)>
	//*  60  108:ifne            122
					return false;
	//   61  111:iconst_0        
	//   62  112:ireturn         
			} else
			if(((QueryParams) (obj)).indexEndName != null)
	//*  63  113:aload_1         
	//*  64  114:getfield        #83  <Field ChildKey indexEndName>
	//*  65  117:ifnull          122
				return false;
	//   66  120:iconst_0        
	//   67  121:ireturn         
			obj1 = ((Object) (indexEndValue));
	//   68  122:aload_0         
	//   69  123:getfield        #81  <Field Node indexEndValue>
	//   70  126:astore_2        
			if(obj1 != null)
	//*  71  127:aload_2         
	//*  72  128:ifnull          144
			{
				if(!obj1.equals(((Object) (((QueryParams) (obj)).indexEndValue))))
	//*  73  131:aload_2         
	//*  74  132:aload_1         
	//*  75  133:getfield        #81  <Field Node indexEndValue>
	//*  76  136:invokevirtual   #154 <Method boolean Object.equals(Object)>
	//*  77  139:ifne            153
					return false;
	//   78  142:iconst_0        
	//   79  143:ireturn         
			} else
			if(((QueryParams) (obj)).indexEndValue != null)
	//*  80  144:aload_1         
	//*  81  145:getfield        #81  <Field Node indexEndValue>
	//*  82  148:ifnull          153
				return false;
	//   83  151:iconst_0        
	//   84  152:ireturn         
			obj1 = ((Object) (indexStartName));
	//   85  153:aload_0         
	//   86  154:getfield        #79  <Field ChildKey indexStartName>
	//   87  157:astore_2        
			if(obj1 != null)
	//*  88  158:aload_2         
	//*  89  159:ifnull          175
			{
				if(!((ChildKey) (obj1)).equals(((Object) (((QueryParams) (obj)).indexStartName))))
	//*  90  162:aload_2         
	//*  91  163:aload_1         
	//*  92  164:getfield        #79  <Field ChildKey indexStartName>
	//*  93  167:invokevirtual   #155 <Method boolean ChildKey.equals(Object)>
	//*  94  170:ifne            184
					return false;
	//   95  173:iconst_0        
	//   96  174:ireturn         
			} else
			if(((QueryParams) (obj)).indexStartName != null)
	//*  97  175:aload_1         
	//*  98  176:getfield        #79  <Field ChildKey indexStartName>
	//*  99  179:ifnull          184
				return false;
	//  100  182:iconst_0        
	//  101  183:ireturn         
			obj1 = ((Object) (indexStartValue));
	//  102  184:aload_0         
	//  103  185:getfield        #77  <Field Node indexStartValue>
	//  104  188:astore_2        
			if(obj1 != null)
	//* 105  189:aload_2         
	//* 106  190:ifnull          206
			{
				if(!obj1.equals(((Object) (((QueryParams) (obj)).indexStartValue))))
	//* 107  193:aload_2         
	//* 108  194:aload_1         
	//* 109  195:getfield        #77  <Field Node indexStartValue>
	//* 110  198:invokevirtual   #154 <Method boolean Object.equals(Object)>
	//* 111  201:ifne            215
					return false;
	//  112  204:iconst_0        
	//  113  205:ireturn         
			} else
			if(((QueryParams) (obj)).indexStartValue != null)
	//* 114  206:aload_1         
	//* 115  207:getfield        #77  <Field Node indexStartValue>
	//* 116  210:ifnull          215
				return false;
	//  117  213:iconst_0        
	//  118  214:ireturn         
			return isViewFromLeft() == ((QueryParams) (obj)).isViewFromLeft();
	//  119  215:aload_0         
	//  120  216:invokevirtual   #159 <Method boolean isViewFromLeft()>
	//  121  219:aload_1         
	//  122  220:invokevirtual   #159 <Method boolean isViewFromLeft()>
	//  123  223:icmpeq          228
	//  124  226:iconst_0        
	//  125  227:ireturn         
	//  126  228:iconst_1        
	//  127  229:ireturn         
		} else
		{
			return false;
	//  128  230:iconst_0        
	//  129  231:ireturn         
		}
	}

	public Index getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Index index>
	//    2    4:areturn         
	}

	public ChildKey getIndexEndName()
	{
		if(hasEnd())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #166 <Method boolean hasEnd()>
	//*   2    4:ifeq            22
		{
			ChildKey childkey = indexEndName;
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field ChildKey indexEndName>
	//    5   11:astore_1        
			if(childkey != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          18
				return childkey;
	//    8   16:aload_1         
	//    9   17:areturn         
			else
				return ChildKey.getMaxName();
	//   10   18:invokestatic    #169 <Method ChildKey ChildKey.getMaxName()>
	//   11   21:areturn         
		} else
		{
			throw new IllegalArgumentException("Cannot get index end name if start has not been set");
	//   12   22:new             #171 <Class IllegalArgumentException>
	//   13   25:dup             
	//   14   26:ldc1            #173 <String "Cannot get index end name if start has not been set">
	//   15   28:invokespecial   #176 <Method void IllegalArgumentException(String)>
	//   16   31:athrow          
		}
	}

	public Node getIndexEndValue()
	{
		if(hasEnd())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #166 <Method boolean hasEnd()>
	//*   2    4:ifeq            12
			return indexEndValue;
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field Node indexEndValue>
	//    5   11:areturn         
		else
			throw new IllegalArgumentException("Cannot get index end value if start has not been set");
	//    6   12:new             #171 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc1            #180 <String "Cannot get index end value if start has not been set">
	//    9   18:invokespecial   #176 <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
	}

	public ChildKey getIndexStartName()
	{
		if(hasStart())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #184 <Method boolean hasStart()>
	//*   2    4:ifeq            22
		{
			ChildKey childkey = indexStartName;
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field ChildKey indexStartName>
	//    5   11:astore_1        
			if(childkey != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          18
				return childkey;
	//    8   16:aload_1         
	//    9   17:areturn         
			else
				return ChildKey.getMinName();
	//   10   18:invokestatic    #187 <Method ChildKey ChildKey.getMinName()>
	//   11   21:areturn         
		} else
		{
			throw new IllegalArgumentException("Cannot get index start name if start has not been set");
	//   12   22:new             #171 <Class IllegalArgumentException>
	//   13   25:dup             
	//   14   26:ldc1            #189 <String "Cannot get index start name if start has not been set">
	//   15   28:invokespecial   #176 <Method void IllegalArgumentException(String)>
	//   16   31:athrow          
		}
	}

	public Node getIndexStartValue()
	{
		if(hasStart())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #184 <Method boolean hasStart()>
	//*   2    4:ifeq            12
			return indexStartValue;
	//    3    7:aload_0         
	//    4    8:getfield        #77  <Field Node indexStartValue>
	//    5   11:areturn         
		else
			throw new IllegalArgumentException("Cannot get index start value if start has not been set");
	//    6   12:new             #171 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc1            #192 <String "Cannot get index start value if start has not been set">
	//    9   18:invokespecial   #176 <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
	}

	public int getLimit()
	{
		if(hasLimit())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #197 <Method boolean hasLimit()>
	//*   2    4:ifeq            15
			return limit.intValue();
	//    3    7:aload_0         
	//    4    8:getfield        #97  <Field Integer limit>
	//    5   11:invokevirtual   #200 <Method int Integer.intValue()>
	//    6   14:ireturn         
		else
			throw new IllegalArgumentException("Cannot get limit if limit has not been set");
	//    7   15:new             #171 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc1            #202 <String "Cannot get limit if limit has not been set">
	//   10   21:invokespecial   #176 <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
	}

	public NodeFilter getNodeFilter()
	{
		if(loadsAllData())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #207 <Method boolean loadsAllData()>
	//*   2    4:ifeq            19
			return ((NodeFilter) (new IndexedFilter(getIndex())));
	//    3    7:new             #209 <Class IndexedFilter>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokevirtual   #211 <Method Index getIndex()>
	//    7   15:invokespecial   #214 <Method void IndexedFilter(Index)>
	//    8   18:areturn         
		if(hasLimit())
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #197 <Method boolean hasLimit()>
	//*  11   23:ifeq            35
			return ((NodeFilter) (new LimitedFilter(this)));
	//   12   26:new             #216 <Class LimitedFilter>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokespecial   #219 <Method void LimitedFilter(QueryParams)>
	//   16   34:areturn         
		else
			return ((NodeFilter) (new RangedFilter(this)));
	//   17   35:new             #221 <Class RangedFilter>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #222 <Method void RangedFilter(QueryParams)>
	//   21   43:areturn         
	}

	public Map getWireProtocolParams()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #226 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #227 <Method void HashMap()>
	//    3    7:astore_3        
		if(hasStart())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #184 <Method boolean hasStart()>
	//*   6   12:ifeq            55
		{
			((Map) (hashmap)).put("sp", indexStartValue.getValue());
	//    7   15:aload_3         
	//    8   16:ldc1            #30  <String "sp">
	//    9   18:aload_0         
	//   10   19:getfield        #77  <Field Node indexStartValue>
	//   11   22:invokeinterface #233 <Method Object Node.getValue()>
	//   12   27:invokeinterface #237 <Method Object Map.put(Object, Object)>
	//   13   32:pop             
			ChildKey childkey = indexStartName;
	//   14   33:aload_0         
	//   15   34:getfield        #79  <Field ChildKey indexStartName>
	//   16   37:astore_1        
			if(childkey != null)
	//*  17   38:aload_1         
	//*  18   39:ifnull          55
				((Map) (hashmap)).put("sn", ((Object) (childkey.asString())));
	//   19   42:aload_3         
	//   20   43:ldc1            #27  <String "sn">
	//   21   45:aload_1         
	//   22   46:invokevirtual   #241 <Method String ChildKey.asString()>
	//   23   49:invokeinterface #237 <Method Object Map.put(Object, Object)>
	//   24   54:pop             
		}
		if(hasEnd())
	//*  25   55:aload_0         
	//*  26   56:invokevirtual   #166 <Method boolean hasEnd()>
	//*  27   59:ifeq            102
		{
			((Map) (hashmap)).put("ep", indexEndValue.getValue());
	//   28   62:aload_3         
	//   29   63:ldc1            #24  <String "ep">
	//   30   65:aload_0         
	//   31   66:getfield        #81  <Field Node indexEndValue>
	//   32   69:invokeinterface #233 <Method Object Node.getValue()>
	//   33   74:invokeinterface #237 <Method Object Map.put(Object, Object)>
	//   34   79:pop             
			ChildKey childkey1 = indexEndName;
	//   35   80:aload_0         
	//   36   81:getfield        #83  <Field ChildKey indexEndName>
	//   37   84:astore_1        
			if(childkey1 != null)
	//*  38   85:aload_1         
	//*  39   86:ifnull          102
				((Map) (hashmap)).put("en", ((Object) (childkey1.asString())));
	//   40   89:aload_3         
	//   41   90:ldc1            #21  <String "en">
	//   42   92:aload_1         
	//   43   93:invokevirtual   #241 <Method String ChildKey.asString()>
	//   44   96:invokeinterface #237 <Method Object Map.put(Object, Object)>
	//   45  101:pop             
		}
		Object obj = ((Object) (limit));
	//   46  102:aload_0         
	//   47  103:getfield        #97  <Field Integer limit>
	//   48  106:astore_1        
		if(obj != null)
	//*  49  107:aload_1         
	//*  50  108:ifnull          208
		{
			((Map) (hashmap)).put("l", obj);
	//   51  111:aload_3         
	//   52  112:ldc1            #33  <String "l">
	//   53  114:aload_1         
	//   54  115:invokeinterface #237 <Method Object Map.put(Object, Object)>
	//   55  120:pop             
			ViewFrom viewfrom = viewFrom;
	//   56  121:aload_0         
	//   57  122:getfield        #99  <Field QueryParams$ViewFrom viewFrom>
	//   58  125:astore_2        
			obj = ((Object) (viewfrom));
	//   59  126:aload_2         
	//   60  127:astore_1        
			if(viewfrom == null)
	//*  61  128:aload_2         
	//*  62  129:ifnonnull       150
				if(hasStart())
	//*  63  132:aload_0         
	//*  64  133:invokevirtual   #184 <Method boolean hasStart()>
	//*  65  136:ifeq            146
					obj = ((Object) (ViewFrom.LEFT));
	//   66  139:getstatic       #133 <Field QueryParams$ViewFrom QueryParams$ViewFrom.LEFT>
	//   67  142:astore_1        
				else
	//*  68  143:goto            150
					obj = ((Object) (ViewFrom.RIGHT));
	//   69  146:getstatic       #136 <Field QueryParams$ViewFrom QueryParams$ViewFrom.RIGHT>
	//   70  149:astore_1        
			static class _cls1
			{

				static final int $SwitchMap$com$firebase$client$core$view$QueryParams$ViewFrom[];

				static 
				{
					$SwitchMap$com$firebase$client$core$view$QueryParams$ViewFrom = new int[ViewFrom.values().length];
				//    0    0:invokestatic    #18  <Method QueryParams$ViewFrom[] QueryParams$ViewFrom.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$view$QueryParams$ViewFrom>
					try
					{
						$SwitchMap$com$firebase$client$core$view$QueryParams$ViewFrom[ViewFrom.LEFT.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$view$QueryParams$ViewFrom>
				//    5   12:getstatic       #24  <Field QueryParams$ViewFrom QueryParams$ViewFrom.LEFT>
				//    6   15:invokevirtual   #28  <Method int QueryParams$ViewFrom.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$view$QueryParams$ViewFrom>
				//*  10   23:getstatic       #31  <Field QueryParams$ViewFrom QueryParams$ViewFrom.RIGHT>
				//*  11   26:invokevirtual   #28  <Method int QueryParams$ViewFrom.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   15   32:astore_0        
					try
					{
						$SwitchMap$com$firebase$client$core$view$QueryParams$ViewFrom[ViewFrom.RIGHT.ordinal()] = 2;
					}
				//*  16   33:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   17   36:astore_0        
				//*  18   37:return          
				}
			}

			switch(_cls1..SwitchMap.com.firebase.client.core.view.QueryParams.ViewFrom[((ViewFrom) (obj)).ordinal()])
	//*  71  150:getstatic       #245 <Field int[] QueryParams$1.$SwitchMap$com$firebase$client$core$view$QueryParams$ViewFrom>
	//*  72  153:aload_1         
	//*  73  154:invokevirtual   #248 <Method int QueryParams$ViewFrom.ordinal()>
	//*  74  157:iaload          
			{
	//*  75  158:tableswitch     1 2: default 180
	//	               1 197
	//	               2 183
	//*  76  180:goto            208
			case 2: // '\002'
				((Map) (hashmap)).put("vf", "r");
	//   77  183:aload_3         
	//   78  184:ldc1            #36  <String "vf">
	//   79  186:ldc1            #250 <String "r">
	//   80  188:invokeinterface #237 <Method Object Map.put(Object, Object)>
	//   81  193:pop             
				break;

	//*  82  194:goto            208
			case 1: // '\001'
				((Map) (hashmap)).put("vf", "l");
	//   83  197:aload_3         
	//   84  198:ldc1            #36  <String "vf">
	//   85  200:ldc1            #33  <String "l">
	//   86  202:invokeinterface #237 <Method Object Map.put(Object, Object)>
	//   87  207:pop             
				break;
			}
		}
		if(!((Object) (index)).equals(((Object) (PriorityIndex.getInstance()))))
	//*  88  208:aload_0         
	//*  89  209:getfield        #91  <Field Index index>
	//*  90  212:invokestatic    #89  <Method PriorityIndex PriorityIndex.getInstance()>
	//*  91  215:invokevirtual   #154 <Method boolean Object.equals(Object)>
	//*  92  218:ifne            237
			((Map) (hashmap)).put("i", ((Object) (index.getQueryDefinition())));
	//   93  221:aload_3         
	//   94  222:ldc1            #18  <String "i">
	//   95  224:aload_0         
	//   96  225:getfield        #91  <Field Index index>
	//   97  228:invokevirtual   #253 <Method String Index.getQueryDefinition()>
	//   98  231:invokeinterface #237 <Method Object Map.put(Object, Object)>
	//   99  236:pop             
		return ((Map) (hashmap));
	//  100  237:aload_3         
	//  101  238:areturn         
	}

	public boolean hasAnchoredLimit()
	{
		return hasLimit() && viewFrom != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #197 <Method boolean hasLimit()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field QueryParams$ViewFrom viewFrom>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasEnd()
	{
		return indexEndValue != null;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Node indexEndValue>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasLimit()
	{
		return limit != null;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Integer limit>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasStart()
	{
		return indexStartValue != null;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Node indexStartValue>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int hashCode()
	{
		Object obj = ((Object) (limit));
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Integer limit>
	//    2    4:astore          8
		int j1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          7
		int i;
		if(obj != null)
	//*   5    9:aload           8
	//*   6   11:ifnull          23
			i = ((Integer) (obj)).intValue();
	//    7   14:aload           8
	//    8   16:invokevirtual   #200 <Method int Integer.intValue()>
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		char c;
		if(isViewFromLeft())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #159 <Method boolean isViewFromLeft()>
	//*  15   29:ifeq            39
			c = '\u04CF';
	//   16   32:sipush          1231
	//   17   35:istore_2        
		else
	//*  18   36:goto            43
			c = '\u04D5';
	//   19   39:sipush          1237
	//   20   42:istore_2        
		obj = ((Object) (indexStartValue));
	//   21   43:aload_0         
	//   22   44:getfield        #77  <Field Node indexStartValue>
	//   23   47:astore          8
		int j;
		if(obj != null)
	//*  24   49:aload           8
	//*  25   51:ifnull          63
			j = obj.hashCode();
	//   26   54:aload           8
	//   27   56:invokevirtual   #258 <Method int Object.hashCode()>
	//   28   59:istore_3        
		else
	//*  29   60:goto            65
			j = 0;
	//   30   63:iconst_0        
	//   31   64:istore_3        
		obj = ((Object) (indexStartName));
	//   32   65:aload_0         
	//   33   66:getfield        #79  <Field ChildKey indexStartName>
	//   34   69:astore          8
		int k;
		if(obj != null)
	//*  35   71:aload           8
	//*  36   73:ifnull          86
			k = ((ChildKey) (obj)).hashCode();
	//   37   76:aload           8
	//   38   78:invokevirtual   #259 <Method int ChildKey.hashCode()>
	//   39   81:istore          4
		else
	//*  40   83:goto            89
			k = 0;
	//   41   86:iconst_0        
	//   42   87:istore          4
		obj = ((Object) (indexEndValue));
	//   43   89:aload_0         
	//   44   90:getfield        #81  <Field Node indexEndValue>
	//   45   93:astore          8
		int l;
		if(obj != null)
	//*  46   95:aload           8
	//*  47   97:ifnull          110
			l = obj.hashCode();
	//   48  100:aload           8
	//   49  102:invokevirtual   #258 <Method int Object.hashCode()>
	//   50  105:istore          5
		else
	//*  51  107:goto            113
			l = 0;
	//   52  110:iconst_0        
	//   53  111:istore          5
		obj = ((Object) (indexEndName));
	//   54  113:aload_0         
	//   55  114:getfield        #83  <Field ChildKey indexEndName>
	//   56  117:astore          8
		int i1;
		if(obj != null)
	//*  57  119:aload           8
	//*  58  121:ifnull          134
			i1 = ((ChildKey) (obj)).hashCode();
	//   59  124:aload           8
	//   60  126:invokevirtual   #259 <Method int ChildKey.hashCode()>
	//   61  129:istore          6
		else
	//*  62  131:goto            137
			i1 = 0;
	//   63  134:iconst_0        
	//   64  135:istore          6
		obj = ((Object) (index));
	//   65  137:aload_0         
	//   66  138:getfield        #91  <Field Index index>
	//   67  141:astore          8
		if(obj != null)
	//*  68  143:aload           8
	//*  69  145:ifnull          155
			j1 = obj.hashCode();
	//   70  148:aload           8
	//   71  150:invokevirtual   #258 <Method int Object.hashCode()>
	//   72  153:istore          7
		return (((((i * 31 + c) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1;
	//   73  155:iload_1         
	//   74  156:bipush          31
	//   75  158:imul            
	//   76  159:iload_2         
	//   77  160:iadd            
	//   78  161:bipush          31
	//   79  163:imul            
	//   80  164:iload_3         
	//   81  165:iadd            
	//   82  166:bipush          31
	//   83  168:imul            
	//   84  169:iload           4
	//   85  171:iadd            
	//   86  172:bipush          31
	//   87  174:imul            
	//   88  175:iload           5
	//   89  177:iadd            
	//   90  178:bipush          31
	//   91  180:imul            
	//   92  181:iload           6
	//   93  183:iadd            
	//   94  184:bipush          31
	//   95  186:imul            
	//   96  187:iload           7
	//   97  189:iadd            
	//   98  190:ireturn         
	}

	public boolean isDefault()
	{
		return loadsAllData() && ((Object) (index)).equals(((Object) (PriorityIndex.getInstance())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method boolean loadsAllData()>
	//    2    4:ifeq            22
	//    3    7:aload_0         
	//    4    8:getfield        #91  <Field Index index>
	//    5   11:invokestatic    #89  <Method PriorityIndex PriorityIndex.getInstance()>
	//    6   14:invokevirtual   #154 <Method boolean Object.equals(Object)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public boolean isValid()
	{
		return !hasStart() || !hasEnd() || !hasLimit() || hasAnchoredLimit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method boolean hasStart()>
	//    2    4:ifeq            33
	//    3    7:aload_0         
	//    4    8:invokevirtual   #166 <Method boolean hasEnd()>
	//    5   11:ifeq            33
	//    6   14:aload_0         
	//    7   15:invokevirtual   #197 <Method boolean hasLimit()>
	//    8   18:ifeq            33
	//    9   21:aload_0         
	//   10   22:invokevirtual   #263 <Method boolean hasAnchoredLimit()>
	//   11   25:ifeq            31
	//   12   28:goto            33
	//   13   31:iconst_0        
	//   14   32:ireturn         
	//   15   33:iconst_1        
	//   16   34:ireturn         
	}

	public boolean isViewFromLeft()
	{
		ViewFrom viewfrom = viewFrom;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field QueryParams$ViewFrom viewFrom>
	//    2    4:astore_1        
		if(viewfrom != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
			return viewfrom == ViewFrom.LEFT;
	//    5    9:aload_1         
	//    6   10:getstatic       #133 <Field QueryParams$ViewFrom QueryParams$ViewFrom.LEFT>
	//    7   13:if_acmpne       18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
		else
			return hasStart();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #184 <Method boolean hasStart()>
	//   14   24:ireturn         
	}

	public QueryParams limit(int i)
	{
		QueryParams queryparams = copy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method QueryParams copy()>
	//    2    4:astore_2        
		queryparams.limit = Integer.valueOf(i);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #268 <Method Integer Integer.valueOf(int)>
	//    6   10:putfield        #97  <Field Integer limit>
		queryparams.viewFrom = null;
	//    7   13:aload_2         
	//    8   14:aconst_null     
	//    9   15:putfield        #99  <Field QueryParams$ViewFrom viewFrom>
		return queryparams;
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	public QueryParams limitToFirst(int i)
	{
		QueryParams queryparams = copy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method QueryParams copy()>
	//    2    4:astore_2        
		queryparams.limit = Integer.valueOf(i);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #268 <Method Integer Integer.valueOf(int)>
	//    6   10:putfield        #97  <Field Integer limit>
		queryparams.viewFrom = ViewFrom.LEFT;
	//    7   13:aload_2         
	//    8   14:getstatic       #133 <Field QueryParams$ViewFrom QueryParams$ViewFrom.LEFT>
	//    9   17:putfield        #99  <Field QueryParams$ViewFrom viewFrom>
		return queryparams;
	//   10   20:aload_2         
	//   11   21:areturn         
	}

	public QueryParams limitToLast(int i)
	{
		QueryParams queryparams = copy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method QueryParams copy()>
	//    2    4:astore_2        
		queryparams.limit = Integer.valueOf(i);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #268 <Method Integer Integer.valueOf(int)>
	//    6   10:putfield        #97  <Field Integer limit>
		queryparams.viewFrom = ViewFrom.RIGHT;
	//    7   13:aload_2         
	//    8   14:getstatic       #136 <Field QueryParams$ViewFrom QueryParams$ViewFrom.RIGHT>
	//    9   17:putfield        #99  <Field QueryParams$ViewFrom viewFrom>
		return queryparams;
	//   10   20:aload_2         
	//   11   21:areturn         
	}

	public boolean loadsAllData()
	{
		return !hasStart() && !hasEnd() && !hasLimit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method boolean hasStart()>
	//    2    4:ifne            23
	//    3    7:aload_0         
	//    4    8:invokevirtual   #166 <Method boolean hasEnd()>
	//    5   11:ifne            23
	//    6   14:aload_0         
	//    7   15:invokevirtual   #197 <Method boolean hasLimit()>
	//    8   18:ifne            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public QueryParams orderBy(Index index1)
	{
		QueryParams queryparams = copy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method QueryParams copy()>
	//    2    4:astore_2        
		queryparams.index = index1;
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:putfield        #91  <Field Index index>
		return queryparams;
	//    6   10:aload_2         
	//    7   11:areturn         
	}

	public QueryParams startAt(Node node, ChildKey childkey)
	{
		QueryParams queryparams = copy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method QueryParams copy()>
	//    2    4:astore_3        
		queryparams.indexStartValue = node;
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:putfield        #77  <Field Node indexStartValue>
		queryparams.indexStartName = childkey;
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:putfield        #79  <Field ChildKey indexStartName>
		return queryparams;
	//    9   15:aload_3         
	//   10   16:areturn         
	}

	public String toJSON()
	{
		if(jsonSerialization == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field String jsonSerialization>
	//*   2    4:ifnonnull       34
			try
			{
				jsonSerialization = mapperInstance.writeValueAsString(((Object) (getWireProtocolParams())));
	//    3    7:aload_0         
	//    4    8:getstatic       #63  <Field ObjectMapper mapperInstance>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #278 <Method Map getWireProtocolParams()>
	//    7   15:invokevirtual   #282 <Method String ObjectMapper.writeValueAsString(Object)>
	//    8   18:putfield        #93  <Field String jsonSerialization>
			}
	//*   9   21:goto            34
			catch(IOException ioexception)
	//*  10   24:astore_1        
			{
				throw new RuntimeException(((Throwable) (ioexception)));
	//   11   25:new             #284 <Class RuntimeException>
	//   12   28:dup             
	//   13   29:aload_1         
	//   14   30:invokespecial   #287 <Method void RuntimeException(Throwable)>
	//   15   33:athrow          
			}
		return jsonSerialization;
	//   16   34:aload_0         
	//   17   35:getfield        #93  <Field String jsonSerialization>
	//   18   38:areturn         
	}

	public String toString()
	{
		return ((Object) (getWireProtocolParams())).toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #278 <Method Map getWireProtocolParams()>
	//    2    4:invokevirtual   #290 <Method String Object.toString()>
	//    3    7:areturn         
	}

	static final boolean $assertionsDisabled = false;
	public static final QueryParams DEFAULT_PARAMS = new QueryParams();
	private static final String INDEX = "i";
	private static final String INDEX_END_NAME = "en";
	private static final String INDEX_END_VALUE = "ep";
	private static final String INDEX_START_NAME = "sn";
	private static final String INDEX_START_VALUE = "sp";
	private static final String LIMIT = "l";
	private static final String VIEW_FROM = "vf";
	private static final ObjectMapper mapperInstance;
	private Index index;
	private ChildKey indexEndName;
	private Node indexEndValue;
	private ChildKey indexStartName;
	private Node indexStartValue;
	private String jsonSerialization;
	private Integer limit;
	private ViewFrom viewFrom;

	static 
	{
	//    0    0:new             #2   <Class QueryParams>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void QueryParams()>
	//    3    7:putstatic       #58  <Field QueryParams DEFAULT_PARAMS>
		mapperInstance = new ObjectMapper();
	//    4   10:new             #60  <Class ObjectMapper>
	//    5   13:dup             
	//    6   14:invokespecial   #61  <Method void ObjectMapper()>
	//    7   17:putstatic       #63  <Field ObjectMapper mapperInstance>
		mapperInstance.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
	//    8   20:getstatic       #63  <Field ObjectMapper mapperInstance>
	//    9   23:getstatic       #69  <Field SerializationFeature SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS>
	//   10   26:iconst_1        
	//   11   27:invokevirtual   #73  <Method ObjectMapper ObjectMapper.configure(SerializationFeature, boolean)>
	//   12   30:pop             
	//*  13   31:return          
	}
}
