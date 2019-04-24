// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.DashPathEffect;

public class li
{

	public li()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		d = lm.c.e;
	//    2    4:aload_0         
	//    3    5:getstatic       #23  <Field lm$c lm$c.e>
	//    4    8:putfield        #25  <Field lm$c d>
		e = (0.0F / 0.0F);
	//    5   11:aload_0         
	//    6   12:ldc1            #26  <Float (0.0F / 0.0F)>
	//    7   14:putfield        #28  <Field float e>
		a = (0.0F / 0.0F);
	//    8   17:aload_0         
	//    9   18:ldc1            #26  <Float (0.0F / 0.0F)>
	//   10   20:putfield        #30  <Field float a>
		b = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #32  <Field DashPathEffect b>
		i = 0x112233;
	//   14   28:aload_0         
	//   15   29:ldc1            #33  <Int 0x112233>
	//   16   31:putfield        #35  <Field int i>
	//   17   34:return          
	}

	public li(String s, lm.c c1, float f, float f1, DashPathEffect dashpatheffect, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		d = lm.c.e;
	//    2    4:aload_0         
	//    3    5:getstatic       #23  <Field lm$c lm$c.e>
	//    4    8:putfield        #25  <Field lm$c d>
		e = (0.0F / 0.0F);
	//    5   11:aload_0         
	//    6   12:ldc1            #26  <Float (0.0F / 0.0F)>
	//    7   14:putfield        #28  <Field float e>
		a = (0.0F / 0.0F);
	//    8   17:aload_0         
	//    9   18:ldc1            #26  <Float (0.0F / 0.0F)>
	//   10   20:putfield        #30  <Field float a>
		b = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #32  <Field DashPathEffect b>
		i = 0x112233;
	//   14   28:aload_0         
	//   15   29:ldc1            #33  <Int 0x112233>
	//   16   31:putfield        #35  <Field int i>
		c = s;
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:putfield        #39  <Field String c>
		d = c1;
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:putfield        #25  <Field lm$c d>
		e = f;
	//   23   44:aload_0         
	//   24   45:fload_3         
	//   25   46:putfield        #28  <Field float e>
		a = f1;
	//   26   49:aload_0         
	//   27   50:fload           4
	//   28   52:putfield        #30  <Field float a>
		b = dashpatheffect;
	//   29   55:aload_0         
	//   30   56:aload           5
	//   31   58:putfield        #32  <Field DashPathEffect b>
		i = j;
	//   32   61:aload_0         
	//   33   62:iload           6
	//   34   64:putfield        #35  <Field int i>
	//   35   67:return          
	}

	public float a;
	public DashPathEffect b;
	public String c;
	public lm.c d;
	public float e;
	public int i;
}
