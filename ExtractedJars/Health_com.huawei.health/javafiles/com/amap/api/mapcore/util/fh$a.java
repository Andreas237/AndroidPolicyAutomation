// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.amap.api.mapcore.util:
//			fh, x

public static class fh$a
{

	public void a(int k)
	{
		a = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int a>
	//    3    5:return          
	}

	public void a(long l)
	{
		if(l <= 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifgt            11
			g = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #45  <Field boolean g>
		b = l;
	//    7   11:aload_0         
	//    8   12:lload_1         
	//    9   13:putfield        #34  <Field long b>
	//   10   16:return          
	}

	public void a(String s)
	{
		c = new File(s);
	//    0    0:aload_0         
	//    1    1:new             #63  <Class File>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #65  <Method void File(String)>
	//    5    9:putfield        #56  <Field File c>
	//    6   12:return          
	}

	public void a(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean f>
	//    3    5:return          
	}

	public void b(String s)
	{
		c = fh.a(x.a, j, s);
	//    0    0:aload_0         
	//    1    1:getstatic       #71  <Field Context x.a>
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field String j>
	//    4    8:aload_1         
	//    5    9:invokestatic    #54  <Method File fh.a(Context, String, String)>
	//    6   12:putfield        #56  <Field File c>
	//    7   15:return          
	}

	public void b(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field boolean g>
	//    3    5:return          
	}

	public int a;
	public long b;
	public File c;
	public android.graphics.p.CompressFormat d;
	public int e;
	public boolean f;
	public boolean g;
	public boolean h;
	public boolean i;
	public String j;

	public fh$a(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		a = 0x500000;
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <Int 0x500000>
	//    4    7:putfield        #30  <Field int a>
		b = 0xa00000L;
	//    5   10:aload_0         
	//    6   11:ldc2w           #31  <Long 0xa00000L>
	//    7   14:putfield        #34  <Field long b>
		d = fh.e();
	//    8   17:aload_0         
	//    9   18:invokestatic    #37  <Method android.graphics.Bitmap$CompressFormat fh.e()>
	//   10   21:putfield        #39  <Field android.graphics.Bitmap$CompressFormat d>
		e = 100;
	//   11   24:aload_0         
	//   12   25:bipush          100
	//   13   27:putfield        #41  <Field int e>
		f = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #43  <Field boolean f>
		g = true;
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:putfield        #45  <Field boolean g>
		h = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #47  <Field boolean h>
		i = true;
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:putfield        #49  <Field boolean i>
		j = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #51  <Field String j>
		j = s;
	//   29   55:aload_0         
	//   30   56:aload_2         
	//   31   57:putfield        #51  <Field String j>
		c = fh.a(context, s, ((String) (null)));
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:aload_2         
	//   35   63:aconst_null     
	//   36   64:invokestatic    #54  <Method File fh.a(Context, String, String)>
	//   37   67:putfield        #56  <Field File c>
	//   38   70:return          
	}

	public fh$a(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		a = 0x500000;
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <Int 0x500000>
	//    4    7:putfield        #30  <Field int a>
		b = 0xa00000L;
	//    5   10:aload_0         
	//    6   11:ldc2w           #31  <Long 0xa00000L>
	//    7   14:putfield        #34  <Field long b>
		d = fh.e();
	//    8   17:aload_0         
	//    9   18:invokestatic    #37  <Method android.graphics.Bitmap$CompressFormat fh.e()>
	//   10   21:putfield        #39  <Field android.graphics.Bitmap$CompressFormat d>
		e = 100;
	//   11   24:aload_0         
	//   12   25:bipush          100
	//   13   27:putfield        #41  <Field int e>
		f = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #43  <Field boolean f>
		g = true;
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:putfield        #45  <Field boolean g>
		h = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #47  <Field boolean h>
		i = true;
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:putfield        #49  <Field boolean i>
		j = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #51  <Field String j>
		j = s;
	//   29   55:aload_0         
	//   30   56:aload_2         
	//   31   57:putfield        #51  <Field String j>
		c = fh.a(context, s, s1);
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:aload_2         
	//   35   63:aload_3         
	//   36   64:invokestatic    #54  <Method File fh.a(Context, String, String)>
	//   37   67:putfield        #56  <Field File c>
	//   38   70:return          
	}
}
