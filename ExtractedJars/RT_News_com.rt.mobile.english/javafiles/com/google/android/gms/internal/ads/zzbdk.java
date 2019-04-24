// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


final class zzbdk
{

	zzbdk(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		info = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String info>
		position = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #17  <Field int position>
	//    8   14:return          
	}

	final boolean hasNext()
	{
		return position < info.length();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int position>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field String info>
	//    4    8:invokevirtual   #26  <Method int String.length()>
	//    5   11:icmpge          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	final int next()
	{
		String s = info;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String info>
	//    2    4:astore          4
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #17  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #17  <Field int position>
		i = ((int) (s.charAt(i)));
	//   11   18:aload           4
	//   12   20:iload_1         
	//   13   21:invokevirtual   #31  <Method char String.charAt(int)>
	//   14   24:istore_1        
		if(i < '\uD800')
	//*  15   25:iload_1         
	//*  16   26:ldc1            #32  <Int 55296>
	//*  17   28:icmpge          33
			return i;
	//   18   31:iload_1         
	//   19   32:ireturn         
		int j = i & 0x1fff;
	//   20   33:iload_1         
	//   21   34:sipush          8191
	//   22   37:iand            
	//   23   38:istore_2        
		i = 13;
	//   24   39:bipush          13
	//   25   41:istore_1        
		do
		{
			String s1 = info;
	//   26   42:aload_0         
	//   27   43:getfield        #15  <Field String info>
	//   28   46:astore          4
			int k = position;
	//   29   48:aload_0         
	//   30   49:getfield        #17  <Field int position>
	//   31   52:istore_3        
			position = k + 1;
	//   32   53:aload_0         
	//   33   54:iload_3         
	//   34   55:iconst_1        
	//   35   56:iadd            
	//   36   57:putfield        #17  <Field int position>
			k = ((int) (s1.charAt(k)));
	//   37   60:aload           4
	//   38   62:iload_3         
	//   39   63:invokevirtual   #31  <Method char String.charAt(int)>
	//   40   66:istore_3        
			if(k >= '\uD800')
	//*  41   67:iload_3         
	//*  42   68:ldc1            #32  <Int 55296>
	//*  43   70:icmplt          91
			{
				j |= (k & 0x1fff) << i;
	//   44   73:iload_2         
	//   45   74:iload_3         
	//   46   75:sipush          8191
	//   47   78:iand            
	//   48   79:iload_1         
	//   49   80:ishl            
	//   50   81:ior             
	//   51   82:istore_2        
				i += 13;
	//   52   83:iload_1         
	//   53   84:bipush          13
	//   54   86:iadd            
	//   55   87:istore_1        
			} else
	//*  56   88:goto            42
			{
				return j | k << i;
	//   57   91:iload_2         
	//   58   92:iload_3         
	//   59   93:iload_1         
	//   60   94:ishl            
	//   61   95:ior             
	//   62   96:ireturn         
			}
		} while(true);
	}

	private final String info;
	private int position;
}
