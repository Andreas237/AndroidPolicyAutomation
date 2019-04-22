// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.b.f;
import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.t;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$3 extends w
{

	public Number a(a a1)
		throws IOException
	{
		Object obj = ((Object) (a1.f()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method b a.f()>
	//    2    4:astore_3        
		int i = com.google.ads.interactivemedia.v3.b.b.a..a[((b) (obj)).ordinal()];
	//    3    5:getstatic       #27  <Field int[] com.google.ads.interactivemedia.v3.b.b.a.m$26.a>
	//    4    8:aload_3         
	//    5    9:invokevirtual   #33  <Method int b.ordinal()>
	//    6   12:iaload          
	//    7   13:istore_2        
		if(i != 1)
	//*   8   14:iload_2         
	//*   9   15:iconst_1        
	//*  10   16:icmpeq          78
		{
			if(i == 4)
	//*  11   19:iload_2         
	//*  12   20:iconst_4        
	//*  13   21:icmpne          30
			{
				a1.j();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #36  <Method void a.j()>
				return null;
	//   16   28:aconst_null     
	//   17   29:areturn         
			} else
			{
				a1 = ((a) (String.valueOf(obj)));
	//   18   30:aload_3         
	//   19   31:invokestatic    #42  <Method String String.valueOf(Object)>
	//   20   34:astore_1        
				obj = ((Object) (new StringBuilder(String.valueOf(((Object) (a1))).length() + 23)));
	//   21   35:new             #44  <Class StringBuilder>
	//   22   38:dup             
	//   23   39:aload_1         
	//   24   40:invokestatic    #42  <Method String String.valueOf(Object)>
	//   25   43:invokevirtual   #47  <Method int String.length()>
	//   26   46:bipush          23
	//   27   48:iadd            
	//   28   49:invokespecial   #50  <Method void StringBuilder(int)>
	//   29   52:astore_3        
				((StringBuilder) (obj)).append("Expecting number, got: ");
	//   30   53:aload_3         
	//   31   54:ldc1            #52  <String "Expecting number, got: ">
	//   32   56:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   33   59:pop             
				((StringBuilder) (obj)).append(((String) (a1)));
	//   34   60:aload_3         
	//   35   61:aload_1         
	//   36   62:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   37   65:pop             
				throw new t(((StringBuilder) (obj)).toString());
	//   38   66:new             #58  <Class t>
	//   39   69:dup             
	//   40   70:aload_3         
	//   41   71:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   42   74:invokespecial   #65  <Method void t(String)>
	//   43   77:athrow          
			}
		} else
		{
			return ((Number) (new f(a1.h())));
	//   44   78:new             #67  <Class f>
	//   45   81:dup             
	//   46   82:aload_1         
	//   47   83:invokevirtual   #70  <Method String a.h()>
	//   48   86:invokespecial   #71  <Method void f(String)>
	//   49   89:areturn         
		}
	}

	public void a(c c1, Number number)
		throws IOException
	{
		c1.a(number);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #78  <Method c c.a(Number)>
	//    3    5:pop             
	//    4    6:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method Number a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #86  <Class Number>
	//    4    6:invokevirtual   #88  <Method void a(c, Number)>
	//    5    9:return          
	}

	m$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
