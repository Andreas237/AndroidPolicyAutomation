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
		return (obj instanceof TransitionValues) && view == ((TransitionValues)obj).view && values.equals(((Object) (((TransitionValues)obj).values)));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class TransitionValues>
	//    2    4:ifeq            42
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field View view>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class TransitionValues>
	//    7   15:getfield        #31  <Field View view>
	//    8   18:if_acmpne       42
	//    9   21:aload_0         
	//   10   22:getfield        #21  <Field Map values>
	//   11   25:aload_1         
	//   12   26:checkcast       #2   <Class TransitionValues>
	//   13   29:getfield        #21  <Field Map values>
	//   14   32:invokeinterface #35  <Method boolean Map.equals(Object)>
	//   15   37:ifeq            42
	//   16   40:iconst_1        
	//   17   41:ireturn         
	//   18   42:iconst_0        
	//   19   43:ireturn         
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
		String s = (new StringBuilder()).append("TransitionValues@").append(Integer.toHexString(hashCode())).append(":\n").toString();
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:ldc1            #47  <String "TransitionValues@">
	//    4    9:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #52  <Method int hashCode()>
	//    7   16:invokestatic    #58  <Method String Integer.toHexString(int)>
	//    8   19:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #60  <String ":\n">
	//   10   24:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   12   30:astore_1        
		s = (new StringBuilder()).append(s).append("    view = ").append(((Object) (view))).append("\n").toString();
	//   13   31:new             #44  <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #45  <Method void StringBuilder()>
	//   16   38:aload_1         
	//   17   39:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   18   42:ldc1            #64  <String "    view = ">
	//   19   44:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   20   47:aload_0         
	//   21   48:getfield        #31  <Field View view>
	//   22   51:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   23   54:ldc1            #69  <String "\n">
	//   24   56:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   59:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   26   62:astore_1        
		s = (new StringBuilder()).append(s).append("    values:").toString();
	//   27   63:new             #44  <Class StringBuilder>
	//   28   66:dup             
	//   29   67:invokespecial   #45  <Method void StringBuilder()>
	//   30   70:aload_1         
	//   31   71:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   32   74:ldc1            #71  <String "    values:">
	//   33   76:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   34   79:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   35   82:astore_1        
		for(Iterator iterator = values.keySet().iterator(); iterator.hasNext();)
	//*  36   83:aload_0         
	//*  37   84:getfield        #21  <Field Map values>
	//*  38   87:invokeinterface #75  <Method Set Map.keySet()>
	//*  39   92:invokeinterface #81  <Method Iterator Set.iterator()>
	//*  40   97:astore_2        
	//*  41   98:aload_2         
	//*  42   99:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//*  43  104:ifeq            167
		{
			String s1 = (String)iterator.next();
	//   44  107:aload_2         
	//   45  108:invokeinterface #91  <Method Object Iterator.next()>
	//   46  113:checkcast       #93  <Class String>
	//   47  116:astore_3        
			s = (new StringBuilder()).append(s).append("    ").append(s1).append(": ").append(values.get(((Object) (s1)))).append("\n").toString();
	//   48  117:new             #44  <Class StringBuilder>
	//   49  120:dup             
	//   50  121:invokespecial   #45  <Method void StringBuilder()>
	//   51  124:aload_1         
	//   52  125:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   53  128:ldc1            #95  <String "    ">
	//   54  130:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   55  133:aload_3         
	//   56  134:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   57  137:ldc1            #97  <String ": ">
	//   58  139:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   59  142:aload_0         
	//   60  143:getfield        #21  <Field Map values>
	//   61  146:aload_3         
	//   62  147:invokeinterface #101 <Method Object Map.get(Object)>
	//   63  152:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   64  155:ldc1            #69  <String "\n">
	//   65  157:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   66  160:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   67  163:astore_1        
		}

	//*  68  164:goto            98
		return s;
	//   69  167:aload_1         
	//   70  168:areturn         
	}

	final ArrayList mTargetedTransitions = new ArrayList();
	public final Map values = new HashMap();
	public View view;
}
