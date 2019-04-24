// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;
import java.util.ArrayList;

// Referenced classes of package o:
//			ip

final class ik
	implements Serializable
{

	ik()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		c = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #17  <Field byte c>
		b = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field byte b>
		e = new ArrayList();
	//    8   14:aload_0         
	//    9   15:new             #21  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #22  <Method void ArrayList()>
	//   12   22:putfield        #24  <Field ArrayList e>
	//   13   25:return          
	}

	protected final Boolean c(DataOutputStream dataoutputstream)
	{
		int i;
		int j;
		ip ip1;
		byte abyte0[];
		byte abyte1[];
		try
		{
			dataoutputstream.writeByte(((int) (c)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field byte c>
	//    3    5:invokevirtual   #34  <Method void DataOutputStream.writeByte(int)>
			dataoutputstream.writeByte(((int) (b)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field byte b>
	//    7   13:invokevirtual   #34  <Method void DataOutputStream.writeByte(int)>
		}
	//*   8   16:iconst_0        
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:aload_0         
	//*  12   20:getfield        #24  <Field ArrayList e>
	//*  13   23:invokevirtual   #38  <Method int ArrayList.size()>
	//*  14   26:icmpge          245
	//*  15   29:aload_0         
	//*  16   30:getfield        #24  <Field ArrayList e>
	//*  17   33:iload_2         
	//*  18   34:invokevirtual   #42  <Method Object ArrayList.get(int)>
	//*  19   37:checkcast       #44  <Class ip>
	//*  20   40:astore          4
	//*  21   42:aload_1         
	//*  22   43:aload           4
	//*  23   45:getfield        #47  <Field byte ip.a>
	//*  24   48:invokevirtual   #34  <Method void DataOutputStream.writeByte(int)>
	//*  25   51:aload           4
	//*  26   53:getfield        #47  <Field byte ip.a>
	//*  27   56:newarray        byte[]
	//*  28   58:astore          5
	//*  29   60:aload           4
	//*  30   62:getfield        #50  <Field byte[] ip.b>
	//*  31   65:astore          6
	//*  32   67:aload           4
	//*  33   69:getfield        #47  <Field byte ip.a>
	//*  34   72:aload           4
	//*  35   74:getfield        #50  <Field byte[] ip.b>
	//*  36   77:arraylength     
	//*  37   78:icmpge          90
	//*  38   81:aload           4
	//*  39   83:getfield        #47  <Field byte ip.a>
	//*  40   86:istore_3        
	//*  41   87:goto            97
	//*  42   90:aload           4
	//*  43   92:getfield        #50  <Field byte[] ip.b>
	//*  44   95:arraylength     
	//*  45   96:istore_3        
	//*  46   97:aload           6
	//*  47   99:iconst_0        
	//*  48  100:aload           5
	//*  49  102:iconst_0        
	//*  50  103:iload_3         
	//*  51  104:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  52  107:aload_1         
	//*  53  108:aload           5
	//*  54  110:invokevirtual   #60  <Method void DataOutputStream.write(byte[])>
	//*  55  113:aload_1         
	//*  56  114:aload           4
	//*  57  116:getfield        #63  <Field double ip.c>
	//*  58  119:invokevirtual   #67  <Method void DataOutputStream.writeDouble(double)>
	//*  59  122:aload_1         
	//*  60  123:aload           4
	//*  61  125:getfield        #71  <Field int ip.d>
	//*  62  128:invokevirtual   #74  <Method void DataOutputStream.writeInt(int)>
	//*  63  131:aload_1         
	//*  64  132:aload           4
	//*  65  134:getfield        #76  <Field int ip.e>
	//*  66  137:invokevirtual   #74  <Method void DataOutputStream.writeInt(int)>
	//*  67  140:aload_1         
	//*  68  141:aload           4
	//*  69  143:getfield        #79  <Field double ip.f>
	//*  70  146:invokevirtual   #67  <Method void DataOutputStream.writeDouble(double)>
	//*  71  149:aload_1         
	//*  72  150:aload           4
	//*  73  152:getfield        #82  <Field byte ip.h>
	//*  74  155:invokevirtual   #34  <Method void DataOutputStream.writeByte(int)>
	//*  75  158:aload_1         
	//*  76  159:aload           4
	//*  77  161:getfield        #85  <Field byte ip.g>
	//*  78  164:invokevirtual   #34  <Method void DataOutputStream.writeByte(int)>
	//*  79  167:aload           4
	//*  80  169:getfield        #85  <Field byte ip.g>
	//*  81  172:newarray        byte[]
	//*  82  174:astore          5
	//*  83  176:aload           4
	//*  84  178:getfield        #88  <Field byte[] ip.k>
	//*  85  181:astore          6
	//*  86  183:aload           4
	//*  87  185:getfield        #85  <Field byte ip.g>
	//*  88  188:aload           4
	//*  89  190:getfield        #88  <Field byte[] ip.k>
	//*  90  193:arraylength     
	//*  91  194:icmpge          206
	//*  92  197:aload           4
	//*  93  199:getfield        #85  <Field byte ip.g>
	//*  94  202:istore_3        
	//*  95  203:goto            213
	//*  96  206:aload           4
	//*  97  208:getfield        #88  <Field byte[] ip.k>
	//*  98  211:arraylength     
	//*  99  212:istore_3        
	//* 100  213:aload           6
	//* 101  215:iconst_0        
	//* 102  216:aload           5
	//* 103  218:iconst_0        
	//* 104  219:iload_3         
	//* 105  220:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 106  223:aload_1         
	//* 107  224:aload           5
	//* 108  226:invokevirtual   #60  <Method void DataOutputStream.write(byte[])>
	//* 109  229:aload_1         
	//* 110  230:aload           4
	//* 111  232:getfield        #91  <Field byte ip.i>
	//* 112  235:invokevirtual   #34  <Method void DataOutputStream.writeByte(int)>
	//* 113  238:iload_2         
	//* 114  239:iconst_1        
	//* 115  240:iadd            
	//* 116  241:istore_2        
	//* 117  242:goto            18
	//* 118  245:iconst_1        
	//* 119  246:invokestatic    #97  <Method Boolean Boolean.valueOf(boolean)>
	//* 120  249:areturn         
		// Misplaced declaration of an exception variable
		catch(DataOutputStream dataoutputstream)
	//* 121  250:astore_1        
		{
			return Boolean.valueOf(false);
	//  122  251:iconst_0        
	//  123  252:invokestatic    #97  <Method Boolean Boolean.valueOf(boolean)>
	//  124  255:areturn         
		}
		i = 0;
		if(i >= e.size())
			break; /* Loop/switch isn't completed */
		ip1 = (ip)e.get(i);
		dataoutputstream.writeByte(((int) (ip1.a)));
		abyte0 = new byte[ip1.a];
		abyte1 = ip1.b;
		if(ip1.a < ip1.b.length)
		{
			j = ((int) (ip1.a));
			break MISSING_BLOCK_LABEL_97;
		}
		j = ip1.b.length;
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), 0, j);
		dataoutputstream.write(abyte0);
		dataoutputstream.writeDouble(ip1.c);
		dataoutputstream.writeInt(ip1.d);
		dataoutputstream.writeInt(ip1.e);
		dataoutputstream.writeDouble(ip1.f);
		dataoutputstream.writeByte(((int) (ip1.h)));
		dataoutputstream.writeByte(((int) (ip1.g)));
		abyte0 = new byte[ip1.g];
		abyte1 = ip1.k;
		if(ip1.g < ip1.k.length)
		{
			j = ((int) (ip1.g));
			break MISSING_BLOCK_LABEL_213;
		}
		j = ip1.k.length;
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), 0, j);
		dataoutputstream.write(abyte0);
		dataoutputstream.writeByte(((int) (ip1.i)));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_18;
_L1:
		return Boolean.valueOf(true);
	}

	protected byte b;
	private byte c;
	protected ArrayList e;
}
