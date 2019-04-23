// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.exifinterface.media;


// Referenced classes of package androidx.exifinterface.media:
//			ExifInterface

static class ExifInterface$ExifTag
{

	boolean isFormatCompatible(int i)
	{
		int j = primaryFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int primaryFormat>
	//    2    4:istore_2        
		if(j != 7)
	//*   3    5:iload_2         
	//*   4    6:bipush          7
	//*   5    8:icmpeq          109
		{
			if(i == 7)
	//*   6   11:iload_1         
	//*   7   12:bipush          7
	//*   8   14:icmpne          19
				return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
			if(j != i)
	//*  11   19:iload_2         
	//*  12   20:iload_1         
	//*  13   21:icmpeq          107
			{
				int k = secondaryFormat;
	//   14   24:aload_0         
	//   15   25:getfield        #26  <Field int secondaryFormat>
	//   16   28:istore_3        
				if(k == i)
	//*  17   29:iload_3         
	//*  18   30:iload_1         
	//*  19   31:icmpne          36
					return true;
	//   20   34:iconst_1        
	//   21   35:ireturn         
				if((j == 4 || k == 4) && i == 3)
	//*  22   36:iload_2         
	//*  23   37:iconst_4        
	//*  24   38:icmpeq          46
	//*  25   41:iload_3         
	//*  26   42:iconst_4        
	//*  27   43:icmpne          53
	//*  28   46:iload_1         
	//*  29   47:iconst_3        
	//*  30   48:icmpne          53
					return true;
	//   31   51:iconst_1        
	//   32   52:ireturn         
				if((primaryFormat == 9 || secondaryFormat == 9) && i == 8)
	//*  33   53:aload_0         
	//*  34   54:getfield        #24  <Field int primaryFormat>
	//*  35   57:bipush          9
	//*  36   59:icmpeq          71
	//*  37   62:aload_0         
	//*  38   63:getfield        #26  <Field int secondaryFormat>
	//*  39   66:bipush          9
	//*  40   68:icmpne          79
	//*  41   71:iload_1         
	//*  42   72:bipush          8
	//*  43   74:icmpne          79
					return true;
	//   44   77:iconst_1        
	//   45   78:ireturn         
				return (primaryFormat == 12 || secondaryFormat == 12) && i == 11;
	//   46   79:aload_0         
	//   47   80:getfield        #24  <Field int primaryFormat>
	//   48   83:bipush          12
	//   49   85:icmpeq          97
	//   50   88:aload_0         
	//   51   89:getfield        #26  <Field int secondaryFormat>
	//   52   92:bipush          12
	//   53   94:icmpne          105
	//   54   97:iload_1         
	//   55   98:bipush          11
	//   56  100:icmpne          105
	//   57  103:iconst_1        
	//   58  104:ireturn         
	//   59  105:iconst_0        
	//   60  106:ireturn         
			} else
			{
				return true;
	//   61  107:iconst_1        
	//   62  108:ireturn         
			}
		} else
		{
			return true;
	//   63  109:iconst_1        
	//   64  110:ireturn         
		}
	}

	public final String name;
	public final int number;
	public final int primaryFormat;
	public final int secondaryFormat;

	ExifInterface$ExifTag(String s, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String name>
		number = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int number>
		primaryFormat = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int primaryFormat>
		secondaryFormat = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #26  <Field int secondaryFormat>
	//   14   24:return          
	}

	ExifInterface$ExifTag(String s, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String name>
		number = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int number>
		primaryFormat = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int primaryFormat>
		secondaryFormat = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field int secondaryFormat>
	//   14   25:return          
	}
}
