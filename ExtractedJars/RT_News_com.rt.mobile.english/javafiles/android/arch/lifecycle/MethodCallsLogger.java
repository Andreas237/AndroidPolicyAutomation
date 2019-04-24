// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.util.HashMap;
import java.util.Map;

public class MethodCallsLogger
{

	public MethodCallsLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mCalledMethods = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #20  <Field Map mCalledMethods>
	//    7   15:return          
	}

	public boolean approveCall(String s, int i)
	{
		Integer integer = (Integer)mCalledMethods.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Map mCalledMethods>
	//    2    4:aload_1         
	//    3    5:invokeinterface #29  <Method Object Map.get(Object)>
	//    4   10:checkcast       #31  <Class Integer>
	//    5   13:astore          5
		boolean flag = false;
	//    6   15:iconst_0        
	//    7   16:istore          4
		int j;
		if(integer != null)
	//*   8   18:aload           5
	//*   9   20:ifnull          32
			j = integer.intValue();
	//   10   23:aload           5
	//   11   25:invokevirtual   #35  <Method int Integer.intValue()>
	//   12   28:istore_3        
		else
	//*  13   29:goto            34
			j = 0;
	//   14   32:iconst_0        
	//   15   33:istore_3        
		if((j & i) != 0)
	//*  16   34:iload_3         
	//*  17   35:iload_2         
	//*  18   36:iand            
	//*  19   37:ifeq            43
			flag = true;
	//   20   40:iconst_1        
	//   21   41:istore          4
		mCalledMethods.put(((Object) (s)), ((Object) (Integer.valueOf(i | j))));
	//   22   43:aload_0         
	//   23   44:getfield        #20  <Field Map mCalledMethods>
	//   24   47:aload_1         
	//   25   48:iload_2         
	//   26   49:iload_3         
	//   27   50:ior             
	//   28   51:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   29   54:invokeinterface #43  <Method Object Map.put(Object, Object)>
	//   30   59:pop             
		return flag ^ true;
	//   31   60:iload           4
	//   32   62:iconst_1        
	//   33   63:ixor            
	//   34   64:ireturn         
	}

	private Map mCalledMethods;
}
