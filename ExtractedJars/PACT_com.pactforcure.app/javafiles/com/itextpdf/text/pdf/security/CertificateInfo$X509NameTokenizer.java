// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;


// Referenced classes of package com.itextpdf.text.pdf.security:
//			CertificateInfo

public static class CertificateInfo$X509NameTokenizer
{

	public boolean hasMoreTokens()
	{
		return index != oid.length();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int index>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field String oid>
	//    4    8:invokevirtual   #36  <Method int String.length()>
	//    5   11:icmpeq          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public String nextToken()
	{
		boolean flag;
		boolean flag1;
		int i;
		if(index == oid.length())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int index>
	//*   2    4:aload_0         
	//*   3    5:getfield        #25  <Field String oid>
	//*   4    8:invokevirtual   #36  <Method int String.length()>
	//*   5   11:icmpne          16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		i = index + 1;
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field int index>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:istore          4
		flag1 = false;
	//   13   24:iconst_0        
	//   14   25:istore_3        
		flag = false;
	//   15   26:iconst_0        
	//   16   27:istore_2        
		buf.setLength(0);
	//   17   28:aload_0         
	//   18   29:getfield        #23  <Field StringBuffer buf>
	//   19   32:iconst_0        
	//   20   33:invokevirtual   #42  <Method void StringBuffer.setLength(int)>
_L2:
		char c;
		if(i == oid.length())
			break; /* Loop/switch isn't completed */
	//   21   36:iload           4
	//   22   38:aload_0         
	//   23   39:getfield        #25  <Field String oid>
	//   24   42:invokevirtual   #36  <Method int String.length()>
	//   25   45:icmpeq          149
		c = oid.charAt(i);
	//   26   48:aload_0         
	//   27   49:getfield        #25  <Field String oid>
	//   28   52:iload           4
	//   29   54:invokevirtual   #46  <Method char String.charAt(int)>
	//   30   57:istore_1        
		if(c == '"')
	//*  31   58:iload_1         
	//*  32   59:bipush          34
	//*  33   61:icmpne          110
		{
			boolean flag2;
			if(!flag)
	//*  34   64:iload_2         
	//*  35   65:ifne            96
			{
				if(!flag1)
	//*  36   68:iload_3         
	//*  37   69:ifne            91
					flag = true;
	//   38   72:iconst_1        
	//   39   73:istore_2        
				else
	//*  40   74:iconst_0        
	//*  41   75:istore          5
	//*  42   77:iload_2         
	//*  43   78:istore_3        
	//*  44   79:iload           5
	//*  45   81:istore_2        
	//*  46   82:iload           4
	//*  47   84:iconst_1        
	//*  48   85:iadd            
	//*  49   86:istore          4
	//*  50   88:goto            36
					flag = false;
	//   51   91:iconst_0        
	//   52   92:istore_2        
			} else
	//*  53   93:goto            74
			{
				buf.append(c);
	//   54   96:aload_0         
	//   55   97:getfield        #23  <Field StringBuffer buf>
	//   56  100:iload_1         
	//   57  101:invokevirtual   #50  <Method StringBuffer StringBuffer.append(char)>
	//   58  104:pop             
				flag = flag1;
	//   59  105:iload_3         
	//   60  106:istore_2        
			}
			flag2 = false;
			flag1 = flag;
			flag = flag2;
		} else
	//*  61  107:goto            74
		if(flag || flag1)
	//*  62  110:iload_2         
	//*  63  111:ifne            118
	//*  64  114:iload_3         
	//*  65  115:ifeq            132
		{
			buf.append(c);
	//   66  118:aload_0         
	//   67  119:getfield        #23  <Field StringBuffer buf>
	//   68  122:iload_1         
	//   69  123:invokevirtual   #50  <Method StringBuffer StringBuffer.append(char)>
	//   70  126:pop             
			flag = false;
	//   71  127:iconst_0        
	//   72  128:istore_2        
		} else
	//*  73  129:goto            82
		{
label0:
			{
				if(c != '\\')
					break label0;
	//   74  132:iload_1         
	//   75  133:bipush          92
	//   76  135:icmpne          143
				flag = true;
	//   77  138:iconst_1        
	//   78  139:istore_2        
			}
		}
_L3:
		i++;
		if(true) goto _L2; else goto _L1
	//*  79  140:goto            82
		if(c != ',')
			break MISSING_BLOCK_LABEL_166;
	//   80  143:iload_1         
	//   81  144:bipush          44
	//   82  146:icmpne          166
_L1:
		index = i;
	//   83  149:aload_0         
	//   84  150:iload           4
	//   85  152:putfield        #27  <Field int index>
		return buf.toString().trim();
	//   86  155:aload_0         
	//   87  156:getfield        #23  <Field StringBuffer buf>
	//   88  159:invokevirtual   #53  <Method String StringBuffer.toString()>
	//   89  162:invokevirtual   #56  <Method String String.trim()>
	//   90  165:areturn         
		buf.append(c);
	//   91  166:aload_0         
	//   92  167:getfield        #23  <Field StringBuffer buf>
	//   93  170:iload_1         
	//   94  171:invokevirtual   #50  <Method StringBuffer StringBuffer.append(char)>
	//   95  174:pop             
		  goto _L3
	//*  96  175:goto            82
	}

	private StringBuffer buf;
	private int index;
	private String oid;

	public CertificateInfo$X509NameTokenizer(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		buf = new StringBuffer();
	//    2    4:aload_0         
	//    3    5:new             #20  <Class StringBuffer>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void StringBuffer()>
	//    6   12:putfield        #23  <Field StringBuffer buf>
		oid = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #25  <Field String oid>
		index = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #27  <Field int index>
	//   13   25:return          
	}
}
