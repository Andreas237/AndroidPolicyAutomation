// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzalp

public final class zzals
{

	public zzals()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field List zzctc>
	//    7   15:aload_0         
	//    8   16:new             #16  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #17  <Method void ArrayList()>
	//   11   23:putfield        #21  <Field List zzctd>
	//   12   26:aload_0         
	//   13   27:new             #16  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #17  <Method void ArrayList()>
	//   16   34:putfield        #23  <Field List zzcte>
	//   17   37:return          
	}

	static List zza(zzals zzals1)
	{
		return zzals1.zzctd;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List zzctd>
	//    2    4:areturn         
	}

	static List zzb(zzals zzals1)
	{
		return zzals1.zzctc;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List zzctc>
	//    2    4:areturn         
	}

	static List zzc(zzals zzals1)
	{
		return zzals1.zzcte;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List zzcte>
	//    2    4:areturn         
	}

	public final zzals zza(String s, double d, double d1)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          10
		do
		{
			if(i >= zzctc.size())
				break;
	//    2    3:iload           10
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field List zzctc>
	//    5    9:invokeinterface #35  <Method int List.size()>
	//    6   14:icmpge          86
			double d2 = ((Double)zzcte.get(i)).doubleValue();
	//    7   17:aload_0         
	//    8   18:getfield        #23  <Field List zzcte>
	//    9   21:iload           10
	//   10   23:invokeinterface #39  <Method Object List.get(int)>
	//   11   28:checkcast       #41  <Class Double>
	//   12   31:invokevirtual   #45  <Method double Double.doubleValue()>
	//   13   34:dstore          6
			double d3 = ((Double)zzctd.get(i)).doubleValue();
	//   14   36:aload_0         
	//   15   37:getfield        #21  <Field List zzctd>
	//   16   40:iload           10
	//   17   42:invokeinterface #39  <Method Object List.get(int)>
	//   18   47:checkcast       #41  <Class Double>
	//   19   50:invokevirtual   #45  <Method double Double.doubleValue()>
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
		zzctc.add(i, ((Object) (s)));
	//   38   86:aload_0         
	//   39   87:getfield        #19  <Field List zzctc>
	//   40   90:iload           10
	//   41   92:aload_1         
	//   42   93:invokeinterface #49  <Method void List.add(int, Object)>
		zzcte.add(i, ((Object) (Double.valueOf(d))));
	//   43   98:aload_0         
	//   44   99:getfield        #23  <Field List zzcte>
	//   45  102:iload           10
	//   46  104:dload_2         
	//   47  105:invokestatic    #53  <Method Double Double.valueOf(double)>
	//   48  108:invokeinterface #49  <Method void List.add(int, Object)>
		zzctd.add(i, ((Object) (Double.valueOf(d1))));
	//   49  113:aload_0         
	//   50  114:getfield        #21  <Field List zzctd>
	//   51  117:iload           10
	//   52  119:dload           4
	//   53  121:invokestatic    #53  <Method Double Double.valueOf(double)>
	//   54  124:invokeinterface #49  <Method void List.add(int, Object)>
		return this;
	//   55  129:aload_0         
	//   56  130:areturn         
	}

	public final zzalp zzrz()
	{
		return new zzalp(this, ((zzalq) (null)));
	//    0    0:new             #57  <Class zzalp>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #60  <Method void zzalp(zzals, zzalq)>
	//    5    9:areturn         
	}

	private final List zzctc = new ArrayList();
	private final List zzctd = new ArrayList();
	private final List zzcte = new ArrayList();
}
