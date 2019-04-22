// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class dj
{

	public dj(int i)
	{
		this(i, (int)TimeUnit.SECONDS.toMillis(1L));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #31  <Field TimeUnit TimeUnit.SECONDS>
	//    3    5:lconst_1        
	//    4    6:invokevirtual   #35  <Method long TimeUnit.toMillis(long)>
	//    5    9:l2i             
	//    6   10:invokespecial   #38  <Method void dj(int, int)>
	//    7   13:return          
	}

	public dj(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		b = new Random();
	//    2    4:aload_0         
	//    3    5:new             #42  <Class Random>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void Random()>
	//    6   12:putfield        #45  <Field Random b>
		e = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #47  <Field int e>
		c = i;
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:putfield        #49  <Field int c>
		d = j;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:putfield        #51  <Field int d>
	//   16   30:return          
	}

	static int a(Random random, int i, int j)
	{
		return random.nextInt(Math.abs(i - j)) + Math.min(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:isub            
	//    4    4:invokestatic    #59  <Method int Math.abs(int)>
	//    5    7:invokevirtual   #62  <Method int Random.nextInt(int)>
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:invokestatic    #66  <Method int Math.min(int, int)>
	//    9   15:iadd            
	//   10   16:ireturn         
	}

	public int a(int i)
	{
		String s = a;
	//    0    0:getstatic       #22  <Field String a>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #69  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #70  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Computing new sleep delay. Previous sleep delay: ");
	//    6   13:aload           4
	//    7   15:ldc1            #72  <String "Computing new sleep delay. Previous sleep delay: ">
	//    8   17:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(e);
	//   10   21:aload           4
	//   11   23:aload_0         
	//   12   24:getfield        #47  <Field int e>
	//   13   27:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   14   30:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   15   31:aload_3         
	//   16   32:aload           4
	//   17   34:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   18   37:invokestatic    #86  <Method int AppboyLogger.d(String, String)>
	//   19   40:pop             
		int j = a(b, i, e * 3);
	//   20   41:aload_0         
	//   21   42:getfield        #45  <Field Random b>
	//   22   45:iload_1         
	//   23   46:aload_0         
	//   24   47:getfield        #47  <Field int e>
	//   25   50:iconst_3        
	//   26   51:imul            
	//   27   52:invokestatic    #88  <Method int a(Random, int, int)>
	//   28   55:istore_2        
		e = Math.min(c, j);
	//   29   56:aload_0         
	//   30   57:aload_0         
	//   31   58:getfield        #49  <Field int c>
	//   32   61:iload_2         
	//   33   62:invokestatic    #66  <Method int Math.min(int, int)>
	//   34   65:putfield        #47  <Field int e>
		s = a;
	//   35   68:getstatic       #22  <Field String a>
	//   36   71:astore_3        
		stringbuilder = new StringBuilder();
	//   37   72:new             #69  <Class StringBuilder>
	//   38   75:dup             
	//   39   76:invokespecial   #70  <Method void StringBuilder()>
	//   40   79:astore          4
		stringbuilder.append("New sleep duration: ");
	//   41   81:aload           4
	//   42   83:ldc1            #90  <String "New sleep duration: ">
	//   43   85:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
		stringbuilder.append(e);
	//   45   89:aload           4
	//   46   91:aload_0         
	//   47   92:getfield        #47  <Field int e>
	//   48   95:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   49   98:pop             
		stringbuilder.append(" ms. Default sleep duration: ");
	//   50   99:aload           4
	//   51  101:ldc1            #92  <String " ms. Default sleep duration: ">
	//   52  103:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   53  106:pop             
		stringbuilder.append(i);
	//   54  107:aload           4
	//   55  109:iload_1         
	//   56  110:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   57  113:pop             
		stringbuilder.append(" ms. Max sleep: ");
	//   58  114:aload           4
	//   59  116:ldc1            #94  <String " ms. Max sleep: ">
	//   60  118:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   61  121:pop             
		stringbuilder.append(c);
	//   62  122:aload           4
	//   63  124:aload_0         
	//   64  125:getfield        #49  <Field int c>
	//   65  128:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   66  131:pop             
		stringbuilder.append(" ms.");
	//   67  132:aload           4
	//   68  134:ldc1            #96  <String " ms.">
	//   69  136:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   70  139:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   71  140:aload_3         
	//   72  141:aload           4
	//   73  143:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   74  146:invokestatic    #86  <Method int AppboyLogger.d(String, String)>
	//   75  149:pop             
		return e;
	//   76  150:aload_0         
	//   77  151:getfield        #47  <Field int e>
	//   78  154:ireturn         
	}

	public void a()
	{
		e = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #47  <Field int e>
	//    3    5:return          
	}

	public boolean b()
	{
		return e != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int e>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int c()
	{
		return a(d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int d>
	//    3    5:invokevirtual   #100 <Method int a(int)>
	//    4    8:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dj);
	private final Random b;
	private final int c;
	private final int d;
	private int e;

	static 
	{
	//    0    0:ldc1            #2   <Class dj>
	//    1    2:invokestatic    #20  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #22  <Field String a>
	//*   3    8:return          
	}
}
