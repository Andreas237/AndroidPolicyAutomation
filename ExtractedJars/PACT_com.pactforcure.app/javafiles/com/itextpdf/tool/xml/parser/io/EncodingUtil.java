// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.io;


public class EncodingUtil
{

	public EncodingUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getDeclaredEncoding(String s)
	{
		if(s != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       6
_L1:
		int j;
		return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
	//*   4    6:aload_0         
	//*   5    7:ldc1            #13  <String "encoding">
	//*   6    9:invokevirtual   #19  <Method int String.indexOf(String)>
	//*   7   12:istore_2        
_L2:
		int i;
		if((j = s.indexOf("encoding")) >= 0)
	//*   8   13:iload_2         
	//*   9   14:iflt            4
		{
			i = s.indexOf('"', j);
	//   10   17:aload_0         
	//   11   18:bipush          34
	//   12   20:iload_2         
	//   13   21:invokevirtual   #22  <Method int String.indexOf(int, int)>
	//   14   24:istore_1        
			j = s.indexOf('\'', j);
	//   15   25:aload_0         
	//   16   26:bipush          39
	//   17   28:iload_2         
	//   18   29:invokevirtual   #22  <Method int String.indexOf(int, int)>
	//   19   32:istore_2        
			if(i != j)
	//*  20   33:iload_1         
	//*  21   34:iload_2         
	//*  22   35:icmpeq          4
			{
				if((i >= 0 || j <= 0) && (j <= 0 || j >= i))
					continue; /* Loop/switch isn't completed */
	//   23   38:iload_1         
	//   24   39:ifge            46
	//   25   42:iload_2         
	//   26   43:ifgt            55
	//   27   46:iload_2         
	//   28   47:ifle            78
	//   29   50:iload_2         
	//   30   51:iload_1         
	//   31   52:icmpge          78
				i = s.indexOf('\'', j + 1);
	//   32   55:aload_0         
	//   33   56:bipush          39
	//   34   58:iload_2         
	//   35   59:iconst_1        
	//   36   60:iadd            
	//   37   61:invokevirtual   #22  <Method int String.indexOf(int, int)>
	//   38   64:istore_1        
				if(i >= 0)
	//*  39   65:iload_1         
	//*  40   66:iflt            4
					return s.substring(j + 1, i);
	//   41   69:aload_0         
	//   42   70:iload_2         
	//   43   71:iconst_1        
	//   44   72:iadd            
	//   45   73:iload_1         
	//   46   74:invokevirtual   #26  <Method String String.substring(int, int)>
	//   47   77:areturn         
			}
		}
		continue; /* Loop/switch isn't completed */
		if((j >= 0 || i <= 0) && (i <= 0 || i >= j)) goto _L1; else goto _L3
	//   48   78:iload_2         
	//   49   79:ifge            86
	//   50   82:iload_1         
	//   51   83:ifgt            95
	//   52   86:iload_1         
	//   53   87:ifle            4
	//   54   90:iload_1         
	//   55   91:iload_2         
	//   56   92:icmpge          4
_L3:
		int k = s.indexOf('"', i + 1);
	//   57   95:aload_0         
	//   58   96:bipush          34
	//   59   98:iload_1         
	//   60   99:iconst_1        
	//   61  100:iadd            
	//   62  101:invokevirtual   #22  <Method int String.indexOf(int, int)>
	//   63  104:istore_2        
		if(k >= 0)
	//*  64  105:iload_2         
	//*  65  106:iflt            4
			return s.substring(i + 1, k);
	//   66  109:aload_0         
	//   67  110:iload_1         
	//   68  111:iconst_1        
	//   69  112:iadd            
	//   70  113:iload_2         
	//   71  114:invokevirtual   #26  <Method String String.substring(int, int)>
	//   72  117:areturn         
		if(true) goto _L1; else goto _L4
_L4:
	}
}
