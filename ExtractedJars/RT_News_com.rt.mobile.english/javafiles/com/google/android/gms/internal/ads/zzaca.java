// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzank, zzoj, zzabv

final class zzaca
	implements zzank
{

	zzaca(zzabv zzabv, String s, Integer integer, Integer integer1, int i, int j, int k, 
			int l, boolean flag)
	{
		zzcan = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #23  <Field String zzcan>
		zzcao = integer;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #25  <Field Integer zzcao>
		zzcap = integer1;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #27  <Field Integer zzcap>
		zzcaq = i;
	//    9   16:aload_0         
	//   10   17:iload           5
	//   11   19:putfield        #29  <Field int zzcaq>
		zzcar = j;
	//   12   22:aload_0         
	//   13   23:iload           6
	//   14   25:putfield        #31  <Field int zzcar>
		zzcas = k;
	//   15   28:aload_0         
	//   16   29:iload           7
	//   17   31:putfield        #33  <Field int zzcas>
		zzcat = l;
	//   18   34:aload_0         
	//   19   35:iload           8
	//   20   37:putfield        #35  <Field int zzcat>
		zzcau = flag;
	//   21   40:aload_0         
	//   22   41:iload           9
	//   23   43:putfield        #37  <Field boolean zzcau>
		super();
	//   24   46:aload_0         
	//   25   47:invokespecial   #40  <Method void Object()>
	//   26   50:return          
	}

	public final Object apply(Object obj)
	{
		List list = (List)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #45  <Class List>
	//    2    4:astore_2        
		obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_1        
		if(list != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          86
		{
			if(list.isEmpty())
	//*   7   11:aload_2         
	//*   8   12:invokeinterface #49  <Method boolean List.isEmpty()>
	//*   9   17:ifeq            22
				return ((Object) (null));
	//   10   20:aconst_null     
	//   11   21:areturn         
			String s = zzcan;
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field String zzcan>
	//   14   26:astore_3        
			Integer integer = zzcao;
	//   15   27:aload_0         
	//   16   28:getfield        #25  <Field Integer zzcao>
	//   17   31:astore          4
			Integer integer1 = zzcap;
	//   18   33:aload_0         
	//   19   34:getfield        #27  <Field Integer zzcap>
	//   20   37:astore          5
			if(zzcaq > 0)
	//*  21   39:aload_0         
	//*  22   40:getfield        #29  <Field int zzcaq>
	//*  23   43:ifle            54
				obj = ((Object) (Integer.valueOf(zzcaq)));
	//   24   46:aload_0         
	//   25   47:getfield        #29  <Field int zzcaq>
	//   26   50:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   27   53:astore_1        
			return ((Object) (new zzoj(s, list, integer, integer1, ((Integer) (obj)), zzcar + zzcas, zzcat, zzcau)));
	//   28   54:new             #57  <Class zzoj>
	//   29   57:dup             
	//   30   58:aload_3         
	//   31   59:aload_2         
	//   32   60:aload           4
	//   33   62:aload           5
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:getfield        #31  <Field int zzcar>
	//   37   69:aload_0         
	//   38   70:getfield        #33  <Field int zzcas>
	//   39   73:iadd            
	//   40   74:aload_0         
	//   41   75:getfield        #35  <Field int zzcat>
	//   42   78:aload_0         
	//   43   79:getfield        #37  <Field boolean zzcau>
	//   44   82:invokespecial   #60  <Method void zzoj(String, List, Integer, Integer, Integer, int, int, boolean)>
	//   45   85:areturn         
		} else
		{
			return ((Object) (null));
	//   46   86:aconst_null     
	//   47   87:areturn         
		}
	}

	private final String zzcan;
	private final Integer zzcao;
	private final Integer zzcap;
	private final int zzcaq;
	private final int zzcar;
	private final int zzcas;
	private final int zzcat;
	private final boolean zzcau;
}
