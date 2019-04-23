// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, bav, bbe, anf, 
//			akh

public final class bcd extends bcg
{

	public bcd(bav bav1, String s, String s1, akh akh1, int i, int j, View view)
	{
		super(bav1, s, s1, akh1, i, 57);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          57
	//    7   10:invokespecial   #11  <Method void bcg(bav, String, String, akh, int, int)>
		d = view;
	//    8   13:aload_0         
	//    9   14:aload           7
	//   10   16:putfield        #13  <Field View d>
	//   11   19:return          
	}

	protected final void a()
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field View d>
	//*   2    4:ifnull          95
		{
			Object obj = ((Object) (a.a().getResources().getDisplayMetrics()));
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field bav a>
	//    5   11:invokevirtual   #24  <Method Context bav.a()>
	//    6   14:invokevirtual   #30  <Method Resources Context.getResources()>
	//    7   17:invokevirtual   #36  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    8   20:astore_1        
			obj = ((Object) (new bbe((String)c.invoke(((Object) (null)), new Object[] {
				d, obj
			}))));
	//    9   21:new             #38  <Class bbe>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:getfield        #42  <Field Method c>
	//   13   29:aconst_null     
	//   14   30:iconst_2        
	//   15   31:anewarray       Object[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:aload_0         
	//   19   37:getfield        #13  <Field View d>
	//   20   40:aastore         
	//   21   41:dup             
	//   22   42:iconst_1        
	//   23   43:aload_1         
	//   24   44:aastore         
	//   25   45:invokevirtual   #50  <Method Object Method.invoke(Object, Object[])>
	//   26   48:checkcast       #52  <Class String>
	//   27   51:invokespecial   #55  <Method void bbe(String)>
	//   28   54:astore_1        
			anf anf1 = new anf();
	//   29   55:new             #57  <Class anf>
	//   30   58:dup             
	//   31   59:invokespecial   #59  <Method void anf()>
	//   32   62:astore_2        
			anf1.a = ((bbe) (obj)).a;
	//   33   63:aload_2         
	//   34   64:aload_1         
	//   35   65:getfield        #62  <Field Long bbe.a>
	//   36   68:putfield        #63  <Field Long anf.a>
			anf1.b = ((bbe) (obj)).b;
	//   37   71:aload_2         
	//   38   72:aload_1         
	//   39   73:getfield        #66  <Field Long bbe.b>
	//   40   76:putfield        #67  <Field Long anf.b>
			anf1.c = ((bbe) (obj)).c;
	//   41   79:aload_2         
	//   42   80:aload_1         
	//   43   81:getfield        #69  <Field Long bbe.c>
	//   44   84:putfield        #70  <Field Long anf.c>
			b.M = anf1;
	//   45   87:aload_0         
	//   46   88:getfield        #73  <Field akh b>
	//   47   91:aload_2         
	//   48   92:putfield        #79  <Field anf akh.M>
		}
	//   49   95:return          
	}

	private final View d;
}
