// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.c.a;
import com.google.ads.interactivemedia.v3.b.d.c;
import com.google.ads.interactivemedia.v3.b.f;
import com.google.ads.interactivemedia.v3.b.w;
import com.google.ads.interactivemedia.v3.b.x;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$15
	implements x
{

	public w a(f f1, a a1)
	{
		if(a1.a() != java/sql/Timestamp)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #22  <Method Class a.a()>
	//*   2    4:ldc1            #24  <Class Timestamp>
	//*   3    6:if_acmpeq       11
			return null;
	//    4    9:aconst_null     
	//    5   10:areturn         
		else
			return ((w) (new w(f1.a(java/util/Date)) {

				public Timestamp a(com.google.ads.interactivemedia.v3.b.d.a a2)
					throws IOException
				{
					a2 = ((com.google.ads.interactivemedia.v3.b.d.a) ((Date)a.read(a2)));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field w a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #30  <Method Object w.read(com.google.ads.interactivemedia.v3.b.d.a)>
				//    4    8:checkcast       #32  <Class Date>
				//    5   11:astore_1        
					if(a2 != null)
				//*   6   12:aload_1         
				//*   7   13:ifnull          28
						return new Timestamp(((Date) (a2)).getTime());
				//    8   16:new             #34  <Class Timestamp>
				//    9   19:dup             
				//   10   20:aload_1         
				//   11   21:invokevirtual   #38  <Method long Date.getTime()>
				//   12   24:invokespecial   #41  <Method void Timestamp(long)>
				//   13   27:areturn         
					else
						return null;
				//   14   28:aconst_null     
				//   15   29:areturn         
				}

				public void a(c c, Timestamp timestamp)
					throws IOException
				{
					a.write(c, ((Object) (timestamp)));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field w a>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokevirtual   #47  <Method void w.write(c, Object)>
				//    5    9:return          
				}

				public Object read(com.google.ads.interactivemedia.v3.b.d.a a2)
					throws IOException
				{
					return ((Object) (a(a2)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #49  <Method Timestamp a(com.google.ads.interactivemedia.v3.b.d.a)>
				//    3    5:areturn         
				}

				public void write(c c, Object obj)
					throws IOException
				{
					a(c, (Timestamp)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #34  <Class Timestamp>
				//    4    6:invokevirtual   #51  <Method void a(c, Timestamp)>
				//    5    9:return          
				}

				final w a;
				final m._cls15 b;

			
			{
				b = m._cls15.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field m$15 b>
				a = w1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field w a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void w()>
			//    8   14:return          
			}
			}
));
	//    6   11:new             #10  <Class m$15$1>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:ldc1            #26  <Class Date>
	//   11   19:invokevirtual   #31  <Method w f.a(Class)>
	//   12   22:invokespecial   #34  <Method void m$15$1(m$15, w)>
	//   13   25:areturn         
	}

	m$15()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
