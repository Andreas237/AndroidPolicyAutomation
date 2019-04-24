// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

// Referenced classes of package com.amap.api.mapcore.util:
//			it, ik, iv

static final class it$a
	implements Runnable
{

	public final void run()
	{
		String s;
label0:
		{
			int i = a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int a>
	//    2    4:istore_1        
			if(c != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #33  <Field ik c>
	//*   5    9:ifnull          48
			{
				if(i == 1)
	//*   6   12:iload_1         
	//*   7   13:iconst_1        
	//*   8   14:icmpne          28
				{
					s = c.a();
	//    9   17:aload_0         
	//   10   18:getfield        #33  <Field ik c>
	//   11   21:invokevirtual   #42  <Method String ik.a()>
	//   12   24:astore_2        
					break label0;
	//   13   25:goto            50
				}
				if(i == 2)
	//*  14   28:iload_1         
	//*  15   29:iconst_2        
	//*  16   30:icmpne          48
				{
					s = c.a(d);
	//   17   33:aload_0         
	//   18   34:getfield        #33  <Field ik c>
	//   19   37:aload_0         
	//   20   38:getfield        #35  <Field String d>
	//   21   41:invokevirtual   #45  <Method String ik.a(String)>
	//   22   44:astore_2        
					break label0;
	//   23   45:goto            50
				}
			}
			s = null;
	//   24   48:aconst_null     
	//   25   49:astore_2        
		}
		if(TextUtils.isEmpty(((CharSequence) (s))) || b == null || b.get() == null)
	//*  26   50:aload_2         
	//*  27   51:invokestatic    #51  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  28   54:ifne            74
	//*  29   57:aload_0         
	//*  30   58:getfield        #31  <Field WeakReference b>
	//*  31   61:ifnull          74
	//*  32   64:aload_0         
	//*  33   65:getfield        #31  <Field WeakReference b>
	//*  34   68:invokevirtual   #55  <Method Object WeakReference.get()>
	//*  35   71:ifnonnull       75
			return;
	//   36   74:return          
		ik.e(s);
	//   37   75:aload_2         
	//   38   76:invokestatic    #59  <Method void ik.e(String)>
		if(a == 1)
	//*  39   79:aload_0         
	//*  40   80:getfield        #24  <Field int a>
	//*  41   83:iconst_1        
	//*  42   84:icmpne          101
		{
			iv.c((Context)b.get());
	//   43   87:aload_0         
	//   44   88:getfield        #31  <Field WeakReference b>
	//   45   91:invokevirtual   #55  <Method Object WeakReference.get()>
	//   46   94:checkcast       #61  <Class Context>
	//   47   97:invokestatic    #66  <Method void iv.c(Context)>
			return;
	//   48  100:return          
		} else
		{
			iv.d((Context)b.get());
	//   49  101:aload_0         
	//   50  102:getfield        #31  <Field WeakReference b>
	//   51  105:invokevirtual   #55  <Method Object WeakReference.get()>
	//   52  108:checkcast       #61  <Class Context>
	//   53  111:invokestatic    #68  <Method void iv.d(Context)>
			return;
	//   54  114:return          
		}
	}

	private int a;
	private WeakReference b;
	private ik c;
	private String d;

	public it$a(int i, Context context, ik ik1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #24  <Field int a>
		if(context != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          25
			b = new WeakReference(((Object) (context)));
	//    7   13:aload_0         
	//    8   14:new             #26  <Class WeakReference>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #29  <Method void WeakReference(Object)>
	//   12   22:putfield        #31  <Field WeakReference b>
		c = ik1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #33  <Field ik c>
		d = s;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #35  <Field String d>
	//   19   36:return          
	}
}
