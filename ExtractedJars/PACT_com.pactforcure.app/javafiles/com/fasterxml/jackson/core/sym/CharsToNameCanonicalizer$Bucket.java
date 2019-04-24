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
		if(symbol.length() == j) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String symbol>
	//    2    4:invokevirtual   #32  <Method int String.length()>
	//    3    7:iload_3         
	//    4    8:icmpeq          13
_L1:
		return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
_L2:
		int k = 0;
	//    7   13:iconst_0        
	//    8   14:istore          4
		int l;
		do
		{
			if(symbol.charAt(k) != ac[i + k])
				continue; /* Loop/switch isn't completed */
	//    9   16:aload_0         
	//   10   17:getfield        #20  <Field String symbol>
	//   11   20:iload           4
	//   12   22:invokevirtual   #36  <Method char String.charAt(int)>
	//   13   25:aload_1         
	//   14   26:iload_2         
	//   15   27:iload           4
	//   16   29:iadd            
	//   17   30:caload          
	//   18   31:icmpne          11
			l = k + 1;
	//   19   34:iload           4
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore          5
			k = l;
	//   23   40:iload           5
	//   24   42:istore          4
		} while(l < j);
	//   25   44:iload           5
	//   26   46:iload_3         
	//   27   47:icmplt          16
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		return symbol;
	//   28   50:aload_0         
	//   29   51:getfield        #20  <Field String symbol>
	//   30   54:areturn         
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
		int i;
		if(charstonamecanonicalizer$bucket == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       26
			i = 1;
	//   10   18:iconst_1        
	//   11   19:istore_3        
		else
	//*  12   20:aload_0         
	//*  13   21:iload_3         
	//*  14   22:putfield        #24  <Field int length>
	//*  15   25:return          
			i = charstonamecanonicalizer$bucket.length + 1;
	//   16   26:aload_2         
	//   17   27:getfield        #24  <Field int length>
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_3        
		length = i;
	//*  21   33:goto            20
	}
}
