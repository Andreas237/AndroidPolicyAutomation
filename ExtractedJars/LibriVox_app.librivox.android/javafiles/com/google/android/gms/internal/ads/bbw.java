// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, akh, bav

public final class bbw extends bcg
{

	public bbw(bav bav1, String s, String s1, akh akh1, int i, int j)
	{
		super(bav1, s, s1, akh1, i, 31);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          31
	//    7   10:invokespecial   #10  <Method void bcg(bav, String, String, akh, int, int)>
		d = null;
	//    8   13:aload_0         
	//    9   14:aconst_null     
	//   10   15:putfield        #12  <Field List d>
	//   11   18:return          
	}

	protected final void a()
	{
		b.p = Long.valueOf(-1L);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field akh b>
	//    2    4:ldc2w           #20  <Long -1L>
	//    3    7:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    4   10:putfield        #33  <Field Long akh.p>
		b.q = Long.valueOf(-1L);
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field akh b>
	//    7   17:ldc2w           #20  <Long -1L>
	//    8   20:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    9   23:putfield        #36  <Field Long akh.q>
		if(d == null)
	//*  10   26:aload_0         
	//*  11   27:getfield        #12  <Field List d>
	//*  12   30:ifnonnull       62
			d = (List)c.invoke(((Object) (null)), new Object[] {
				a.a()
			});
	//   13   33:aload_0         
	//   14   34:aload_0         
	//   15   35:getfield        #40  <Field Method c>
	//   16   38:aconst_null     
	//   17   39:iconst_1        
	//   18   40:anewarray       Object[]
	//   19   43:dup             
	//   20   44:iconst_0        
	//   21   45:aload_0         
	//   22   46:getfield        #45  <Field bav a>
	//   23   49:invokevirtual   #50  <Method android.content.Context bav.a()>
	//   24   52:aastore         
	//   25   53:invokevirtual   #56  <Method Object Method.invoke(Object, Object[])>
	//   26   56:checkcast       #58  <Class List>
	//   27   59:putfield        #12  <Field List d>
		List list = d;
	//   28   62:aload_0         
	//   29   63:getfield        #12  <Field List d>
	//   30   66:astore_1        
		if(list != null && list.size() == 2)
	//*  31   67:aload_1         
	//*  32   68:ifnull          148
	//*  33   71:aload_1         
	//*  34   72:invokeinterface #62  <Method int List.size()>
	//*  35   77:iconst_2        
	//*  36   78:icmpne          148
		{
			synchronized(b)
	//*  37   81:aload_0         
	//*  38   82:getfield        #19  <Field akh b>
	//*  39   85:astore_1        
	//*  40   86:aload_1         
	//*  41   87:monitorenter    
			{
				b.p = Long.valueOf(((Long)d.get(0)).longValue());
	//   42   88:aload_0         
	//   43   89:getfield        #19  <Field akh b>
	//   44   92:aload_0         
	//   45   93:getfield        #12  <Field List d>
	//   46   96:iconst_0        
	//   47   97:invokeinterface #66  <Method Object List.get(int)>
	//   48  102:checkcast       #23  <Class Long>
	//   49  105:invokevirtual   #70  <Method long Long.longValue()>
	//   50  108:invokestatic    #27  <Method Long Long.valueOf(long)>
	//   51  111:putfield        #33  <Field Long akh.p>
				b.q = Long.valueOf(((Long)d.get(1)).longValue());
	//   52  114:aload_0         
	//   53  115:getfield        #19  <Field akh b>
	//   54  118:aload_0         
	//   55  119:getfield        #12  <Field List d>
	//   56  122:iconst_1        
	//   57  123:invokeinterface #66  <Method Object List.get(int)>
	//   58  128:checkcast       #23  <Class Long>
	//   59  131:invokevirtual   #70  <Method long Long.longValue()>
	//   60  134:invokestatic    #27  <Method Long Long.valueOf(long)>
	//   61  137:putfield        #36  <Field Long akh.q>
			}
	//   62  140:aload_1         
	//   63  141:monitorexit     
			return;
	//   64  142:return          
		} else
	//*  65  143:astore_2        
	//*  66  144:aload_1         
	//*  67  145:monitorexit     
	//*  68  146:aload_2         
	//*  69  147:athrow          
		{
			return;
	//   70  148:return          
		}
		exception;
		akh1;
		JVM INSTR monitorexit ;
		throw exception;
	}

	private List d;
}
