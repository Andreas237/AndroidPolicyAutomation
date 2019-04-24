// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


public class zzapu
{

	public static boolean zzCK()
	{
		String s = (String)zzaVn.get();
	//    0    0:getstatic       #16  <Field ThreadLocal zzaVn>
	//    1    3:invokevirtual   #23  <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #25  <Class String>
	//    3    9:astore_0        
		return s == null || s.startsWith("com.google");
	//    4   10:aload_0         
	//    5   11:ifnull          23
	//    6   14:aload_0         
	//    7   15:ldc1            #27  <String "com.google">
	//    8   17:invokevirtual   #31  <Method boolean String.startsWith(String)>
	//    9   20:ifeq            25
	//   10   23:iconst_1        
	//   11   24:ireturn         
	//   12   25:iconst_0        
	//   13   26:ireturn         
	}

	public static String zzL(String s, String s1)
	{
		if(s == null || s1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
		{
			return s;
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			byte abyte0[] = new byte[s.length() + s1.length()];
	//    6   10:aload_0         
	//    7   11:invokevirtual   #37  <Method int String.length()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #37  <Method int String.length()>
	//   10   18:iadd            
	//   11   19:newarray        byte[]
	//   12   21:astore_2        
			System.arraycopy(((Object) (s.getBytes())), 0, ((Object) (abyte0)), 0, s.length());
	//   13   22:aload_0         
	//   14   23:invokevirtual   #41  <Method byte[] String.getBytes()>
	//   15   26:iconst_0        
	//   16   27:aload_2         
	//   17   28:iconst_0        
	//   18   29:aload_0         
	//   19   30:invokevirtual   #37  <Method int String.length()>
	//   20   33:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (s1.getBytes())), 0, ((Object) (abyte0)), s.length(), s1.length());
	//   21   36:aload_1         
	//   22   37:invokevirtual   #41  <Method byte[] String.getBytes()>
	//   23   40:iconst_0        
	//   24   41:aload_2         
	//   25   42:aload_0         
	//   26   43:invokevirtual   #37  <Method int String.length()>
	//   27   46:aload_1         
	//   28   47:invokevirtual   #37  <Method int String.length()>
	//   29   50:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
			return Integer.toHexString(zza(abyte0, 0, abyte0.length, 0));
	//   30   53:aload_2         
	//   31   54:iconst_0        
	//   32   55:aload_2         
	//   33   56:arraylength     
	//   34   57:iconst_0        
	//   35   58:invokestatic    #51  <Method int zza(byte[], int, int, int)>
	//   36   61:invokestatic    #57  <Method String Integer.toHexString(int)>
	//   37   64:areturn         
		}
	}

	private static int zza(byte abyte0[], int i, int j, int k)
	{
		int l = k;
	//    0    0:iload_3         
	//    1    1:istore          4
		int i1 = i + (j & -4);
	//    2    3:iload_1         
	//    3    4:iload_2         
	//    4    5:bipush          -4
	//    5    7:iand            
	//    6    8:iadd            
	//    7    9:istore          5
		k = i;
	//    8   11:iload_1         
	//    9   12:istore_3        
		i = l;
	//   10   13:iload           4
	//   11   15:istore_1        
		for(; k < i1; k += 4)
	//*  12   16:iload_3         
	//*  13   17:iload           5
	//*  14   19:icmpge          108
		{
			l = (abyte0[k] & 0xff | (abyte0[k + 1] & 0xff) << 8 | (abyte0[k + 2] & 0xff) << 16 | abyte0[k + 3] << 24) * 0xcc9e2d51;
	//   15   22:aload_0         
	//   16   23:iload_3         
	//   17   24:baload          
	//   18   25:sipush          255
	//   19   28:iand            
	//   20   29:aload_0         
	//   21   30:iload_3         
	//   22   31:iconst_1        
	//   23   32:iadd            
	//   24   33:baload          
	//   25   34:sipush          255
	//   26   37:iand            
	//   27   38:bipush          8
	//   28   40:ishl            
	//   29   41:ior             
	//   30   42:aload_0         
	//   31   43:iload_3         
	//   32   44:iconst_2        
	//   33   45:iadd            
	//   34   46:baload          
	//   35   47:sipush          255
	//   36   50:iand            
	//   37   51:bipush          16
	//   38   53:ishl            
	//   39   54:ior             
	//   40   55:aload_0         
	//   41   56:iload_3         
	//   42   57:iconst_3        
	//   43   58:iadd            
	//   44   59:baload          
	//   45   60:bipush          24
	//   46   62:ishl            
	//   47   63:ior             
	//   48   64:ldc1            #58  <Int 0xcc9e2d51>
	//   49   66:imul            
	//   50   67:istore          4
			i ^= (l << 15 | l >>> 17) * 0x1b873593;
	//   51   69:iload_1         
	//   52   70:iload           4
	//   53   72:bipush          15
	//   54   74:ishl            
	//   55   75:iload           4
	//   56   77:bipush          17
	//   57   79:iushr           
	//   58   80:ior             
	//   59   81:ldc1            #59  <Int 0x1b873593>
	//   60   83:imul            
	//   61   84:ixor            
	//   62   85:istore_1        
			i = (i << 13 | i >>> 19) * 5 - 0x19ab949c;
	//   63   86:iload_1         
	//   64   87:bipush          13
	//   65   89:ishl            
	//   66   90:iload_1         
	//   67   91:bipush          19
	//   68   93:iushr           
	//   69   94:ior             
	//   70   95:iconst_5        
	//   71   96:imul            
	//   72   97:ldc1            #60  <Int 0x19ab949c>
	//   73   99:isub            
	//   74  100:istore_1        
		}

	//   75  101:iload_3         
	//   76  102:iconst_4        
	//   77  103:iadd            
	//   78  104:istore_3        
	//*  79  105:goto            16
		l = 0;
	//   80  108:iconst_0        
	//   81  109:istore          4
		k = 0;
	//   82  111:iconst_0        
	//   83  112:istore_3        
		switch(j & 3)
	//*  84  113:iload_2         
	//*  85  114:iconst_3        
	//*  86  115:iand            
		{
	//*  87  116:tableswitch     1 3: default 144
	//	               1 178
	//	               2 161
	//	               3 147
	//*  88  144:goto            208
		case 3: // '\003'
			k = (abyte0[i1 + 2] & 0xff) << 16;
	//   89  147:aload_0         
	//   90  148:iload           5
	//   91  150:iconst_2        
	//   92  151:iadd            
	//   93  152:baload          
	//   94  153:sipush          255
	//   95  156:iand            
	//   96  157:bipush          16
	//   97  159:ishl            
	//   98  160:istore_3        
			// fall through

		case 2: // '\002'
			l = k | (abyte0[i1 + 1] & 0xff) << 8;
	//   99  161:iload_3         
	//  100  162:aload_0         
	//  101  163:iload           5
	//  102  165:iconst_1        
	//  103  166:iadd            
	//  104  167:baload          
	//  105  168:sipush          255
	//  106  171:iand            
	//  107  172:bipush          8
	//  108  174:ishl            
	//  109  175:ior             
	//  110  176:istore          4
			// fall through

		case 1: // '\001'
			k = (l | abyte0[i1] & 0xff) * 0xcc9e2d51;
	//  111  178:iload           4
	//  112  180:aload_0         
	//  113  181:iload           5
	//  114  183:baload          
	//  115  184:sipush          255
	//  116  187:iand            
	//  117  188:ior             
	//  118  189:ldc1            #58  <Int 0xcc9e2d51>
	//  119  191:imul            
	//  120  192:istore_3        
			i ^= (k << 15 | k >>> 17) * 0x1b873593;
	//  121  193:iload_1         
	//  122  194:iload_3         
	//  123  195:bipush          15
	//  124  197:ishl            
	//  125  198:iload_3         
	//  126  199:bipush          17
	//  127  201:iushr           
	//  128  202:ior             
	//  129  203:ldc1            #59  <Int 0x1b873593>
	//  130  205:imul            
	//  131  206:ixor            
	//  132  207:istore_1        
			// fall through

		default:
			i ^= j;
	//  133  208:iload_1         
	//  134  209:iload_2         
	//  135  210:ixor            
	//  136  211:istore_1        
			i = (i ^ i >>> 16) * 0x85ebca6b;
	//  137  212:iload_1         
	//  138  213:iload_1         
	//  139  214:bipush          16
	//  140  216:iushr           
	//  141  217:ixor            
	//  142  218:ldc1            #61  <Int 0x85ebca6b>
	//  143  220:imul            
	//  144  221:istore_1        
			i = (i ^ i >>> 13) * 0xc2b2ae35;
	//  145  222:iload_1         
	//  146  223:iload_1         
	//  147  224:bipush          13
	//  148  226:iushr           
	//  149  227:ixor            
	//  150  228:ldc1            #62  <Int 0xc2b2ae35>
	//  151  230:imul            
	//  152  231:istore_1        
			return i ^ i >>> 16;
	//  153  232:iload_1         
	//  154  233:iload_1         
	//  155  234:bipush          16
	//  156  236:iushr           
	//  157  237:ixor            
	//  158  238:ireturn         
		}
	}

	public static String zzek(String s)
	{
		if(zzCK())
	//*   0    0:invokestatic    #66  <Method boolean zzCK()>
	//*   1    3:ifeq            8
			return s;
	//    2    6:aload_0         
	//    3    7:areturn         
		else
			return zzL(s, (String)zzaVn.get());
	//    4    8:aload_0         
	//    5    9:getstatic       #16  <Field ThreadLocal zzaVn>
	//    6   12:invokevirtual   #23  <Method Object ThreadLocal.get()>
	//    7   15:checkcast       #25  <Class String>
	//    8   18:invokestatic    #68  <Method String zzL(String, String)>
	//    9   21:areturn         
	}

	private static final ThreadLocal zzaVn = new ThreadLocal();

	static 
	{
	//    0    0:new             #11  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ThreadLocal()>
	//    3    7:putstatic       #16  <Field ThreadLocal zzaVn>
	//*   4   10:return          
	}
}
