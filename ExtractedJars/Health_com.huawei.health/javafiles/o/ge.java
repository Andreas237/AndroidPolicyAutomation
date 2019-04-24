// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import org.json.JSONObject;

public final class ge
{
	public static final class e extends Enum
	{

		public static final int a;
		public static final int b;
		public static final int c;
		public static final int d;
		public static final int e;
		private static final int h[];

		static 
		{
			c = 1;
		//    0    0:iconst_1        
		//    1    1:putstatic       #19  <Field int c>
			a = 2;
		//    2    4:iconst_2        
		//    3    5:putstatic       #21  <Field int a>
			d = 3;
		//    4    8:iconst_3        
		//    5    9:putstatic       #23  <Field int d>
			b = 4;
		//    6   12:iconst_4        
		//    7   13:putstatic       #25  <Field int b>
			e = 5;
		//    8   16:iconst_5        
		//    9   17:putstatic       #27  <Field int e>
			h = (new int[] {
				c, a, d, b, e
			});
		//   10   20:iconst_5        
		//   11   21:newarray        int[]
		//   12   23:dup             
		//   13   24:iconst_0        
		//   14   25:getstatic       #19  <Field int c>
		//   15   28:iastore         
		//   16   29:dup             
		//   17   30:iconst_1        
		//   18   31:getstatic       #21  <Field int a>
		//   19   34:iastore         
		//   20   35:dup             
		//   21   36:iconst_2        
		//   22   37:getstatic       #23  <Field int d>
		//   23   40:iastore         
		//   24   41:dup             
		//   25   42:iconst_3        
		//   26   43:getstatic       #25  <Field int b>
		//   27   46:iastore         
		//   28   47:dup             
		//   29   48:iconst_4        
		//   30   49:getstatic       #27  <Field int e>
		//   31   52:iastore         
		//   32   53:putstatic       #29  <Field int[] h>
		//*  33   56:return          
		}
	}


	public ge(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		i = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean i>
		c = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field String c>
	//    8   14:return          
	}

	public String a;
	public String b;
	public String c;
	public String d;
	public JSONObject e;
	private boolean i;
}
