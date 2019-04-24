// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.card;

import cn.com.fmsh.util.FM_Bytes;

public class CardTools
{

	public CardTools()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getFaceID4UID(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		byte abyte1[] = FM_Bytes.join(new byte[1], abyte0);
	//    8   12:iconst_1        
	//    9   13:newarray        byte[]
	//   10   15:aload_0         
	//   11   16:invokestatic    #17  <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   12   19:astore          7
		abyte0 = ((byte []) (new String("")));
	//   13   21:new             #19  <Class String>
	//   14   24:dup             
	//   15   25:ldc1            #21  <String "">
	//   16   27:invokespecial   #24  <Method void String(String)>
	//   17   30:astore_0        
		int ai[] = new int[20];
	//   18   31:bipush          20
	//   19   33:newarray        int[]
	//   20   35:astore          8
		long l1 = FM_Bytes.bytesToLong(abyte1);
	//   21   37:aload           7
	//   22   39:invokestatic    #28  <Method long FM_Bytes.bytesToLong(byte[])>
	//   23   42:lstore          5
		int i = 0;
	//   24   44:iconst_0        
	//   25   45:istore_1        
		do
	//*  26   46:goto            72
	//*  27   49:iload_3         
	//*  28   50:iconst_1        
	//*  29   51:iadd            
	//*  30   52:istore_1        
	//*  31   53:aload           8
	//*  32   55:iload_3         
	//*  33   56:lload           5
	//*  34   58:ldc2w           #29  <Long 10L>
	//*  35   61:lrem            
	//*  36   62:l2i             
	//*  37   63:iastore         
	//*  38   64:lload           5
	//*  39   66:ldc2w           #29  <Long 10L>
	//*  40   69:ldiv            
	//*  41   70:lstore          5
		{
			j1 = i;
	//   42   72:iload_1         
	//   43   73:istore_3        
			if(l1 > 0L)
			{
				i = j1 + 1;
				ai[j1] = (int)(l1 % 10L);
				l1 /= 10L;
			} else
	//*  44   74:lload           5
	//*  45   76:lconst_0        
	//*  46   77:lcmp            
	//*  47   78:ifgt            49
			{
				int j = 0;
	//   48   81:iconst_0        
	//   49   82:istore_1        
				for(int l = 0; l < j1; l++)
	//*  50   83:iconst_0        
	//*  51   84:istore_2        
	//*  52   85:goto            133
					if((l & 1) == 0)
	//*  53   88:iload_2         
	//*  54   89:iconst_1        
	//*  55   90:iand            
	//*  56   91:ifne            122
					{
						int k1 = ai[l] + ai[l];
	//   57   94:aload           8
	//   58   96:iload_2         
	//   59   97:iaload          
	//   60   98:aload           8
	//   61  100:iload_2         
	//   62  101:iaload          
	//   63  102:iadd            
	//   64  103:istore          4
						j = j + k1 % 10 + k1 / 10;
	//   65  105:iload_1         
	//   66  106:iload           4
	//   67  108:bipush          10
	//   68  110:irem            
	//   69  111:iadd            
	//   70  112:iload           4
	//   71  114:bipush          10
	//   72  116:idiv            
	//   73  117:iadd            
	//   74  118:istore_1        
					} else
	//*  75  119:goto            129
					{
						j += ai[l];
	//   76  122:iload_1         
	//   77  123:aload           8
	//   78  125:iload_2         
	//   79  126:iaload          
	//   80  127:iadd            
	//   81  128:istore_1        
					}

	//   82  129:iload_2         
	//   83  130:iconst_1        
	//   84  131:iadd            
	//   85  132:istore_2        
	//   86  133:iload_2         
	//   87  134:iload_3         
	//   88  135:icmplt          88
				abyte0 = ((byte []) ((new StringBuilder(String.valueOf(((Object) (abyte0))))).append((10 - j % 10) % 10).toString()));
	//   89  138:new             #32  <Class StringBuilder>
	//   90  141:dup             
	//   91  142:aload_0         
	//   92  143:invokestatic    #36  <Method String String.valueOf(Object)>
	//   93  146:invokespecial   #37  <Method void StringBuilder(String)>
	//   94  149:bipush          10
	//   95  151:iload_1         
	//   96  152:bipush          10
	//   97  154:irem            
	//   98  155:isub            
	//   99  156:bipush          10
	//  100  158:irem            
	//  101  159:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//  102  162:invokevirtual   #45  <Method String StringBuilder.toString()>
	//  103  165:astore_0        
				long l2 = FM_Bytes.bytesToLong(abyte1);
	//  104  166:aload           7
	//  105  168:invokestatic    #28  <Method long FM_Bytes.bytesToLong(byte[])>
	//  106  171:lstore          5
				for(int k = 1; k < 11; k += 2)
	//* 107  173:iconst_1        
	//* 108  174:istore_1        
	//* 109  175:goto            240
				{
					int i1 = (int)(l2 % 100L);
	//  110  178:lload           5
	//  111  180:ldc2w           #46  <Long 100L>
	//  112  183:lrem            
	//  113  184:l2i             
	//  114  185:istore_2        
					abyte0 = ((byte []) ((new StringBuilder(String.valueOf(((Object) ((new StringBuilder(String.valueOf(((Object) (abyte0))))).append(i1 / 10).toString()))))).append(i1 % 10).toString()));
	//  115  186:new             #32  <Class StringBuilder>
	//  116  189:dup             
	//  117  190:new             #32  <Class StringBuilder>
	//  118  193:dup             
	//  119  194:aload_0         
	//  120  195:invokestatic    #36  <Method String String.valueOf(Object)>
	//  121  198:invokespecial   #37  <Method void StringBuilder(String)>
	//  122  201:iload_2         
	//  123  202:bipush          10
	//  124  204:idiv            
	//  125  205:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//  126  208:invokevirtual   #45  <Method String StringBuilder.toString()>
	//  127  211:invokestatic    #36  <Method String String.valueOf(Object)>
	//  128  214:invokespecial   #37  <Method void StringBuilder(String)>
	//  129  217:iload_2         
	//  130  218:bipush          10
	//  131  220:irem            
	//  132  221:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//  133  224:invokevirtual   #45  <Method String StringBuilder.toString()>
	//  134  227:astore_0        
					l2 /= 100L;
	//  135  228:lload           5
	//  136  230:ldc2w           #46  <Long 100L>
	//  137  233:ldiv            
	//  138  234:lstore          5
				}

	//  139  236:iload_1         
	//  140  237:iconst_2        
	//  141  238:iadd            
	//  142  239:istore_1        
	//  143  240:iload_1         
	//  144  241:bipush          11
	//  145  243:icmplt          178
				return ((String) (abyte0));
	//  146  246:aload_0         
	//  147  247:areturn         
			}
		} while(true);
	}

	public static String getFaceNo4uidByLnt(byte abyte0[])
	{
		return FM_Bytes.bytesToHexString(abyte0);
	//    0    0:aload_0         
	//    1    1:invokestatic    #51  <Method String FM_Bytes.bytesToHexString(byte[])>
	//    2    4:areturn         
	}
}
