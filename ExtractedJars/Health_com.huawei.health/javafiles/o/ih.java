// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;
import java.util.ArrayList;

// Referenced classes of package o:
//			im, kj, ij, kg, 
//			iu, io, ik

final class ih
	implements Serializable
{

	ih()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		l = 41;
	//    2    4:aload_0         
	//    3    5:bipush          41
	//    4    7:putfield        #28  <Field byte l>
		m = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #30  <Field short m>
		b = new byte[16];
	//    8   15:aload_0         
	//    9   16:bipush          16
	//   10   18:newarray        byte[]
	//   11   20:putfield        #32  <Field byte[] b>
		d = new byte[16];
	//   12   23:aload_0         
	//   13   24:bipush          16
	//   14   26:newarray        byte[]
	//   15   28:putfield        #34  <Field byte[] d>
		e = new byte[16];
	//   16   31:aload_0         
	//   17   32:bipush          16
	//   18   34:newarray        byte[]
	//   19   36:putfield        #36  <Field byte[] e>
		c = 0;
	//   20   39:aload_0         
	//   21   40:iconst_0        
	//   22   41:putfield        #38  <Field short c>
		a = 0;
	//   23   44:aload_0         
	//   24   45:iconst_0        
	//   25   46:putfield        #40  <Field short a>
		i = 0;
	//   26   49:aload_0         
	//   27   50:iconst_0        
	//   28   51:putfield        #42  <Field byte i>
		k = new byte[16];
	//   29   54:aload_0         
	//   30   55:bipush          16
	//   31   57:newarray        byte[]
	//   32   59:putfield        #44  <Field byte[] k>
		h = new byte[32];
	//   33   62:aload_0         
	//   34   63:bipush          32
	//   35   65:newarray        byte[]
	//   36   67:putfield        #46  <Field byte[] h>
		f = 0;
	//   37   70:aload_0         
	//   38   71:iconst_0        
	//   39   72:putfield        #48  <Field short f>
		g = new ArrayList();
	//   40   75:aload_0         
	//   41   76:new             #50  <Class ArrayList>
	//   42   79:dup             
	//   43   80:invokespecial   #51  <Method void ArrayList()>
	//   44   83:putfield        #53  <Field ArrayList g>
	//   45   86:return          
	}

	private Boolean e(DataOutputStream dataoutputstream)
	{
		short word0;
		ByteArrayOutputStream bytearrayoutputstream;
		DataOutputStream dataoutputstream1;
		ByteArrayOutputStream bytearrayoutputstream1;
		DataOutputStream dataoutputstream2;
		kj kj1;
		try
		{
			bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #59  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void ByteArrayOutputStream()>
	//    3    7:astore_3        
			dataoutputstream1 = new DataOutputStream(((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:new             #62  <Class DataOutputStream>
	//    5   11:dup             
	//    6   12:aload_3         
	//    7   13:invokespecial   #65  <Method void DataOutputStream(java.io.OutputStream)>
	//    8   16:astore          4
			dataoutputstream1.flush();
	//    9   18:aload           4
	//   10   20:invokevirtual   #68  <Method void DataOutputStream.flush()>
			dataoutputstream1.write(b);
	//   11   23:aload           4
	//   12   25:aload_0         
	//   13   26:getfield        #32  <Field byte[] b>
	//   14   29:invokevirtual   #72  <Method void DataOutputStream.write(byte[])>
			dataoutputstream1.write(d);
	//   15   32:aload           4
	//   16   34:aload_0         
	//   17   35:getfield        #34  <Field byte[] d>
	//   18   38:invokevirtual   #72  <Method void DataOutputStream.write(byte[])>
			dataoutputstream1.write(e);
	//   19   41:aload           4
	//   20   43:aload_0         
	//   21   44:getfield        #36  <Field byte[] e>
	//   22   47:invokevirtual   #72  <Method void DataOutputStream.write(byte[])>
			dataoutputstream1.writeShort(((int) (c)));
	//   23   50:aload           4
	//   24   52:aload_0         
	//   25   53:getfield        #38  <Field short c>
	//   26   56:invokevirtual   #76  <Method void DataOutputStream.writeShort(int)>
			dataoutputstream1.writeShort(((int) (a)));
	//   27   59:aload           4
	//   28   61:aload_0         
	//   29   62:getfield        #40  <Field short a>
	//   30   65:invokevirtual   #76  <Method void DataOutputStream.writeShort(int)>
			dataoutputstream1.writeByte(((int) (i)));
	//   31   68:aload           4
	//   32   70:aload_0         
	//   33   71:getfield        #42  <Field byte i>
	//   34   74:invokevirtual   #79  <Method void DataOutputStream.writeByte(int)>
			k[15] = 0;
	//   35   77:aload_0         
	//   36   78:getfield        #44  <Field byte[] k>
	//   37   81:bipush          15
	//   38   83:iconst_0        
	//   39   84:bastore         
			dataoutputstream1.write(im.d(k, k.length));
	//   40   85:aload           4
	//   41   87:aload_0         
	//   42   88:getfield        #44  <Field byte[] k>
	//   43   91:aload_0         
	//   44   92:getfield        #44  <Field byte[] k>
	//   45   95:arraylength     
	//   46   96:invokestatic    #84  <Method byte[] im.d(byte[], int)>
	//   47   99:invokevirtual   #72  <Method void DataOutputStream.write(byte[])>
			h[31] = 0;
	//   48  102:aload_0         
	//   49  103:getfield        #46  <Field byte[] h>
	//   50  106:bipush          31
	//   51  108:iconst_0        
	//   52  109:bastore         
			dataoutputstream1.write(im.d(h, h.length));
	//   53  110:aload           4
	//   54  112:aload_0         
	//   55  113:getfield        #46  <Field byte[] h>
	//   56  116:aload_0         
	//   57  117:getfield        #46  <Field byte[] h>
	//   58  120:arraylength     
	//   59  121:invokestatic    #84  <Method byte[] im.d(byte[], int)>
	//   60  124:invokevirtual   #72  <Method void DataOutputStream.write(byte[])>
			dataoutputstream1.writeShort(((int) (f)));
	//   61  127:aload           4
	//   62  129:aload_0         
	//   63  130:getfield        #48  <Field short f>
	//   64  133:invokevirtual   #76  <Method void DataOutputStream.writeShort(int)>
		}
	//*  65  136:iconst_0        
	//*  66  137:istore_2        
	//*  67  138:iload_2         
	//*  68  139:aload_0         
	//*  69  140:getfield        #48  <Field short f>
	//*  70  143:icmpge          360
	//*  71  146:new             #59  <Class ByteArrayOutputStream>
	//*  72  149:dup             
	//*  73  150:invokespecial   #60  <Method void ByteArrayOutputStream()>
	//*  74  153:astore          5
	//*  75  155:new             #62  <Class DataOutputStream>
	//*  76  158:dup             
	//*  77  159:aload           5
	//*  78  161:invokespecial   #65  <Method void DataOutputStream(java.io.OutputStream)>
	//*  79  164:astore          6
	//*  80  166:aload           6
	//*  81  168:invokevirtual   #68  <Method void DataOutputStream.flush()>
	//*  82  171:aload_0         
	//*  83  172:getfield        #53  <Field ArrayList g>
	//*  84  175:iload_2         
	//*  85  176:invokevirtual   #88  <Method Object ArrayList.get(int)>
	//*  86  179:checkcast       #90  <Class kj>
	//*  87  182:astore          7
	//*  88  184:aload           7
	//*  89  186:getfield        #93  <Field ij kj.e>
	//*  90  189:ifnull          208
	//*  91  192:aload           7
	//*  92  194:getfield        #93  <Field ij kj.e>
	//*  93  197:aload           6
	//*  94  199:invokevirtual   #97  <Method Boolean ij.a(DataOutputStream)>
	//*  95  202:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//*  96  205:ifne            208
	//*  97  208:aload           7
	//*  98  210:getfield        #106 <Field kg kj.a>
	//*  99  213:ifnull          232
	//* 100  216:aload           7
	//* 101  218:getfield        #106 <Field kg kj.a>
	//* 102  221:aload           6
	//* 103  223:invokevirtual   #110 <Method Boolean kg.d(DataOutputStream)>
	//* 104  226:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//* 105  229:ifne            232
	//* 106  232:aload           7
	//* 107  234:getfield        #113 <Field iu kj.d>
	//* 108  237:ifnull          256
	//* 109  240:aload           7
	//* 110  242:getfield        #113 <Field iu kj.d>
	//* 111  245:aload           6
	//* 112  247:invokevirtual   #117 <Method Boolean iu.e(DataOutputStream)>
	//* 113  250:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//* 114  253:ifne            256
	//* 115  256:aload           7
	//* 116  258:getfield        #120 <Field io kj.k>
	//* 117  261:ifnull          280
	//* 118  264:aload           7
	//* 119  266:getfield        #120 <Field io kj.k>
	//* 120  269:aload           6
	//* 121  271:invokevirtual   #124 <Method Boolean io.c(DataOutputStream)>
	//* 122  274:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//* 123  277:ifne            280
	//* 124  280:aload           7
	//* 125  282:getfield        #127 <Field ik kj.f>
	//* 126  285:ifnull          304
	//* 127  288:aload           7
	//* 128  290:getfield        #127 <Field ik kj.f>
	//* 129  293:aload           6
	//* 130  295:invokevirtual   #130 <Method Boolean ik.c(DataOutputStream)>
	//* 131  298:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//* 132  301:ifne            304
	//* 133  304:aload           7
	//* 134  306:aload           5
	//* 135  308:invokevirtual   #134 <Method int ByteArrayOutputStream.size()>
	//* 136  311:iconst_4        
	//* 137  312:iadd            
	//* 138  313:invokestatic    #140 <Method Integer Integer.valueOf(int)>
	//* 139  316:invokevirtual   #144 <Method short Integer.shortValue()>
	//* 140  319:putfield        #145 <Field short kj.c>
	//* 141  322:aload           4
	//* 142  324:aload           7
	//* 143  326:getfield        #145 <Field short kj.c>
	//* 144  329:invokevirtual   #76  <Method void DataOutputStream.writeShort(int)>
	//* 145  332:aload           4
	//* 146  334:aload           7
	//* 147  336:getfield        #148 <Field int kj.b>
	//* 148  339:invokevirtual   #151 <Method void DataOutputStream.writeInt(int)>
	//* 149  342:aload           4
	//* 150  344:aload           5
	//* 151  346:invokevirtual   #155 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 152  349:invokevirtual   #72  <Method void DataOutputStream.write(byte[])>
	//* 153  352:iload_2         
	//* 154  353:iconst_1        
	//* 155  354:iadd            
	//* 156  355:int2short       
	//* 157  356:istore_2        
	//* 158  357:goto            138
	//* 159  360:aload_0         
	//* 160  361:aload_3         
	//* 161  362:invokevirtual   #134 <Method int ByteArrayOutputStream.size()>
	//* 162  365:invokestatic    #140 <Method Integer Integer.valueOf(int)>
	//* 163  368:invokevirtual   #144 <Method short Integer.shortValue()>
	//* 164  371:putfield        #30  <Field short m>
	//* 165  374:aload_1         
	//* 166  375:aload_0         
	//* 167  376:getfield        #28  <Field byte l>
	//* 168  379:invokevirtual   #79  <Method void DataOutputStream.writeByte(int)>
	//* 169  382:aload_1         
	//* 170  383:aload_0         
	//* 171  384:getfield        #30  <Field short m>
	//* 172  387:invokevirtual   #76  <Method void DataOutputStream.writeShort(int)>
	//* 173  390:aload_1         
	//* 174  391:aload_3         
	//* 175  392:invokevirtual   #155 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 176  395:invokevirtual   #72  <Method void DataOutputStream.write(byte[])>
	//* 177  398:iconst_1        
	//* 178  399:invokestatic    #158 <Method Boolean Boolean.valueOf(boolean)>
	//* 179  402:areturn         
		// Misplaced declaration of an exception variable
		catch(DataOutputStream dataoutputstream)
	//* 180  403:astore_1        
		{
			return Boolean.valueOf(false);
	//  181  404:iconst_0        
	//  182  405:invokestatic    #158 <Method Boolean Boolean.valueOf(boolean)>
	//  183  408:areturn         
		}
		word0 = 0;
		if(word0 >= f)
			break; /* Loop/switch isn't completed */
		bytearrayoutputstream1 = new ByteArrayOutputStream();
		dataoutputstream2 = new DataOutputStream(((java.io.OutputStream) (bytearrayoutputstream1)));
		dataoutputstream2.flush();
		kj1 = (kj)g.get(((int) (word0)));
		if(kj1.e != null)
			if(kj1.e.a(dataoutputstream2).booleanValue());
		if(kj1.a != null)
			if(kj1.a.d(dataoutputstream2).booleanValue());
		if(kj1.d != null)
			if(kj1.d.e(dataoutputstream2).booleanValue());
		if(kj1.k != null)
			if(kj1.k.c(dataoutputstream2).booleanValue());
		if(kj1.f != null)
			if(kj1.f.c(dataoutputstream2).booleanValue());
		kj1.c = Integer.valueOf(bytearrayoutputstream1.size() + 4).shortValue();
		dataoutputstream1.writeShort(((int) (kj1.c)));
		dataoutputstream1.writeInt(kj1.b);
		dataoutputstream1.write(bytearrayoutputstream1.toByteArray());
		word0++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_138;
_L1:
		m = Integer.valueOf(bytearrayoutputstream.size()).shortValue();
		dataoutputstream.writeByte(((int) (l)));
		dataoutputstream.writeShort(((int) (m)));
		dataoutputstream.write(bytearrayoutputstream.toByteArray());
		return Boolean.valueOf(true);
	}

	protected final byte[] e()
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #59  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		e(new DataOutputStream(((java.io.OutputStream) (bytearrayoutputstream))));
	//    4    8:aload_0         
	//    5    9:new             #62  <Class DataOutputStream>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #65  <Method void DataOutputStream(java.io.OutputStream)>
	//    9   17:invokespecial   #159 <Method Boolean e(DataOutputStream)>
	//   10   20:pop             
		return bytearrayoutputstream.toByteArray();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #155 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   13   25:areturn         
	}

	protected short a;
	protected byte b[];
	protected short c;
	protected byte d[];
	protected byte e[];
	protected short f;
	protected ArrayList g;
	protected byte h[];
	protected byte i;
	protected byte k[];
	private byte l;
	private short m;
}
