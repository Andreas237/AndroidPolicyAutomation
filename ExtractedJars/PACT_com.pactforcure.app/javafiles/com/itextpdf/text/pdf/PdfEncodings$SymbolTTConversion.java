// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			ExtraEncoding, PdfEncodings

private static class PdfEncodings$SymbolTTConversion
	implements ExtraEncoding
{

	public String byteToChar(byte abyte0[], String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public byte[] charToByte(char c, String s)
	{
		if((c & 0xff00) == 0 || (c & 0xff00) == 61440)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #21  <Int 65280>
	//*   2    3:iand            
	//*   3    4:ifeq            16
	//*   4    7:iload_1         
	//*   5    8:ldc1            #21  <Int 65280>
	//*   6   10:iand            
	//*   7   11:ldc1            #22  <Int 61440>
	//*   8   13:icmpne          25
			return (new byte[] {
				(byte)c
			});
	//    9   16:iconst_1        
	//   10   17:newarray        byte[]
	//   11   19:dup             
	//   12   20:iconst_0        
	//   13   21:iload_1         
	//   14   22:int2byte        
	//   15   23:bastore         
	//   16   24:areturn         
		else
			return new byte[0];
	//   17   25:iconst_0        
	//   18   26:newarray        byte[]
	//   19   28:areturn         
	}

	public byte[] charToByte(String s, String s1)
	{
		s1 = ((String) (s.toCharArray()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method char[] String.toCharArray()>
	//    2    4:astore_2        
		s = ((String) (new byte[s1.length]));
	//    3    5:aload_2         
	//    4    6:arraylength     
	//    5    7:newarray        byte[]
	//    6    9:astore_1        
		int l = s1.length;
	//    7   10:aload_2         
	//    8   11:arraylength     
	//    9   12:istore          6
		int j = 0;
	//   10   14:iconst_0        
	//   11   15:istore          4
		int i = 0;
	//   12   17:iconst_0        
	//   13   18:istore_3        
		for(; j < l; j++)
	//*  14   19:iload           4
	//*  15   21:iload           6
	//*  16   23:icmpge          73
		{
			char c = s1[j];
	//   17   26:aload_2         
	//   18   27:iload           4
	//   19   29:caload          
	//   20   30:istore          7
			if((c & 0xff00) == 0 || (c & 0xff00) == 61440)
	//*  21   32:iload           7
	//*  22   34:ldc1            #21  <Int 65280>
	//*  23   36:iand            
	//*  24   37:ifeq            50
	//*  25   40:iload           7
	//*  26   42:ldc1            #21  <Int 65280>
	//*  27   44:iand            
	//*  28   45:ldc1            #22  <Int 61440>
	//*  29   47:icmpne          95
			{
				int k = i + 1;
	//   30   50:iload_3         
	//   31   51:iconst_1        
	//   32   52:iadd            
	//   33   53:istore          5
				s[i] = (byte)c;
	//   34   55:aload_1         
	//   35   56:iload_3         
	//   36   57:iload           7
	//   37   59:int2byte        
	//   38   60:bastore         
				i = k;
	//   39   61:iload           5
	//   40   63:istore_3        
			}
		}

	//   41   64:iload           4
	//   42   66:iconst_1        
	//   43   67:iadd            
	//   44   68:istore          4
	//*  45   70:goto            19
		if(i == l)
	//*  46   73:iload_3         
	//*  47   74:iload           6
	//*  48   76:icmpne          81
		{
			return ((byte []) (s));
	//   49   79:aload_1         
	//   50   80:areturn         
		} else
		{
			s1 = ((String) (new byte[i]));
	//   51   81:iload_3         
	//   52   82:newarray        byte[]
	//   53   84:astore_2        
			System.arraycopy(((Object) (s)), 0, ((Object) (s1)), 0, i);
	//   54   85:aload_1         
	//   55   86:iconst_0        
	//   56   87:aload_2         
	//   57   88:iconst_0        
	//   58   89:iload_3         
	//   59   90:invokestatic    #35  <Method void System.arraycopy(Object, int, Object, int, int)>
			return ((byte []) (s1));
	//   60   93:aload_2         
	//   61   94:areturn         
		}
	//*  62   95:goto            64
	}

	private PdfEncodings$SymbolTTConversion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfEncodings$SymbolTTConversion(PdfEncodings._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfEncodings$SymbolTTConversion()>
	//    2    4:return          
	}
}
