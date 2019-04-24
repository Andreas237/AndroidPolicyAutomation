// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.Serializable;

final class ip
	implements Serializable
{

	ip()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field byte a>
		b = new byte[100];
	//    5    9:aload_0         
	//    6   10:bipush          100
	//    7   12:newarray        byte[]
	//    8   14:putfield        #28  <Field byte[] b>
		c = 0.0D;
	//    9   17:aload_0         
	//   10   18:dconst_0        
	//   11   19:putfield        #30  <Field double c>
		d = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #32  <Field int d>
		e = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #34  <Field int e>
		f = 0.0D;
	//   18   32:aload_0         
	//   19   33:dconst_0        
	//   20   34:putfield        #36  <Field double f>
		h = 0;
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:putfield        #38  <Field byte h>
		g = 0;
	//   24   42:aload_0         
	//   25   43:iconst_0        
	//   26   44:putfield        #40  <Field byte g>
		k = new byte[100];
	//   27   47:aload_0         
	//   28   48:bipush          100
	//   29   50:newarray        byte[]
	//   30   52:putfield        #42  <Field byte[] k>
		i = 0;
	//   31   55:aload_0         
	//   32   56:iconst_0        
	//   33   57:putfield        #44  <Field byte i>
	//   34   60:return          
	}

	protected byte a;
	protected byte b[];
	protected double c;
	protected int d;
	protected int e;
	protected double f;
	protected byte g;
	protected byte h;
	protected byte i;
	protected byte k[];
}
