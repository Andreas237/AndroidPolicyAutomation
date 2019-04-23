// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bno, bdj, bgd, bnw, 
//			bod, bnz, bnk, zzfs, 
//			zzqi, bfp, bfw, bfx, 
//			zzhp, bge

final class bgg
{

	private bgg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		j = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #58  <Field int j>
		k = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #60  <Field int k>
		l = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #62  <Field int l>
		m = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #64  <Field int m>
		n = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #66  <Field int n>
		o = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #68  <Field byte[] o>
		p = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #70  <Field int p>
		q = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #72  <Field boolean q>
		r = -1;
	//   26   44:aload_0         
	//   27   45:iconst_m1       
	//   28   46:putfield        #74  <Field int r>
		s = -1;
	//   29   49:aload_0         
	//   30   50:iconst_m1       
	//   31   51:putfield        #76  <Field int s>
		t = -1;
	//   32   54:aload_0         
	//   33   55:iconst_m1       
	//   34   56:putfield        #78  <Field int t>
		u = 1000;
	//   35   59:aload_0         
	//   36   60:sipush          1000
	//   37   63:putfield        #80  <Field int u>
		v = 200;
	//   38   66:aload_0         
	//   39   67:sipush          200
	//   40   70:putfield        #82  <Field int v>
		w = -1F;
	//   41   73:aload_0         
	//   42   74:ldc1            #83  <Float -1F>
	//   43   76:putfield        #85  <Field float w>
		x = -1F;
	//   44   79:aload_0         
	//   45   80:ldc1            #83  <Float -1F>
	//   46   82:putfield        #87  <Field float x>
		y = -1F;
	//   47   85:aload_0         
	//   48   86:ldc1            #83  <Float -1F>
	//   49   88:putfield        #89  <Field float y>
		z = -1F;
	//   50   91:aload_0         
	//   51   92:ldc1            #83  <Float -1F>
	//   52   94:putfield        #91  <Field float z>
		A = -1F;
	//   53   97:aload_0         
	//   54   98:ldc1            #83  <Float -1F>
	//   55  100:putfield        #93  <Field float A>
		B = -1F;
	//   56  103:aload_0         
	//   57  104:ldc1            #83  <Float -1F>
	//   58  106:putfield        #95  <Field float B>
		C = -1F;
	//   59  109:aload_0         
	//   60  110:ldc1            #83  <Float -1F>
	//   61  112:putfield        #97  <Field float C>
		D = -1F;
	//   62  115:aload_0         
	//   63  116:ldc1            #83  <Float -1F>
	//   64  118:putfield        #99  <Field float D>
		E = -1F;
	//   65  121:aload_0         
	//   66  122:ldc1            #83  <Float -1F>
	//   67  124:putfield        #101 <Field float E>
		F = -1F;
	//   68  127:aload_0         
	//   69  128:ldc1            #83  <Float -1F>
	//   70  130:putfield        #103 <Field float F>
		G = 1;
	//   71  133:aload_0         
	//   72  134:iconst_1        
	//   73  135:putfield        #105 <Field int G>
		H = -1;
	//   74  138:aload_0         
	//   75  139:iconst_m1       
	//   76  140:putfield        #107 <Field int H>
		I = 8000;
	//   77  143:aload_0         
	//   78  144:sipush          8000
	//   79  147:putfield        #109 <Field int I>
		J = 0L;
	//   80  150:aload_0         
	//   81  151:lconst_0        
	//   82  152:putfield        #111 <Field long J>
		K = 0L;
	//   83  155:aload_0         
	//   84  156:lconst_0        
	//   85  157:putfield        #113 <Field long K>
		M = true;
	//   86  160:aload_0         
	//   87  161:iconst_1        
	//   88  162:putfield        #115 <Field boolean M>
		P = "eng";
	//   89  165:aload_0         
	//   90  166:ldc1            #117 <String "eng">
	//   91  168:putfield        #119 <Field String P>
	//   92  171:return          
	}

	bgg(bge bge)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method void bgg()>
	//    2    4:return          
	}

	static String a(bgg bgg1, String s1)
	{
		bgg1.P = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field String P>
		return s1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private static List a(bno bno1)
	{
		bno1.d(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokevirtual   #131 <Method void bno.d(int)>
		if(bno1.k() != 0x31435657L)
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #134 <Method long bno.k()>
	//*   5   10:ldc2w           #135 <Long 0x31435657L>
	//*   6   13:lcmp            
	//*   7   14:ifeq            19
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
		int i1;
		i1 = bno1.d() + 20;
	//   10   19:aload_0         
	//   11   20:invokevirtual   #139 <Method int bno.d()>
	//   12   23:bipush          20
	//   13   25:iadd            
	//   14   26:istore_1        
		bno1 = ((bno) (bno1.a));
	//   15   27:aload_0         
	//   16   28:getfield        #141 <Field byte[] bno.a>
	//   17   31:astore_0        
_L5:
		if(i1 >= bno1.length - 4) goto _L2; else goto _L1
	//   18   32:iload_1         
	//   19   33:aload_0         
	//   20   34:arraylength     
	//   21   35:iconst_4        
	//   22   36:isub            
	//   23   37:icmpge          84
_L1:
		if(bno1[i1] != 0 || bno1[i1 + 1] != 0 || bno1[i1 + 2] != 1 || bno1[i1 + 3] != 15)
			break MISSING_BLOCK_LABEL_108;
	//   24   40:aload_0         
	//   25   41:iload_1         
	//   26   42:baload          
	//   27   43:ifne            108
	//   28   46:aload_0         
	//   29   47:iload_1         
	//   30   48:iconst_1        
	//   31   49:iadd            
	//   32   50:baload          
	//   33   51:ifne            108
	//   34   54:aload_0         
	//   35   55:iload_1         
	//   36   56:iconst_2        
	//   37   57:iadd            
	//   38   58:baload          
	//   39   59:iconst_1        
	//   40   60:icmpne          108
	//   41   63:aload_0         
	//   42   64:iload_1         
	//   43   65:iconst_3        
	//   44   66:iadd            
	//   45   67:baload          
	//   46   68:bipush          15
	//   47   70:icmpne          108
		return Collections.singletonList(((Object) (Arrays.copyOfRange(((byte []) (bno1)), i1, bno1.length))));
	//   48   73:aload_0         
	//   49   74:iload_1         
	//   50   75:aload_0         
	//   51   76:arraylength     
	//   52   77:invokestatic    #147 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   53   80:invokestatic    #153 <Method List Collections.singletonList(Object)>
	//   54   83:areturn         
_L2:
		throw new bdj("Failed to find FourCC VC1 initialization data");
	//   55   84:new             #155 <Class bdj>
	//   56   87:dup             
	//   57   88:ldc1            #157 <String "Failed to find FourCC VC1 initialization data">
	//   58   90:invokespecial   #160 <Method void bdj(String)>
	//   59   93:athrow          
_L4:
		throw new bdj("Error parsing FourCC VC1 codec private");
	//   60   94:new             #155 <Class bdj>
	//   61   97:dup             
	//   62   98:ldc1            #162 <String "Error parsing FourCC VC1 codec private">
	//   63  100:invokespecial   #160 <Method void bdj(String)>
	//   64  103:athrow          
		bno1;
	//   65  104:astore_0        
		if(true) goto _L4; else goto _L3
	//   66  105:goto            94
_L3:
		i1++;
	//   67  108:iload_1         
	//   68  109:iconst_1        
	//   69  110:iadd            
	//   70  111:istore_1        
		  goto _L5
	//*  71  112:goto            32
	}

	private static List a(byte abyte0[])
	{
		if(abyte0[0] != 2) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:baload          
	//    3    3:iconst_2        
	//    4    4:icmpne          149
_L1:
		int i1 = 1;
	//    5    7:iconst_1        
	//    6    8:istore_1        
		int k1;
		int l1;
		byte abyte1[];
		byte abyte2[];
		int j1 = 0;
	//    7    9:iconst_0        
	//    8   10:istore_2        
	//*   9   11:goto            173
	//*  10   14:iload_2         
	//*  11   15:iconst_1        
	//*  12   16:iadd            
	//*  13   17:istore_3        
	//*  14   18:aload_0         
	//*  15   19:iload_2         
	//*  16   20:baload          
	//*  17   21:istore_2        
	//*  18   22:aload_0         
	//*  19   23:iload_3         
	//*  20   24:baload          
	//*  21   25:iconst_1        
	//*  22   26:icmpne          139
	//*  23   29:iload           4
	//*  24   31:newarray        byte[]
	//*  25   33:astore          5
	//*  26   35:aload_0         
	//*  27   36:iload_3         
	//*  28   37:aload           5
	//*  29   39:iconst_0        
	//*  30   40:iload           4
	//*  31   42:invokestatic    #169 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  32   45:iload_3         
	//*  33   46:iload           4
	//*  34   48:iadd            
	//*  35   49:istore_3        
	//*  36   50:aload_0         
	//*  37   51:iload_3         
	//*  38   52:baload          
	//*  39   53:iconst_3        
	//*  40   54:icmpne          129
	//*  41   57:iload_3         
	//*  42   58:iload_1         
	//*  43   59:iload_2         
	//*  44   60:iadd            
	//*  45   61:iadd            
	//*  46   62:istore_1        
	//*  47   63:aload_0         
	//*  48   64:iload_1         
	//*  49   65:baload          
	//*  50   66:iconst_5        
	//*  51   67:icmpne          119
	//*  52   70:aload_0         
	//*  53   71:arraylength     
	//*  54   72:iload_1         
	//*  55   73:isub            
	//*  56   74:newarray        byte[]
	//*  57   76:astore          6
	//*  58   78:aload_0         
	//*  59   79:iload_1         
	//*  60   80:aload           6
	//*  61   82:iconst_0        
	//*  62   83:aload_0         
	//*  63   84:arraylength     
	//*  64   85:iload_1         
	//*  65   86:isub            
	//*  66   87:invokestatic    #169 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  67   90:new             #171 <Class ArrayList>
	//*  68   93:dup             
	//*  69   94:iconst_2        
	//*  70   95:invokespecial   #173 <Method void ArrayList(int)>
	//*  71   98:astore_0        
	//*  72   99:aload_0         
	//*  73  100:aload           5
	//*  74  102:invokeinterface #179 <Method boolean List.add(Object)>
	//*  75  107:pop             
	//*  76  108:aload_0         
	//*  77  109:aload           6
	//*  78  111:invokeinterface #179 <Method boolean List.add(Object)>
	//*  79  116:pop             
	//*  80  117:aload_0         
	//*  81  118:areturn         
	//*  82  119:new             #155 <Class bdj>
	//*  83  122:dup             
	//*  84  123:ldc1            #181 <String "Error parsing vorbis codec private">
	//*  85  125:invokespecial   #160 <Method void bdj(String)>
	//*  86  128:athrow          
	//*  87  129:new             #155 <Class bdj>
	//*  88  132:dup             
	//*  89  133:ldc1            #181 <String "Error parsing vorbis codec private">
	//*  90  135:invokespecial   #160 <Method void bdj(String)>
	//*  91  138:athrow          
	//*  92  139:new             #155 <Class bdj>
	//*  93  142:dup             
	//*  94  143:ldc1            #181 <String "Error parsing vorbis codec private">
	//*  95  145:invokespecial   #160 <Method void bdj(String)>
	//*  96  148:athrow          
	//*  97  149:new             #155 <Class bdj>
	//*  98  152:dup             
	//*  99  153:ldc1            #181 <String "Error parsing vorbis codec private">
	//* 100  155:invokespecial   #160 <Method void bdj(String)>
	//* 101  158:athrow          
	//* 102  159:new             #155 <Class bdj>
	//* 103  162:dup             
	//* 104  163:ldc1            #181 <String "Error parsing vorbis codec private">
	//* 105  165:invokespecial   #160 <Method void bdj(String)>
	//* 106  168:athrow          
	//* 107  169:astore_0        
	//* 108  170:goto            159
		for(; abyte0[i1] == -1; i1++)
	//* 109  173:aload_0         
	//* 110  174:iload_1         
	//* 111  175:baload          
	//* 112  176:iconst_m1       
	//* 113  177:icmpne          193
			j1 += 255;
	//  114  180:iload_2         
	//  115  181:sipush          255
	//  116  184:iadd            
	//  117  185:istore_2        

	//  118  186:iload_1         
	//  119  187:iconst_1        
	//  120  188:iadd            
	//  121  189:istore_1        
	//* 122  190:goto            173
		k1 = i1 + 1;
	//  123  193:iload_1         
	//  124  194:iconst_1        
	//  125  195:iadd            
	//  126  196:istore_3        
		l1 = j1 + abyte0[i1];
	//  127  197:iload_2         
	//  128  198:aload_0         
	//  129  199:iload_1         
	//  130  200:baload          
	//  131  201:iadd            
	//  132  202:istore          4
		i1 = 0;
	//  133  204:iconst_0        
	//  134  205:istore_1        
		j1 = k1;
	//  135  206:iload_3         
	//  136  207:istore_2        
		while(abyte0[j1] == -1) 
	//* 137  208:aload_0         
	//* 138  209:iload_2         
	//* 139  210:baload          
	//* 140  211:iconst_m1       
	//* 141  212:icmpne          14
		{
			i1 += 255;
	//  142  215:iload_1         
	//  143  216:sipush          255
	//  144  219:iadd            
	//  145  220:istore_1        
			j1++;
	//  146  221:iload_2         
	//  147  222:iconst_1        
	//  148  223:iadd            
	//  149  224:istore_2        
		}
		  goto _L3
_L5:
		k1 = j1 + 1;
		j1 = ((int) (abyte0[j1]));
		if(abyte0[k1] != 1)
			break MISSING_BLOCK_LABEL_139;
		try
		{
			abyte1 = new byte[l1];
			System.arraycopy(((Object) (abyte0)), k1, ((Object) (abyte1)), 0, l1);
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new bdj("Error parsing vorbis codec private");
		}
		k1 += l1;
		if(abyte0[k1] != 3)
			break MISSING_BLOCK_LABEL_129;
		i1 = k1 + (i1 + j1);
		if(abyte0[i1] != 5)
			break MISSING_BLOCK_LABEL_119;
		abyte2 = new byte[abyte0.length - i1];
		System.arraycopy(((Object) (abyte0)), i1, ((Object) (abyte2)), 0, abyte0.length - i1);
		abyte0 = ((byte []) (new ArrayList(2)));
		((List) (abyte0)).add(((Object) (abyte1)));
		((List) (abyte0)).add(((Object) (abyte2)));
		return ((List) (abyte0));
		throw new bdj("Error parsing vorbis codec private");
		throw new bdj("Error parsing vorbis codec private");
		throw new bdj("Error parsing vorbis codec private");
_L2:
		throw new bdj("Error parsing vorbis codec private");
_L3:
		if(true) goto _L5; else goto _L4
	//  150  225:goto            208
_L4:
	}

	private static boolean b(bno bno1)
	{
		int i1;
		long l1;
		long l2;
		try
		{
			i1 = bno1.h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method int bno.h()>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          12
	//*   6   10:iconst_1        
	//*   7   11:ireturn         
	//*   8   12:iload_1         
	//*   9   13:ldc1            #185 <Int 65534>
	//*  10   15:icmpne          62
	//*  11   18:aload_0         
	//*  12   19:bipush          24
	//*  13   21:invokevirtual   #187 <Method void bno.c(int)>
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #189 <Method long bno.m()>
	//*  16   28:invokestatic    #194 <Method UUID bgd.a()>
	//*  17   31:invokevirtual   #199 <Method long UUID.getMostSignificantBits()>
	//*  18   34:lcmp            
	//*  19   35:ifne            60
	//*  20   38:aload_0         
	//*  21   39:invokevirtual   #189 <Method long bno.m()>
	//*  22   42:lstore_2        
	//*  23   43:invokestatic    #194 <Method UUID bgd.a()>
	//*  24   46:invokevirtual   #202 <Method long UUID.getLeastSignificantBits()>
	//*  25   49:lstore          4
	//*  26   51:lload_2         
	//*  27   52:lload           4
	//*  28   54:lcmp            
	//*  29   55:ifne            60
	//*  30   58:iconst_1        
	//*  31   59:ireturn         
	//*  32   60:iconst_0        
	//*  33   61:ireturn         
	//*  34   62:iconst_0        
	//*  35   63:ireturn         
	//*  36   64:new             #155 <Class bdj>
	//*  37   67:dup             
	//*  38   68:ldc1            #204 <String "Error parsing MS/ACM codec private">
	//*  39   70:invokespecial   #160 <Method void bdj(String)>
	//*  40   73:athrow          
		// Misplaced declaration of an exception variable
		catch(bno bno1)
		{
			throw new bdj("Error parsing MS/ACM codec private");
		}
		if(i1 == 1)
			return true;
		if(i1 != 65534)
			break MISSING_BLOCK_LABEL_62;
		bno1.c(24);
		if(bno1.m() != bgd.a().getMostSignificantBits())
			break MISSING_BLOCK_LABEL_60;
		l1 = bno1.m();
		l2 = bgd.a().getLeastSignificantBits();
		if(l1 == l2)
			return true;
		return false;
		return false;
	//*  41   74:astore_0        
	//*  42   75:goto            64
	}

	public final void a(bfp bfp1, int i1)
	{
		Object obj;
label0:
		{
			int l1;
			byte byte0;
			Object obj1;
label1:
			{
				float f1;
				int j1;
				Object obj2;
label2:
				{
label3:
					{
						String s1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field String a>
	//    2    4:astore          9
						j1 = s1.hashCode();
	//    3    6:aload           9
	//    4    8:invokevirtual   #212 <Method int String.hashCode()>
	//    5   11:istore          4
						byte0 = 3;
	//    6   13:iconst_3        
	//    7   14:istore          7
						switch(j1)
	//*   8   16:iload           4
						{
						default:
							break;

	//*   9   18:lookupswitch    28: default 252
	//	               -2095576542: 716
	//	               -2095575984: 699
	//	               -1985379776: 681
	//	               -1784763192: 663
	//	               -1730367663: 645
	//	               -1482641358: 627
	//	               -1482641357: 609
	//	               -1373388978: 591
	//	               -933872740: 574
	//	               -538363189: 558
	//	               -538363109: 541
	//	               -425012669: 524
	//	               -356037306: 507
	//	               62923557: 490
	//	               62923603: 473
	//	               62927045: 456
	//	               82338133: 440
	//	               82338134: 424
	//	               99146302: 407
	//	               444813526: 390
	//	               542569478: 373
	//	               725957860: 356
	//	               855502857: 339
	//	               1422270023: 322
	//	               1809237540: 306
	//	               1950749482: 289
	//	               1950789798: 272
	//	               1951062397: 255
	//*  10  252:goto            733
						case 1951062397: 
							if(s1.equals("A_OPUS"))
	//*  11  255:aload           9
	//*  12  257:ldc1            #214 <String "A_OPUS">
	//*  13  259:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  14  262:ifeq            733
							{
								j1 = 11;
	//   15  265:bipush          11
	//   16  267:istore          4
								break label3;
	//   17  269:goto            736
							}
							break;

						case 1950789798: 
							if(!s1.equals("A_FLAC"))
								break;
	//   18  272:aload           9
	//   19  274:ldc1            #219 <String "A_FLAC">
	//   20  276:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   21  279:ifeq            733
							j1 = 21;
	//   22  282:bipush          21
	//   23  284:istore          4
							break label3;
	//   24  286:goto            736

						case 1950749482: 
							if(!s1.equals("A_EAC3"))
								break;
	//   25  289:aload           9
	//   26  291:ldc1            #221 <String "A_EAC3">
	//   27  293:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   28  296:ifeq            733
							j1 = 16;
	//   29  299:bipush          16
	//   30  301:istore          4
							break label3;
	//   31  303:goto            736

						case 1809237540: 
							if(!s1.equals("V_MPEG2"))
								break;
	//   32  306:aload           9
	//   33  308:ldc1            #223 <String "V_MPEG2">
	//   34  310:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   35  313:ifeq            733
							j1 = 2;
	//   36  316:iconst_2        
	//   37  317:istore          4
							break label3;
	//   38  319:goto            736

						case 1422270023: 
							if(!s1.equals("S_TEXT/UTF8"))
								break;
	//   39  322:aload           9
	//   40  324:ldc1            #225 <String "S_TEXT/UTF8">
	//   41  326:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   42  329:ifeq            733
							j1 = 24;
	//   43  332:bipush          24
	//   44  334:istore          4
							break label3;
	//   45  336:goto            736

						case 855502857: 
							if(!s1.equals("V_MPEGH/ISO/HEVC"))
								break;
	//   46  339:aload           9
	//   47  341:ldc1            #227 <String "V_MPEGH/ISO/HEVC">
	//   48  343:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   49  346:ifeq            733
							j1 = 7;
	//   50  349:bipush          7
	//   51  351:istore          4
							break label3;
	//   52  353:goto            736

						case 725957860: 
							if(!s1.equals("A_PCM/INT/LIT"))
								break;
	//   53  356:aload           9
	//   54  358:ldc1            #229 <String "A_PCM/INT/LIT">
	//   55  360:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   56  363:ifeq            733
							j1 = 23;
	//   57  366:bipush          23
	//   58  368:istore          4
							break label3;
	//   59  370:goto            736

						case 542569478: 
							if(!s1.equals("A_DTS/EXPRESS"))
								break;
	//   60  373:aload           9
	//   61  375:ldc1            #231 <String "A_DTS/EXPRESS">
	//   62  377:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   63  380:ifeq            733
							j1 = 19;
	//   64  383:bipush          19
	//   65  385:istore          4
							break label3;
	//   66  387:goto            736

						case 444813526: 
							if(!s1.equals("V_THEORA"))
								break;
	//   67  390:aload           9
	//   68  392:ldc1            #233 <String "V_THEORA">
	//   69  394:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   70  397:ifeq            733
							j1 = 9;
	//   71  400:bipush          9
	//   72  402:istore          4
							break label3;
	//   73  404:goto            736

						case 99146302: 
							if(!s1.equals("S_HDMV/PGS"))
								break;
	//   74  407:aload           9
	//   75  409:ldc1            #235 <String "S_HDMV/PGS">
	//   76  411:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   77  414:ifeq            733
							j1 = 26;
	//   78  417:bipush          26
	//   79  419:istore          4
							break label3;
	//   80  421:goto            736

						case 82338134: 
							if(!s1.equals("V_VP9"))
								break;
	//   81  424:aload           9
	//   82  426:ldc1            #237 <String "V_VP9">
	//   83  428:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   84  431:ifeq            733
							j1 = 1;
	//   85  434:iconst_1        
	//   86  435:istore          4
							break label3;
	//   87  437:goto            736

						case 82338133: 
							if(!s1.equals("V_VP8"))
								break;
	//   88  440:aload           9
	//   89  442:ldc1            #239 <String "V_VP8">
	//   90  444:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   91  447:ifeq            733
							j1 = 0;
	//   92  450:iconst_0        
	//   93  451:istore          4
							break label3;
	//   94  453:goto            736

						case 62927045: 
							if(!s1.equals("A_DTS"))
								break;
	//   95  456:aload           9
	//   96  458:ldc1            #241 <String "A_DTS">
	//   97  460:invokevirtual   #217 <Method boolean String.equals(Object)>
	//   98  463:ifeq            733
							j1 = 18;
	//   99  466:bipush          18
	//  100  468:istore          4
							break label3;
	//  101  470:goto            736

						case 62923603: 
							if(!s1.equals("A_AC3"))
								break;
	//  102  473:aload           9
	//  103  475:ldc1            #243 <String "A_AC3">
	//  104  477:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  105  480:ifeq            733
							j1 = 15;
	//  106  483:bipush          15
	//  107  485:istore          4
							break label3;
	//  108  487:goto            736

						case 62923557: 
							if(!s1.equals("A_AAC"))
								break;
	//  109  490:aload           9
	//  110  492:ldc1            #245 <String "A_AAC">
	//  111  494:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  112  497:ifeq            733
							j1 = 12;
	//  113  500:bipush          12
	//  114  502:istore          4
							break label3;
	//  115  504:goto            736

						case -356037306: 
							if(!s1.equals("A_DTS/LOSSLESS"))
								break;
	//  116  507:aload           9
	//  117  509:ldc1            #247 <String "A_DTS/LOSSLESS">
	//  118  511:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  119  514:ifeq            733
							j1 = 20;
	//  120  517:bipush          20
	//  121  519:istore          4
							break label3;
	//  122  521:goto            736

						case -425012669: 
							if(!s1.equals("S_VOBSUB"))
								break;
	//  123  524:aload           9
	//  124  526:ldc1            #249 <String "S_VOBSUB">
	//  125  528:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  126  531:ifeq            733
							j1 = 25;
	//  127  534:bipush          25
	//  128  536:istore          4
							break label3;
	//  129  538:goto            736

						case -538363109: 
							if(!s1.equals("V_MPEG4/ISO/AVC"))
								break;
	//  130  541:aload           9
	//  131  543:ldc1            #251 <String "V_MPEG4/ISO/AVC">
	//  132  545:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  133  548:ifeq            733
							j1 = 6;
	//  134  551:bipush          6
	//  135  553:istore          4
							break label3;
	//  136  555:goto            736

						case -538363189: 
							if(!s1.equals("V_MPEG4/ISO/ASP"))
								break;
	//  137  558:aload           9
	//  138  560:ldc1            #253 <String "V_MPEG4/ISO/ASP">
	//  139  562:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  140  565:ifeq            733
							j1 = 4;
	//  141  568:iconst_4        
	//  142  569:istore          4
							break label3;
	//  143  571:goto            736

						case -933872740: 
							if(!s1.equals("S_DVBSUB"))
								break;
	//  144  574:aload           9
	//  145  576:ldc1            #255 <String "S_DVBSUB">
	//  146  578:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  147  581:ifeq            733
							j1 = 27;
	//  148  584:bipush          27
	//  149  586:istore          4
							break label3;
	//  150  588:goto            736

						case -1373388978: 
							if(!s1.equals("V_MS/VFW/FOURCC"))
								break;
	//  151  591:aload           9
	//  152  593:ldc2            #257 <String "V_MS/VFW/FOURCC">
	//  153  596:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  154  599:ifeq            733
							j1 = 8;
	//  155  602:bipush          8
	//  156  604:istore          4
							break label3;
	//  157  606:goto            736

						case -1482641357: 
							if(!s1.equals("A_MPEG/L3"))
								break;
	//  158  609:aload           9
	//  159  611:ldc2            #259 <String "A_MPEG/L3">
	//  160  614:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  161  617:ifeq            733
							j1 = 14;
	//  162  620:bipush          14
	//  163  622:istore          4
							break label3;
	//  164  624:goto            736

						case -1482641358: 
							if(!s1.equals("A_MPEG/L2"))
								break;
	//  165  627:aload           9
	//  166  629:ldc2            #261 <String "A_MPEG/L2">
	//  167  632:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  168  635:ifeq            733
							j1 = 13;
	//  169  638:bipush          13
	//  170  640:istore          4
							break label3;
	//  171  642:goto            736

						case -1730367663: 
							if(!s1.equals("A_VORBIS"))
								break;
	//  172  645:aload           9
	//  173  647:ldc2            #263 <String "A_VORBIS">
	//  174  650:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  175  653:ifeq            733
							j1 = 10;
	//  176  656:bipush          10
	//  177  658:istore          4
							break label3;
	//  178  660:goto            736

						case -1784763192: 
							if(!s1.equals("A_TRUEHD"))
								break;
	//  179  663:aload           9
	//  180  665:ldc2            #265 <String "A_TRUEHD">
	//  181  668:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  182  671:ifeq            733
							j1 = 17;
	//  183  674:bipush          17
	//  184  676:istore          4
							break label3;
	//  185  678:goto            736

						case -1985379776: 
							if(!s1.equals("A_MS/ACM"))
								break;
	//  186  681:aload           9
	//  187  683:ldc2            #267 <String "A_MS/ACM">
	//  188  686:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  189  689:ifeq            733
							j1 = 22;
	//  190  692:bipush          22
	//  191  694:istore          4
							break label3;
	//  192  696:goto            736

						case -2095575984: 
							if(!s1.equals("V_MPEG4/ISO/SP"))
								break;
	//  193  699:aload           9
	//  194  701:ldc2            #269 <String "V_MPEG4/ISO/SP">
	//  195  704:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  196  707:ifeq            733
							j1 = 3;
	//  197  710:iconst_3        
	//  198  711:istore          4
							break label3;
	//  199  713:goto            736

						case -2095576542: 
							if(!s1.equals("V_MPEG4/ISO/AP"))
								break;
	//  200  716:aload           9
	//  201  718:ldc2            #271 <String "V_MPEG4/ISO/AP">
	//  202  721:invokevirtual   #217 <Method boolean String.equals(Object)>
	//  203  724:ifeq            733
							j1 = 5;
	//  204  727:iconst_5        
	//  205  728:istore          4
							break label3;
	//  206  730:goto            736
						}
						j1 = -1;
	//  207  733:iconst_m1       
	//  208  734:istore          4
					}
					obj2 = null;
	//  209  736:aconst_null     
	//  210  737:astore          12
					int k1;
					switch(j1)
	//* 211  739:iload           4
					{
	//* 212  741:tableswitch     0 27: default 868
	//	               0 1844
	//	               1 1827
	//	               2 1810
	//	               3 1772
	//	               4 1772
	//	               5 1772
	//	               6 1726
	//	               7 1680
	//	               8 1621
	//	               9 1604
	//	               10 1579
	//	               11 1483
	//	               12 1460
	//	               13 1441
	//	               14 1422
	//	               15 1405
	//	               16 1388
	//	               17 1371
	//	               18 1354
	//	               19 1354
	//	               20 1337
	//	               21 1314
	//	               22 1111
	//	               23 992
	//	               24 975
	//	               25 952
	//	               26 935
	//	               27 879
					default:
						throw new bdj("Unrecognized codec identifier.");
	//  213  868:new             #155 <Class bdj>
	//  214  871:dup             
	//  215  872:ldc2            #273 <String "Unrecognized codec identifier.">
	//  216  875:invokespecial   #160 <Method void bdj(String)>
	//  217  878:athrow          

					case 27: // '\033'
						byte abyte0[] = h;
	//  218  879:aload_0         
	//  219  880:getfield        #275 <Field byte[] h>
	//  220  883:astore          9
						obj = ((Object) (Collections.singletonList(((Object) (new byte[] {
							abyte0[0], abyte0[1], abyte0[2], abyte0[3]
						})))));
	//  221  885:iconst_4        
	//  222  886:newarray        byte[]
	//  223  888:dup             
	//  224  889:iconst_0        
	//  225  890:aload           9
	//  226  892:iconst_0        
	//  227  893:baload          
	//  228  894:bastore         
	//  229  895:dup             
	//  230  896:iconst_1        
	//  231  897:aload           9
	//  232  899:iconst_1        
	//  233  900:baload          
	//  234  901:bastore         
	//  235  902:dup             
	//  236  903:iconst_2        
	//  237  904:aload           9
	//  238  906:iconst_2        
	//  239  907:baload          
	//  240  908:bastore         
	//  241  909:dup             
	//  242  910:iconst_3        
	//  243  911:aload           9
	//  244  913:iconst_3        
	//  245  914:baload          
	//  246  915:bastore         
	//  247  916:invokestatic    #153 <Method List Collections.singletonList(Object)>
	//  248  919:astore          9
						obj1 = "application/dvbsubs";
	//  249  921:ldc2            #277 <String "application/dvbsubs">
	//  250  924:astore          10
						j1 = -1;
	//  251  926:iconst_m1       
	//  252  927:istore          4
						k1 = -1;
	//  253  929:iconst_m1       
	//  254  930:istore          5
						break;
	//  255  932:goto            1858

					case 26: // '\032'
						obj1 = "application/pgs";
	//  256  935:ldc2            #279 <String "application/pgs">
	//  257  938:astore          10
						obj = null;
	//  258  940:aconst_null     
	//  259  941:astore          9
						j1 = -1;
	//  260  943:iconst_m1       
	//  261  944:istore          4
						k1 = -1;
	//  262  946:iconst_m1       
	//  263  947:istore          5
						break;
	//  264  949:goto            1858

					case 25: // '\031'
						obj = ((Object) (Collections.singletonList(((Object) (h)))));
	//  265  952:aload_0         
	//  266  953:getfield        #275 <Field byte[] h>
	//  267  956:invokestatic    #153 <Method List Collections.singletonList(Object)>
	//  268  959:astore          9
						obj1 = "application/vobsub";
	//  269  961:ldc2            #281 <String "application/vobsub">
	//  270  964:astore          10
						j1 = -1;
	//  271  966:iconst_m1       
	//  272  967:istore          4
						k1 = -1;
	//  273  969:iconst_m1       
	//  274  970:istore          5
						break;
	//  275  972:goto            1858

					case 24: // '\030'
						obj1 = "application/x-subrip";
	//  276  975:ldc2            #283 <String "application/x-subrip">
	//  277  978:astore          10
						obj = null;
	//  278  980:aconst_null     
	//  279  981:astore          9
						j1 = -1;
	//  280  983:iconst_m1       
	//  281  984:istore          4
						k1 = -1;
	//  282  986:iconst_m1       
	//  283  987:istore          5
						break;
	//  284  989:goto            1858

					case 23: // '\027'
						k1 = bnw.a(H);
	//  285  992:aload_0         
	//  286  993:getfield        #107 <Field int H>
	//  287  996:invokestatic    #288 <Method int bnw.a(int)>
	//  288  999:istore          5
						if(k1 == 0)
	//* 289 1001:iload           5
	//* 290 1003:ifne            1097
						{
							j1 = H;
	//  291 1006:aload_0         
	//  292 1007:getfield        #107 <Field int H>
	//  293 1010:istore          4
							obj = ((Object) (new StringBuilder(String.valueOf("audio/x-unknown").length() + 60)));
	//  294 1012:new             #290 <Class StringBuilder>
	//  295 1015:dup             
	//  296 1016:ldc2            #292 <String "audio/x-unknown">
	//  297 1019:invokestatic    #296 <Method String String.valueOf(Object)>
	//  298 1022:invokevirtual   #299 <Method int String.length()>
	//  299 1025:bipush          60
	//  300 1027:iadd            
	//  301 1028:invokespecial   #300 <Method void StringBuilder(int)>
	//  302 1031:astore          9
							((StringBuilder) (obj)).append("Unsupported PCM bit depth: ");
	//  303 1033:aload           9
	//  304 1035:ldc2            #302 <String "Unsupported PCM bit depth: ">
	//  305 1038:invokevirtual   #306 <Method StringBuilder StringBuilder.append(String)>
	//  306 1041:pop             
							((StringBuilder) (obj)).append(j1);
	//  307 1042:aload           9
	//  308 1044:iload           4
	//  309 1046:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//  310 1049:pop             
							((StringBuilder) (obj)).append(". Setting mimeType to ");
	//  311 1050:aload           9
	//  312 1052:ldc2            #311 <String ". Setting mimeType to ">
	//  313 1055:invokevirtual   #306 <Method StringBuilder StringBuilder.append(String)>
	//  314 1058:pop             
							((StringBuilder) (obj)).append("audio/x-unknown");
	//  315 1059:aload           9
	//  316 1061:ldc2            #292 <String "audio/x-unknown">
	//  317 1064:invokevirtual   #306 <Method StringBuilder StringBuilder.append(String)>
	//  318 1067:pop             
							Log.w("MatroskaExtractor", ((StringBuilder) (obj)).toString());
	//  319 1068:ldc2            #313 <String "MatroskaExtractor">
	//  320 1071:aload           9
	//  321 1073:invokevirtual   #317 <Method String StringBuilder.toString()>
	//  322 1076:invokestatic    #322 <Method int Log.w(String, String)>
	//  323 1079:pop             
							obj1 = "audio/x-unknown";
	//  324 1080:ldc2            #292 <String "audio/x-unknown">
	//  325 1083:astore          10
							obj = null;
	//  326 1085:aconst_null     
	//  327 1086:astore          9
							j1 = -1;
	//  328 1088:iconst_m1       
	//  329 1089:istore          4
							k1 = -1;
	//  330 1091:iconst_m1       
	//  331 1092:istore          5
						} else
	//* 332 1094:goto            1858
						{
							obj1 = "audio/raw";
	//  333 1097:ldc2            #324 <String "audio/raw">
	//  334 1100:astore          10
							obj = null;
	//  335 1102:aconst_null     
	//  336 1103:astore          9
							j1 = -1;
	//  337 1105:iconst_m1       
	//  338 1106:istore          4
						}
						break;
	//  339 1108:goto            1858

					case 22: // '\026'
						if(b(new bno(h)))
	//* 340 1111:new             #128 <Class bno>
	//* 341 1114:dup             
	//* 342 1115:aload_0         
	//* 343 1116:getfield        #275 <Field byte[] h>
	//* 344 1119:invokespecial   #327 <Method void bno(byte[])>
	//* 345 1122:invokestatic    #329 <Method boolean b(bno)>
	//* 346 1125:ifeq            1247
						{
							k1 = bnw.a(H);
	//  347 1128:aload_0         
	//  348 1129:getfield        #107 <Field int H>
	//  349 1132:invokestatic    #288 <Method int bnw.a(int)>
	//  350 1135:istore          5
							if(k1 == 0)
	//* 351 1137:iload           5
	//* 352 1139:ifne            1233
							{
								j1 = H;
	//  353 1142:aload_0         
	//  354 1143:getfield        #107 <Field int H>
	//  355 1146:istore          4
								obj = ((Object) (new StringBuilder(String.valueOf("audio/x-unknown").length() + 60)));
	//  356 1148:new             #290 <Class StringBuilder>
	//  357 1151:dup             
	//  358 1152:ldc2            #292 <String "audio/x-unknown">
	//  359 1155:invokestatic    #296 <Method String String.valueOf(Object)>
	//  360 1158:invokevirtual   #299 <Method int String.length()>
	//  361 1161:bipush          60
	//  362 1163:iadd            
	//  363 1164:invokespecial   #300 <Method void StringBuilder(int)>
	//  364 1167:astore          9
								((StringBuilder) (obj)).append("Unsupported PCM bit depth: ");
	//  365 1169:aload           9
	//  366 1171:ldc2            #302 <String "Unsupported PCM bit depth: ">
	//  367 1174:invokevirtual   #306 <Method StringBuilder StringBuilder.append(String)>
	//  368 1177:pop             
								((StringBuilder) (obj)).append(j1);
	//  369 1178:aload           9
	//  370 1180:iload           4
	//  371 1182:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//  372 1185:pop             
								((StringBuilder) (obj)).append(". Setting mimeType to ");
	//  373 1186:aload           9
	//  374 1188:ldc2            #311 <String ". Setting mimeType to ">
	//  375 1191:invokevirtual   #306 <Method StringBuilder StringBuilder.append(String)>
	//  376 1194:pop             
								((StringBuilder) (obj)).append("audio/x-unknown");
	//  377 1195:aload           9
	//  378 1197:ldc2            #292 <String "audio/x-unknown">
	//  379 1200:invokevirtual   #306 <Method StringBuilder StringBuilder.append(String)>
	//  380 1203:pop             
								Log.w("MatroskaExtractor", ((StringBuilder) (obj)).toString());
	//  381 1204:ldc2            #313 <String "MatroskaExtractor">
	//  382 1207:aload           9
	//  383 1209:invokevirtual   #317 <Method String StringBuilder.toString()>
	//  384 1212:invokestatic    #322 <Method int Log.w(String, String)>
	//  385 1215:pop             
								obj1 = "audio/x-unknown";
	//  386 1216:ldc2            #292 <String "audio/x-unknown">
	//  387 1219:astore          10
								obj = null;
	//  388 1221:aconst_null     
	//  389 1222:astore          9
								j1 = -1;
	//  390 1224:iconst_m1       
	//  391 1225:istore          4
								k1 = -1;
	//  392 1227:iconst_m1       
	//  393 1228:istore          5
							} else
	//* 394 1230:goto            1858
							{
								obj1 = "audio/raw";
	//  395 1233:ldc2            #324 <String "audio/raw">
	//  396 1236:astore          10
								obj = null;
	//  397 1238:aconst_null     
	//  398 1239:astore          9
								j1 = -1;
	//  399 1241:iconst_m1       
	//  400 1242:istore          4
							}
							break;
	//  401 1244:goto            1858
						}
						obj = ((Object) (String.valueOf("audio/x-unknown")));
	//  402 1247:ldc2            #292 <String "audio/x-unknown">
	//  403 1250:invokestatic    #296 <Method String String.valueOf(Object)>
	//  404 1253:astore          9
						if(((String) (obj)).length() != 0)
	//* 405 1255:aload           9
	//* 406 1257:invokevirtual   #299 <Method int String.length()>
	//* 407 1260:ifeq            1276
							obj = ((Object) ("Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat(((String) (obj)))));
	//  408 1263:ldc2            #331 <String "Non-PCM MS/ACM is unsupported. Setting mimeType to ">
	//  409 1266:aload           9
	//  410 1268:invokevirtual   #335 <Method String String.concat(String)>
	//  411 1271:astore          9
						else
	//* 412 1273:goto            1288
							obj = ((Object) (new String("Non-PCM MS/ACM is unsupported. Setting mimeType to ")));
	//  413 1276:new             #209 <Class String>
	//  414 1279:dup             
	//  415 1280:ldc2            #331 <String "Non-PCM MS/ACM is unsupported. Setting mimeType to ">
	//  416 1283:invokespecial   #336 <Method void String(String)>
	//  417 1286:astore          9
						Log.w("MatroskaExtractor", ((String) (obj)));
	//  418 1288:ldc2            #313 <String "MatroskaExtractor">
	//  419 1291:aload           9
	//  420 1293:invokestatic    #322 <Method int Log.w(String, String)>
	//  421 1296:pop             
						obj1 = "audio/x-unknown";
	//  422 1297:ldc2            #292 <String "audio/x-unknown">
	//  423 1300:astore          10
						obj = null;
	//  424 1302:aconst_null     
	//  425 1303:astore          9
						j1 = -1;
	//  426 1305:iconst_m1       
	//  427 1306:istore          4
						k1 = -1;
	//  428 1308:iconst_m1       
	//  429 1309:istore          5
						break;
	//  430 1311:goto            1858

					case 21: // '\025'
						obj = ((Object) (Collections.singletonList(((Object) (h)))));
	//  431 1314:aload_0         
	//  432 1315:getfield        #275 <Field byte[] h>
	//  433 1318:invokestatic    #153 <Method List Collections.singletonList(Object)>
	//  434 1321:astore          9
						obj1 = "audio/x-flac";
	//  435 1323:ldc2            #338 <String "audio/x-flac">
	//  436 1326:astore          10
						j1 = -1;
	//  437 1328:iconst_m1       
	//  438 1329:istore          4
						k1 = -1;
	//  439 1331:iconst_m1       
	//  440 1332:istore          5
						break;
	//  441 1334:goto            1858

					case 20: // '\024'
						obj1 = "audio/vnd.dts.hd";
	//  442 1337:ldc2            #340 <String "audio/vnd.dts.hd">
	//  443 1340:astore          10
						obj = null;
	//  444 1342:aconst_null     
	//  445 1343:astore          9
						j1 = -1;
	//  446 1345:iconst_m1       
	//  447 1346:istore          4
						k1 = -1;
	//  448 1348:iconst_m1       
	//  449 1349:istore          5
						break;
	//  450 1351:goto            1858

					case 18: // '\022'
					case 19: // '\023'
						obj1 = "audio/vnd.dts";
	//  451 1354:ldc2            #342 <String "audio/vnd.dts">
	//  452 1357:astore          10
						obj = null;
	//  453 1359:aconst_null     
	//  454 1360:astore          9
						j1 = -1;
	//  455 1362:iconst_m1       
	//  456 1363:istore          4
						k1 = -1;
	//  457 1365:iconst_m1       
	//  458 1366:istore          5
						break;
	//  459 1368:goto            1858

					case 17: // '\021'
						obj1 = "audio/true-hd";
	//  460 1371:ldc2            #344 <String "audio/true-hd">
	//  461 1374:astore          10
						obj = null;
	//  462 1376:aconst_null     
	//  463 1377:astore          9
						j1 = -1;
	//  464 1379:iconst_m1       
	//  465 1380:istore          4
						k1 = -1;
	//  466 1382:iconst_m1       
	//  467 1383:istore          5
						break;
	//  468 1385:goto            1858

					case 16: // '\020'
						obj1 = "audio/eac3";
	//  469 1388:ldc2            #346 <String "audio/eac3">
	//  470 1391:astore          10
						obj = null;
	//  471 1393:aconst_null     
	//  472 1394:astore          9
						j1 = -1;
	//  473 1396:iconst_m1       
	//  474 1397:istore          4
						k1 = -1;
	//  475 1399:iconst_m1       
	//  476 1400:istore          5
						break;
	//  477 1402:goto            1858

					case 15: // '\017'
						obj1 = "audio/ac3";
	//  478 1405:ldc2            #348 <String "audio/ac3">
	//  479 1408:astore          10
						obj = null;
	//  480 1410:aconst_null     
	//  481 1411:astore          9
						j1 = -1;
	//  482 1413:iconst_m1       
	//  483 1414:istore          4
						k1 = -1;
	//  484 1416:iconst_m1       
	//  485 1417:istore          5
						break;
	//  486 1419:goto            1858

					case 14: // '\016'
						obj1 = "audio/mpeg";
	//  487 1422:ldc2            #350 <String "audio/mpeg">
	//  488 1425:astore          10
						obj = null;
	//  489 1427:aconst_null     
	//  490 1428:astore          9
						j1 = 4096;
	//  491 1430:sipush          4096
	//  492 1433:istore          4
						k1 = -1;
	//  493 1435:iconst_m1       
	//  494 1436:istore          5
						break;
	//  495 1438:goto            1858

					case 13: // '\r'
						obj1 = "audio/mpeg-L2";
	//  496 1441:ldc2            #352 <String "audio/mpeg-L2">
	//  497 1444:astore          10
						obj = null;
	//  498 1446:aconst_null     
	//  499 1447:astore          9
						j1 = 4096;
	//  500 1449:sipush          4096
	//  501 1452:istore          4
						k1 = -1;
	//  502 1454:iconst_m1       
	//  503 1455:istore          5
						break;
	//  504 1457:goto            1858

					case 12: // '\f'
						obj = ((Object) (Collections.singletonList(((Object) (h)))));
	//  505 1460:aload_0         
	//  506 1461:getfield        #275 <Field byte[] h>
	//  507 1464:invokestatic    #153 <Method List Collections.singletonList(Object)>
	//  508 1467:astore          9
						obj1 = "audio/mp4a-latm";
	//  509 1469:ldc2            #354 <String "audio/mp4a-latm">
	//  510 1472:astore          10
						j1 = -1;
	//  511 1474:iconst_m1       
	//  512 1475:istore          4
						k1 = -1;
	//  513 1477:iconst_m1       
	//  514 1478:istore          5
						break;
	//  515 1480:goto            1858

					case 11: // '\013'
						obj = ((Object) (new ArrayList(3)));
	//  516 1483:new             #171 <Class ArrayList>
	//  517 1486:dup             
	//  518 1487:iconst_3        
	//  519 1488:invokespecial   #173 <Method void ArrayList(int)>
	//  520 1491:astore          9
						((List) (obj)).add(((Object) (h)));
	//  521 1493:aload           9
	//  522 1495:aload_0         
	//  523 1496:getfield        #275 <Field byte[] h>
	//  524 1499:invokeinterface #179 <Method boolean List.add(Object)>
	//  525 1504:pop             
						((List) (obj)).add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(J).array())));
	//  526 1505:aload           9
	//  527 1507:bipush          8
	//  528 1509:invokestatic    #360 <Method ByteBuffer ByteBuffer.allocate(int)>
	//  529 1512:invokestatic    #366 <Method ByteOrder ByteOrder.nativeOrder()>
	//  530 1515:invokevirtual   #370 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//  531 1518:aload_0         
	//  532 1519:getfield        #111 <Field long J>
	//  533 1522:invokevirtual   #374 <Method ByteBuffer ByteBuffer.putLong(long)>
	//  534 1525:invokevirtual   #378 <Method byte[] ByteBuffer.array()>
	//  535 1528:invokeinterface #179 <Method boolean List.add(Object)>
	//  536 1533:pop             
						((List) (obj)).add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(K).array())));
	//  537 1534:aload           9
	//  538 1536:bipush          8
	//  539 1538:invokestatic    #360 <Method ByteBuffer ByteBuffer.allocate(int)>
	//  540 1541:invokestatic    #366 <Method ByteOrder ByteOrder.nativeOrder()>
	//  541 1544:invokevirtual   #370 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//  542 1547:aload_0         
	//  543 1548:getfield        #113 <Field long K>
	//  544 1551:invokevirtual   #374 <Method ByteBuffer ByteBuffer.putLong(long)>
	//  545 1554:invokevirtual   #378 <Method byte[] ByteBuffer.array()>
	//  546 1557:invokeinterface #179 <Method boolean List.add(Object)>
	//  547 1562:pop             
						obj1 = "audio/opus";
	//  548 1563:ldc2            #380 <String "audio/opus">
	//  549 1566:astore          10
						j1 = 5760;
	//  550 1568:sipush          5760
	//  551 1571:istore          4
						k1 = -1;
	//  552 1573:iconst_m1       
	//  553 1574:istore          5
						break;
	//  554 1576:goto            1858

					case 10: // '\n'
						obj = ((Object) (a(h)));
	//  555 1579:aload_0         
	//  556 1580:getfield        #275 <Field byte[] h>
	//  557 1583:invokestatic    #382 <Method List a(byte[])>
	//  558 1586:astore          9
						obj1 = "audio/vorbis";
	//  559 1588:ldc2            #384 <String "audio/vorbis">
	//  560 1591:astore          10
						j1 = 8192;
	//  561 1593:sipush          8192
	//  562 1596:istore          4
						k1 = -1;
	//  563 1598:iconst_m1       
	//  564 1599:istore          5
						break;
	//  565 1601:goto            1858

					case 9: // '\t'
						obj1 = "video/x-unknown";
	//  566 1604:ldc2            #386 <String "video/x-unknown">
	//  567 1607:astore          10
						obj = null;
	//  568 1609:aconst_null     
	//  569 1610:astore          9
						j1 = -1;
	//  570 1612:iconst_m1       
	//  571 1613:istore          4
						k1 = -1;
	//  572 1615:iconst_m1       
	//  573 1616:istore          5
						break;
	//  574 1618:goto            1858

					case 8: // '\b'
						obj = ((Object) (a(new bno(h))));
	//  575 1621:new             #128 <Class bno>
	//  576 1624:dup             
	//  577 1625:aload_0         
	//  578 1626:getfield        #275 <Field byte[] h>
	//  579 1629:invokespecial   #327 <Method void bno(byte[])>
	//  580 1632:invokestatic    #388 <Method List a(bno)>
	//  581 1635:astore          9
						if(obj != null)
	//* 582 1637:aload           9
	//* 583 1639:ifnull          1656
						{
							obj1 = "video/wvc1";
	//  584 1642:ldc2            #390 <String "video/wvc1">
	//  585 1645:astore          10
							j1 = -1;
	//  586 1647:iconst_m1       
	//  587 1648:istore          4
							k1 = -1;
	//  588 1650:iconst_m1       
	//  589 1651:istore          5
						} else
	//* 590 1653:goto            1858
						{
							Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
	//  591 1656:ldc2            #313 <String "MatroskaExtractor">
	//  592 1659:ldc2            #392 <String "Unsupported FourCC. Setting mimeType to video/x-unknown">
	//  593 1662:invokestatic    #322 <Method int Log.w(String, String)>
	//  594 1665:pop             
							obj1 = "video/x-unknown";
	//  595 1666:ldc2            #386 <String "video/x-unknown">
	//  596 1669:astore          10
							j1 = -1;
	//  597 1671:iconst_m1       
	//  598 1672:istore          4
							k1 = -1;
	//  599 1674:iconst_m1       
	//  600 1675:istore          5
						}
						break;
	//  601 1677:goto            1858

					case 7: // '\007'
						obj1 = ((Object) (bod.a(new bno(h))));
	//  602 1680:new             #128 <Class bno>
	//  603 1683:dup             
	//  604 1684:aload_0         
	//  605 1685:getfield        #275 <Field byte[] h>
	//  606 1688:invokespecial   #327 <Method void bno(byte[])>
	//  607 1691:invokestatic    #397 <Method bod bod.a(bno)>
	//  608 1694:astore          10
						obj = ((Object) (((bod) (obj1)).a));
	//  609 1696:aload           10
	//  610 1698:getfield        #400 <Field List bod.a>
	//  611 1701:astore          9
						O = ((bod) (obj1)).b;
	//  612 1703:aload_0         
	//  613 1704:aload           10
	//  614 1706:getfield        #402 <Field int bod.b>
	//  615 1709:putfield        #404 <Field int O>
						obj1 = "video/hevc";
	//  616 1712:ldc2            #406 <String "video/hevc">
	//  617 1715:astore          10
						j1 = -1;
	//  618 1717:iconst_m1       
	//  619 1718:istore          4
						k1 = -1;
	//  620 1720:iconst_m1       
	//  621 1721:istore          5
						break;
	//  622 1723:goto            1858

					case 6: // '\006'
						obj1 = ((Object) (bnz.a(new bno(h))));
	//  623 1726:new             #128 <Class bno>
	//  624 1729:dup             
	//  625 1730:aload_0         
	//  626 1731:getfield        #275 <Field byte[] h>
	//  627 1734:invokespecial   #327 <Method void bno(byte[])>
	//  628 1737:invokestatic    #411 <Method bnz bnz.a(bno)>
	//  629 1740:astore          10
						obj = ((Object) (((bnz) (obj1)).a));
	//  630 1742:aload           10
	//  631 1744:getfield        #412 <Field List bnz.a>
	//  632 1747:astore          9
						O = ((bnz) (obj1)).b;
	//  633 1749:aload_0         
	//  634 1750:aload           10
	//  635 1752:getfield        #413 <Field int bnz.b>
	//  636 1755:putfield        #404 <Field int O>
						obj1 = "video/avc";
	//  637 1758:ldc2            #415 <String "video/avc">
	//  638 1761:astore          10
						j1 = -1;
	//  639 1763:iconst_m1       
	//  640 1764:istore          4
						k1 = -1;
	//  641 1766:iconst_m1       
	//  642 1767:istore          5
						break;
	//  643 1769:goto            1858

					case 3: // '\003'
					case 4: // '\004'
					case 5: // '\005'
						obj = ((Object) (h));
	//  644 1772:aload_0         
	//  645 1773:getfield        #275 <Field byte[] h>
	//  646 1776:astore          9
						if(obj == null)
	//* 647 1778:aload           9
	//* 648 1780:ifnonnull       1789
							obj = null;
	//  649 1783:aconst_null     
	//  650 1784:astore          9
						else
	//* 651 1786:goto            1796
							obj = ((Object) (Collections.singletonList(obj)));
	//  652 1789:aload           9
	//  653 1791:invokestatic    #153 <Method List Collections.singletonList(Object)>
	//  654 1794:astore          9
						obj1 = "video/mp4v-es";
	//  655 1796:ldc2            #417 <String "video/mp4v-es">
	//  656 1799:astore          10
						j1 = -1;
	//  657 1801:iconst_m1       
	//  658 1802:istore          4
						k1 = -1;
	//  659 1804:iconst_m1       
	//  660 1805:istore          5
						break;

	//* 661 1807:goto            1858
					case 2: // '\002'
						obj1 = "video/mpeg2";
	//  662 1810:ldc2            #419 <String "video/mpeg2">
	//  663 1813:astore          10
						obj = null;
	//  664 1815:aconst_null     
	//  665 1816:astore          9
						j1 = -1;
	//  666 1818:iconst_m1       
	//  667 1819:istore          4
						k1 = -1;
	//  668 1821:iconst_m1       
	//  669 1822:istore          5
						break;

	//* 670 1824:goto            1858
					case 1: // '\001'
						obj1 = "video/x-vnd.on2.vp9";
	//  671 1827:ldc2            #421 <String "video/x-vnd.on2.vp9">
	//  672 1830:astore          10
						obj = null;
	//  673 1832:aconst_null     
	//  674 1833:astore          9
						j1 = -1;
	//  675 1835:iconst_m1       
	//  676 1836:istore          4
						k1 = -1;
	//  677 1838:iconst_m1       
	//  678 1839:istore          5
						break;

	//* 679 1841:goto            1858
					case 0: // '\0'
						obj1 = "video/x-vnd.on2.vp8";
	//  680 1844:ldc2            #423 <String "video/x-vnd.on2.vp8">
	//  681 1847:astore          10
						obj = null;
	//  682 1849:aconst_null     
	//  683 1850:astore          9
						j1 = -1;
	//  684 1852:iconst_m1       
	//  685 1853:istore          4
						k1 = -1;
	//  686 1855:iconst_m1       
	//  687 1856:istore          5
						break;
					}
					boolean flag = M;
	//  688 1858:aload_0         
	//  689 1859:getfield        #115 <Field boolean M>
	//  690 1862:istore          8
					if(L)
	//* 691 1864:aload_0         
	//* 692 1865:getfield        #425 <Field boolean L>
	//* 693 1868:ifeq            1877
						l1 = 2;
	//  694 1871:iconst_2        
	//  695 1872:istore          6
					else
	//* 696 1874:goto            1880
						l1 = 0;
	//  697 1877:iconst_0        
	//  698 1878:istore          6
					l1 = flag | false | l1;
	//  699 1880:iload           8
	//  700 1882:iconst_0        
	//  701 1883:ior             
	//  702 1884:iload           6
	//  703 1886:ior             
	//  704 1887:istore          6
					if(bnk.a(((String) (obj1))))
	//* 705 1889:aload           10
	//* 706 1891:invokestatic    #430 <Method boolean bnk.a(String)>
	//* 707 1894:ifeq            1939
					{
						obj = ((Object) (zzfs.a(Integer.toString(i1), ((String) (obj1)), ((String) (null)), -1, j1, G, I, k1, ((List) (obj)), i, l1, P)));
	//  708 1897:iload_2         
	//  709 1898:invokestatic    #435 <Method String Integer.toString(int)>
	//  710 1901:aload           10
	//  711 1903:aconst_null     
	//  712 1904:iconst_m1       
	//  713 1905:iload           4
	//  714 1907:aload_0         
	//  715 1908:getfield        #105 <Field int G>
	//  716 1911:aload_0         
	//  717 1912:getfield        #109 <Field int I>
	//  718 1915:iload           5
	//  719 1917:aload           9
	//  720 1919:aload_0         
	//  721 1920:getfield        #437 <Field zzhp i>
	//  722 1923:iload           6
	//  723 1925:aload_0         
	//  724 1926:getfield        #119 <Field String P>
	//  725 1929:invokestatic    #442 <Method zzfs zzfs.a(String, String, String, int, int, int, int, int, List, zzhp, int, String)>
	//  726 1932:astore          9
						i1 = 1;
	//  727 1934:iconst_1        
	//  728 1935:istore_2        
						break label0;
	//  729 1936:goto            2632
					}
					if(!bnk.b(((String) (obj1))))
						break label1;
	//  730 1939:aload           10
	//  731 1941:invokestatic    #444 <Method boolean bnk.b(String)>
	//  732 1944:ifeq            2519
					if(n == 0)
	//* 733 1947:aload_0         
	//* 734 1948:getfield        #66  <Field int n>
	//* 735 1951:ifne            2010
					{
						l1 = l;
	//  736 1954:aload_0         
	//  737 1955:getfield        #62  <Field int l>
	//  738 1958:istore          6
						k1 = l1;
	//  739 1960:iload           6
	//  740 1962:istore          5
						if(l1 == -1)
	//* 741 1964:iload           6
	//* 742 1966:iconst_m1       
	//* 743 1967:icmpne          1976
							k1 = j;
	//  744 1970:aload_0         
	//  745 1971:getfield        #58  <Field int j>
	//  746 1974:istore          5
						l = k1;
	//  747 1976:aload_0         
	//  748 1977:iload           5
	//  749 1979:putfield        #62  <Field int l>
						l1 = m;
	//  750 1982:aload_0         
	//  751 1983:getfield        #64  <Field int m>
	//  752 1986:istore          6
						k1 = l1;
	//  753 1988:iload           6
	//  754 1990:istore          5
						if(l1 == -1)
	//* 755 1992:iload           6
	//* 756 1994:iconst_m1       
	//* 757 1995:icmpne          2004
							k1 = k;
	//  758 1998:aload_0         
	//  759 1999:getfield        #60  <Field int k>
	//  760 2002:istore          5
						m = k1;
	//  761 2004:aload_0         
	//  762 2005:iload           5
	//  763 2007:putfield        #64  <Field int m>
					}
					k1 = l;
	//  764 2010:aload_0         
	//  765 2011:getfield        #62  <Field int l>
	//  766 2014:istore          5
					if(k1 != -1)
	//* 767 2016:iload           5
	//* 768 2018:iconst_m1       
	//* 769 2019:icmpeq          2055
					{
						l1 = m;
	//  770 2022:aload_0         
	//  771 2023:getfield        #64  <Field int m>
	//  772 2026:istore          6
						if(l1 != -1)
	//* 773 2028:iload           6
	//* 774 2030:iconst_m1       
	//* 775 2031:icmpeq          2055
						{
							f1 = (float)(k * k1) / (float)(j * l1);
	//  776 2034:aload_0         
	//  777 2035:getfield        #60  <Field int k>
	//  778 2038:iload           5
	//  779 2040:imul            
	//  780 2041:i2f             
	//  781 2042:aload_0         
	//  782 2043:getfield        #58  <Field int j>
	//  783 2046:iload           6
	//  784 2048:imul            
	//  785 2049:i2f             
	//  786 2050:fdiv            
	//  787 2051:fstore_3        
							break label2;
	//  788 2052:goto            2058
						}
					}
					f1 = -1F;
	//  789 2055:ldc1            #83  <Float -1F>
	//  790 2057:fstore_3        
				}
				zzqi zzqi1;
				if(q)
	//* 791 2058:aload_0         
	//* 792 2059:getfield        #72  <Field boolean q>
	//* 793 2062:ifeq            2468
				{
					byte abyte1[] = ((byte []) (obj2));
	//  794 2065:aload           12
	//  795 2067:astore          11
					if(w != -1F)
	//* 796 2069:aload_0         
	//* 797 2070:getfield        #85  <Field float w>
	//* 798 2073:ldc1            #83  <Float -1F>
	//* 799 2075:fcmpl           
	//* 800 2076:ifeq            2442
					{
						abyte1 = ((byte []) (obj2));
	//  801 2079:aload           12
	//  802 2081:astore          11
						if(x != -1F)
	//* 803 2083:aload_0         
	//* 804 2084:getfield        #87  <Field float x>
	//* 805 2087:ldc1            #83  <Float -1F>
	//* 806 2089:fcmpl           
	//* 807 2090:ifeq            2442
						{
							abyte1 = ((byte []) (obj2));
	//  808 2093:aload           12
	//  809 2095:astore          11
							if(y != -1F)
	//* 810 2097:aload_0         
	//* 811 2098:getfield        #89  <Field float y>
	//* 812 2101:ldc1            #83  <Float -1F>
	//* 813 2103:fcmpl           
	//* 814 2104:ifeq            2442
							{
								abyte1 = ((byte []) (obj2));
	//  815 2107:aload           12
	//  816 2109:astore          11
								if(z != -1F)
	//* 817 2111:aload_0         
	//* 818 2112:getfield        #91  <Field float z>
	//* 819 2115:ldc1            #83  <Float -1F>
	//* 820 2117:fcmpl           
	//* 821 2118:ifeq            2442
								{
									abyte1 = ((byte []) (obj2));
	//  822 2121:aload           12
	//  823 2123:astore          11
									if(A != -1F)
	//* 824 2125:aload_0         
	//* 825 2126:getfield        #93  <Field float A>
	//* 826 2129:ldc1            #83  <Float -1F>
	//* 827 2131:fcmpl           
	//* 828 2132:ifeq            2442
									{
										abyte1 = ((byte []) (obj2));
	//  829 2135:aload           12
	//  830 2137:astore          11
										if(B != -1F)
	//* 831 2139:aload_0         
	//* 832 2140:getfield        #95  <Field float B>
	//* 833 2143:ldc1            #83  <Float -1F>
	//* 834 2145:fcmpl           
	//* 835 2146:ifeq            2442
										{
											abyte1 = ((byte []) (obj2));
	//  836 2149:aload           12
	//  837 2151:astore          11
											if(C != -1F)
	//* 838 2153:aload_0         
	//* 839 2154:getfield        #97  <Field float C>
	//* 840 2157:ldc1            #83  <Float -1F>
	//* 841 2159:fcmpl           
	//* 842 2160:ifeq            2442
											{
												abyte1 = ((byte []) (obj2));
	//  843 2163:aload           12
	//  844 2165:astore          11
												if(D != -1F)
	//* 845 2167:aload_0         
	//* 846 2168:getfield        #99  <Field float D>
	//* 847 2171:ldc1            #83  <Float -1F>
	//* 848 2173:fcmpl           
	//* 849 2174:ifeq            2442
												{
													abyte1 = ((byte []) (obj2));
	//  850 2177:aload           12
	//  851 2179:astore          11
													if(E != -1F)
	//* 852 2181:aload_0         
	//* 853 2182:getfield        #101 <Field float E>
	//* 854 2185:ldc1            #83  <Float -1F>
	//* 855 2187:fcmpl           
	//* 856 2188:ifeq            2442
														if(F == -1F)
	//* 857 2191:aload_0         
	//* 858 2192:getfield        #103 <Field float F>
	//* 859 2195:ldc1            #83  <Float -1F>
	//* 860 2197:fcmpl           
	//* 861 2198:ifne            2208
														{
															abyte1 = ((byte []) (obj2));
	//  862 2201:aload           12
	//  863 2203:astore          11
														} else
	//* 864 2205:goto            2442
														{
															abyte1 = new byte[25];
	//  865 2208:bipush          25
	//  866 2210:newarray        byte[]
	//  867 2212:astore          11
															ByteBuffer bytebuffer = ByteBuffer.wrap(abyte1);
	//  868 2214:aload           11
	//  869 2216:invokestatic    #448 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//  870 2219:astore          12
															bytebuffer.put((byte)0);
	//  871 2221:aload           12
	//  872 2223:iconst_0        
	//  873 2224:invokevirtual   #452 <Method ByteBuffer ByteBuffer.put(byte)>
	//  874 2227:pop             
															bytebuffer.putShort((short)(int)(w * 50000F + 0.5F));
	//  875 2228:aload           12
	//  876 2230:aload_0         
	//  877 2231:getfield        #85  <Field float w>
	//  878 2234:ldc2            #453 <Float 50000F>
	//  879 2237:fmul            
	//  880 2238:ldc2            #454 <Float 0.5F>
	//  881 2241:fadd            
	//  882 2242:f2i             
	//  883 2243:int2short       
	//  884 2244:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  885 2247:pop             
															bytebuffer.putShort((short)(int)(x * 50000F + 0.5F));
	//  886 2248:aload           12
	//  887 2250:aload_0         
	//  888 2251:getfield        #87  <Field float x>
	//  889 2254:ldc2            #453 <Float 50000F>
	//  890 2257:fmul            
	//  891 2258:ldc2            #454 <Float 0.5F>
	//  892 2261:fadd            
	//  893 2262:f2i             
	//  894 2263:int2short       
	//  895 2264:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  896 2267:pop             
															bytebuffer.putShort((short)(int)(y * 50000F + 0.5F));
	//  897 2268:aload           12
	//  898 2270:aload_0         
	//  899 2271:getfield        #89  <Field float y>
	//  900 2274:ldc2            #453 <Float 50000F>
	//  901 2277:fmul            
	//  902 2278:ldc2            #454 <Float 0.5F>
	//  903 2281:fadd            
	//  904 2282:f2i             
	//  905 2283:int2short       
	//  906 2284:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  907 2287:pop             
															bytebuffer.putShort((short)(int)(z * 50000F + 0.5F));
	//  908 2288:aload           12
	//  909 2290:aload_0         
	//  910 2291:getfield        #91  <Field float z>
	//  911 2294:ldc2            #453 <Float 50000F>
	//  912 2297:fmul            
	//  913 2298:ldc2            #454 <Float 0.5F>
	//  914 2301:fadd            
	//  915 2302:f2i             
	//  916 2303:int2short       
	//  917 2304:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  918 2307:pop             
															bytebuffer.putShort((short)(int)(A * 50000F + 0.5F));
	//  919 2308:aload           12
	//  920 2310:aload_0         
	//  921 2311:getfield        #93  <Field float A>
	//  922 2314:ldc2            #453 <Float 50000F>
	//  923 2317:fmul            
	//  924 2318:ldc2            #454 <Float 0.5F>
	//  925 2321:fadd            
	//  926 2322:f2i             
	//  927 2323:int2short       
	//  928 2324:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  929 2327:pop             
															bytebuffer.putShort((short)(int)(B * 50000F + 0.5F));
	//  930 2328:aload           12
	//  931 2330:aload_0         
	//  932 2331:getfield        #95  <Field float B>
	//  933 2334:ldc2            #453 <Float 50000F>
	//  934 2337:fmul            
	//  935 2338:ldc2            #454 <Float 0.5F>
	//  936 2341:fadd            
	//  937 2342:f2i             
	//  938 2343:int2short       
	//  939 2344:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  940 2347:pop             
															bytebuffer.putShort((short)(int)(C * 50000F + 0.5F));
	//  941 2348:aload           12
	//  942 2350:aload_0         
	//  943 2351:getfield        #97  <Field float C>
	//  944 2354:ldc2            #453 <Float 50000F>
	//  945 2357:fmul            
	//  946 2358:ldc2            #454 <Float 0.5F>
	//  947 2361:fadd            
	//  948 2362:f2i             
	//  949 2363:int2short       
	//  950 2364:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  951 2367:pop             
															bytebuffer.putShort((short)(int)(D * 50000F + 0.5F));
	//  952 2368:aload           12
	//  953 2370:aload_0         
	//  954 2371:getfield        #99  <Field float D>
	//  955 2374:ldc2            #453 <Float 50000F>
	//  956 2377:fmul            
	//  957 2378:ldc2            #454 <Float 0.5F>
	//  958 2381:fadd            
	//  959 2382:f2i             
	//  960 2383:int2short       
	//  961 2384:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  962 2387:pop             
															bytebuffer.putShort((short)(int)(E + 0.5F));
	//  963 2388:aload           12
	//  964 2390:aload_0         
	//  965 2391:getfield        #101 <Field float E>
	//  966 2394:ldc2            #454 <Float 0.5F>
	//  967 2397:fadd            
	//  968 2398:f2i             
	//  969 2399:int2short       
	//  970 2400:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  971 2403:pop             
															bytebuffer.putShort((short)(int)(F + 0.5F));
	//  972 2404:aload           12
	//  973 2406:aload_0         
	//  974 2407:getfield        #103 <Field float F>
	//  975 2410:ldc2            #454 <Float 0.5F>
	//  976 2413:fadd            
	//  977 2414:f2i             
	//  978 2415:int2short       
	//  979 2416:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  980 2419:pop             
															bytebuffer.putShort((short)u);
	//  981 2420:aload           12
	//  982 2422:aload_0         
	//  983 2423:getfield        #80  <Field int u>
	//  984 2426:int2short       
	//  985 2427:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  986 2430:pop             
															bytebuffer.putShort((short)v);
	//  987 2431:aload           12
	//  988 2433:aload_0         
	//  989 2434:getfield        #82  <Field int v>
	//  990 2437:int2short       
	//  991 2438:invokevirtual   #458 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  992 2441:pop             
														}
												}
											}
										}
									}
								}
							}
						}
					}
					zzqi1 = new zzqi(r, t, s, abyte1);
	//  993 2442:new             #460 <Class zzqi>
	//  994 2445:dup             
	//  995 2446:aload_0         
	//  996 2447:getfield        #74  <Field int r>
	//  997 2450:aload_0         
	//  998 2451:getfield        #78  <Field int t>
	//  999 2454:aload_0         
	// 1000 2455:getfield        #76  <Field int s>
	// 1001 2458:aload           11
	// 1002 2460:invokespecial   #463 <Method void zzqi(int, int, int, byte[])>
	// 1003 2463:astore          11
				} else
	//*1004 2465:goto            2471
				{
					zzqi1 = null;
	// 1005 2468:aconst_null     
	// 1006 2469:astore          11
				}
				obj = ((Object) (zzfs.a(Integer.toString(i1), ((String) (obj1)), ((String) (null)), -1, j1, j, k, -1F, ((List) (obj)), -1, f1, o, p, zzqi1, i)));
	// 1007 2471:iload_2         
	// 1008 2472:invokestatic    #435 <Method String Integer.toString(int)>
	// 1009 2475:aload           10
	// 1010 2477:aconst_null     
	// 1011 2478:iconst_m1       
	// 1012 2479:iload           4
	// 1013 2481:aload_0         
	// 1014 2482:getfield        #58  <Field int j>
	// 1015 2485:aload_0         
	// 1016 2486:getfield        #60  <Field int k>
	// 1017 2489:ldc1            #83  <Float -1F>
	// 1018 2491:aload           9
	// 1019 2493:iconst_m1       
	// 1020 2494:fload_3         
	// 1021 2495:aload_0         
	// 1022 2496:getfield        #68  <Field byte[] o>
	// 1023 2499:aload_0         
	// 1024 2500:getfield        #70  <Field int p>
	// 1025 2503:aload           11
	// 1026 2505:aload_0         
	// 1027 2506:getfield        #437 <Field zzhp i>
	// 1028 2509:invokestatic    #466 <Method zzfs zzfs.a(String, String, String, int, int, int, int, float, List, int, float, byte[], int, zzqi, zzhp)>
	// 1029 2512:astore          9
				i1 = 2;
	// 1030 2514:iconst_2        
	// 1031 2515:istore_2        
				break label0;
	// 1032 2516:goto            2632
			}
			if("application/x-subrip".equals(obj1))
	//*1033 2519:ldc2            #283 <String "application/x-subrip">
	//*1034 2522:aload           10
	//*1035 2524:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*1036 2527:ifeq            2559
			{
				obj = ((Object) (zzfs.a(Integer.toString(i1), ((String) (obj1)), ((String) (null)), -1, l1, P, i)));
	// 1037 2530:iload_2         
	// 1038 2531:invokestatic    #435 <Method String Integer.toString(int)>
	// 1039 2534:aload           10
	// 1040 2536:aconst_null     
	// 1041 2537:iconst_m1       
	// 1042 2538:iload           6
	// 1043 2540:aload_0         
	// 1044 2541:getfield        #119 <Field String P>
	// 1045 2544:aload_0         
	// 1046 2545:getfield        #437 <Field zzhp i>
	// 1047 2548:invokestatic    #469 <Method zzfs zzfs.a(String, String, String, int, int, String, zzhp)>
	// 1048 2551:astore          9
				i1 = ((int) (byte0));
	// 1049 2553:iload           7
	// 1050 2555:istore_2        
			} else
	//*1051 2556:goto            2632
			{
				if(!"application/vobsub".equals(obj1) && !"application/pgs".equals(obj1) && !"application/dvbsubs".equals(obj1))
	//*1052 2559:ldc2            #281 <String "application/vobsub">
	//*1053 2562:aload           10
	//*1054 2564:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*1055 2567:ifne            2606
	//*1056 2570:ldc2            #279 <String "application/pgs">
	//*1057 2573:aload           10
	//*1058 2575:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*1059 2578:ifne            2606
	//*1060 2581:ldc2            #277 <String "application/dvbsubs">
	//*1061 2584:aload           10
	//*1062 2586:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*1063 2589:ifeq            2595
	//*1064 2592:goto            2606
					throw new bdj("Unexpected MIME type.");
	// 1065 2595:new             #155 <Class bdj>
	// 1066 2598:dup             
	// 1067 2599:ldc2            #471 <String "Unexpected MIME type.">
	// 1068 2602:invokespecial   #160 <Method void bdj(String)>
	// 1069 2605:athrow          
				obj = ((Object) (zzfs.a(Integer.toString(i1), ((String) (obj1)), ((String) (null)), -1, ((List) (obj)), P, i)));
	// 1070 2606:iload_2         
	// 1071 2607:invokestatic    #435 <Method String Integer.toString(int)>
	// 1072 2610:aload           10
	// 1073 2612:aconst_null     
	// 1074 2613:iconst_m1       
	// 1075 2614:aload           9
	// 1076 2616:aload_0         
	// 1077 2617:getfield        #119 <Field String P>
	// 1078 2620:aload_0         
	// 1079 2621:getfield        #437 <Field zzhp i>
	// 1080 2624:invokestatic    #474 <Method zzfs zzfs.a(String, String, String, int, List, String, zzhp)>
	// 1081 2627:astore          9
				i1 = ((int) (byte0));
	// 1082 2629:iload           7
	// 1083 2631:istore_2        
			}
		}
		N = bfp1.a(b, i1);
	// 1084 2632:aload_0         
	// 1085 2633:aload_1         
	// 1086 2634:aload_0         
	// 1087 2635:getfield        #475 <Field int b>
	// 1088 2638:iload_2         
	// 1089 2639:invokeinterface #480 <Method bfw bfp.a(int, int)>
	// 1090 2644:putfield        #482 <Field bfw N>
		N.a(((zzfs) (obj)));
	// 1091 2647:aload_0         
	// 1092 2648:getfield        #482 <Field bfw N>
	// 1093 2651:aload           9
	// 1094 2653:invokeinterface #487 <Method void bfw.a(zzfs)>
	// 1095 2658:return          
	}

	public float A;
	public float B;
	public float C;
	public float D;
	public float E;
	public float F;
	public int G;
	public int H;
	public int I;
	public long J;
	public long K;
	public boolean L;
	public boolean M;
	public bfw N;
	public int O;
	private String P;
	public String a;
	public int b;
	public int c;
	public int d;
	public boolean e;
	public byte f[];
	public bfx g;
	public byte h[];
	public zzhp i;
	public int j;
	public int k;
	public int l;
	public int m;
	public int n;
	public byte o[];
	public int p;
	public boolean q;
	public int r;
	public int s;
	public int t;
	public int u;
	public int v;
	public float w;
	public float x;
	public float y;
	public float z;
}
