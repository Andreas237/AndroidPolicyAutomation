// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//			CharsToNameCanonicalizer

static final class CharsToNameCanonicalizer$Bucket
{

	public String has(char ac[], int i, int j)
	{
		if(symbol.length() != j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field String symbol>
	//*   2    4:invokevirtual   #32  <Method int String.length()>
	//*   3    7:iload_3         
	//*   4    8:icmpeq          13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		int k = 0;
	//    7   13:iconst_0        
	//    8   14:istore          4
		int l;
		do
		{
			if(symbol.charAt(k) != ac[i + k])
	//*   9   16:aload_0         
	//*  10   17:getfield        #20  <Field String symbol>
	//*  11   20:iload           4
	//*  12   22:invokevirtual   #36  <Method char String.charAt(int)>
	//*  13   25:aload_1         
	//*  14   26:iload_2         
	//*  15   27:iload           4
	//*  16   29:iadd            
	//*  17   30:caload          
	//*  18   31:icmpeq          36
				return null;
	//   19   34:aconst_null     
	//   20   35:areturn         
			l = k + 1;
	//   21   36:iload           4
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore          5
			k = l;
	//   25   42:iload           5
	//   26   44:istore          4
		} while(l < j);
	//   27   46:iload           5
	//   28   48:iload_3         
	//   29   49:icmplt          16
		return symbol;
	//   30   52:aload_0         
	//   31   53:getfield        #20  <Field String symbol>
	//   32   56:areturn         
	}

	public final int length;
	public final CharsToNameCanonicalizer$Bucket next;
	public final String symbol;

	public CharsToNameCanonicalizer$Bucket(String s, CharsToNameCanonicalizer$Bucket charstonamecanonicalizer$bucket)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		symbol = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String symbol>
		next = charstonamecanonicalizer$bucket;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field CharsToNameCanonicalizer$Bucket next>
		int i = 1;
	//    8   14:iconst_1        
	//    9   15:istore_3        
		if(charstonamecanonicalizer$bucket != null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       23
	//*  12   20:goto            30
			i = 1 + charstonamecanonicalizer$bucket.length;
	//   13   23:iconst_1        
	//   14   24:aload_2         
	//   15   25:getfield        #24  <Field int length>
	//   16   28:iadd            
	//   17   29:istore_3        
		length = i;
	//   18   30:aload_0         
	//   19   31:iload_3         
	//   20   32:putfield        #24  <Field int length>
	//   21   35:return          
	}
}
