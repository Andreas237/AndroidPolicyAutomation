// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text:
//			Image, BadElementException, Utilities

public class Jpeg2000 extends Image
{
	public static class ColorSpecBox extends ArrayList
	{

		public int getApprox()
		{
			return ((Integer)get(2)).intValue();
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:invokevirtual   #21  <Method Object get(int)>
		//    3    5:checkcast       #23  <Class Integer>
		//    4    8:invokevirtual   #26  <Method int Integer.intValue()>
		//    5   11:ireturn         
		}

		public byte[] getColorProfile()
		{
			return colorProfile;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field byte[] colorProfile>
		//    2    4:areturn         
		}

		public int getEnumCs()
		{
			return ((Integer)get(3)).intValue();
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:invokevirtual   #21  <Method Object get(int)>
		//    3    5:checkcast       #23  <Class Integer>
		//    4    8:invokevirtual   #26  <Method int Integer.intValue()>
		//    5   11:ireturn         
		}

		public int getMeth()
		{
			return ((Integer)get(0)).intValue();
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #21  <Method Object get(int)>
		//    3    5:checkcast       #23  <Class Integer>
		//    4    8:invokevirtual   #26  <Method int Integer.intValue()>
		//    5   11:ireturn         
		}

		public int getPrec()
		{
			return ((Integer)get(1)).intValue();
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokevirtual   #21  <Method Object get(int)>
		//    3    5:checkcast       #23  <Class Integer>
		//    4    8:invokevirtual   #26  <Method int Integer.intValue()>
		//    5   11:ireturn         
		}

		void setColorProfile(byte abyte0[])
		{
			colorProfile = abyte0;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field byte[] colorProfile>
		//    3    5:return          
		}

		private byte colorProfile[];

		public ColorSpecBox()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ArrayList()>
		//    2    4:return          
		}
	}

	private class ZeroBoxSizeException extends IOException
	{

		final Jpeg2000 this$0;

		public ZeroBoxSizeException()
		{
			this$0 = Jpeg2000.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field Jpeg2000 this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void IOException()>
		//    5    9:return          
		}

		public ZeroBoxSizeException(String s)
		{
			this$0 = Jpeg2000.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field Jpeg2000 this$0>
			super(s);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #21  <Method void IOException(String)>
		//    6   10:return          
		}
	}


	Jpeg2000(Image image)
	{
		super(image);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void Image(Image)>
		colorSpecBoxes = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #51  <Field ArrayList colorSpecBoxes>
		isJp2 = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #53  <Field boolean isJp2>
		if(image instanceof Jpeg2000)
	//*   9   15:aload_1         
	//*  10   16:instanceof      #2   <Class Jpeg2000>
	//*  11   19:ifeq            85
		{
			image = ((Image) ((Jpeg2000)image));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class Jpeg2000>
	//   14   26:astore_1        
			numOfComps = ((Jpeg2000) (image)).numOfComps;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getfield        #55  <Field int numOfComps>
	//   18   32:putfield        #55  <Field int numOfComps>
			if(colorSpecBoxes != null)
	//*  19   35:aload_0         
	//*  20   36:getfield        #51  <Field ArrayList colorSpecBoxes>
	//*  21   39:ifnull          56
				colorSpecBoxes = (ArrayList)((Jpeg2000) (image)).colorSpecBoxes.clone();
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #51  <Field ArrayList colorSpecBoxes>
	//   25   47:invokevirtual   #61  <Method Object ArrayList.clone()>
	//   26   50:checkcast       #57  <Class ArrayList>
	//   27   53:putfield        #51  <Field ArrayList colorSpecBoxes>
			isJp2 = ((Jpeg2000) (image)).isJp2;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:getfield        #53  <Field boolean isJp2>
	//   31   61:putfield        #53  <Field boolean isJp2>
			if(bpcBoxData != null)
	//*  32   64:aload_0         
	//*  33   65:getfield        #63  <Field byte[] bpcBoxData>
	//*  34   68:ifnull          85
				bpcBoxData = (byte[])((byte []) (((Jpeg2000) (image)).bpcBoxData)).clone();
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:getfield        #63  <Field byte[] bpcBoxData>
	//   38   76:invokevirtual   #65  <Method Object _5B_B.clone()>
	//   39   79:checkcast       #64  <Class byte[]>
	//   40   82:putfield        #63  <Field byte[] bpcBoxData>
		}
	//   41   85:return          
	}

	public Jpeg2000(URL url)
		throws BadElementException, IOException
	{
		super(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void Image(URL)>
		colorSpecBoxes = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #51  <Field ArrayList colorSpecBoxes>
		isJp2 = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #53  <Field boolean isJp2>
		processParameters();
	//    9   15:aload_0         
	//   10   16:invokespecial   #77  <Method void processParameters()>
	//   11   19:return          
	}

	public Jpeg2000(byte abyte0[])
		throws BadElementException, IOException
	{
		super((URL)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #81  <Class URL>
	//    3    5:invokespecial   #73  <Method void Image(URL)>
		colorSpecBoxes = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #51  <Field ArrayList colorSpecBoxes>
		isJp2 = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #53  <Field boolean isJp2>
		rawData = abyte0;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #84  <Field byte[] rawData>
		originalData = abyte0;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:putfield        #87  <Field byte[] originalData>
		processParameters();
	//   16   28:aload_0         
	//   17   29:invokespecial   #77  <Method void processParameters()>
	//   18   32:return          
	}

	public Jpeg2000(byte abyte0[], float f, float f1)
		throws BadElementException, IOException
	{
		this(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void Jpeg2000(byte[])>
		scaledWidth = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #94  <Field float scaledWidth>
		scaledHeight = f1;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #97  <Field float scaledHeight>
	//    9   15:return          
	}

	private int cio_read(int i)
		throws IOException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(i--; i >= 0; i--)
	//*   2    2:iload_1         
	//*   3    3:iconst_1        
	//*   4    4:isub            
	//*   5    5:istore_1        
	//*   6    6:iload_1         
	//*   7    7:iflt            31
			j += inp.read() << (i << 3);
	//    8   10:iload_2         
	//    9   11:aload_0         
	//   10   12:getfield        #101 <Field InputStream inp>
	//   11   15:invokevirtual   #107 <Method int InputStream.read()>
	//   12   18:iload_1         
	//   13   19:iconst_3        
	//   14   20:ishl            
	//   15   21:ishl            
	//   16   22:iadd            
	//   17   23:istore_2        

	//   18   24:iload_1         
	//   19   25:iconst_1        
	//   20   26:isub            
	//   21   27:istore_1        
	//*  22   28:goto            6
		return j;
	//   23   31:iload_2         
	//   24   32:ireturn         
	}

	private ColorSpecBox jp2_read_colr()
		throws IOException
	{
		int i = 8;
	//    0    0:bipush          8
	//    1    2:istore_1        
		ColorSpecBox colorspecbox = new ColorSpecBox();
	//    2    3:new             #6   <Class Jpeg2000$ColorSpecBox>
	//    3    6:dup             
	//    4    7:invokespecial   #111 <Method void Jpeg2000$ColorSpecBox()>
	//    5   10:astore_3        
		for(int j = 0; j < 3; j++)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:iconst_3        
	//*  10   15:icmpge          42
		{
			colorspecbox.add(((Object) (Integer.valueOf(cio_read(1)))));
	//   11   18:aload_3         
	//   12   19:aload_0         
	//   13   20:iconst_1        
	//   14   21:invokespecial   #113 <Method int cio_read(int)>
	//   15   24:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   16   27:invokevirtual   #123 <Method boolean Jpeg2000$ColorSpecBox.add(Object)>
	//   17   30:pop             
			i++;
	//   18   31:iload_1         
	//   19   32:iconst_1        
	//   20   33:iadd            
	//   21   34:istore_1        
		}

	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:istore_2        
	//*  26   39:goto            13
		if(colorspecbox.getMeth() == 1)
	//*  27   42:aload_3         
	//*  28   43:invokevirtual   #126 <Method int Jpeg2000$ColorSpecBox.getMeth()>
	//*  29   46:iconst_1        
	//*  30   47:icmpne          111
		{
			colorspecbox.add(((Object) (Integer.valueOf(cio_read(4)))));
	//   31   50:aload_3         
	//   32   51:aload_0         
	//   33   52:iconst_4        
	//   34   53:invokespecial   #113 <Method int cio_read(int)>
	//   35   56:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   36   59:invokevirtual   #123 <Method boolean Jpeg2000$ColorSpecBox.add(Object)>
	//   37   62:pop             
			i += 4;
	//   38   63:iload_1         
	//   39   64:iconst_4        
	//   40   65:iadd            
	//   41   66:istore_1        
		} else
	//*  42   67:aload_0         
	//*  43   68:getfield        #128 <Field int boxLength>
	//*  44   71:iload_1         
	//*  45   72:isub            
	//*  46   73:ifle            109
	//*  47   76:aload_0         
	//*  48   77:getfield        #128 <Field int boxLength>
	//*  49   80:iload_1         
	//*  50   81:isub            
	//*  51   82:newarray        byte[]
	//*  52   84:astore          4
	//*  53   86:aload_0         
	//*  54   87:getfield        #101 <Field InputStream inp>
	//*  55   90:aload           4
	//*  56   92:iconst_0        
	//*  57   93:aload_0         
	//*  58   94:getfield        #128 <Field int boxLength>
	//*  59   97:iload_1         
	//*  60   98:isub            
	//*  61   99:invokevirtual   #131 <Method int InputStream.read(byte[], int, int)>
	//*  62  102:pop             
	//*  63  103:aload_3         
	//*  64  104:aload           4
	//*  65  106:invokevirtual   #134 <Method void Jpeg2000$ColorSpecBox.setColorProfile(byte[])>
	//*  66  109:aload_3         
	//*  67  110:areturn         
		{
			colorspecbox.add(((Object) (Integer.valueOf(0))));
	//   68  111:aload_3         
	//   69  112:iconst_0        
	//   70  113:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   71  116:invokevirtual   #123 <Method boolean Jpeg2000$ColorSpecBox.add(Object)>
	//   72  119:pop             
		}
		if(boxLength - i > 0)
		{
			byte abyte0[] = new byte[boxLength - i];
			inp.read(abyte0, 0, boxLength - i);
			colorspecbox.setColorProfile(abyte0);
		}
		return colorspecbox;
	//*  73  120:goto            67
	}

	private void processParameters()
		throws IOException
	{
		type = 33;
	//    0    0:aload_0         
	//    1    1:bipush          33
	//    2    3:putfield        #139 <Field int type>
		originalType = 8;
	//    3    6:aload_0         
	//    4    7:bipush          8
	//    5    9:putfield        #142 <Field int originalType>
		inp = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #101 <Field InputStream inp>
		if(rawData != null) goto _L2; else goto _L1
	//    9   17:aload_0         
	//   10   18:getfield        #84  <Field byte[] rawData>
	//   11   21:ifnonnull       117
_L1:
		inp = url.openStream();
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #146 <Field URL url>
	//   15   29:invokevirtual   #150 <Method InputStream URL.openStream()>
	//   16   32:putfield        #101 <Field InputStream inp>
_L6:
		boxLength = cio_read(4);
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:iconst_4        
	//   20   38:invokespecial   #113 <Method int cio_read(int)>
	//   21   41:putfield        #128 <Field int boxLength>
		if(boxLength != 12) goto _L4; else goto _L3
	//   22   44:aload_0         
	//   23   45:getfield        #128 <Field int boxLength>
	//   24   48:bipush          12
	//   25   50:icmpne          506
_L3:
		isJp2 = true;
	//   26   53:aload_0         
	//   27   54:iconst_1        
	//   28   55:putfield        #53  <Field boolean isJp2>
		boxType = cio_read(4);
	//   29   58:aload_0         
	//   30   59:aload_0         
	//   31   60:iconst_4        
	//   32   61:invokespecial   #113 <Method int cio_read(int)>
	//   33   64:putfield        #152 <Field int boxType>
		if(0x6a502020 != boxType)
	//*  34   67:ldc1            #23  <Int 0x6a502020>
	//*  35   69:aload_0         
	//*  36   70:getfield        #152 <Field int boxType>
	//*  37   73:icmpeq          135
			throw new IOException(MessageLocalization.getComposedMessage("expected.jp.marker", new Object[0]));
	//   38   76:new             #71  <Class IOException>
	//   39   79:dup             
	//   40   80:ldc1            #154 <String "expected.jp.marker">
	//   41   82:iconst_0        
	//   42   83:anewarray       Object[]
	//   43   86:invokestatic    #162 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   44   89:invokespecial   #165 <Method void IOException(String)>
	//   45   92:athrow          
		  goto _L5
		Object obj;
		obj;
	//   46   93:astore          5
		if(inp != null)
	//*  47   95:aload_0         
	//*  48   96:getfield        #101 <Field InputStream inp>
	//*  49   99:ifnull          114
		{
			int i;
			int j;
			int k;
			int l;
			try
			{
				inp.close();
	//   50  102:aload_0         
	//   51  103:getfield        #101 <Field InputStream inp>
	//   52  106:invokevirtual   #168 <Method void InputStream.close()>
			}
	//*  53  109:aload_0         
	//*  54  110:aconst_null     
	//*  55  111:putfield        #101 <Field InputStream inp>
	//*  56  114:aload           5
	//*  57  116:athrow          
	//*  58  117:aload_0         
	//*  59  118:new             #170 <Class ByteArrayInputStream>
	//*  60  121:dup             
	//*  61  122:aload_0         
	//*  62  123:getfield        #84  <Field byte[] rawData>
	//*  63  126:invokespecial   #171 <Method void ByteArrayInputStream(byte[])>
	//*  64  129:putfield        #101 <Field InputStream inp>
	//*  65  132:goto            35
	//*  66  135:ldc1            #172 <Int 0xd0a870a>
	//*  67  137:aload_0         
	//*  68  138:iconst_4        
	//*  69  139:invokespecial   #113 <Method int cio_read(int)>
	//*  70  142:icmpeq          162
	//*  71  145:new             #71  <Class IOException>
	//*  72  148:dup             
	//*  73  149:ldc1            #174 <String "error.with.jp.marker">
	//*  74  151:iconst_0        
	//*  75  152:anewarray       Object[]
	//*  76  155:invokestatic    #162 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  77  158:invokespecial   #165 <Method void IOException(String)>
	//*  78  161:athrow          
	//*  79  162:aload_0         
	//*  80  163:invokevirtual   #177 <Method void jp2_read_boxhdr()>
	//*  81  166:ldc1            #19  <Int 0x66747970>
	//*  82  168:aload_0         
	//*  83  169:getfield        #152 <Field int boxType>
	//*  84  172:icmpeq          192
	//*  85  175:new             #71  <Class IOException>
	//*  86  178:dup             
	//*  87  179:ldc1            #179 <String "expected.ftyp.marker">
	//*  88  181:iconst_0        
	//*  89  182:anewarray       Object[]
	//*  90  185:invokestatic    #162 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  91  188:invokespecial   #165 <Method void IOException(String)>
	//*  92  191:athrow          
	//*  93  192:aload_0         
	//*  94  193:getfield        #101 <Field InputStream inp>
	//*  95  196:aload_0         
	//*  96  197:getfield        #128 <Field int boxLength>
	//*  97  200:bipush          8
	//*  98  202:isub            
	//*  99  203:invokestatic    #185 <Method void Utilities.skip(InputStream, int)>
	//* 100  206:aload_0         
	//* 101  207:invokevirtual   #177 <Method void jp2_read_boxhdr()>
	//* 102  210:ldc1            #29  <Int 0x6a703268>
	//* 103  212:aload_0         
	//* 104  213:getfield        #152 <Field int boxType>
	//* 105  216:icmpeq          263
	//* 106  219:aload_0         
	//* 107  220:getfield        #152 <Field int boxType>
	//* 108  223:ldc1            #27  <Int 0x6a703263>
	//* 109  225:icmpne          245
	//* 110  228:new             #71  <Class IOException>
	//* 111  231:dup             
	//* 112  232:ldc1            #187 <String "expected.jp2h.marker">
	//* 113  234:iconst_0        
	//* 114  235:anewarray       Object[]
	//* 115  238:invokestatic    #162 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 116  241:invokespecial   #165 <Method void IOException(String)>
	//* 117  244:athrow          
	//* 118  245:aload_0         
	//* 119  246:getfield        #101 <Field InputStream inp>
	//* 120  249:aload_0         
	//* 121  250:getfield        #128 <Field int boxLength>
	//* 122  253:bipush          8
	//* 123  255:isub            
	//* 124  256:invokestatic    #185 <Method void Utilities.skip(InputStream, int)>
	//* 125  259:aload_0         
	//* 126  260:invokevirtual   #177 <Method void jp2_read_boxhdr()>
	//* 127  263:ldc1            #29  <Int 0x6a703268>
	//* 128  265:aload_0         
	//* 129  266:getfield        #152 <Field int boxType>
	//* 130  269:icmpne          210
	//* 131  272:aload_0         
	//* 132  273:invokevirtual   #177 <Method void jp2_read_boxhdr()>
	//* 133  276:ldc1            #21  <Int 0x69686472>
	//* 134  278:aload_0         
	//* 135  279:getfield        #152 <Field int boxType>
	//* 136  282:icmpeq          302
	//* 137  285:new             #71  <Class IOException>
	//* 138  288:dup             
	//* 139  289:ldc1            #189 <String "expected.ihdr.marker">
	//* 140  291:iconst_0        
	//* 141  292:anewarray       Object[]
	//* 142  295:invokestatic    #162 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 143  298:invokespecial   #165 <Method void IOException(String)>
	//* 144  301:athrow          
	//* 145  302:aload_0         
	//* 146  303:aload_0         
	//* 147  304:iconst_4        
	//* 148  305:invokespecial   #113 <Method int cio_read(int)>
	//* 149  308:i2f             
	//* 150  309:putfield        #97  <Field float scaledHeight>
	//* 151  312:aload_0         
	//* 152  313:aload_0         
	//* 153  314:getfield        #97  <Field float scaledHeight>
	//* 154  317:invokevirtual   #193 <Method void setTop(float)>
	//* 155  320:aload_0         
	//* 156  321:aload_0         
	//* 157  322:iconst_4        
	//* 158  323:invokespecial   #113 <Method int cio_read(int)>
	//* 159  326:i2f             
	//* 160  327:putfield        #94  <Field float scaledWidth>
	//* 161  330:aload_0         
	//* 162  331:aload_0         
	//* 163  332:getfield        #94  <Field float scaledWidth>
	//* 164  335:invokevirtual   #196 <Method void setRight(float)>
	//* 165  338:aload_0         
	//* 166  339:aload_0         
	//* 167  340:iconst_2        
	//* 168  341:invokespecial   #113 <Method int cio_read(int)>
	//* 169  344:putfield        #55  <Field int numOfComps>
	//* 170  347:aload_0         
	//* 171  348:iconst_m1       
	//* 172  349:putfield        #199 <Field int bpc>
	//* 173  352:aload_0         
	//* 174  353:aload_0         
	//* 175  354:iconst_1        
	//* 176  355:invokespecial   #113 <Method int cio_read(int)>
	//* 177  358:putfield        #199 <Field int bpc>
	//* 178  361:aload_0         
	//* 179  362:getfield        #101 <Field InputStream inp>
	//* 180  365:iconst_3        
	//* 181  366:invokestatic    #185 <Method void Utilities.skip(InputStream, int)>
	//* 182  369:aload_0         
	//* 183  370:invokevirtual   #177 <Method void jp2_read_boxhdr()>
	//* 184  373:aload_0         
	//* 185  374:getfield        #152 <Field int boxType>
	//* 186  377:ldc1            #13  <Int 0x62706363>
	//* 187  379:icmpne          451
	//* 188  382:aload_0         
	//* 189  383:aload_0         
	//* 190  384:getfield        #128 <Field int boxLength>
	//* 191  387:bipush          8
	//* 192  389:isub            
	//* 193  390:newarray        byte[]
	//* 194  392:putfield        #63  <Field byte[] bpcBoxData>
	//* 195  395:aload_0         
	//* 196  396:getfield        #101 <Field InputStream inp>
	//* 197  399:aload_0         
	//* 198  400:getfield        #63  <Field byte[] bpcBoxData>
	//* 199  403:iconst_0        
	//* 200  404:aload_0         
	//* 201  405:getfield        #128 <Field int boxLength>
	//* 202  408:bipush          8
	//* 203  410:isub            
	//* 204  411:invokevirtual   #131 <Method int InputStream.read(byte[], int, int)>
	//* 205  414:pop             
	//* 206  415:aload_0         
	//* 207  416:getfield        #101 <Field InputStream inp>
	//* 208  419:ifnull          434
	//* 209  422:aload_0         
	//* 210  423:getfield        #101 <Field InputStream inp>
	//* 211  426:invokevirtual   #168 <Method void InputStream.close()>
	//* 212  429:aload_0         
	//* 213  430:aconst_null     
	//* 214  431:putfield        #101 <Field InputStream inp>
	//* 215  434:aload_0         
	//* 216  435:aload_0         
	//* 217  436:invokevirtual   #203 <Method float getWidth()>
	//* 218  439:putfield        #206 <Field float plainWidth>
	//* 219  442:aload_0         
	//* 220  443:aload_0         
	//* 221  444:invokevirtual   #209 <Method float getHeight()>
	//* 222  447:putfield        #212 <Field float plainHeight>
	//* 223  450:return          
	//* 224  451:aload_0         
	//* 225  452:getfield        #152 <Field int boxType>
	//* 226  455:ldc1            #15  <Int 0x636f6c72>
	//* 227  457:icmpne          415
	//* 228  460:aload_0         
	//* 229  461:getfield        #51  <Field ArrayList colorSpecBoxes>
	//* 230  464:ifnonnull       478
	//* 231  467:aload_0         
	//* 232  468:new             #57  <Class ArrayList>
	//* 233  471:dup             
	//* 234  472:invokespecial   #213 <Method void ArrayList()>
	//* 235  475:putfield        #51  <Field ArrayList colorSpecBoxes>
	//* 236  478:aload_0         
	//* 237  479:getfield        #51  <Field ArrayList colorSpecBoxes>
	//* 238  482:aload_0         
	//* 239  483:invokespecial   #215 <Method Jpeg2000$ColorSpecBox jp2_read_colr()>
	//* 240  486:invokevirtual   #216 <Method boolean ArrayList.add(Object)>
	//* 241  489:pop             
	//* 242  490:aload_0         
	//* 243  491:invokevirtual   #177 <Method void jp2_read_boxhdr()>
	//* 244  494:ldc1            #15  <Int 0x636f6c72>
	//* 245  496:aload_0         
	//* 246  497:getfield        #152 <Field int boxType>
	//* 247  500:icmpeq          460
	//* 248  503:goto            415
	//* 249  506:aload_0         
	//* 250  507:getfield        #128 <Field int boxLength>
	//* 251  510:ldc1            #217 <Int 0xff4fff51>
	//* 252  512:icmpne          608
	//* 253  515:aload_0         
	//* 254  516:getfield        #101 <Field InputStream inp>
	//* 255  519:iconst_4        
	//* 256  520:invokestatic    #185 <Method void Utilities.skip(InputStream, int)>
	//* 257  523:aload_0         
	//* 258  524:iconst_4        
	//* 259  525:invokespecial   #113 <Method int cio_read(int)>
	//* 260  528:istore_1        
	//* 261  529:aload_0         
	//* 262  530:iconst_4        
	//* 263  531:invokespecial   #113 <Method int cio_read(int)>
	//* 264  534:istore_2        
	//* 265  535:aload_0         
	//* 266  536:iconst_4        
	//* 267  537:invokespecial   #113 <Method int cio_read(int)>
	//* 268  540:istore_3        
	//* 269  541:aload_0         
	//* 270  542:iconst_4        
	//* 271  543:invokespecial   #113 <Method int cio_read(int)>
	//* 272  546:istore          4
	//* 273  548:aload_0         
	//* 274  549:getfield        #101 <Field InputStream inp>
	//* 275  552:bipush          16
	//* 276  554:invokestatic    #185 <Method void Utilities.skip(InputStream, int)>
	//* 277  557:aload_0         
	//* 278  558:aload_0         
	//* 279  559:iconst_2        
	//* 280  560:invokespecial   #113 <Method int cio_read(int)>
	//* 281  563:putfield        #220 <Field int colorspace>
	//* 282  566:aload_0         
	//* 283  567:bipush          8
	//* 284  569:putfield        #199 <Field int bpc>
	//* 285  572:aload_0         
	//* 286  573:iload_2         
	//* 287  574:iload           4
	//* 288  576:isub            
	//* 289  577:i2f             
	//* 290  578:putfield        #97  <Field float scaledHeight>
	//* 291  581:aload_0         
	//* 292  582:aload_0         
	//* 293  583:getfield        #97  <Field float scaledHeight>
	//* 294  586:invokevirtual   #193 <Method void setTop(float)>
	//* 295  589:aload_0         
	//* 296  590:iload_1         
	//* 297  591:iload_3         
	//* 298  592:isub            
	//* 299  593:i2f             
	//* 300  594:putfield        #94  <Field float scaledWidth>
	//* 301  597:aload_0         
	//* 302  598:aload_0         
	//* 303  599:getfield        #94  <Field float scaledWidth>
	//* 304  602:invokevirtual   #196 <Method void setRight(float)>
	//* 305  605:goto            415
	//* 306  608:new             #71  <Class IOException>
	//* 307  611:dup             
	//* 308  612:ldc1            #222 <String "not.a.valid.jpeg2000.file">
	//* 309  614:iconst_0        
	//* 310  615:anewarray       Object[]
	//* 311  618:invokestatic    #162 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 312  621:invokespecial   #165 <Method void IOException(String)>
	//* 313  624:athrow          
	//* 314  625:astore          5
	//* 315  627:goto            494
			catch(Exception exception1) { }
	//  316  630:astore          6
			inp = null;
		}
		throw obj;
_L2:
		inp = ((InputStream) (new ByteArrayInputStream(rawData)));
		  goto _L6
_L5:
		if(0xd0a870a != cio_read(4))
			throw new IOException(MessageLocalization.getComposedMessage("error.with.jp.marker", new Object[0]));
		jp2_read_boxhdr();
		if(0x66747970 != boxType)
			throw new IOException(MessageLocalization.getComposedMessage("expected.ftyp.marker", new Object[0]));
		Utilities.skip(inp, boxLength - 8);
		jp2_read_boxhdr();
		do
			if(0x6a703268 != boxType)
			{
				if(boxType == 0x6a703263)
					throw new IOException(MessageLocalization.getComposedMessage("expected.jp2h.marker", new Object[0]));
				Utilities.skip(inp, boxLength - 8);
				jp2_read_boxhdr();
			}
		while(0x6a703268 != boxType);
		jp2_read_boxhdr();
		if(0x69686472 != boxType)
			throw new IOException(MessageLocalization.getComposedMessage("expected.ihdr.marker", new Object[0]));
		scaledHeight = cio_read(4);
		setTop(scaledHeight);
		scaledWidth = cio_read(4);
		setRight(scaledWidth);
		numOfComps = cio_read(2);
		bpc = -1;
		bpc = cio_read(1);
		Utilities.skip(inp, 3);
		jp2_read_boxhdr();
		if(boxType != 0x62706363) goto _L8; else goto _L7
_L7:
		bpcBoxData = new byte[boxLength - 8];
		inp.read(bpcBoxData, 0, boxLength - 8);
_L10:
		if(inp != null)
		{
			try
			{
				inp.close();
			}
	//* 317  632:goto            109
			catch(Exception exception) { }
	//  318  635:astore          5
			inp = null;
		}
		plainWidth = getWidth();
		plainHeight = getHeight();
		return;
_L8:
		if(boxType != 0x636f6c72) goto _L10; else goto _L9
_L9:
		if(colorSpecBoxes == null)
			colorSpecBoxes = new ArrayList();
		colorSpecBoxes.add(((Object) (jp2_read_colr())));
		try
		{
			jp2_read_boxhdr();
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		if(0x636f6c72 == boxType) goto _L9; else goto _L10
_L4:
label0:
		{
			if(boxLength != 0xff4fff51)
				break label0;
			Utilities.skip(inp, 4);
			i = cio_read(4);
			j = cio_read(4);
			k = cio_read(4);
			l = cio_read(4);
			Utilities.skip(inp, 16);
			colorspace = cio_read(2);
			bpc = 8;
			scaledHeight = j - l;
			setTop(scaledHeight);
			scaledWidth = i - k;
			setRight(scaledWidth);
		}
		  goto _L10
		throw new IOException(MessageLocalization.getComposedMessage("not.a.valid.jpeg2000.file", new Object[0]));
	//* 319  637:goto            429
	}

	public byte[] getBpcBoxData()
	{
		return bpcBoxData;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field byte[] bpcBoxData>
	//    2    4:areturn         
	}

	public ArrayList getColorSpecBoxes()
	{
		return colorSpecBoxes;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList colorSpecBoxes>
	//    2    4:areturn         
	}

	public int getNumOfComps()
	{
		return numOfComps;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int numOfComps>
	//    2    4:ireturn         
	}

	public boolean isJp2()
	{
		return isJp2;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean isJp2>
	//    2    4:ireturn         
	}

	public void jp2_read_boxhdr()
		throws IOException
	{
		boxLength = cio_read(4);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iconst_4        
	//    3    3:invokespecial   #113 <Method int cio_read(int)>
	//    4    6:putfield        #128 <Field int boxLength>
		boxType = cio_read(4);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:invokespecial   #113 <Method int cio_read(int)>
	//    9   15:putfield        #152 <Field int boxType>
		if(boxLength == 1)
	//*  10   18:aload_0         
	//*  11   19:getfield        #128 <Field int boxLength>
	//*  12   22:iconst_1        
	//*  13   23:icmpne          84
		{
			if(cio_read(4) != 0)
	//*  14   26:aload_0         
	//*  15   27:iconst_4        
	//*  16   28:invokespecial   #113 <Method int cio_read(int)>
	//*  17   31:ifeq            51
				throw new IOException(MessageLocalization.getComposedMessage("cannot.handle.box.sizes.higher.than.2.32", new Object[0]));
	//   18   34:new             #71  <Class IOException>
	//   19   37:dup             
	//   20   38:ldc1            #232 <String "cannot.handle.box.sizes.higher.than.2.32">
	//   21   40:iconst_0        
	//   22   41:anewarray       Object[]
	//   23   44:invokestatic    #162 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   24   47:invokespecial   #165 <Method void IOException(String)>
	//   25   50:athrow          
			boxLength = cio_read(4);
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:iconst_4        
	//   29   54:invokespecial   #113 <Method int cio_read(int)>
	//   30   57:putfield        #128 <Field int boxLength>
			if(boxLength == 0)
	//*  31   60:aload_0         
	//*  32   61:getfield        #128 <Field int boxLength>
	//*  33   64:ifne            109
				throw new IOException(MessageLocalization.getComposedMessage("unsupported.box.size.eq.eq.0", new Object[0]));
	//   34   67:new             #71  <Class IOException>
	//   35   70:dup             
	//   36   71:ldc1            #234 <String "unsupported.box.size.eq.eq.0">
	//   37   73:iconst_0        
	//   38   74:anewarray       Object[]
	//   39   77:invokestatic    #162 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   40   80:invokespecial   #165 <Method void IOException(String)>
	//   41   83:athrow          
		} else
		if(boxLength == 0)
	//*  42   84:aload_0         
	//*  43   85:getfield        #128 <Field int boxLength>
	//*  44   88:ifne            109
			throw new ZeroBoxSizeException(MessageLocalization.getComposedMessage("unsupported.box.size.eq.eq.0", new Object[0]));
	//   45   91:new             #9   <Class Jpeg2000$ZeroBoxSizeException>
	//   46   94:dup             
	//   47   95:aload_0         
	//   48   96:ldc1            #234 <String "unsupported.box.size.eq.eq.0">
	//   49   98:iconst_0        
	//   50   99:anewarray       Object[]
	//   51  102:invokestatic    #162 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   52  105:invokespecial   #237 <Method void Jpeg2000$ZeroBoxSizeException(Jpeg2000, String)>
	//   53  108:athrow          
	//   54  109:return          
	}

	public static final int JP2_BPCC = 0x62706363;
	public static final int JP2_COLR = 0x636f6c72;
	public static final int JP2_DBTL = 0x6474626c;
	public static final int JP2_FTYP = 0x66747970;
	public static final int JP2_IHDR = 0x69686472;
	public static final int JP2_JP = 0x6a502020;
	public static final int JP2_JP2 = 0x6a703220;
	public static final int JP2_JP2C = 0x6a703263;
	public static final int JP2_JP2H = 0x6a703268;
	public static final int JP2_URL = 0x75726c20;
	public static final int JPIP_JPIP = 0x6a706970;
	int boxLength;
	int boxType;
	byte bpcBoxData[];
	ArrayList colorSpecBoxes;
	InputStream inp;
	boolean isJp2;
	int numOfComps;
}
