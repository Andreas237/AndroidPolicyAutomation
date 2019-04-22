// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;
import java.util.*;

public class TransitionValues
{

	public TransitionValues()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void HashMap()>
	//    6   12:putfield        #21  <Field Map values>
	//    7   15:aload_0         
	//    8   16:new             #23  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #24  <Method void ArrayList()>
	//   11   23:putfield        #26  <Field ArrayList mTargetedTransitions>
	//   12   26:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof TransitionValues)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class TransitionValues>
	//*   2    4:ifeq            43
		{
			View view1 = view;
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field View view>
	//    5   11:astore_2        
			obj = ((Object) ((TransitionValues)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class TransitionValues>
	//    8   16:astore_1        
			if(view1 == ((TransitionValues) (obj)).view && values.equals(((Object) (((TransitionValues) (obj)).values))))
	//*   9   17:aload_2         
	//*  10   18:aload_1         
	//*  11   19:getfield        #31  <Field View view>
	//*  12   22:if_acmpne       43
	//*  13   25:aload_0         
	//*  14   26:getfield        #21  <Field Map values>
	//*  15   29:aload_1         
	//*  16   30:getfield        #21  <Field Map values>
	//*  17   33:invokeinterface #35  <Method boolean Map.equals(Object)>
	//*  18   38:ifeq            43
				return true;
	//   19   41:iconst_1        
	//   20   42:ireturn         
		}
		return false;
	//   21   43:iconst_0        
	//   22   44:ireturn         
	}

	public int hashCode()
	{
		return ((Object) (view)).hashCode() * 31 + values.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field View view>
	//    2    4:invokevirtual   #39  <Method int Object.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #21  <Field Map values>
	//    7   14:invokeinterface #40  <Method int Map.hashCode()>
	//    8   19:iadd            
	//    9   20:ireturn         
	}

	public String toString()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("TransitionValues@");
	//    4    8:aload_1         
	//    5    9:ldc1            #47  <String "TransitionValues@">
	//    6   11:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(Integer.toHexString(hashCode()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #52  <Method int hashCode()>
	//   11   20:invokestatic    #58  <Method String Integer.toHexString(int)>
	//   12   23:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		((StringBuilder) (obj)).append(":\n");
	//   14   27:aload_1         
	//   15   28:ldc1            #60  <String ":\n">
	//   16   30:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   18   34:aload_1         
	//   19   35:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   20   38:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   21   39:new             #44  <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #45  <Method void StringBuilder()>
	//   24   46:astore_2        
		stringbuilder.append(((String) (obj)));
	//   25   47:aload_2         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
		stringbuilder.append("    view = ");
	//   29   53:aload_2         
	//   30   54:ldc1            #64  <String "    view = ">
	//   31   56:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
		stringbuilder.append(((Object) (view)));
	//   33   60:aload_2         
	//   34   61:aload_0         
	//   35   62:getfield        #31  <Field View view>
	//   36   65:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   37   68:pop             
		stringbuilder.append("\n");
	//   38   69:aload_2         
	//   39   70:ldc1            #69  <String "\n">
	//   40   72:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
		obj = ((Object) (stringbuilder.toString()));
	//   42   76:aload_2         
	//   43   77:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   44   80:astore_1        
		stringbuilder = new StringBuilder();
	//   45   81:new             #44  <Class StringBuilder>
	//   46   84:dup             
	//   47   85:invokespecial   #45  <Method void StringBuilder()>
	//   48   88:astore_2        
		stringbuilder.append(((String) (obj)));
	//   49   89:aload_2         
	//   50   90:aload_1         
	//   51   91:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append("    values:");
	//   53   95:aload_2         
	//   54   96:ldc1            #71  <String "    values:">
	//   55   98:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   56  101:pop             
		obj = ((Object) (stringbuilder.toString()));
	//   57  102:aload_2         
	//   58  103:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   59  106:astore_1        
		for(Iterator iterator = values.keySet().iterator(); iterator.hasNext();)
	//*  60  107:aload_0         
	//*  61  108:getfield        #21  <Field Map values>
	//*  62  111:invokeinterface #75  <Method Set Map.keySet()>
	//*  63  116:invokeinterface #81  <Method Iterator Set.iterator()>
	//*  64  121:astore_2        
	//*  65  122:aload_2         
	//*  66  123:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//*  67  128:ifeq            213
		{
			String s = (String)iterator.next();
	//   68  131:aload_2         
	//   69  132:invokeinterface #91  <Method Object Iterator.next()>
	//   70  137:checkcast       #93  <Class String>
	//   71  140:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   72  141:new             #44  <Class StringBuilder>
	//   73  144:dup             
	//   74  145:invokespecial   #45  <Method void StringBuilder()>
	//   75  148:astore          4
			stringbuilder1.append(((String) (obj)));
	//   76  150:aload           4
	//   77  152:aload_1         
	//   78  153:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   79  156:pop             
			stringbuilder1.append("    ");
	//   80  157:aload           4
	//   81  159:ldc1            #95  <String "    ">
	//   82  161:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   83  164:pop             
			stringbuilder1.append(s);
	//   84  165:aload           4
	//   85  167:aload_3         
	//   86  168:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   87  171:pop             
			stringbuilder1.append(": ");
	//   88  172:aload           4
	//   89  174:ldc1            #97  <String ": ">
	//   90  176:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   91  179:pop             
			stringbuilder1.append(values.get(((Object) (s))));
	//   92  180:aload           4
	//   93  182:aload_0         
	//   94  183:getfield        #21  <Field Map values>
	//   95  186:aload_3         
	//   96  187:invokeinterface #101 <Method Object Map.get(Object)>
	//   97  192:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   98  195:pop             
			stringbuilder1.append("\n");
	//   99  196:aload           4
	//  100  198:ldc1            #69  <String "\n">
	//  101  200:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  102  203:pop             
			obj = ((Object) (stringbuilder1.toString()));
	//  103  204:aload           4
	//  104  206:invokevirtual   #62  <Method String StringBuilder.toString()>
	//  105  209:astore_1        
		}

	//* 106  210:goto            122
		return ((String) (obj));
	//  107  213:aload_1         
	//  108  214:areturn         
	}

	final ArrayList mTargetedTransitions = new ArrayList();
	public final Map values = new HashMap();
	public View view;
}
