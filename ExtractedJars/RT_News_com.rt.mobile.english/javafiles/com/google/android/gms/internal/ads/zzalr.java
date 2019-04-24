// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

public final class zzalr
{

	public zzalr(String s, double d, double d1, double d2, 
			int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String name>
		zzcta = d;
	//    5    9:aload_0         
	//    6   10:dload_2         
	//    7   11:putfield        #21  <Field double zzcta>
		zzcsz = d1;
	//    8   14:aload_0         
	//    9   15:dload           4
	//   10   17:putfield        #23  <Field double zzcsz>
		zzctb = d2;
	//   11   20:aload_0         
	//   12   21:dload           6
	//   13   23:putfield        #25  <Field double zzctb>
		count = i;
	//   14   26:aload_0         
	//   15   27:iload           8
	//   16   29:putfield        #27  <Field int count>
	//   17   32:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof zzalr))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class zzalr>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((zzalr)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class zzalr>
	//    7   13:astore_1        
		return Objects.equal(((Object) (name)), ((Object) (((zzalr) (obj)).name))) && zzcsz == ((zzalr) (obj)).zzcsz && zzcta == ((zzalr) (obj)).zzcta && count == ((zzalr) (obj)).count && Double.compare(zzctb, ((zzalr) (obj)).zzctb) == 0;
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field String name>
	//   10   18:aload_1         
	//   11   19:getfield        #19  <Field String name>
	//   12   22:invokestatic    #36  <Method boolean Objects.equal(Object, Object)>
	//   13   25:ifeq            79
	//   14   28:aload_0         
	//   15   29:getfield        #23  <Field double zzcsz>
	//   16   32:aload_1         
	//   17   33:getfield        #23  <Field double zzcsz>
	//   18   36:dcmpl           
	//   19   37:ifne            79
	//   20   40:aload_0         
	//   21   41:getfield        #21  <Field double zzcta>
	//   22   44:aload_1         
	//   23   45:getfield        #21  <Field double zzcta>
	//   24   48:dcmpl           
	//   25   49:ifne            79
	//   26   52:aload_0         
	//   27   53:getfield        #27  <Field int count>
	//   28   56:aload_1         
	//   29   57:getfield        #27  <Field int count>
	//   30   60:icmpne          79
	//   31   63:aload_0         
	//   32   64:getfield        #25  <Field double zzctb>
	//   33   67:aload_1         
	//   34   68:getfield        #25  <Field double zzctb>
	//   35   71:invokestatic    #42  <Method int Double.compare(double, double)>
	//   36   74:ifne            79
	//   37   77:iconst_1        
	//   38   78:ireturn         
	//   39   79:iconst_0        
	//   40   80:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			name, Double.valueOf(zzcsz), Double.valueOf(zzcta), Double.valueOf(zzctb), Integer.valueOf(count)
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field String name>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #23  <Field double zzcsz>
	//   11   17:invokestatic    #48  <Method Double Double.valueOf(double)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #21  <Field double zzcta>
	//   17   27:invokestatic    #48  <Method Double Double.valueOf(double)>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #25  <Field double zzctb>
	//   23   37:invokestatic    #48  <Method Double Double.valueOf(double)>
	//   24   40:aastore         
	//   25   41:dup             
	//   26   42:iconst_4        
	//   27   43:aload_0         
	//   28   44:getfield        #27  <Field int count>
	//   29   47:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   30   50:aastore         
	//   31   51:invokestatic    #56  <Method int Objects.hashCode(Object[])>
	//   32   54:ireturn         
	}

	public final String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("name", ((Object) (name))).add("minBound", ((Object) (Double.valueOf(zzcta)))).add("maxBound", ((Object) (Double.valueOf(zzcsz)))).add("percent", ((Object) (Double.valueOf(zzctb)))).add("count", ((Object) (Integer.valueOf(count)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #62  <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #63  <String "name">
	//    3    6:aload_0         
	//    4    7:getfield        #19  <Field String name>
	//    5   10:invokevirtual   #69  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    6   13:ldc1            #71  <String "minBound">
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field double zzcta>
	//    9   19:invokestatic    #48  <Method Double Double.valueOf(double)>
	//   10   22:invokevirtual   #69  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   11   25:ldc1            #73  <String "maxBound">
	//   12   27:aload_0         
	//   13   28:getfield        #23  <Field double zzcsz>
	//   14   31:invokestatic    #48  <Method Double Double.valueOf(double)>
	//   15   34:invokevirtual   #69  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   16   37:ldc1            #75  <String "percent">
	//   17   39:aload_0         
	//   18   40:getfield        #25  <Field double zzctb>
	//   19   43:invokestatic    #48  <Method Double Double.valueOf(double)>
	//   20   46:invokevirtual   #69  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   21   49:ldc1            #76  <String "count">
	//   22   51:aload_0         
	//   23   52:getfield        #27  <Field int count>
	//   24   55:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   25   58:invokevirtual   #69  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   26   61:invokevirtual   #78  <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   27   64:areturn         
	}

	public final int count;
	public final String name;
	private final double zzcsz;
	private final double zzcta;
	public final double zzctb;
}
