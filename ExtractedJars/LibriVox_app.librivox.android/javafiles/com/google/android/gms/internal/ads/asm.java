// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class asm
{

	public static int[] a()
	{
		return (int[])((int []) (l)).clone();
	//    0    0:getstatic       #45  <Field int[] l>
	//    1    3:invokevirtual   #64  <Method Object _5B_I.clone()>
	//    2    6:checkcast       #60  <Class int[]>
	//    3    9:areturn         
	}

	public static final int a = 1;
	public static final int b = 2;
	public static final int c = 3;
	public static final int d = 4;
	public static final int e = 5;
	public static final int f = 6;
	public static final int g = 7;
	public static final int h;
	public static final int i;
	public static final int j;
	public static final int k;
	private static final int l[] = {
		a, b, c, d, e, f, g
	};
	private static final int m[];
	private static final int n[];

	static 
	{
	//    0    0:bipush          7
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:getstatic       #31  <Field int a>
	//    5    9:iastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:getstatic       #33  <Field int b>
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:getstatic       #35  <Field int c>
	//   13   21:iastore         
	//   14   22:dup             
	//   15   23:iconst_3        
	//   16   24:getstatic       #37  <Field int d>
	//   17   27:iastore         
	//   18   28:dup             
	//   19   29:iconst_4        
	//   20   30:getstatic       #39  <Field int e>
	//   21   33:iastore         
	//   22   34:dup             
	//   23   35:iconst_5        
	//   24   36:getstatic       #41  <Field int f>
	//   25   39:iastore         
	//   26   40:dup             
	//   27   41:bipush          6
	//   28   43:getstatic       #43  <Field int g>
	//   29   46:iastore         
	//   30   47:putstatic       #45  <Field int[] l>
		h = 1;
	//   31   50:iconst_1        
	//   32   51:putstatic       #47  <Field int h>
		i = 2;
	//   33   54:iconst_2        
	//   34   55:putstatic       #49  <Field int i>
		m = (new int[] {
			h, i
		});
	//   35   58:iconst_2        
	//   36   59:newarray        int[]
	//   37   61:dup             
	//   38   62:iconst_0        
	//   39   63:getstatic       #47  <Field int h>
	//   40   66:iastore         
	//   41   67:dup             
	//   42   68:iconst_1        
	//   43   69:getstatic       #49  <Field int i>
	//   44   72:iastore         
	//   45   73:putstatic       #51  <Field int[] m>
		j = 1;
	//   46   76:iconst_1        
	//   47   77:putstatic       #53  <Field int j>
		k = 2;
	//   48   80:iconst_2        
	//   49   81:putstatic       #55  <Field int k>
		n = (new int[] {
			j, k
		});
	//   50   84:iconst_2        
	//   51   85:newarray        int[]
	//   52   87:dup             
	//   53   88:iconst_0        
	//   54   89:getstatic       #53  <Field int j>
	//   55   92:iastore         
	//   56   93:dup             
	//   57   94:iconst_1        
	//   58   95:getstatic       #55  <Field int k>
	//   59   98:iastore         
	//   60   99:putstatic       #57  <Field int[] n>
	//*  61  102:return          
	}
}
