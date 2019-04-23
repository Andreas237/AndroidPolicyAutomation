// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.al;

public final class yq
{

	public yq(String s, double d1, double d2, double d3, 
			int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String a>
		e = d1;
	//    5    9:aload_0         
	//    6   10:dload_2         
	//    7   11:putfield        #21  <Field double e>
		d = d2;
	//    8   14:aload_0         
	//    9   15:dload           4
	//   10   17:putfield        #23  <Field double d>
		b = d3;
	//   11   20:aload_0         
	//   12   21:dload           6
	//   13   23:putfield        #25  <Field double b>
		c = i;
	//   14   26:aload_0         
	//   15   27:iload           8
	//   16   29:putfield        #27  <Field int c>
	//   17   32:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof yq))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class yq>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((yq)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class yq>
	//    7   13:astore_1        
		return ak.a(((Object) (a)), ((Object) (((yq) (obj)).a))) && d == ((yq) (obj)).d && e == ((yq) (obj)).e && c == ((yq) (obj)).c && Double.compare(b, ((yq) (obj)).b) == 0;
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field String a>
	//   10   18:aload_1         
	//   11   19:getfield        #19  <Field String a>
	//   12   22:invokestatic    #35  <Method boolean ak.a(Object, Object)>
	//   13   25:ifeq            79
	//   14   28:aload_0         
	//   15   29:getfield        #23  <Field double d>
	//   16   32:aload_1         
	//   17   33:getfield        #23  <Field double d>
	//   18   36:dcmpl           
	//   19   37:ifne            79
	//   20   40:aload_0         
	//   21   41:getfield        #21  <Field double e>
	//   22   44:aload_1         
	//   23   45:getfield        #21  <Field double e>
	//   24   48:dcmpl           
	//   25   49:ifne            79
	//   26   52:aload_0         
	//   27   53:getfield        #27  <Field int c>
	//   28   56:aload_1         
	//   29   57:getfield        #27  <Field int c>
	//   30   60:icmpne          79
	//   31   63:aload_0         
	//   32   64:getfield        #25  <Field double b>
	//   33   67:aload_1         
	//   34   68:getfield        #25  <Field double b>
	//   35   71:invokestatic    #41  <Method int Double.compare(double, double)>
	//   36   74:ifne            79
	//   37   77:iconst_1        
	//   38   78:ireturn         
	//   39   79:iconst_0        
	//   40   80:ireturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			a, Double.valueOf(d), Double.valueOf(e), Double.valueOf(b), Integer.valueOf(c)
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field String a>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #23  <Field double d>
	//   11   17:invokestatic    #47  <Method Double Double.valueOf(double)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #21  <Field double e>
	//   17   27:invokestatic    #47  <Method Double Double.valueOf(double)>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #25  <Field double b>
	//   23   37:invokestatic    #47  <Method Double Double.valueOf(double)>
	//   24   40:aastore         
	//   25   41:dup             
	//   26   42:iconst_4        
	//   27   43:aload_0         
	//   28   44:getfield        #27  <Field int c>
	//   29   47:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   30   50:aastore         
	//   31   51:invokestatic    #55  <Method int ak.a(Object[])>
	//   32   54:ireturn         
	}

	public final String toString()
	{
		return ak.a(((Object) (this))).a("name", ((Object) (a))).a("minBound", ((Object) (Double.valueOf(e)))).a("maxBound", ((Object) (Double.valueOf(d)))).a("percent", ((Object) (Double.valueOf(b)))).a("count", ((Object) (Integer.valueOf(c)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #60  <Method al ak.a(Object)>
	//    2    4:ldc1            #62  <String "name">
	//    3    6:aload_0         
	//    4    7:getfield        #19  <Field String a>
	//    5   10:invokevirtual   #67  <Method al al.a(String, Object)>
	//    6   13:ldc1            #69  <String "minBound">
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field double e>
	//    9   19:invokestatic    #47  <Method Double Double.valueOf(double)>
	//   10   22:invokevirtual   #67  <Method al al.a(String, Object)>
	//   11   25:ldc1            #71  <String "maxBound">
	//   12   27:aload_0         
	//   13   28:getfield        #23  <Field double d>
	//   14   31:invokestatic    #47  <Method Double Double.valueOf(double)>
	//   15   34:invokevirtual   #67  <Method al al.a(String, Object)>
	//   16   37:ldc1            #73  <String "percent">
	//   17   39:aload_0         
	//   18   40:getfield        #25  <Field double b>
	//   19   43:invokestatic    #47  <Method Double Double.valueOf(double)>
	//   20   46:invokevirtual   #67  <Method al al.a(String, Object)>
	//   21   49:ldc1            #75  <String "count">
	//   22   51:aload_0         
	//   23   52:getfield        #27  <Field int c>
	//   24   55:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   25   58:invokevirtual   #67  <Method al al.a(String, Object)>
	//   26   61:invokevirtual   #77  <Method String al.toString()>
	//   27   64:areturn         
	}

	public final String a;
	public final double b;
	public final int c;
	private final double d;
	private final double e;
}
