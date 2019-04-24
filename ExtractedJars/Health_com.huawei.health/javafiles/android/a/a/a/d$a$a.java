// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.a.a.a:
//			d, p

public static final class d$a$a
{

	public d$a$a a(d$a$b d$a$b1)
	{
		d$a$b1.a(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #61  <Method d$a$a d$a$b.a(d$a$a)>
	//    3    7:pop             
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$a$a a(p p1)
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field ArrayList e>
	//*   2    4:ifnonnull       18
			e = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #66  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #67  <Method void ArrayList()>
	//    7   15:putfield        #64  <Field ArrayList e>
		e.add(((Object) (p1)));
	//    8   18:aload_0         
	//    9   19:getfield        #64  <Field ArrayList e>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public d$a$a a(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			d.putAll(bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field Bundle d>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #75  <Method void Bundle.putAll(Bundle)>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public Bundle a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Bundle d>
	//    2    4:areturn         
	}

	public d.a b()
	{
		p ap[];
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field ArrayList e>
	//*   2    4:ifnull          31
			ap = (p[])e.toArray(((Object []) (new p[e.size()])));
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field ArrayList e>
	//    5   11:aload_0         
	//    6   12:getfield        #64  <Field ArrayList e>
	//    7   15:invokevirtual   #81  <Method int ArrayList.size()>
	//    8   18:anewarray       p[]
	//    9   21:invokevirtual   #87  <Method Object[] ArrayList.toArray(Object[])>
	//   10   24:checkcast       #89  <Class p[]>
	//   11   27:astore_1        
		else
	//*  12   28:goto            33
			ap = null;
	//   13   31:aconst_null     
	//   14   32:astore_1        
		return new d.a(a, b, c, d, ap, ((d._cls2) (null)));
	//   15   33:new             #6   <Class d$a>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:getfield        #33  <Field int a>
	//   19   41:aload_0         
	//   20   42:getfield        #41  <Field CharSequence b>
	//   21   45:aload_0         
	//   22   46:getfield        #43  <Field PendingIntent c>
	//   23   49:aload_0         
	//   24   50:getfield        #45  <Field Bundle d>
	//   25   53:aload_1         
	//   26   54:aconst_null     
	//   27   55:invokespecial   #92  <Method void d$a(int, CharSequence, PendingIntent, Bundle, p[], d$2)>
	//   28   58:areturn         
	}

	private final int a;
	private final CharSequence b;
	private final PendingIntent c;
	private final Bundle d;
	private ArrayList e;

	public d$a$a(int i, CharSequence charsequence, PendingIntent pendingintent)
	{
		this(i, charsequence, pendingintent, new Bundle());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #23  <Class Bundle>
	//    5    7:dup             
	//    6    8:invokespecial   #26  <Method void Bundle()>
	//    7   11:invokespecial   #29  <Method void d$a$a(int, CharSequence, PendingIntent, Bundle)>
	//    8   14:return          
	}

	private d$a$a(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int a>
		b = android.a.a.a.d.d.f(charsequence);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #39  <Method CharSequence d$d.f(CharSequence)>
	//    8   14:putfield        #41  <Field CharSequence b>
		c = pendingintent;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #43  <Field PendingIntent c>
		d = bundle;
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:putfield        #45  <Field Bundle d>
	//   15   28:return          
	}

	public d$a$a(d.a a1)
	{
		this(a1.a, a1.b, a1.c, new Bundle(android.a.a.a.d.a.a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #47  <Field int d$a.a>
	//    3    5:aload_1         
	//    4    6:getfield        #48  <Field CharSequence d$a.b>
	//    5    9:aload_1         
	//    6   10:getfield        #49  <Field PendingIntent d$a.c>
	//    7   13:new             #23  <Class Bundle>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokestatic    #52  <Method Bundle d$a.a(d$a)>
	//   11   21:invokespecial   #55  <Method void Bundle(Bundle)>
	//   12   24:invokespecial   #29  <Method void d$a$a(int, CharSequence, PendingIntent, Bundle)>
	//   13   27:return          
	}
}
