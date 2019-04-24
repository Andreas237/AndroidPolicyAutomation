// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;


public class MurmurHash3
{

	private MurmurHash3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int murmurhash3_x86_32(byte abyte0[], int i, int j, int k)
	{
		int j1;
		for(j1 = (j & -4) + i; i < j1; i += 4)
	//*   0    0:iload_2         
	//*   1    1:bipush          -4
	//*   2    3:iand            
	//*   3    4:iload_1         
	//*   4    5:iadd            
	//*   5    6:istore          5
	//*   6    8:iload_1         
	//*   7    9:iload           5
	//*   8   11:icmpge          100
		{
			int l = (abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | abyte0[i + 3] << 24) * 0xcc9e2d51;
	//    9   14:aload_0         
	//   10   15:iload_1         
	//   11   16:baload          
	//   12   17:sipush          255
	//   13   20:iand            
	//   14   21:aload_0         
	//   15   22:iload_1         
	//   16   23:iconst_1        
	//   17   24:iadd            
	//   18   25:baload          
	//   19   26:sipush          255
	//   20   29:iand            
	//   21   30:bipush          8
	//   22   32:ishl            
	//   23   33:ior             
	//   24   34:aload_0         
	//   25   35:iload_1         
	//   26   36:iconst_2        
	//   27   37:iadd            
	//   28   38:baload          
	//   29   39:sipush          255
	//   30   42:iand            
	//   31   43:bipush          16
	//   32   45:ishl            
	//   33   46:ior             
	//   34   47:aload_0         
	//   35   48:iload_1         
	//   36   49:iconst_3        
	//   37   50:iadd            
	//   38   51:baload          
	//   39   52:bipush          24
	//   40   54:ishl            
	//   41   55:ior             
	//   42   56:ldc1            #12  <Int 0xcc9e2d51>
	//   43   58:imul            
	//   44   59:istore          4
			k ^= (l << 15 | l >>> 17) * 0x1b873593;
	//   45   61:iload_3         
	//   46   62:iload           4
	//   47   64:bipush          15
	//   48   66:ishl            
	//   49   67:iload           4
	//   50   69:bipush          17
	//   51   71:iushr           
	//   52   72:ior             
	//   53   73:ldc1            #13  <Int 0x1b873593>
	//   54   75:imul            
	//   55   76:ixor            
	//   56   77:istore_3        
			k = (k >>> 19 | k << 13) * 5 - 0x19ab949c;
	//   57   78:iload_3         
	//   58   79:bipush          19
	//   59   81:iushr           
	//   60   82:iload_3         
	//   61   83:bipush          13
	//   62   85:ishl            
	//   63   86:ior             
	//   64   87:iconst_5        
	//   65   88:imul            
	//   66   89:ldc1            #14  <Int 0x19ab949c>
	//   67   91:isub            
	//   68   92:istore_3        
		}

	//   69   93:iload_1         
	//   70   94:iconst_4        
	//   71   95:iadd            
	//   72   96:istore_1        
	//*  73   97:goto            8
		int i1 = 0;
	//   74  100:iconst_0        
	//   75  101:istore          4
		i = 0;
	//   76  103:iconst_0        
	//   77  104:istore_1        
		switch(j & 3)
	//*  78  105:iload_2         
	//*  79  106:iconst_3        
	//*  80  107:iand            
		{
	//*  81  108:tableswitch     1 3: default 136
	//	               1 170
	//	               2 153
	//	               3 139
	//*  82  136:goto            200
		case 3: // '\003'
			i = (abyte0[j1 + 2] & 0xff) << 16;
	//   83  139:aload_0         
	//   84  140:iload           5
	//   85  142:iconst_2        
	//   86  143:iadd            
	//   87  144:baload          
	//   88  145:sipush          255
	//   89  148:iand            
	//   90  149:bipush          16
	//   91  151:ishl            
	//   92  152:istore_1        
			// fall through

		case 2: // '\002'
			i1 = i | (abyte0[j1 + 1] & 0xff) << 8;
	//   93  153:iload_1         
	//   94  154:aload_0         
	//   95  155:iload           5
	//   96  157:iconst_1        
	//   97  158:iadd            
	//   98  159:baload          
	//   99  160:sipush          255
	//  100  163:iand            
	//  101  164:bipush          8
	//  102  166:ishl            
	//  103  167:ior             
	//  104  168:istore          4
			// fall through

		case 1: // '\001'
			i = (abyte0[j1] & 0xff | i1) * 0xcc9e2d51;
	//  105  170:aload_0         
	//  106  171:iload           5
	//  107  173:baload          
	//  108  174:sipush          255
	//  109  177:iand            
	//  110  178:iload           4
	//  111  180:ior             
	//  112  181:ldc1            #12  <Int 0xcc9e2d51>
	//  113  183:imul            
	//  114  184:istore_1        
			k ^= (i >>> 17 | i << 15) * 0x1b873593;
	//  115  185:iload_3         
	//  116  186:iload_1         
	//  117  187:bipush          17
	//  118  189:iushr           
	//  119  190:iload_1         
	//  120  191:bipush          15
	//  121  193:ishl            
	//  122  194:ior             
	//  123  195:ldc1            #13  <Int 0x1b873593>
	//  124  197:imul            
	//  125  198:ixor            
	//  126  199:istore_3        
			// fall through

		default:
			i = k ^ j;
	//  127  200:iload_3         
	//  128  201:iload_2         
	//  129  202:ixor            
	//  130  203:istore_1        
			i = (i ^ i >>> 16) * 0x85ebca6b;
	//  131  204:iload_1         
	//  132  205:iload_1         
	//  133  206:bipush          16
	//  134  208:iushr           
	//  135  209:ixor            
	//  136  210:ldc1            #15  <Int 0x85ebca6b>
	//  137  212:imul            
	//  138  213:istore_1        
			i = (i ^ i >>> 13) * 0xc2b2ae35;
	//  139  214:iload_1         
	//  140  215:iload_1         
	//  141  216:bipush          13
	//  142  218:iushr           
	//  143  219:ixor            
	//  144  220:ldc1            #16  <Int 0xc2b2ae35>
	//  145  222:imul            
	//  146  223:istore_1        
			return i ^ i >>> 16;
	//  147  224:iload_1         
	//  148  225:iload_1         
	//  149  226:bipush          16
	//  150  228:iushr           
	//  151  229:ixor            
	//  152  230:ireturn         
		}
	}
}
