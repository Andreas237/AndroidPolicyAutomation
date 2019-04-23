// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			yo

public final class yr
{

	public yr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void ArrayList()>
	//    6   12:putfield        #17  <Field List a>
	//    7   15:aload_0         
	//    8   16:new             #14  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #15  <Method void ArrayList()>
	//   11   23:putfield        #19  <Field List b>
	//   12   26:aload_0         
	//   13   27:new             #14  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #15  <Method void ArrayList()>
	//   16   34:putfield        #21  <Field List c>
	//   17   37:return          
	}

	static List a(yr yr1)
	{
		return yr1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List b>
	//    2    4:areturn         
	}

	static List b(yr yr1)
	{
		return yr1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List a>
	//    2    4:areturn         
	}

	static List c(yr yr1)
	{
		return yr1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List c>
	//    2    4:areturn         
	}

	public final yo a()
	{
		return new yo(this, ((yp) (null)));
	//    0    0:new             #26  <Class yo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #29  <Method void yo(yr, yp)>
	//    5    9:areturn         
	}

	public final yr a(String s, double d, double d1)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          10
		do
		{
			if(i >= a.size())
				break;
	//    2    3:iload           10
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field List a>
	//    5    9:invokeinterface #36  <Method int List.size()>
	//    6   14:icmpge          86
			double d2 = ((Double)c.get(i)).doubleValue();
	//    7   17:aload_0         
	//    8   18:getfield        #21  <Field List c>
	//    9   21:iload           10
	//   10   23:invokeinterface #40  <Method Object List.get(int)>
	//   11   28:checkcast       #42  <Class Double>
	//   12   31:invokevirtual   #46  <Method double Double.doubleValue()>
	//   13   34:dstore          6
			double d3 = ((Double)b.get(i)).doubleValue();
	//   14   36:aload_0         
	//   15   37:getfield        #19  <Field List b>
	//   16   40:iload           10
	//   17   42:invokeinterface #40  <Method Object List.get(int)>
	//   18   47:checkcast       #42  <Class Double>
	//   19   50:invokevirtual   #46  <Method double Double.doubleValue()>
	//   20   53:dstore          8
			if(d < d2 || d2 == d && d1 < d3)
				break;
	//   21   55:dload_2         
	//   22   56:dload           6
	//   23   58:dcmpg           
	//   24   59:iflt            86
	//   25   62:dload           6
	//   26   64:dload_2         
	//   27   65:dcmpl           
	//   28   66:ifne            77
	//   29   69:dload           4
	//   30   71:dload           8
	//   31   73:dcmpg           
	//   32   74:iflt            86
			i++;
	//   33   77:iload           10
	//   34   79:iconst_1        
	//   35   80:iadd            
	//   36   81:istore          10
		} while(true);
	//   37   83:goto            3
		a.add(i, ((Object) (s)));
	//   38   86:aload_0         
	//   39   87:getfield        #17  <Field List a>
	//   40   90:iload           10
	//   41   92:aload_1         
	//   42   93:invokeinterface #50  <Method void List.add(int, Object)>
		c.add(i, ((Object) (Double.valueOf(d))));
	//   43   98:aload_0         
	//   44   99:getfield        #21  <Field List c>
	//   45  102:iload           10
	//   46  104:dload_2         
	//   47  105:invokestatic    #54  <Method Double Double.valueOf(double)>
	//   48  108:invokeinterface #50  <Method void List.add(int, Object)>
		b.add(i, ((Object) (Double.valueOf(d1))));
	//   49  113:aload_0         
	//   50  114:getfield        #19  <Field List b>
	//   51  117:iload           10
	//   52  119:dload           4
	//   53  121:invokestatic    #54  <Method Double Double.valueOf(double)>
	//   54  124:invokeinterface #50  <Method void List.add(int, Object)>
		return this;
	//   55  129:aload_0         
	//   56  130:areturn         
	}

	private final List a = new ArrayList();
	private final List b = new ArrayList();
	private final List c = new ArrayList();
}
