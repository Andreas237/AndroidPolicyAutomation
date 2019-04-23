// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			auk

public final class bat extends auk
{

	public bat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void auk()>
	//    2    4:return          
	}

	public bat(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void auk()>
		((auk)this).a(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #17  <Method void auk.a(String)>
	//    5    9:return          
	}

	protected final HashMap a()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #20  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put(((Object) (Integer.valueOf(0))), ((Object) (a)));
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field Long a>
	//    9   17:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
	//   10   20:pop             
		hashmap.put(((Object) (Integer.valueOf(1))), ((Object) (b)));
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//   14   26:aload_0         
	//   15   27:getfield        #35  <Field Boolean b>
	//   16   30:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
	//   17   33:pop             
		hashmap.put(((Object) (Integer.valueOf(2))), ((Object) (c)));
	//   18   34:aload_1         
	//   19   35:iconst_2        
	//   20   36:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//   21   39:aload_0         
	//   22   40:getfield        #37  <Field Boolean c>
	//   23   43:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
	//   24   46:pop             
		return hashmap;
	//   25   47:aload_1         
	//   26   48:areturn         
	}

	protected final void a(String s)
	{
		s = ((String) (b(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method HashMap b(String)>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          54
		{
			a = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(0))));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//    9   15:invokevirtual   #44  <Method Object HashMap.get(Object)>
	//   10   18:checkcast       #46  <Class Long>
	//   11   21:putfield        #29  <Field Long a>
			b = (Boolean)((HashMap) (s)).get(((Object) (Integer.valueOf(1))));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//   16   30:invokevirtual   #44  <Method Object HashMap.get(Object)>
	//   17   33:checkcast       #48  <Class Boolean>
	//   18   36:putfield        #35  <Field Boolean b>
			c = (Boolean)((HashMap) (s)).get(((Object) (Integer.valueOf(2))));
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iconst_2        
	//   22   42:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//   23   45:invokevirtual   #44  <Method Object HashMap.get(Object)>
	//   24   48:checkcast       #48  <Class Boolean>
	//   25   51:putfield        #37  <Field Boolean c>
		}
	//   26   54:return          
	}

	public Long a;
	public Boolean b;
	public Boolean c;
}
