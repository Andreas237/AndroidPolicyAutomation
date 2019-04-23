// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			auq, arz

final class aur extends auq
{

	aur(int i)
	{
		super(i, ((aur) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #9   <Method void auq(int, aur)>
	//    4    6:return          
	}

	public final void a()
	{
		if(!((auq)this).b())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #16  <Method boolean auq.b()>
	//*   2    4:ifne            134
		{
			for(int i = 0; i < ((auq)this).c(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #20  <Method int auq.c()>
	//*   8   14:icmpge          66
			{
				java.util.Map.Entry entry = ((auq)this).b(i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #23  <Method java.util.Map$Entry auq.b(int)>
	//   12   22:astore_2        
				if(((arz)entry.getKey()).d())
	//*  13   23:aload_2         
	//*  14   24:invokeinterface #29  <Method Object java.util.Map$Entry.getKey()>
	//*  15   29:checkcast       #31  <Class arz>
	//*  16   32:invokeinterface #34  <Method boolean arz.d()>
	//*  17   37:ifeq            59
					entry.setValue(((Object) (Collections.unmodifiableList((List)entry.getValue()))));
	//   18   40:aload_2         
	//   19   41:aload_2         
	//   20   42:invokeinterface #37  <Method Object java.util.Map$Entry.getValue()>
	//   21   47:checkcast       #39  <Class List>
	//   22   50:invokestatic    #45  <Method List Collections.unmodifiableList(List)>
	//   23   53:invokeinterface #49  <Method Object java.util.Map$Entry.setValue(Object)>
	//   24   58:pop             
			}

	//   25   59:iload_1         
	//   26   60:iconst_1        
	//   27   61:iadd            
	//   28   62:istore_1        
	//*  29   63:goto            9
			Iterator iterator = ((auq)this).d().iterator();
	//   30   66:aload_0         
	//   31   67:invokevirtual   #52  <Method Iterable auq.d()>
	//   32   70:invokeinterface #58  <Method Iterator Iterable.iterator()>
	//   33   75:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   34   76:aload_2         
	//   35   77:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//   36   82:ifeq            134
				java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
	//   37   85:aload_2         
	//   38   86:invokeinterface #66  <Method Object Iterator.next()>
	//   39   91:checkcast       #25  <Class java.util.Map$Entry>
	//   40   94:astore_3        
				if(((arz)entry1.getKey()).d())
	//*  41   95:aload_3         
	//*  42   96:invokeinterface #29  <Method Object java.util.Map$Entry.getKey()>
	//*  43  101:checkcast       #31  <Class arz>
	//*  44  104:invokeinterface #34  <Method boolean arz.d()>
	//*  45  109:ifeq            76
					entry1.setValue(((Object) (Collections.unmodifiableList((List)entry1.getValue()))));
	//   46  112:aload_3         
	//   47  113:aload_3         
	//   48  114:invokeinterface #37  <Method Object java.util.Map$Entry.getValue()>
	//   49  119:checkcast       #39  <Class List>
	//   50  122:invokestatic    #45  <Method List Collections.unmodifiableList(List)>
	//   51  125:invokeinterface #49  <Method Object java.util.Map$Entry.setValue(Object)>
	//   52  130:pop             
			} while(true);
	//   53  131:goto            76
		}
		super.a();
	//   54  134:aload_0         
	//   55  135:invokespecial   #68  <Method void auq.a()>
	//   56  138:return          
	}
}
