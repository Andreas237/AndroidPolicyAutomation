// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, akh, bav

public final class bbj extends bcg
{

	public bbj(bav bav1, String s, String s1, akh akh1, int i, int j)
	{
		super(bav1, s, s1, akh1, i, 49);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          49
	//    7   10:invokespecial   #8   <Method void bcg(bav, String, String, akh, int, int)>
	//    8   13:return          
	}

	protected final void a()
	{
		int i;
		b.F = Integer.valueOf(2);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field akh b>
	//    2    4:iconst_2        
	//    3    5:invokestatic    #23  <Method Integer Integer.valueOf(int)>
	//    4    8:putfield        #29  <Field Integer akh.F>
		boolean flag;
		Object obj;
		try
		{
			obj = ((Object) (c));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field Method c>
	//    7   15:astore_3        
		}
	//*   8   16:iconst_1        
	//*   9   17:istore_1        
	//*  10   18:aload_3         
	//*  11   19:aconst_null     
	//*  12   20:iconst_1        
	//*  13   21:anewarray       Object[]
	//*  14   24:dup             
	//*  15   25:iconst_0        
	//*  16   26:aload_0         
	//*  17   27:getfield        #38  <Field bav a>
	//*  18   30:invokevirtual   #43  <Method android.content.Context bav.a()>
	//*  19   33:aastore         
	//*  20   34:invokevirtual   #49  <Method Object Method.invoke(Object, Object[])>
	//*  21   37:checkcast       #51  <Class Boolean>
	//*  22   40:invokevirtual   #55  <Method boolean Boolean.booleanValue()>
	//*  23   43:istore_2        
	//*  24   44:aload_0         
	//*  25   45:getfield        #17  <Field akh b>
	//*  26   48:astore_3        
	//*  27   49:iload_2         
	//*  28   50:ifeq            79
	//*  29   53:goto            56
	//*  30   56:aload_3         
	//*  31   57:iload_1         
	//*  32   58:invokestatic    #23  <Method Integer Integer.valueOf(int)>
	//*  33   61:putfield        #29  <Field Integer akh.F>
	//*  34   64:return          
		catch(InvocationTargetException invocationtargetexception)
	//*  35   65:astore_3        
		{
			if(invocationtargetexception.getTargetException() instanceof android.provider.Settings.SettingNotFoundException)
	//*  36   66:aload_3         
	//*  37   67:invokevirtual   #59  <Method Throwable InvocationTargetException.getTargetException()>
	//*  38   70:instanceof      #61  <Class android.provider.Settings$SettingNotFoundException>
	//*  39   73:ifeq            77
				return;
	//   40   76:return          
			else
				throw invocationtargetexception;
	//   41   77:aload_3         
	//   42   78:athrow          
		}
		i = 1;
		flag = ((Boolean)((Method) (obj)).invoke(((Object) (null)), new Object[] {
			a.a()
		})).booleanValue();
		obj = ((Object) (b));
		if(!flag)
			i = 0;
	//   43   79:iconst_0        
	//   44   80:istore_1        
		obj.F = Integer.valueOf(i);
		return;
	//*  45   81:goto            56
	}
}
