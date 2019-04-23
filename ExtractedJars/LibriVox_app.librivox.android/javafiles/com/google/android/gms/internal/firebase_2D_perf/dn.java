// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ds, di

final class dn extends ds
{

	dn(byte abyte0[], int i, int j)
	{
		super(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ds(byte[])>
		b(i, i + j, abyte0.length);
	//    3    5:iload_2         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iadd            
	//    7    9:aload_1         
	//    8   10:arraylength     
	//    9   11:invokestatic    #16  <Method int b(int, int, int)>
	//   10   14:pop             
		c = i;
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:putfield        #18  <Field int c>
		d = j;
	//   14   20:aload_0         
	//   15   21:iload_3         
	//   16   22:putfield        #20  <Field int d>
	//   17   25:return          
	}

	public final byte a(int i)
	{
		int j = ((di)this).a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method int di.a()>
	//    2    4:istore_2        
		if((j - (i + 1) | i) < 0)
	//*   3    5:iload_2         
	//*   4    6:iload_1         
	//*   5    7:iconst_1        
	//*   6    8:iadd            
	//*   7    9:isub            
	//*   8   10:iload_1         
	//*   9   11:ior             
	//*  10   12:ifge            102
		{
			if(i < 0)
	//*  11   15:iload_1         
	//*  12   16:ifge            54
			{
				StringBuilder stringbuilder = new StringBuilder(22);
	//   13   19:new             #30  <Class StringBuilder>
	//   14   22:dup             
	//   15   23:bipush          22
	//   16   25:invokespecial   #33  <Method void StringBuilder(int)>
	//   17   28:astore_3        
				stringbuilder.append("Index < 0: ");
	//   18   29:aload_3         
	//   19   30:ldc1            #35  <String "Index < 0: ">
	//   20   32:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   21   35:pop             
				stringbuilder.append(i);
	//   22   36:aload_3         
	//   23   37:iload_1         
	//   24   38:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//   25   41:pop             
				throw new ArrayIndexOutOfBoundsException(stringbuilder.toString());
	//   26   42:new             #44  <Class ArrayIndexOutOfBoundsException>
	//   27   45:dup             
	//   28   46:aload_3         
	//   29   47:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   30   50:invokespecial   #51  <Method void ArrayIndexOutOfBoundsException(String)>
	//   31   53:athrow          
			} else
			{
				StringBuilder stringbuilder1 = new StringBuilder(40);
	//   32   54:new             #30  <Class StringBuilder>
	//   33   57:dup             
	//   34   58:bipush          40
	//   35   60:invokespecial   #33  <Method void StringBuilder(int)>
	//   36   63:astore_3        
				stringbuilder1.append("Index > length: ");
	//   37   64:aload_3         
	//   38   65:ldc1            #53  <String "Index > length: ">
	//   39   67:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   40   70:pop             
				stringbuilder1.append(i);
	//   41   71:aload_3         
	//   42   72:iload_1         
	//   43   73:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//   44   76:pop             
				stringbuilder1.append(", ");
	//   45   77:aload_3         
	//   46   78:ldc1            #55  <String ", ">
	//   47   80:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   48   83:pop             
				stringbuilder1.append(j);
	//   49   84:aload_3         
	//   50   85:iload_2         
	//   51   86:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//   52   89:pop             
				throw new ArrayIndexOutOfBoundsException(stringbuilder1.toString());
	//   53   90:new             #44  <Class ArrayIndexOutOfBoundsException>
	//   54   93:dup             
	//   55   94:aload_3         
	//   56   95:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   57   98:invokespecial   #51  <Method void ArrayIndexOutOfBoundsException(String)>
	//   58  101:athrow          
			}
		} else
		{
			return b[c + i];
	//   59  102:aload_0         
	//   60  103:getfield        #58  <Field byte[] b>
	//   61  106:aload_0         
	//   62  107:getfield        #18  <Field int c>
	//   63  110:iload_1         
	//   64  111:iadd            
	//   65  112:baload          
	//   66  113:ireturn         
		}
	}

	public final int a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int d>
	//    2    4:ireturn         
	}

	final byte b(int i)
	{
		return b[c + i];
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field byte[] b>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field int c>
	//    4    8:iload_1         
	//    5    9:iadd            
	//    6   10:baload          
	//    7   11:ireturn         
	}

	protected final int e()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int c>
	//    2    4:ireturn         
	}

	private final int c;
	private final int d;
}
