// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bli, bnw, zzfs, bld, 
//			blf, bks

public abstract class ble
{

	private ble(String s, long l, zzfs zzfs, String s1, bli bli1, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		e = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String e>
		f = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #25  <Field long f>
		a = zzfs;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #27  <Field zzfs a>
		b = s1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #29  <Field String b>
		if(list == null)
	//*  14   26:aload           7
	//*  15   28:ifnonnull       38
			s = ((String) (Collections.emptyList()));
	//   16   31:invokestatic    #35  <Method List Collections.emptyList()>
	//   17   34:astore_1        
		else
	//*  18   35:goto            44
			s = ((String) (Collections.unmodifiableList(list)));
	//   19   38:aload           7
	//   20   40:invokestatic    #39  <Method List Collections.unmodifiableList(List)>
	//   21   43:astore_1        
		d = ((List) (s));
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:putfield        #41  <Field List d>
		g = bli1.a(this);
	//   25   49:aload_0         
	//   26   50:aload           6
	//   27   52:aload_0         
	//   28   53:invokevirtual   #46  <Method bld bli.a(ble)>
	//   29   56:putfield        #48  <Field bld g>
		c = bnw.a(bli1.c, 0xf4240L, bli1.b);
	//   30   59:aload_0         
	//   31   60:aload           6
	//   32   62:getfield        #50  <Field long bli.c>
	//   33   65:ldc2w           #51  <Long 0xf4240L>
	//   34   68:aload           6
	//   35   70:getfield        #54  <Field long bli.b>
	//   36   73:invokestatic    #59  <Method long bnw.a(long, long, long)>
	//   37   76:putfield        #60  <Field long c>
	//   38   79:return          
	}

	ble(String s, long l, zzfs zzfs, String s1, bli bli1, List list, 
			blf blf)
	{
		this(s, l, zzfs, s1, bli1, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:invokespecial   #64  <Method void ble(String, long, zzfs, String, bli, List)>
	//    8   14:return          
	}

	public final bld c()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field bld g>
	//    2    4:areturn         
	}

	public abstract bld d();

	public abstract bks e();

	public abstract String f();

	public final zzfs a;
	public final String b;
	public final long c;
	public final List d;
	private final String e;
	private final long f;
	private final bld g;
}
