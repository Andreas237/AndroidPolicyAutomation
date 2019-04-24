// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.SplitCharacter;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfChunk

public class DefaultSplitCharacter
	implements SplitCharacter
{

	public DefaultSplitCharacter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public DefaultSplitCharacter(char c)
	{
		this(new char[] {
			c
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:newarray        char[]
	//    3    4:dup             
	//    4    5:iconst_0        
	//    5    6:iload_1         
	//    6    7:castore         
	//    7    8:invokespecial   #23  <Method void DefaultSplitCharacter(char[])>
	//    8   11:return          
	}

	public DefaultSplitCharacter(char ac[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		characters = ac;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field char[] characters>
	//    5    9:return          
	}

	protected char getCurrentCharacter(int i, char ac[], PdfChunk apdfchunk[])
	{
		if(apdfchunk == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       8
			return ac[i];
	//    2    4:aload_2         
	//    3    5:iload_1         
	//    4    6:caload          
	//    5    7:ireturn         
		else
			return (char)apdfchunk[Math.min(i, apdfchunk.length - 1)].getUnicodeEquivalent(((int) (ac[i])));
	//    6    8:aload_3         
	//    7    9:iload_1         
	//    8   10:aload_3         
	//    9   11:arraylength     
	//   10   12:iconst_1        
	//   11   13:isub            
	//   12   14:invokestatic    #33  <Method int Math.min(int, int)>
	//   13   17:aaload          
	//   14   18:aload_2         
	//   15   19:iload_1         
	//   16   20:caload          
	//   17   21:invokevirtual   #39  <Method int PdfChunk.getUnicodeEquivalent(int)>
	//   18   24:int2char        
	//   19   25:ireturn         
	}

	public boolean isSplitCharacter(int i, int j, int k, char ac[], PdfChunk apdfchunk[])
	{
		j = ((int) (getCurrentCharacter(j, ac, apdfchunk)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:aload           4
	//    3    4:aload           5
	//    4    6:invokevirtual   #43  <Method char getCurrentCharacter(int, char[], PdfChunk[])>
	//    5    9:istore_2        
		if(characters == null) goto _L2; else goto _L1
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field char[] characters>
	//    8   14:ifnull          49
_L1:
		i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_1        
_L10:
		if(i >= characters.length) goto _L4; else goto _L3
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #25  <Field char[] characters>
	//   14   24:arraylength     
	//   15   25:icmpge          47
_L3:
		if(j != characters[i]) goto _L6; else goto _L5
	//   16   28:iload_2         
	//   17   29:aload_0         
	//   18   30:getfield        #25  <Field char[] characters>
	//   19   33:iload_1         
	//   20   34:caload          
	//   21   35:icmpne          40
_L5:
		return true;
	//   22   38:iconst_1        
	//   23   39:ireturn         
_L6:
		i++;
	//   24   40:iload_1         
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:istore_1        
		continue; /* Loop/switch isn't completed */
	//   28   44:goto            19
_L4:
		return false;
	//   29   47:iconst_0        
	//   30   48:ireturn         
_L2:
		if(j <= 32 || j == 45 || j == 8208) goto _L5; else goto _L7
	//   31   49:iload_2         
	//   32   50:bipush          32
	//   33   52:icmple          38
	//   34   55:iload_2         
	//   35   56:bipush          45
	//   36   58:icmpeq          38
	//   37   61:iload_2         
	//   38   62:sipush          8208
	//   39   65:icmpeq          38
_L7:
		if(j < 8194)
	//*  40   68:iload_2         
	//*  41   69:sipush          8194
	//*  42   72:icmpge          77
			return false;
	//   43   75:iconst_0        
	//   44   76:ireturn         
		if(j >= 8194 && j <= 8203 || j >= 11904 && j < 55200 || j >= 63744 && j < 64256 || j >= 65072 && j < 65104 || j >= 65377 && j < 65440) goto _L5; else goto _L8
	//   45   77:iload_2         
	//   46   78:sipush          8194
	//   47   81:icmplt          91
	//   48   84:iload_2         
	//   49   85:sipush          8203
	//   50   88:icmple          38
	//   51   91:iload_2         
	//   52   92:sipush          11904
	//   53   95:icmplt          104
	//   54   98:iload_2         
	//   55   99:ldc1            #44  <Int 55200>
	//   56  101:icmplt          38
	//   57  104:iload_2         
	//   58  105:ldc1            #45  <Int 63744>
	//   59  107:icmplt          116
	//   60  110:iload_2         
	//   61  111:ldc1            #46  <Int 64256>
	//   62  113:icmplt          38
	//   63  116:iload_2         
	//   64  117:ldc1            #47  <Int 65072>
	//   65  119:icmplt          128
	//   66  122:iload_2         
	//   67  123:ldc1            #48  <Int 65104>
	//   68  125:icmplt          38
	//   69  128:iload_2         
	//   70  129:ldc1            #49  <Int 65377>
	//   71  131:icmplt          140
	//   72  134:iload_2         
	//   73  135:ldc1            #50  <Int 65440>
	//   74  137:icmplt          38
_L8:
		return false;
	//   75  140:iconst_0        
	//   76  141:ireturn         
		if(true) goto _L10; else goto _L9
_L9:
	}

	public static final SplitCharacter DEFAULT = new DefaultSplitCharacter();
	protected char characters[];

	static 
	{
	//    0    0:new             #2   <Class DefaultSplitCharacter>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void DefaultSplitCharacter()>
	//    3    7:putstatic       #17  <Field SplitCharacter DEFAULT>
	//*   4   10:return          
	}
}
