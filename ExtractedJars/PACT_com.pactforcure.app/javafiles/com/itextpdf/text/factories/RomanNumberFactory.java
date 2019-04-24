// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.factories;


public class RomanNumberFactory
{
	private static class RomanDigit
	{

		public char digit;
		public boolean pre;
		public int value;

		RomanDigit(char c, int i, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			digit = c;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field char digit>
			value = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int value>
			pre = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field boolean pre>
		//   11   19:return          
		}
	}


	public RomanNumberFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static final String getLowerCaseString(int i)
	{
		return getString(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #25  <Method String getString(int)>
	//    2    4:areturn         
	}

	public static final String getString(int i)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #27  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuffer()>
	//    3    7:astore          4
		int j = i;
	//    4    9:iload_0         
	//    5   10:istore_1        
		if(i < 0)
	//*   6   11:iload_0         
	//*   7   12:ifge            26
		{
			stringbuffer.append('-');
	//    8   15:aload           4
	//    9   17:bipush          45
	//   10   19:invokevirtual   #32  <Method StringBuffer StringBuffer.append(char)>
	//   11   22:pop             
			j = -i;
	//   12   23:iload_0         
	//   13   24:ineg            
	//   14   25:istore_1        
		}
		i = j;
	//   15   26:iload_1         
	//   16   27:istore_0        
		if(j > 3000)
	//*  17   28:iload_1         
	//*  18   29:sipush          3000
	//*  19   32:icmple          77
		{
			stringbuffer.append('|');
	//   20   35:aload           4
	//   21   37:bipush          124
	//   22   39:invokevirtual   #32  <Method StringBuffer StringBuffer.append(char)>
	//   23   42:pop             
			stringbuffer.append(getString(j / 1000));
	//   24   43:aload           4
	//   25   45:iload_1         
	//   26   46:sipush          1000
	//   27   49:idiv            
	//   28   50:invokestatic    #25  <Method String getString(int)>
	//   29   53:invokevirtual   #35  <Method StringBuffer StringBuffer.append(String)>
	//   30   56:pop             
			stringbuffer.append('|');
	//   31   57:aload           4
	//   32   59:bipush          124
	//   33   61:invokevirtual   #32  <Method StringBuffer StringBuffer.append(char)>
	//   34   64:pop             
			i = j - (j / 1000) * 1000;
	//   35   65:iload_1         
	//   36   66:iload_1         
	//   37   67:sipush          1000
	//   38   70:idiv            
	//   39   71:sipush          1000
	//   40   74:imul            
	//   41   75:isub            
	//   42   76:istore_0        
		}
		boolean flag = false;
	//   43   77:iconst_0        
	//   44   78:istore_2        
		j = i;
	//   45   79:iload_0         
	//   46   80:istore_1        
		i = ((int) (flag));
	//   47   81:iload_2         
	//   48   82:istore_0        
		do
		{
			RomanDigit romandigit;
			for(romandigit = roman[i]; j >= romandigit.value; j -= romandigit.value)
	//*  49   83:getstatic       #17  <Field RomanNumberFactory$RomanDigit[] roman>
	//*  50   86:iload_0         
	//*  51   87:aaload          
	//*  52   88:astore          5
	//*  53   90:iload_1         
	//*  54   91:aload           5
	//*  55   93:getfield        #39  <Field int RomanNumberFactory$RomanDigit.value>
	//*  56   96:icmplt          121
				stringbuffer.append(romandigit.digit);
	//   57   99:aload           4
	//   58  101:aload           5
	//   59  103:getfield        #43  <Field char RomanNumberFactory$RomanDigit.digit>
	//   60  106:invokevirtual   #32  <Method StringBuffer StringBuffer.append(char)>
	//   61  109:pop             

	//   62  110:iload_1         
	//   63  111:aload           5
	//   64  113:getfield        #39  <Field int RomanNumberFactory$RomanDigit.value>
	//   65  116:isub            
	//   66  117:istore_1        
	//*  67  118:goto            90
			if(j <= 0)
	//*  68  121:iload_1         
	//*  69  122:ifgt            131
				return stringbuffer.toString();
	//   70  125:aload           4
	//   71  127:invokevirtual   #47  <Method String StringBuffer.toString()>
	//   72  130:areturn         
			int k = i;
	//   73  131:iload_0         
	//   74  132:istore_2        
			int l;
			RomanDigit aromandigit[];
			do
			{
				aromandigit = roman;
	//   75  133:getstatic       #17  <Field RomanNumberFactory$RomanDigit[] roman>
	//   76  136:astore          6
				l = k + 1;
	//   77  138:iload_2         
	//   78  139:iconst_1        
	//   79  140:iadd            
	//   80  141:istore_3        
				k = l;
	//   81  142:iload_3         
	//   82  143:istore_2        
			} while(!aromandigit[l].pre);
	//   83  144:aload           6
	//   84  146:iload_3         
	//   85  147:aaload          
	//   86  148:getfield        #51  <Field boolean RomanNumberFactory$RomanDigit.pre>
	//   87  151:ifeq            133
			k = j;
	//   88  154:iload_1         
	//   89  155:istore_2        
			if(roman[l].value + j >= romandigit.value)
	//*  90  156:getstatic       #17  <Field RomanNumberFactory$RomanDigit[] roman>
	//*  91  159:iload_3         
	//*  92  160:aaload          
	//*  93  161:getfield        #39  <Field int RomanNumberFactory$RomanDigit.value>
	//*  94  164:iload_1         
	//*  95  165:iadd            
	//*  96  166:aload           5
	//*  97  168:getfield        #39  <Field int RomanNumberFactory$RomanDigit.value>
	//*  98  171:icmplt          213
			{
				stringbuffer.append(roman[l].digit).append(romandigit.digit);
	//   99  174:aload           4
	//  100  176:getstatic       #17  <Field RomanNumberFactory$RomanDigit[] roman>
	//  101  179:iload_3         
	//  102  180:aaload          
	//  103  181:getfield        #43  <Field char RomanNumberFactory$RomanDigit.digit>
	//  104  184:invokevirtual   #32  <Method StringBuffer StringBuffer.append(char)>
	//  105  187:aload           5
	//  106  189:getfield        #43  <Field char RomanNumberFactory$RomanDigit.digit>
	//  107  192:invokevirtual   #32  <Method StringBuffer StringBuffer.append(char)>
	//  108  195:pop             
				k = j - (romandigit.value - roman[l].value);
	//  109  196:iload_1         
	//  110  197:aload           5
	//  111  199:getfield        #39  <Field int RomanNumberFactory$RomanDigit.value>
	//  112  202:getstatic       #17  <Field RomanNumberFactory$RomanDigit[] roman>
	//  113  205:iload_3         
	//  114  206:aaload          
	//  115  207:getfield        #39  <Field int RomanNumberFactory$RomanDigit.value>
	//  116  210:isub            
	//  117  211:isub            
	//  118  212:istore_2        
			}
			i++;
	//  119  213:iload_0         
	//  120  214:iconst_1        
	//  121  215:iadd            
	//  122  216:istore_0        
			j = k;
	//  123  217:iload_2         
	//  124  218:istore_1        
		} while(true);
	//  125  219:goto            83
	}

	public static final String getString(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			return getLowerCaseString(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #54  <Method String getLowerCaseString(int)>
	//    4    8:areturn         
		else
			return getUpperCaseString(i);
	//    5    9:iload_0         
	//    6   10:invokestatic    #57  <Method String getUpperCaseString(int)>
	//    7   13:areturn         
	}

	public static final String getUpperCaseString(int i)
	{
		return getString(i).toUpperCase();
	//    0    0:iload_0         
	//    1    1:invokestatic    #25  <Method String getString(int)>
	//    2    4:invokevirtual   #62  <Method String String.toUpperCase()>
	//    3    7:areturn         
	}

	private static final RomanDigit roman[] = {
		new RomanDigit('m', 1000, false), new RomanDigit('d', 500, false), new RomanDigit('c', 100, true), new RomanDigit('l', 50, false), new RomanDigit('x', 10, true), new RomanDigit('v', 5, false), new RomanDigit('i', 1, true)
	};

	static 
	{
	//    0    0:bipush          7
	//    1    2:anewarray       RomanDigit[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:new             #6   <Class RomanNumberFactory$RomanDigit>
	//    5   10:dup             
	//    6   11:bipush          109
	//    7   13:sipush          1000
	//    8   16:iconst_0        
	//    9   17:invokespecial   #15  <Method void RomanNumberFactory$RomanDigit(char, int, boolean)>
	//   10   20:aastore         
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:new             #6   <Class RomanNumberFactory$RomanDigit>
	//   14   26:dup             
	//   15   27:bipush          100
	//   16   29:sipush          500
	//   17   32:iconst_0        
	//   18   33:invokespecial   #15  <Method void RomanNumberFactory$RomanDigit(char, int, boolean)>
	//   19   36:aastore         
	//   20   37:dup             
	//   21   38:iconst_2        
	//   22   39:new             #6   <Class RomanNumberFactory$RomanDigit>
	//   23   42:dup             
	//   24   43:bipush          99
	//   25   45:bipush          100
	//   26   47:iconst_1        
	//   27   48:invokespecial   #15  <Method void RomanNumberFactory$RomanDigit(char, int, boolean)>
	//   28   51:aastore         
	//   29   52:dup             
	//   30   53:iconst_3        
	//   31   54:new             #6   <Class RomanNumberFactory$RomanDigit>
	//   32   57:dup             
	//   33   58:bipush          108
	//   34   60:bipush          50
	//   35   62:iconst_0        
	//   36   63:invokespecial   #15  <Method void RomanNumberFactory$RomanDigit(char, int, boolean)>
	//   37   66:aastore         
	//   38   67:dup             
	//   39   68:iconst_4        
	//   40   69:new             #6   <Class RomanNumberFactory$RomanDigit>
	//   41   72:dup             
	//   42   73:bipush          120
	//   43   75:bipush          10
	//   44   77:iconst_1        
	//   45   78:invokespecial   #15  <Method void RomanNumberFactory$RomanDigit(char, int, boolean)>
	//   46   81:aastore         
	//   47   82:dup             
	//   48   83:iconst_5        
	//   49   84:new             #6   <Class RomanNumberFactory$RomanDigit>
	//   50   87:dup             
	//   51   88:bipush          118
	//   52   90:iconst_5        
	//   53   91:iconst_0        
	//   54   92:invokespecial   #15  <Method void RomanNumberFactory$RomanDigit(char, int, boolean)>
	//   55   95:aastore         
	//   56   96:dup             
	//   57   97:bipush          6
	//   58   99:new             #6   <Class RomanNumberFactory$RomanDigit>
	//   59  102:dup             
	//   60  103:bipush          105
	//   61  105:iconst_1        
	//   62  106:iconst_1        
	//   63  107:invokespecial   #15  <Method void RomanNumberFactory$RomanDigit(char, int, boolean)>
	//   64  110:aastore         
	//   65  111:putstatic       #17  <Field RomanNumberFactory$RomanDigit[] roman>
	//*  66  114:return          
	}
}
