// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.fonts.cmaps:
//			AbstractCMap, CMapSequence

public class CMapByteCid extends AbstractCMap
{

	public CMapByteCid()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractCMap()>
		planes = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field ArrayList planes>
		planes.add(((Object) (new char[256])));
	//    7   15:aload_0         
	//    8   16:getfield        #16  <Field ArrayList planes>
	//    9   19:sipush          256
	//   10   22:newarray        char[]
	//   11   24:invokevirtual   #20  <Method boolean ArrayList.add(Object)>
	//   12   27:pop             
	//   13   28:return          
	}

	private void encodeSequence(byte abyte0[], char c)
	{
		int i1 = abyte0.length - 1;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:istore          7
		int k = 0;
	//    5    6:iconst_0        
	//    6    7:istore          5
		for(int i = 0; i < i1; i++)
	//*   7    9:iconst_0        
	//*   8   10:istore          4
	//*   9   12:iload           4
	//*  10   14:iload           7
	//*  11   16:icmpge          142
		{
			char ac[] = (char[])planes.get(k);
	//   12   19:aload_0         
	//   13   20:getfield        #16  <Field ArrayList planes>
	//   14   23:iload           5
	//   15   25:invokevirtual   #27  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #29  <Class char[]>
	//   17   31:astore          9
			int j1 = abyte0[i] & 0xff;
	//   18   33:aload_1         
	//   19   34:iload           4
	//   20   36:baload          
	//   21   37:sipush          255
	//   22   40:iand            
	//   23   41:istore          8
			k = ((int) (ac[j1]));
	//   24   43:aload           9
	//   25   45:iload           8
	//   26   47:caload          
	//   27   48:istore          5
			if(k != 0 && (k & 0x8000) == 0)
	//*  28   50:iload           5
	//*  29   52:ifeq            80
	//*  30   55:iload           5
	//*  31   57:ldc1            #30  <Int 32768>
	//*  32   59:iand            
	//*  33   60:ifne            80
				throw new RuntimeException(MessageLocalization.getComposedMessage("inconsistent.mapping", new Object[0]));
	//   34   63:new             #32  <Class RuntimeException>
	//   35   66:dup             
	//   36   67:ldc1            #34  <String "inconsistent.mapping">
	//   37   69:iconst_0        
	//   38   70:anewarray       Object[]
	//   39   73:invokestatic    #42  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   40   76:invokespecial   #45  <Method void RuntimeException(String)>
	//   41   79:athrow          
			int l = k;
	//   42   80:iload           5
	//   43   82:istore          6
			if(k == 0)
	//*  44   84:iload           5
	//*  45   86:ifne            125
			{
				planes.add(((Object) (new char[256])));
	//   46   89:aload_0         
	//   47   90:getfield        #16  <Field ArrayList planes>
	//   48   93:sipush          256
	//   49   96:newarray        char[]
	//   50   98:invokevirtual   #20  <Method boolean ArrayList.add(Object)>
	//   51  101:pop             
				char c1 = (char)(planes.size() - 1 | 0x8000);
	//   52  102:aload_0         
	//   53  103:getfield        #16  <Field ArrayList planes>
	//   54  106:invokevirtual   #49  <Method int ArrayList.size()>
	//   55  109:iconst_1        
	//   56  110:isub            
	//   57  111:ldc1            #30  <Int 32768>
	//   58  113:ior             
	//   59  114:int2char        
	//   60  115:istore_3        
				ac[j1] = c1;
	//   61  116:aload           9
	//   62  118:iload           8
	//   63  120:iload_3         
	//   64  121:castore         
				l = ((int) (c1));
	//   65  122:iload_3         
	//   66  123:istore          6
			}
			k = l & 0x7fff;
	//   67  125:iload           6
	//   68  127:sipush          32767
	//   69  130:iand            
	//   70  131:istore          5
		}

	//   71  133:iload           4
	//   72  135:iconst_1        
	//   73  136:iadd            
	//   74  137:istore          4
	//*  75  139:goto            12
		char ac1[] = (char[])planes.get(k);
	//   76  142:aload_0         
	//   77  143:getfield        #16  <Field ArrayList planes>
	//   78  146:iload           5
	//   79  148:invokevirtual   #27  <Method Object ArrayList.get(int)>
	//   80  151:checkcast       #29  <Class char[]>
	//   81  154:astore          9
		int j = abyte0[i1] & 0xff;
	//   82  156:aload_1         
	//   83  157:iload           7
	//   84  159:baload          
	//   85  160:sipush          255
	//   86  163:iand            
	//   87  164:istore          4
		if((ac1[j] & 0x8000) != 0)
	//*  88  166:aload           9
	//*  89  168:iload           4
	//*  90  170:caload          
	//*  91  171:ldc1            #30  <Int 32768>
	//*  92  173:iand            
	//*  93  174:ifeq            194
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("inconsistent.mapping", new Object[0]));
	//   94  177:new             #32  <Class RuntimeException>
	//   95  180:dup             
	//   96  181:ldc1            #34  <String "inconsistent.mapping">
	//   97  183:iconst_0        
	//   98  184:anewarray       Object[]
	//   99  187:invokestatic    #42  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  100  190:invokespecial   #45  <Method void RuntimeException(String)>
	//  101  193:athrow          
		} else
		{
			ac1[j] = c;
	//  102  194:aload           9
	//  103  196:iload           4
	//  104  198:iload_2         
	//  105  199:castore         
			return;
	//  106  200:return          
		}
	}

	void addChar(PdfString pdfstring, PdfObject pdfobject)
	{
		if(!(pdfobject instanceof PdfNumber))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #53  <Class PdfNumber>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			encodeSequence(decodeStringToByte(pdfstring), (char)((PdfNumber)pdfobject).intValue());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #57  <Method byte[] decodeStringToByte(PdfString)>
	//    7   13:aload_2         
	//    8   14:checkcast       #53  <Class PdfNumber>
	//    9   17:invokevirtual   #60  <Method int PdfNumber.intValue()>
	//   10   20:int2char        
	//   11   21:invokespecial   #62  <Method void encodeSequence(byte[], char)>
			return;
	//   12   24:return          
		}
	}

	public String decodeSequence(CMapSequence cmapsequence)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void StringBuilder()>
	//    3    7:astore_3        
		do
		{
			int i = decodeSingle(cmapsequence);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #71  <Method int decodeSingle(CMapSequence)>
	//    7   13:istore_2        
			if(i >= 0)
	//*   8   14:iload_2         
	//*   9   15:iflt            28
				stringbuilder.append((char)i);
	//   10   18:aload_3         
	//   11   19:iload_2         
	//   12   20:int2char        
	//   13   21:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   14   24:pop             
			else
	//*  15   25:goto            8
				return stringbuilder.toString();
	//   16   28:aload_3         
	//   17   29:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   18   32:areturn         
		} while(true);
	}

	public int decodeSingle(CMapSequence cmapsequence)
	{
		int j = cmapsequence.off;
	//    0    0:aload_1         
	//    1    1:getfield        #85  <Field int CMapSequence.off>
	//    2    4:istore_3        
		int k = cmapsequence.len;
	//    3    5:aload_1         
	//    4    6:getfield        #88  <Field int CMapSequence.len>
	//    5    9:istore          4
		for(int i = 0; cmapsequence.off < j + k; i &= 0x7fff)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:aload_1         
	//*   9   14:getfield        #85  <Field int CMapSequence.off>
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:iadd            
	//*  13   21:icmpge          98
		{
			byte abyte0[] = cmapsequence.seq;
	//   14   24:aload_1         
	//   15   25:getfield        #92  <Field byte[] CMapSequence.seq>
	//   16   28:astore          6
			int l = cmapsequence.off;
	//   17   30:aload_1         
	//   18   31:getfield        #85  <Field int CMapSequence.off>
	//   19   34:istore          5
			cmapsequence.off = l + 1;
	//   20   36:aload_1         
	//   21   37:iload           5
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:putfield        #85  <Field int CMapSequence.off>
			l = ((int) (abyte0[l]));
	//   25   44:aload           6
	//   26   46:iload           5
	//   27   48:baload          
	//   28   49:istore          5
			cmapsequence.len = cmapsequence.len - 1;
	//   29   51:aload_1         
	//   30   52:aload_1         
	//   31   53:getfield        #88  <Field int CMapSequence.len>
	//   32   56:iconst_1        
	//   33   57:isub            
	//   34   58:putfield        #88  <Field int CMapSequence.len>
			i = ((int) (((char[])planes.get(i))[l & 0xff]));
	//   35   61:aload_0         
	//   36   62:getfield        #16  <Field ArrayList planes>
	//   37   65:iload_2         
	//   38   66:invokevirtual   #27  <Method Object ArrayList.get(int)>
	//   39   69:checkcast       #29  <Class char[]>
	//   40   72:iload           5
	//   41   74:sipush          255
	//   42   77:iand            
	//   43   78:caload          
	//   44   79:istore_2        
			if((0x8000 & i) == 0)
	//*  45   80:ldc1            #30  <Int 32768>
	//*  46   82:iload_2         
	//*  47   83:iand            
	//*  48   84:ifne            89
				return i;
	//   49   87:iload_2         
	//   50   88:ireturn         
		}

	//   51   89:iload_2         
	//   52   90:sipush          32767
	//   53   93:iand            
	//   54   94:istore_2        
	//*  55   95:goto            13
		return -1;
	//   56   98:iconst_m1       
	//   57   99:ireturn         
	}

	private ArrayList planes;
}
