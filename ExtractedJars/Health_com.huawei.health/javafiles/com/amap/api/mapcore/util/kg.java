// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package com.amap.api.mapcore.util:
//			kh, hk

public class kg extends kh
{

	public kg(Context context, int i, String s, kh kh1)
	{
		super(kh1);
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:invokespecial   #17  <Method void kh(kh)>
		b = i;
	//    3    6:aload_0         
	//    4    7:iload_2         
	//    5    8:putfield        #19  <Field int b>
		d = s;
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:putfield        #21  <Field String d>
		e = context;
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:putfield        #23  <Field Context e>
	//   12   21:return          
	}

	private long a(String s)
	{
		s = hk.a(e, s);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Context e>
	//    2    4:aload_1         
	//    3    5:invokestatic    #31  <Method String hk.a(Context, String)>
	//    4    8:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   13:ifeq            18
			return 0L;
	//    8   16:lconst_0        
	//    9   17:lreturn         
		else
			return Long.parseLong(s);
	//   10   18:aload_1         
	//   11   19:invokestatic    #42  <Method long Long.parseLong(String)>
	//   12   22:lreturn         
	}

	private void a(String s, long l)
	{
		c = l;
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:putfield        #45  <Field long c>
		hk.a(e, s, String.valueOf(l));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field Context e>
	//    5    9:aload_1         
	//    6   10:lload_2         
	//    7   11:invokestatic    #51  <Method String String.valueOf(long)>
	//    8   14:invokestatic    #54  <Method void hk.a(Context, String, String)>
	//    9   17:return          
	}

	public void a(boolean flag)
	{
		super.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #57  <Method void kh.a(boolean)>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            20
			a(d, System.currentTimeMillis());
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field String d>
	//    8   14:invokestatic    #63  <Method long System.currentTimeMillis()>
	//    9   17:invokespecial   #65  <Method void a(String, long)>
	//   10   20:return          
	}

	protected boolean a()
	{
		if(c == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field long c>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            21
			c = a(d);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #21  <Field String d>
	//    9   15:invokespecial   #68  <Method long a(String)>
	//   10   18:putfield        #45  <Field long c>
		return System.currentTimeMillis() - c >= (long)b;
	//   11   21:invokestatic    #63  <Method long System.currentTimeMillis()>
	//   12   24:aload_0         
	//   13   25:getfield        #45  <Field long c>
	//   14   28:lsub            
	//   15   29:aload_0         
	//   16   30:getfield        #19  <Field int b>
	//   17   33:i2l             
	//   18   34:lcmp            
	//   19   35:ifge            40
	//   20   38:iconst_0        
	//   21   39:ireturn         
	//   22   40:iconst_1        
	//   23   41:ireturn         
	}

	private int b;
	private long c;
	private String d;
	private Context e;
}
